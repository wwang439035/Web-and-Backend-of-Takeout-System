package edu.fiu.hmts.domain;

public class SelProduct extends SelProductKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column selproduct.quantity
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private Integer quantity;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column selproduct.quantity
     *
     * @return the value of selproduct.quantity
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column selproduct.quantity
     *
     * @param quantity the value for selproduct.quantity
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}