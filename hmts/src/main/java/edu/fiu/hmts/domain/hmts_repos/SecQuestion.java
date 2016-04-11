package edu.fiu.hmts.domain.hmts_repos;

/**
 * The Class SecQuestion.
 */
public class SecQuestion {
    
    /** The sec question id. */
    private Integer secQuestionId;

    /** The content. */
    private String content;

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
	 * Gets the content.
	 *
	 * @return the content
	 */
    public String getContent() {
        return content;
    }

    /**
	 * Sets the content.
	 *
	 * @param content
	 *            the new content
	 */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}