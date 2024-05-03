import java.awt.datatransfer.FlavorListener;

public class DivideOperation<T extends Number> implements AbstractOperation<T>{
    //곱셈 기능
    public final Class<T> type;

    public DivideOperation(Class<T> type){this.type=type;}
    @Override
    public T operate(T  first, T  second) {
        if (first.doubleValue() == 0) {
            throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
        double result = first.doubleValue() / second.doubleValue();

        return NumberConversionUtils.convertNumberToType(result, type);
    }
}
