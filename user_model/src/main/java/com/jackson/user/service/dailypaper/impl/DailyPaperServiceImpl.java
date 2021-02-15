package com.jackson.user.service.dailypaper.impl;

import com.jackson.user.orm.mapper.dailypaper.DailyPaperRecordMapper;
import com.jackson.user.orm.model.dailypaper.DailyPaperRecord;
import com.jackson.user.service.dailypaper.IDailyPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyPaperServiceImpl implements IDailyPaperService {

    @Autowired
    private DailyPaperRecordMapper dailyPaperRecordMapper;

    public List<DailyPaperRecord> query() {
        return dailyPaperRecordMapper.queryDailyPaper();
    }

    public DailyPaperRecord save(DailyPaperRecord dailyPaperRecord) {
        int idDate = (int) (System.currentTimeMillis()/1000);
        dailyPaperRecord.setIdDate(idDate);
        int result = dailyPaperRecordMapper.saveDailyPaper(dailyPaperRecord);
        return dailyPaperRecord;
    }

    public DailyPaperRecord put(DailyPaperRecord dailyPaperRecord) {

        int idDate = (int) (System.currentTimeMillis()/1000);
        dailyPaperRecord.setIdDate(idDate);
        int result = dailyPaperRecordMapper.updateDailyPaper(dailyPaperRecord);
        return dailyPaperRecord;
    }
}
