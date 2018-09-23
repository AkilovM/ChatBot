package chatbot;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChatBot extends JFrame {

    /*private JTextField answer;
    private JLabel dialogLabel;
    private JButton enterText;
    private JPanel buttonsPanel;*/

    public ChatBot() {
        // �������� ����
        super("Chat Bot");
        setBounds(100, 100, 500, 500);
        
        // ���������� ����
        JLabel dialogLabel = new JLabel("�������������, ����������.", SwingConstants.CENTER);
        JButton enterText = new JButton("����");
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        JTextField answer = new JTextField(10);
        answer.setText(null);
        buttonsPanel.add(answer);
        buttonsPanel.add(enterText);
        add(dialogLabel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);
        
        // ��������� ������� �� ������
        enterText.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String answerStr = answer.getText();
                answer.setText(null);
                String logicAnswer = Logic.summer(answerStr);
                if(logicAnswer != null)
                	dialogLabel.setText(logicAnswer);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
