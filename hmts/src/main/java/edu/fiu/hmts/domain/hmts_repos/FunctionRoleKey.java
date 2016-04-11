package edu.fiu.hmts.domain.hmts_repos;

/**
 * The Class FunctionRoleKey.
 */
public class FunctionRoleKey {
    
    /** The function id. */
    private Integer functionId;

    /** The role. */
    private String role;

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
}