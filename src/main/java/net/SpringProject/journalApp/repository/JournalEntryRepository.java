package net.SpringProject.journalApp.repository;

import net.SpringProject.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository // add repository annotation
public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}
