package service;

import java.util.List;

import dao.UmsDao;
import vo.UmsVo;

public class UmsServiceImpl implements UmsService {

	UmsDao dao = new UmsDao();

	@Override
	public List<UmsVo> getAllStudentList() {
		return dao.getAllStudentList();
	}
}
