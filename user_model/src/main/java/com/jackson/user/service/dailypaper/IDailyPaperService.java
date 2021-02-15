package com.jackson.user.service.dailypaper;

import com.jackson.user.orm.model.dailypaper.DailyPaperRecord;

import java.util.List;

public interface IDailyPaperService {

    /**
     * 查询日报列表
     * @return
     */
    List<DailyPaperRecord> query();

    /**
     * 保存日报
     * @param dailyPaperRecord
     * @return
     */
    DailyPaperRecord save(DailyPaperRecord dailyPaperRecord);

    /**
     * 修改日报
     * @param dailyPaperRecord
     * @return
     */
    DailyPaperRecord put(DailyPaperRecord dailyPaperRecord);
}
