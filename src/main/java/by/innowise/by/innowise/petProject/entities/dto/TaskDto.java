package by.innowise.by.innowise.petProject.entities.dto;

import by.innowise.by.innowise.petProject.entities.TaskEnum;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class TaskDto {
    private long id;
    private String name;
    private TaskEnum status;
    private String description;
    private UUID creator;
    private UUID executor;
    private UUID inspecting;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private String timeZone;
}