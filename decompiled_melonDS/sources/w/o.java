package w;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ x B;
    public final /* synthetic */ ArrayList L;

    public /* synthetic */ o(x xVar, ArrayList arrayList, int i2) {
        this.A = i2;
        this.B = xVar;
        this.L = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p1.c1 c1Var;
        switch (this.A) {
            case 0:
                x xVar = this.B;
                ArrayList arrayList = this.L;
                i iVar = xVar.f14064b0;
                try {
                    xVar.I(arrayList);
                    return;
                } finally {
                    iVar.i();
                }
            default:
                x xVar2 = this.B;
                ArrayList arrayList2 = this.L;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                boolean z10 = false;
                boolean z11 = false;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    a aVar = (a) obj;
                    if (xVar2.A.v(aVar.f13864a)) {
                        ((LinkedHashMap) xVar2.A.L).remove(aVar.f13864a);
                        arrayList3.add(aVar.f13864a);
                        if (aVar.f13865b == d0.f1.class) {
                            z11 = true;
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    xVar2.v("Use cases [" + TextUtils.join(", ", arrayList3) + "] now DETACHED for camera", null);
                    if (z11) {
                        xVar2.f14064b0.f13955h.getClass();
                    }
                    xVar2.r();
                    if (xVar2.A.q().isEmpty()) {
                        i iVar2 = xVar2.f14064b0;
                        m1 m1Var = iVar2.m;
                        boolean z12 = m1Var.f13999d;
                        m1Var.f13999d = false;
                        iVar2.n(false);
                    } else {
                        xVar2.N();
                        xVar2.M();
                    }
                    if (xVar2.A.p().isEmpty()) {
                        xVar2.f14064b0.i();
                        xVar2.E();
                        xVar2.f14064b0.m(false);
                        xVar2.f14069g0 = xVar2.B();
                        xVar2.v("Closing camera.", null);
                        switch (xVar2.X.ordinal()) {
                            case 3:
                            case 4:
                                if (xVar2.f14067e0 == null) {
                                    z10 = true;
                                }
                                p7.m.o(null, z10);
                                xVar2.F(u.INITIALIZED);
                                return;
                            case l1.c.f8511g /* 5 */:
                            default:
                                xVar2.v("close() ignored due to being in state: " + xVar2.X, null);
                                return;
                            case l1.c.f8509e /* 6 */:
                            case 7:
                            case 8:
                                if (xVar2.f14065c0.a() || ((c1Var = (p1.c1) xVar2.F0.B) != null && !((AtomicBoolean) c1Var.B).get())) {
                                    z10 = true;
                                }
                                xVar2.F0.r();
                                xVar2.F(u.CLOSING);
                                if (z10) {
                                    p7.m.o(null, xVar2.f14073k0.isEmpty());
                                    xVar2.t();
                                    return;
                                }
                                return;
                            case l1.c.f8508d /* 9 */:
                            case l1.c.f8510f /* 10 */:
                                xVar2.F(u.CLOSING);
                                xVar2.s();
                                return;
                        }
                    }
                    xVar2.L();
                    xVar2.E();
                    if (xVar2.X == u.OPENED) {
                        xVar2.D();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
