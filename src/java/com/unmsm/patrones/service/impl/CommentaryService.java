/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.patrones.service.impl;

import com.unmsm.patrones.dto.Commentary;
import com.unmsm.patrones.repository.ICommentaryRepository;
import com.unmsm.patrones.repository.impl.CommentaryDao;
import com.unmsm.patrones.service.ICommentaryService;
import com.unmsm.patrones.util.iterator.CustomIterator;
import com.unmsm.patrones.util.iterator.ListCommentary;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author bluq1
 */
public class CommentaryService implements ICommentaryService{
    
    private ICommentaryRepository commentaryRepository;

    public CommentaryService() {
        this.commentaryRepository = new CommentaryDao();
    }    

    @Override
    public Boolean createCommentary(Commentary commentary) {
        this.commentaryRepository.insert(commentary);
        return Boolean.TRUE;
    }

    @Override
    public Boolean likeCommentary(Commentary commentary) {
        commentary.setLike(commentary.getLike()+1);
        long flag = this.commentaryRepository.update(commentary);
        return flag != 0;
    }

    @Override
    public Boolean deleteCommentary(Commentary commentary) {
        long flag = this.commentaryRepository.delete(commentary);
        return flag != 0;
    }

    @Override
    public CustomIterator showAllComentaries(String sort) {
        ListCommentary list = new ListCommentary(this.commentaryRepository.getAll());
        return list.iterator(sort);
    }

    @Override
    public CustomIterator showCommentaryBySport(String sport, String sort) {
        ListCommentary list = new ListCommentary(this.commentaryRepository.getBySport(sport));
        return list.iterator(sort);
    }
    
}
