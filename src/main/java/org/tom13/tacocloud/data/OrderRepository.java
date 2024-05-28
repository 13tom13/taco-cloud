package org.tom13.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import org.tom13.tacocloud.entity.model.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {

    TacoOrder save(TacoOrder order);
}
