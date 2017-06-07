/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author TimKo
 */
@Embeddable
public class StudentsCoursesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "student_id")
    private int studentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "course_id")
    private int courseId;

    public StudentsCoursesPK() {
    }

    public StudentsCoursesPK(int studentId, int courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) studentId;
        hash += (int) courseId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StudentsCoursesPK)) {
            return false;
        }
        StudentsCoursesPK other = (StudentsCoursesPK) object;
        if (this.studentId != other.studentId) {
            return false;
        }
        if (this.courseId != other.courseId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.StudentsCoursesPK[ studentId=" + studentId + ", courseId=" + courseId + " ]";
    }
    
}
