package com.fastHire.jobListing.repository;

import com.fastHire.jobListing.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
