/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author GIGABYTE
 */
public class Request {
    private int id;
    private int apartment_id;
    private int user_id;
    private String request_type;
    private String description;
    private String status;
    private Date request_date;
    private Date approval_date;
    private int approved_by;
    private int assigned_to;
    private String comments;
    private Date completion_date;
    private String employee_comments;

    public Request() {
    }

    public Request(int id, int apartment_id, int user_id, String request_type, String description, String status, Date request_date, Date approval_date, int approved_by, int assigned_to, String comments, Date completion_date, String employee_comments) {
        this.id = id;
        this.apartment_id = apartment_id;
        this.user_id = user_id;
        this.request_type = request_type;
        this.description = description;
        this.status = status;
        this.request_date = request_date;
        this.approval_date = approval_date;
        this.approved_by = approved_by;
        this.assigned_to = assigned_to;
        this.comments = comments;
        this.completion_date = completion_date;
        this.employee_comments = employee_comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartment_id() {
        return apartment_id;
    }

    public void setApartment_id(int apartment_id) {
        this.apartment_id = apartment_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getRequest_type() {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequest_date() {
        return request_date;
    }

    public void setRequest_date(Date request_date) {
        this.request_date = request_date;
    }

    public Date getApproval_date() {
        return approval_date;
    }

    public void setApproval_date(Date approval_date) {
        this.approval_date = approval_date;
    }

    public int getApproved_by() {
        return approved_by;
    }

    public void setApproved_by(int approved_by) {
        this.approved_by = approved_by;
    }

    public int getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(int assigned_to) {
        this.assigned_to = assigned_to;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCompletion_date() {
        return completion_date;
    }

    public void setCompletion_date(Date completion_date) {
        this.completion_date = completion_date;
    }

    public String getEmployee_comments() {
        return employee_comments;
    }

    public void setEmployee_comments(String employee_comments) {
        this.employee_comments = employee_comments;
    }

    @Override
    public String toString() {
        return "Request{" + "id=" + id + ", apartment_id=" + apartment_id + ", user_id=" + user_id + ", request_type=" + request_type + ", description=" + description + ", status=" + status + ", request_date=" + request_date + ", approval_date=" + approval_date + ", approved_by=" + approved_by + ", assigned_to=" + assigned_to + ", comments=" + comments + ", completion_date=" + completion_date + ", employee_comments=" + employee_comments + '}';
    }   
}
