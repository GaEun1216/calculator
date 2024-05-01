public interface AbstractOperation {
    // interface로 사칙연산 + 1 클래스에서 operate를 작성한다.
    public abstract <T extends Number> T operate(T f, T s) throws IllegalAccessException;
}
