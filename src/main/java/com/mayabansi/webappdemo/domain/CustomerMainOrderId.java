package com.mayabansi.webappdemo.domain;

// Generated Sep 19, 2010 12:31:53 AM by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CustomerMainOrderId generated by hbm2java
 */
@Embeddable
public class CustomerMainOrderId implements java.io.Serializable {

    private Long customerOrdersId;
    private Long mainOrderId;

    public CustomerMainOrderId() {
    }

    public CustomerMainOrderId(Long customerOrdersId, Long mainOrderId) {
        this.customerOrdersId = customerOrdersId;
        this.mainOrderId = mainOrderId;
    }

    @Column(name = "customer_orders_id")
    public Long getCustomerOrdersId() {
        return this.customerOrdersId;
    }

    public void setCustomerOrdersId(Long customerOrdersId) {
        this.customerOrdersId = customerOrdersId;
    }

    @Column(name = "main_order_id")
    public Long getMainOrderId() {
        return this.mainOrderId;
    }

    public void setMainOrderId(Long mainOrderId) {
        this.mainOrderId = mainOrderId;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof CustomerMainOrderId))
            return false;
        CustomerMainOrderId castOther = (CustomerMainOrderId) other;

        return ((this.getCustomerOrdersId() == castOther.getCustomerOrdersId()) || (this
                .getCustomerOrdersId() != null
                && castOther.getCustomerOrdersId() != null && this
                .getCustomerOrdersId().equals(castOther.getCustomerOrdersId())))
                && ((this.getMainOrderId() == castOther.getMainOrderId()) || (this
                .getMainOrderId() != null
                && castOther.getMainOrderId() != null && this
                .getMainOrderId().equals(castOther.getMainOrderId())));
    }

    public int hashCode() {
        int result = 17;

        result = 37
                * result
                + (getCustomerOrdersId() == null ? 0 : this
                .getCustomerOrdersId().hashCode());
        result = 37
                * result
                + (getMainOrderId() == null ? 0 : this.getMainOrderId()
                .hashCode());
        return result;
    }

}
