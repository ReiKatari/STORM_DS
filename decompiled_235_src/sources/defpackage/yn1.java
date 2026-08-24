package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yn1  reason: default package */
/* loaded from: classes.dex */
public abstract class yn1 extends zg1 implements yy4, a53, fy0, ur2 {
    public j97 A0;
    public kk C0;
    public z43 D0;
    public lo4 m0;
    public qn2 n0;
    public boolean o0;
    public r94 p0;
    public vr2 q0;
    public v80 r0;
    public ao1 s0;
    public boolean t0;
    public boolean u0;
    public an1 v0;
    public dn1 w0;
    public cn1 x0;
    public bn1 y0;
    public nb3 z0;
    public long B0 = 9205357640488583168L;
    public long E0 = 0;

    public yn1(qn2 qn2Var, boolean z, r94 r94Var, lo4 lo4Var) {
        this.m0 = lo4Var;
        this.n0 = qn2Var;
        this.o0 = z;
        this.p0 = r94Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U0(yn1 yn1Var, s41 s41Var) {
        un1 un1Var;
        int i;
        if (s41Var instanceof un1) {
            un1Var = (un1) s41Var;
            int i2 = un1Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                un1Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = un1Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = un1Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ao1 ao1Var = yn1Var.s0;
                    if (ao1Var != null) {
                        r94 r94Var = yn1Var.p0;
                        if (r94Var != null) {
                            zn1 zn1Var = new zn1(ao1Var);
                            un1Var.Y = 1;
                            if (r94Var.a(zn1Var, un1Var) == x61Var) {
                                return x61Var;
                            }
                        }
                    }
                    yn1Var.e1(new hn1(0L, false));
                    return jg7.a;
                }
                yn1Var.s0 = null;
                yn1Var.e1(new hn1(0L, false));
                return jg7.a;
            }
        }
        un1Var = new un1(yn1Var, s41Var);
        Object obj2 = un1Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = un1Var.Y;
        if (i == 0) {
        }
        yn1Var.s0 = null;
        yn1Var.e1(new hn1(0L, false));
        return jg7.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r2.a(r5, r0) == r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Type inference failed for: r8v4, types: [ao1, java.lang.Object, t93] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object V0(yn1 yn1Var, gn1 gn1Var, s41 s41Var) {
        vn1 vn1Var;
        int i;
        r94 r94Var;
        gn1 gn1Var2;
        ao1 ao1Var;
        ao1 ao1Var2;
        if (s41Var instanceof vn1) {
            vn1Var = (vn1) s41Var;
            int i2 = vn1Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vn1Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = vn1Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = vn1Var.d0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ao1Var = vn1Var.X;
                            gn1Var2 = vn1Var.R;
                            oi2.Y(obj);
                            ao1Var2 = ao1Var;
                            gn1Var = gn1Var2;
                            yn1Var.s0 = ao1Var2;
                            yn1Var.d1(gn1Var.a);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    gn1Var = vn1Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    ao1 ao1Var3 = yn1Var.s0;
                    if (ao1Var3 != null && (r2 = yn1Var.p0) != null) {
                        zn1 zn1Var = new zn1(ao1Var3);
                        vn1Var.R = gn1Var;
                        vn1Var.d0 = 1;
                    }
                }
                ?? obj2 = new Object();
                r94Var = yn1Var.p0;
                ao1Var2 = obj2;
                if (r94Var != 0) {
                    vn1Var.R = gn1Var;
                    vn1Var.X = obj2;
                    vn1Var.d0 = 2;
                    if (r94Var.a(obj2, vn1Var) != x61Var) {
                        gn1Var2 = gn1Var;
                        ao1Var = obj2;
                        ao1Var2 = ao1Var;
                        gn1Var = gn1Var2;
                    }
                    return x61Var;
                }
                yn1Var.s0 = ao1Var2;
                yn1Var.d1(gn1Var.a);
                return jg7.a;
            }
        }
        vn1Var = new vn1(yn1Var, s41Var);
        Object obj3 = vn1Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = vn1Var.d0;
        if (i == 0) {
        }
        ?? obj22 = new Object();
        r94Var = yn1Var.p0;
        ao1Var2 = obj22;
        if (r94Var != 0) {
        }
        yn1Var.s0 = ao1Var2;
        yn1Var.d1(gn1Var.a);
        return jg7.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W0(yn1 yn1Var, hn1 hn1Var, s41 s41Var) {
        wn1 wn1Var;
        int i;
        if (s41Var instanceof wn1) {
            wn1Var = (wn1) s41Var;
            int i2 = wn1Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wn1Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = wn1Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = wn1Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        hn1Var = wn1Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ao1 ao1Var = yn1Var.s0;
                    if (ao1Var != null) {
                        r94 r94Var = yn1Var.p0;
                        if (r94Var != null) {
                            bo1 bo1Var = new bo1(ao1Var);
                            wn1Var.R = hn1Var;
                            wn1Var.Z = 1;
                            if (r94Var.a(bo1Var, wn1Var) == x61Var) {
                                return x61Var;
                            }
                        }
                    }
                    yn1Var.e1(hn1Var);
                    return jg7.a;
                }
                yn1Var.s0 = null;
                yn1Var.e1(hn1Var);
                return jg7.a;
            }
        }
        wn1Var = new wn1(yn1Var, s41Var);
        Object obj2 = wn1Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = wn1Var.Z;
        if (i == 0) {
        }
        yn1Var.s0 = null;
        yn1Var.e1(hn1Var);
        return jg7.a;
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [cn1, java.lang.Object] */
    public static void b1(yn1 yn1Var, vy4 vy4Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        cn1 cn1Var = yn1Var.x0;
        cn1 cn1Var2 = cn1Var;
        if (cn1Var == null) {
            ?? obj = new Object();
            obj.x = null;
            obj.y = Long.MAX_VALUE;
            obj.z = false;
            yn1Var.x0 = obj;
            cn1Var2 = obj;
        }
        cn1Var2.x = vy4Var;
        cn1Var2.y = j;
        kk kkVar = yn1Var.C0;
        lo4 lo4Var = yn1Var.m0;
        if (kkVar == null) {
            yn1Var.C0 = new kk(lo4Var);
        } else {
            kkVar.L = lo4Var;
            kkVar.B = j2;
        }
        cn1Var2.z = false;
        yn1Var.z0 = cn1Var2;
    }

    @Override // defpackage.yy4
    public final void I() {
        if (this.u0) {
            Z0();
            if (this.t0) {
                f1().c(en1.a);
            }
            this.A0 = null;
        }
        this.u0 = false;
    }

    @Override // defpackage.z64
    public final void K0() {
        this.t0 = false;
        X0();
        this.E0 = 0L;
        vr2 vr2Var = this.q0;
        if (vr2Var != null) {
            S0(vr2Var);
        }
        this.q0 = null;
    }

    @Override // defpackage.ur2
    public final boolean V(vy4 vy4Var) {
        int i;
        if (ej2.n(vy4Var)) {
            return this.o0;
        }
        if (!ej2.p(vy4Var)) {
            if (this.C0 == null) {
                this.C0 = new kk(this.m0);
            }
            float f = ((fo7) hf.K(this, ky0.t)).f();
            long R = ej2.R(vy4Var, false);
            kk kkVar = this.C0;
            if (kkVar != null) {
                if (!jk4.c(kkVar.e(f, R, false), 9205357640488583168L)) {
                    long f2 = jk4.f(kkVar.B, R);
                    double atan2 = (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (f2 & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (f2 >> 32))))) * 180.0f) / 3.141592653589793d;
                    lo4 lo4Var = (lo4) kkVar.L;
                    if (lo4Var == null) {
                        i = -1;
                    } else {
                        i = t87.a[lo4Var.ordinal()];
                    }
                    if (i == 1 ? atan2 < 30.0d : !(i != 2 || atan2 <= 30.0d)) {
                        return true;
                    }
                }
            } else {
                i.h("Touch slop detector not initialized.");
                return false;
            }
        }
        return false;
    }

    public final void X0() {
        ao1 ao1Var = this.s0;
        if (ao1Var != null) {
            r94 r94Var = this.p0;
            if (r94Var != null) {
                r94Var.b(new zn1(ao1Var));
            }
            this.s0 = null;
        }
    }

    public abstract Object Y0(xn1 xn1Var, xn1 xn1Var2);

    /* JADX WARN: Type inference failed for: r0v2, types: [an1, java.lang.Object] */
    public final void Z0() {
        an1 an1Var = this.v0;
        an1 an1Var2 = an1Var;
        if (an1Var == null) {
            zm1 zm1Var = zm1.NotInitialized;
            ?? obj = new Object();
            obj.x = zm1Var;
            obj.y = false;
            this.v0 = obj;
            an1Var2 = obj;
        }
        an1Var2.x = zm1.NotInitialized;
        an1Var2.y = false;
        this.z0 = an1Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [bn1, java.lang.Object] */
    public final void a1(vy4 vy4Var, long j, kk kkVar) {
        bn1 bn1Var = this.y0;
        bn1 bn1Var2 = bn1Var;
        if (bn1Var == null) {
            ?? obj = new Object();
            obj.x = null;
            obj.y = Long.MAX_VALUE;
            this.y0 = obj;
            bn1Var2 = obj;
        }
        bn1Var2.x = vy4Var;
        bn1Var2.y = j;
        kkVar.B = 0L;
        this.z0 = bn1Var2;
    }

    public final void c1(in1 in1Var) {
        if ((in1Var instanceof gn1) && !this.t0) {
            this.t0 = true;
            k1();
        }
        f1().c(in1Var);
    }

    public abstract void d1(long j);

    public abstract void e1(hn1 hn1Var);

    @Override // defpackage.a53
    public final void f0() {
        z43 z43Var = this.D0;
        if (z43Var != null) {
            z43Var.a();
            yn1 yn1Var = z43Var.a;
            if (yn1Var.t0) {
                yn1Var.c1(en1.a);
            }
            z43Var.g = null;
            zb zbVar = z43Var.k;
            zbVar.B = 0;
            ((t94) zbVar.L).b = 0;
        }
    }

    public final ul0 f1() {
        v80 v80Var = this.r0;
        if (v80Var != null) {
            return v80Var;
        }
        i.h("Events channel not initialized.");
        return null;
    }

    public final j97 g1() {
        j97 j97Var = this.A0;
        if (j97Var != null) {
            return j97Var;
        }
        i.h("Velocity Tracker not initialized.");
        return null;
    }

    public final void h1(long j, vy4 vy4Var) {
        long w = nc1.e0(this.A).w(0L);
        if (!jk4.c(this.B0, 9205357640488583168L) && !jk4.c(w, this.B0)) {
            this.E0 = jk4.f(this.E0, jk4.e(w, this.B0));
        }
        this.B0 = w;
        mp2.h(g1(), vy4Var, this.E0);
        f1().c(new fn1(j, false));
    }

    public final void i1(vy4 vy4Var, vy4 vy4Var2, long j) {
        if (this.A0 == null) {
            this.A0 = new j97();
        }
        mp2.h(g1(), vy4Var, 0L);
        long e = jk4.e(vy4Var2.c, j);
        this.E0 = 0L;
        if (((Boolean) this.n0.g(new bz4(vy4Var.i))).booleanValue()) {
            if (!this.t0) {
                if (this.r0 == null) {
                    this.r0 = nb3.c(Integer.MAX_VALUE, null, null, 6);
                }
                k1();
            }
            this.B0 = nc1.e0(this).w(0L);
            f1().c(new gn1(e));
        }
    }

    public abstract boolean j1();

    public final void k1() {
        this.t0 = true;
        if (this.r0 == null) {
            this.r0 = nb3.c(Integer.MAX_VALUE, null, null, 6);
        }
        hv.L(F0(), null, null, new xn1(this, null), 3);
    }

    public final void l1(qn2 qn2Var, boolean z, r94 r94Var, lo4 lo4Var, boolean z2) {
        this.n0 = qn2Var;
        boolean z3 = true;
        if (this.o0 != z) {
            this.o0 = z;
            if (!z) {
                X0();
                this.D0 = null;
            }
            z2 = true;
        }
        if (!nb3.k(this.p0, r94Var)) {
            X0();
            this.p0 = r94Var;
        }
        if (this.m0 != lo4Var) {
            this.m0 = lo4Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.u0;
            en1 en1Var = en1.a;
            if (z4) {
                Z0();
                if (this.t0) {
                    f1().c(en1Var);
                }
                this.A0 = null;
            }
            z43 z43Var = this.D0;
            if (z43Var != null) {
                z43Var.a();
                yn1 yn1Var = z43Var.a;
                if (yn1Var.t0) {
                    yn1Var.c1(en1Var);
                }
                z43Var.g = null;
                zb zbVar = z43Var.k;
                zbVar.B = 0;
                ((t94) zbVar.L).b = 0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0, types: [ur2, zg1, yn1] */
    /* JADX WARN: Type inference failed for: r2v16, types: [np2, x43] */
    /* JADX WARN: Type inference failed for: r3v10, types: [np2, x43] */
    /* JADX WARN: Type inference failed for: r4v15, types: [np2, u43] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object] */
    @Override // defpackage.a53
    public final void u(ei eiVar, py4 py4Var) {
        ?? r13;
        Object obj;
        Object obj2;
        Object obj3;
        t43 t43Var;
        int i = eiVar.B;
        ArrayList arrayList = (ArrayList) eiVar.L;
        if (this.q0 == null) {
            vr2 vr2Var = new vr2(this);
            R0(vr2Var);
            this.q0 = vr2Var;
        }
        if (this.o0) {
            if (this.D0 == null) {
                this.D0 = new z43(this);
            }
            z43 z43Var = this.D0;
            if (z43Var != null) {
                yn1 yn1Var = z43Var.a;
                if (z43Var.f == null) {
                    u43 u43Var = z43Var.b;
                    u43 u43Var2 = u43Var;
                    if (u43Var == null) {
                        t43 t43Var2 = t43.NotInitialized;
                        ?? np2Var = new np2(2);
                        np2Var.e = t43Var2;
                        np2Var.f = false;
                        z43Var.b = np2Var;
                        u43Var2 = np2Var;
                    }
                    z43Var.f = u43Var2;
                }
                np2 np2Var2 = z43Var.f;
                if (np2Var2 != null) {
                    boolean z = true;
                    if (np2Var2 instanceof u43) {
                        u43 u43Var3 = (u43) np2Var2;
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                if (!jx2.k((s43) arrayList.get(i2))) {
                                    return;
                                }
                            }
                            s43 s43Var = (s43) gt0.H0(arrayList);
                            if (y43.a[u43Var3.e.ordinal()] == 1) {
                                if (!yn1Var.j1()) {
                                    t43Var = t43.Yes;
                                } else {
                                    t43Var = t43.No;
                                }
                            } else {
                                t43Var = u43Var3.e;
                            }
                            u43Var3.e = t43Var;
                            if (py4Var == py4.Initial && t43Var == t43.No) {
                                s43Var.i = true;
                                u43Var3.f = true;
                            }
                            if (py4Var == py4.Main) {
                                if (t43Var == t43.Yes) {
                                    z43.c(z43Var, s43Var, s43Var.a, 0L, 12);
                                    return;
                                } else if (u43Var3.f) {
                                    z43Var.f(s43Var, s43Var, new r43(i), 0L);
                                    z43Var.e(s43Var, new r43(i), 0L);
                                    long j = s43Var.a;
                                    x43 x43Var = z43Var.c;
                                    x43 x43Var2 = x43Var;
                                    if (x43Var == null) {
                                        ?? np2Var3 = new np2(2);
                                        np2Var3.e = Long.MAX_VALUE;
                                        z43Var.c = np2Var3;
                                        x43Var2 = np2Var3;
                                    }
                                    x43Var2.e = j;
                                    z43Var.f = x43Var2;
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    s43 s43Var2 = null;
                    if (np2Var2 instanceof w43) {
                        w43 w43Var = (w43) np2Var2;
                        if (py4Var != py4.Initial) {
                            int size2 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                    obj2 = arrayList.get(i3);
                                    if (nj2.o(((s43) obj2).a, w43Var.f)) {
                                        break;
                                    }
                                    i3++;
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            s43 s43Var3 = (s43) obj2;
                            if (s43Var3 == null) {
                                int size3 = arrayList.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 < size3) {
                                        obj3 = arrayList.get(i4);
                                        if (((s43) obj3).d) {
                                            break;
                                        }
                                        i4++;
                                    } else {
                                        obj3 = null;
                                        break;
                                    }
                                }
                                s43Var3 = (s43) obj3;
                                if (s43Var3 == null) {
                                    z43Var.a();
                                    return;
                                }
                                w43Var.f = s43Var3.a;
                            }
                            s43 s43Var4 = s43Var3;
                            if (py4Var == py4.Main) {
                                if (!s43Var4.i) {
                                    if (jx2.i(s43Var4)) {
                                        int size4 = arrayList.size();
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 >= size4) {
                                                break;
                                            }
                                            ?? r6 = arrayList.get(i5);
                                            if (((s43) r6).d) {
                                                s43Var2 = r6;
                                                break;
                                            }
                                            i5++;
                                        }
                                        s43 s43Var5 = s43Var2;
                                        if (s43Var5 == null) {
                                            z43Var.a();
                                        } else {
                                            w43Var.f = s43Var5.a;
                                        }
                                    } else {
                                        float f = sn1.a;
                                        float f2 = ((fo7) hf.K(yn1Var, ky0.t)).f();
                                        kk kkVar = z43Var.i;
                                        if (kkVar != null) {
                                            long e = kkVar.e(f2, jx2.H(s43Var4, yn1Var.m0, new r43(i), true), true);
                                            if ((9223372034707292159L & e) != 9205357640488583168L) {
                                                s43Var4.i = true;
                                                s43 s43Var6 = w43Var.e;
                                                s43Var6.getClass();
                                                z43Var.f(s43Var6, s43Var4, new r43(i), e);
                                                z43Var.e(s43Var4, new r43(i), e);
                                                long j2 = s43Var4.a;
                                                x43 x43Var3 = z43Var.c;
                                                x43 x43Var4 = x43Var3;
                                                if (x43Var3 == null) {
                                                    ?? np2Var4 = new np2(2);
                                                    np2Var4.e = Long.MAX_VALUE;
                                                    z43Var.c = np2Var4;
                                                    x43Var4 = np2Var4;
                                                }
                                                x43Var4.e = j2;
                                                z43Var.f = x43Var4;
                                            } else {
                                                w43Var.g = true;
                                            }
                                        } else {
                                            i.h("Touch slop detector not initialized.");
                                            return;
                                        }
                                    }
                                } else {
                                    s43 s43Var7 = w43Var.e;
                                    if (s43Var7 != null) {
                                        long j3 = w43Var.f;
                                        kk kkVar2 = z43Var.i;
                                        if (kkVar2 != null) {
                                            z43Var.b(s43Var7, j3, kkVar2);
                                        } else {
                                            i.h("AwaitTouchSlop.touchSlopDetector was not initialized");
                                            return;
                                        }
                                    } else {
                                        i.h("AwaitTouchSlop.initialDown was not initialized");
                                        return;
                                    }
                                }
                            }
                            if (py4Var == py4.Final && w43Var.g) {
                                if (s43Var4.i) {
                                    s43 s43Var8 = w43Var.e;
                                    if (s43Var8 != null) {
                                        long j4 = w43Var.f;
                                        kk kkVar3 = z43Var.i;
                                        if (kkVar3 != null) {
                                            z43Var.b(s43Var8, j4, kkVar3);
                                            return;
                                        } else {
                                            i.h("AwaitTouchSlop.touchSlopDetector was not initialized");
                                            return;
                                        }
                                    }
                                    i.h("AwaitTouchSlop.initialDown was not initialized");
                                    return;
                                }
                                w43Var.g = false;
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (np2Var2 instanceof v43) {
                        v43 v43Var = (v43) np2Var2;
                        if (py4Var == py4.Final) {
                            int size5 = arrayList.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size5) {
                                    break;
                                } else if (((s43) arrayList.get(i6)).i) {
                                    z = false;
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                            int size6 = arrayList.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size6) {
                                    break;
                                } else if (((s43) arrayList.get(i7)).d) {
                                    if (!arrayList.isEmpty()) {
                                        if (z) {
                                            long I = jx2.I((s43) gt0.H0(arrayList), yn1Var.m0, new r43(i));
                                            s43 s43Var9 = v43Var.e;
                                            s43Var9.getClass();
                                            long e2 = jk4.e(I, jx2.I(s43Var9, yn1Var.m0, new r43(i)));
                                            s43 s43Var10 = v43Var.e;
                                            if (s43Var10 != null) {
                                                z43.c(z43Var, s43Var10, v43Var.f, e2, 8);
                                                return;
                                            } else {
                                                i.h("AwaitGesturePickup.initialDown was not initialized.");
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                } else {
                                    i7++;
                                }
                            }
                            z43Var.a();
                            return;
                        }
                        return;
                    } else if (np2Var2 instanceof x43) {
                        x43 x43Var5 = (x43) np2Var2;
                        if (py4Var == py4.Main) {
                            long j5 = x43Var5.e;
                            int size7 = arrayList.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 < size7) {
                                    r13 = arrayList.get(i8);
                                    if (nj2.o(((s43) r13).a, j5)) {
                                        break;
                                    }
                                    i8++;
                                } else {
                                    r13 = 0;
                                    break;
                                }
                            }
                            s43 s43Var11 = r13;
                            if (s43Var11 != null) {
                                boolean i9 = jx2.i(s43Var11);
                                en1 en1Var = en1.a;
                                if (i9) {
                                    int size8 = arrayList.size();
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < size8) {
                                            obj = arrayList.get(i10);
                                            if (((s43) obj).d) {
                                                break;
                                            }
                                            i10++;
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    s43 s43Var12 = (s43) obj;
                                    if (s43Var12 == null) {
                                        if (!s43Var11.i && jx2.i(s43Var11)) {
                                            jx2.h(z43Var.d(), s43Var11, yn1Var.m0, new r43(i), z43Var.j, z43Var.l);
                                            float e3 = ((fo7) hf.K(yn1Var, ky0.t)).e();
                                            long c = z43Var.d().c(qo2.k(e3, e3));
                                            bg1 bg1Var = (bg1) z43Var.d().B;
                                            rl7 rl7Var = (rl7) bg1Var.B;
                                            fv.z0(0, r8.length, null, rl7Var.d);
                                            rl7Var.e = 0;
                                            rl7 rl7Var2 = (rl7) bg1Var.L;
                                            fv.z0(0, r11.length, null, rl7Var2.d);
                                            rl7Var2.e = 0;
                                            bg1Var.A = 0L;
                                            yn1Var.c1(new hn1(eo1.b(c), true));
                                        } else {
                                            yn1Var.c1(en1Var);
                                        }
                                        z43Var.a();
                                        return;
                                    }
                                    x43Var5.e = s43Var12.a;
                                    return;
                                } else if (s43Var11.i) {
                                    yn1Var.c1(en1Var);
                                    return;
                                } else if (jk4.d(jx2.H(s43Var11, yn1Var.m0, new r43(i), true)) != RecyclerView.B1) {
                                    z43Var.e(s43Var11, new r43(i), jx2.H(s43Var11, yn1Var.m0, new r43(i), false));
                                    s43Var11.i = true;
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } else {
                        i.d();
                        return;
                    }
                }
                i.h("currentDragState should not be null");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v38, types: [dn1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17, types: [dn1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [an1, java.lang.Object] */
    public void w(oy4 oy4Var, py4 py4Var, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        vr2 vr2Var;
        boolean z;
        Object obj4;
        zm1 zm1Var;
        boolean z2 = true;
        this.u0 = true;
        if (this.q0 == null) {
            vr2 vr2Var2 = new vr2(this);
            R0(vr2Var2);
            this.q0 = vr2Var2;
        }
        if (this.o0) {
            int i = 0;
            if (this.z0 == null) {
                an1 an1Var = this.v0;
                an1 an1Var2 = an1Var;
                if (an1Var == null) {
                    zm1 zm1Var2 = zm1.NotInitialized;
                    ?? obj5 = new Object();
                    obj5.x = zm1Var2;
                    obj5.y = false;
                    this.v0 = obj5;
                    an1Var2 = obj5;
                }
                this.z0 = an1Var2;
            }
            nb3 nb3Var = this.z0;
            if (nb3Var != null) {
                if (nb3Var instanceof an1) {
                    an1 an1Var3 = (an1) nb3Var;
                    if (!oy4Var.a.isEmpty() && hz6.e(oy4Var, false)) {
                        vy4 vy4Var = (vy4) gt0.H0(oy4Var.a);
                        if (tn1.a[an1Var3.x.ordinal()] == 1) {
                            if (!j1()) {
                                zm1Var = zm1.Yes;
                            } else {
                                zm1Var = zm1.No;
                            }
                        } else {
                            zm1Var = an1Var3.x;
                        }
                        an1Var3.x = zm1Var;
                        if (py4Var == py4.Initial && zm1Var == zm1.No) {
                            vy4Var.a();
                            an1Var3.y = true;
                        }
                        if (py4Var == py4.Main) {
                            if (zm1Var == zm1.Yes) {
                                b1(this, vy4Var, vy4Var.a, 0L, 12);
                                return;
                            } else if (an1Var3.y) {
                                i1(vy4Var, vy4Var, 0L);
                                h1(0L, vy4Var);
                                long j2 = vy4Var.a;
                                dn1 dn1Var = this.w0;
                                dn1 dn1Var2 = dn1Var;
                                if (dn1Var == null) {
                                    ?? obj6 = new Object();
                                    obj6.x = Long.MAX_VALUE;
                                    this.w0 = obj6;
                                    dn1Var2 = obj6;
                                }
                                dn1Var2.x = j2;
                                this.z0 = dn1Var2;
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                ur2 ur2Var = null;
                if (nb3Var instanceof cn1) {
                    cn1 cn1Var = (cn1) nb3Var;
                    if (py4Var != py4.Initial) {
                        List list = oy4Var.a;
                        int size = list.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                obj3 = list.get(i2);
                                if (nj2.o(((vy4) obj3).a, cn1Var.y)) {
                                    break;
                                }
                                i2++;
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                        vy4 vy4Var2 = (vy4) obj3;
                        if (vy4Var2 == null) {
                            int size2 = list.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 < size2) {
                                    obj4 = list.get(i3);
                                    if (((vy4) obj4).d) {
                                        break;
                                    }
                                    i3++;
                                } else {
                                    obj4 = null;
                                    break;
                                }
                            }
                            vy4Var2 = (vy4) obj4;
                            if (vy4Var2 == null) {
                                Z0();
                                return;
                            }
                            cn1Var.y = vy4Var2.a;
                        }
                        if (py4Var == py4.Main) {
                            if (!vy4Var2.c()) {
                                if (ej2.p(vy4Var2)) {
                                    int size3 = list.size();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= size3) {
                                            break;
                                        }
                                        Object obj7 = list.get(i4);
                                        if (((vy4) obj7).d) {
                                            ur2Var = obj7;
                                            break;
                                        }
                                        i4++;
                                    }
                                    vy4 vy4Var3 = (vy4) ur2Var;
                                    if (vy4Var3 == null) {
                                        Z0();
                                    } else {
                                        cn1Var.y = vy4Var3.a;
                                    }
                                } else {
                                    float g = sn1.g((fo7) hf.K(this, ky0.t), vy4Var2.i);
                                    kk kkVar = this.C0;
                                    if (kkVar != null) {
                                        long e = kkVar.e(g, ej2.R(vy4Var2, true), true);
                                        if ((9223372034707292159L & e) != 9205357640488583168L) {
                                            boolean V = V(vy4Var2);
                                            ub7 t = ii2.t(this, vr2.l0);
                                            if (t instanceof vr2) {
                                                vr2Var = (vr2) t;
                                            } else {
                                                vr2Var = null;
                                            }
                                            if (vr2Var != null) {
                                                ur2Var = vr2Var.k0;
                                            }
                                            if (ur2Var != null && ur2Var.V(vy4Var2)) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (!V && z) {
                                                cn1Var.z = true;
                                            } else {
                                                vy4Var2.a();
                                                vy4 vy4Var4 = cn1Var.x;
                                                vy4Var4.getClass();
                                                i1(vy4Var4, vy4Var2, e);
                                                h1(e, vy4Var2);
                                                long j3 = vy4Var2.a;
                                                dn1 dn1Var3 = this.w0;
                                                dn1 dn1Var4 = dn1Var3;
                                                if (dn1Var3 == null) {
                                                    ?? obj8 = new Object();
                                                    obj8.x = Long.MAX_VALUE;
                                                    this.w0 = obj8;
                                                    dn1Var4 = obj8;
                                                }
                                                dn1Var4.x = j3;
                                                this.z0 = dn1Var4;
                                            }
                                        } else {
                                            cn1Var.z = true;
                                        }
                                    } else {
                                        i.h("Touch slop detector not initialized.");
                                        return;
                                    }
                                }
                            } else {
                                vy4 vy4Var5 = cn1Var.x;
                                if (vy4Var5 != null) {
                                    long j4 = cn1Var.y;
                                    kk kkVar2 = this.C0;
                                    if (kkVar2 != null) {
                                        a1(vy4Var5, j4, kkVar2);
                                    } else {
                                        i.h("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        return;
                                    }
                                } else {
                                    i.h("AwaitTouchSlop.initialDown was not initialized");
                                    return;
                                }
                            }
                        }
                        if (py4Var == py4.Final && cn1Var.z) {
                            if (vy4Var2.c()) {
                                vy4 vy4Var6 = cn1Var.x;
                                if (vy4Var6 != null) {
                                    long j5 = cn1Var.y;
                                    kk kkVar3 = this.C0;
                                    if (kkVar3 != null) {
                                        a1(vy4Var6, j5, kkVar3);
                                        return;
                                    } else {
                                        i.h("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        return;
                                    }
                                }
                                i.h("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            cn1Var.z = false;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (nb3Var instanceof bn1) {
                    bn1 bn1Var = (bn1) nb3Var;
                    if (py4Var == py4.Final) {
                        List list2 = oy4Var.a;
                        int size4 = list2.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size4) {
                                break;
                            } else if (((vy4) list2.get(i5)).c()) {
                                z2 = false;
                                break;
                            } else {
                                i5++;
                            }
                        }
                        int size5 = list2.size();
                        while (true) {
                            if (i >= size5) {
                                break;
                            } else if (((vy4) list2.get(i)).d) {
                                if (!list2.isEmpty()) {
                                    if (z2) {
                                        long j6 = ((vy4) gt0.H0(list2)).c;
                                        vy4 vy4Var7 = bn1Var.x;
                                        vy4Var7.getClass();
                                        long e2 = jk4.e(j6, vy4Var7.c);
                                        vy4 vy4Var8 = bn1Var.x;
                                        if (vy4Var8 != null) {
                                            b1(this, vy4Var8, bn1Var.y, e2, 8);
                                            return;
                                        } else {
                                            i.h("AwaitGesturePickup.initialDown was not initialized.");
                                            return;
                                        }
                                    }
                                    return;
                                }
                            } else {
                                i++;
                            }
                        }
                        Z0();
                        return;
                    }
                    return;
                } else if (nb3Var instanceof dn1) {
                    dn1 dn1Var5 = (dn1) nb3Var;
                    if (py4Var == py4.Main) {
                        long j7 = dn1Var5.x;
                        List list3 = oy4Var.a;
                        int size6 = list3.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 < size6) {
                                obj = list3.get(i6);
                                if (nj2.o(((vy4) obj).a, j7)) {
                                    break;
                                }
                                i6++;
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        vy4 vy4Var9 = (vy4) obj;
                        if (vy4Var9 != null) {
                            boolean p = ej2.p(vy4Var9);
                            Object obj9 = en1.a;
                            if (p) {
                                List list4 = oy4Var.a;
                                int size7 = list4.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 < size7) {
                                        obj2 = list4.get(i7);
                                        if (((vy4) obj2).d) {
                                            break;
                                        }
                                        i7++;
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                vy4 vy4Var10 = (vy4) obj2;
                                if (vy4Var10 == null) {
                                    if (!vy4Var9.c() && ej2.p(vy4Var9)) {
                                        mp2.h(g1(), vy4Var9, 0L);
                                        float e3 = ((fo7) hf.K(this, ky0.t)).e();
                                        long c = g1().c(qo2.k(e3, e3));
                                        bg1 bg1Var = (bg1) g1().B;
                                        rl7 rl7Var = (rl7) bg1Var.B;
                                        fv.z0(0, r6.length, null, rl7Var.d);
                                        rl7Var.e = 0;
                                        rl7 rl7Var2 = (rl7) bg1Var.L;
                                        fv.z0(0, r6.length, null, rl7Var2.d);
                                        rl7Var2.e = 0;
                                        bg1Var.A = 0L;
                                        f1().c(new hn1(eo1.b(c), false));
                                        this.u0 = false;
                                    } else {
                                        f1().c(obj9);
                                    }
                                    Z0();
                                    return;
                                }
                                dn1Var5.x = vy4Var10.a;
                                return;
                            } else if (vy4Var9.c()) {
                                f1().c(obj9);
                                return;
                            } else if (jk4.d(ej2.R(vy4Var9, true)) != RecyclerView.B1) {
                                h1(ej2.R(vy4Var9, false), vy4Var9);
                                vy4Var9.a();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } else {
                    i.d();
                    return;
                }
            }
            i.h("currentDragState should not be null");
        }
    }

    @Override // defpackage.ur2
    public final boolean y(s43 s43Var) {
        if (jx2.k(s43Var) && this.o0) {
            return true;
        }
        return false;
    }
}
