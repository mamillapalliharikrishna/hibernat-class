package com.sathya.dao;

import com.sathya.entity.Loan;

public interface ManyToOneDao {
	void   saveLoan(Loan  loan);
	void   removeLoanById(Integer  loanid);
	void   fetchLoanById(Integer  loanid);
}
