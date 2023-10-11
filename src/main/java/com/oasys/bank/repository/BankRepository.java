package com.oasys.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oasys.bank.entity.BankEntity;

public interface BankRepository extends JpaRepository<BankEntity, Integer>{
    @Query(value="select ifsc from bank where branch like ?",nativeQuery=true)
	public String getifsc(String branch);

}
