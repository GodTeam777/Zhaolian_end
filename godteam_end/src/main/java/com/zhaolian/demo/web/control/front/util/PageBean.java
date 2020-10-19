package com.zhaolian.demo.web.control.front.util;

import java.util.List;

public class PageBean<T> {
	// ���浱ǰҳ�����ݵļ���
		private List<T> data;
		// �����ҳǰ���ܵļ�¼��
		private int totalRecords;
		// ���浱ǰҳ��
		private int pageNo;
		// ����ҳ��С
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

		// ������ҳ���ķ���
		public int getTotalPages() {
			// if (this.totalRecords % this.pageSize == 0)
			// return this.totalRecords / this.pageSize;
			// return this.totalRecords / this.pageSize + 1;
			return (this.totalRecords + this.pageSize - 1) / this.pageSize;
		}

		// ������ҳ�ķ���
		public int getFirstPage() {
			return 1;
		}

		// �������һҳ�ķ���
		public int getLastPage() {
			//����ʹ��getTotalPages()���أ�����ʹ��this.totalPages
			if (this.totalRecords == 0)
				return 1;
			return this.getTotalPages();
		}

		// ����ǰһҳ�ķ���
		public int getPreviousPage() {
			if (this.pageNo == 1)
				return 1;
			return this.pageNo - 1;
		}

		// ���غ�һҳ�ķ���
		public int getNextPage() {
			//����ʹ��getLastPage()����,����ʹ��totalPages
			if (this.pageNo == this.getLastPage())
				//����ʹ��toatalPages����
				return this.pageNo;
			return this.pageNo + 1;
		}

	
}
