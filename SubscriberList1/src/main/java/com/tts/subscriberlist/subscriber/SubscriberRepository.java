package com.tts.subscriberlist.subscriber;
import org.springframework.data.repository.CrudRepository;

//import com.sun.tools.javac.comp.Subscriber;

public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {
//	 @Query("SELECT t FROM Subscriber t WHERE t.lastName = 'Johnson'")
//	    public List<Subscriber> findById();
	
//	@Query(value = "SELECT * FROM Subscriber t WHERE " +
            //"LOWER(t.firstName) LIKE LOWER(CONCAT('%','Johnson', '%')))", [testing search value]
//            "LOWER(t.lastName) LIKE LOWER(CONCAT('%',:searchTerm, '%'))",
//            nativeQuery = true)
//	List<Subscriber> findBySearchTermNative(@Param("searchTerm") String searchTerm);
	
}