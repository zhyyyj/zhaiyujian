package com.yjzh.java;

/**
 * @ClassName TestStar
 * @Description TODO
 * @Author zhyyyj
 * @Date 2020/10/9
 **/
public class TestStar {
    public static void main(String[] args) {
        String star = "*";
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.out.print(" " + star);
                System.out.println();
            }
            if (i == 1) {
                for (int z = 0; z < 4; z++) {
                    System.out.print(" " + star);
                }
                System.out.println();
            }
            if (i == 2) {
                System.out.print(" ");
                for (int x = 0; x < 3; x++) {
                    System.out.print(" " + star);
                }
                System.out.println();
            }
            if (i == 3) {
                for (int y = 0; y < 2; y++) {
                    System.out.print(" " + star + " ");
                }
            }
        }
    }
}