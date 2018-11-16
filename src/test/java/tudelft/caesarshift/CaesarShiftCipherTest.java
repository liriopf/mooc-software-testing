package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher encripter;

    @BeforeEach
    public void createCaesarShiftCipher(){
        encripter = new CaesarShiftCipher();
    }


    @ParameterizedTest(name = "message={0}, shift={1}, result={2}")
    @CsvSource({ "abc,3,def", "xyz,3,abc", "yza,3,bcd" })
    public void encripterFirstLetters(String message, int shift, String expectedResult){
        String result = encripter.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult,result);
    }

}
