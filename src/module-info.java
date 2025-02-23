/**
 * 
 */
/**
 * 
 */
module First_JPA {
	
    requires java.sql;

	requires jakarta.persistence;
	
	requires org.hibernate.orm.core;

    opens com.jpaproect to org.hibernate.orm.core;
    opens com.inheritacestrategy to org.hibernate.orm.core;
    opens com.mappedsuperclass to org.hibernate.orm.core;
}