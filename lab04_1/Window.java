package lab04_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;



public class Window {
    private int top=5;
    private int left=5;

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "Window{" +
                "top=" + top +
                ", left=" + left +
                '}';
    }

    public void DrawWindow(){
        System.out.println(top+" - "+left);
    }
}
