package com.company.test;

import com.company.optionals.Carro;
import com.company.optionals.Neumatico;
import com.company.optionals.Rueda;

import java.util.Optional;

public class TestSection {

    public Integer execute(Integer[] numbers, Integer repNum) {

        int repetitions = 0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==repNum){
                repetitions++;
            }
        }

        return repetitions;

    }
}
