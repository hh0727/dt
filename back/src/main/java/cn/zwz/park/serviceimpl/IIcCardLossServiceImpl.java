package cn.zwz.park.serviceimpl;

import cn.zwz.park.mapper.IcCardLossMapper;
import cn.zwz.park.entity.IcCardLoss;
import cn.zwz.park.service.IIcCardLossService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * IC卡挂失 服务层接口实现
 * @author 郑为中
 */
@Slf4j
@Service
@Transactional
public class IIcCardLossServiceImpl extends ServiceImpl<IcCardLossMapper, IcCardLoss> implements IIcCardLossService {

    @Autowired
    private IcCardLossMapper icCardLossMapper;
}