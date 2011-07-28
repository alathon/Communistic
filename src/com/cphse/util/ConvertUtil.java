/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cphse.util;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Calendar;


public class ConvertUtil {
    public static byte[] inputStreamToByteArray(InputStream in) throws IOException {
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        int c = -1;
        try {
            while ((c = in.read()) != -1) {
                bs.write((byte) c);
            }
        } finally {
            in.close();
        }

        return bs.toByteArray();
    }
    public static String inputStreamToString(InputStream in) throws IOException {
        Writer writer = new StringWriter();

        char[] buffer = new char[1024];
        try {
            Reader reader = new BufferedReader(
                    new InputStreamReader(in, "UTF-8"));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
        } finally {
            if (in != null)
                in.close();
        }
        return writer.toString();
    }

    public static String zeroFill(int num) {
        if (num < 10)
            return "0"+num;
        return ""+num;
    }
    /**
     * Dirty hack because of the dates in couch being 2011-00-01 = 1. jan (notice: because of view def mistake)
     * @return
     */
    public static String cal2CouchDate(Calendar c) {
        return String.format("%s-%s-%s",
                c.get(Calendar.YEAR),
                zeroFill(c.get(Calendar.MONTH)),
                zeroFill(c.get(Calendar.DATE)));
    }

	/**
	 * Return trimmed and uniform version of string
	 */
	public static String stringKey(String string) {
		if (string == null) return "";
		return string.trim().toLowerCase().replaceAll(" ","");
	}
	/**
	 * Return trimmed and uniform version of string
	 */
	public static boolean  stringKeyCompare(String str1,String str2) {
		return stringKey(str1).equals(stringKey(str2));
	}

}
