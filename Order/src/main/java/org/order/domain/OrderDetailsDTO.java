package org.order.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
public class OrderDetailsDTO {
    private String orderId;
    private String warehouseId;
    private String vendorId;
    private String accessorialId;
    private String productId;
    private String shippingAddress;
    private String condition;
    private double totalPrice;
    private Order.OrderStatus status;
    private Timestamp receivedOn;
    private Timestamp processedOn;
    private Timestamp shippedOn;
    private String paymentMode;
    private String billingAddress;
    private String paymentConfirmationNumber;
    private String warehouseName;
    private String warehouseLocation;
    private String vendorBusinessName;
    private String customerLastName;
    private String productModel;
    private String productDescription;
    private String serviceDisplayName;
    private String serviceDescription;
}