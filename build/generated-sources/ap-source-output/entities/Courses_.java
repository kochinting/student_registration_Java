package entities;

import entities.Students;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T10:57:18")
@StaticMetamodel(Courses.class)
public class Courses_ { 

    public static volatile SingularAttribute<Courses, String> courseName;
    public static volatile CollectionAttribute<Courses, Students> studentsCollection;
    public static volatile SingularAttribute<Courses, Integer> courseId;
    public static volatile SingularAttribute<Courses, String> courseDescription;

}