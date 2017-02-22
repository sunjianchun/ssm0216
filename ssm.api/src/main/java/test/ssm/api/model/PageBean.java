package test.ssm.api.model;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sunjianchun on 17/2/21.
 */
public class PageBean<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    //总记录数
    private long total;
    //结果集
    private List<T> data;
    //第几页
    private int pageNum;
    //每页记录数
    private int pageSize;
    //当前页的数量, <=pageSize
    private int size;
    //总页数
    private int pages;

    public PageBean(List<T> list) {
        if (list instanceof Page) {
            Page<T> page = (Page<T>) list;
            this.total = page.getTotal();
            this.pageNum = page.getPageNum();
            this.pages = page.getPages();
            this.pageSize = page.getPageSize();
            this.data = page;
            this.size = page.size();
        }
    }

    public <T1> PageBean(PageBean<T1> srcPageBean, List<T> list) {
        this.total = srcPageBean.getTotal();
        this.pageNum = srcPageBean.getPageNum();
        this.pages = srcPageBean.getPages();
        this.pageSize = srcPageBean.getPageSize();
        this.data = list;
        this.size = list.size();
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "total=" + total +
                ", data=" + data +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", size=" + size +
                ", pages=" + pages +
                '}';
    }
}

