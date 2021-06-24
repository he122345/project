package Kanade.Service;
import Kanade.domain.guaHao;
import Kanade.domain.kaiYao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class guahaoServicelmpl implements guahaoService {
    @Autowired
    private Kanade.Dao.guahaoDao guahaoDao;

    @Override
    public int addkaiyao(kaiYao kaiyao) {
        return guahaoDao.insert_kaiyao(kaiyao);
    }

    @Override
    public List<kaiYao> getUserBys_id(int s_id) {
        return guahaoDao.findBys_id(s_id);
    }

    @Override
    public List<guaHao> getUserByd_id(int d_id) { return guahaoDao.findByd_id(d_id); }

    @Override
    public List<guaHao> getAllguahao() {
        return guahaoDao.findAllguahao();
    }

    @Override
    public int addguahao(guaHao guahao) {
        return guahaoDao.insert_guahao(guahao);
    }
}