package lcs;

/**
 * Created by IntelliJ IDEA.
 * User: Abhinav Bhardwaj
 * Date: 17-12-2020
 * Time: 22:39
 */

public class LCS {
    public static void lcs(String S1, String S2) {
        int Len_S1 = S1.length();
        int Len_S2 = S2.length();
        int[][] LCS_table = new int[Len_S1 + 1][Len_S2 + 1];

        int j, i = 0;
        while(i <= Len_S1) {
            j = 0;
            while(j <= Len_S2) {
                if (i == 0 || j == 0)
                    LCS_table[i][j] = 0;
                else if (S1.charAt(i - 1) == S2.charAt(j - 1)){
                    LCS_table[i][j] = LCS_table[i - 1][j - 1] + 1;
                }
                else{
                    LCS_table[i][j] = Math.max(LCS_table[i - 1][j], LCS_table[i][j - 1]);
                }
                j++;
            }
            i++;
        }

        int index = LCS_table[Len_S1][Len_S2];
        int temp = index;

        char[] lcs = new char[index + 1];
        lcs[index] = '\0';

        i = Len_S1;
        j = Len_S2;
        while (i > 0 && j > 0) {
            if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
                lcs[index - 1] = S1.charAt(i - 1);
                i--;
                j--;
                index--;
            }

            else if (LCS_table[i - 1][j] > LCS_table[i][j - 1]){
                i--;
            }
            else{
                j--;
            }
        }
        display_LCS(temp, lcs);
    }

}