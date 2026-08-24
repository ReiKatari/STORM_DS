package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qd3  reason: default package */
/* loaded from: classes.dex */
public final class qd3 implements gg3 {
    public static final qd3 a = new Object();
    public static final pd3 b = pd3.b;

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        gi2.l(sc1Var);
        return new nd3((List) new ru(he3.a, 0).j(sc1Var, null));
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        nd3 nd3Var = (nd3) obj;
        nd3Var.getClass();
        gi2.j(x32Var);
        he3 he3Var = he3.a;
        wb6 e = he3Var.e();
        e.getClass();
        nu nuVar = new nu(e, 1);
        int size = nd3Var.size();
        vx0 g0 = x32Var.g0(nuVar, size);
        Iterator<de3> it = nd3Var.iterator();
        for (int i = 0; i < size; i++) {
            g0.w(nuVar, i, he3Var, it.next());
        }
        g0.a(nuVar);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return b;
    }
}
