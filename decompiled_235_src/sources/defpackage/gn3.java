package defpackage;

import android.os.Handler;
import android.view.ViewGroup;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gn3  reason: default package */
/* loaded from: classes.dex */
public final class gn3 implements ww0 {
    public final sm3 A;
    public zx0 B;
    public st6 L;
    public int R;
    public int X;
    public final ja4 Y;
    public final ja4 Z;
    public final an3 d0;
    public final xm3 e0;
    public final ja4 f0;
    public final rt6 g0;
    public final ja4 h0;
    public final ua4 i0;
    public int j0;
    public int k0;
    public final String l0;

    public gn3(sm3 sm3Var, st6 st6Var) {
        this.A = sm3Var;
        this.L = st6Var;
        long[] jArr = b66.a;
        this.Y = new ja4();
        this.Z = new ja4();
        this.d0 = new an3(this);
        this.e0 = new xm3(this);
        this.f0 = new ja4();
        this.g0 = new rt6();
        this.h0 = new ja4();
        this.i0 = new ua4(new Object[16]);
        this.l0 = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void c(gn3 gn3Var, Object obj) {
        sm3 sm3Var = gn3Var.A;
        gn3Var.h();
        sm3 sm3Var2 = (sm3) gn3Var.f0.k(obj);
        if (sm3Var2 != null) {
            if (gn3Var.k0 <= 0) {
                p53.c("No pre-composed items to dispose");
            }
            int i = ((ua4) ((aa4) sm3Var.o()).B).i(sm3Var2);
            if (i < ((ua4) ((aa4) sm3Var.o()).B).L - gn3Var.k0) {
                p53.c("Item is not in pre-composed item range");
            }
            gn3Var.j0++;
            gn3Var.k0--;
            ym3 ym3Var = (ym3) gn3Var.Y.g(sm3Var2);
            if (ym3Var != null) {
                e(ym3Var);
            }
            int i2 = (((ua4) ((aa4) sm3Var.o()).B).L - gn3Var.k0) - gn3Var.j0;
            gn3Var.j(i, i2);
            gn3Var.g(i2);
        }
        if (gn3Var.i0.h(obj)) {
            sm3.V(sm3Var, true, 6);
        }
    }

    public static void e(ym3 ym3Var) {
        ka4 ka4Var;
        tu4 tu4Var = ym3Var.f;
        if (tu4Var != null) {
            tu4Var.h.set(vu4.Cancelled);
            jb1 jb1Var = tu4Var.k;
            if (((ka4) jb1Var.d).h()) {
                ka4Var = (ka4) jb1Var.d;
                ka4 ka4Var2 = c66.a;
                jb1Var.d = new ka4();
                ((ua4) jb1Var.c).g();
            } else {
                ka4Var = null;
            }
            jb1Var.b();
            ey0 ey0Var = tu4Var.a;
            ey0Var.m0 = null;
            if (ka4Var != null) {
                ey0Var.q0.k = ka4Var;
                ey0Var.s0 = 2;
            }
            ym3Var.f = null;
            ey0 ey0Var2 = ym3Var.c;
            if (ey0Var2 != null) {
                ey0Var2.m();
            }
            ym3Var.c = null;
        }
    }

    @Override // defpackage.ww0
    public final void a() {
        ey0 ey0Var;
        sm3 sm3Var = this.A;
        sm3Var.m0 = true;
        ja4 ja4Var = this.Y;
        Object[] objArr = ja4Var.c;
        long[] jArr = ja4Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (ey0Var = ((ym3) objArr[(i << 3) + i3]).c) != null) {
                            ey0Var.m();
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
        sm3Var.P();
        sm3Var.m0 = false;
        ja4Var.a();
        this.Z.a();
        this.k0 = 0;
        this.j0 = 0;
        this.f0.a();
        h();
    }

    @Override // defpackage.ww0
    public final void b() {
        i(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [kh6, java.lang.Object] */
    public final void d(ym3 ym3Var, boolean z) {
        qn2 qn2Var;
        tu4 tu4Var = ym3Var.f;
        if (tu4Var != 0) {
            vl6 t = ln2.t();
            if (t != null) {
                qn2Var = t.e();
            } else {
                qn2Var = null;
            }
            vl6 N = ln2.N(t);
            try {
                sm3 sm3Var = this.A;
                sm3Var.m0 = true;
                if (z) {
                    while (!tu4Var.c()) {
                        tu4Var.e(new Object());
                    }
                }
                tu4Var.a();
                ym3Var.f = null;
                sm3Var.m0 = false;
            } finally {
                ln2.V(t, N, qn2Var);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [nt6, java.lang.Object] */
    public final nt6 f(Object obj) {
        if (!this.A.H()) {
            return new Object();
        }
        return new en3(this, obj);
    }

    public final void g(int i) {
        boolean z;
        qn2 qn2Var;
        boolean z2 = false;
        this.j0 = 0;
        List o = this.A.o();
        aa4 aa4Var = (aa4) o;
        int i2 = (((ua4) aa4Var.B).L - this.k0) - 1;
        if (i <= i2) {
            this.g0.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    Object g = this.Y.g((sm3) aa4Var.get(i3));
                    g.getClass();
                    ((ea4) this.g0.B).a(((ym3) g).a);
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            this.L.d(this.g0);
            vl6 t = ln2.t();
            if (t != null) {
                qn2Var = t.e();
            } else {
                qn2Var = null;
            }
            vl6 N = ln2.N(t);
            z = false;
            while (i2 >= i) {
                try {
                    sm3 sm3Var = (sm3) ((aa4) o).get(i2);
                    Object g2 = this.Y.g(sm3Var);
                    g2.getClass();
                    ym3 ym3Var = (ym3) g2;
                    Object obj = ym3Var.a;
                    if (((ea4) this.g0.B).c(obj)) {
                        this.j0++;
                        if (((Boolean) ym3Var.g.getValue()).booleanValue()) {
                            wm3 wm3Var = sm3Var.C0;
                            d34 d34Var = wm3Var.p;
                            qm3 qm3Var = qm3.NotUsed;
                            d34Var.h0 = qm3Var;
                            rz3 rz3Var = wm3Var.q;
                            if (rz3Var != null) {
                                rz3Var.f0 = qm3Var;
                            }
                            l(ym3Var, false);
                            if (ym3Var.h) {
                                z = true;
                            }
                        }
                    } else {
                        sm3 sm3Var2 = this.A;
                        sm3Var2.m0 = true;
                        this.Y.k(sm3Var);
                        ey0 ey0Var = ym3Var.c;
                        if (ey0Var != null) {
                            ey0Var.m();
                        }
                        this.A.Q(i2, 1);
                        sm3Var2.m0 = false;
                    }
                    this.Z.k(obj);
                    i2--;
                } catch (Throwable th) {
                    ln2.V(t, N, qn2Var);
                    throw th;
                }
            }
            ln2.V(t, N, qn2Var);
        } else {
            z = false;
        }
        if (z) {
            synchronized (bm6.c) {
                ka4 ka4Var = bm6.j.h;
                if (ka4Var != null) {
                    if (ka4Var.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                bm6.a();
            }
        }
        h();
    }

    public final void h() {
        int i = ((ua4) ((aa4) this.A.o()).B).L;
        ja4 ja4Var = this.Y;
        if (ja4Var.e != i) {
            p53.a("Inconsistency between the count of nodes tracked by the state (" + ja4Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.j0) - this.k0 < 0) {
            StringBuilder t = xg6.t("Incorrect state. Total children ", i, ". Reusable children ");
            t.append(this.j0);
            t.append(". Precomposed children ");
            t.append(this.k0);
            p53.a(t.toString());
        }
        ja4 ja4Var2 = this.f0;
        if (ja4Var2.e == this.k0) {
            return;
        }
        p53.a("Incorrect state. Precomposed children " + this.k0 + ". Map size " + ja4Var2.e);
    }

    public final void i(boolean z) {
        qn2 qn2Var;
        this.k0 = 0;
        this.f0.a();
        List o = this.A.o();
        int i = ((ua4) ((aa4) o).B).L;
        if (this.j0 != i) {
            this.j0 = i;
            vl6 t = ln2.t();
            if (t != null) {
                qn2Var = t.e();
            } else {
                qn2Var = null;
            }
            vl6 N = ln2.N(t);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    sm3 sm3Var = (sm3) ((aa4) o).get(i2);
                    ym3 ym3Var = (ym3) this.Y.g(sm3Var);
                    if (ym3Var != null && ((Boolean) ym3Var.g.getValue()).booleanValue()) {
                        wm3 wm3Var = sm3Var.C0;
                        d34 d34Var = wm3Var.p;
                        qm3 qm3Var = qm3.NotUsed;
                        d34Var.h0 = qm3Var;
                        rz3 rz3Var = wm3Var.q;
                        if (rz3Var != null) {
                            rz3Var.f0 = qm3Var;
                        }
                        l(ym3Var, z);
                        ym3Var.a = mt6.a;
                    }
                } catch (Throwable th) {
                    ln2.V(t, N, qn2Var);
                    throw th;
                }
            }
            ln2.V(t, N, qn2Var);
            this.Z.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        sm3 sm3Var = this.A;
        sm3Var.m0 = true;
        sm3Var.L(i, i2, 1);
        sm3Var.m0 = false;
    }

    public final void k(Object obj, eo2 eo2Var, boolean z) {
        sm3 sm3Var = this.A;
        if (sm3Var.H()) {
            h();
            if (!this.Z.c(obj)) {
                this.h0.k(obj);
                ja4 ja4Var = this.f0;
                Object g = ja4Var.g(obj);
                sm3 sm3Var2 = g;
                if (g == null) {
                    sm3 n = n(obj);
                    if (n != null) {
                        j(((ua4) ((aa4) sm3Var.o()).B).i(n), ((ua4) ((aa4) sm3Var.o()).B).L);
                        this.k0++;
                    } else {
                        int i = ((ua4) ((aa4) sm3Var.o()).B).L;
                        sm3 sm3Var3 = new sm3(2);
                        sm3Var.m0 = true;
                        sm3Var.B(i, sm3Var3);
                        sm3Var.m0 = false;
                        this.k0++;
                        n = sm3Var3;
                    }
                    ja4Var.m(obj, n);
                    sm3Var2 = n;
                }
                m(sm3Var2, obj, z, eo2Var);
            }
        }
    }

    public final void l(ym3 ym3Var, boolean z) {
        ey0 ey0Var;
        if (!z && ym3Var.h) {
            ym3Var.g.setValue(Boolean.FALSE);
        } else {
            ym3Var.g = np2.Y(Boolean.FALSE);
        }
        if (ym3Var.f != null) {
            e(ym3Var);
        } else if (z) {
            ey0 ey0Var2 = ym3Var.c;
            if (ey0Var2 != null) {
                ey0Var2.l();
            }
        } else {
            no4 outOfFrameExecutor = ((te) vm3.a(this.A)).getOutOfFrameExecutor();
            if (outOfFrameExecutor != null) {
                pj pjVar = new pj(ym3Var, 11);
                te teVar = (te) outOfFrameExecutor;
                pu puVar = teVar.h0;
                boolean isEmpty = puVar.isEmpty();
                puVar.addLast(pjVar);
                if (isEmpty) {
                    Handler handler = teVar.getHandler();
                    if (handler != null) {
                        handler.postAtFrontOfQueue(teVar.i0);
                    } else {
                        i.h("schedule is called when outOfFrameExecutor is not available (view is detached)");
                    }
                }
            } else if (!ym3Var.h && (ey0Var = ym3Var.c) != null) {
                ey0Var.l();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c2 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3 A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ef A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:44:0x0076, B:47:0x0082, B:59:0x00ad, B:61:0x00bf, B:64:0x00d3, B:66:0x00d7, B:72:0x010b, B:67:0x00e4, B:68:0x00ef, B:70:0x00f3, B:71:0x0108, B:62:0x00c2, B:56:0x0092, B:58:0x00a0, B:75:0x0115, B:76:0x011f), top: B:79:0x0076 }] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, ym3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(sm3 sm3Var, Object obj, boolean z, eo2 eo2Var) {
        boolean z2;
        boolean z3;
        ey0 ey0Var;
        boolean z4;
        ja4 ja4Var = this.Y;
        Object g = ja4Var.g(sm3Var);
        qn2 qn2Var = null;
        Object obj2 = g;
        if (g == null) {
            zv0 zv0Var = mw0.a;
            ?? obj3 = new Object();
            obj3.a = obj;
            obj3.b = zv0Var;
            obj3.c = null;
            obj3.g = np2.Y(Boolean.TRUE);
            ja4Var.m(sm3Var, obj3);
            obj2 = obj3;
        }
        ym3 ym3Var = (ym3) obj2;
        if (ym3Var.b != eo2Var) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ym3Var.f != null) {
            if (z2) {
                e(ym3Var);
            } else if (!z) {
                d(ym3Var, true);
            } else {
                return;
            }
        }
        ey0 ey0Var2 = ym3Var.c;
        if (ey0Var2 != null) {
            synchronized (ey0Var2.R) {
                if (ey0Var2.j0.e > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
        } else {
            z3 = true;
        }
        if (!z2 && !z3 && !ym3Var.d) {
            return;
        }
        ym3Var.b = eo2Var;
        if (ym3Var.f != null) {
            p53.a("new subcompose call while paused composition is still active");
        }
        vl6 t = ln2.t();
        if (t != null) {
            qn2Var = t.e();
        }
        vl6 N = ln2.N(t);
        try {
            sm3 sm3Var2 = this.A;
            sm3Var2.m0 = true;
            ey0 ey0Var3 = ym3Var.c;
            zx0 zx0Var = this.B;
            if (zx0Var != null) {
                if (ey0Var3 != null) {
                    if (ey0Var3.s0 == 3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                    }
                    ym3Var.c = ey0Var3;
                    eo2 eo2Var2 = ym3Var.b;
                    if (((te) vm3.a(this.A)).getOutOfFrameExecutor() == null) {
                        ym3Var.h = false;
                    } else {
                        ym3Var.h = true;
                        eo2Var2 = new zv0(1524156494, true, new pf(1, ym3Var, eo2Var2));
                    }
                    if (!z) {
                        if (ym3Var.e) {
                            ey0Var3.i();
                            ey0Var3.q();
                            ym3Var.f = ey0Var3.k(true, eo2Var2);
                        } else {
                            ym3Var.f = ey0Var3.k(ey0Var3.i(), eo2Var2);
                        }
                    } else if (ym3Var.e) {
                        ey0Var3.i();
                        ey0Var3.q();
                        xq2 xq2Var = ey0Var3.r0;
                        xq2Var.z = 0;
                        xq2Var.y = true;
                        ey0Var3.A.a(ey0Var3, eo2Var2);
                        xq2Var.u();
                    } else {
                        ey0Var3.A(eo2Var2);
                    }
                    ym3Var.e = false;
                    sm3Var2.m0 = false;
                    ln2.V(t, N, qn2Var);
                    ym3Var.d = false;
                    return;
                }
                if (z) {
                    ViewGroup.LayoutParams layoutParams = zx7.a;
                    ey0Var = new ey0(zx0Var, new cg7(sm3Var));
                } else {
                    ViewGroup.LayoutParams layoutParams2 = zx7.a;
                    ey0Var = new ey0(zx0Var, new cg7(sm3Var));
                }
                ey0Var3 = ey0Var;
                ym3Var.c = ey0Var3;
                eo2 eo2Var22 = ym3Var.b;
                if (((te) vm3.a(this.A)).getOutOfFrameExecutor() == null) {
                }
                if (!z) {
                }
                ym3Var.e = false;
                sm3Var2.m0 = false;
                ln2.V(t, N, qn2Var);
                ym3Var.d = false;
                return;
            }
            p53.d("parent composition reference not set");
            throw new RuntimeException();
        } catch (Throwable th) {
            ln2.V(t, N, qn2Var);
            throw th;
        }
    }

    public final sm3 n(Object obj) {
        ja4 ja4Var;
        int i;
        if (this.j0 != 0) {
            aa4 aa4Var = (aa4) this.A.o();
            int i2 = ((ua4) aa4Var.B).L - this.k0;
            int i3 = i2 - this.j0;
            int i4 = i2 - 1;
            int i5 = i4;
            while (true) {
                ja4Var = this.Y;
                if (i5 >= i3) {
                    Object g = ja4Var.g((sm3) aa4Var.get(i5));
                    g.getClass();
                    if (nb3.k(((ym3) g).a, obj)) {
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
                    Object g2 = ja4Var.g((sm3) aa4Var.get(i4));
                    g2.getClass();
                    ym3 ym3Var = (ym3) g2;
                    Object obj2 = ym3Var.a;
                    if (obj2 != mt6.a && !this.L.g(obj, obj2)) {
                        i4--;
                    } else {
                        ym3Var.a = obj;
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
            this.j0--;
            sm3 sm3Var = (sm3) aa4Var.get(i3);
            Object g3 = ja4Var.g(sm3Var);
            g3.getClass();
            ym3 ym3Var2 = (ym3) g3;
            ym3Var2.g = np2.Y(Boolean.TRUE);
            ym3Var2.e = true;
            ym3Var2.d = true;
            return sm3Var;
        }
        return null;
    }
}
