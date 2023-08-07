package solution.level1;


import java.util.Arrays;

//n	6
//        arr1	[46, 33, 33 ,22, 31, 50]
//        arr2	[27 ,56, 19, 14, 14, 10]
//        출력	["######", "### #", "## ##", " #### ", " #####", "### # "]
public class test {
    public static void main(String[] args) {
        _41_ordering_string test = new _41_ordering_string();
        String[] input = {"abce", "abcd", "cdx"};
        String[] result = test.solution(input, 2);
        System.out.println(Arrays.toString(result));
    }
}
