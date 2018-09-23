package chatbot;

public class Logic {

	private static int questionNumber = 0;
    private static int rightAnswers = 0;
	//private static Constants constants;
	private static String username;
	private static Boolean haveUsername = false; // �������� �� ��� ������������?
	private static Boolean playingState = false; // �������� ��������� ��� ���.
	
	public static String summer(String answerStr) {
		if(answerStr.length() != 0) {
			if(haveUsername) {
				if(answerStr.toLowerCase().equals("������")) {
					playingState = false;
					return(Constants.greeting);
				}
				else if(playingState){
					if(Integer.parseInt(answerStr) == Constants.answers[questionNumber])
						rightAnswers++;
					questionNumber++;
					if(Constants.questionsCount == questionNumber) {
						playingState = false;
						return("<html><p align=\"center\">���� ��������.</p><br><p align=\"center\">" + username 
								+ ", �� �������� ��������� �� " + rightAnswers + " �� " + Constants.questionsCount + " ��������.</p></html>");
					}
					return(Constants.questions[questionNumber]);
				}
				else if(answerStr.toLowerCase().equals("������"))
				{
					playingState = true;
					questionNumber = 0;
					rightAnswers = 0;
					return(Constants.questions[questionNumber]);
				}
			}
			else {// �������� ��� ������������
				username = answerStr;
				haveUsername = true;
				return("<html><p align=\"center\">������, " + username + "!</p><br>" + Constants.greeting + "</html>");
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
        ChatBot app = new ChatBot();
        app.setVisible(true);
    }

}
