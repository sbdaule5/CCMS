/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.openapi.api;

import com.example.openapi.model.Profile;
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
@Tag(name = "profile", description = "the profile API")
public interface ProfileApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /profile
     * Get information about the another user from username if the current user is allowed to do so. Anyone can see information about all the Vendors, Delivery Persons and the user himself.
     *
     * @param sessionId  (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     */
    @Operation(
        operationId = "getProfile",
        description = "Get information about the another user from username if the current user is allowed to do so. Anyone can see information about all the Vendors, Delivery Persons and the user himself.",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Profile.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/profile",
        produces = { "application/json" }
    )
    default ResponseEntity<Profile> getProfile(
        @NotNull @Size(min = 40, max = 40) @Parameter(name = "sessionId", description = "", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "sessionId", required = true) String sessionId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"gender\" : \"Male\", \"phone\" : \"phone\", \"dob\" : \"dob\", \"name\" : \"name\", \"email\" : \"email\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /profile/update : updating profile
     * Update userinfo of the user.
     *
     * @param sessionId  (required)
     * @param profile  (required)
     * @return OK (status code 200)
     *         or Unauthorized (status code 401)
     */
    @Operation(
        operationId = "updateProfile",
        summary = "updating profile",
        description = "Update userinfo of the user.",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Profile.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/profile/update",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Profile> updateProfile(
        @NotNull @Size(min = 40, max = 40) @Parameter(name = "sessionId", description = "", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "sessionId", required = true) String sessionId,
        @Parameter(name = "Profile", description = "", required = true) @Valid @RequestBody Profile profile
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"gender\" : \"Male\", \"phone\" : \"phone\", \"dob\" : \"dob\", \"name\" : \"name\", \"email\" : \"email\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
