package br.com.ms.email.models;

import br.com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_EMAIL")
public class Email implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long codigo;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    private String text;
    private LocalDateTime sendDateEmail;

    private StatusEmail statusEmail;



}
