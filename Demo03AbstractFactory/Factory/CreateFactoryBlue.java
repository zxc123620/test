package Demo03AbstractFactory.Factory;

import Demo03AbstractFactory.ButtonPac.ButtonBlue;
import Demo03AbstractFactory.ButtonPac.ButtonImpl;
import Demo03AbstractFactory.TextComPac.TextComBlue;
import Demo03AbstractFactory.TextComPac.TextCombineImpl;
import Demo03AbstractFactory.TextPac.TextBlue;
import Demo03AbstractFactory.TextPac.TextImpl;

public class CreateFactoryBlue implements CreateFactory{
    @Override
    public ButtonImpl createButton() {
        return new ButtonBlue();
    }

    @Override
    public TextCombineImpl createTextCombine() {
        return new TextComBlue();
    }

    @Override
    public TextImpl createText() {
        return new TextBlue();
    }
}
