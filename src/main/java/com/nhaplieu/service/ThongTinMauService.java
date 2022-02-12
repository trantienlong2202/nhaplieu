package com.nhaplieu.service;

import java.util.Optional;

import com.nhaplieu.domain.ThongTinMau;
import com.nhaplieu.repository.ThongTinMauDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ThongTinMauService {
    @Autowired
    ThongTinMauDAO tidMauDAO;

    public void saveNhapLieu(ThongTinMau thongTinMau) {
        tidMauDAO.save(thongTinMau);
    }

    public Optional<ThongTinMau> findById(Long id) {

        System.out.println("   asdsadsad    "+ id);
        return tidMauDAO.findById(id);
    }

    public void saveThongTinMau(ThongTinMau employee) {

    }

    public ThongTinMau getThongTinMauId(Long id) {
        return null;
    }

    public void deleteThongTinMauById(Long id) {

    }

    public Page<ThongTinMau> findPaginated(int pageNo, int pageSize) {

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
        return this.tidMauDAO.findAll(pageable);

    }

}
