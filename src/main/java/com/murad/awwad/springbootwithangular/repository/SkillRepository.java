package com.murad.awwad.springbootwithangular.repository;

import com.murad.awwad.springbootwithangular.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ma_ab on 3/21/2018.
 */
@Repository
public interface SkillRepository extends JpaRepository<Skill,Integer> {
}
