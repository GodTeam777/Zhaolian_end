package com.zhaolian.demo.service.util;
import java.util.List;

public class PageBean<T> {
	//当前页的数据
	private List<T> data;
	// 总记录数
	private int totalRecords;
	//
	private int pageNo;
	//
	private int pageSize;

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public int getTotalPages() {
		// if (this.totalRecords % pageSize == 0)
		// return this.totalRecords / pageSize;
		// return this.totalRecords / pageSize + 1;
		return (this.totalRecords + this.pageSize - 1) / this.pageSize;
	}


	public int getFirstPage() {
		return 1;
	}


	public int getLastPage() {
		if (this.totalRecords == 0)
			return 1;
		return this.getTotalPages();
	}


	public int getPreviousPage() {
		if (this.pageNo == 1)
			return 1;
		return this.pageNo - 1;
	}


	public int getNextPage() {
		if (this.pageNo == this.getLastPage())
			return this.pageNo;
		return this.pageNo + 1;
	}

	@Override
	public String toString() {
		return "PageBean1{" +
				"data=" + data +
				", totalRecords=" + totalRecords +
				", pageNo=" + pageNo +
				", pageSize=" + pageSize +
				'}';
	}
}
