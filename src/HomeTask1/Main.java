package HomeTask1;

public class Main {
    public static void main(String[] args) {
        //Задание 2(объявление переменных и присваивание им значений)
        byte myByte = 1;
        short myShort = 2;
        int myInt =-3;
        long myLong = 4;
        float myFloat = 4.4f;
        double myDouble = 5.5;
        char myChar = 'c';
        boolean myBool = true;
        //Значения переменных для третьего метода
        double a = 1;
        double b = 2;
        double c = 3;
        double d = 4;
        int year=2012;
        String Name="Олег";
        //Вызов всех методов
        System.out.println(Calculate(a, b, c, d));
        System.out.println(Comparing(c, d));
        System.out.println(PositiveOrNegative(myInt));
        System.out.println(LogicExpression(myInt));
        System.out.println(SayHello(Name));
        System.out.println(LeapYear(year));
    }

    //Задание 1(Пустой метод)
    static void empty() {

    }

    //Задание 3(Метод, вычисляющий значение выражения)
    static double Calculate(double a, double b, double c, double d) {
        double Result = (a * (b + (c / d)));
        return Result;
    }

    //Задание 4(Сравнение)
    static boolean Comparing(double FirstNumber, double SecoundNumber) {
        boolean F;
        if (FirstNumber + SecoundNumber >= 10 && FirstNumber + SecoundNumber <= 20) {
            F = true;
        } else
            F = false;
        return F;
    }
//Задание 5(Больше или меньше нуля, на вход - целое число)
    static String PositiveOrNegative(int Number) {
        String str;
        if (Number >= 0) {
            str = "Число положительное";
        } else
            str = "Число отрицательное";
return str;
    }
    /*
    Задание 6(Вопрос к нему: Скажите, Илья, возможно ли НЕ вернуть ничего в методе, если мы
    указываем типа возвращаемого значения, а не void?
    Т.е. в задании сказано вернуть true, если число отрицательное, про возврат чего-либо
    если чсило  положительное сказано не было, но я не понимаю как это реализовать, судя
    по тому, что я прочитал на многих сайтах и в книгах, это попросту невозможно, не помогает
    и break, т.к. наскоько я понимаю метод прерывается только командой return.
    Подскажите пожалуйста по этому вопросу. Спасибо.
    В данном методе в случае, когда число положительное вернул false.
     */
    static boolean LogicExpression(int Num){
            if(Num<0)
            {
                return true;
            }
            return false;
    }
    //Задание 7
static String SayHello(String name){
        return("Привет, "+name);
}
//Задание 8
static String LeapYear(int YearNum){
        if((YearNum%4==0 && YearNum%100!=0) || YearNum%400==0)
        {return("Этот год високосный");}
        else
            return("Этот год невисокосный");
}
}