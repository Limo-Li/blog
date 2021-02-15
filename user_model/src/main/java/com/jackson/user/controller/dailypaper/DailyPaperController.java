package com.jackson.user.controller.dailypaper;

import com.jackson.user.orm.model.dailypaper.DailyPaperRecord;
import com.jackson.user.service.dailypaper.IDailyPaperService;
import com.jackson.user.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DailyPaperController {

    @Autowired
    private IDailyPaperService iDailyPaperService;

    /**
     * 获取日报列表
     * @return
     */
    @RequestMapping(value = "dailyPapers", method = RequestMethod.GET)
    public ResultUtil<List<DailyPaperRecord>> query(){

        List<DailyPaperRecord> list = iDailyPaperService.query();;
        return new ResultUtil<List<DailyPaperRecord>>(HttpStatus.OK, list);
    }

    /**
     * 添加日报
     * @param dailyPaperRecord
     * @return
     */
    @RequestMapping(value = "dailyPaper", method = RequestMethod.POST)
    public ResultUtil save(@RequestBody DailyPaperRecord dailyPaperRecord){

        dailyPaperRecord = iDailyPaperService.save(dailyPaperRecord);;
        return new ResultUtil<DailyPaperRecord>(HttpStatus.OK, dailyPaperRecord);
    }

    /**
     * 修改日报
     * @param dailyPaperRecord
     * @return
     */
    @RequestMapping(value = "dailyPaper", method = RequestMethod.PUT)
    public ResultUtil put(@RequestBody DailyPaperRecord dailyPaperRecord) {
        dailyPaperRecord = iDailyPaperService.put(dailyPaperRecord);
        return new ResultUtil<DailyPaperRecord>(HttpStatus.OK, dailyPaperRecord);
    }
}
