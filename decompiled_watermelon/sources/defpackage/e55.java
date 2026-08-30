package defpackage;

import android.content.Context;
import android.view.Surface;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e55  reason: default package */
/* loaded from: classes.dex */
public final class e55 implements rw2 {
    public boolean A;
    public final Object B;
    public int L;
    public final Object R;
    public final Object X;
    public Object Y;
    public final Object Z;

    public e55(da daVar, qb5 qb5Var, w45 w45Var, boolean z) {
        List j;
        qb5Var.getClass();
        this.R = daVar;
        this.X = qb5Var;
        this.A = z;
        pp1 pp1Var = pp1.A;
        this.B = pp1Var;
        this.Y = pp1Var;
        this.Z = new ArrayList();
        hu2 hu2Var = daVar.h;
        hu2Var.getClass();
        URI h = hu2Var.h();
        if (h.getHost() == null) {
            j = ik7.j(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = daVar.g.select(h);
            if (select != null && !select.isEmpty()) {
                j = ik7.i(select);
            } else {
                j = ik7.j(new Proxy[]{Proxy.NO_PROXY});
            }
        }
        this.B = j;
        this.L = 0;
    }

    @Override // defpackage.rw2
    public int a() {
        int a;
        synchronized (this.R) {
            a = ((rw2) this.X).a();
        }
        return a;
    }

    @Override // defpackage.rw2
    public ow2 b() {
        tv2 tv2Var;
        synchronized (this.R) {
            ow2 b = ((rw2) this.X).b();
            if (b != null) {
                this.L++;
                tv2Var = new tv2(b);
                tv2Var.d((sv2) this.Z);
            } else {
                tv2Var = null;
            }
        }
        return tv2Var;
    }

    @Override // defpackage.rw2
    public int c() {
        int c;
        synchronized (this.R) {
            c = ((rw2) this.X).c();
        }
        return c;
    }

    @Override // defpackage.rw2
    public void close() {
        synchronized (this.R) {
            try {
                Surface surface = (Surface) this.B;
                if (surface != null) {
                    surface.release();
                }
                ((rw2) this.X).close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rw2
    public int d() {
        int d;
        synchronized (this.R) {
            d = ((rw2) this.X).d();
        }
        return d;
    }

    public void e(vw2 vw2Var, h02 h02Var) {
        Context context = vw2Var.a;
        vw2 vw2Var2 = (vw2) this.R;
        if (context == vw2Var2.a) {
            if (vw2Var.b != y60.x0) {
                if (vw2Var.c == vw2Var2.c) {
                    if (vw2Var.w == vw2Var2.w) {
                        if (vw2Var.x == vw2Var2.x) {
                            return;
                        }
                        i.m(h02Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
                        return;
                    }
                    i.m(h02Var, "' cannot modify the request's lifecycle.", "Interceptor '");
                    return;
                }
                i.m(h02Var, "' cannot modify the request's target.", "Interceptor '");
                return;
            }
            i.m(h02Var, "' cannot set the request's data to null.", "Interceptor '");
            return;
        }
        i.m(h02Var, "' cannot modify the request's context.", "Interceptor '");
    }

    @Override // defpackage.rw2
    public void f() {
        synchronized (this.R) {
            ((rw2) this.X).f();
        }
    }

    @Override // defpackage.rw2
    public void g(qw2 qw2Var, Executor executor) {
        synchronized (this.R) {
            ((rw2) this.X).g(new hi0(6, this, qw2Var), executor);
        }
    }

    @Override // defpackage.rw2
    public Surface getSurface() {
        Surface surface;
        synchronized (this.R) {
            surface = ((rw2) this.X).getSurface();
        }
        return surface;
    }

    public boolean h() {
        if (this.L < ((List) this.B).size() || !((ArrayList) this.Z).isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.vw2 r19, defpackage.k11 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            java.lang.Object r2 = r0.B
            r3 = r2
            java.util.List r3 = (java.util.List) r3
            int r4 = r0.L
            boolean r5 = r1 instanceof defpackage.d55
            if (r5 == 0) goto L1e
            r5 = r1
            d55 r5 = (defpackage.d55) r5
            int r6 = r5.c0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1e
            int r6 = r6 - r7
            r5.c0 = r6
            goto L23
        L1e:
            d55 r5 = new d55
            r5.<init>(r0, r1)
        L23:
            java.lang.Object r1 = r5.Y
            p31 r6 = defpackage.p31.COROUTINE_SUSPENDED
            int r7 = r5.c0
            r8 = 1
            if (r7 == 0) goto L43
            if (r7 != r8) goto L3c
            h02 r0 = r5.X
            e55 r2 = r5.R
            defpackage.me2.a0(r1)
            r17 = r1
            r1 = r0
            r0 = r2
            r2 = r17
            goto L88
        L3c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            r0 = 0
            return r0
        L43:
            defpackage.me2.a0(r1)
            if (r4 <= 0) goto L56
            int r1 = r4 + (-1)
            java.lang.Object r1 = r3.get(r1)
            h02 r1 = (defpackage.h02) r1
            r13 = r19
            r0.e(r13, r1)
            goto L58
        L56:
            r13 = r19
        L58:
            java.lang.Object r1 = r3.get(r4)
            h02 r1 = (defpackage.h02) r1
            int r12 = r4 + 1
            java.lang.Object r3 = r0.Y
            r14 = r3
            h76 r14 = (defpackage.h76) r14
            e55 r9 = new e55
            java.lang.Object r3 = r0.R
            r10 = r3
            vw2 r10 = (defpackage.vw2) r10
            r11 = r2
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r0.Z
            r15 = r2
            t12 r15 = (defpackage.t12) r15
            boolean r2 = r0.A
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.R = r0
            r5.X = r1
            r5.c0 = r8
            java.lang.Object r2 = r1.d(r9, r5)
            if (r2 != r6) goto L88
            return r6
        L88:
            ww2 r2 = (defpackage.ww2) r2
            vw2 r3 = r2.b()
            r0.e(r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e55.i(vw2, k11):java.lang.Object");
    }

    public void j() {
        synchronized (this.R) {
            try {
                this.A = true;
                ((rw2) this.X).f();
                if (this.L == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rw2
    public int n() {
        int n;
        synchronized (this.R) {
            n = ((rw2) this.X).n();
        }
        return n;
    }

    @Override // defpackage.rw2
    public ow2 p() {
        tv2 tv2Var;
        synchronized (this.R) {
            ow2 p = ((rw2) this.X).p();
            if (p != null) {
                this.L++;
                tv2Var = new tv2(p);
                tv2Var.d((sv2) this.Z);
            } else {
                tv2Var = null;
            }
        }
        return tv2Var;
    }

    public e55(vw2 vw2Var, List list, int i, vw2 vw2Var2, h76 h76Var, t12 t12Var, boolean z) {
        this.R = vw2Var;
        this.B = list;
        this.L = i;
        this.X = vw2Var2;
        this.Y = h76Var;
        this.Z = t12Var;
        this.A = z;
    }

    public e55(rw2 rw2Var) {
        this.R = new Object();
        this.L = 0;
        this.A = false;
        this.Z = new sv2(1, this);
        this.X = rw2Var;
        this.B = rw2Var.getSurface();
    }
}
