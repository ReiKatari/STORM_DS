package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ak2  reason: default package */
/* loaded from: classes.dex */
public final class ak2 extends mk5 {
    public static final n34 d;
    public final List b;
    public final List c;

    static {
        xh5 xh5Var = n34.d;
        d = xk2.k("application/x-www-form-urlencoded");
    }

    public ak2(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.b = az7.j(arrayList);
        this.c = az7.j(arrayList2);
    }

    @Override // defpackage.mk5
    public final long a() {
        return e(null, true);
    }

    @Override // defpackage.mk5
    public final n34 b() {
        return d;
    }

    @Override // defpackage.mk5
    public final void d(y80 y80Var) {
        e(y80Var, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(y80 y80Var, boolean z) {
        k80 k80Var;
        if (z) {
            k80Var = new Object();
        } else {
            y80Var.getClass();
            k80Var = y80Var.a();
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                k80Var.n0(38);
            }
            k80Var.t0((String) list.get(i));
            k80Var.n0(61);
            k80Var.t0((String) this.c.get(i));
        }
        if (z) {
            long j = k80Var.B;
            k80Var.e();
            return j;
        }
        return 0L;
    }
}
