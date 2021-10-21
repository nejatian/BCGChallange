package Challange.BCG.infrastructure;

import Challange.BCG.domain.DiscountRule;
import Challange.BCG.domain.Money;
import Challange.BCG.domain.Watch;
import Challange.BCG.domain.WatchRepository;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class InMemoryWatchRepository implements WatchRepository {
    Map<String, Watch> watches = new HashMap<String, Watch>();

    public InMemoryWatchRepository() {
        Watch rolex = new Watch("001", "Rolex", new Money(100));
        rolex.addDiscountRule(new DiscountRule(3, new Money(200)));
        watches.put(rolex.id(), rolex);

        Watch mk = new Watch("002", "Michael Kors", new Money(80));
        mk.addDiscountRule(new DiscountRule(2, new Money(120)));
        watches.put(mk.id(), mk);

        Watch swatch = new Watch("003", "Swatch", new Money(50));
        watches.put(swatch.id(), swatch);

        Watch casio = new Watch("004", "Casio", new Money(30));
        watches.put(casio.id(), casio);
    }
    @Override
    public Optional<Watch> watchOf(String id) {
        Watch watch = watches.get(id);
        return Optional.ofNullable(watch);
    }

    @Override
    public List<Watch> watchListOf(Set<String> watchIds) {
        return watches.entrySet().stream()
                .filter(x -> watchIds.contains(x.getKey()))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }
}
