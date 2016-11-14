package com.neusoft.dao;


import com.neusoft.model.PostbackInf;

public interface Postbackdao extends GenericDao<PostbackInf, Long> {
      public void delete(Long postBackID);
      public void updateID(PostbackInf postBackinf);
}
