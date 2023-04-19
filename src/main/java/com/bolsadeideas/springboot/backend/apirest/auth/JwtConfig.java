package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
	
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.123456789";
	
	public static final String RSA_PRIVADA = "-----BEGIN PRIVATE KEY-----\r\n"
			+ "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCabPbIg7OtKl8V\r\n"
			+ "NztMyhgcojmaUNIb+rDqJemxuqWbQM5oSM6cmcHMOBBSOl+QeLEDtLZR2Gt31tUq\r\n"
			+ "itHa4Wd9EIrXcENlXo9BeAKdZdNNvsF5VqM4rPYj/TEuf9/ck3AEZZv5M4YX/6v9\r\n"
			+ "OgWVWWzEd4UCZvyw4TortCpZm/UdQZch9dsdfai/WJByzfox9GuByQbxmmmuubhs\r\n"
			+ "ZvdFXMRjVncBFisJD2+6gLFxCW2B6ZRj/estcRVNnuMSiVOU44Y8vjyRVEFQg2cj\r\n"
			+ "T9aFhMKFY5QRmKcRedLZXVT7cW/fOJ5FG30iWKhVo7t2hTTqUfieVt6/ooRW/AhA\r\n"
			+ "PRrxIAXrAgMBAAECggEABVbjKYe0PLaMVxVzzXHnZ4YMa9ODkEgYud/ZtrV3aGjT\r\n"
			+ "OjPaQPvoAYGmvtEZ4Mrrg+9JpobPIHOjJzdpjiHhDCf4RP6ytdyRI3hczshoh/Wi\r\n"
			+ "humB90GzuQbWHn95ZA0NAHnq7LDlYAsNDVJmQwW2hwyC4tRgxFTlSAGQvUxxKzO9\r\n"
			+ "lGjB9JSJdbGdCjJiTDvfxNcGipf+cdKmLGNEqRBNgmOHumk6fdxzq9YrtENLz/Mo\r\n"
			+ "MQV1xnS9XMn7qmqgt8M4975nn8QUMzfjC4fSyS7D0S4ivZf8LLQTCRYZ80qxCT8p\r\n"
			+ "Pw/z+fX8aRFoLVDMFX3o1r7KU/Cb+ilSoAlPWNVqkQKBgQC3QTHgCtEMbXzPqt7k\r\n"
			+ "5Ktv15SKaqQY6We5znT/TfWrpcazVYTdsclZxMJDx3efkdedJQfKo2LL2NjFGzyY\r\n"
			+ "AOa58wDkghtzeqsELFITVX4Dd+sGg010bLMvGVrpFRbjAXFfVilUWj95GyIMN0HX\r\n"
			+ "RxwxaNk2ZtBFwsLMQTCciaDMvQKBgQDXuhcWtqhQJiEJVP22yRXrFwXI8N8mw9dO\r\n"
			+ "CKf3Bm6205ZNu0ajFA91gPI496KEI0BE88KFUmoK6+xAQ9z8YZuOuIaChL+zBt3H\r\n"
			+ "k+11WPlNaBTrIRQXrY9PyroAMNgkCHXZOy5eywo629rLLuKAZqgSJmTobxWWKPob\r\n"
			+ "FIVyL9PLxwKBgD6HVldWGYKeEUpiyW9cv0qISrz4Kkn9ylDSK4W5uiv5gtVKRu3G\r\n"
			+ "bifdRVQPSbf+8Y1DR2dTXLClq0GGS6SqGhA05IcUBf3fS18/KDpEn5zbXCx6vQEO\r\n"
			+ "3g0iH60MbyTCJ0cahTutF59hLLryV9r2/p21Yvh3GHXVQNalH8sqAt4ZAoGBAISR\r\n"
			+ "tTKeGRz38YFcm3XCaRfJVCLB80BNRXiM1Tt21n6/1DP8jFIXN9DL5w6fD14Ik6xL\r\n"
			+ "6BQqK0R+6vYrPhhSm1e/idmXXn7UD2JgQ6LDhKDO/1vnPgO3AsTUHi2T1p9+G33d\r\n"
			+ "YoeaWrUE+pW2QDcL3ukYcxZrfWaD0/7kQ4WCYrNtAoGBAIMfcUcXAA3S9Gujtop1\r\n"
			+ "geJDfPEy8aFhyXWGTQUiDfpx/Rx68eBmBghJsbNnAf9H7LtmM2aPCMSy1Q+yXyYL\r\n"
			+ "UR0dwPcSBjkX4MULZIrXD1OoQXhGtAayiwYILXKh3dWNYTBueISK1AeHnU72kY1+\r\n"
			+ "3uFt73aLvUZ6Nkn7enCHODrI\r\n"
			+ "-----END PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmmz2yIOzrSpfFTc7TMoY\r\n"
			+ "HKI5mlDSG/qw6iXpsbqlm0DOaEjOnJnBzDgQUjpfkHixA7S2Udhrd9bVKorR2uFn\r\n"
			+ "fRCK13BDZV6PQXgCnWXTTb7BeVajOKz2I/0xLn/f3JNwBGWb+TOGF/+r/ToFlVls\r\n"
			+ "xHeFAmb8sOE6K7QqWZv1HUGXIfXbHX2ov1iQcs36MfRrgckG8Zpprrm4bGb3RVzE\r\n"
			+ "Y1Z3ARYrCQ9vuoCxcQltgemUY/3rLXEVTZ7jEolTlOOGPL48kVRBUINnI0/WhYTC\r\n"
			+ "hWOUEZinEXnS2V1U+3Fv3zieRRt9IlioVaO7doU06lH4nlbev6KEVvwIQD0a8SAF\r\n"
			+ "6wIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";
}
