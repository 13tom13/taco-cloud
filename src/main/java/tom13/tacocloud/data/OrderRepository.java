package tom13.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import tom13.tacocloud.model.TacoOrder;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID>{

        TacoOrder save(TacoOrder order);

        List<TacoOrder> findByDeliveryZip(String deliveryZip);

        List<TacoOrder> readOrdersByDeliveryZipAndPlacedAtBetween(
                String deliveryZip, Date startDate, Date endDate);

        List<TacoOrder> findByDeliveryToAndDeliveryCityAllIgnoresCase(
        String deliveryTo,String deliveryCity);

        List<TacoOrder> findByDeliveryCityOrderByDeliveryTo(String city);

        }
