package cn.zwz.park.serviceimpl;

import cn.zwz.park.mapper.IcCardMapper;
import cn.zwz.park.entity.IcCard;
import cn.zwz.park.service.IIcCardService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * IC卡 服务层接口实现
 * @author 郑为中
 */
@Slf4j
@Service
@Transactional
public class IIcCardServiceImpl extends ServiceImpl<IcCardMapper, IcCard> implements IIcCardService {

    @Autowired
    private IcCardMapper icCardMapper;
}