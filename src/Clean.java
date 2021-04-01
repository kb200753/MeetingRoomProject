public class Clean {
    private String time;
    private String timeCode;
    private String cleanerYN;

    public Clean(String time, String timeCode, String cleanerYN) {
        this.time = time;
        this.timeCode = timeCode;
        this.cleanerYN = cleanerYN;


    }



    public String toString() {
        return time + "," + timeCode + ", " + cleanerYN
    }

    public String getTime() {
        return time;
    }

    public String getTimeCode() {
        return timeCode;
    }

    public String getCleanerYN() {
        return cleanerYN;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTimeCode(String timeCode) {
        this.timeCode = timeCode;
    }

    public void setCleanerYN(String cleanerYN) {
        this.cleanerYN = cleanerYN;
    }
}

