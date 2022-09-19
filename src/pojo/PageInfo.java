package pojo;

/**
 * @Author:������
 * @Date:2019/8/27 10:43
 */
public class PageInfo {
    //�ڼ�ҳ
    public Integer page;
    //��ʼ����
    public Integer start;
    //ÿҳ��ѯ����
    public Integer pageSize;
    //�û�id
    public String openId;

    public PageInfo() {
    }



    public PageInfo(Integer page, Integer start, Integer pageSize, String openId) {
        this.page = page;
        this.start = start;
        this.pageSize = pageSize;
        this.openId = openId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getStart() {
        return (page - 1) * pageSize;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "page=" + page +
                ", start=" + start +
                ", pageSize=" + pageSize +
                ", openId='" + openId + '\'' +
                '}';
    }
}
