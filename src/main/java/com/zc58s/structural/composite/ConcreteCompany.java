package com.zc58s.structural.composite;

import java.util.ArrayList;
import java.util.List;

/*
 * @description :
 *
 *
 * @author      : fjc.dane@gmail.com
 * @create time : 2020/11/25 14:37
 */
public class ConcreteCompany extends Company {

    private List<Company> companyList = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        this.companyList.add(company);
    }

    @Override
    public void remove(Company company) {
        this.companyList.remove(company);
    }

    @Override
    public void display(int depth) {
        //输出树形结构
        for(int i=0; i<depth; i++) {
            System.out.print('-');
        }
        System.out.println(name);

        //下级遍历
        for (Company component : companyList) {
            component.display(depth + 1);
        }
    }

    @Override
    public void lineOfDuty() {
        //职责遍历
        for (Company company : companyList) {
            company.lineOfDuty();
        }
    }

}
