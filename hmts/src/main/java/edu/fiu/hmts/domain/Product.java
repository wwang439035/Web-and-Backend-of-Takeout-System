package edu.fiu.hmts.domain;

public class Product {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.product_id
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    private Long productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.name
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.type
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.price
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product.brief
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    private String brief;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.product_id
     *
     * @return the value of product.product_id
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.product_id
     *
     * @param productId the value for product.product_id
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.name
     *
     * @return the value of product.name
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.name
     *
     * @param name the value for product.name
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.type
     *
     * @return the value of product.type
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.type
     *
     * @param type the value for product.type
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.price
     *
     * @return the value of product.price
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.price
     *
     * @param price the value for product.price
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product.brief
     *
     * @return the value of product.brief
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    public String getBrief() {
        return brief;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product.brief
     *
     * @param brief the value for product.brief
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }
}