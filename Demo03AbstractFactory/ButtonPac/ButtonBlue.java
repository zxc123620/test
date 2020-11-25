package Demo03AbstractFactory.ButtonPac;

public class ButtonBlue implements ButtonImpl{
    @Override
    public void showButton() {
        System.out.println("展示蓝色按钮");
    }
}
