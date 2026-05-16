package Practice_10_Access_Restriction.Cow_Class;

import Practice_10_Access_Restriction.Cow;

class Calf extends Cow{
    public void show() {
            this.ordinaryMoo();
            //this.freindlyMoo(); Этот метод не доступен для класса Calf так как он не член класса Cow, а подкласс
            this.peacefulMoo();
            //this.neighborMoo(); Этот метод не доступен для класса Calf так как он не находится в том же пакете что и Cow
            return;
        }
}

public class Task1 {
    public static void main(String[] args){

        //Проверяю, что все работе для оригинального класса
        Cow cow = new Cow();
        cow.show();
        
        Calf calf = new Calf();
        calf.show();


    }
}
