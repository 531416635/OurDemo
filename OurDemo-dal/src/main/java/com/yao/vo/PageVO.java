package com.yao.vo;

public class PageVO {

	public class Pager {

		private int currentPage; // 当前页数
		private int pageSize; // 分页行数
		private int totalRow; // 总行数
		private int startPage;// 起始行
		private int endPage;// 结束行
		private int totalPage; // 总页数

		public int getcurrentPage() {
			return currentPage;
		}

		public void setcurrentPage(int currentPage) {
			if (currentPage < 1) {
				currentPage = 1;
			} else {
				startPage = pageSize * (currentPage - 1);
			}
			endPage = startPage + pageSize > totalRow ? totalRow : startPage
					+ pageSize;
			this.currentPage = currentPage;
		}

		public int getstartPage() {
			// startPage=currentPage*pageSize;
			return startPage;
		}

		public int getendPage() {

			return endPage;
		}

		public int getPageSize() {
			return pageSize;
		}

		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}

		public int getTotalRow() {
			return totalRow;
		}

		public void setTotalRow(int totalRow) {
			totalPage = (totalRow + pageSize - 1) / pageSize;
			this.totalRow = totalRow;
			if (totalPage < currentPage) {
				currentPage = totalPage;
				startPage = pageSize * (currentPage - 1);
				endPage = totalRow;
			}
			endPage = startPage + pageSize > totalRow ? totalRow : startPage
					+ pageSize;
		}

		public int getTotalPage() {
			return this.totalPage;
		}

	}

}
