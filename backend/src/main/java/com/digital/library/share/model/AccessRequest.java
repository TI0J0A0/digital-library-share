package com.digital.library.share.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "access_requests")
public class AccessRequest {
  public enum Status { PENDING, APPROVED, DENIED }

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String email;
  private String reason;

  @Enumerated(EnumType.STRING)
  private Status status = Status.PENDING;

  @Column(nullable = false)
  private Instant requestedAt = Instant.now();

  // getters & setters
}
