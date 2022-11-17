package com.amex.bankingapp;


import com.amex.bankingapp.models.Customer;
import com.amex.bankingapp.models.Order;

public class OrderApp {

    public static void main(String[] args){
      Order order=new Order(20);
      Order order1=new Order(1,943699);
      System.out.println(order.getOrderId());

        Customer.totalNumberOfCustomers();
    }
}
