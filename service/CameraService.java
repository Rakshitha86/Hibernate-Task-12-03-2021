package com.xworkz.service;

import com.xworkz.dto.CameraDTO;

public interface CameraService {

	void validateAndSave(CameraDTO cameraDTO);

	void validateAndRead(int cameraId);

	void validateAndUpdate(int cameraId);

	void validateAndDelete(int cameraId);
}
