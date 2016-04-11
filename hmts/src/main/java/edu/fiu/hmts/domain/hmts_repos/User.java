package edu.fiu.hmts.domain.hmts_repos;

/**
 * The Class User.
 */
public class User {
    
    /** The user id. */
    private Long userId;

    /** The username. */
    private String username;

    /** The password. */
    private String password;

    /** The first name. */
    private String firstName;

    /** The last name. */
    private String lastName;

    /** The phone. */
    private String phone;

    /** The role. */
    private String role;

    /** The sec question id. */
    private Integer secQuestionId;

    /** The sec answer. */
    private String secAnswer;

    /** The tag. */
    private String tag;

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
	 * Gets the username.
	 *
	 * @return the username
	 */
    public String getUsername() {
        return username;
    }

    /**
	 * Sets the username.
	 *
	 * @param username
	 *            the new username
	 */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
	 * Gets the password.
	 *
	 * @return the password
	 */
    public String getPassword() {
        return password;
    }

    /**
	 * Sets the password.
	 *
	 * @param password
	 *            the new password
	 */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
    public String getFirstName() {
        return firstName;
    }

    /**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the new first name
	 */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
    public String getLastName() {
        return lastName;
    }

    /**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the new last name
	 */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
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
	 * Gets the role.
	 *
	 * @return the role
	 */
    public String getRole() {
        return role;
    }

    /**
	 * Sets the role.
	 *
	 * @param role
	 *            the new role
	 */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
	 * Gets the sec question id.
	 *
	 * @return the sec question id
	 */
    public Integer getSecQuestionId() {
        return secQuestionId;
    }

    /**
	 * Sets the sec question id.
	 *
	 * @param secQuestionId
	 *            the new sec question id
	 */
    public void setSecQuestionId(Integer secQuestionId) {
        this.secQuestionId = secQuestionId;
    }

    /**
	 * Gets the sec answer.
	 *
	 * @return the sec answer
	 */
    public String getSecAnswer() {
        return secAnswer;
    }

    /**
	 * Sets the sec answer.
	 *
	 * @param secAnswer
	 *            the new sec answer
	 */
    public void setSecAnswer(String secAnswer) {
        this.secAnswer = secAnswer == null ? null : secAnswer.trim();
    }

    /**
	 * Gets the tag.
	 *
	 * @return the tag
	 */
    public String getTag() {
        return tag;
    }

    /**
	 * Sets the tag.
	 *
	 * @param tag
	 *            the new tag
	 */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }
}