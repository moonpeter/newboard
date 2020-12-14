package com.moonpeter.admin.todolist.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Todo implements Serializable {
    private static final long serialVersionUID = 947585423656694361L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column
    private String content;

    @Column
    private LocalDateTime createDateTime;

    @Column
    private Boolean isComplete;

    @Builder
    public Todo(Long id, String content, LocalDateTime createDateTime, Boolean isComplete) {
        this.id = id;
        this.content = content;
        this.createDateTime = createDateTime;
        this.isComplete = isComplete;
    }

    @Override
    public String toString() {
        return "Todo [id=" + id +
                ", content=" + content +
                ", createdDateTime=" + createDateTime +
                ", isComplete=" + isComplete + "]";
    }
}