package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ni  reason: default package */
/* loaded from: classes.dex */
public final class ni implements ki0 {
    public final ct6 a;
    public final bd0 b;
    public final tf6 c;

    public ni(ct6 ct6Var, bd0 bd0Var, tf6 tf6Var) {
        ct6Var.getClass();
        bd0Var.getClass();
        this.a = ct6Var;
        this.b = bd0Var;
        this.c = tf6Var;
    }

    @Override // defpackage.ki0
    public final ji0 a(sc0 sc0Var, Map map, qi0 qi0Var) {
        int i;
        ji0 ji0Var;
        ArrayList arrayList;
        k45 k45Var = k45.X;
        sc0Var.getClass();
        map.getClass();
        qi0Var.getClass();
        bd0 bd0Var = this.b;
        int i2 = bd0Var.h;
        if (i2 == 0) {
            i = 0;
        } else if (i2 == 1) {
            i = 1;
        } else if (i2 != 2) {
            i = i2;
        } else {
            f81.i(mh7.i0(bd0Var.h), "Unsupported session mode: ");
            return null;
        }
        zf4 g = tq5.g(bd0Var, this.c, map);
        ArrayList arrayList2 = g.a;
        if (arrayList2.isEmpty()) {
            Log.w("CXCP", "Failed to create OutputConfigurations for " + bd0Var);
            qi0Var.b();
            return k45Var;
        }
        ArrayList arrayList3 = bd0Var.d;
        if (arrayList3 != null) {
            arrayList = new ArrayList(uq0.y0(arrayList3, 10));
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList3.get(i3);
                i3++;
                mg4 mg4Var = (mg4) tq0.e1(((r13) obj).a.a);
                arrayList.add(new g03(mg4Var.a.getWidth(), mg4Var.a.getHeight(), mg4Var.b));
            }
            ji0Var = null;
        } else {
            ji0Var = null;
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList.get(i4);
                i4++;
                if (((g03) obj2).c != ((g03) arrayList.get(0)).c) {
                    i.n("All InputStream.Config objects must have the same format for multi resolution");
                    return ji0Var;
                }
            }
        }
        if (!sc0Var.T(new g16(i, arrayList, arrayList2, (Executor) this.a.j.getValue(), qi0Var, bd0Var.f, bd0Var.g))) {
            Log.w("CXCP", "Failed to create capture session from " + sc0Var + " for " + qi0Var + '!');
            qi0Var.b();
            return k45Var;
        }
        return new ii0(g.b, g.d);
    }
}
