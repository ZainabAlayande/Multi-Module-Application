package com.example.multimodule.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Patient {

    @Id
    private String id;
    private String name;
    private String phoneNumber;
    private String email;

}
