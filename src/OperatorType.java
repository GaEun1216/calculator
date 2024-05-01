public enum OperatorType{
    Add('+'),

    Subtract('-'),

    Multiply('*'),

    Divide('/'),

    Mod('%');

    private char sign;

    OperatorType(char sign) {
        this.sign = sign;
    }
    
}
