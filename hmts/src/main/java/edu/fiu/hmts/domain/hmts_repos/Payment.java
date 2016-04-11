package edu.fiu.hmts.domain.hmts_repos;

/**
 * The Class Payment.
 */
public class Payment {
    
    /** The payment id. */
    private Long paymentId;

    /** The method. */
    private String method;

    /** The amount. */
    private Double amount;

    /** The order id. */
    private Long orderId;

    /**
	 * Gets the payment id.
	 *
	 * @return the payment id
	 */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
	 * Sets the payment id.
	 *
	 * @param paymentId
	 *            the new payment id
	 */
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
	 * Gets the method.
	 *
	 * @return the method
	 */
    public String getMethod() {
        return method;
    }

    /**
	 * Sets the method.
	 *
	 * @param method
	 *            the new method
	 */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
	 * Gets the amount.
	 *
	 * @return the amount
	 */
    public Double getAmount() {
        return amount;
    }

    /**
	 * Sets the amount.
	 *
	 * @param amount
	 *            the new amount
	 */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
	 * Gets the order id.
	 *
	 * @return the order id
	 */
    public Long getOrderId() {
        return orderId;
    }

    /**
	 * Sets the order id.
	 *
	 * @param orderId
	 *            the new order id
	 */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}