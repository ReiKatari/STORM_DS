package w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ x B;

    public /* synthetic */ k(x xVar, int i2) {
        this.A = i2;
        this.B = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                x xVar = this.B;
                xVar.f14081t0 = false;
                xVar.f14080s0 = false;
                xVar.v("OpenCameraConfigAndClose is done, state: " + xVar.X, null);
                int ordinal = xVar.X.ordinal();
                if (ordinal != 1 && ordinal != 5) {
                    if (ordinal != 7) {
                        xVar.v("OpenCameraConfigAndClose finished while in state: " + xVar.X, null);
                        return;
                    }
                    int i2 = xVar.f14068f0;
                    if (i2 != 0) {
                        xVar.v("OpenCameraConfigAndClose in error: ".concat(x.x(i2)), null);
                        xVar.f14065c0.b();
                        return;
                    }
                    xVar.K(false);
                    return;
                }
                p7.m.o(null, xVar.f14073k0.isEmpty());
                xVar.w();
                return;
            default:
                x xVar2 = this.B;
                xVar2.v("Camera is removed. Updating state and cleaning up.", null);
                u uVar = xVar2.X;
                u uVar2 = u.RELEASING;
                if (uVar != uVar2 && xVar2.X != u.RELEASED) {
                    d0.f fVar = new d0.f(8, null);
                    xVar2.Z.N(j0.c0.CLOSED, fVar);
                    xVar2.G(uVar2, fVar, true);
                    xVar2.f14065c0.a();
                    xVar2.F0.r();
                    if (xVar2.f14067e0 != null) {
                        xVar2.s();
                        return;
                    } else {
                        xVar2.w();
                        return;
                    }
                }
                return;
        }
    }
}
