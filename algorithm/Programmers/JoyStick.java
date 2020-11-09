public class JoyStick {
    public int solution(String name) {
        int cnt = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != 'A') {
                int up = name.charAt(i) - 'A'; // A->B->C니까 가려는 글자 - 'A'만큼
                int down = 1 + 'Z' - name.charAt(i); //A->Z->Y..니까 Z를 거치는거라 1더하고 그 차이만큼
                if (up < down)
                    cnt += up;
                else
                    cnt += down;
            }
        }

        int mvCnt = name.length() - 1;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) != 'A') {
                int next = i + 1;
                while(next < name.length() && name.charAt(next) == 'A') {
                    next++;
                }
                int move = 2 * i + name.length() - next;
                mvCnt = Math.min(move, mvCnt);
            }
        }
        return cnt + mvCnt;
    }
}
