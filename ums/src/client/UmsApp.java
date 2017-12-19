package client;

import java.util.Iterator;
import java.util.List;

import service.UmsService;
import service.UmsServiceImpl;
//import service.DeptService;
//import service.DeptServiceImpl;
//import vo.DeptVO;
import vo.UmsVo;

public class UmsApp {

	public static void main(String[] args) {
		UmsService service = new UmsServiceImpl();
		List<UmsVo> list = service.getAllStudentList();
		Iterator<UmsVo> it = list.iterator();
		System.out.println("*********************** Student List ***********************");
		System.out.println();
		while (it.hasNext()) {
			UmsVo data = (UmsVo) it.next();
			System.out.println(data);
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -  - -");
		}
	}
}
