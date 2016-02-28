package edu.fiu.hmts.dao.mybatis.dao;

import edu.fiu.hmts.domain.SelProduct;
import edu.fiu.hmts.domain.SelProductExample;
import edu.fiu.hmts.domain.SelProductKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SelProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selproduct
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int countByExample(SelProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selproduct
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int deleteByExample(SelProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selproduct
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int deleteByPrimaryKey(SelProductKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selproduct
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int insert(SelProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selproduct
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int insertSelective(SelProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selproduct
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    List<SelProduct> selectByExample(SelProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selproduct
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    SelProduct selectByPrimaryKey(SelProductKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selproduct
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int updateByExampleSelective(@Param("record") SelProduct record, @Param("example") SelProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selproduct
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int updateByExample(@Param("record") SelProduct record, @Param("example") SelProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selproduct
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int updateByPrimaryKeySelective(SelProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table selproduct
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int updateByPrimaryKey(SelProduct record);
}