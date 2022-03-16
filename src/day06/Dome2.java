package day06;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author wanfeng
 * @created 2022/3/16 13:19
 * @package day06
 */
public class Dome2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("save Date");
        jFrame.setBounds(600, 300, 500, 400);
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JLabel label = new JLabel("Enter the data");
        jPanel.add(label);
        JTextArea  userText = new JTextArea (20,20);
        userText.setBounds(100,100,500,350);
        jPanel.add(userText);
        JButton jButton = new JButton("save");
        jButton.setBounds(10, 80, 80, 25);
        // 绑定事件
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handler(userText);
            }
        });
        jPanel.add(jButton);
        jFrame.show();
    }

    /**
     * 数据处理
     */
    public static void handler(JTextArea jTextArea){
        String text = jTextArea.getText();
        String[] users = text.split("/n");
        for(String user:users){
            System.out.println(user);
        }
    }
}
