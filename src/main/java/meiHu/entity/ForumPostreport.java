package meiHu.entity;

import java.util.Date;

public class ForumPostreport {
    private Integer reportid;
    private Integer uid ;
    private ForumUser user;
    private ForumPost post;
    private Integer pid ;
    private String reportreason;
    private Date reporttime;

    public ForumPostreport() {
    }

    public ForumUser getUser() {
        return user;
    }

    public void setUser(ForumUser user) {
        this.user = user;
    }

    public ForumPost getPost() {
        return post;
    }

    public void setPost(ForumPost post) {
        this.post = post;
    }

    public Date getReporttime() {
        return reporttime;
    }

    public void setReporttime(Date reporttime) {
        this.reporttime = reporttime;
    }

    public Integer getReportid() {
        return reportid;
    }

    public void setReportid(Integer reportid) {
        this.reportid = reportid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getReportreason() {
        return reportreason;
    }

    public void setReportreason(String reportreason) {
        this.reportreason = reportreason;
    }

    public ForumPostreport(Integer uid, Integer pid, String reportreason) {
        this.uid = uid;
        this.pid = pid;
        this.reportreason = reportreason;
    }
}