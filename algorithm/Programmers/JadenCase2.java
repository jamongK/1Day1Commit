public class JadenCase2 {
    public static void main(String[] args) {
        String s = "hELlo   iT iS  Me   ";
        JadenCase2 j = new JadenCase2();
        System.out.println(j.solution(s));
    }

    public String solution(String s) {
        String answer = null;
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i].equals(" "))) {
                if (arr[i].length() > 1) {
                    sb.append(arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase());
                } else {
                    sb.append(arr[i].toUpperCase());
                }
                if (i < (arr.length - 1))
                    sb.append(" ");
            } else {
                sb.append(" ");
            }
        }
        
        // 끝부분 스페이스도 스페이스 개수만큼 반환해줘야한다.
        int idx = s.length() - 1;
        while (s.charAt(idx) == ' ') {
            sb.append(" ");
            idx--;
        }

        answer = sb.toString();
        return answer;
    }
}
