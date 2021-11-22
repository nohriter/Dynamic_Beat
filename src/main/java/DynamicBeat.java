import javax.swing.*;

public class DynamicBeat extends JFrame {

    public DynamicBeat() {
        setTitle("Dynamic Beat");                             // 프로그램의 제목을 설정
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);       // 가로 세로 크기 지정
        setResizable(false);                                  // 화면의 크기를 변경할 수 없음
        setLocationRelativeTo(null);                          // 프로그램 실행 시 화면 정중앙에 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // 창을 종료하면 프로그램이 종료됨
        setVisible(true);                                     // 프로그램 창이 화면이 보이게 됨.
    }

}
