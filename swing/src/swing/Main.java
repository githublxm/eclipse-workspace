package swing;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // 1. ����һ���������������ڣ�
        JFrame jf = new JFrame("���Դ���");          // ��������
        jf.setSize(250, 250);                       // ���ô��ڴ�С
        jf.setLocationRelativeTo(null);             // �Ѵ���λ�����õ���Ļ����
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // ��������ڵĹرհ�ťʱ�˳�����û����һ�䣬���򲻻��˳���

        // 2. �����м����������������
        JPanel panel = new JPanel();                // �������������ʹ��Ĭ�ϵĲ��ֹ�����

        // 3. ����һ�������������ť��������ӵ� ������� ��
        JButton btn = new JButton("���԰�ť");
        panel.add(btn);

        // 4. �� ������� ��Ϊ���ڵ�������� ���õ� ����
        jf.setContentPane(panel);

        // 5. ��ʾ���ڣ�ǰ�洴������Ϣ�����ڴ��У�ͨ�� jf.setVisible(true) ���ڴ��еĴ�����ʾ����Ļ�ϡ�
        jf.setVisible(true);
    }

}
