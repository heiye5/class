package spaces;

/*
    把单词中的多个空格转换成一个空格
 */

public class reduceSpacesTest {
    public static void main(String[] args) {
        String str = "jdshf    jkfkgd fdg";

        str.replaceAll("/\\s+/","");

    }
}
