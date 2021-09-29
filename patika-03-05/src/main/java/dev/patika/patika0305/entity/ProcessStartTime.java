package dev.patika.patika0305.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcessStartTime {
    private String name;
    private String description;
    private String baseUnit;
    private List<Measurement> measurements;
    private List<String> availableTags;
}
