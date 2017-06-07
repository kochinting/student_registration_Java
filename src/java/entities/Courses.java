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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "courses", catalog = "student_registration_final_db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Courses.findAll", query = "SELECT c FROM Courses c")
    , @NamedQuery(name = "Courses.findByCourseId", query = "SELECT c FROM Courses c WHERE c.courseId = :courseId")
    , @NamedQuery(name = "Courses.findByCourseName", query = "SELECT c FROM Courses c WHERE c.courseName = :courseName")
    , @NamedQuery(name = "Courses.findByCourseDescription", query = "SELECT c FROM Courses c WHERE c.courseDescription = :courseDescription")})
public class Courses implements Serializable {

    @JoinTable(name = "students_courses", joinColumns = {
        @JoinColumn(name = "course_id", referencedColumnName = "course_id")}, inverseJoinColumns = {
        @JoinColumn(name = "student_id", referencedColumnName = "student_id")})
    @ManyToMany
    private Collection<Students> studentsCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "course_id")
    private Integer courseId;
    @Size(max = 45)
    @Column(name = "course_name")
    private String courseName;
    @Size(max = 45)
    @Column(name = "course_description")
    private String courseDescription;

    public Courses() {
    }

    public Courses(Integer courseId) {
        this.courseId = courseId;
    }
    
    public Courses(Integer courseId, Collection<Students> studentsCollection) {
        this.courseId = courseId;
        this.studentsCollection= studentsCollection;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseId != null ? courseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Courses)) {
            return false;
        }
        Courses other = (Courses) object;
        if ((this.courseId == null && other.courseId != null) || (this.courseId != null && !this.courseId.equals(other.courseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Courses[ courseId=" + courseId + " ]";
    }

    @XmlTransient
    public Collection<Students> getStudentsCollection() {
        return studentsCollection;
    }

    public void setStudentsCollection(Collection<Students> studentsCollection) {
        this.studentsCollection = studentsCollection;
    }
    
}
