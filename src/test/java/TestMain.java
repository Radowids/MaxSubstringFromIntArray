import org.junit.Assert;
import org.junit.Test;
import pl.programujodpodstaw.Main;

public class TestMain {
    int[] integerArray = {10, 5, 2, 7, 8, 7};
    int k1 = 3;
    int k2 = 6;
    int k3 = 1;
    int k4 = 4;
    int k5 = 2;
    int[] integerArray1 = {10, 7, 8, 8};
    int[] integerArray2 = {10};
    int[] integerArray3 = {10, 5, 2, 7, 8, 7};
    int[] integerArray4 = {10, 8, 8};
    int[] integerArray5 = {10, 5, 7, 8, 8};

    @Test
    public void testMain1(){
        Assert.assertArrayEquals(integerArray1, Main.maxValueOfUserSubArray(integerArray, k1));
    }

    @Test
    public void testMain2(){
        Assert.assertArrayEquals(integerArray2, Main.maxValueOfUserSubArray(integerArray, k2));
    }

    @Test
    public void testMain3(){
        Assert.assertArrayEquals(integerArray3, Main.maxValueOfUserSubArray(integerArray, k3));
    }

    @Test
    public void testMain4(){
        Assert.assertArrayEquals(integerArray4, Main.maxValueOfUserSubArray(integerArray, k4));
    }

    @Test
    public void testMain5(){
        Assert.assertArrayEquals(integerArray5, Main.maxValueOfUserSubArray(integerArray, k5));
    }
}
