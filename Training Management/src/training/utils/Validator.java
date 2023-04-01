package training.utils;

public class Validator {

    public boolean isvalidDate(int d, int m, int y) {
        if (d < 0 || d > 31 || m < 1 || m > 12 || y < 1) {
            return false;
        }
        int maxD = 31;
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            maxD = 30;
        } else if (m == 2) {
            if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
                maxD = 29;
            } else {
                maxD = 28;
            }
        }
        return d < maxD;
    }

    public boolean isvalidEmail(String email) {
        String[] emailDomain = {"@gmail.com", "@fpt.edu.vn", "@yahoo.com"};
        for (String i : emailDomain) {
            if (email.endsWith(i)) {
                return true;
            }
        }
        return false;
    }

    public boolean isvalidMark(double mark) {
        if (mark < 0 || mark > 10) {
            return false;
        }

        return true;
    }

    public boolean birthDate(String birthDate) {
        int[] date = new int[3];
        int i = 0;
        try {
            for (String w : birthDate.split("/")) {
                date[i++] = Integer.parseInt(w);

            }

        } catch (Exception e) {
            return false;
        }

        return isvalidDate(date[0], date[1], date[2]);
    }
}
