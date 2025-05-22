package com.digital.library.share.model;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "files")
public class FileItem {
  @Id @GeneratedValue(strategy = GenerationType.UUID)
  private String id;

  private String originalName;
  private String mimeType;
  private long size;

  @Column(nullable = false)
  private String storedPath;

  @Column(nullable = false)
  private Instant uploadedAt = Instant.now();

  // getters & setters
}
