package edu.fiu.hmts.domain.hmts_repos;

/**
 * The Class OrderProduct.
 */
public class OrderProduct {
    
    /** The orderproduct id. */
    private Long orderproductId;

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

    /** The order id. */
    private Long orderId;

    /** The quantity. */
    private Integer quantity;

    /** The amount. */
    private Double amount;

    /**
	 * Gets the orderproduct id.
	 *
	 * @return the orderproduct id
	 */
    public Long getOrderproductId() {
        return orderproductId;
    }

    /**
	 * Sets the orderproduct id.
	 *
	 * @param orderproductId
	 *            the new orderproduct id
	 */
    public void setOrderproductId(Long orderproductId) {
        this.orderproductId = orderproductId;
    }

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

    /**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
    public Integer getQuantity() {
        return quantity;
    }

    /**
	 * Sets the quantity.
	 *
	 * @param quantity
	 *            the new quantity
	 */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
}