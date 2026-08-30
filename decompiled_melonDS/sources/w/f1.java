package w;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements b5.j, m0.a {
    public final /* synthetic */ g1 A;
    public final /* synthetic */ y.s B;
    public final /* synthetic */ List L;
    public final /* synthetic */ Object R;

    public /* synthetic */ f1(g1 g1Var, CameraDevice cameraDevice, y.s sVar, List list) {
        this.A = g1Var;
        this.R = cameraDevice;
        this.B = sVar;
        this.L = list;
    }

    @Override // m0.a
    public ta.a apply(Object obj) {
        g1 g1Var = this.A;
        CameraDevice cameraDevice = (CameraDevice) this.R;
        y.s sVar = this.B;
        List list = this.L;
        List list2 = (List) obj;
        if (g1Var.f13946v.f11a) {
            ArrayList g10 = g1Var.f13927b.g();
            int size = g10.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = g10.get(i2);
                i2++;
                ((g1) obj2).i();
            }
        }
        g1Var.k("start openCaptureSession");
        synchronized (g1Var.f13926a) {
            try {
                if (g1Var.m) {
                    return new m0.k(1, new CancellationException("Opener is disabled"));
                }
                x0 x0Var = g1Var.f13927b;
                synchronized (x0Var.f14090c) {
                    ((LinkedHashSet) x0Var.f14093f).add(g1Var);
                }
                b5.l A = a.a.A(new f1(g1Var, list, new rd.k(cameraDevice, g1Var.f13928c), sVar));
                g1Var.f13933h = A;
                rd.k kVar = new rd.k(13, g1Var);
                A.a(new m0.h(0, A, kVar), ij.a.D());
                return m0.i.d(g1Var.f13933h);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // b5.j
    public Object h(b5.i iVar) {
        boolean z10;
        String str;
        g1 g1Var = this.A;
        List list = this.L;
        rd.k kVar = (rd.k) this.R;
        y.s sVar = this.B;
        synchronized (g1Var.f13926a) {
            synchronized (g1Var.f13926a) {
                synchronized (g1Var.f13926a) {
                    try {
                        List<j0.u0> list2 = g1Var.f13936k;
                        if (list2 != null) {
                            for (j0.u0 u0Var : list2) {
                                u0Var.b();
                            }
                            g1Var.f13936k = null;
                        }
                    } finally {
                    }
                }
                z10 = false;
                if (!list.isEmpty()) {
                    int i2 = 0;
                    do {
                        try {
                            ((j0.u0) list.get(i2)).d();
                            i2++;
                        } catch (j0.t0 e6) {
                            for (int i10 = i2 - 1; i10 >= 0; i10--) {
                                ((j0.u0) list.get(i10)).b();
                            }
                            throw e6;
                        }
                    } while (i2 < list.size());
                    g1Var.f13936k = list;
                } else {
                    g1Var.f13936k = list;
                }
            }
            if (g1Var.f13934i == null) {
                z10 = true;
            }
            p7.m.o("The openCaptureSessionCompleter can only set once!", z10);
            g1Var.f13934i = iVar;
            ((p1.a0) kVar.B).v(sVar);
            str = "openCaptureSession[session=" + g1Var + "]";
        }
        return str;
    }

    public /* synthetic */ f1(g1 g1Var, List list, rd.k kVar, y.s sVar) {
        this.A = g1Var;
        this.L = list;
        this.R = kVar;
        this.B = sVar;
    }
}
