package edu.fiu.hmts.domain;

public class Function {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column function.function_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private Integer functionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column function.description
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column function.function_id
     *
     * @return the value of function.function_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public Integer getFunctionId() {
        return functionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column function.function_id
     *
     * @param functionId the value for function.function_id
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column function.description
     *
     * @return the value of function.description
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column function.description
     *
     * @param description the value for function.description
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}