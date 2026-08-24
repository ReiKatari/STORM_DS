package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vf1  reason: default package */
/* loaded from: classes.dex */
public abstract class vf1 {
    public static final g05 a;

    static {
        boolean z;
        if (true & true) {
            z = false;
        } else {
            z = true;
        }
        a = new g05(z, y86.Inherit, true, 0);
    }

    public static final void a(x07 x07Var, l07 l07Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        Context context;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1904307118);
        if (xq2Var.f(x07Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (xq2Var.h(l07Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z2 = true;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i5 & 1, z)) {
            if (Build.VERSION.SDK_INT >= 28) {
                xq2Var.b0(-1009482584);
                context = (Context) xq2Var.j(kf.b);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-1009433480);
                xq2Var.p(false);
                context = null;
            }
            boolean h = xq2Var.h(l07Var);
            if ((i5 & 14) != 4) {
                z2 = false;
            }
            boolean h2 = h | z2 | xq2Var.h(context);
            Object P = xq2Var.P();
            if (h2 || P == ox0.a) {
                P = new t00((Object) l07Var, context, (Object) x07Var, 8);
                xq2Var.l0(P);
            }
            n41.b(null, null, (qn2) P, xq2Var, 0, 3);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ql1(x07Var, i, 11, l07Var);
        }
    }

    public static final void b(final int i, final long j, px0 px0Var, final int i2) {
        final int i3;
        int i4;
        boolean z;
        cf5 t;
        eo2 eo2Var;
        boolean z2;
        int i5;
        int i6;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            if (xq2Var.d(i3)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.e(j)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        boolean z3 = true;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i4 & 1, z)) {
            Context context = (Context) xq2Var.j(kf.b);
            boolean f = xq2Var.f(context);
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z2 | f;
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (z4 || P == vs0Var) {
                P = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                xq2Var.l0(P);
            }
            int intValue = ((Number) P).intValue();
            if (intValue == -1) {
                t = xq2Var.t();
                if (t != null) {
                    eo2Var = new eo2() { // from class: tf1
                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            int i7 = r5;
                            jg7 jg7Var = jg7.a;
                            int i8 = i2;
                            long j2 = j;
                            int i9 = i3;
                            px0 px0Var2 = (px0) obj;
                            ((Integer) obj2).intValue();
                            switch (i7) {
                                case 0:
                                    vf1.b(i9, j2, px0Var2, ii2.a0(i8 | 1));
                                    return jg7Var;
                                default:
                                    vf1.b(i9, j2, px0Var2, ii2.a0(i8 | 1));
                                    return jg7Var;
                            }
                        }
                    };
                    t.d = eo2Var;
                }
                return;
            }
            sr4 R = kj2.R(xq2Var, intValue);
            if ((i4 & 112) != 32) {
                z3 = false;
            }
            Object P2 = xq2Var.P();
            if (z3 || P2 == vs0Var) {
                if (j == 16) {
                    P2 = null;
                } else {
                    P2 = new z40(5, j);
                }
                xq2Var.l0(P2);
            }
            h70.a(ak7.u0(dj6.i(x64.a, l41.e), R, null, y31.b, RecyclerView.B1, (z40) P2, 22), xq2Var, 0);
        } else {
            xq2Var.V();
        }
        t = xq2Var.t();
        if (t != null) {
            eo2Var = new eo2() { // from class: tf1
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    int i7 = r5;
                    jg7 jg7Var = jg7.a;
                    int i8 = i2;
                    long j2 = j;
                    int i9 = i;
                    px0 px0Var2 = (px0) obj;
                    ((Integer) obj2).intValue();
                    switch (i7) {
                        case 0:
                            vf1.b(i9, j2, px0Var2, ii2.a0(i8 | 1));
                            return jg7Var;
                        default:
                            vf1.b(i9, j2, px0Var2, ii2.a0(i8 | 1));
                            return jg7Var;
                    }
                }
            };
            t.d = eo2Var;
        }
    }

    public static final void c(x07 x07Var, m07 m07Var, on2 on2Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean h;
        int i4;
        boolean h2;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-2040393164);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h2 = xq2Var.f(x07Var);
            } else {
                h2 = xq2Var.h(x07Var);
            }
            if (h2) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = xq2Var.f(m07Var);
            } else {
                h = xq2Var.h(m07Var);
            }
            if (h) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(on2Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        boolean z3 = false;
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !xq2Var.f(m07Var))) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (z2 || P == vs0Var) {
                P = new h04(new j41(new q6(23, m07Var, on2Var)));
                xq2Var.l0(P);
            }
            h04 h04Var = (h04) P;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && xq2Var.h(x07Var))) {
                z3 = true;
            }
            Object P2 = xq2Var.P();
            if (z3 || P2 == vs0Var) {
                P2 = new a5(x07Var, 24);
                xq2Var.l0(P2);
            }
            ak.a(h04Var, (on2) P2, a, n16.I(1315155414, new ql1(10, m07Var, x07Var), xq2Var), xq2Var, 3456, 0);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(x07Var, m07Var, on2Var, i, 8);
        }
    }

    public static final void d(a74 a74Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1392105195);
        if ((i & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(zv0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            nc1.v(a74Var, v07.a, zv0Var, xq2Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new im(a74Var, zv0Var, i, 2);
        }
    }
}
