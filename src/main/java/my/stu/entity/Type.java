package my.stu.entity;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

/**
 * @author: Jean
 * @date: 2021/6/1 22:28
 * @description:
 */


@Entity
@Table(name= "type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer type_id;

    @Column(name="type_name")
    private String type_name;

    @Column(name="type_remark")
    private String type_remark;

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getType_remark() {
        return type_remark;
    }

    public void setType_remark(String type_remark) {
        this.type_remark = type_remark;
    }
}
