package io.github.laowengs.kafka.delay.queue.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResponseCode {

    /**
     *
     */
    SUCCESS(0,"Success"),
    ERROR(-1,"system error"),

    ;

    private final int code;
    private final String message;


}
