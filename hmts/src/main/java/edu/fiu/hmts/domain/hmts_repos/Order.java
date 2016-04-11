package edu.fiu.hmts.domain.hmts_repos;

/**
 * The Class Order.
 */
public class Order {
    
    /** The order id. */
    private Long orderId;

    /** The ship address. */
    private String shipAddress;

    /** The phone. */
    private String phone;

    /** The note. */
    private String note;

    /** The status. */
    private String status;

    /** The user id. */
    private Long userId;

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
	 * Gets the ship address.
	 *
	 * @return the ship address
	 */
    public String getShipAddress() {
        return shipAddress;
    }

    /**
	 * Sets the ship address.
	 *
	 * @param shipAddress
	 *            the new ship address
	 */
    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress == null ? null : shipAddress.trim();
    }

    /**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
    public String getPhone() {
        return phone;
    }

    /**
	 * Sets the phone.
	 *
	 * @param phone
	 *            the new phone
	 */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
	 * Gets the note.
	 *
	 * @return the note
	 */
    public String getNote() {
        return note;
    }

    /**
	 * Sets the note.
	 *
	 * @param note
	 *            the new note
	 */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
	 * Gets the status.
	 *
	 * @return the status
	 */
    public String getStatus() {
        return status;
    }

    /**
	 * Sets the status.
	 *
	 * @param status
	 *            the new status
	 */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
}