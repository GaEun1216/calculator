public enum OperatorType{
    Add('+'),

    Subtract('-'),

    Multiply('*'),

    Divide('/'),

    Mod('%'),

    None(' ');
    // 주어진 연산기호가 아닌 다른 기호가 들어왔을 때 처리

    // enum변수를 담아줄 변수명
    private char sign;

    OperatorType(char sign) {
        this.sign = sign;
    }

    //char 형태를 enum으로 반환해준다
    public static OperatorType createOperate(char sign){
        // 사칙연산 클래스에서 기호에 해당하는 값을 받았을 때 반환할 인자
        if(sign == Add.sign) return Add;
        if(sign == Subtract.sign) return Subtract;
        if(sign == Divide.sign) return Divide;
        if(sign == Mod.sign) return Mod;
        if(sign == Multiply.sign) return Multiply;
        return None;
    }


}
