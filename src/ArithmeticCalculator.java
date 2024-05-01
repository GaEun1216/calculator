import java.util.Queue;

public class ArithmeticCalculator extends Calculator{
    /* 연산 메서드의 책임을 분리 해봅니다. (SRP)
    처음 포함 관계를 상속과 헷갈렸는데,
    클래스의 멤버로 다른 클래스 자료형의 참조 변수를 선언하는 것을 의미하므로
    해당 사칙 연산 클래스를 불러와 연산시 클래스 내에서 처리하면 된다.
     */
    // 인터페이스 abs를 선언하고 switch문을 이용하여 원하는 기능을 가져온다.
    private AbstractOperation abs;


    public double cal(int a, int b,char tool) throws CalException{
        double result = 0;
        switch (tool) { // 각 사칙연산에 해당하는 작업 수행
            case '+' -> abs = new AddOperation();
            case '-' -> abs = new SubstractOperation();
            case '/' -> abs = new DivideOperation();
            case '*' -> abs = new MultiplyOperation();
            case '%' -> abs =  new ModOperator(); //추가
        }
        // 분모가 0일 경우 오류 발생 메시지 출력
        if(b==0) throw new CalException();
        else result = abs.operate(a, b);
        que.add(result);
        return result;
    }

}

