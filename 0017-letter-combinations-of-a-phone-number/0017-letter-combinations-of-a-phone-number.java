import java.util.ArrayList;
import java.util.List;

class Solution {
     String[] arr = {  "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"  };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }

        solve(digits, "", ans);
        return ans;
    }

    private void solve(String digit, String ans1, List<String> ans) {
        if (digit.length() == 0) {
            ans.add(ans1);
            return;
        }

        char ch = digit.charAt(0);
        String key = arr[ch - '0'];


        for (int i = 0; i < key.length(); i++) {
            solve(digit.substring(1), ans1 + key.charAt(i), ans);
        }
    }
}