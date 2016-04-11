package edu.fiu.hmts.domain.hmts_repos;

/**
 * The Class Product.
 */
public class Product {
    
    /** The product id. */
    private Long productId;

    /** The name. */
    private String name;

    /** The type. */
    private String type;

    /** The price. */
    private Double price;

    /** The brief. */
    private String brief;

    /**
	 * Gets the product id.
	 *
	 * @return the product id
	 */
    public Long getProductId() {
        return productId;
    }

    /**
	 * Sets the product id.
	 *
	 * @param productId
	 *            the new product id
	 */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

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