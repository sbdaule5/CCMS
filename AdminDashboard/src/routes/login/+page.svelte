<script>
    import Cookies from "js-cookie";
    import Snackbar, { Actions, Label } from "@smui/snackbar";
    import IconButton from "@smui/icon-button";
    import { goto } from "$app/navigation";
    import { getDefaultApi } from "$lib/utils/auth";
    import { Role } from "$lib/generated";

    /** @type {string} */
    let username = "";
    /** @type {string} */
    let password = "";
    /** @type {Snackbar} */
    let snackbar;

    async function handleLogin() {
        const api = getDefaultApi(true);
        try {
            let res = await api.login({
                loginRequest: {
                    username: username,
                    password: password,
                    role: Role.Admin,
                },
            });
            setCookie("authToken", res);
            goto("/");
        } catch (e) {
            console.log("Invalid username or password");
            snackbar.open();
        }
    }

    /**
     * Set a cookie with the provided key and value.
     * @param {string} key - The key for the cookie.
     * @param {string} value - The value to set for the cookie.
     */
    function setCookie(key, value) {
        Cookies.set(key, value, { expires: 1 });
    }
</script>

<h1>CCMS</h1>
<h2>Admin Dashboard - Login</h2>

<Snackbar bind:this={snackbar}>
    <Label>Login Failed</Label>
    <Actions>
        <IconButton class="material-icons" title="Dismiss">close</IconButton>
    </Actions>
</Snackbar>

<form on:submit|preventDefault={handleLogin}>
    <input type="text" placeholder="Username" bind:value={username} />
    <input type="password" placeholder="Password" bind:value={password} />
    <button type="submit">Login</button>
</form>

<style>
    h1,
    h2 {
        text-align: center;
        margin-bottom: 20px;
    }

    form {
        max-width: 400px;
        margin: 0 auto;
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
        background-color: #f9f9f9;
    }

    input {
        width: 100%;
        margin-bottom: 10px;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    button {
        width: 100%;
        padding: 10px;
        border: none;
        border-radius: 5px;
        background-color: #007bff;
        color: #fff;
        cursor: pointer;
    }

    button:hover {
        background-color: #0056b3;
    }
</style>
