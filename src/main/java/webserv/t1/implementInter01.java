package webserv.t1;

import javax.jws.WebService;

@WebService(endpointInterface = "webserv.t1.interface01")
public class implementInter01 implements interface01 {

	public int sum(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a + b + c;
	}

}
