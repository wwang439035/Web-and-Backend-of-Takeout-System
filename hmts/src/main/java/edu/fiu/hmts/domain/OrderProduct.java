package edu.fiu.hmts.domain;

/**
 * The Class OrderProduct.
 */
public class OrderProduct extends OrderProductKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.name
     *
     * 
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.type
     *
     * 
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.price
     *
     * 
     */
    private Double price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orderproduct.brief
     *
     * 
     */
    private String brief;

    /**
	 * Gets the name.
	 *
	 * @return the name
	 */
    public String getName() {
        return name;
    }

    /**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
	 * Gets the type.
	 *
	 * @return the type
	 */
    public String getType() {
        return type;
    }

    /**
	 * Sets the type.
	 *
	 * @param type
	 *            the new type
	 */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
	 * Gets the price.
	 *
	 * @return the price
	 */
    public Double getPrice() {
        return price;
    }

    /**
	 * Sets the price.
	 *
	 * @param price
	 *            the new price
	 */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
	 * Gets the brief.
	 *
	 * @return the brief
	 */
    public String getBrief() {
        return brief;
    }

    /**
	 * Sets the brief.
	 *
	 * @param brief
	 *            the new brief
	 */
    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }
}