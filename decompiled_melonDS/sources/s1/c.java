package s1;

import b3.m;
import b3.p;
import f1.a1;
import g2.k3;
import i4.i;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {
    public static final p a(p pVar, boolean z10, a1 a1Var, boolean z11, i iVar, mc.a aVar) {
        p a10;
        if (a1Var != null) {
            a10 = new a(z10, null, a1Var, false, z11, iVar, aVar);
        } else if (a1Var == null) {
            a10 = new a(z10, null, null, false, z11, iVar, aVar);
        } else {
            a10 = b3.a.a(m.f1770a, new b(a1Var, z10, z11, iVar, aVar));
        }
        return pVar.f(a10);
    }

    public static p b(p pVar, boolean z10, i iVar, mc.a aVar, int i2) {
        if ((i2 & 4) != 0) {
            iVar = null;
        }
        return pVar.f(new a(z10, null, null, true, true, iVar, aVar));
    }

    public static final p c(k4.a aVar, k3 k3Var, boolean z10, i iVar, mc.a aVar2) {
        if (k3Var != null) {
            return new f(aVar, null, k3Var, z10, iVar, aVar2);
        }
        if (k3Var == null) {
            return new f(aVar, null, null, z10, iVar, aVar2);
        }
        return b3.a.a(m.f1770a, new e(k3Var, aVar, z10, iVar, aVar2));
    }
}
