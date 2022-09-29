package cinema.dao;

import cinema.model.Smile;
import java.util.List;

public interface SmileDao {
    Smile create(Smile smile);

    Smile get(Long id);

    List<Smile> getAll();
}
