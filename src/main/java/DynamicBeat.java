import javax.swing.*;
import java.awt.*;

public class DynamicBeat extends JFrame {
    private Image screenImage;
    private Graphics screenGraphic;

    private Image introBackground;

    public DynamicBeat() {
        setTitle("Dynamic Beat");                             // 프로그램의 제목을 설정
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);       // 가로 세로 크기 지정
        setResizable(false);                                  // 화면의 크기를 변경할 수 없음
        setLocationRelativeTo(null);                          // 프로그램 실행 시 화면 정중앙에 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // 창을 종료하면 프로그램이 종료됨
        setVisible(true);                                     // 프로그램 창이 화면이 보이게 됨.

        introBackground = new ImageIcon(Main.class.getResource("./images/intro.jpg"))
                                            .getImage(); // 이미지 경로를 가져옴.
    }

    public void paint(Graphics g) {
        // paint() Component 는 컴포넌트에 그림을 그리기 위한 것으로 클래스에 정의되어 있어서 모든 컴포넌트에서 사용할 수 있다

        screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);   //입력된 사이즈의 이미지를 만들어라
        screenGraphic = screenImage.getGraphics();                          //screenImage 이미지를 통해 그래픽 객체 생성
        screenDraw(screenGraphic);                                          //
        g.drawImage(screenImage, 0, 0, null);                   //0,0 위치에 그림을 그려라
    }

    private void screenDraw(Graphics g) {   //컴포넌트를 화면에 다시 그려준다.
        g.drawImage(introBackground, 0, 0, null);  //introBackground 이미지를 screenImage 이미지에 그려라
        this.repaint(); // 이미지를 프로그램이 종료할때까지 계속 그림
    }

}
