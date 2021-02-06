package com.zonief.restapi.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ClientDto {

    private final String firstName;
    private final String lastName;

}
