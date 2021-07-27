package com.datamify.development.pmd;

public class Action {

    public void doSomething() {
        Long notUsedLong = 5L;
        int i = 7;

        try {
            System.out.println(i + 2);
        } catch (Exception e) {

        }

    }

}
