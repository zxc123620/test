package Demo03AbstractFactory.Factory;

import Demo03AbstractFactory.ButtonPac.ButtonImpl;
import Demo03AbstractFactory.TextComPac.TextCombineImpl;
import Demo03AbstractFactory.TextPac.TextImpl;

/*
    该接口是创建产品的工厂，一共有三个产品：button  text  combinetext
 */
public interface CreateFactory {
    public ButtonImpl createButton();
    public TextCombineImpl createTextCombine();
    public TextImpl createText();
}
