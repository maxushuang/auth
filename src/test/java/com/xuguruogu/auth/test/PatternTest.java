package com.xuguruogu.auth.test;

import java.util.regex.Pattern;

import org.junit.Test;

public class PatternTest {

	@Test
	public void tst() {

		Pattern allowedUrls = Pattern.compile("(.*\\.json$|^/api/.*)");
		System.out.println(allowedUrls.matcher("1244.json").matches());
		System.out.println(allowedUrls.matcher("/api/d").matches());
	}

	@Test
	public void testsql() {

		String sql = "DROP TABLE IF EXISTS `kss_soft_key`;\n\t\tDROP TABLE IF EXISTS `kss_soft_recharge`;\n\t\tDROP TABLE IF EXISTS `kss_soft_user`;";

		System.out.println(Pattern.compile("(.*KSS_SOFT_KEY.*|.*KSS_SOFT_USER.*|.*KSS_SOFT_RECHARGE.*)",
				Pattern.CASE_INSENSITIVE | Pattern.DOTALL).matcher(sql).matches());

		System.out.println(Pattern.compile("KSS_SOFT_KEY", Pattern.CASE_INSENSITIVE)
				.matcher("INSERT INTO KSS_SOFT_KEY (").replaceFirst("KSS_SOFT_KEY_" + 1));

		long softid = 1;
		System.out.println("INSERT INTO KSs_SOFT_USER (".replaceAll("(?i)KSS_SOFT_KEY", "KSS_SOFT_KEY_" + softid)
				.replaceAll("(?i)KSS_SOFT_USER", "KSS_SOFT_USER_" + softid)
				.replaceAll("(?i)KSS_SOFT_RECHARGE", "KSS_SOFT_RECHARGE_" + softid));
	}

}
