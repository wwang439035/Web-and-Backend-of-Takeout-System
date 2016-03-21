package edu.fiu.hmts.dao;

import edu.fiu.hmts.domain.FunctionRoleExample;
import edu.fiu.hmts.domain.FunctionRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;


/**
 * The Interface FunctionRoleMapper.
 */
public interface FunctionRoleMapper {
    
    /**
	 * Count by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int countByExample(FunctionRoleExample example);

    
    /**
	 * Delete by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int deleteByExample(FunctionRoleExample example);

    
    /**
	 * Delete by primary key.
	 *
	 * @param key
	 *            the key
	 * @return the int
	 */
    int deleteByPrimaryKey(FunctionRoleKey key);

    
    /**
	 * Insert.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insert(FunctionRoleKey record);

    
    /**
	 * Insert selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insertSelective(FunctionRoleKey record);

    
    /**
	 * Query by example.
	 *
	 * @param example
	 *            the example
	 * @return the list
	 */
    List<FunctionRoleKey> selectByExample(FunctionRoleExample example);

    
    /**
	 * Update by example selective.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExampleSelective(@Param("record") FunctionRoleKey record, @Param("example") FunctionRoleExample example);

    
    /**
	 * Update by example.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExample(@Param("record") FunctionRoleKey record, @Param("example") FunctionRoleExample example);
}