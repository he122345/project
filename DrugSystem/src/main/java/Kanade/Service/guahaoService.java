package Kanade.Service;
import Kanade.domain.guaHao;
import Kanade.domain.kaiYao;

import java.util.List;

public interface guahaoService {
    public List<guaHao> getAllguahao();
    public int addguahao(guaHao guahao);
    public List<guaHao> getUserByd_id(int d_id);

    public int addkaiyao(kaiYao kaiyao);
    public List<kaiYao> getUserBys_id(int s_id);
}
