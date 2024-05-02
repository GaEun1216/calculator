import java.awt.datatransfer.FlavorListener;

public class ModOperator<T extends Number> implements AbstractOperation<T>{
    //나눗셈 기능
    public final Class<T> type;

    public ModOperator(Class<T> type){this.type=type;}
    @Override
    public T operate(T  f, T  s) {
        if (f.doubleValue() == 0) {
            throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        }
        double result = f.doubleValue() % s.doubleValue();

        return NumberConversionUtils.convertNumberToType(result, type);
    }
}
