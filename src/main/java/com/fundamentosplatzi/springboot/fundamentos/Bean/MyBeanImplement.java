package com.fundamentosplatzi.springboot.fundamentos.Bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("Hola desde mi implementacion propia del bean");
    }
}
