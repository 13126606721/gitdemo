package com.baizhi.serviceImpl;

import com.baizhi.aop.LogAnnotation;
import com.baizhi.dao.BookDao;
import com.baizhi.entity.Book;
import com.baizhi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("bookservice")
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bd;
    @Override
    @LogAnnotation(value="查所有")
    public List<Book> selectAll() {
        return bd.selectAll();
    }
}
