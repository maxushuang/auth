package com.xuguruogu.auth.dal.daointerface;

import com.xuguruogu.auth.dal.dataobject.KssSoftDO;
import com.xuguruogu.auth.dal.querycondition.KssSoftQueryCondition;

public interface KssSoftDao extends KssDaoBase<KssSoftDO, KssSoftQueryCondition> {

	public int update(long softid, boolean islock, int intervaltime, String clientpubkey, String serverprivkey);

	public long selectLastId();

	public long updateSoftcode(long softid, long softcode);

	public long updateLock(long softid, boolean islock);
}
