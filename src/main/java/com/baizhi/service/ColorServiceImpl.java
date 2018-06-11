package com.baizhi.service;

import com.baizhi.dao.ColorDAO;
import com.baizhi.entity.Color;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ColorServiceImpl implements ColorService {
    public static Logger logger = Logger.getLogger(ColorServiceImpl.class);
   @Autowired
   private ColorDAO colorDAO;
    @Override
    public Color showOne() {
        Color color = colorDAO.selectByPrimaryKey(1);
        logger.info(color.toString());
        return colorDAO.selectByPrimaryKey(1);
    }
}
