
package org.example;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOrderStatusResponseType }
     * 
     */
    public GetOrderStatusResponseType createGetOrderStatusResponseType() {
        return new GetOrderStatusResponseType();
    }

    /**
     * Create an instance of {@link GetOrderStatusType }
     * 
     */
    public GetOrderStatusType createGetOrderStatusType() {
        return new GetOrderStatusType();
    }

    /**
     * Create an instance of {@link OrderConfirmationType }
     * 
     */
    public OrderConfirmationType createOrderConfirmationType() {
        return new OrderConfirmationType();
    }

    /**
     * Create an instance of {@link OrderNotFoundFaultType }
     * 
     */
    public OrderNotFoundFaultType createOrderNotFoundFaultType() {
        return new OrderNotFoundFaultType();
    }

    /**
     * Create an instance of {@link PurchaseOrderType }
     * 
     */
    public PurchaseOrderType createPurchaseOrderType() {
        return new PurchaseOrderType();
    }

}
