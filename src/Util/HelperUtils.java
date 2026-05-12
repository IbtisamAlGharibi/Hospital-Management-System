package Util;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class HelperUtils {
   public boolean isNull(Object obj){
       if (obj == null){
           return true;
       }
       return false;
   }

   public boolean isNull(String str){
       if (str == null && str.isEmpty()){
           return true;
       }
       return false;
   }

   public boolean isNotNull(Object obj){
       if (!(obj == null)){
           return true;
       }
       return false;
   }
   public boolean isNotNull(String str){
       if (!(str == null && str.isEmpty())){
           return true;
       }
       return false;
   }

   public boolean isValidString(String str){
       if (str == null && str.isEmpty()){
           return true;
       }
       return false;
   }

   public boolean isValidString(String str, int minLength){
       if (str.length() >= minLength){
           return true;
       }
       return false;
   }
    public boolean isValidString(String str, int minLength, int maxLength){
        if (str.length() >= minLength && str.length() <= maxLength){
            return true;
        }
        return false;
    }
    public boolean isValidString(String str, String regex){
        if (str.equals(regex)){
            return true;
        }
        return false;
    }
    public String generateId(){
        return UUID.randomUUID().toString();
    }
    public String generateId(String prefix){
        Random random = new Random();
        int number = 10000 + random.nextInt(90000);
        return prefix + "-" + number;
    }

    public static String generateId(String prefix, int length) {
        Random random = new Random();
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < length; i++) {
            number.append(random.nextInt(10));
        }

        return prefix + "-" + number;
    }

    public static String generateId(String prefix, String suffix) {
        return prefix + "-" + suffix;
    }
    public boolean isValidDate(Date date){
       if (!(date == null)){
           return true;
       }
       return false;
    }
    public static boolean isValidDate(String dateStr) {
        if (dateStr == null || !dateStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return false;
        }
        return true;
    }
    public boolean isValidDate(Date date, Date minDate, Date maxDate) {
        if (date.compareTo(minDate) >= 0 && date.compareTo(maxDate) <= 0) {
            return true;
        }
        return false;
    }

    public static boolean isFutureDate(Date date) {
        return date.compareTo(new Date()) > 0;
    }
}
