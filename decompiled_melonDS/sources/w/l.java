package w;

import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements b5.j {
    public final /* synthetic */ int A;
    public final /* synthetic */ x B;

    public /* synthetic */ l(x xVar, int i2) {
        this.A = i2;
        this.B = xVar;
    }

    @Override // b5.j
    public Object h(final b5.i iVar) {
        boolean z10;
        switch (this.A) {
            case 0:
                x xVar = this.B;
                try {
                    ArrayList arrayList = new ArrayList(xVar.A.o().b().f7318c);
                    arrayList.add((i0) xVar.f14084w0.f14094g);
                    arrayList.add(new p(xVar, iVar));
                    x.p pVar = xVar.B;
                    pVar.f14306a.B(xVar.f14066d0.f14095a, xVar.L, p7.j.n(arrayList));
                    return "configAndCloseTask";
                } catch (RuntimeException | x.a e6) {
                    xVar.v("Unable to open camera for configAndClose: " + e6.getMessage(), e6);
                    iVar.c(e6);
                    return "configAndCloseTask";
                }
            case DSiCameraSource.FrontCamera /* 1 */:
            default:
                final x xVar2 = this.B;
                xVar2.L.execute(new Runnable() { // from class: w.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        p1.c1 c1Var;
                        boolean v10;
                        switch (r3) {
                            case 0:
                                x xVar3 = xVar2;
                                b5.i iVar2 = iVar;
                                if (xVar3.f14071i0 == null) {
                                    if (xVar3.X != u.RELEASED) {
                                        xVar3.f14071i0 = a.a.A(new l(xVar3, 2));
                                    } else {
                                        xVar3.f14071i0 = m0.k.L;
                                    }
                                }
                                ta.a aVar = xVar3.f14071i0;
                                boolean z11 = true;
                                switch (xVar3.X.ordinal()) {
                                    case DSiCameraSource.FrontCamera /* 1 */:
                                    case l1.c.f8511g /* 5 */:
                                    case l1.c.f8509e /* 6 */:
                                    case 7:
                                    case 8:
                                        if (!xVar3.f14065c0.a() && ((c1Var = (p1.c1) xVar3.F0.B) == null || ((AtomicBoolean) c1Var.B).get())) {
                                            z11 = false;
                                        }
                                        xVar3.F0.r();
                                        xVar3.F(u.RELEASING);
                                        if (z11) {
                                            p7.m.o(null, xVar3.f14073k0.isEmpty());
                                            xVar3.t();
                                            break;
                                        }
                                        break;
                                    case 2:
                                    case 3:
                                    case 4:
                                        if (xVar3.f14067e0 != null) {
                                            z11 = false;
                                        }
                                        p7.m.o(null, z11);
                                        xVar3.F(u.RELEASING);
                                        p7.m.o(null, xVar3.f14073k0.isEmpty());
                                        xVar3.t();
                                        break;
                                    case l1.c.f8508d /* 9 */:
                                    case l1.c.f8510f /* 10 */:
                                        xVar3.F(u.RELEASING);
                                        xVar3.s();
                                        break;
                                    default:
                                        xVar3.v("release() ignored due to being in state: " + xVar3.X, null);
                                        break;
                                }
                                m0.i.e(aVar, iVar2);
                                return;
                            default:
                                x xVar4 = xVar2;
                                b5.i iVar3 = iVar;
                                x0 x0Var = xVar4.f14083v0;
                                if (x0Var == null) {
                                    v10 = false;
                                } else {
                                    v10 = xVar4.A.v(x.y(x0Var));
                                }
                                iVar3.b(Boolean.valueOf(v10));
                                return;
                        }
                    }
                });
                return "Release[request=" + xVar2.f14070h0.getAndIncrement() + "]";
            case 2:
                x xVar3 = this.B;
                if (xVar3.f14072j0 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p7.m.o("Camera can only be released once, so release completer should be null on creation.", z10);
                xVar3.f14072j0 = iVar;
                return "Release[camera=" + xVar3 + "]";
            case 3:
                final x xVar4 = this.B;
                try {
                    xVar4.L.execute(new Runnable() { // from class: w.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            p1.c1 c1Var;
                            boolean v10;
                            switch (r3) {
                                case 0:
                                    x xVar32 = xVar4;
                                    b5.i iVar2 = iVar;
                                    if (xVar32.f14071i0 == null) {
                                        if (xVar32.X != u.RELEASED) {
                                            xVar32.f14071i0 = a.a.A(new l(xVar32, 2));
                                        } else {
                                            xVar32.f14071i0 = m0.k.L;
                                        }
                                    }
                                    ta.a aVar = xVar32.f14071i0;
                                    boolean z11 = true;
                                    switch (xVar32.X.ordinal()) {
                                        case DSiCameraSource.FrontCamera /* 1 */:
                                        case l1.c.f8511g /* 5 */:
                                        case l1.c.f8509e /* 6 */:
                                        case 7:
                                        case 8:
                                            if (!xVar32.f14065c0.a() && ((c1Var = (p1.c1) xVar32.F0.B) == null || ((AtomicBoolean) c1Var.B).get())) {
                                                z11 = false;
                                            }
                                            xVar32.F0.r();
                                            xVar32.F(u.RELEASING);
                                            if (z11) {
                                                p7.m.o(null, xVar32.f14073k0.isEmpty());
                                                xVar32.t();
                                                break;
                                            }
                                            break;
                                        case 2:
                                        case 3:
                                        case 4:
                                            if (xVar32.f14067e0 != null) {
                                                z11 = false;
                                            }
                                            p7.m.o(null, z11);
                                            xVar32.F(u.RELEASING);
                                            p7.m.o(null, xVar32.f14073k0.isEmpty());
                                            xVar32.t();
                                            break;
                                        case l1.c.f8508d /* 9 */:
                                        case l1.c.f8510f /* 10 */:
                                            xVar32.F(u.RELEASING);
                                            xVar32.s();
                                            break;
                                        default:
                                            xVar32.v("release() ignored due to being in state: " + xVar32.X, null);
                                            break;
                                    }
                                    m0.i.e(aVar, iVar2);
                                    return;
                                default:
                                    x xVar42 = xVar4;
                                    b5.i iVar3 = iVar;
                                    x0 x0Var = xVar42.f14083v0;
                                    if (x0Var == null) {
                                        v10 = false;
                                    } else {
                                        v10 = xVar42.A.v(x.y(x0Var));
                                    }
                                    iVar3.b(Boolean.valueOf(v10));
                                    return;
                            }
                        }
                    });
                    return "isMeteringRepeatingAttached";
                } catch (RejectedExecutionException unused) {
                    iVar.c(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
                    return "isMeteringRepeatingAttached";
                }
        }
    }
}
