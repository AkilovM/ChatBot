package chatbot;

public class Logic {

	private static int questionNumber = 0;
    private static int rightAnswers = 0;
	private static String username;
	private static Boolean haveUsername = false; // Получено ли имя пользователя?
	private static Boolean playingState = false; // Проходит викторину или нет.
	
	public static String getResponse(String answerStr) {
		if(answerStr.length() != 0) {
			if(haveUsername) {
				if(answerStr.toLowerCase().equals("помощь")) {
					playingState = false;
					return(Constants.greeting);
				}
				else if(playingState){
					try {
						if(Integer.parseInt(answerStr) == Constants.answers[questionNumber])
							rightAnswers++;
					}
					catch (NumberFormatException e){
						return (Constants.questions[questionNumber] + "<html><br>Пишите число = номер выбранного ответа!</html>");
					}
					questionNumber++;
					if(Constants.questionsCount == questionNumber) { // Если был последний вопрос
						playingState = false;
						return("<html><p align=\"center\">Игра окончена.</p><br><p align=\"center\">" + username 
								+ ", вы ответили правильно на " + rightAnswers + " из " + Constants.questionsCount + " вопросов.</p></html>");
					}
					return(Constants.questions[questionNumber]);
				}
				else if(answerStr.toLowerCase().equals("играть"))
				{
					playingState = true;
					questionNumber = 0;
					rightAnswers = 0;
					return(Constants.questions[questionNumber]);
				}
			}
			else {// получаем имя пользователя
				username = answerStr;
				haveUsername = true;
				return("<html><p align=\"center\">Привет, " + username + "!</p><br>" + Constants.greeting + "</html>");
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
        ChatBot app = new ChatBot();
        app.setVisible(true);
    }

}
