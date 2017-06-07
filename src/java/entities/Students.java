/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author TimKo
 */
@Entity
@Table(name = "students", catalog = "student_registration_final_db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Students.findAll", query = "SELECT s FROM Students s")
    , @NamedQuery(name = "Students.findByStudentId", query = "SELECT s FROM Students s WHERE s.studentId = :studentId")
    , @NamedQuery(name = "Students.findByFirstName", query = "SELECT s FROM Students s WHERE s.firstName = :firstName")
    , @NamedQuery(name = "Students.findByLastName", query = "SELECT s FROM Students s WHERE s.lastName = :lastName")})
public class Students implements Serializable {

    @ManyToMany(mappedBy = "studentsCollection")
    private Collection<Courses> coursesCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "student_id")
    private Integer studentId;
    @Size(max = 45)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 45)
    @Column(name = "last_name")
    private String lastName;

    
    public Students() {
    }

    public Students(Integer studentId) {
        this.studentId = studentId;
    }

    public Students(Integer studentId, Collection<Courses> coursesCollection ) {
        this.studentId = studentId;
        this.coursesCollection= coursesCollection;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentId != null ? studentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Students)) {
            return false;
        }
        Students other = (Students) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Students[ studentId=" + studentId + " ]";
    }

    @XmlTransient
    public Collection<Courses> getCoursesCollection() {
        return coursesCollection;
    }

    public void setCoursesCollection(Collection<Courses> coursesCollection) {
        this.coursesCollection = coursesCollection;
    }
    
}
