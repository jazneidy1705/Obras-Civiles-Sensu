package co.com.ws.sensu.util;

public class ValidateNumbers {

    /**
     * Validar si un numero puede ser convertido a un tipo Long.
     * 
     * @param number
     * @return
     */
    public static boolean isLong(String number) {

	try {
	    Long.parseLong(number);
	    return true;
	} catch (NumberFormatException e) {
	    return false;
	}
    }

    /**
     * convertir un numero String a un tipo Long
     * 
     * @param number
     * @return
     */
    public static Long convertToLong(String number) {
	return Long.parseLong(number);
    }

}
