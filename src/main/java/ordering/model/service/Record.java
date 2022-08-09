package ordering.model.service;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;


public class Record {

    private String name;
    private String phone;
    private String email;
    private String data;
    private String time;
    private Reminder reminder;

    public Record(){}
    public Record(String name, String phone, String email, String data, String time, Reminder reminder){
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.data = data;
        this.time = time;
        this.reminder = reminder;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPhone (String phone){
        this.phone = phone;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public void setData (String data){
        this.data = data;
    }

    public void setTime (String time){
        this.time = time;
    }
    public void setReminder(Reminder reminder){
        this.reminder = reminder;
    }

    public String getName (){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public String getData(){
        return data;
    }

    public String getTime(){
        return time;
    }

    public Reminder getReminder(){
        return reminder;
    }
}
