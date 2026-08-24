package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: is7  reason: default package */
/* loaded from: classes.dex */
public abstract class is7 {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final List list, a74 a74Var, boolean z, px0 px0Var, final int i, final int i2) {
        int i3;
        a74 a74Var2;
        int i4;
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        final a74 a74Var3;
        final boolean z4;
        cf5 t;
        x64 x64Var;
        boolean z5;
        pn pnVar;
        a74 a74Var4;
        d40 d40Var;
        Iterator it;
        boolean z6;
        es7 es7Var;
        d40 d40Var2 = d90.i0;
        list.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(448211103);
        if (xq2Var.h(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i;
        int i8 = i2 & 2;
        if (i8 != 0) {
            i5 = i7 | 48;
            a74Var2 = a74Var;
        } else {
            a74Var2 = a74Var;
            if (xq2Var.f(a74Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 = i7 | i4;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i5 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            z2 = z;
            if (xq2Var.g(z2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i5 |= i6;
            if ((i5 & 147) == 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!xq2Var.S(i5 & 1, z3)) {
                x64 x64Var2 = x64.a;
                if (i8 != 0) {
                    x64Var = x64Var2;
                } else {
                    x64Var = a74Var2;
                }
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                es7 F = bl2.F(xq2Var);
                a74 c = dj6.c(x64Var, 1.0f);
                yt0 a = wt0.a(ju.c, d90.k0, xq2Var, 0);
                int hashCode = Long.hashCode(xq2Var.T);
                xv4 l = xq2Var.l();
                a74 E = l.E(xq2Var, c);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                pn pnVar2 = ix0.f;
                yh2.K(xq2Var, pnVar2, a);
                pn pnVar3 = ix0.e;
                yh2.K(xq2Var, pnVar3, l);
                Integer valueOf = Integer.valueOf(hashCode);
                pn pnVar4 = ix0.g;
                yh2.K(xq2Var, pnVar4, valueOf);
                ne neVar = ix0.h;
                yh2.F(xq2Var, neVar);
                pn pnVar5 = ix0.d;
                yh2.K(xq2Var, pnVar5, E);
                if (z5) {
                    xq2Var.b0(1069982112);
                    pnVar = pnVar2;
                    h70.a(vy7.L(dj6.e(dj6.c(x64Var2, 1.0f), 1.0f), F.f, u24.m), xq2Var, 0);
                    xq2Var.p(false);
                } else {
                    pnVar = pnVar2;
                    xq2Var.b0(1070067641);
                    xq2Var.p(false);
                }
                gu guVar = new gu(18.0f, true, new h61(d90.l0, 2));
                a74 P = ge7.P(dj6.c(x64Var2, 1.0f), 14.0f, 8.0f);
                l26 a2 = k26.a(guVar, d40Var2, xq2Var, 54);
                int hashCode2 = Long.hashCode(xq2Var.T);
                xv4 l2 = xq2Var.l();
                a74 E2 = l.E(xq2Var, P);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, a2);
                yh2.K(xq2Var, pnVar3, l2);
                i61.w(hashCode2, xq2Var, pnVar4, xq2Var, neVar);
                yh2.K(xq2Var, pnVar5, E2);
                xq2Var.b0(621701171);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    rq2 rq2Var = (rq2) it2.next();
                    l26 a3 = k26.a(ju.a, d40Var2, xq2Var, 48);
                    int hashCode3 = Long.hashCode(xq2Var.T);
                    xv4 l3 = xq2Var.l();
                    a74 E3 = l.E(xq2Var, x64Var2);
                    jx0.i.getClass();
                    iy0 iy0Var2 = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var2);
                    } else {
                        xq2Var.o0();
                    }
                    pn pnVar6 = ix0.f;
                    yh2.K(xq2Var, pnVar6, a3);
                    pn pnVar7 = ix0.e;
                    yh2.K(xq2Var, pnVar7, l3);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    pn pnVar8 = ix0.g;
                    yh2.K(xq2Var, pnVar8, valueOf2);
                    ne neVar2 = ix0.h;
                    yh2.F(xq2Var, neVar2);
                    pn pnVar9 = ix0.d;
                    yh2.K(xq2Var, pnVar9, E3);
                    if (rq2Var.a == null) {
                        xq2Var.b0(1256284552);
                        a74Var4 = x64Var;
                        i13.a(ej2.G(), null, dj6.i(x64Var2, 15.0f), F.i, xq2Var, 432, 0);
                        xq2Var.p(false);
                        d40Var = d40Var2;
                        it = it2;
                        es7Var = F;
                        z6 = true;
                    } else {
                        a74Var4 = x64Var;
                        xq2Var.b0(1256590708);
                        d40Var = d40Var2;
                        a74 I = ak7.I(dj6.i(x64Var2, 17.0f), 1.5f, F.i, z16.a);
                        e34 d = h70.d(d90.Z, false);
                        int hashCode4 = Long.hashCode(xq2Var.T);
                        xv4 l4 = xq2Var.l();
                        a74 E4 = l.E(xq2Var, I);
                        xq2Var.f0();
                        if (xq2Var.S) {
                            xq2Var.k(iy0Var2);
                        } else {
                            xq2Var.o0();
                        }
                        yh2.K(xq2Var, pnVar6, d);
                        yh2.K(xq2Var, pnVar7, l4);
                        i61.w(hashCode4, xq2Var, pnVar8, xq2Var, neVar2);
                        yh2.K(xq2Var, pnVar9, E4);
                        xq2 xq2Var2 = xq2Var;
                        it = it2;
                        z6 = true;
                        es7Var = F;
                        x37.b(rq2Var.a, null, F.i, hi2.E(9), oj2.e0, null, 0L, new wz6(3), hi2.E(9), 0, false, 0, 0, null, null, xq2Var2, 199680, 6, 129490);
                        xq2Var = xq2Var2;
                        xq2Var.p(true);
                        xq2Var.p(false);
                    }
                    xq2 xq2Var3 = xq2Var;
                    x37.b(rq2Var.b, ge7.S(x64Var2, 6.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14), es7Var.i, hi2.E(10), null, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1575984, 0, 130992);
                    xq2Var = xq2Var3;
                    xq2Var.p(z6);
                    it2 = it;
                    F = es7Var;
                    x64Var = a74Var4;
                    d40Var2 = d40Var;
                }
                i61.y(xq2Var, false, true, true);
                z4 = z5;
                a74Var3 = x64Var;
            } else {
                xq2Var.V();
                a74Var3 = a74Var2;
                z4 = z2;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new eo2() { // from class: gs7
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        is7.a(list, a74Var3, z4, (px0) obj, ii2.a0(i | 1), i2);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((i5 & 147) == 146) {
        }
        if (!xq2Var.S(i5 & 1, z3)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final void b(nh2 nh2Var, px0 px0Var, int i) {
        boolean z;
        nh2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(842525353);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i & 1, z)) {
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = new hs7(nh2Var, null);
                xq2Var.l0(P);
            }
            mb3.i(xq2Var, (eo2) P, nh2Var);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new y36(nh2Var, i, 13);
        }
    }

    public static final void c(a74 a74Var, zv0 zv0Var, px0 px0Var, int i) {
        boolean z;
        int i2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-2059218889);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            if (xq2Var.h(zv0Var)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i3 |= i2;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            x64 x64Var = x64.a;
            a74 I = ak7.I(vy7.L(u24.g(dj6.c(x64Var, 1.0f), z16.b(15.0f)), F.c, u24.m), 1.0f, F.f, z16.b(15.0f));
            int i4 = (i3 << 6) & 7168;
            yt0 a = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, I);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            zv0Var.e(zt0.a, xq2Var, Integer.valueOf(((i4 >> 6) & 112) | 6));
            xq2Var.p(true);
            a74Var = x64Var;
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new im(a74Var, zv0Var, i, 5);
        }
    }

    public static final void d(px0 px0Var, int i) {
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-522994299);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i & 1, z)) {
            h70.a(vy7.L(dj6.e(dj6.c(x64.a, 1.0f), 1.0f), bl2.F(xq2Var).f, u24.m), xq2Var, 0);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z17(i, 8);
        }
    }

    public static final void e(String str, a74 a74Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var;
        x64 x64Var;
        int i3;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1760152437);
        if ((i & 6) == 0) {
            if (xq2Var2.f(str)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i4 & 1, z)) {
            es7 F = bl2.F(xq2Var2);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            long j = F.i;
            sr2 sr2Var = qs7.c;
            long E = hi2.E(10);
            xq2Var = xq2Var2;
            oj2 oj2Var = oj2.d0;
            long D = hi2.D(0.8d);
            x64 x64Var2 = x64.a;
            x37.b(upperCase, ge7.S(x64Var2, 2.0f, 20.0f, RecyclerView.B1, 9.0f, 4), j, E, oj2Var, sr2Var, D, null, 0L, 0, false, 0, 0, null, null, xq2Var, 14355456, 0, 130832);
            x64Var = x64Var2;
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
            x64Var = a74Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new hp(str, i, 15, x64Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(boolean z, qn2 qn2Var, a74 a74Var, boolean z2, px0 px0Var, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        x64 x64Var;
        cf5 t;
        long j;
        float f;
        boolean z5;
        boolean z6;
        int i5;
        int i6;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1061288934);
        if ((i & 6) == 0) {
            if (xq2Var.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(qn2Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i7 = i3 | RendererDebugBridge.CAPTURE_HEIGHT;
        int i8 = i2 & 8;
        if (i8 != 0) {
            i7 = i3 | 3456;
        } else if ((i & 3072) == 0) {
            z3 = z2;
            if (xq2Var.g(z3)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i7 |= i4;
            if ((i7 & 1171) == 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!xq2Var.S(i7 & 1, z4)) {
                if (i8 != 0) {
                    z3 = true;
                }
                es7 F = bl2.F(xq2Var);
                if (z) {
                    j = F.l;
                } else {
                    j = F.n;
                }
                pp6 a = ti6.a(j, ge7.Y(180, 0, null, 6), xq2Var, 432, 8);
                if (z) {
                    f = 19.0f;
                } else {
                    f = RecyclerView.B1;
                }
                pp6 a2 = in.a(f, ge7.Y(180, 0, null, 6), xq2Var, 432, 8);
                xq2Var.b0(1991439540);
                x64 x64Var2 = x64.a;
                a74 g = u24.g(dj6.j(x64Var2, 44.0f, 25.0f), z16.b(13.0f));
                long j2 = ((kt0) a.getValue()).a;
                jy2 jy2Var = u24.m;
                a74 L = vy7.L(g, j2, jy2Var);
                if (qn2Var != null && z3) {
                    xq2Var.b0(-1670133345);
                    if ((i7 & 112) == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((i7 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z7 = z6 | z5;
                    Object P = xq2Var.P();
                    if (z7 || P == ox0.a) {
                        P = new q01(qn2Var, z, 5);
                        xq2Var.l0(P);
                    }
                    L = mb3.u(L, false, null, (on2) P, 15);
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(-1670047289);
                    xq2Var.p(false);
                }
                xq2Var.p(false);
                a74 O = ge7.O(L, 3.0f);
                e34 d = h70.d(d90.Y, false);
                int hashCode = Long.hashCode(xq2Var.T);
                xv4 l = xq2Var.l();
                a74 E = l.E(xq2Var, O);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, ix0.f, d);
                yh2.K(xq2Var, ix0.e, l);
                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                yh2.F(xq2Var, ix0.h);
                yh2.K(xq2Var, ix0.d, E);
                a74 i9 = dj6.i(g04.M(x64Var2, ((om1) a2.getValue()).A, RecyclerView.B1), 19.0f);
                y16 y16Var = z16.a;
                h70.a(vy7.L(u24.g(nj2.E(i9, 2.0f, y16Var, false, 0L, 28), y16Var), kt0.d, jy2Var), xq2Var, 0);
                xq2Var.p(true);
                x64Var = x64Var2;
            } else {
                xq2Var.V();
                x64Var = a74Var;
            }
            boolean z8 = z3;
            t = xq2Var.t();
            if (t == null) {
                t.d = new j01(z, qn2Var, x64Var, z8, i, i2);
                return;
            }
            return;
        }
        z3 = z2;
        if ((i7 & 1171) == 1170) {
        }
        if (!xq2Var.S(i7 & 1, z4)) {
        }
        boolean z82 = z3;
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public abstract nx3 g(Context context, String str, WorkerParameters workerParameters);

    public nx3 h(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        nx3 g = g(context, str, workerParameters);
        if (g == null) {
            try {
                Class<? extends U> asSubclass = Class.forName(str).asSubclass(nx3.class);
                asSubclass.getClass();
                try {
                    Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    newInstance.getClass();
                    g = (nx3) newInstance;
                } catch (Throwable th) {
                    ga0.f().e(hx7.a, "Could not instantiate ".concat(str), th);
                    throw th;
                }
            } catch (Throwable th2) {
                ga0.f().e(hx7.a, "Invalid class: ".concat(str), th2);
                throw th2;
            }
        }
        if (!g.d) {
            return g;
        }
        String name = getClass().getName();
        throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
