package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest {
    String randomWords =
        "curvy\n" +
        "extra-large\n" +
        "corn\n" +
        "flock\n" +
        "manage\n" +
        "crooked\n" +
        "stage\n" +
        "challenge\n" +
        "fade\n" +
        "electric\n" +
        "shrill\n" +
        "sparkle\n" +
        "unkempt\n" +
        "awful\n" +
        "upbeat\n" +
        "callous\n" +
        "like\n" +
        "camp\n" +
        "squealing\n" +
        "story\n" +
        "ragged\n" +
        "fabulous\n" +
        "wrathful\n" +
        "remain\n" +
        "picayune\n" +
        "drip\n" +
        "milky\n" +
        "tease\n" +
        "skate\n" +
        "giraffe\n" +
        "sign\n" +
        "adjoining\n" +
        "condemned\n" +
        "divergent\n" +
        "rainy\n" +
        "pen\n" +
        "exclusive\n" +
        "possible\n" +
        "elbow\n" +
        "beneficial";
    String[] stringArray = randomWords.split("\n");

    @Test
    public void dashaMapConstructorTest() {
        DashaMap dasha = new DashaMapOne();
        Integer expected = 26;
        Integer actual = (int) dasha.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dashaMapOneTest() {
        DashaMapOne hashOne = new DashaMapOne();
        for (String string : stringArray) {
            hashOne.set(hashOne.HashFunctionOne(string), string);
        }
        Integer expected = 3;
        Integer actual = hashOne.bucketSize("p");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dashaMapSetTest() {
        DashaMap dasha = new DashaMapOne();
        dasha.set("b", "baseball");

        System.out.println(dasha.get("b"));
    }

    @Test
    public void dashaMapTwoTest() {
        DashaMapTwo hashTwo = new DashaMapTwo();
        for (String string : stringArray) {
            hashTwo.set(hashTwo.HashFunctionTwo(string), string);
        }
        Integer expected = 4;
        Integer actual = hashTwo.bucketSize("e");

        Assert.assertEquals(expected, actual);
    }
}
