package com.enchds.regional_indication;

import java.util.Scanner;

public class RegionalIndicatorA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (args.length == 0) {
            System.out.print("What string would you like to convert? (2,000 chars or less) ");
            String str = s.nextLine().toUpperCase();
            char currentLetter = 0x41;
            for (; currentLetter <= 0x40 + 26; currentLetter++) {
                str = str.replace(new String(new char[] {currentLetter}),
                        ":regional_indicator_" + (char) (currentLetter + 0x20) + ":");
            }
            System.out.println(str);
            RegionalIndicatorJ.setSysClipboardText(str);
            System.out.println("Text copied to system clipboard.");
        } else {
            System.out.print("What string would you like to decode? ");
            String str = s.nextLine();
            str = str.replaceAll(":united_nations:", "un");
            str = str.replaceAll(":regional_indicator_", "");
            str = str.replaceAll(":flag_", "");
            char currentLetter = 0x61;
            for (; currentLetter <= 0x60 + 26; currentLetter++) {
                str = str.replaceAll(currentLetter + ":", new String(new char[] {currentLetter}));
                str = str.replaceAll(new String(new char[] {'\uD83C', (char) (currentLetter - 0x61 + (int) '\uDDE6')}),
                        new String(new char[] {currentLetter}));
            }
            System.out.println(str);
            RegionalIndicatorJ.setSysClipboardText(str);
            System.out.println("Text copied to system clipboard.");
        }
    }
}