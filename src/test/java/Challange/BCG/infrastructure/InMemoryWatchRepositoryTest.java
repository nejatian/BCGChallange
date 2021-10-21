package Challange.BCG.infrastructure;

import Challange.BCG.domain.Money;
import Challange.BCG.domain.Watch;
import Challange.BCG.domain.WatchRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class InMemoryWatchRepositoryTest {
    @Autowired
    WatchRepository repository;

    @Test
    void shouldRetrieveAWatchSuccessfully(){
        Watch watch = repository.watchOf("001").orElseThrow();

        assertThat(watch.id()).isEqualTo("001");
        assertThat(watch.name()).isEqualTo("Rolex");
        assertThat(watch.unitPrice()).isEqualTo(new Money(100));
    }

    @Test
    void shouldRetrieveAListOfWatchesSuccessfully(){
        List<Watch> watches = repository.watchListOf(Set.of("001", "002"));

        assertThat(watches.size()).isEqualTo(2);
    }

}
