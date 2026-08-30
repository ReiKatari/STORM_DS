package defpackage;

import android.util.Log;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fg0  reason: default package */
/* loaded from: classes.dex */
public final class fg0 {
    public static final cw d = w81.f(0);
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();

    public final eg0 a(Surface surface) {
        eg0 eg0Var;
        int i;
        List<m57> list;
        surface.getClass();
        if (!surface.isValid()) {
            Log.w("CXCP", "registerSurface: Surface " + surface + " isn't valid!");
        }
        synchronized (this.a) {
            try {
                eg0Var = new eg0(this, surface);
                Integer num = (Integer) this.b.get(surface);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                int i2 = i + 1;
                this.b.put(surface, Integer.valueOf(i2));
                if (i2 == 1) {
                    list = tq0.n1(this.c);
                } else {
                    list = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (list != null) {
            for (m57 m57Var : list) {
                m57Var.d(surface);
            }
        }
        return eg0Var;
    }
}
