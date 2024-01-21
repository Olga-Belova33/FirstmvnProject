package ru.netology.firstmvn;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        //long amount = 5000;
        //boolean registred = true;
        long Mybonus = service.calculate(5000, true);
        System.out.println(Mybonus);
    }
}