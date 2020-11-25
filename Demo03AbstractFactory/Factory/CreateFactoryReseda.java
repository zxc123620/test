package Demo03AbstractFactory.Factory;

import Demo03AbstractFactory.ButtonPac.ButtonImpl;
import Demo03AbstractFactory.ButtonPac.ButtonReseda;
import Demo03AbstractFactory.TextComPac.TextComReseda;
import Demo03AbstractFactory.TextComPac.TextCombineImpl;
import Demo03AbstractFactory.TextPac.TextImpl;
import Demo03AbstractFactory.TextPac.TextReseda;

public class CreateFactoryReseda implements CreateFactory{
    @Override
    public ButtonImpl createButton() {
        return new ButtonReseda();
    }

    @Override
    public TextCombineImpl createTextCombine() {
        return new TextComReseda();
    }

    @Override
    public TextImpl createText() {
        return new TextReseda();
    }
}
