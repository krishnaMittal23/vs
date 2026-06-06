package com.vs.contentservice.model;

//tracks the video processing lifecycle
//flow : pending->uploaded->encoding->ready/failed

public enum VideoStatus {
    PENDING,
    UPLOADED,
    ENCODING,
    ENCODED,
    READY,
    FAILED
}
