package edu.fiu.hmts.dao.hmts_repos;

import edu.fiu.hmts.domain.hmts_repos.Product;
import edu.fiu.hmts.domain.hmts_repos.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * The Interface ProductMapper.
 */
public interface ProductMapper {
    
    /**
	 * Count by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int countByExample(ProductExample example);

    /**
	 * Delete by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int deleteByExample(ProductExample example);

    /**
	 * Delete by primary key.
	 *
	 * @param productId
	 *            the product id
	 * @return the int
	 */
    int deleteByPrimaryKey(Long productId);

    /**
	 * Insert.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insert(Product record);

    /**
	 * Insert selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insertSelective(Product record);

    /**
	 * Query by example.
	 *
	 * @param example
	 *            the example
	 * @return the list
	 */
    List<Product> selectByExample(ProductExample example);

    /**
	 * Query by primary key.
	 *
	 * @param productId
	 *            the product id
	 * @return the product
	 */
    Product selectByPrimaryKey(Long productId);

    /**
	 * Update by example selective.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
	 * Update by example.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
	 * Update by primary key selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKeySelective(Product record);

    /**
	 * Update by primary key.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKey(Product record);
}