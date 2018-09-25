package chatbot;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChatBot extends JFrame {

    public ChatBot() {
        // создание окна
        super("Chat Bot");
        setBounds(100, 100, 500, 500);
        
        // заполнение окна
        JLabel dialogLabel = new JLabel("Представьтесь, пожалуйста.", SwingConstants.CENTER);
        JButton enterText = new JButton("Ввод");
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        JTextField answer = new JTextField(10);
        answer.setText(null);
        buttonsPanel.add(answer);
        buttonsPanel.add(enterText);
        add(dialogLabel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
        
        // обработка нажатия на кнопку
        enterText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String answerStr = answer.getText();
                answer.setText(null);
                String logicAnswer = Logic.getResponse(answerStr);
                if(logicAnswer != null)
                	dialogLabel.setText(logicAnswer);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
