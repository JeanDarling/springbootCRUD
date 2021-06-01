package my.stu.entity;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

/**
 * @author: Jean
 * @date: 2021/6/1 22:28
 * @description:
 */
@Data
@DynamicInsert
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



}
