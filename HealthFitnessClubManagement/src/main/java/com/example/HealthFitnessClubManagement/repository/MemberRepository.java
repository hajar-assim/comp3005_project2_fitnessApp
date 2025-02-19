package com.example.HealthFitnessClubManagement.repository;

import com.example.HealthFitnessClubManagement.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}

