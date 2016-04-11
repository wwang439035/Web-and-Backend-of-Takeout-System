package edu.fiu.hmts.dao.hmts_repos;

import edu.fiu.hmts.domain.hmts_repos.User;
import edu.fiu.hmts.domain.hmts_repos.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * The Interface UserMapper.
 */
public interface UserMapper {
    
    /**
	 * Count by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int countByExample(UserExample example);

    /**
	 * Delete by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int deleteByExample(UserExample example);

    /**
	 * Delete by primary key.
	 *
	 * @param userId
	 *            the user id
	 * @return the int
	 */
    int deleteByPrimaryKey(Long userId);

    /**
	 * Insert.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insert(User record);

    /**
	 * Insert selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insertSelective(User record);

    /**
	 * Query by example.
	 *
	 * @param example
	 *            the example
	 * @return the list
	 */
    List<User> selectByExample(UserExample example);

    /**
	 * Query by primary key.
	 *
	 * @param userId
	 *            the user id
	 * @return the user
	 */
    User selectByPrimaryKey(Long userId);

    /**
	 * Update by example selective.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
	 * Update by example.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
	 * Update by primary key selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKeySelective(User record);

    /**
	 * Update by primary key.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKey(User record);
}