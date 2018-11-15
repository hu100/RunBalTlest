package com.toly1994.runbaltlest.view;

/**
 * 作者：张风捷特烈<br/>
 * 时间：2018/11/11 0011:6:13<br/>
 * 邮箱：1981462002@qq.com<br/>
 * 说明：小球封装类
 */
public class Ball implements Cloneable {
    public float aX;//加速度
    public float aY;//加速度Y
    public float vX;//速度X
    public float vY;//速度Y
    public float x;//点位X
    public float y;//点位Y
    public int color;//颜色
    public float r;//半径


    public Ball clone() {
        Ball clone = null;
        try {
            clone = (Ball) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
