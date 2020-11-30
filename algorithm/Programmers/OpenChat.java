import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//효율성 : 4
public class OpenChat {
    public String[] solution(String[] record) {
        List<String> list = new ArrayList<String>();
        Map<String, String> map = new HashMap<String, String>();

        //Enter, change는 모두 아이디(key), 닉네임(value)를 hashmap에 추가한다.
        //그렇다고 leave한다고 hashmap에서 remove하진 않는다.
        //맨처음에 hashmap에 각 아이디+닉네임을 저장해 닉네임 변경사항을 반영한 후에 log를 남기는 방식.
        //for문 하나 안에서 닉네임 변경할때마다 log내용 일일이 접근해 값(nickName) 변경하는 건 비효율적이라고 한다.
        for (int i = 0; i < record.length; i++) {
            String[] input = record[i].split(" ");

            if (!(input[0].equals("Leave"))) {
                map.put(input[1], input[2]);
            }
        }

        for (int i = 0; i < record.length; i++) {
            String[] input = record[i].split(" ");

            // 여기서 map.put()을 해버리면 닉네임 변경사항(중복시 값 갱신) 저장 후 log남기는 방식이 X
//            if (!(input[0].equals("Leave"))) {
//                map.put(input[1], input[2]);
//            }

            if (input[0].equals("Enter")) {
                list.add(map.get(input[1]) + "님이 들어왔습니다."); //map.get(input[1])-->input[i]인 key값의 value 리턴
            } else if (input[0].equals("Leave")) {
                list.add(map.get(input[1]) + "님이 나갔습니다.");
            }
        }

        String[] answer = new String[list.size()];
        int i = 0;

        for (String s : list) {
            answer[i++] = s;
        }

        return answer;
    }
}
