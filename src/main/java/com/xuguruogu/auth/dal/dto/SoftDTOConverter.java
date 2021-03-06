package com.xuguruogu.auth.dal.dto;

import org.springframework.stereotype.Component;

import com.xuguruogu.auth.dal.dataobject.KssSoftDO;
import com.xuguruogu.auth.util.AbstractConverter;

/**
 * 用户摘要信息转换器
 *
 * @author benli.lbl
 * @version $Id: UserSummaryDTOConverter.java, v 0.1 Aug 12, 2015 2:42:50 PM
 *          benli.lbl Exp $
 */
@Component("softDTOConverter")
public class SoftDTOConverter extends AbstractConverter<KssSoftDO, SoftDTO> {

	@Override
	protected SoftDTO doConvert(KssSoftDO kssSoftDO) {

		SoftDTO dto = new SoftDTO();
		dto.setStatus(kssSoftDO.getStatus().getDesc());
		dto.setId(kssSoftDO.getId());
		dto.setSoftkey(kssSoftDO.getSoftkey());
		dto.setSoftname(kssSoftDO.getSoftname());
		dto.setIntervaltime(kssSoftDO.getIntervaltime());

		return dto;
	}
}
