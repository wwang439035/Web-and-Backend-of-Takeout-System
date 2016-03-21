package edu.fiu.hmts.dao;

import edu.fiu.hmts.domain.Payment;
import edu.fiu.hmts.domain.PaymentExample;
import edu.fiu.hmts.domain.PaymentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * The Interface PaymentMapper.
 */
public interface PaymentMapper {
    
    /**
	 * Count by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int countByExample(PaymentExample example);

    /**
	 * Delete by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int deleteByExample(PaymentExample example);

    /**
	 * Delete by primary key.
	 *
	 * @param key
	 *            the key
	 * @return the int
	 */
    int deleteByPrimaryKey(PaymentKey key);

    /**
	 * Insert.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insert(Payment record);

    /**
	 * Insert selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insertSelective(Payment record);

    /**
	 * Query by example.
	 *
	 * @param example
	 *            the example
	 * @return the list
	 */
    List<Payment> selectByExample(PaymentExample example);

    /**
	 * Query by primary key.
	 *
	 * @param key
	 *            the key
	 * @return the payment
	 */
    Payment selectByPrimaryKey(PaymentKey key);

    /**
	 * Update by example selective.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    /**
	 * Update by example.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    /**
	 * Update by primary key selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKeySelective(Payment record);

    /**
	 * Update by primary key.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKey(Payment record);
}