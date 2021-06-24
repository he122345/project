package Kanade.domain;

public class guaHao {
    private int guahao_id;
    private String s_name;
    private String guahaotime;
    private int d_id;

    @Override
    public String toString() {
        return "guaHao{" +
                "guahao_id=" + guahao_id +
                ", s_name='" + s_name + '\'' +
                ", guahaotime='" + guahaotime + '\'' +
                ", d_id=" + d_id +
                '}';
    }

    public int getGuahao_id() {
        return guahao_id;
    }

    public void setGuahao_id(int guahao_id) {
        this.guahao_id = guahao_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getGuahaotime() {
        return guahaotime;
    }

    public void setGuahaotime(String guahaotime) {
        this.guahaotime = guahaotime;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public guaHao(int guahao_id, String s_name, String guahaotime, int d_id) {

        this.guahao_id = guahao_id;
        this.s_name = s_name;
        this.guahaotime = guahaotime;
        this.d_id = d_id;
    }

    public guaHao() {

    }
}
