package sia.taco_cloud.data;

import sia.taco_cloud.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
