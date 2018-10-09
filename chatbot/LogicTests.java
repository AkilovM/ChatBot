package chatBotUnitTests;

import chatbot.Constants;
import chatbot.Logic;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LogicTests {
    public LogicTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        Logic.haveUsername = false;
    }
    
    @After
    public void tearDown() {
    }
    
    
    @Test
    public void testGetResponse_ENTER() {
        assertEquals("<html><p align=\"center\">Привет, " + "Саша" + "!</p><br>" + Constants.greeting + "</html>", Logic.getResponse("Саша"));
    }
    @Test
    public void testGetResponse_HELP() {
        assertEquals("<html><p align=\"center\">Привет, " + "Саша" + "!</p><br>" + Constants.greeting + "</html>", Logic.getResponse("Саша"));
        assertEquals(Constants.greeting, Logic.getResponse("помощь"));
    }
    @Test
    public void testGetResponse_START() {
        assertEquals("<html><p align=\"center\">Привет, " + "Саша" + "!</p><br>" + Constants.greeting + "</html>", Logic.getResponse("Саша"));
        assertEquals(Constants.questions[0], Logic.getResponse("играть"));
        Logic.haveUsername = false;
    }
    @Test
    public void testGetResponse_ZERO() {
        assertEquals("<html><p align=\"center\">Привет, " + "Саша" + "!</p><br>" + Constants.greeting + "</html>", Logic.getResponse("Саша"));
        Logic.getResponse("играть");
        Logic.getResponse("1");
        String[] numbers = {"0", "3", "2", "4", "2"};
        for(int i = 1; i < Constants.questions.length; i++){
            Logic.getResponse(numbers[i]);
        }
        assertEquals(0, Logic.rightAnswers);
    }
    @Test
    public void testGetResponse_ONE() {
        assertEquals("<html><p align=\"center\">Привет, " + "Саша" + "!</p><br>" + Constants.greeting + "</html>", Logic.getResponse("Саша"));
        Logic.getResponse("играть");
        Logic.getResponse("1");
        String[] numbers = {"0", "2", "3", "3", "4"};
        for(int i = 1; i < Constants.questions.length; i++){
            Logic.getResponse(numbers[i]);
        }
        assertEquals(1, Logic.rightAnswers);
    }
    @Test
    public void testGetResponse_TWO() {
        assertEquals("<html><p align=\"center\">Привет, " + "Саша" + "!</p><br>" + Constants.greeting + "</html>", Logic.getResponse("Саша"));
        Logic.getResponse("играть");
        Logic.getResponse("1");
        String[] numbers = {"0", "3", "4", "2", "4"};
        for(int i = 1; i < Constants.questions.length; i++){
            Logic.getResponse(numbers[i]);
        }
        assertEquals(2, Logic.rightAnswers);
    }
    @Test
    public void testGetResponse_THREE() {
        assertEquals("<html><p align=\"center\">Привет, " + "Саша" + "!</p><br>" + Constants.greeting + "</html>", Logic.getResponse("Саша"));
        Logic.getResponse("играть");
        Logic.getResponse("3");
        String[] numbers = {"0", "1", "3", "2", "1"};
        for(int i = 1; i < Constants.questions.length; i++){
            Logic.getResponse(numbers[i]);
        }
        assertEquals(3, Logic.rightAnswers);
    }
    @Test
    public void testGetResponse_FOUR() {
        assertEquals("<html><p align=\"center\">Привет, " + "Саша" + "!</p><br>" + Constants.greeting + "</html>", Logic.getResponse("Саша"));
        Logic.getResponse("играть");
        Logic.getResponse("3");
        String[] numbers = {"0", "2", "4", "2", "4"};
        for(int i = 1; i < Constants.questions.length; i++){
            Logic.getResponse(numbers[i]);
        }
        assertEquals(4, Logic.rightAnswers);
    }
    @Test
    public void testGetResponse_FIVE() {
        assertEquals("<html><p align=\"center\">Привет, " + "Саша" + "!</p><br>" + Constants.greeting + "</html>", Logic.getResponse("Саша"));
        Logic.getResponse("играть");
        Logic.getResponse("3");
        String[] numbers = {"0", "2", "4", "2", "1"};
        for(int i = 1; i < Constants.questions.length; i++){
            Logic.getResponse(numbers[i]);
        }
        assertEquals(5, Logic.rightAnswers);
    }
}
