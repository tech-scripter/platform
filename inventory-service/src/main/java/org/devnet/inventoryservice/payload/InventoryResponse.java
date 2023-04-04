package org.devnet.inventoryservice.payload;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoryResponse implements Serializable {
    private String skuCode;
    private Boolean isInStock;
}
