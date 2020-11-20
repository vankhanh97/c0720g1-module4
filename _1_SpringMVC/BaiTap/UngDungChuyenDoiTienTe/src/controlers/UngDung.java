package controlers;

import org.springframework.stereotype.Service;

@Service
public class UngDung {
    public double chuyenDoi(double usd) {
        if (String.valueOf(usd).equals("")) return 0;
        else return usd*23000;
    }
}
