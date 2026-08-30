package d0;

import android.content.Context;
import android.util.ArrayMap;
import android.view.Surface;
import j0.h2;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 implements j0.d1 {
    public int A;
    public boolean B;
    public Object L;
    public Object R;
    public final Object X;
    public Object Y;
    public Object Z;

    public i1(j0.p0 p0Var) {
        HashSet hashSet = new HashSet();
        this.L = hashSet;
        this.R = j0.g1.b();
        this.A = -1;
        ArrayList arrayList = new ArrayList();
        this.X = arrayList;
        this.B = false;
        this.Y = j0.h1.a();
        hashSet.addAll(p0Var.f7274a);
        this.R = j0.g1.c(p0Var.f7275b);
        this.A = p0Var.f7276c;
        arrayList.addAll(p0Var.f7277d);
        this.B = p0Var.f7278e;
        h2 h2Var = p0Var.f7279f;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : h2Var.f7212a.keySet()) {
            arrayMap.put(str, h2Var.f7212a.get(str));
        }
        this.Y = new h2(arrayMap);
    }

    @Override // j0.d1
    public int a() {
        int a10;
        synchronized (this.L) {
            a10 = ((j0.d1) this.R).a();
        }
        return a10;
    }

    @Override // j0.d1
    public void b(j0.c1 c1Var, Executor executor) {
        synchronized (this.L) {
            ((j0.d1) this.R).b(new bi.h(4, this, c1Var), executor);
        }
    }

    @Override // j0.d1
    public int c() {
        int c4;
        synchronized (this.L) {
            c4 = ((j0.d1) this.R).c();
        }
        return c4;
    }

    @Override // j0.d1
    public void close() {
        synchronized (this.L) {
            try {
                Surface surface = (Surface) this.X;
                if (surface != null) {
                    surface.release();
                }
                ((j0.d1) this.R).close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g((j0.m) it.next());
        }
    }

    @Override // j0.d1
    public y0 e() {
        n0 n0Var;
        synchronized (this.L) {
            y0 e6 = ((j0.d1) this.R).e();
            if (e6 != null) {
                this.A++;
                n0Var = new n0(e6);
                n0Var.d((m0) this.Z);
            } else {
                n0Var = null;
            }
        }
        return n0Var;
    }

    @Override // j0.d1
    public int f() {
        int f8;
        synchronized (this.L) {
            f8 = ((j0.d1) this.R).f();
        }
        return f8;
    }

    public void g(j0.m mVar) {
        ArrayList arrayList = (ArrayList) this.X;
        if (arrayList.contains(mVar)) {
            return;
        }
        arrayList.add(mVar);
    }

    @Override // j0.d1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.L) {
            surface = ((j0.d1) this.R).getSurface();
        }
        return surface;
    }

    @Override // j0.d1
    public void h() {
        synchronized (this.L) {
            ((j0.d1) this.R).h();
        }
    }

    public void i(j0.r0 r0Var) {
        for (j0.g gVar : r0Var.f()) {
            ((j0.g1) this.R).h(gVar, null);
            ((j0.g1) this.R).j(gVar, r0Var.d(gVar), r0Var.g(gVar));
        }
    }

    public j0.p0 j() {
        ArrayList arrayList = new ArrayList((HashSet) this.L);
        j0.i1 a10 = j0.i1.a((j0.g1) this.R);
        int i2 = this.A;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.X);
        boolean z10 = this.B;
        j0.h1 h1Var = (j0.h1) this.Y;
        h2 h2Var = h2.f7211b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : h1Var.f7212a.keySet()) {
            arrayMap.put(str, h1Var.f7212a.get(str));
        }
        return new j0.p0(arrayList, a10, i2, arrayList2, z10, new h2(arrayMap), (j0.u) this.Z);
    }

    public void k(m9.j jVar, h9.g gVar) {
        Context context = jVar.f9403a;
        m9.j jVar2 = (m9.j) this.L;
        if (context == jVar2.f9403a) {
            if (jVar.f9404b != m9.l.f9428a) {
                if (jVar.f9405c == jVar2.f9405c) {
                    if (jVar.f9423v == jVar2.f9423v) {
                        if (jVar.f9424w == jVar2.f9424w) {
                            return;
                        }
                        fj.j.f(gVar, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
                        return;
                    }
                    fj.j.f(gVar, "' cannot modify the request's lifecycle.", "Interceptor '");
                    return;
                }
                fj.j.f(gVar, "' cannot modify the request's target.", "Interceptor '");
                return;
            }
            fj.j.f(gVar, "' cannot set the request's data to null.", "Interceptor '");
            return;
        }
        fj.j.f(gVar, "' cannot modify the request's context.", "Interceptor '");
    }

    public boolean l() {
        if (this.A < ((List) this.Y).size() || !((ArrayList) this.Z).isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(m9.j r17, ec.c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.Object r2 = r0.R
            java.util.List r2 = (java.util.List) r2
            int r3 = r0.A
            boolean r4 = r1 instanceof h9.h
            if (r4 == 0) goto L1d
            r4 = r1
            h9.h r4 = (h9.h) r4
            int r5 = r4.f6375b0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1d
            int r5 = r5 - r6
            r4.f6375b0 = r5
            goto L22
        L1d:
            h9.h r4 = new h9.h
            r4.<init>(r0, r1)
        L22:
            java.lang.Object r1 = r4.Y
            dc.a r5 = dc.a.COROUTINE_SUSPENDED
            int r6 = r4.f6375b0
            r7 = 1
            if (r6 == 0) goto L3c
            if (r6 != r7) goto L35
            h9.g r2 = r4.X
            d0.i1 r3 = r4.R
            p7.j.I(r1)
            goto L83
        L35:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r1)
            r1 = 0
            return r1
        L3c:
            p7.j.I(r1)
            if (r3 <= 0) goto L4f
            int r1 = r3 + (-1)
            java.lang.Object r1 = r2.get(r1)
            h9.g r1 = (h9.g) r1
            r12 = r17
            r0.k(r12, r1)
            goto L51
        L4f:
            r12 = r17
        L51:
            java.lang.Object r1 = r2.get(r3)
            r2 = r1
            h9.g r2 = (h9.g) r2
            int r11 = r3 + 1
            java.lang.Object r1 = r0.Y
            r13 = r1
            n9.g r13 = (n9.g) r13
            d0.i1 r8 = new d0.i1
            java.lang.Object r1 = r0.L
            r9 = r1
            m9.j r9 = (m9.j) r9
            java.lang.Object r1 = r0.R
            r10 = r1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r1 = r0.Z
            r14 = r1
            b9.c r14 = (b9.c) r14
            boolean r15 = r0.B
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r4.R = r0
            r4.X = r2
            r4.f6375b0 = r7
            java.lang.Object r1 = r2.d(r8, r4)
            if (r1 != r5) goto L82
            return r5
        L82:
            r3 = r0
        L83:
            m9.k r1 = (m9.k) r1
            m9.j r4 = r1.b()
            r3.k(r4, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.i1.m(m9.j, ec.c):java.lang.Object");
    }

    @Override // j0.d1
    public int n() {
        int n10;
        synchronized (this.L) {
            n10 = ((j0.d1) this.R).n();
        }
        return n10;
    }

    public void o() {
        synchronized (this.L) {
            try {
                this.B = true;
                ((j0.d1) this.R).h();
                if (this.A == 0) {
                    close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // j0.d1
    public y0 p() {
        n0 n0Var;
        synchronized (this.L) {
            y0 p10 = ((j0.d1) this.R).p();
            if (p10 != null) {
                this.A++;
                n0Var = new n0(p10);
                n0Var.d((m0) this.Z);
            } else {
                n0Var = null;
            }
        }
        return n0Var;
    }

    public i1(pi.a aVar, rd.k kVar, ti.n nVar, boolean z10) {
        List j2;
        kVar.getClass();
        this.R = aVar;
        this.X = kVar;
        this.B = z10;
        zb.q qVar = zb.q.A;
        this.Y = qVar;
        this.L = qVar;
        this.Z = new ArrayList();
        pi.r rVar = aVar.f11665h;
        rVar.getClass();
        URI h2 = rVar.h();
        if (h2.getHost() == null) {
            j2 = qi.g.j(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = aVar.f11664g.select(h2);
            if (select != null && !select.isEmpty()) {
                j2 = qi.g.i(select);
            } else {
                j2 = qi.g.j(new Proxy[]{Proxy.NO_PROXY});
            }
        }
        this.Y = j2;
        this.A = 0;
    }

    public i1(j0.d1 d1Var) {
        this.L = new Object();
        this.A = 0;
        this.B = false;
        this.Z = new m0(1, this);
        this.R = d1Var;
        this.X = d1Var.getSurface();
    }

    public i1() {
        this.L = new HashSet();
        this.R = j0.g1.b();
        this.A = -1;
        this.X = new ArrayList();
        this.B = false;
        this.Y = j0.h1.a();
    }

    public i1(m9.j jVar, List list, int i2, m9.j jVar2, n9.g gVar, b9.c cVar, boolean z10) {
        this.L = jVar;
        this.R = list;
        this.A = i2;
        this.X = jVar2;
        this.Y = gVar;
        this.Z = cVar;
        this.B = z10;
    }
}
