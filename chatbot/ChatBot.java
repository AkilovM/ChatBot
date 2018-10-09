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
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JPanel enterPanel = new JPanel(new FlowLayout());
        JTextField answer = new JTextField(10);
        answer.setText(null);
        enterPanel.add(answer);
        enterPanel.add(enterText);
        add(dialogLabel, BorderLayout.CENTER);
        add(enterPanel, BorderLayout.SOUTH);

        // обработка нажатия на кнопку
        enterText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String answerStr = answer.getText();
                answer.setText(null);
                if (answerStr.toLowerCase().equals("играть")) {
                    enterPanel.remove(enterText);
                    enterPanel.remove(answer);
                    enterPanel.add(button1);
                    enterPanel.add(button2);
                    enterPanel.add(button3);
                    enterPanel.add(button4);
                    revalidate();
                    repaint();
                }
                String logicAnswer = Logic.getResponse(answerStr);
                if (logicAnswer != null) {
                    dialogLabel.setText(logicAnswer);
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String logicAnswer = Logic.getResponse("1");
                    get(logicAnswer, enterPanel, enterText, button1, button2, button3, button4, answer, dialogLabel);
                        revalidate();
                        repaint();
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String logicAnswer = Logic.getResponse("2");
                get(logicAnswer, enterPanel, enterText, button1, button2, button3, button4, answer, dialogLabel);
                        revalidate();
                        repaint();
            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String logicAnswer = Logic.getResponse("3");
                get(logicAnswer, enterPanel, enterText, button1, button2, button3, button4, answer, dialogLabel);
                        revalidate();
                        repaint();
            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String logicAnswer = Logic.getResponse("4");
                get(logicAnswer, enterPanel, enterText, button1, button2, button3, button4, answer, dialogLabel);
                        revalidate();
                        repaint();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void get(String logicAnswer, JPanel enterPanel, JButton enterText, JButton button1, JButton button2, JButton button3, JButton button4, JTextField answer, JLabel dialogLabel){
        if (logicAnswer != null) {
                    dialogLabel.setText(logicAnswer);
        if (logicAnswer.substring(24, 37).equals("Игра окончена")) {
                        enterPanel.remove(button1);
                        enterPanel.remove(button2);
                        enterPanel.remove(button3);
                        enterPanel.remove(button4);
                        enterPanel.add(answer);
                        enterPanel.add(enterText);
        }
        }
    }
    
    public static void main(String[] args) {
        ChatBot app = new ChatBot();
        app.setVisible(true);
    }
}
