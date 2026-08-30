package defpackage;

import android.os.Handler;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jg3  reason: default package */
/* loaded from: classes.dex */
public final class jg3 implements au0 {
    public final vf3 A;
    public dv0 B;
    public bi6 L;
    public int R;
    public int X;
    public final d24 Y;
    public final d24 Z;
    public final dg3 c0;
    public final ag3 d0;
    public final d24 e0;
    public final ai6 f0;
    public final d24 g0;
    public final o24 h0;
    public int i0;
    public int j0;
    public final String k0;

    public jg3(vf3 vf3Var, bi6 bi6Var) {
        this.A = vf3Var;
        this.L = bi6Var;
        long[] jArr = wu5.a;
        this.Y = new d24();
        this.Z = new d24();
        this.c0 = new dg3(this);
        this.d0 = new ag3(this);
        this.e0 = new d24();
        this.f0 = new ai6();
        this.g0 = new d24();
        this.h0 = new o24(new Object[16]);
        this.k0 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void c(jg3 jg3Var, Object obj) {
        vf3 vf3Var = jg3Var.A;
        jg3Var.h();
        vf3 vf3Var2 = (vf3) jg3Var.e0.k(obj);
        if (vf3Var2 != null) {
            if (jg3Var.j0 <= 0) {
                mz2.c("No pre-composed items to dispose");
            }
            int j = ((o24) ((u14) vf3Var.o()).B).j(vf3Var2);
            if (j < ((o24) ((u14) vf3Var.o()).B).L - jg3Var.j0) {
                mz2.c("Item is not in pre-composed item range");
            }
            jg3Var.i0++;
            jg3Var.j0--;
            bg3 bg3Var = (bg3) jg3Var.Y.g(vf3Var2);
            if (bg3Var != null) {
                e(bg3Var);
            }
            int i = (((o24) ((u14) vf3Var.o()).B).L - jg3Var.j0) - jg3Var.i0;
            jg3Var.j(j, i);
            jg3Var.g(i);
        }
        if (jg3Var.h0.i(obj)) {
            vf3.V(vf3Var, true, 6);
        }
    }

    public static void e(bg3 bg3Var) {
        e24 e24Var;
        ql4 ql4Var = bg3Var.f;
        if (ql4Var != null) {
            ql4Var.h.set(sl4.Cancelled);
            r8 r8Var = ql4Var.k;
            if (((e24) r8Var.d).h()) {
                e24Var = (e24) r8Var.d;
                e24 e24Var2 = xu5.a;
                r8Var.d = new e24();
                ((o24) r8Var.c).h();
            } else {
                e24Var = null;
            }
            r8Var.b();
            iv0 iv0Var = ql4Var.a;
            iv0Var.l0 = null;
            if (e24Var != null) {
                iv0Var.p0.k = e24Var;
                iv0Var.r0 = 2;
            }
            bg3Var.f = null;
            iv0 iv0Var2 = bg3Var.c;
            if (iv0Var2 != null) {
                iv0Var2.m();
            }
            bg3Var.c = null;
        }
    }

    @Override // defpackage.au0
    public final void a() {
        iv0 iv0Var;
        vf3 vf3Var = this.A;
        vf3Var.l0 = true;
        d24 d24Var = this.Y;
        Object[] objArr = d24Var.c;
        long[] jArr = d24Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (iv0Var = ((bg3) objArr[(i << 3) + i3]).c) != null) {
                            iv0Var.m();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        vf3Var.P();
        vf3Var.l0 = false;
        d24Var.a();
        this.Z.a();
        this.j0 = 0;
        this.i0 = 0;
        this.e0.a();
        h();
    }

    @Override // defpackage.au0
    public final void b() {
        i(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [x56, java.lang.Object] */
    public final void d(bg3 bg3Var, boolean z) {
        mi2 mi2Var;
        ql4 ql4Var = bg3Var.f;
        if (ql4Var != 0) {
            ga6 z2 = io2.z();
            if (z2 != null) {
                mi2Var = z2.e();
            } else {
                mi2Var = null;
            }
            ga6 Y = io2.Y(z2);
            try {
                vf3 vf3Var = this.A;
                vf3Var.l0 = true;
                if (z) {
                    while (!ql4Var.c()) {
                        ql4Var.e(new Object());
                    }
                }
                ql4Var.a();
                bg3Var.f = null;
                vf3Var.l0 = false;
            } finally {
                io2.l0(z2, Y, mi2Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [wh6, java.lang.Object] */
    public final wh6 f(Object obj) {
        if (!this.A.H()) {
            return new Object();
        }
        return new hg3(this, obj);
    }

    public final void g(int i) {
        boolean z;
        mi2 mi2Var;
        boolean z2 = false;
        this.i0 = 0;
        List o = this.A.o();
        u14 u14Var = (u14) o;
        int i2 = (((o24) u14Var.B).L - this.j0) - 1;
        if (i <= i2) {
            this.f0.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object g = this.Y.g((vf3) u14Var.get(i3));
                    g.getClass();
                    ((y14) this.f0.B).a(((bg3) g).a);
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            this.L.f(this.f0);
            ga6 z3 = io2.z();
            if (z3 != null) {
                mi2Var = z3.e();
            } else {
                mi2Var = null;
            }
            ga6 Y = io2.Y(z3);
            z = false;
            while (i2 >= i) {
                try {
                    vf3 vf3Var = (vf3) ((u14) o).get(i2);
                    Object g2 = this.Y.g(vf3Var);
                    g2.getClass();
                    bg3 bg3Var = (bg3) g2;
                    Object obj = bg3Var.a;
                    if (((y14) this.f0.B).c(obj)) {
                        this.i0++;
                        if (((Boolean) bg3Var.g.getValue()).booleanValue()) {
                            zf3 zf3Var = vf3Var.B0;
                            sv3 sv3Var = zf3Var.p;
                            tf3 tf3Var = tf3.NotUsed;
                            sv3Var.g0 = tf3Var;
                            ms3 ms3Var = zf3Var.q;
                            if (ms3Var != null) {
                                ms3Var.e0 = tf3Var;
                            }
                            l(bg3Var, false);
                            if (bg3Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        vf3 vf3Var2 = this.A;
                        vf3Var2.l0 = true;
                        this.Y.k(vf3Var);
                        iv0 iv0Var = bg3Var.c;
                        if (iv0Var != null) {
                            iv0Var.m();
                        }
                        this.A.Q(i2, 1);
                        vf3Var2.l0 = false;
                    }
                    this.Z.k(obj);
                    i2--;
                } catch (Throwable th) {
                    io2.l0(z3, Y, mi2Var);
                    throw th;
                }
            }
            io2.l0(z3, Y, mi2Var);
        } else {
            z = false;
        }
        if (z) {
            synchronized (ma6.c) {
                e24 e24Var = ma6.j.h;
                if (e24Var != null) {
                    if (e24Var.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                ma6.a();
            }
        }
        h();
    }

    public final void h() {
        int i = ((o24) ((u14) this.A.o()).B).L;
        d24 d24Var = this.Y;
        if (d24Var.e != i) {
            mz2.a("Inconsistency between the count of nodes tracked by the state (" + d24Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.i0) - this.j0 < 0) {
            StringBuilder s = wh1.s("Incorrect state. Total children ", i, ". Reusable children ");
            s.append(this.i0);
            s.append(". Precomposed children ");
            s.append(this.j0);
            mz2.a(s.toString());
        }
        d24 d24Var2 = this.e0;
        if (d24Var2.e == this.j0) {
            return;
        }
        mz2.a("Incorrect state. Precomposed children " + this.j0 + ". Map size " + d24Var2.e);
    }

    public final void i(boolean z) {
        mi2 mi2Var;
        this.j0 = 0;
        this.e0.a();
        List o = this.A.o();
        int i = ((o24) ((u14) o).B).L;
        if (this.i0 != i) {
            this.i0 = i;
            ga6 z2 = io2.z();
            if (z2 != null) {
                mi2Var = z2.e();
            } else {
                mi2Var = null;
            }
            ga6 Y = io2.Y(z2);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    vf3 vf3Var = (vf3) ((u14) o).get(i2);
                    bg3 bg3Var = (bg3) this.Y.g(vf3Var);
                    if (bg3Var != null && ((Boolean) bg3Var.g.getValue()).booleanValue()) {
                        zf3 zf3Var = vf3Var.B0;
                        sv3 sv3Var = zf3Var.p;
                        tf3 tf3Var = tf3.NotUsed;
                        sv3Var.g0 = tf3Var;
                        ms3 ms3Var = zf3Var.q;
                        if (ms3Var != null) {
                            ms3Var.e0 = tf3Var;
                        }
                        l(bg3Var, z);
                        bg3Var.a = vh6.a;
                    }
                } catch (Throwable th) {
                    io2.l0(z2, Y, mi2Var);
                    throw th;
                }
            }
            io2.l0(z2, Y, mi2Var);
            this.Z.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        vf3 vf3Var = this.A;
        vf3Var.l0 = true;
        vf3Var.L(i, i2, 1);
        vf3Var.l0 = false;
    }

    public final void k(Object obj, aj2 aj2Var, boolean z) {
        vf3 vf3Var = this.A;
        if (vf3Var.H()) {
            h();
            if (!this.Z.c(obj)) {
                this.g0.k(obj);
                d24 d24Var = this.e0;
                Object g = d24Var.g(obj);
                vf3 vf3Var2 = g;
                if (g == null) {
                    vf3 n = n(obj);
                    if (n != null) {
                        j(((o24) ((u14) vf3Var.o()).B).j(n), ((o24) ((u14) vf3Var.o()).B).L);
                        this.j0++;
                    } else {
                        int i = ((o24) ((u14) vf3Var.o()).B).L;
                        vf3 vf3Var3 = new vf3(2);
                        vf3Var.l0 = true;
                        vf3Var.A(i, vf3Var3);
                        vf3Var.l0 = false;
                        this.j0++;
                        n = vf3Var3;
                    }
                    d24Var.m(obj, n);
                    vf3Var2 = n;
                }
                m(vf3Var2, obj, z, aj2Var);
            }
        }
    }

    public final void l(bg3 bg3Var, boolean z) {
        iv0 iv0Var;
        if (!z && bg3Var.h) {
            bg3Var.g.setValue(Boolean.FALSE);
        } else {
            bg3Var.g = me2.G(Boolean.FALSE);
        }
        if (bg3Var.f != null) {
            e(bg3Var);
        } else if (z) {
            iv0 iv0Var2 = bg3Var.c;
            if (iv0Var2 != null) {
                iv0Var2.l();
            }
        } else {
            lf4 m8getOutOfFrameExecutor = ((ee) yf3.a(this.A)).m8getOutOfFrameExecutor();
            if (m8getOutOfFrameExecutor != null) {
                dj djVar = new dj(11, bg3Var);
                ee eeVar = (ee) m8getOutOfFrameExecutor;
                xt xtVar = eeVar.g0;
                boolean isEmpty = xtVar.isEmpty();
                xtVar.addLast(djVar);
                if (isEmpty) {
                    Handler handler = eeVar.getHandler();
                    if (handler != null) {
                        handler.postAtFrontOfQueue(eeVar.h0);
                    } else {
                        i.i("schedule is called when outOfFrameExecutor is not available (view is detached)");
                    }
                }
            } else if (!bg3Var.h && (iv0Var = bg3Var.c) != null) {
                iv0Var.l();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, bg3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.vf3 r10, java.lang.Object r11, boolean r12, defpackage.aj2 r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jg3.m(vf3, java.lang.Object, boolean, aj2):void");
    }

    public final vf3 n(Object obj) {
        d24 d24Var;
        int i;
        if (this.i0 != 0) {
            u14 u14Var = (u14) this.A.o();
            int i2 = ((o24) u14Var.B).L - this.j0;
            int i3 = i2 - this.i0;
            int i4 = i2 - 1;
            int i5 = i4;
            while (true) {
                d24Var = this.Y;
                if (i5 >= i3) {
                    Object g = d24Var.g((vf3) u14Var.get(i5));
                    g.getClass();
                    if (b53.x(((bg3) g).a, obj)) {
                        i = i5;
                        break;
                    }
                    i5--;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                while (i4 >= i3) {
                    Object g2 = d24Var.g((vf3) u14Var.get(i4));
                    g2.getClass();
                    bg3 bg3Var = (bg3) g2;
                    Object obj2 = bg3Var.a;
                    if (obj2 != vh6.a && !this.L.m(obj, obj2)) {
                        i4--;
                    } else {
                        bg3Var.a = obj;
                        i5 = i4;
                        i = i5;
                        break;
                    }
                }
                i5 = i4;
            }
            if (i == -1) {
                return null;
            }
            if (i5 != i3) {
                j(i5, i3);
            }
            this.i0--;
            vf3 vf3Var = (vf3) u14Var.get(i3);
            Object g3 = d24Var.g(vf3Var);
            g3.getClass();
            bg3 bg3Var2 = (bg3) g3;
            bg3Var2.g = me2.G(Boolean.TRUE);
            bg3Var2.e = true;
            bg3Var2.d = true;
            return vf3Var;
        }
        return null;
    }
}
