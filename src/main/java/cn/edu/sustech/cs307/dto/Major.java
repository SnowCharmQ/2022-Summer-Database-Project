package cn.edu.sustech.cs307.dto;

public class Major {
    public int id;
    public String name;
    public Department department;

    @Override
    public String toString() {
        return "Major{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
