public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int wh = (brown + 4) / 2;
        int height = 3;
        int width = wh - height;

        while (height >= 3 && width >= height) {
            if ((height - 2) * (width - 2) == yellow) {
                answer[0] = width;
                answer[1] = height;
                break;
            }
            width--;
            height++;
        }

        return answer;
    }
}
