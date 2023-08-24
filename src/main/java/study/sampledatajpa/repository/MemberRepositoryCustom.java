package study.sampledatajpa.repository;

import study.sampledatajpa.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {
    List<Member> findMemberCustom();
}
