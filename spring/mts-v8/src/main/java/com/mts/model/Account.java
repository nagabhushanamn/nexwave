

package com.mts.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ACCOUNTS", schema = "mts")
public class Account {
 
	@Id
	private String num;
	private double balance;
	private String accHolderName;
	@Enumerated(EnumType.STRING)
	private AccountType type;
	@Enumerated(EnumType.STRING)
	private AccountStatus status;
	
	@OneToMany(fetch=FetchType.LAZY,
			   mappedBy="account",
			   targetEntity=Txn.class,
			   cascade=CascadeType.ALL)
	private List<Txn> txns=new ArrayList<>();
	
	
	
	

	public List<Txn> getTxns() {
		return txns;
	}

	@Override
	public String toString() {
		return "Account [num=" + num + ", balance=" + balance + ", accHolderName=" + accHolderName + ", type=" + type
				+ ", status=" + status + "]";
	}

	public void setTxns(List<Txn> txns) {
		this.txns = txns;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

}
