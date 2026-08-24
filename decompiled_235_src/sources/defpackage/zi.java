package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi  reason: default package */
/* loaded from: classes.dex */
public final class zi implements sk0 {
    public final t57 a;
    public final kf0 b;
    public final jr6 c;

    public zi(t57 t57Var, kf0 kf0Var, jr6 jr6Var) {
        t57Var.getClass();
        kf0Var.getClass();
        this.a = t57Var;
        this.b = kf0Var;
        this.c = jr6Var;
    }

    @Override // defpackage.sk0
    public final rk0 a(bf0 bf0Var, Map map, yk0 yk0Var) {
        int i;
        rk0 rk0Var;
        ArrayList arrayList;
        d90 d90Var = d90.q0;
        bf0Var.getClass();
        map.getClass();
        yk0Var.getClass();
        kf0 kf0Var = this.b;
        int i2 = kf0Var.h;
        if (i2 == 0) {
            i = 0;
        } else if (i2 == 1) {
            i = 1;
        } else if (i2 != 2) {
            i = i2;
        } else {
            e41.A(q60.Z(kf0Var.h), "Unsupported session mode: ");
            return null;
        }
        cp4 k = l.k(kf0Var, this.c, map);
        ArrayList arrayList2 = k.a;
        if (arrayList2.isEmpty()) {
            Log.w("CXCP", "Failed to create OutputConfigurations for " + kf0Var);
            yk0Var.a();
            return d90Var;
        }
        ArrayList arrayList3 = kf0Var.d;
        if (arrayList3 != null) {
            arrayList = new ArrayList(ht0.v0(arrayList3, 10));
            int size = arrayList3.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList3.get(i3);
                i3++;
                pp4 pp4Var = (pp4) gt0.b1(((y73) obj).a.a);
                arrayList.add(new j63(pp4Var.a.getWidth(), pp4Var.a.getHeight(), pp4Var.b));
            }
            rk0Var = null;
        } else {
            rk0Var = null;
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList.get(i4);
                i4++;
                if (((j63) obj2).c != ((j63) arrayList.get(0)).c) {
                    i.m("All InputStream.Config objects must have the same format for multi resolution");
                    return rk0Var;
                }
            }
        }
        if (!bf0Var.A(new uc6(i, arrayList, arrayList2, (Executor) this.a.j.getValue(), yk0Var, kf0Var.f, kf0Var.g))) {
            Log.w("CXCP", "Failed to create capture session from " + bf0Var + " for " + yk0Var + '!');
            yk0Var.a();
            return d90Var;
        }
        return new qk0(k.b, k.d);
    }
}
