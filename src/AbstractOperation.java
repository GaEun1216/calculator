public interface AbstractOperation<T extends Number> {
    // interface로 사칙연산 + 1 클래스에서 operate를 작성한다.
    public T operate(T first, T second) throws IllegalAccessException;
}
