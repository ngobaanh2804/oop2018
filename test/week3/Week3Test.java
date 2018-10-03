package week3;

import org.junit.Assert;
import org.junit.Test;

public class Week3Test {
    @Test
    public void Test()
    {
        // TODO: Viết 5 testcase cho phương thức max()
         Assert.assertEquals(100,Week3.max(10,100));
         Assert.assertEquals(0,Week3.max(0,-10));
         Assert.assertEquals(28,Week3.max(28,4));
         Assert.assertEquals(1999,Week3.max(1999,1997));
         Assert.assertEquals(34,Week3.max(15,34));
        // TODO: Viết 5 testcase cho phương thức minOfArray()
        int array1[]= new int[] {1,2,3,4,5};
        int array2[]= new int[] {10,20,30,40,50};
        int array3[]= new int[] {1,-2,3,-4,5};
        int array4[]= new int[] {1,20,300,4000,50000};
        int array5[]= new int[] {0,1};
        Assert.assertEquals(1,Week3.minOfArray(array1));
        Assert.assertEquals(10,Week3.minOfArray(array2));
        Assert.assertEquals(-4,Week3.minOfArray(array3));
        Assert.assertEquals(1, Week3.minOfArray(array4));
        Assert.assertEquals(0,Week3.minOfArray(array5));
        // TODO: Viết 5 testcase cho phương thức calculateBMI()
        Assert.assertEquals("Thiếu cân", Week3.calculateBMI(40.5,1.5));
        Assert.assertEquals("Bình thường", Week3.calculateBMI(45,1.5));
        Assert.assertEquals("Bình thường", Week3.calculateBMI(51.2,1.6));
        Assert.assertEquals("Bình thường", Week3.calculateBMI(54.4,1.7));
        Assert.assertEquals("Béo phì", Week3.calculateBMI(58.5,1.5));
}}
