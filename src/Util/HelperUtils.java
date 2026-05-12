package Util;

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
}
