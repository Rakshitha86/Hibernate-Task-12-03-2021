package com.xworkz.dao;

import com.xworkz.dto.CameraDTO;

public interface CameraDAO {

	void saveCamera(CameraDTO cameraDTO);

	void readCamera(int cameraId);

	void updateCamera(int cameraId);

	void deleteCamera(int cameraId);
}
