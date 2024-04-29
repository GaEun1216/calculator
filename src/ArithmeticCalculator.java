import java.util.Queue;

public class ArithmeticCalculator extends Calculator{


    public double cal(int a, int b,char tool) throws CalException{
        double result = 0;
        switch (tool) { // 각 사칙연산에 해당하는 작업 수행
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '/' -> {
                if(b==0) throw new CalException();
                else result = a / b;
            }
            case '*' -> result = a * b;
        }
        que.add(result);
        return result;
    }

}
