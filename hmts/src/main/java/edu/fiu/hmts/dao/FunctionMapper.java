package edu.fiu.hmts.dao;

import edu.fiu.hmts.domain.Function;
import edu.fiu.hmts.domain.FunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * The Interface FunctionMapper.
 */
public interface FunctionMapper {
    
    /**
	 * Count by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int countByExample(FunctionExample example);

    /**
	 * Delete by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int deleteByExample(FunctionExample example);

    /**
	 * Delete by primary key.
	 *
	 * @param functionId
	 *            the function id
	 * @return the int
	 */
    int deleteByPrimaryKey(Integer functionId);

    /**
	 * Insert.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insert(Function record);

    /**
	 * Insert selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insertSelective(Function record);

    /**
	 * Query by example.
	 *
	 * @param example
	 *            the example
	 * @return the list
	 */
    List<Function> selectByExample(FunctionExample example);

    /**
	 * Query by primary key.
	 *
	 * @param functionId
	 *            the function id
	 * @return the function
	 */
    Function selectByPrimaryKey(Integer functionId);

    /**
	 * Update by example selective.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExampleSelective(@Param("record") Function record, @Param("example") FunctionExample example);

    /**
	 * Update by example.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExample(@Param("record") Function record, @Param("example") FunctionExample example);

    /**
	 * Update by primary key selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKeySelective(Function record);

    /**
	 * Update by primary key.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKey(Function record);
}