package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xb1  reason: default package */
/* loaded from: classes.dex */
public abstract class xb1 {
    public static final dr4 a;

    static {
        boolean z;
        if (true & true) {
            z = false;
        } else {
            z = true;
        }
        a = new dr4(z, mx5.Inherit, true, 0);
    }

    public static final void a(mo6 mo6Var, zn6 zn6Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        Context context;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1904307118);
        if (sk2Var.f(mo6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (sk2Var.h(zn6Var)) {
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
        if (sk2Var.O(i5 & 1, z)) {
            if (Build.VERSION.SDK_INT >= 28) {
                sk2Var.X(-1009482584);
                context = (Context) sk2Var.j(ue.b);
                sk2Var.p(false);
            } else {
                sk2Var.X(-1009433480);
                sk2Var.p(false);
                context = null;
            }
            boolean h = sk2Var.h(zn6Var);
            if ((i5 & 14) != 4) {
                z2 = false;
            }
            boolean h2 = h | z2 | sk2Var.h(context);
            Object L = sk2Var.L();
            if (h2 || L == su0.a) {
                L = new cz(zn6Var, context, mo6Var);
                sk2Var.h0(L);
            }
            f11.b(null, null, (mi2) L, sk2Var, 0, 3);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new s4(i, 11, mo6Var, zn6Var);
        }
    }

    public static final void b(final int i, final int i2, final long j, tu0 tu0Var) {
        final int i3;
        int i4;
        boolean z;
        m55 r;
        aj2 aj2Var;
        boolean z2;
        int i5;
        int i6;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            if (sk2Var.d(i3)) {
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
            if (sk2Var.e(j)) {
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
        if (sk2Var.O(i4 & 1, z)) {
            Context context = (Context) sk2Var.j(ue.b);
            boolean f = sk2Var.f(context);
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z2 | f;
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (z4 || L == sn1Var) {
                L = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                sk2Var.h0(L);
            }
            int intValue = ((Number) L).intValue();
            if (intValue == -1) {
                r = sk2Var.r();
                if (r != null) {
                    aj2Var = new aj2() { // from class: vb1
                        @Override // defpackage.aj2
                        public final Object j(Object obj, Object obj2) {
                            int i7 = r5;
                            o27 o27Var = o27.a;
                            int i8 = i2;
                            long j2 = j;
                            int i9 = i3;
                            tu0 tu0Var2 = (tu0) obj;
                            ((Integer) obj2).intValue();
                            switch (i7) {
                                case 0:
                                    xb1.b(i9, ep2.I(i8 | 1), j2, tu0Var2);
                                    return o27Var;
                                default:
                                    xb1.b(i9, ep2.I(i8 | 1), j2, tu0Var2);
                                    return o27Var;
                            }
                        }
                    };
                    r.d = aj2Var;
                }
                return;
            }
            qi4 J = ve2.J(sk2Var, intValue);
            if ((i4 & 112) != 32) {
                z3 = false;
            }
            Object L2 = sk2Var.L();
            if (z3 || L2 == sn1Var) {
                if (j == 16) {
                    L2 = null;
                } else {
                    L2 = new b30(5, j);
                }
                sk2Var.h0(L2);
            }
            d50.a(ct3.E0(o76.h(wy3.a, d11.e), J, null, r01.b, RecyclerView.A1, (b30) L2, 22), sk2Var, 0);
        } else {
            sk2Var.R();
        }
        r = sk2Var.r();
        if (r != null) {
            aj2Var = new aj2() { // from class: vb1
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    int i7 = r5;
                    o27 o27Var = o27.a;
                    int i8 = i2;
                    long j2 = j;
                    int i9 = i;
                    tu0 tu0Var2 = (tu0) obj;
                    ((Integer) obj2).intValue();
                    switch (i7) {
                        case 0:
                            xb1.b(i9, ep2.I(i8 | 1), j2, tu0Var2);
                            return o27Var;
                        default:
                            xb1.b(i9, ep2.I(i8 | 1), j2, tu0Var2);
                            return o27Var;
                    }
                }
            };
            r.d = aj2Var;
        }
    }

    public static final void c(mo6 mo6Var, ao6 ao6Var, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean h;
        int i4;
        boolean h2;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-2040393164);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h2 = sk2Var.f(mo6Var);
            } else {
                h2 = sk2Var.h(mo6Var);
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
                h = sk2Var.f(ao6Var);
            } else {
                h = sk2Var.h(ao6Var);
            }
            if (h) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(ki2Var)) {
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
        if (sk2Var.O(i2 & 1, z)) {
            if ((i2 & 112) != 32 && ((i2 & 64) == 0 || !sk2Var.f(ao6Var))) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (z2 || L == sn1Var) {
                L = new et3(new b11(new p6(23, ao6Var, ki2Var)));
                sk2Var.h0(L);
            }
            et3 et3Var = (et3) L;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && sk2Var.h(mo6Var))) {
                z3 = true;
            }
            Object L2 = sk2Var.L();
            if (z3 || L2 == sn1Var) {
                L2 = new b5(23, mo6Var);
                sk2Var.h0(L2);
            }
            oj.a(et3Var, (ki2) L2, a, ct3.H0(1315155414, new s4(10, ao6Var, mo6Var), sk2Var), sk2Var, 3456, 0);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(mo6Var, ao6Var, ki2Var, i, 8);
        }
    }

    public static final void d(zy3 zy3Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1392105195);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(et0Var)) {
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
        if (sk2Var.O(i2 & 1, z)) {
            dk7.f(zy3Var, ko6.a, et0Var, sk2Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new wl(zy3Var, et0Var, i, 2);
        }
    }
}
