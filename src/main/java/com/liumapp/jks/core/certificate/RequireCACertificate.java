package com.liumapp.jks.core.certificate;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.jks.core.certificate.require.CACertificateRequire;
import com.liumapp.jks.core.filter.RequestFilter;
import com.liumapp.jks.core.util.HttpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liumapp
 * @file RequireCACertificate.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 2018/8/1
 */
public class RequireCACertificate extends RequestFilter <CACertificateRequire> {

    private static Logger LOGGER = LoggerFactory.getLogger(RequireCACertificate.class);

    @Override
    public JSONObject handle(CACertificateRequire data) {
        HttpUtil httpUtil = new HttpUtil();
        try {

            this.jobResult.put("msg", "success");
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            this.jobResult.put("msg", "error");
        }
        return this.jobResult;
    }

}