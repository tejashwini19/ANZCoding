package com.infosys.anz.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.infosys.anz.entity.AccountsEntity;
import com.infosys.anz.repository.AccountsRepository;
import com.infosys.anz.service.AccountsService;


@RunWith(SpringRunner.class)
//@WebMvcTest(value = AccountsController.class, secure = false)
class AccountsControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@InjectMocks
	private AccountsService accountsService;
	
	@Mock
	private AccountsRepository accountsRepo;
	
	 @Before
	    public void init() {
	        MockitoAnnotations.initMocks(this);
	    }
	 
	
	@Test
	public void viewAccountListTest() throws Exception {
		List<AccountsEntity> list = new ArrayList<AccountsEntity>();
		AccountsEntity account1 = new AccountsEntity();
		account1.setAccountNumber("585309209");
		account1.setAccountName("SGSAvings726");
		account1.setAccountType("Savings");
		account1.setBalanceDate(Date.valueOf("2018,11,08"));
		account1.setAvalBalance(84327.51);
		account1.setCurrency("SGD");
		
		AccountsEntity account2 = new AccountsEntity();
		account2.setAccountNumber("791066619");
		account2.setAccountName("AUSavings933");
		account2.setAccountType("Savings");
		account2.setBalanceDate(Date.valueOf("2018,11,08"));
		account2.setAvalBalance(88005.93);
		account2.setCurrency("AUD");
		
		AccountsEntity account3 = new AccountsEntity();
		account3.setAccountNumber("321143048");
		account3.setAccountName("AUCurrent433");
		account3.setAccountType("Current");
		account3.setBalanceDate(Date.valueOf("2018,11,08"));
		account3.setAvalBalance(38010.62);
		account3.setCurrency("AUD");
			 
		list.add(account1);
		list.add(account2);
		list.add(account3);
		
		when(accountsRepo.findAll()).thenReturn(list);
		
		List<AccountsEntity> accList = accountsService.viewAccountList();
		
		assertEquals(3,accList.size());
		
		verify(accountsRepo,times(1)).findAll();
			
	}

}
