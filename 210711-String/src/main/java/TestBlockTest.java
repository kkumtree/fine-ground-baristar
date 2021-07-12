//java 13 부터 사용이 가능한 기능
//html, json 문자열을 만드는데 유용

public class TestBlockTest {
    public static void main(String[] args) {
        String testBlocks = """
                Hello,
                Good Bye,
                and Hello""";
        System.out.println(testBlocks);
        System.out.println(getBlockOfHtml());
    }

    public static String getBlockOfHtml() { //메인문에서 호출할 것이기 때문에 static
        return """
		            <html>

		                <body>
		                    <span>example text</span>
		                </body>
		            </html>""";

    }

}
