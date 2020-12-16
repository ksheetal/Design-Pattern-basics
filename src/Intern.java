
/*
 * @created 16/12/2020 - 2:23 PM
 * @project Oops
 * @author  sheetalkumar
 */

public class Intern extends User implements canApplyForLeave{

    private Integer stipend;
    private String duration;
    private String collegeName;
    private boolean isFullTime;


    public Integer getStipend() {
        return stipend;
    }

    public void setStipend(Integer stipend) {
        this.stipend = stipend;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    @Override
    public String canApplyForLeave(Integer days) {
        System.out.println("In Intern");
        return null;
    }
}
