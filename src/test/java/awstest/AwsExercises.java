package awstest;

import interview.foraws.TriangleTester;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AwsExercises {

//    #Level 7
    //Question
    //Implement a function that accepts 3 integer values a, b, c. The function should return true if
    // a triangle can be built with the sides of given length and false in any other case.
    //(In this case, all triangles must have surface greater than 0 to be accepted).

    //Answer
//    Using Desigualdad triangular
    @Test
    public void triangleTests() {
        assertEquals(true, TriangleTester.isTriangle(1, 2, 2));
        assertEquals(false, TriangleTester.isTriangle(7, 2, 2));
    }


    //    Simple, given a string of words, return the length of the shortest word(s).
    //    String will never be empty and you do not need to account for different data types.
    //    #Level 7
    @Test
    public void findShort() throws Exception {
        assertEquals(3, TriangleTester.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, TriangleTester.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, TriangleTester.findShort("Let's travel abroad shall we"));
    }


//    This time no story, no theory. The examples below show you how to write function accum:
//    accum("abcd") -> "A-Bb-Ccc-Dddd"
//    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//    accum("cwAt") -> "C-Ww-Aaa-Tttt"
//    #Level 7
private static void testing(String actual, String expected) {
    assertEquals(expected, actual);
}
    @Test
    public void test() {
        System.out.println("Fixed Tests accum");
        testing(TriangleTester.accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
        testing(TriangleTester.accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
        testing(TriangleTester.accum("MjtkuBovqrU"), "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
        testing(TriangleTester.accum("EvidjUnokmM"), "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
        testing(TriangleTester.accum("HbideVbxncC"), "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
    }

//    An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string
//    that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.


    @Test
    public void FixedTests() {
        assertEquals(true, TriangleTester.isIsogram("Dermatoglyphics"));
        assertEquals(true, TriangleTester.isIsogram("isogram"));
        assertEquals(false, TriangleTester.isIsogram("moose"));
        assertEquals(false, TriangleTester.isIsogram("isIsogram"));
        assertEquals(false, TriangleTester.isIsogram("aba"));
        assertEquals(false, TriangleTester.isIsogram("moOse"));
        assertEquals(true, TriangleTester.isIsogram("thumbscrewjapingly"));
        assertEquals(true, TriangleTester.isIsogram(""));
    }


    //    in a small town the population is p0 = 1000 at the beginning of a year. The population regularly increases by 2 percent per year and moreover 50 new inhabitants per year come to live in the town. How many years does the town need to see its population greater or equal to p = 1200 inhabitants?
    //
//    At the end of the first year there will be:
//            1000 + 1000 * 0.02 + 50 => 1070 inhabitants
//
//    At the end of the 2nd year there will be:
//            1070 + 1070 * 0.02 + 50 => 1141 inhabitants (** number of inhabitants is an integer **)
//
//    At the end of the 3rd year there will be:
//            1141 + 1141 * 0.02 + 50 => 1213
//
//    It will need 3 entire years.
//    More generally given parameters:
//
//    p0, percent, aug (inhabitants coming or leaving each year), p (population to surpass)
//
//    the function nb_year should return n number of entire years needed to get a population greater or equal to p.
//
//    aug is an integer, percent a positive or null floating number, p0 and p are positive integers (> 0)
//
//    Examples:
//    nb_year(1500, 5, 100, 5000) -> 15
//    nb_year(1500000, 2.5, 10000, 2000000) -> 10
//    Note:
//
//    Don't forget to convert the percent parameter as a percentage in the body of your function: if the parameter percent is 2 you have to convert it to 0.02.
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(TriangleTester.nbYear(1500, 5, 100, 5000),15);
        testing(TriangleTester.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(TriangleTester.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }

}
