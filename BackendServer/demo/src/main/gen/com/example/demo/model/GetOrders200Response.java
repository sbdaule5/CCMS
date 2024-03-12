package com.example.demo.model;

import java.net.URI;
import java.util.Objects;
import com.example.demo.model.VendorGetRequestedOrders200ResponseInnerOrderItemsInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetOrders200Response
 */

@JsonTypeName("getOrders_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-12T16:44:30.158452179+05:30[Asia/Kolkata]")
public class GetOrders200Response implements Serializable {

  private static final long serialVersionUID = 1L;

  private String orderId;

  private String userId;

  private String vendorID;

  private String pickupLocation;

  @Valid
  private List<@Valid VendorGetRequestedOrders200ResponseInnerOrderItemsInner> orderItems;

  private String location;

  private BigDecimal price;

  private String status;

  public GetOrders200Response orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  */
  
  @Schema(name = "orderId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderId")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public GetOrders200Response userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public GetOrders200Response vendorID(String vendorID) {
    this.vendorID = vendorID;
    return this;
  }

  /**
   * Get vendorID
   * @return vendorID
  */
  
  @Schema(name = "vendorID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vendorID")
  public String getVendorID() {
    return vendorID;
  }

  public void setVendorID(String vendorID) {
    this.vendorID = vendorID;
  }

  public GetOrders200Response pickupLocation(String pickupLocation) {
    this.pickupLocation = pickupLocation;
    return this;
  }

  /**
   * Get pickupLocation
   * @return pickupLocation
  */
  
  @Schema(name = "pickupLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickupLocation")
  public String getPickupLocation() {
    return pickupLocation;
  }

  public void setPickupLocation(String pickupLocation) {
    this.pickupLocation = pickupLocation;
  }

  public GetOrders200Response orderItems(List<@Valid VendorGetRequestedOrders200ResponseInnerOrderItemsInner> orderItems) {
    this.orderItems = orderItems;
    return this;
  }

  public GetOrders200Response addOrderItemsItem(VendorGetRequestedOrders200ResponseInnerOrderItemsInner orderItemsItem) {
    if (this.orderItems == null) {
      this.orderItems = new ArrayList<>();
    }
    this.orderItems.add(orderItemsItem);
    return this;
  }

  /**
   * Get orderItems
   * @return orderItems
  */
  @Valid 
  @Schema(name = "orderItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderItems")
  public List<@Valid VendorGetRequestedOrders200ResponseInnerOrderItemsInner> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<@Valid VendorGetRequestedOrders200ResponseInnerOrderItemsInner> orderItems) {
    this.orderItems = orderItems;
  }

  public GetOrders200Response location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Delivery location.
   * @return location
  */
  
  @Schema(name = "location", description = "Delivery location.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("location")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public GetOrders200Response price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @Valid 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public GetOrders200Response status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrders200Response getOrders200Response = (GetOrders200Response) o;
    return Objects.equals(this.orderId, getOrders200Response.orderId) &&
        Objects.equals(this.userId, getOrders200Response.userId) &&
        Objects.equals(this.vendorID, getOrders200Response.vendorID) &&
        Objects.equals(this.pickupLocation, getOrders200Response.pickupLocation) &&
        Objects.equals(this.orderItems, getOrders200Response.orderItems) &&
        Objects.equals(this.location, getOrders200Response.location) &&
        Objects.equals(this.price, getOrders200Response.price) &&
        Objects.equals(this.status, getOrders200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, userId, vendorID, pickupLocation, orderItems, location, price, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrders200Response {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    vendorID: ").append(toIndentedString(vendorID)).append("\n");
    sb.append("    pickupLocation: ").append(toIndentedString(pickupLocation)).append("\n");
    sb.append("    orderItems: ").append(toIndentedString(orderItems)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

