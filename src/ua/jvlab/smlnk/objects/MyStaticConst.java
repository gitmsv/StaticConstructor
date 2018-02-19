package ua.jvlab.smlnk.objects;

import java.util.Date;

public class MyStaticConst {

    public static String TODAY;

    static {

        Date dt = new Date();
        if (dt.getDay() == 0) {
            TODAY = "Sunday";
        } else {
            if (dt.getDay() == 1) {
                TODAY = "Monday";
            } else {
                if (dt.getDay() == 2) {
                    TODAY = "Tuesday";
                } else {
                    if (dt.getDay() == 3) {
                        TODAY = "Wednesday";
                    } else {
                        if (dt.getDay() == 4) {
                            TODAY = "Thursday";
                        } else {
                            if (dt.getDay() == 5) {
                                TODAY = "Friday";
                            } else {
                                if (dt.getDay() == 6) {
                                    TODAY = "Saturday";
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
