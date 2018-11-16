package com.hgcode.collection;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.junit.Test;

import java.text.ParseException;
import java.util.Date;

public class HashSetDemo {

    public static void main(String[] args) throws ParseException {
        Date date= DateUtils.parseDate("2018-09-25 12:12:12","yyyy-MM-dd HH:mm:ss");
        Date date2= DateUtils.parseDate("2018-09-25 13:13:12","yyyy-MM-dd HH:mm:ss");
        System.out.println(DurationFormatUtils.formatPeriod(date.getTime(),date2.getTime(),"s"));

    }

    @Test
    public void test2(){
       Double b=1D;
       String[] strings=StringUtils.split(b.toString(),".");
        System.out.println(strings[1].length());
    }
}
