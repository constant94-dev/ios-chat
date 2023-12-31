package com.leanly.mobile.chat.repository;

import com.leanly.mobile.chat.model.entity.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FriendRepository extends JpaRepository<Friend, Long> {

    @Query(value = "select f from Friend f where f.fromMemberId = :fromMemberId")
    Friend findFromMember(@Param("fromMemberId") Long fromMemberId);
}
