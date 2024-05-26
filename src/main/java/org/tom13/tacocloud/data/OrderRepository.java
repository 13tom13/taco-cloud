package org.tom13.tacocloud.data;

import org.tom13.tacocloud.entity.model.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
