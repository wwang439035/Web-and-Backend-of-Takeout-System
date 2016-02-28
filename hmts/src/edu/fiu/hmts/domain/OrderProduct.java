package edu.fiu.hmts.domain;

public class OrderProduct extends OrderProductKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.name
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.type
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.price
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.brief
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private String brief;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderproduct.name
     *
     * @return the value of orderproduct.name
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderproduct.name
     *
     * @param name the value for orderproduct.name
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderproduct.type
     *
     * @return the value of orderproduct.type
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderproduct.type
     *
     * @param type the value for orderproduct.type
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderproduct.price
     *
     * @return the value of orderproduct.price
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public Double getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderproduct.price
     *
     * @param price the value for orderproduct.price
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orderproduct.brief
     *
     * @return the value of orderproduct.brief
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public String getBrief() {
        return brief;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orderproduct.brief
     *
     * @param brief the value for orderproduct.brief
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }
}