package com.murad.awwad.springbootwithangular.converter;

import com.murad.awwad.springbootwithangular.dto.SkillDto;
import com.murad.awwad.springbootwithangular.entity.Skill;

/**
 * Created by ma_ab on 3/21/2018.
 */
public class SkillConverter {

    public static Skill dtoToEntity(SkillDto skillDto){
        Skill skill = new Skill(skillDto.getSkillName(),null);
        skill.setSkillId(skillDto.getSkillId());
        return skill;
    }

    public static SkillDto entityToDto(Skill skill) {
        return new SkillDto(skill.getSkillId(), skill.getSkillName());
    }

}
