package com.mts.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mts.model.Account;

@Repository
public interface NewAccountRepository extends CrudRepository<Account, String> {
	
	@Modifying
	@Query(value="update Account acc set acc.balance = :balance where acc.num = :num",nativeQuery=false)
	int update(@Param("balance") double balance, 
			   @Param("num") String num);
	

}
