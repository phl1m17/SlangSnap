import javax.swing.JLabel;

public class Question {
    JLabel question;
    Panel panel;
    GameScreen gameScreen;
    boolean score = false;
    public void setQuestion(String question){
        this.question.setText(question);
    }
    public void addComponents(){
    }
}
