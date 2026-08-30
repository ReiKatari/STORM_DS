package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bf2  reason: default package */
/* loaded from: classes.dex */
public final class bf2 extends ua5 {
    public static final cw3 d;
    public final List b;
    public final List c;

    static {
        h85 h85Var = cw3.d;
        d = hi2.n("application/x-www-form-urlencoded");
    }

    public bf2(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.b = ik7.i(arrayList);
        this.c = ik7.i(arrayList2);
    }

    @Override // defpackage.ua5
    public final long a() {
        return e(null, true);
    }

    @Override // defpackage.ua5
    public final cw3 b() {
        return d;
    }

    @Override // defpackage.ua5
    public final void d(t60 t60Var) {
        e(t60Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(t60 t60Var, boolean z) {
        f60 f60Var;
        if (z) {
            f60Var = new Object();
        } else {
            t60Var.getClass();
            f60Var = t60Var.b();
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                f60Var.m0(38);
            }
            f60Var.s0((String) list.get(i));
            f60Var.m0(61);
            f60Var.s0((String) this.c.get(i));
        }
        if (z) {
            long j = f60Var.B;
            f60Var.w();
            return j;
        }
        return 0L;
    }
}
