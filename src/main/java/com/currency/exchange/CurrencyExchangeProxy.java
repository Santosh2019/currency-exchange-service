package com.currency.exchange;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "currency-exchange", url = "localhost:8000")
interface CurrencyExchangeProxy {

	// @GetMapping("/currency-exchange/from/{from}/to/{to}")
//	public CurrencyConversion retrieveValue(@PathVariable String from, @PathVariable String to);

}
