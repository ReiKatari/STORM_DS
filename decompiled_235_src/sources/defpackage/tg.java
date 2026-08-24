package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tg  reason: default package */
/* loaded from: classes.dex */
public final class tg {
    public final Context a;
    public final qh1 b;
    public final long c;
    public final lq4 d;

    public tg(Context context, qh1 qh1Var, long j, lq4 lq4Var) {
        this.a = context;
        this.b = qh1Var;
        this.c = j;
        this.d = lq4Var;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!tg.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        tg tgVar = (tg) obj;
        if (nb3.k(this.a, tgVar.a) && nb3.k(this.b, tgVar.b) && kt0.d(this.c, tgVar.c) && nb3.k(this.d, tgVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int i = kt0.i;
        return this.d.hashCode() + i61.c(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }
}
