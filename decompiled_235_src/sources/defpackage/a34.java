package defpackage;

import android.os.Trace;
import com.github.junrar.unpack.decode.Compress;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a34  reason: default package */
/* loaded from: classes.dex */
public final class a34 {
    public final sm3 a;
    public boolean c;
    public boolean d;
    public q21 i;
    public final bt b = new bt(15);
    public final ap3 e = new ap3(10);
    public final ua4 f = new ua4(new sm3[16]);
    public final long g = 1;
    public final ua4 h = new ua4(new y24[16]);

    public a34(sm3 sm3Var) {
        this.a = sm3Var;
    }

    public static final boolean a(a34 a34Var, sm3 sm3Var, boolean z) {
        q21 q21Var;
        boolean z2;
        cx4 placementScope;
        y53 y53Var;
        sm3 v;
        sm3 sm3Var2 = a34Var.a;
        boolean z3 = sm3Var.K0;
        wm3 wm3Var = sm3Var.C0;
        boolean z4 = false;
        if (!z3 && k(sm3Var)) {
            if (sm3Var == sm3Var2) {
                q21Var = a34Var.i;
                q21Var.getClass();
            } else {
                q21Var = null;
            }
            if (z) {
                if (wm3Var.e) {
                    z4 = c(sm3Var, q21Var);
                }
                if ((z4 || wm3Var.f) && nb3.k(sm3Var.J(), Boolean.TRUE)) {
                    sm3Var.K();
                }
            } else {
                if (sm3Var.q()) {
                    z2 = d(sm3Var, q21Var);
                } else {
                    z2 = false;
                }
                if (sm3Var.p() && (sm3Var == sm3Var2 || ((v = sm3Var.v()) != null && v.I() && wm3Var.p.p0))) {
                    if (sm3Var == sm3Var2) {
                        if (sm3Var.y0 == qm3.NotUsed) {
                            sm3Var.f();
                        }
                        sm3 v2 = sm3Var.v();
                        if (v2 == null || (y53Var = (y53) v2.B0.d) == null || (placementScope = y53Var.h0) == null) {
                            placementScope = ((te) vm3.a(sm3Var)).getPlacementScope();
                        }
                        cx4.l(placementScope, wm3Var.p, 0, 0);
                    } else {
                        sm3Var.R();
                    }
                    ap3 ap3Var = a34Var.e;
                    ap3Var.getClass();
                    if (sm3Var.J0 > 0) {
                        ((ua4) ap3Var.B).b(sm3Var);
                        sm3Var.I0 = true;
                    }
                }
                z4 = z2;
            }
            a34Var.e();
        }
        return z4;
    }

    public static boolean c(sm3 sm3Var, q21 q21Var) {
        q21 q21Var2;
        boolean F0;
        sm3 sm3Var2 = sm3Var.e0;
        wm3 wm3Var = sm3Var.C0;
        if (sm3Var2 == null) {
            return false;
        }
        if (q21Var != null) {
            if (sm3Var2 != null) {
                rz3 rz3Var = wm3Var.q;
                rz3Var.getClass();
                F0 = rz3Var.F0(q21Var.a);
            }
            F0 = false;
        } else {
            rz3 rz3Var2 = wm3Var.q;
            if (rz3Var2 != null) {
                q21Var2 = rz3Var2.j0;
            } else {
                q21Var2 = null;
            }
            if (q21Var2 != null && sm3Var2 != null) {
                rz3Var2.getClass();
                F0 = rz3Var2.F0(q21Var2.a);
            }
            F0 = false;
        }
        sm3 v = sm3Var.v();
        if (F0 && v != null) {
            if (v.e0 == null) {
                sm3.V(v, false, 3);
                return F0;
            } else if (sm3Var.t() == qm3.InMeasureBlock) {
                sm3.T(v, false, 3);
                return F0;
            } else if (sm3Var.t() == qm3.InLayoutBlock) {
                v.S(false);
            }
        }
        return F0;
    }

