package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}

class 사람인력관리소 {
    //사람[] 사람들 = new 사람[3];   //배열로 사람들의 정보를 저장한다. 배열의 길이를 3으로 정해줬기 때문에 최대 3명까지 들어갈 수 있음.
    // 사람을 한명 더 추가하려고하면 오류가 생기기 떄문에 좋은 방법은 아니다.
    //List<사람> 사람들 = new ArrayList<>();     //ArrayList 사용
    Map<Integer, 사람> 사람들 = new HashMap<>(); //HashMap 사용

    int last_number = 0;

    void add사람(String 이름, int 나이) {
        int 번호 = last_number + 1;   //번호가 1부터 시작된다.
        사람 a사람 = new 사람();
        a사람.나이 = 나이;
        a사람.이름 = 이름;
        a사람.번호 = 번호;

        System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n", 나이, 번호, 이름);
        last_number++;

        // 정보 추가
        //사람들[번호-1] = a사람;    //객체를 생성해서 저장한 a사람의 정보를 배열 사람들[번호-1]에 넣는다.
        //index를 -1 해주는 이유는 index는 0부터 시작하기 때문이다. 코드를 보면 last_number+1을 하여 번호에 넣어줬기 때문에 1을 줄여줘야한다.
        //사람들.add(a사람);   // ArrayList 사용할때 데이터를 넣어주는 방법
        사람들.put(번호, a사람);   //HashMap 사용할 때 데이터를 넣어주는 방법
    }

    //정보 호출
    사람 get사람(int 번호) {  //번호를 넘겨받아

        //리턴해준다.
        //return 사람들[번호-1];   // index가 0부터 저장되기 때문에 -1을 해줘야한다.
        //return 사람들.get(번호 - 1); // 형식 외울것[ArrayList] - index가 0부터 저장되기 때문에 -1을 해줘야 한다.
        return 사람들.get(번호);     // 형식 외울것[HashMap] - 번호를 직접 매치시키기 때문에 번호 -1 할 필요없다.
    }
}

class 사람 {
    int 번호;
    String 이름;
    int 나이;

    void 자기소개() {
        System.out.printf("저는 %d번, %s, %d살 입니다.\n", this.번호, this.이름, this.나이);
    }
}