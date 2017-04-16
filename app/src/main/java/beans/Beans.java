package beans;

import java.util.List;

/**
 * 类的用途：
 * 时间:  2017/4/15  15:32
 * 姓名:  李照照
 */
public class Beans {

    /**
     * status : 10000
     * data : [{"id":"","name":"全部药品"},{"id":"2","name":"西药"},{"id":"3","name":"中药"}]
     */

    private int status;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id :
         * name : 全部药品
         */

        private String id;
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return  name;
        }
    }
}
