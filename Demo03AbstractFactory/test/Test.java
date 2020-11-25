package Demo03AbstractFactory.test;

import Demo03AbstractFactory.ButtonPac.ButtonImpl;
import Demo03AbstractFactory.TextComPac.TextCombineImpl;
import Demo03AbstractFactory.TextPac.TextImpl;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Map<String, String> map = getMessage();
        show(map);
    }

    private static void show(Map<String, String> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            try {
                Class c = Class.forName(map.get(key));
                Constructor con = c.getConstructor();
                Object o = con.newInstance();
                if(key.equals("Button")){
                    ButtonImpl bu = (ButtonImpl)o;
                    bu.showButton();
                }
                else if(key.equals("Text")){
                    TextImpl te = (TextImpl)o;
                    te.showText();
                }
                else if(key.equals("TextCom")){
                    TextCombineImpl tec = (TextCombineImpl)o;
                    tec.showTextCombine();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static Map<String, String> getMessage() {
        File f = new File("src/Demo03AbstractFactory","prop.properties");
        Properties pro = new Properties();
        Map<String, String> map = new HashMap<>();
        try(Reader reader = new FileReader(f)){
            pro.load(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
        Set<Object> keys = pro.keySet();
        for (Object key : keys) {
            map.put((String)key, pro.getProperty((String)key));
        }
        return map;
    }
}
