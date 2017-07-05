package com.shop.bill;

import com.shop.pm.PriceMatrixImpln_v1;

/*
 * 
 * design & performance issues
 * ---------------------------
 * 
 * --> too many duplicate dependencies created & destructed on every method-call
 * 
 *      ==> slow , memory use high , etc...
 * 
 * --> tight-coupling b/w dependent & dependency
 * 
 * 		==> can't extent with new features
 * 
 * --> unit-testing not possible
 * 
 *      ==> dev & bug-fic slow 
 *      
 *    -------------------------------------------
 *    
 *      why these issues here ?
 *      
 *      
 *      ==> dependent's class creating its own dependency
 *      
 * 
 * 		soln:
 * 
 * 		==> dont create, do lookup
 * 
 * 	    limitation on lookup
 * 
 * 		==> location tight-coupling
 * 
 * 	    best-soln:
 * 
 * 		==> dont create & lookup for dependency , inject by 'some-one'  ( IOC )
 * 
 * 		
 * 		OO Principal : "Inversion of Control"
 * 
 * 	
 *      How to implement IOC ?
 *      
 *      	-> Dependency Injection ( DI )
 * 
 * 					a. constructor DI
 *                  b. setter DI
 * 		
 */

public class BillingImpl {

	private PriceMatrixImpln_v1 priceMatrix = null;

	public double getTotalPrice(String[] cart) {

		priceMatrix = new PriceMatrixImpln_v1();

		double total = 0.0;

		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}

		return total;

	}

}
