package edu.fiu.hmts.domain.hmts_repos;

/**
 * The Class SelProduct.
 */
public class SelProduct {
    
    /** The product id. */
    private Long productId;

    /** The user id. */
    private Long userId;

    /** The quantity. */
    private Integer quantity;

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
	 * Gets the user id.
	 *
	 * @return the user id
	 */
    public Long getUserId() {
        return userId;
    }

    /**
	 * Sets the user id.
	 *
	 * @param userId
	 *            the new user id
	 */
    public void setUserId(Long userId) {
        this.userId = userId;
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
}