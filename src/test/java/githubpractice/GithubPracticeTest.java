package githubpractice;

import org.testng.annotations.Test;

public class GithubPracticeTest {
      @Test
      public void githubPracticeTest() {
        System.out.println("hii github");
        System.out.println("hii jenkins");
        System.out.println("hii maven");
    	String data = System.getProperty("smarty");
    	System.out.println(data);
      }
}
