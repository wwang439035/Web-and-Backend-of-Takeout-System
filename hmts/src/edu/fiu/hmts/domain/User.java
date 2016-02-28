package edu.fiu.hmts.domain;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.first_name
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private String firstName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.last_name
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private String lastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.address
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.role
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private String role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sec_question_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private Integer secQuestionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sec_answer
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private String secAnswer;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_id
     *
     * @return the value of user.user_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_id
     *
     * @param userId the value for user.user_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.first_name
     *
     * @return the value of user.first_name
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.first_name
     *
     * @param firstName the value for user.first_name
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.last_name
     *
     * @return the value of user.last_name
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.last_name
     *
     * @param lastName the value for user.last_name
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.address
     *
     * @return the value of user.address
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.address
     *
     * @param address the value for user.address
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.role
     *
     * @return the value of user.role
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.role
     *
     * @param role the value for user.role
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sec_question_id
     *
     * @return the value of user.sec_question_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public Integer getSecQuestionId() {
        return secQuestionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sec_question_id
     *
     * @param secQuestionId the value for user.sec_question_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setSecQuestionId(Integer secQuestionId) {
        this.secQuestionId = secQuestionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sec_answer
     *
     * @return the value of user.sec_answer
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public String getSecAnswer() {
        return secAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sec_answer
     *
     * @param secAnswer the value for user.sec_answer
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setSecAnswer(String secAnswer) {
        this.secAnswer = secAnswer == null ? null : secAnswer.trim();
    }
}