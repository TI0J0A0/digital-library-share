package com.digital.library.share.repository;

import com.digital.library.share.model.AccessRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AccessRequestRepository extends JpaRepository<AccessRequest, Long> {
  List<AccessRequest> findByStatus(AccessRequest.Status status);
}
