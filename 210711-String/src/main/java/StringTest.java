public class StringTest {
    public static void main(String[] args) {
        String java = new String("JAVA");
        String android = new String("NDROID");

        System.out.println(System.identityHashCode(java));

        java = java.concat(android);
        System.out.println(java);
        System.out.println(System.identityHashCode(java)); //해시코드 값이 다르다 == 다른 메모리를 사용한다.
    }
}
