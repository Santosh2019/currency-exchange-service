package com.currency.exchange;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.CurrencyConversion;

@FeignClient(name = "currency-exchange", url = "localhost:8000")
interface CurrencyExchangeProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveValue(@PathVariable String from, @PathVariable String to);

}
