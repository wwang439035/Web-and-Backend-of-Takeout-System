package edu.fiu.hmts.domain;

/**
 * The Class Order.
 */
public class Order extends OrderKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.ship_address
     *
     * 
     */
    private String shipAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.phone
     *
     * 
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.note
     *
     * 
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.status
     *
     * 
     */
    private String status;

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
}