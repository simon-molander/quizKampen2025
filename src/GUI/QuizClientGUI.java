package GUI;

import QuestionsAndAnswers.Question;

import javax.swing.*;
import java.awt.*;

public class QuizClientGUI extends JFrame {

    public QuizClientGUI (){

        setLayout(new BorderLayout());

        JPanel northpanel = new JPanel();
        northpanel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Välkommen till Quize-kampen");
        northpanel.add(label);
        northpanel.setBackground(Color.GRAY);
        add(northpanel,BorderLayout.NORTH);

        // Tomt i mitten, text eller bild.

        JPanel south = new JPanel();
        south.setLayout(new FlowLayout());
        JButton button1 = new JButton("Starta spelet");
        south.add(button1);
        add(south,BorderLayout.SOUTH);


        setTitle("Quize-kampen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650,650);
        setLocationRelativeTo(null);
        setVisible(true);

        button1.addActionListener(e -> {
            showCategoryView();
        });


    }

    private void showCategoryView(){

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout());
        northPanel.add(new JLabel("Välj kategori"));
        //add(northPanel,BorderLayout.NORTH);


        JPanel centerPanel = new JPanel(new GridLayout(2,2));
        JButton btnMedia = new JButton("Media");
        JButton btnHistory = new JButton("History");
        JButton btnNature = new JButton("Nature");
        JButton btnGeography = new JButton("Geography");


        centerPanel.add(btnMedia);
        centerPanel.add(btnHistory);
        centerPanel.add(btnNature);
        centerPanel.add(btnGeography);
        //add(centerPanel,BorderLayout.CENTER);

        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);




        setContentPane(mainPanel);
        revalidate();
        repaint();

    }

    private void showQuestionView(Question q){

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel northPanel = new JPanel(new FlowLayout());
        northPanel.add(new JLabel(q.getQuestionText()));

        JPanel answers = new JPanel(new GridLayout(2,2));
        JButton a1 = new JButton(q.getAnswer(1).getAnswerText());
        JButton a2 = new JButton(q.getAnswer(2).getAnswerText());
        JButton a3 = new JButton(q.getAnswer(3).getAnswerText());
        JButton a4 = new JButton(q.getAnswer(4).getAnswerText());

        a1.addActionListener(e -> {

        });
        a2.addActionListener(e -> {

        });
        a3.addActionListener(e -> {

        });
        a4.addActionListener(e -> {

        });

        answers.add(a1);
        answers.add(a2);
        answers.add(a3);
        answers.add(a4);


        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(answers, BorderLayout.CENTER);

        setContentPane(mainPanel);
        revalidate();
        repaint();


    }

    static void main() {
        new QuizClientGUI();
    }
}
