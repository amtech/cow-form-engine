package org.ljk.zodiac.cow.form.engine.service.impl;

import org.ljk.zodiac.cow.form.engine.mapper.BizFirstMetaMapper;
import org.ljk.zodiac.cow.form.engine.model.BizFirstMeta;
import org.ljk.zodiac.cow.form.engine.model.BizFirstMetaExample;
import org.ljk.zodiac.cow.form.engine.service.BizFirstTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BizFirstTemplateServiceImpl implements BizFirstTemplateService {

    @Autowired
    private BizFirstMetaMapper bizFirstMetaMapper;

    @Override
    public List<BizFirstMeta> getTemplate() {
        BizFirstMetaExample bizFirstMetaExample = new BizFirstMetaExample();
        return bizFirstMetaMapper.selectByExample(bizFirstMetaExample);
    }
}
