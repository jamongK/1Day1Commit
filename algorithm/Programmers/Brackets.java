import java.util.Stack;

//효율성 : 4(30.5)
public class Brackets {
    public static void main(String[] args) {
        Brackets b = new Brackets();
        String str1 = ")()(";
        String str2 = "(()";
        String str3 = "(())";
        String str4 = "(()))";
        System.out.println(b.solution(str1));
        System.out.println(b.solution(str2));
        System.out.println(b.solution(str3));
        System.out.println(b.solution(str4));

    }
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> cs = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cs.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (cs.empty()) {
                    return false;
                }
                cs.pop();
            }
        }

        if (!cs.empty()) {
            answer = false;
        }

        return answer;
    }
}