    public static boolean d(sm3 sm3Var, q21 q21Var) {
        q21 q21Var2;
        boolean z;
        if (q21Var != null) {
            if (sm3Var.y0 == qm3.NotUsed) {
                sm3Var.e();
            }
            z = sm3Var.C0.p.C0(q21Var.a);
        } else {
            d34 d34Var = sm3Var.C0.p;
            if (d34Var.f0) {
                q21Var2 = new q21(d34Var.R);
            } else {
                q21Var2 = null;
            }
            if (q21Var2 != null) {
                if (sm3Var.y0 == qm3.NotUsed) {
                    sm3Var.e();
                }
                z = sm3Var.C0.p.C0(q21Var2.a);
            } else {
                sm3Var.getClass();
                z = false;
            }
        }
        sm3 v = sm3Var.v();
        if (z && v != null) {
            if (sm3Var.s() == qm3.InMeasureBlock) {
                sm3.V(v, false, 3);
                return z;
            } else if (sm3Var.s() == qm3.InLayoutBlock) {
                v.U(false);
            }
        }
        return z;
    }

    public static boolean i(sm3 sm3Var) {
        rz3 rz3Var;
        tm3 tm3Var;
        if (sm3Var.C0.e) {
            if (sm3Var.t() != qm3.NotUsed || ((rz3Var = sm3Var.C0.q) != null && (tm3Var = rz3Var.n0) != null && tm3Var.e())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean j(sm3 sm3Var) {
        om3 om3Var;
        if (sm3Var.q()) {
            do {
                if (sm3Var.s() == qm3.NotUsed && !sm3Var.C0.p.t0.e()) {
                    sm3 v = sm3Var.v();
                    if (v != null) {
                        om3Var = v.C0.d;
                    } else {
                        om3Var = null;
                    }
                    if (om3Var != om3.Measuring) {
                        return false;
                    }
                }
                sm3Var = sm3Var.v();
                if (sm3Var == null) {
                    return false;
                }
            } while (!sm3Var.I());
            return true;
        }
        return false;
    }

    public static boolean k(sm3 sm3Var) {
        rz3 rz3Var;
        tm3 tm3Var;
        wm3 wm3Var = sm3Var.C0;
        if (sm3Var.I() || wm3Var.p.p0 || j(sm3Var) || nb3.k(sm3Var.J(), Boolean.TRUE) || i(sm3Var) || wm3Var.p.t0.e() || ((rz3Var = wm3Var.q) != null && (tm3Var = rz3Var.n0) != null && tm3Var.e())) {
            return true;
        }
        return false;
    }

    public final void b(boolean z) {
        ap3 ap3Var = this.e;
        if (z) {
            ua4 ua4Var = (ua4) ap3Var.B;
            sm3 sm3Var = this.a;
            if (sm3Var.J0 > 0) {
                ua4Var.g();
                ua4Var.b(sm3Var);
                sm3Var.I0 = true;
            }
        }
        if (((ua4) ap3Var.B).L != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                ap3Var.o();
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e() {
        ua4 ua4Var = this.h;
        int i = ua4Var.L;
        if (i != 0) {
            Object[] objArr = ua4Var.A;
            for (int i2 = 0; i2 < i; i2++) {
                y24 y24Var = (y24) objArr[i2];
                if (y24Var.a.H()) {
                    boolean z = y24Var.b;
                    sm3 sm3Var = y24Var.a;
                    boolean z2 = y24Var.c;
                    if (!z) {
                        sm3.V(sm3Var, z2, 2);
                    } else {
                        sm3.T(sm3Var, z2, 2);
                    }
                }
            }
            ua4Var.g();
        }
    }

    public final void f(sm3 sm3Var) {
        ua4 z = sm3Var.z();
        Object[] objArr = z.A;
        int i = z.L;
        for (int i2 = 0; i2 < i; i2++) {
            sm3 sm3Var2 = (sm3) objArr[i2];
            if (nb3.k(sm3Var2.J(), Boolean.TRUE) && !sm3Var2.K0) {
                if (this.b.B(sm3Var2)) {
                    sm3Var2.K();
                }
                f(sm3Var2);
            }
        }
    }

    public final void g(sm3 sm3Var, boolean z) {
        boolean q;
        if (!this.c) {
            p53.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z) {
            q = sm3Var.C0.e;
        } else {
            q = sm3Var.q();
        }
        if (q) {
            p53.a("node not yet measured");
        }
        h(sm3Var, z);
    }

    public final void h(sm3 sm3Var, boolean z) {
        boolean q;
        rz3 rz3Var;
        tm3 tm3Var;
        boolean q2;
        boolean q3;
        ua4 z2 = sm3Var.z();
        Object[] objArr = z2.A;
        int i = z2.L;
        for (int i2 = 0; i2 < i; i2++) {
            sm3 sm3Var2 = (sm3) objArr[i2];
            if ((!z && (sm3Var2.s() == qm3.InMeasureBlock || sm3Var2.C0.p.t0.e())) || (z && (sm3Var2.t() == qm3.InMeasureBlock || ((rz3Var = sm3Var2.C0.q) != null && (tm3Var = rz3Var.n0) != null && tm3Var.e())))) {
                boolean J = bl2.J(sm3Var2);
                wm3 wm3Var = sm3Var2.C0;
                if (J && !z) {
                    if (wm3Var.e && this.b.B(sm3Var2)) {
                        o(sm3Var2, true);
                    } else {
                        g(sm3Var2, true);
                    }
                }
                if (z) {
                    q2 = wm3Var.e;
                } else {
                    q2 = sm3Var2.q();
                }
                if (q2) {
                    o(sm3Var2, z);
                }
                if (z) {
                    q3 = wm3Var.e;
                } else {
                    q3 = sm3Var2.q();
                }
                if (!q3) {
                    h(sm3Var2, z);
                }
            }
        }
        if (z) {
            q = sm3Var.C0.e;
        } else {
            q = sm3Var.q();
        }
        if (q) {
            o(sm3Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean l(ke keVar) {
        boolean z;
        z64 z64Var;
        boolean z2;
        sm3 sm3Var;
        boolean z3;
        boolean o;
        bt btVar = this.b;
        sm3 sm3Var2 = this.a;
        if (!sm3Var2.H()) {
            p53.a("performMeasureAndLayout called with unattached root");
        }
        if (!sm3Var2.I()) {
            p53.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            p53.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean O = btVar.O();
                d51 d51Var = (d51) btVar.B;
                if (O) {
                    z = false;
                    while (true) {
                        d51 d51Var2 = (d51) btVar.R;
                        d51 d51Var3 = (d51) btVar.L;
                        if (!((fn6) d51Var.B).isEmpty()) {
                            sm3Var = (sm3) ((fn6) d51Var.B).first();
                            d51Var.o(sm3Var);
                            if (sm3Var.e0 != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z2 = false;
                        } else if (!((fn6) d51Var3.B).isEmpty()) {
                            sm3Var = (sm3) ((fn6) d51Var3.B).first();
                            d51Var3.o(sm3Var);
                            if (sm3Var.e0 != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z2 = true;
                        } else if (((fn6) d51Var2.B).isEmpty()) {
                            break;
                        } else {
                            sm3 sm3Var3 = (sm3) ((fn6) d51Var2.B).first();
                            d51Var2.o(sm3Var3);
                            z2 = true;
                            sm3Var = sm3Var3;
                            z3 = false;
                        }
                        if (z2) {
                            o = a(this, sm3Var, z3);
                        } else {
                            o = o(sm3Var, z3);
                            if (sm3Var.C0.f) {
                                btVar.y(sm3Var, wb3.LookaheadPlacement);
                            }
                            if (sm3Var.p()) {
                                btVar.y(sm3Var, wb3.Placement);
                            }
                        }
                        if (sm3Var == sm3Var2 && o) {
                            z = true;
                        }
                    }
                    if (keVar != null) {
                        keVar.c();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        ua4 ua4Var = this.f;
        Object[] objArr = ua4Var.A;
        int i = ua4Var.L;
        int i2 = 0;
        while (i2 < i) {
            if0 if0Var = ((sm3) objArr[i2]).B0;
            y53 y53Var = (y53) if0Var.d;
            boolean g = fg4.g(Compress.MAXWINSIZE);
            if (g) {
                z64Var = y53Var.P0;
            } else {
                z64Var = y53Var.P0.X;
                if (z64Var == null) {
                    i2++;
                    z4 = false;
                }
            }
            op5 op5Var = eg4.K0;
            z64 a1 = y53Var.a1(g);
            while (a1 != null && (a1.R & Compress.MAXWINSIZE) != 0) {
                if ((a1.L & Compress.MAXWINSIZE) != 0) {
                    z64 z64Var2 = a1;
                    ua4 ua4Var2 = null;
                    while (z64Var2 != null) {
                        if (z64Var2 instanceof kj3) {
                            ((kj3) z64Var2).m((y53) if0Var.d);
                        } else if ((z64Var2.L & Compress.MAXWINSIZE) != 0 && (z64Var2 instanceof zg1)) {
                            z64 z64Var3 = ((zg1) z64Var2).l0;
                            ?? r15 = z4;
                            while (z64Var3 != null) {
                                if ((z64Var3.L & Compress.MAXWINSIZE) != 0) {
                                    r15++;
                                    if (r15 == 1) {
                                        z64Var2 = z64Var3;
                                    } else {
                                        if (ua4Var2 == null) {
                                            ua4Var2 = new ua4(new z64[16]);
                                        }
                                        if (z64Var2 != null) {
                                            ua4Var2.b(z64Var2);
                                            z64Var2 = null;
                                        }
                                        ua4Var2.b(z64Var3);
                                    }
                                }
                                z64Var3 = z64Var3.Y;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z4 = false;
                            }
                        }
                        z64Var2 = nc1.A(ua4Var2);
                        z4 = false;
                    }
                }
                if (a1 != z64Var) {
                    a1 = a1.Y;
                    z4 = false;
                }
            }
            i2++;
            z4 = false;
        }
        ua4Var.g();
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:31:0x0072, B:33:0x007b, B:34:0x007e, B:37:0x008c, B:39:0x0094, B:40:0x0099, B:42:0x00a1, B:43:0x00a4, B:45:0x00aa, B:47:0x00b0, B:49:0x00bc, B:50:0x00c5, B:28:0x0063, B:30:0x006f), top: B:100:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:31:0x0072, B:33:0x007b, B:34:0x007e, B:37:0x008c, B:39:0x0094, B:40:0x0099, B:42:0x00a1, B:43:0x00a4, B:45:0x00aa, B:47:0x00b0, B:49:0x00bc, B:50:0x00c5, B:28:0x0063, B:30:0x006f), top: B:100:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:31:0x0072, B:33:0x007b, B:34:0x007e, B:37:0x008c, B:39:0x0094, B:40:0x0099, B:42:0x00a1, B:43:0x00a4, B:45:0x00aa, B:47:0x00b0, B:49:0x00bc, B:50:0x00c5, B:28:0x0063, B:30:0x006f), top: B:100:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:21:0x003a, B:23:0x005c, B:31:0x0072, B:33:0x007b, B:34:0x007e, B:37:0x008c, B:39:0x0094, B:40:0x0099, B:42:0x00a1, B:43:0x00a4, B:45:0x00aa, B:47:0x00b0, B:49:0x00bc, B:50:0x00c5, B:28:0x0063, B:30:0x006f), top: B:100:0x003a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(sm3 sm3Var, long j) {
        z64 z64Var;
        boolean C0;
        boolean z = sm3Var.K0;
        wm3 wm3Var = sm3Var.C0;
        if (z) {
            return;
        }
        sm3 sm3Var2 = this.a;
        if (sm3Var == sm3Var2) {
            p53.a("measureAndLayout called on root");
        }
        if (!sm3Var2.H()) {
            p53.a("performMeasureAndLayout called with unattached root");
        }
        if (!sm3Var2.I()) {
            p53.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            p53.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                bt btVar = this.b;
                ((d51) btVar.B).o(sm3Var);
                ((d51) btVar.L).o(sm3Var);
                ((d51) btVar.R).o(sm3Var);
                if (!c(sm3Var, new q21(j))) {
                    if (wm3Var.f) {
                    }
                    f(sm3Var);
                    if (sm3Var.y0 == qm3.NotUsed) {
                        sm3Var.e();
                    }
                    C0 = wm3Var.p.C0(j);
                    sm3 v = sm3Var.v();
                    if (C0 && v != null) {
                        if (sm3Var.s() != qm3.InMeasureBlock) {
                            sm3.V(v, false, 3);
                        } else if (sm3Var.s() == qm3.InLayoutBlock) {
                            v.U(false);
                        }
                    }
                    if (sm3Var.p() && sm3Var.I()) {
                        sm3Var.R();
                        ap3 ap3Var = this.e;
                        ap3Var.getClass();
                        if (sm3Var.J0 > 0) {
                            ((ua4) ap3Var.B).b(sm3Var);
                            sm3Var.I0 = true;
                        }
                    }
                    e();
                }
                if (nb3.k(sm3Var.J(), Boolean.TRUE)) {
                    sm3Var.K();
                }
                f(sm3Var);
                if (sm3Var.y0 == qm3.NotUsed) {
                }
                C0 = wm3Var.p.C0(j);
                sm3 v2 = sm3Var.v();
                if (C0) {
                    if (sm3Var.s() != qm3.InMeasureBlock) {
                    }
                }
                if (sm3Var.p()) {
                    sm3Var.R();
                    ap3 ap3Var2 = this.e;
                    ap3Var2.getClass();
                    if (sm3Var.J0 > 0) {
                    }
                }
                e();
            } finally {
            }
        }
        ua4 ua4Var = this.f;
        Object[] objArr = ua4Var.A;
        int i = ua4Var.L;
        for (int i2 = 0; i2 < i; i2++) {
            if0 if0Var = ((sm3) objArr[i2]).B0;
            y53 y53Var = (y53) if0Var.d;
            boolean g = fg4.g(Compress.MAXWINSIZE);
            if (g) {
                z64Var = y53Var.P0;
            } else {
                z64Var = y53Var.P0.X;
                if (z64Var == null) {
                }
            }
            op5 op5Var = eg4.K0;
            for (z64 a1 = y53Var.a1(g); a1 != null && (a1.R & Compress.MAXWINSIZE) != 0; a1 = a1.Y) {
                if ((a1.L & Compress.MAXWINSIZE) != 0) {
                    z64 z64Var2 = a1;
                    ua4 ua4Var2 = null;
                    while (z64Var2 != null) {
                        if (z64Var2 instanceof kj3) {
                            ((kj3) z64Var2).m((y53) if0Var.d);
                        } else if ((z64Var2.L & Compress.MAXWINSIZE) != 0 && (z64Var2 instanceof zg1)) {
                            int i3 = 0;
                            for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                if ((z64Var3.L & Compress.MAXWINSIZE) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        z64Var2 = z64Var3;
                                    } else {
                                        if (ua4Var2 == null) {
                                            ua4Var2 = new ua4(new z64[16]);
                                        }
                                        if (z64Var2 != null) {
                                            ua4Var2.b(z64Var2);
                                            z64Var2 = null;
                                        }
                                        ua4Var2.b(z64Var3);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        z64Var2 = nc1.A(ua4Var2);
                    }
                }
                if (a1 != z64Var) {
                }
            }
        }
        ua4Var.g();
    }

    public final void n() {
        boolean z;
        bt btVar = this.b;
        if (btVar.O()) {
            sm3 sm3Var = this.a;
            if (!sm3Var.H()) {
                p53.a("performMeasureAndLayout called with unattached root");
            }
            if (!sm3Var.I()) {
                p53.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                p53.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((fn6) ((d51) btVar.R).B).isEmpty() && !((fn6) ((d51) btVar.B).B).isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (sm3Var.e0 != null) {
                            q(sm3Var, true);
                        } else {
                            p(sm3Var);
                        }
                    }
                    q(sm3Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean o(sm3 sm3Var, boolean z) {
        q21 q21Var;
        boolean z2 = false;
        if (!sm3Var.K0 && k(sm3Var)) {
            if (sm3Var == this.a) {
                q21Var = this.i;
                q21Var.getClass();
            } else {
                q21Var = null;
            }
            if (z) {
                if (sm3Var.C0.e) {
                    z2 = c(sm3Var, q21Var);
                }
            } else if (sm3Var.q()) {
                z2 = d(sm3Var, q21Var);
            }
            e();
        }
        return z2;
    }

    public final void p(sm3 sm3Var) {
        ua4 z = sm3Var.z();
        Object[] objArr = z.A;
        int i = z.L;
        for (int i2 = 0; i2 < i; i2++) {
            sm3 sm3Var2 = (sm3) objArr[i2];
            if (sm3Var2.s() == qm3.InMeasureBlock || sm3Var2.C0.p.t0.e()) {
                if (bl2.J(sm3Var2)) {
                    q(sm3Var2, true);
                } else {
                    p(sm3Var2);
                }
            }
        }
    }

    public final void q(sm3 sm3Var, boolean z) {
        q21 q21Var;
        if (sm3Var.K0) {
            return;
        }
        if (sm3Var == this.a) {
            q21Var = this.i;
            q21Var.getClass();
        } else {
            q21Var = null;
        }
        if (z) {
            c(sm3Var, q21Var);
        } else {
            d(sm3Var, q21Var);
        }
    }

    public final boolean r(sm3 sm3Var, boolean z) {
        int i = z24.a[sm3Var.C0.d.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    if (!sm3Var.q() || z) {
                        sm3Var.C0.p.q0 = true;
                        if (!sm3Var.K0 && (sm3Var.I() || j(sm3Var))) {
                            sm3 v = sm3Var.v();
                            if (v == null || !v.q()) {
                                this.b.y(sm3Var, wb3.Measurement);
                            }
                            if (!this.d) {
                                return true;
                            }
                        }
                    }
                } else {
                    i.d();
                    return false;
                }
            } else {
                this.h.b(new y24(sm3Var, false, z));
            }
        }
        return false;
    }

    public final void s(long j) {
        boolean b;
        wb3 wb3Var;
        q21 q21Var = this.i;
        if (q21Var == null) {
            b = false;
        } else {
            b = q21.b(q21Var.a, j);
        }
        if (!b) {
            if (this.c) {
                p53.a("updateRootConstraints called while measuring");
            }
            this.i = new q21(j);
            sm3 sm3Var = this.a;
            sm3 sm3Var2 = sm3Var.e0;
            wm3 wm3Var = sm3Var.C0;
            if (sm3Var2 != null) {
                wm3Var.e = true;
            }
            wm3Var.p.q0 = true;
            if (sm3Var2 != null) {
                wb3Var = wb3.LookaheadMeasurement;
            } else {
                wb3Var = wb3.Measurement;
            }
            this.b.y(sm3Var, wb3Var);
        }
    }
}
