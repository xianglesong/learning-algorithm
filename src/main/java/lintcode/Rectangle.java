package lintcode;

/**
 * Created by rollin on 17/11/15.
 *
 * 454. 矩阵面积 实现一个矩阵类Rectangle，包含如下的一些成员变量与函数：
 *
 * 两个共有的成员变量 width 和 height 分别代表宽度和高度。 一个构造函数，接受2个参数 width 和 height 来设定矩阵的宽度和高度。 一个成员函数
 * getArea，返回这个矩阵的面积。
 */
public class Rectangle {
    /*
     * Define two public attributes width and height of type int.
     */
    // write your code here

    /*
     * Define a constructor which expects two parameters width and height here.
     */
    // write your code here

    /*
     * Define a public method `getArea` which can calculate the area of the
     * rectangle and return.
     */
    // write your code here

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return this.width * this.height;
    }
}
