package sopt35.skyscanner.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String departure;

    private LocalDateTime dep_time1;

    private LocalDateTime arr_time1;

    private LocalDateTime dep_time2;

    private LocalDateTime arr_time2;

    private float dep_price;

    private float arr_price;

    private String airline;

    private Boolean is_like;

    private int count;

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for departure
    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    // Getter and Setter for dep_time1
    public LocalDateTime getDep_time1() {
        return dep_time1;
    }

    public void setDep_time1(LocalDateTime dep_time1) {
        this.dep_time1 = dep_time1;
    }

    // Getter and Setter for arr_time1
    public LocalDateTime getArr_time1() {
        return arr_time1;
    }

    public void setArr_time1(LocalDateTime arr_time1) {
        this.arr_time1 = arr_time1;
    }

    // Getter and Setter for dep_time2
    public LocalDateTime getDep_time2() {
        return dep_time2;
    }

    public void setDep_time2(LocalDateTime dep_time2) {
        this.dep_time2 = dep_time2;
    }

    // Getter and Setter for arr_time2
    public LocalDateTime getArr_time2() {
        return arr_time2;
    }

    public void setArr_time2(LocalDateTime arr_time2) {
        this.arr_time2 = arr_time2;
    }

    // Getter and Setter for dep_price
    public float getDep_price() {
        return dep_price;
    }

    public void setDep_price(float dep_price) {
        this.dep_price = dep_price;
    }

    // Getter and Setter for arr_price
    public float getArr_price() {
        return arr_price;
    }

    public void setArr_price(float arr_price) {
        this.arr_price = arr_price;
    }

    // Getter and Setter for airline
    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    // Getter and Setter for is_like
    public Boolean getIs_like() {
        return is_like;
    }

    public void setIs_like(Boolean is_like) {
        this.is_like = is_like;
    }

    // Getter and Setter for count
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}