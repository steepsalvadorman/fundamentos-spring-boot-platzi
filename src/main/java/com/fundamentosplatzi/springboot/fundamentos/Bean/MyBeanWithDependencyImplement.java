package com.fundamentosplatzi.springboot.fundamentos.Bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

   MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 1;
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde la implementacion desde un bean con dependencia");
    }
}
