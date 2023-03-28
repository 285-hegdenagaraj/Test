package com.example.demo.core;



public class BusinessRules {
    public static Result run(Result... logics) {
        for (var logic : logics) {
            
                return logic;
            }
        
        return null;
    }
}

