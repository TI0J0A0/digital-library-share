package com.digital.library.share.repository;

import com.digital.library.share.model.FileItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileItemRepository extends JpaRepository<FileItem, String> { }
