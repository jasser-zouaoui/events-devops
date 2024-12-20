package tn.esprit.eventsproject.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.eventsproject.entities.Event;
import tn.esprit.eventsproject.entities.Logistics;
import tn.esprit.eventsproject.entities.Participant;
import tn.esprit.eventsproject.repositories.EventRepository;
import tn.esprit.eventsproject.repositories.LogisticsRepository;
import tn.esprit.eventsproject.repositories.ParticipantRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
public class EventServiceIntegrationTest {

    @Autowired
    private EventServicesImpl eventService;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private ParticipantRepository participantRepository;

    @Autowired
    private LogisticsRepository logisticsRepository;

    @Test
    @DisplayName("Should add and retrieve a participant")
    void testAddAndRetrieveParticipant() {
        Participant participant = new Participant();
        participant.setNom("John");
        participant.setPrenom("Doe");

        Participant savedParticipant = eventService.addParticipant(participant);
        assertNotNull(savedParticipant);
        assertTrue(participantRepository.findById(savedParticipant.getIdPart()).isPresent());
    }





}
