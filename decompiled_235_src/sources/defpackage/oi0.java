package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oi0  reason: default package */
/* loaded from: classes.dex */
public final class oi0 {
    public static final uw d = g04.t(0);
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();

    public final ni0 a(Surface surface) {
        ni0 ni0Var;
        int i;
        List<jj7> list;
        surface.getClass();
        if (!surface.isValid()) {
            Log.w("CXCP", "registerSurface: Surface " + surface + " isn't valid!");
        }
        synchronized (this.a) {
            try {
                ni0Var = new ni0(this, surface);
                Integer num = (Integer) this.b.get(surface);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                int i2 = i + 1;
                this.b.put(surface, Integer.valueOf(i2));
                if (i2 == 1) {
                    list = gt0.k1(this.c);
                } else {
                    list = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            for (jj7 jj7Var : list) {
                jj7Var.d(surface);
            }
        }
        return ni0Var;
    }
}
