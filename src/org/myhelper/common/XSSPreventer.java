package org.myhelper.common;

/** 
* This class gives various way to prevent you from XSS attack.
*
* @author Hung M. Nguyen
* @since 03/25/2017 
*/
public class XSSPreventer {
    /**
    * Encode special characters to prevent XS
    *
    * @author Hung M. Nguyen
    * @since 03/25/2017
    * @param value - A string need to encode
    * @return A string encoded
    */
    public static String encodeForHTML(final String value) {
        StringBuilder sb = new StringBuilder();
        for (char item : value.toCharArray()) {
            if (item == Variables.AND_CHAR) {
                sb.append(Variables.AND_CHAR_ENCODED);
                continue;
            }

            if (item == Variables.GT_CHAR) {
                sb.append(Variables.GT_CHAR_ENCODED);
                continue;
            }

            if (item == Variables.LT_CHAR) {
                sb.append(Variables.LT_CHAR_ENCODED);
                continue;
            }

            if (item == Variables.QUOT_CHAR) {
                sb.append(Variables.QUOT_CHAR_ENCODED);
                continue;
            }

            if (item == Variables.SLASH_CHAR) {
                sb.append(Variables.SLASH_CHAR_ENCODED);
                continue;
            }

            sb.append(item);
        }
        return sb.toString();
    }
}