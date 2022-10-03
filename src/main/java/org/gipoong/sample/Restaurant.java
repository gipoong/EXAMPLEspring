package org.gipoong.sample;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Restaurant {

    @Setter(onMethod_ = @Autowired)
    private Chef chef;
}
