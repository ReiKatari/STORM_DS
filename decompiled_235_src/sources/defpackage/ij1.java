package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@pd4("dialog")
/* renamed from: ij1  reason: default package */
/* loaded from: classes.dex */
public final class ij1 extends qd4 {
    @Override // defpackage.qd4
    public final ic4 a() {
        zv0 zv0Var = hw0.a;
        return new hj1(this);
    }

    @Override // defpackage.qd4
    public final void d(List list, ad4 ad4Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((sb4) it.next());
        }
    }

    @Override // defpackage.qd4
    public final void e(sb4 sb4Var, boolean z) {
        b().e(sb4Var, z);
        int L0 = gt0.L0((Iterable) b().f.A.getValue(), sb4Var);
        int i = 0;
        for (Object obj : (Iterable) b().f.A.getValue()) {
            int i2 = i + 1;
            if (i >= 0) {
                sb4 sb4Var2 = (sb4) obj;
                if (i > L0) {
                    b().c(sb4Var2);
                }
                i = i2;
            } else {
                hf.q0();
                throw null;
            }
        }
    }
}
