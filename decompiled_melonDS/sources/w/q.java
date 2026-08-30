package w;

import j0.t1;
import j0.w1;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q implements m0.c {
    public final /* synthetic */ int A;
    public final /* synthetic */ p0 B;
    public final /* synthetic */ x L;

    public /* synthetic */ q(x xVar, p0 p0Var, int i2) {
        this.A = i2;
        this.L = xVar;
        this.B = p0Var;
    }

    @Override // m0.c
    public final void D(Object obj) {
        switch (this.A) {
            case 0:
                Void r32 = (Void) obj;
                this.L.f14073k0.remove(this.B);
                int ordinal = this.L.X.ordinal();
                if (ordinal != 1 && ordinal != 5) {
                    if (ordinal == 6 || (ordinal == 7 && this.L.f14068f0 != 0)) {
                        this.L.v("Camera reopen required. Checking if the current camera can be closed safely.", null);
                    } else {
                        return;
                    }
                }
                if (this.L.f14073k0.isEmpty()) {
                    x xVar = this.L;
                    if (xVar.f14067e0 != null) {
                        xVar.v("closing camera", null);
                        this.L.f14067e0.close();
                        this.L.f14067e0 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                Void r33 = (Void) obj;
                if (this.L.f14076n0.b() == 2 && this.L.X == u.OPENED) {
                    this.L.F(u.CONFIGURED);
                    return;
                }
                return;
        }
    }

    @Override // m0.c
    public final void z(Throwable th2) {
        switch (this.A) {
            case 0:
                return;
            default:
                boolean z10 = th2 instanceof j0.t0;
                x xVar = this.L;
                w1 w1Var = null;
                if (z10) {
                    j0.u0 u0Var = ((j0.t0) th2).A;
                    Iterator it = xVar.A.p().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            w1 w1Var2 = (w1) it.next();
                            if (w1Var2.b().contains(u0Var)) {
                                w1Var = w1Var2;
                            }
                        }
                    }
                    if (w1Var != null) {
                        x xVar2 = this.L;
                        l0.d p0 = ij.a.p0();
                        t1 t1Var = w1Var.f7321f;
                        if (t1Var != null) {
                            xVar2.v("Posting surface closed", new Throwable());
                            p0.execute(new g(3, t1Var, w1Var));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (th2 instanceof CancellationException) {
                    xVar.v("Unable to configure camera cancelled", null);
                    return;
                } else {
                    u uVar = xVar.X;
                    u uVar2 = u.OPENED;
                    if (uVar == uVar2) {
                        this.L.G(uVar2, new d0.f(4, th2), true);
                    }
                    aj.g.t("Camera2CameraImpl", "Unable to configure camera " + this.L, th2);
                    x xVar3 = this.L;
                    if (xVar3.f14069g0 == this.B) {
                        xVar3.E();
                        return;
                    }
                    return;
                }
        }
    }

    private final void a(Throwable th2) {
    }
}
