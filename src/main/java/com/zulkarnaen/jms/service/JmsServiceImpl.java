package com.zulkarnaen.jms.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import com.zulkarnaen.jms.model.JmsModel;

@Service
public class JmsServiceImpl {

	private static Logger logger = LoggerFactory.getLogger("auditservice");

	/* THIS IS LISTNER 1 */
	@JmsListener(destination = "jms-data", containerFactory = "myFactory")
	public void processListener1(JmsModel stream) {

		/* CALL BACK */
		callBack(stream);

	}

	/* THIS IS LISTNER 2 */
	@JmsListener(destination = "jms-data", containerFactory = "myFactory")
	public void processListener2(JmsModel stream) {

		/* CALL BACK */
		callBack(stream);

	}

	/* THIS IS LISTNER 3 */
	@JmsListener(destination = "jms-data", containerFactory = "myFactory")
	public void processListener3(JmsModel stream) {

		/* CALL BACK */
		callBack(stream);

	}

	private void callBack(JmsModel stream) {
		logger.info("get data");
		logger.info("Name " + stream.getNama());
		logger.info("Kelas " + stream.getKelas());
		logger.info("Alamat " + stream.getAlamat());
	}

}
