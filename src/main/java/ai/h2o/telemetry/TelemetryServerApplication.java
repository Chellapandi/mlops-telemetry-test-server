package ai.h2o.telemetry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelemetryServerApplication {
    public static void main(String[] args) {
        // The provider is needed to support the cert format that we're using.
        java.security.Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());

        SpringApplication.run(TelemetryServerApplication.class, args);
    }
}
