package com.hgyr.nonsan_message.data.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

/**
 * DB table Message
 * id : auto_increment 고유번호
 * sendId : 발송아이디
 * receiveId : 수신아이디
 * title : 제목
 * content : 내용
 * sendDate : 발신시간
 * readStatus : 읽음 상태 (정렬용도 사용 예정)
 * deleteStatus : 휴지통 삭제(삭제 목록으로 보여주기 위한 임시 값)
 * **/

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table
public class SendMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank
    private String sendId;

    @Column(nullable = false)
    @NotBlank
    private String receiveId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, length = 1000)
    private String content;

    @CreationTimestamp
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime sendDate;

    @Column
    private boolean readStatus;

    @Column
    private boolean archiveStatus;


}
