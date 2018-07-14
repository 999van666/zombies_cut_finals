package zombi_cut;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Player {

    private double x;
    private double y;
    private double w;
    private double h;
    private int speed;

    public static boolean up;
    public static boolean down;
    public static boolean left;
    public static boolean right;

    private int i_anim;//cчетчик кадров
    ArrayList <String> r_list =new  ArrayList<>();//движ в право
    ArrayList <String> l_list =new  ArrayList<>();//движ в лево
    private String s;


  //  Image img = new ImageIcon("animations/anim_woodcutter_stand/anim_woodcutter_stand.png").getImage();

    public Player(){
x=1000;
    y=300;
    w=142;
    h=229;

    up=false;
        down=false;
        left=false;
        right=false;

        r_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_001.png");
        r_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_002.png");
        r_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_003.png");
        r_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_004.png");
        r_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_005.png");
        r_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_006.png");
        r_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_007.png");
        r_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_008.png");
        r_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_009.png");

        l_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_001.png");
        l_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_002.png");
        l_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_003.png");
        l_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_004.png");
        l_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_005.png");
        l_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_006.png");
        l_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_007.png");
        l_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_008.png");
        l_list.add("animations/anim_woodcutter_woodcut/output/anim_woodcutter_woodcut_009.png");

        i_anim = 0;
    }
    public double getX() {return x;}
    public double getY() {return y;}
    public double getW() {return w;}
    public double getH() {return h;}


    public void update(){

        if(!left && !right) {
            i_anim = 0;
            s = "animations/anim_woodcutter_stand/anim_woodcutter_stand.png";
        }

        if (Panel.easy) speed=5;
        if (Panel.norm) speed=2;
        if (Panel.hard) speed=1;
        if (up && y>10){
            y-=speed;
        }
        if (down && y<Panel.HEIGHT-h){
            y+=speed;
        }
        if (left && y>0){
            x-=speed;

            i_anim++;
           if (i_anim>=l_list.size()) i_anim=0;
           s=l_list.get(i_anim);
        }
        if (right && y<Panel.WIDTH-w){
            x+=speed;
            i_anim++;
            if (i_anim>=r_list.size()) i_anim=0;
            s=r_list.get(i_anim);


        }
    }
    public void  draw (Graphics2D g){


        g.drawImage(new ImageIcon(s).getImage(),(int)x,(int)y, null);
        
    }
}