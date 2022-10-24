package LambdaLearning;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
//        OOP WAY
        Greeting greeting1 = new GreetingHello();
        greeting1.sayHello();

//        FUNCTION
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World from functional programming");
            }
        };
        greeting2.sayHello();

//        LAMBDA
        Greeting greeting3 = () -> System.out.println("Hello World from Lambda Function.");
        greeting3.sayHello();

        Calculator calculator = (int x, int y) -> {
            Random random = new Random();
            int randomNum = random.nextInt(50);
            return x + y + randomNum;
        };
        System.out.println(calculator.calculate(1, 2));

        IntBinaryOperator calculator1 = (int x, int y) -> {
            Random random = new Random();
            int randomNum = random.nextInt(50);
            return x + y + randomNum;
        };
        System.out.println(calculator1.applyAsInt(1, 2));
    }
}
