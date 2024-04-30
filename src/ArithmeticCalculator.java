import java.util.Queue;

public class ArithmeticCalculator extends Calculator{
    /* 연산 메서드의 책임을 분리 해봅니다. (SRP)
    처음 포함 관계를 상속과 헷갈렸는데,
    클래스의 멤버로 다른 클래스 자료형의 참조 변수를 선언하는 것을 의미하므로
    해당 사칙 연산 클래스를 불러와 연산시 클래스 내에서 처리하면 된다.
     */
    private final AddOperation addOperation;
    private final SubstractOperation substractOperation;
    private final DivideOperation divideOperation;
    private final MultiplyOperation multiplyOperation;

    public ArithmeticCalculator(){
        // 생성자 함수에서 각 분리 클래스 초기화
        addOperation = new AddOperation();
        substractOperation = new SubstractOperation();
        divideOperation = new DivideOperation();
        multiplyOperation = new MultiplyOperation();
    }


    public double cal(int a, int b,char tool) throws CalException{
        double result = 0;
        switch (tool) { // 각 사칙연산에 해당하는 작업 수행
            case '+' -> result = addOperation.operate(a,b);
            case '-' -> result = substractOperation.operate(a,b);
            case '/' -> {
                if(b==0) throw new CalException();
                else result = divideOperation.operate(a,b);
            }
            case '*' -> result = multiplyOperation.operate(a,b);
        }
        que.add(result);
        return result;
    }

}
