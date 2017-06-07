/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author TimKo
 */
@Entity
@Table(name = "students_courses", catalog = "student_registration_final_db", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StudentsCourses.findAll", query = "SELECT s FROM StudentsCourses s")
    , @NamedQuery(name = "StudentsCourses.findByStudentId", query = "SELECT s FROM StudentsCourses s WHERE s.studentsCoursesPK.studentId = :studentId")
    , @NamedQuery(name = "StudentsCourses.findByCourseId", query = "SELECT s FROM StudentsCourses s WHERE s.studentsCoursesPK.courseId = :courseId")})
public class StudentsCourses implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StudentsCoursesPK studentsCoursesPK;

    public StudentsCourses() {
    }

    public StudentsCourses(StudentsCoursesPK studentsCoursesPK) {
        this.studentsCoursesPK = studentsCoursesPK;
    }

    public StudentsCourses(int studentId, int courseId) {
        this.studentsCoursesPK = new StudentsCoursesPK(studentId, courseId);
    }

    public StudentsCoursesPK getStudentsCoursesPK() {
        return studentsCoursesPK;
    }

    public void setStudentsCoursesPK(StudentsCoursesPK studentsCoursesPK) {
        this.studentsCoursesPK = studentsCoursesPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentsCoursesPK != null ? studentsCoursesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentsCourses)) {
            return false;
        }
        StudentsCourses other = (StudentsCourses) object;
        if ((this.studentsCoursesPK == null && other.studentsCoursesPK != null) || (this.studentsCoursesPK != null && !this.studentsCoursesPK.equals(other.studentsCoursesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.StudentsCourses[ studentsCoursesPK=" + studentsCoursesPK + " ]";
    }
    
}
