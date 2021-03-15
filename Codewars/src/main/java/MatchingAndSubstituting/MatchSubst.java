package MatchingAndSubstituting;

public class MatchSubst {
    public static String change(String s, String prog, String version) {
        int indexOfVer = s.indexOf("Version:");
        String ver = s.substring(indexOfVer + 8, indexOfVer + 13).trim();
        boolean isVerValid = ver.matches("[0-9]+.[0-9]+");

        int indexOfPhone = s.indexOf("Phone:");
        String phone = s.substring(indexOfPhone + 6 ,indexOfPhone + 23).trim();
        boolean isPhoneValid = phone.matches("^\\+1-[0-9]{3}-[0-9]{3}-[0-9]{4}$");

        if (!isVerValid || !isPhoneValid) {
            return "ERROR: VERSION or PHONE";
        }
        String newVer = (!ver.equals("2.0")) ? version : "2.0";

        StringBuilder result = new StringBuilder("");
        result.append("Program: ").append(prog).append(" Author: g964 ").append("Phone: +1-503-555-0090 ")
                .append("Date: 2019-01-01 ").append("Version: ").append(newVer);

        return result.toString();
    }
}
