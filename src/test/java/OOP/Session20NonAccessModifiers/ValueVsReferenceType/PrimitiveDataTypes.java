package OOP.Session20NonAccessModifiers.ValueVsReferenceType;

public class PrimitiveDataTypes {

    // byte:   -128 pana la 127
    byte myByte = 12;
    Byte myBytreWrapper;

    // short:   16 bit integer value
    // -32.768 pana la 32.767
    short myShort = 1234;

    // int:  32 bits integral value
    int myInt = 7897;
    Integer myInteger = null;
    Integer another = Integer.parseInt("1234579");

    // int:  64 bits integral value
    long myLong = 12345;

    double myDouble = 12.55;

    // 64 bits floating value
    // about 15 decimal digits
    float myFloat = 6.3f;

    boolean myBoolean = false;
    boolean mTestBoolean = (myInt > 200);

    Boolean myBooleanWrapper;

    // un singur caracter
    char myChar = 'w';

}
