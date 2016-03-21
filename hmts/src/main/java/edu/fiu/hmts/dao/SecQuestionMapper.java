package edu.fiu.hmts.dao;

import edu.fiu.hmts.domain.SecQuestion;
import edu.fiu.hmts.domain.SecQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * The Interface SecQuestionMapper.
 */
public interface SecQuestionMapper {
    
    /**
	 * Count by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int countByExample(SecQuestionExample example);

    /**
	 * Delete by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int deleteByExample(SecQuestionExample example);

    /**
	 * Delete by primary key.
	 *
	 * @param secQuestionId
	 *            the sec question id
	 * @return the int
	 */
    int deleteByPrimaryKey(Integer secQuestionId);

    /**
	 * Insert.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insert(SecQuestion record);

    /**
	 * Insert selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insertSelective(SecQuestion record);

    /**
	 * Query by example.
	 *
	 * @param example
	 *            the example
	 * @return the list
	 */
    List<SecQuestion> selectByExample(SecQuestionExample example);

    /**
	 * Query by primary key.
	 *
	 * @param secQuestionId
	 *            the sec question id
	 * @return the sec question
	 */
    SecQuestion selectByPrimaryKey(Integer secQuestionId);

    /**
	 * Update by example selective.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExampleSelective(@Param("record") SecQuestion record, @Param("example") SecQuestionExample example);

    /**
	 * Update by example.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExample(@Param("record") SecQuestion record, @Param("example") SecQuestionExample example);

    /**
	 * Update by primary key selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKeySelective(SecQuestion record);

    /**
	 * Update by primary key.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKey(SecQuestion record);
}