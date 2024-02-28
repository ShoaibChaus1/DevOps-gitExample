package com.example.demo.payment;

import org.springframework.stereotype.Component;

@Component
public class Payment 
{
   public void doCreditCardTransactions()
   {
	   System.out.println("Payment.doCreditCardTransactions()");
   }
}
