package com.shevliakov;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CryptoAccount {

  @NotNull
  @NotEmpty
  private Integer accountId;

  @NotNull
  @NotEmpty
  private Integer cryptoCurrency;

  @NotNull
  @NotEmpty
  private Integer amount;
}
