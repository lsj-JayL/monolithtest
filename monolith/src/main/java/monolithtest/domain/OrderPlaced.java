package monolithtest.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import monolithtest.domain.*;
import monolithtest.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private String qty;
    private String customerId;
    private Long amount;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
