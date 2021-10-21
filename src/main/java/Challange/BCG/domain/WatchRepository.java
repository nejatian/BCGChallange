package Challange.BCG.domain;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface WatchRepository {
    Optional<Watch> watchOf(String id);

    List<Watch> watchListOf(Set<String> watchIds);
}
