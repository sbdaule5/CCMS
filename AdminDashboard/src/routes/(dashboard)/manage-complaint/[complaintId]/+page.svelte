<script>
    import { page } from "$app/stores";
    import { getDefaultApi } from "$lib/utils/auth";
    import { onMount } from "svelte";
    import ImageHandler from "$lib/components/ImageHandler.svelte";

    /** @typedef {import("$lib/generated").ComplainOverview} ComplainOverview */
    /** @type {ComplainOverview | undefined} */
    let complaint;

    /** @type {string[]} */
    let imageUrls = [];

    /** @param {string} id */
    async function fetchComplaint(id) {
        try {
            const api = getDefaultApi();
            complaint = await api.getComplaintInfo({ id });

            if (complaint.attachmentIds) {
                for (const fileId of complaint.attachmentIds) {
                    try {
                        const fileBlob = await api.downloadFile({ fileId });
                        const imageUrl = URL.createObjectURL(fileBlob);
                        imageUrls = [...imageUrls, imageUrl];
                    } catch (error) {
                        console.error("Error downloading file:", error);
                    }
                }
            } else {
                console.warn("File IDs are undefined in the complaint object.");
            }
        } catch (error) {
            console.error("Error fetching complain details:", error);
        }
    }

    onMount(() => {
        const complainId = $page.params.complaintId;
        fetchComplaint(complainId);
    });
</script>

<h2 class="main-title">Complaint Details</h2>
<div class="complaint-details">
    <ul>
        <li>
            <strong>Complain:</strong>
            {complaint?.description|| "Not specified"}
        </li>
        <li>
            <strong>Category :</strong>
            {complaint?.complaintCriteria || "Not specified"}
        </li>
        <li>
            <strong>Priority:</strong>
            {complaint?.priority|| "Not specified"}
        </li>
        <li>
            <strong>Location:</strong>
            {complaint?.buildingName|| "Not specified"}/{complaint?.zone}
        </li>
        <li><strong>Status:</strong> {complaint?.status || "Not specified"}</li>
        <li>
            <strong>Complainer ID:</strong>
            {complaint?.complainerId || "Not specified"}
        </li>
        <li>
            <strong>Complainer Name:</strong>
            {complaint?.complaintId|| "Not specified"}
        </li>
        <li><strong>Date:</strong> {complaint?.registrationDate|| "Not specified"}</li>
    </ul>
</div>
<ImageHandler bind:imageUrls />

<style>
    .complaint-details {
        margin: 20px;
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
        background-color: #f9f9f9;
    }

    .main-title {
        align-self: center;
    }

    h2 {
        margin-bottom: 10px;
    }

    ul {
        list-style-type: none;
        padding: 0;
    }

    li {
        margin-bottom: 5px;
    }
</style>