package com.jekyllpark.designpattern.behavioral.state.example.e1;

public class StateService {
    public static void main(String[] args) {
        LaptopContext laptop = new LaptopContext();
        laptop.currentStatePrint();

        // 노트북 켜기 : OffState -> OnState
        laptop.powerButtonPush();
        laptop.currentStatePrint();
        laptop.typeButtonPush();

        // 노트북 절전하기 : OnState -> SavingState
        laptop.setSavingState();
        laptop.currentStatePrint();

        // 노트북 다시 켜기 : SavingState -> OnState
        laptop.powerButtonPush();
        laptop.currentStatePrint();

        // 노트북 끄기 : OnState -> OffState
        laptop.powerButtonPush();
        laptop.currentStatePrint();
    }
}
