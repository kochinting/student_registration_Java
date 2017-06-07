package entities;

import entities.Courses;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T10:57:18")
@StaticMetamodel(Students.class)
public class Students_ { 

    public static volatile SingularAttribute<Students, Integer> studentId;
    public static volatile SingularAttribute<Students, String> firstName;
    public static volatile SingularAttribute<Students, String> lastName;
    public static volatile CollectionAttribute<Students, Courses> coursesCollection;

}