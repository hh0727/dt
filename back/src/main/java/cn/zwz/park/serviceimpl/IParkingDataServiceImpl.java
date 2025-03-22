package cn.zwz.park.serviceimpl;

import cn.zwz.park.mapper.ParkingDataMapper;
import cn.zwz.park.entity.ParkingData;
import cn.zwz.park.service.IParkingDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 停车记录 服务层接口实现
 * @author 郑为中
 */
@Slf4j
@Service
@Transactional
public class IParkingDataServiceImpl extends ServiceImpl<ParkingDataMapper, ParkingData> implements IParkingDataService {

    @Autowired
    private ParkingDataMapper parkingDataMapper;
}