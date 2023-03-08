/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java2_lab4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author chung
 */
public class XDate {

  static  SimpleDateFormat sdf = new SimpleDateFormat();

    public static Date checkDate(String text, String pattern) throws ParseException {
        sdf.applyPattern(pattern);
        return sdf.parse(text);

    }
    public static Date checkDate(String txt)throws ParseException
    {
        return XDate.checkDate(txt, "dd-mm-yyyy");
    }
}
