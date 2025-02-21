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
}