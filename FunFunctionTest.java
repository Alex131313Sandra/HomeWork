package StString.testing;

import StString.FunFunction;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class FunFunctionTest {
    //conversion function
    @Test
    public void IntegerToStringTest () {
        String actual = FunFunction.IntegerToString(984532);
        String expected = "984532";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IntegerToStringTest1() {
        String actual = FunFunction.IntegerToString(-666777);
        String expected = "-666777";
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void DoubleToStringTest() {
        String actual = FunFunction.DoubleToString(25.6);
        String expected = "25.6";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DoubleToStringTest1() {
        String actual = FunFunction.DoubleToString(-25.1);
        String expected = "-25.1";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void DoubleToStringTest2() {
        String actual = FunFunction.DoubleToString(177.1D);
        String expected = "177.1";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StringToNumberTest () {
        int actual = FunFunction.StringToNumber("12345");
        int expected = 12345;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StringToNumberTest1() {
        int actual = FunFunction.StringToNumber("-65470906");
        int expected = -65470906;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StringToNumberTest2(){
        double expected = 0.0;
        double actual = FunFunction.StringToNumber("five");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StringToDoubleTest () {
        double actual = FunFunction.StringToDouble("14.6");
        double expected = 14.6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StringToDoubleTest1() {
        double actual = FunFunction.StringToDouble("-0.675");
        double expected = -0.675;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StringToDoubleTest2() {
        double actual = FunFunction.StringToDouble("1.9D");
        double expected = 1.9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void StringToDoubleTest3(){
        double expected = 0.0;
        double actual = FunFunction.StringToDouble("five");
        Assertions.assertEquals(expected, actual);
    }



    //function work with strings
    @Test
    public void SmallWordLengthTest() {
        int actual = FunFunction.ReplaceCharacters("Motivation it's cool");
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SmallWordLengthTest2() {
        int actual = FunFunction.ReplaceCharacters("");
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void SmallWordLengthTest3() {
        int actual = FunFunction.ReplaceCharacters("123 Wanna know everything");
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ReplaceCharactersTest() {
        String actual = FunFunction.ReplaceCharactersWithSymbols("everything, would, be, better", 10);
        String expected = "everyth$$$";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_addSpaces(){
        String actual = FunFunction.addSpaces("Hi,dear.I miss u!Kiss!Kisss!");
        String expected = "Hi, dear. I miss u! Kiss! Kisss! ";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_addSpaces2(){
        String actual = FunFunction.addSpaces("Привет!привет!");
        String expected = "П р и в е т ! п р и в е т ! ";
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void test_UniqueSymbol () {
        String actual = FunFunction.UniqueSymbol("солнышко вышло");
        String expected = "солнышк в";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_7words_quantityOfWords  () {
        int actual = FunFunction.WordsAmount ("let's think about it a bit later");
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_deletePart () {
        String actual = FunFunction.deletePart("Сашка, всё получится", 3, 4);
        String expected = "Сашвсё получится";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_reverse () {
        String actual = FunFunction.my_reverse("Animes – Semina");
        String expected = "animeS – seminA";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_deleteLastWord () {
        String actual = FunFunction.deleteLastWord("hello, dear");
        String expected = "hello, ";
        Assertions.assertEquals(expected, actual);
    }
}
