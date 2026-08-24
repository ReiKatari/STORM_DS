package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ak  reason: default package */
/* loaded from: classes.dex */
public abstract class ak {
    public static final py0 a = new py0(jf.f0);
    public static final py0 b = new py0(jf.e0);

    /* JADX WARN: Removed duplicated region for block: B:105:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f05 f05Var, on2 on2Var, g05 g05Var, zv0 zv0Var, px0 px0Var, int i, int i2) {
        int i3;
        on2 on2Var2;
        int i4;
        g05 g05Var2;
        boolean z;
        on2 on2Var3;
        cf5 t;
        on2 on2Var4;
        int i5;
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        kk3 kk3Var;
        boolean z7;
        int i6;
        int i7;
        int i8;
        int i9;
        f05 f05Var2 = f05Var;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1772091631);
        if ((i & 6) == 0) {
            if (xq2Var.f(f05Var2)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            on2Var2 = on2Var;
            if (xq2Var.h(on2Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
            if ((i & RendererDebugBridge.CAPTURE_HEIGHT) != 0) {
                g05Var2 = g05Var;
                if (xq2Var.f(g05Var2)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i3 |= i8;
            } else {
                g05Var2 = g05Var;
            }
            if ((i & 3072) == 0) {
                if (xq2Var.h(zv0Var)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i3 & 1171) == 1170) {
                z = true;
            } else {
                z = false;
            }
            if (!xq2Var.S(i3 & 1, z)) {
                if (i10 != 0) {
                    on2Var4 = null;
                } else {
                    on2Var4 = on2Var2;
                }
                View view = (View) xq2Var.j(kf.f);
                qh1 qh1Var = (qh1) xq2Var.j(ky0.h);
                String str2 = (String) xq2Var.j(a);
                kk3 kk3Var2 = (kk3) xq2Var.j(ky0.n);
                vq2 T = ge7.T(xq2Var);
                qa4 b0 = np2.b0(zv0Var, xq2Var);
                Object[] objArr = new Object[0];
                Object P = xq2Var.P();
                vs0 vs0Var = ox0.a;
                if (P == vs0Var) {
                    P = jf.g0;
                    xq2Var.l0(P);
                }
                UUID uuid = (UUID) qo2.I(objArr, (on2) P, xq2Var, 48);
                boolean booleanValue = ((Boolean) xq2Var.j(b)).booleanValue();
                Object P2 = xq2Var.P();
                if (P2 == vs0Var) {
                    str = str2;
                    i5 = i3;
                    z2 = true;
                    c05 c05Var = new c05(on2Var4, g05Var2, str, view, qh1Var, f05Var2, uuid, booleanValue);
                    f05Var2 = f05Var2;
                    c05Var.m(T, new zv0(-297523940, true, new zj(c05Var, b0, 1)));
                    xq2Var.l0(c05Var);
                    P2 = c05Var;
                } else {
                    i5 = i3;
                    str = str2;
                    z2 = true;
                }
                c05 c05Var2 = (c05) P2;
                boolean h = xq2Var.h(c05Var2);
                int i11 = i5 & 112;
                if (i11 == 32) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                boolean z8 = h | z3;
                int i12 = i5 & 896;
                if (i12 == 256) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                boolean f = z8 | z4 | xq2Var.f(str) | xq2Var.d(kk3Var2.ordinal());
                Object P3 = xq2Var.P();
                if (f || P3 == vs0Var) {
                    P3 = new tj(c05Var2, on2Var4, g05Var, str, kk3Var2);
                    xq2Var.l0(P3);
                }
                mb3.d(c05Var2, (qn2) P3, xq2Var);
                boolean h2 = xq2Var.h(c05Var2);
                if (i11 == 32) {
                    z5 = z2;
                } else {
                    z5 = false;
                }
                boolean z9 = h2 | z5;
                if (i12 == 256) {
                    z6 = z2;
                } else {
                    z6 = false;
                }
                boolean f2 = z9 | z6 | xq2Var.f(str) | xq2Var.d(kk3Var2.ordinal());
                Object P4 = xq2Var.P();
                if (!f2 && P4 != vs0Var) {
                    kk3Var = kk3Var2;
                } else {
                    P4 = new uj(c05Var2, on2Var4, g05Var, str, kk3Var2);
                    kk3Var = kk3Var2;
                    xq2Var.l0(P4);
                }
                mb3.n((on2) P4, xq2Var);
                boolean h3 = xq2Var.h(c05Var2);
                if ((i5 & 14) == 4) {
                    z7 = z2;
                } else {
                    z7 = false;
                }
                boolean z10 = h3 | z7;
                Object P5 = xq2Var.P();
                if (z10 || P5 == vs0Var) {
                    P5 = new qj(2, c05Var2, f05Var2);
                    xq2Var.l0(P5);
                }
                mb3.d(f05Var2, (qn2) P5, xq2Var);
                boolean h4 = xq2Var.h(c05Var2);
                Object P6 = xq2Var.P();
                if (h4 || P6 == vs0Var) {
                    P6 = new z(c05Var2, (r41) null, 5);
                    xq2Var.l0(P6);
                }
                mb3.i(xq2Var, (eo2) P6, c05Var2);
                boolean h5 = xq2Var.h(c05Var2);
                Object P7 = xq2Var.P();
                if (!h5 && P7 != vs0Var) {
                    i6 = 0;
                } else {
                    i6 = 0;
                    P7 = new wj(c05Var2, 0);
                    xq2Var.l0(P7);
                }
                a74 z11 = u24.z(x64.a, (qn2) P7);
                boolean h6 = xq2Var.h(c05Var2) | xq2Var.d(kk3Var.ordinal());
                Object P8 = xq2Var.P();
                if (h6 || P8 == vs0Var) {
                    P8 = new xj(i6, c05Var2, kk3Var);
                    xq2Var.l0(P8);
                }
                e34 e34Var = (e34) P8;
                int hashCode = Long.hashCode(xq2Var.T);
                xv4 l = xq2Var.l();
                a74 E = l.E(xq2Var, z11);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, ix0.f, e34Var);
                yh2.K(xq2Var, ix0.e, l);
                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                yh2.F(xq2Var, ix0.h);
                yh2.K(xq2Var, ix0.d, E);
                xq2Var.p(z2);
                on2Var3 = on2Var4;
            } else {
                xq2Var.V();
                on2Var3 = on2Var2;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new yj(f05Var2, on2Var3, g05Var, zv0Var, i, i2);
                return;
            }
            return;
        }
        on2Var2 = on2Var;
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        if (!xq2Var.S(i3 & 1, z)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final boolean b(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }
}
