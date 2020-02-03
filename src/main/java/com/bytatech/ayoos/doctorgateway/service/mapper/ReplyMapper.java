package com.bytatech.ayoos.doctorgateway.service.mapper;

import com.bytatech.ayoos.doctorgateway.client.doctor.model.*;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Reply} and its DTO {@link ReplyDTO}.
 */
@Mapper(componentModel = "spring", uses = {UserRatingReviewMapper.class})
public interface ReplyMapper extends EntityMapper<ReplyDTO, Reply> {

    @Mapping(source = "userRatingReview.id", target = "userRatingReviewId")
    ReplyDTO toDto(Reply reply);

    @Mapping(source = "userRatingReviewId", target = "userRatingReview")
    Reply toEntity(ReplyDTO replyDTO);

    default Reply fromId(Long id) {
        if (id == null) {
            return null;
        }
        Reply reply = new Reply();
        reply.setId(id);
        return reply;
    }
}
