package com.gmailclone.repository;

import com.gmailclone.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {}
