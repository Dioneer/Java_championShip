package main.annotation;

import java.lang.reflect.Method;
import java.util.Arrays;

@Vertion(info = "3")
public class Main {
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @XML(str = "rt")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        Class<Main> test = Main.class;
        Method[] methods = test.getMethods();
        for (Method item: methods){
            if(item.isAnnotationPresent(XML.class)) {
                XML xml = item.getAnnotation(XML.class);
                System.out.println(xml.str());
            }
        }
        Vertion v = test.getAnnotation(Vertion.class);
        System.out.println(v.info());
    }
}

