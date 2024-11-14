package com.example.hobbyheavy.dto.response;

import com.example.hobbyheavy.entity.Hobby;
import com.example.hobbyheavy.entity.Meetup;
import lombok.Getter;

@Getter
public class MeetupListResponse {

    private final Long meetupId;
    private final String meetupName;
    private final String location;
    private final String hobby;

    public MeetupListResponse(Meetup meetup){
        this.meetupId = meetup.getMeetupId();
        this.meetupName = meetup.getMeetupName();
        this.location = meetup.getLocation();
        this.hobby = meetup.getHobby().getHobbyName();
    }
}