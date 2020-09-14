import java.io.BufferedReader;
import java.io.InputStreamReader;

// BigInteger 방식 (10826번 문제)을 응용해서 mod(BigInteger.valueOf(1000000))를 했더니 런타임에러 또는 메모리초과
// 일단 피사노 주기는 뭔지, 이걸 왜 써야하는 건지, 이걸 써야하는 이유를 찾게 된 과정 다 모르겠음.
 
public class Baek2749 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());
        int pisano = 1500000; // 피사노 주기
        long[] arr = new long[pisano];
        arr[0] = 0; arr[1] = 1;
 
        for(int i=2 ; i<pisano && i<=n ; i++){
            arr[i] = (arr[i-1] + arr[i-2]) % 1000000;  // 피보나치 수를 1,000,000 으로 나눈 나머지 값을 저장 
        }
 
        if(n >=pisano){
            n %= pisano;
        }
 
        System.out.println(arr[(int) n]);
    }
}

출처 : https://qlyh8.tistory.com/162
