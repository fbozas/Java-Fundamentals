package gr.aueb.cf.ch15;

/*
 *   A simple Point Java Bean
 *
 * @version: 0.1
 * @since: 0.1
 * @author: Panos
 */
public class Point {
    private int x;
    private int y;

    public Point(){}

    public Point(int x){
        this.x = x;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }

    public void setX(int x) { this.x = x; }

    public int getY() {  return y; }

    public void setY(int y) { this.y = y; }

    public  String convertToString(){
        return "(" + x + ")";
    }

    public void movePlusOne(){
        x += 1;
    }

    public void movePlus10(){
        // x += 10;
        // self-use
        for(int i = 1; i <= 10; i++){
            movePlusOne();
        }
    }

    private void reset(){
        x = 0;
    }
}
