package com.aerospike.mapper.tools;

import com.aerospike.client.Operation;

public interface DeferredOperation {
	Operation getOperation(OperationParameters operationParams);
	ResultsUnpacker[] getUnpackers(OperationParameters operationParams);
	boolean isGetOperation();
}
