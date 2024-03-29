import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //홀수 짝수 출력하기

        //랜덤으로 숫자 5개 입력받아 출력하기

        //랜덤으로 숫자 10개 입력받아 짝수만 출력하기

        //문자열 입력받아서 문자열 한글자씩 출력하기

        //문자열(영단어) 입력받아서 문자열 첫글자 대문자로 변경하기

        //오버라이딩, 오버로딩에 대한 문제
        //상속 관계에 있는 클래스 2개를 제공해주고 오버라이딩된 메소드 출력시 어떤 결과가 출력되냐?

        //클래스하나 주어진 상태에서 해당 클래스를 상속받는 새로운 클래스를 만들고 다음과 같은 결과가 되도록 오버라이딩을 해라

        //똑같은 이름의 메소드 한 10개 제공해주고 에러가 발생하는 이유를 기술해라

        // void sample(int n); -> sample(3); sample(5, 7.0); 해당 코드가 문제가 되지않도록 코드를 수정해라

        //배열 -> 길이가 정해져있는 것 -> 배열의 범위를 초과하는 코드조심
        //배열을 제공하고 모든 객체를 출력해라

        //다형성 -> 다운캐스팅 조심

        //Human을 담을 수 있는 ArrayList 1개를 생성하고 임의로 Human객체 5개를 생성해서 담아라
        //단 해당 List에는 Human객체만 담을 수 있게 구성하세요.

        //ArrayList<Human> arr = new ArrayList<>();
        //arr.add(new Human("최지원"));
        //arr.add("김수민");

        //파일에 내용작성하기, 파일로부터 내용 가져오기
        //파일에 객체정보 저장하기(직렬화), 파일로부터 객체정보 가져오기(역직렬화)

        //udp또는 tcp에서 클라이언트, 서버 구성하게

        String[] arr = {"mad", "play", "kkk", "hahaha"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);
        Stream<String> stream2 = Arrays.stream(arr, 0, 2);
        stream2.forEach(System.out::println);
        IntStream stream3 = IntStream.rangeClosed(0, 20);
        stream3.forEach(System.out::println);

        IntStream randomInt = new Random().ints(1,100);
        randomInt.limit(10).forEach(System.out::println);

        System.out.println();

        System.out.println(IntStream.range(0, 20));

        try {
            String str = InetAddress.getLocalHost().getHostAddress();
            System.out.println(str);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
    }



}