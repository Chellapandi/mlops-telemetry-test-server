package ai.h2o.telemetry.service;

import ai.h2o.cloud.telemetry.v1.Entry;
import ai.h2o.cloud.telemetry.v1.ReportRequest;
import ai.h2o.cloud.telemetry.v1.ReportResponse;
import ai.h2o.cloud.telemetry.v1.TelemetryServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@RequiredArgsConstructor
@Slf4j
public class TelemetryServiceImpl extends TelemetryServiceGrpc.TelemetryServiceImplBase {

    @Override
    public void report(ReportRequest request, StreamObserver<ReportResponse> responseObserver) {
        for (Entry entry:request.getEntriesList()){
            log.info("Entry "+entry.toString());
        }
        ReportResponse reportResponse = ReportResponse.getDefaultInstance();
        responseObserver.onNext(reportResponse);
        responseObserver.onCompleted();
    }
}
