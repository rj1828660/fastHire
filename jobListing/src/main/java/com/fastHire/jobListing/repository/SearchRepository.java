package com.fastHire.jobListing.repository;

import com.fastHire.jobListing.models.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
