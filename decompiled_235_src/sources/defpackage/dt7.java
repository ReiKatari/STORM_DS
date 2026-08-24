package defpackage;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dt7  reason: default package */
/* loaded from: classes.dex */
public abstract class dt7 {
    public static e33 a;

    public static final e33 a() {
        e33 e33Var = a;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Wifi", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(1.0f, 9.0f);
        ww2Var.n(2.0f, 2.0f);
        ww2Var.i(4.97f, -4.97f, 13.03f, -4.97f, 18.0f, RecyclerView.B1);
        ww2Var.n(2.0f, -2.0f);
        ww2Var.h(16.93f, 2.93f, 7.08f, 2.93f, 1.0f, 9.0f);
        ww2Var.g();
        ww2Var.o(9.0f, 17.0f);
        ww2Var.n(3.0f, 3.0f);
        ww2Var.n(3.0f, -3.0f);
        ww2Var.i(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, RecyclerView.B1);
        ww2Var.g();
        ww2Var.o(5.0f, 13.0f);
        ww2Var.n(2.0f, 2.0f);
        ww2Var.i(2.76f, -2.76f, 7.24f, -2.76f, 10.0f, RecyclerView.B1);
        ww2Var.n(2.0f, -2.0f);
        ww2Var.h(15.14f, 9.14f, 8.87f, 9.14f, 5.0f, 13.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b = d33Var.b();
        a = b;
        return b;
    }

    public static boolean b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = Build.MODEL;
            str.getClass();
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (xs6.g0(upperCase, (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }
}
