package ah;

import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public y(c cVar, EmulatorActivity emulatorActivity) {
        this.A = 0;
        this.B = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mc.a
    public final Object b() {
        Object valueOf;
        boolean z10;
        Object obj;
        int i2 = this.A;
        Object obj2 = this.B;
        switch (i2) {
            case 0:
                return (w6.c) ((c) obj2).b();
            case DSiCameraSource.FrontCamera /* 1 */:
                ((mc.l) obj2).k(null);
                return yb.y.f14813a;
            case 2:
                ArrayList arrayList = ((n2.k1) obj2).f9946a;
                a1.m0 m0Var = new a1.m0(arrayList.size());
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    n2.q0 q0Var = (n2.q0) arrayList.get(i10);
                    Object obj3 = q0Var.f9991b;
                    int i11 = q0Var.f9990a;
                    if (obj3 != null) {
                        valueOf = new n2.p0(Integer.valueOf(i11), q0Var.f9991b);
                    } else {
                        valueOf = Integer.valueOf(i11);
                    }
                    int f8 = m0Var.f(valueOf);
                    if (f8 < 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        obj = null;
                    } else {
                        obj = m0Var.f69c[f8];
                    }
                    if (obj != null) {
                        if (obj instanceof a1.h0) {
                            a1.h0 h0Var = (a1.h0) obj;
                            h0Var.a(q0Var);
                            q0Var = h0Var;
                        } else {
                            Object[] objArr = a1.s0.f100a;
                            a1.h0 h0Var2 = new a1.h0(2);
                            h0Var2.a(obj);
                            h0Var2.a(q0Var);
                            q0Var = h0Var2;
                        }
                    }
                    if (z10) {
                        int i12 = ~f8;
                        m0Var.f68b[i12] = valueOf;
                        m0Var.f69c[i12] = q0Var;
                    } else {
                        m0Var.f69c[f8] = q0Var;
                    }
                }
                return new p2.a(m0Var);
            default:
                return new t8.c[((cd.h[]) obj2).length];
        }
    }

    public /* synthetic */ y(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }
}
