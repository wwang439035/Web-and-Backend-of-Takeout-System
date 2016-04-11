package edu.fiu.hmts.domain.hmts_repos;

/**
 * The Class Function.
 */
public class Function {
    
    /** The function id. */
    private Integer functionId;

    /** The description. */
    private String description;

    /**
	 * Gets the function id.
	 *
	 * @return the function id
	 */
    public Integer getFunctionId() {
        return functionId;
    }

    /**
	 * Sets the function id.
	 *
	 * @param functionId
	 *            the new function id
	 */
    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    /**
	 * Gets the description.
	 *
	 * @return the description
	 */
    public String getDescription() {
        return description;
    }

    /**
	 * Sets the description.
	 *
	 * @param description
	 *            the new description
	 */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}