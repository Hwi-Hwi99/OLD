/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package game;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author acer
 */
public class Menu extends javax.swing.JFrame {

//    /**
//     * Creates new form Menu
//     */
  
    private JList<String> scoreList;
    private final BackgroundMusicPlayer musicPlayer;
    private JSlider volumeSlider;
    private Clip clip;
    private FloatControl volumeControl;   
    
    
  
    public Menu() {
        initComponents();
         musicPlayer = new BackgroundMusicPlayer();
         musicPlayer.playMusic("Music/mop.wav");
         addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                musicPlayer.stopMusic();
            }
        });
//  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnStart = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStart.setBackground(new java.awt.Color(204, 255, 51));
        btnStart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnStart.setText("Start");
        btnStart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 255, 102), null, null));
        btnStart.setBorderPainted(false);
        btnStart.setPreferredSize(new java.awt.Dimension(100, 35));
        btnStart.setVerifyInputWhenFocusTarget(false);
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        getContentPane().add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        btnS.setBackground(new java.awt.Color(204, 255, 51));
        btnS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnS.setText("Scores");
        btnS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnS.setBorderPainted(false);
        btnS.setPreferredSize(new java.awt.Dimension(100, 35));
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });
        getContentPane().add(btnS, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Setting");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(100, 35));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 100, 30));

        jButton2.setBackground(new java.awt.Color(204, 255, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Exit");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.setPreferredSize(new java.awt.Dimension(100, 35));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/7165d0aea6e7b59f50b328052515fff2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, 0, 820, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        var ex = new Game();
            ex.setVisible(true);       
            ex.setDefaultCloseOperation(EXIT_ON_CLOSE);
           musicPlayer.stopMusic();          
           
            
    }//GEN-LAST:event_btnStartActionPerformed
    public void playMusic(String musicFilePath) {
        try {
            File file = new File(musicFilePath);
            if (file.exists()) {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
               volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                clip.start();

            } else {
                System.out.println("File not found: " + musicFilePath);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public void playMusic() {
        if (clip != null) {
            clip.start();
        }
    }

    public void stopMusic() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }

    public void setVolume(float volume) {
          // Chuyển đổi giá trị âm lượng từ JSlider thành phần giảm âm lượng của BackgroundMusicPlayer
      if (volumeControl != null) {
            float range = volumeControl.getMaximum() - volumeControl.getMinimum();
            float gain = (range * volume) + volumeControl.getMinimum();
            volumeControl.setValue(gain);
        } else {
            System.out.println("Error: volumeControl is null");
        }
    }
    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        // TODO add your handling code here:
           

             try {
                    showScoreFrame();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
//              this.toBack();
              
    }//GEN-LAST:event_btnSActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:       
         try {
                    showSetting();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
     public void showSetting() throws IOException {
    JLabel titleLabel = new JLabel("Setting");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 16));

    JLabel volumeLabel = new JLabel("Volume:");

    JSlider volumeSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
    volumeSlider.setMajorTickSpacing(10);
    volumeSlider.setMinorTickSpacing(1);
    volumeSlider.setPaintTicks(true);
    volumeSlider.setPaintLabels(true);
    volumeSlider.setUI(new CustomSliderUI(volumeSlider));
    volumeSlider.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            int volumeValue = volumeSlider.getValue();
            float volume = volumeValue / 100.0f;
            musicPlayer.setVolume(volume);
        }
    });
     JRadioButton j1 = new JRadioButton();
     j1.setSelected(true);
    j1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
         
             if (j1.isSelected()) {
                        // Trạng thái khi nhấn (đang phát)
                        musicPlayer.playMusic();
//                       
                    } else {
                        // Trạng thái khi nhấn lại (không phát)
                        musicPlayer.stopMusic();
//                      
                    }
        }
    });

    JFrame settingFrame = new JFrame("Setting");

    settingFrame.setSize(380, 420);
    settingFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    settingFrame.setLocationRelativeTo(null);

    // Sửa đổi layout của settingFrame
    settingFrame.setLayout(new BorderLayout());

    JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    centerPanel.add(volumeLabel);
    centerPanel.add(volumeSlider);
    centerPanel.add(j1);
    
    // Thêm centerPanel vào BorderLayout.CENTER của settingFrame
    settingFrame.add(centerPanel, BorderLayout.CENTER);

    // Thêm titleLabel và backButton vào BorderLayout.NORTH và BorderLayout.SOUTH của settingFrame
    JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    topPanel.add(titleLabel);
    settingFrame.add(topPanel, BorderLayout.NORTH);

    JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JButton backButton = new JButton("Quay lại");
    backButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            settingFrame.dispose(); // Đóng frame hiện tại
        }
    });
    bottomPanel.add(backButton);
    settingFrame.add(bottomPanel, BorderLayout.SOUTH);

    settingFrame.setVisible(true);
    }

    private void showScoreFrame() throws IOException {
       
        // Đường dẫn đến tệp chứa điểm số
        String filePath = "C:\\Users\\acer\\foldername\\Data.txt";

        // Đọc điểm số từ tệp và sắp xếp chúng
        ArrayList<String> scoreArrayList = readScoresFromFile(filePath);
        Collections.sort(scoreArrayList, Collections.reverseOrder());

        // Tạo một JFrame mới để hiển thị điểm số
        JFrame settingFrame = new JFrame("Game Scores");    
        // Tạo DefaultListModel để chứa điểm số
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String score : scoreArrayList) {
            listModel.addElement(score);
        }

        // Tạo JList từ DefaultListModel
        scoreList = new JList<>(listModel);

        // Thêm JList vào JScrollPane để hỗ trợ cuộn nếu danh sách quá dài
        JScrollPane scrollPane = new JScrollPane(scoreList);

        // Thêm JScrollPane vào JFrame
        settingFrame.setLayout(new BoxLayout(settingFrame.getContentPane(), BoxLayout.Y_AXIS));
        settingFrame.add(scrollPane);

         JButton backButton = new JButton("Quay lại");                         
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingFrame.dispose(); // Đóng frame hiện tại
            }
        });
        settingFrame.add(backButton);
        settingFrame.setSize(380, 420);
        settingFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Đóng frame này khi đóng frame mới
        settingFrame.setVisible(true); 
        settingFrame.setLocationRelativeTo(null);
    }

    private ArrayList<String> readScoresFromFile(String filePath) throws IOException {
        BufferedReader br = null;
        ArrayList<String> scoreList = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                scoreList.add(line);
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }

        return scoreList;
    }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu menu = new Menu();                              
                menu.setTitle("Pacman");
                menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
                menu.setSize(380, 420);
                menu.setLocationRelativeTo(null);
                menu.setVisible(true); 
           
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnStart;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
