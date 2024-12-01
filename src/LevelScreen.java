import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class LevelScreen implements ActionListener{
    Panel panel;

    JButton[] levels = new JButton[6];
    public LevelScreen(Panel panel) {
        this.panel = panel;
        for(int i = 0; i<levels.length; i++){
            levels[i] = new JButton(String.valueOf((i+1)));
            levels[i].setBounds((i<2?((i+1)):(i<4?(i-1):(i-3)))*150-70, (i<2?70:(i<4?230:390))+100, 100, 100);
            levels[i].setBackground(panel.getDuoGreen());
            levels[i].setForeground(Color.white);
            levels[i].setFont(panel.getFont().deriveFont(30f));
            levels[i].setOpaque(true);
            levels[i].setBorder(null);
            levels[i].setForeground(Color.white);
            levels[i].addActionListener(this);
        }
    }
    public void addComponents(){
        for (JButton level : levels) {
            panel.add(level);
            level.setVisible(true);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0;i<levels.length;i++){
            if(e.getSource() == levels[i]){
                System.out.println(i);
                levels[i].setBackground(new Color(84,183,11));
                panel.removeAll();
                panel.gameScreen.addComponents();
            }
        }
    }
}