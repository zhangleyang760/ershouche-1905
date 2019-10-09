package com.qf.utils;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.*;

@Component
public class PageUtils {


    public Page getListBySearch(int currentPage, int size, String search, JpaSpecificationExecutor jpaSpecificationExecutor){
        PageRequest pages = PageRequest.of(currentPage-1, size);
        if (search!=null){
            Specification spec=new Specification() {
                @Override
                public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                    Path cname=root.get("cname");
                    Path brand=root.get("brand");
                    Path ctype=root.get("ctype");
                    Path price=root.get("price");
                    Predicate p=criteriaBuilder.like(cname,"%"+search+"%");

                    return p;
                }
            };
            Page all = jpaSpecificationExecutor.findAll(spec, pages);
            return all;
        }
        return null;
    }
    public Page getList(int currentPage, int size, JpaRepository jpaRepository){
        PageRequest pages = PageRequest.of(currentPage-1, size);
        Page all = jpaRepository.findAll(pages);
        return all;
    }
}
