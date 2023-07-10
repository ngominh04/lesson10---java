package lab04_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;


public class ListBox extends Window{
    private String content="aaaaaaaaaaa";

    @Override
    public String toString() {
        return "ListBox{" +
                "content='" + content + '\'' +
                "top=" + getTop() +
                ", left=" + getLeft() +
                '}';
    }

    @Override
    public void DrawWindow() {
        System.out.println("ListBox{" +
                "content='" + content + '\'' +
                "top=" + getTop() +
                ", left=" + getLeft() +
                '}');
    }
}
