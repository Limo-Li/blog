package com.jackson.user.orm.mapper.dailypaper;

import com.jackson.user.orm.model.dailypaper.DailyPaperRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DailyPaperRecordMapper {

    /**
     * 查询日报
     * @return
     */
    List<DailyPaperRecord> queryDailyPaper();

    /**
     * 保存日报
     * @param dailyPaperRecord
     * @return
     */
    int saveDailyPaper(DailyPaperRecord dailyPaperRecord);

    /**
     * 修改日报
     * @param dailyPaperRecord
     * @return
     */
    int updateDailyPaper(DailyPaperRecord dailyPaperRecord);
}
