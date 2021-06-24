package Kanade.Dao;
import Kanade.domain.guaHao;
import Kanade.domain.kaiYao;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface guahaoDao {
    public List<guaHao> findAllguahao();
    public int insert_guahao(guaHao guahao);
    public List<guaHao> findByd_id(int d_id);

    public int insert_kaiyao(kaiYao kaiyao);
    public List<kaiYao> findBys_id(int s_id);
}
