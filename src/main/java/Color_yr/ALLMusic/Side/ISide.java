package Color_yr.ALLMusic.Side;

import java.util.List;

public interface ISide {
    void Send(String player, String data, Boolean isplay);

    void Send(String data, Boolean isplay);

    int GetAllPlayer();

    void SendLyric(String data);

    void bq(String data);

    void save();

    boolean NeedPlay();
}
