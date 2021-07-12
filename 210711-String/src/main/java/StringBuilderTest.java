public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("JAVA");
        String android = new String("NDROID");

        System.out.println(System.identityHashCode(java));
        StringBuilder buffer = new StringBuilder(java); //싱글스레드에는 스트링'빌더'를 사용
        System.out.println(System.identityHashCode(buffer));

        buffer.append(android);

        String test = buffer.toString();
        System.out.println(test);
        System.out.println(System.identityHashCode(buffer)); //동일한 메모리 주소를 사용한다.

    }
}
