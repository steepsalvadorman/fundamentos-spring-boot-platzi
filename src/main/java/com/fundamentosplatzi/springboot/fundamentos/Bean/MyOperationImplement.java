package com.fundamentosplatzi.springboot.fundamentos.Bean;

public class MyOperationImplement implements MyOperation{
    @Override
    public int sum(int number) {
        return number+1;
    }
}
