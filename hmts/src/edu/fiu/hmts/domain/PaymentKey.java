package edu.fiu.hmts.domain;

public class PaymentKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.payment_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private Integer paymentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.order_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private Integer orderId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.payment_id
     *
     * @return the value of payment.payment_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public Integer getPaymentId() {
        return paymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.payment_id
     *
     * @param paymentId the value for payment.payment_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.order_id
     *
     * @return the value of payment.order_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.order_id
     *
     * @param orderId the value for payment.order_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }
}