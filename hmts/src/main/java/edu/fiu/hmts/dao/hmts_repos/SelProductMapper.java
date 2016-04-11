package edu.fiu.hmts.dao.hmts_repos;

import edu.fiu.hmts.domain.hmts_repos.SelProduct;
import edu.fiu.hmts.domain.hmts_repos.SelProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * The Interface SelProductMapper.
 */
public interface SelProductMapper {
    
    /**
	 * Count by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int countByExample(SelProductExample example);

    /**
	 * Delete by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int deleteByExample(SelProductExample example);

    /**
	 * Insert.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insert(SelProduct record);

    /**
	 * Insert selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insertSelective(SelProduct record);

    /**
	 * Query by example.
	 *
	 * @param example
	 *            the example
	 * @return the list
	 */
    List<SelProduct> selectByExample(SelProductExample example);

    /**
	 * Update by example selective.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExampleSelective(@Param("record") SelProduct record, @Param("example") SelProductExample example);

    /**
	 * Update by example.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExample(@Param("record") SelProduct record, @Param("example") SelProductExample example);
}