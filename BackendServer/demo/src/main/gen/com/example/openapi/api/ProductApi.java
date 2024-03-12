/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.openapi.api;

import com.example.openapi.model.FoodItemFull;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-12T04:08:19.693566868+05:30[Asia/Kolkata]")
@Validated
@Tag(name = "product", description = "the product API")
public interface ProductApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /product/{id}/available : Check Availability
     * Check the availability of a specific item by providing its ID and quantity count
     *
     * @param id ID of the item to check availability for (required)
     * @param count Quantity count to check availability for (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     */
    @Operation(
        operationId = "checkProductAvailable",
        summary = "Check Availability",
        description = "Check the availability of a specific item by providing its ID and quantity count",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Boolean.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/product/{id}/available",
        produces = { "application/json" }
    )
    default ResponseEntity<Boolean> checkProductAvailable(
        @Parameter(name = "id", description = "ID of the item to check availability for", required = true, in = ParameterIn.PATH) @PathVariable("id") String id,
        @NotNull @Parameter(name = "count", description = "Quantity count to check availability for", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "count", required = true) Integer count
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /product/{id} : Get Product Details
     * Retrieve details for a specific item by providing its ID
     *
     * @param id ID of the item to retrieve details for (required)
     * @return OK (status code 200)
     *         or File Not Found (status code 404)
     *         or Unauthorized (status code 401)
     */
    @Operation(
        operationId = "getProduct",
        summary = "Get Product Details",
        description = "Retrieve details for a specific item by providing its ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = FoodItemFull.class))
            }),
            @ApiResponse(responseCode = "404", description = "File Not Found"),
            @ApiResponse(responseCode = "401", description = "Unauthorized")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/product/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<FoodItemFull> getProduct(
        @Parameter(name = "id", description = "ID of the item to retrieve details for", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"itemId\" : \"itemId\", \"isAvailable\" : true, \"itemName\" : \"itemName\", \"thumbnailPicture\" : \"thumbnailPicture\", \"maxQuantity\" : 1, \"price\" : 0.8008281904610115, \"imageUrls\" : [ \"imageUrls\", \"imageUrls\" ], \"vendorName\" : \"vendorName\", \"starRating\" : 6.027456183070403, \"vendorLocation\" : \"vendorLocation\", \"tags\" : [ \"tags\", \"tags\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
