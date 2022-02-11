package entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "driver")
public class Driver implements Serializable {

    @Id
    @Column(nullable = false)
    int id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "address",nullable = false)
    String address;

    @Column( name = "phone",nullable = false)
    String phone;

    @Column(name = "skill_level",nullable=false)
    String skill;

}

