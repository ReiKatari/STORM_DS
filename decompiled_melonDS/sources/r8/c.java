package r8;

import ah.m1;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import b9.e;
import j0.o1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l.i0;
import m0.h;
import nc.k;
import p1.a0;
import p7.l;
import p8.e0;
import p8.v;
import q8.d;
import q8.f;
import v8.j;
import x8.p;
import y8.i;
import zc.y0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements f, t8.f, q8.a {

    /* renamed from: i0  reason: collision with root package name */
    public static final String f12627i0 = v.g("GreedyScheduler");
    public final Context A;
    public final a L;
    public boolean R;
    public final d Z;

    /* renamed from: b0  reason: collision with root package name */
    public final a0 f12628b0;

    /* renamed from: c0  reason: collision with root package name */
    public final p8.b f12629c0;

    /* renamed from: e0  reason: collision with root package name */
    public Boolean f12631e0;

    /* renamed from: f0  reason: collision with root package name */
    public final o1 f12632f0;

    /* renamed from: g0  reason: collision with root package name */
    public final z8.a f12633g0;

    /* renamed from: h0  reason: collision with root package name */
    public final e f12634h0;
    public final HashMap B = new HashMap();
    public final Object X = new Object();
    public final a0 Y = new a0(new m1(6, (byte) 0));

    /* renamed from: d0  reason: collision with root package name */
    public final HashMap f12630d0 = new HashMap();

    public c(Context context, p8.b bVar, j jVar, d dVar, a0 a0Var, z8.a aVar) {
        this.A = context;
        i0 i0Var = bVar.f11458g;
        this.L = new a(this, i0Var, bVar.f11455d);
        this.f12634h0 = new e(i0Var, a0Var);
        this.f12633g0 = aVar;
        this.f12632f0 = new o1(jVar);
        this.f12629c0 = bVar;
        this.Z = dVar;
        this.f12628b0 = a0Var;
    }

    @Override // q8.f
    public final void a(String str) {
        List<q8.j> j2;
        Runnable runnable;
        String str2 = f12627i0;
        if (this.f12631e0 == null) {
            this.f12631e0 = Boolean.valueOf(i.a(this.A, this.f12629c0));
        }
        if (!this.f12631e0.booleanValue()) {
            v.e().f(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.R) {
            this.Z.a(this);
            this.R = true;
        }
        v e6 = v.e();
        e6.a(str2, "Cancelling work ID " + str);
        a aVar = this.L;
        if (aVar != null && (runnable = (Runnable) aVar.f12624d.remove(str)) != null) {
            ((Handler) aVar.f12622b.B).removeCallbacks(runnable);
        }
        a0 a0Var = this.Y;
        a0Var.getClass();
        str.getClass();
        synchronized (a0Var.L) {
            j2 = ((m1) a0Var.B).j(str);
        }
        for (q8.j jVar : j2) {
            this.f12634h0.i(jVar);
            a0 a0Var2 = this.f12628b0;
            a0Var2.getClass();
            a0Var2.J(jVar, -512);
        }
    }

    @Override // q8.a
    public final void b(x8.i iVar, boolean z10) {
        y0 y0Var;
        q8.j E = this.Y.E(iVar);
        if (E != null) {
            this.f12634h0.i(E);
        }
        synchronized (this.X) {
            y0Var = (y0) this.B.remove(iVar);
        }
        if (y0Var != null) {
            v e6 = v.e();
            String str = f12627i0;
            e6.a(str, "Stopping tracking for " + iVar);
            y0Var.i(null);
        }
        if (!z10) {
            synchronized (this.X) {
                this.f12630d0.remove(iVar);
            }
        }
    }

    @Override // q8.f
    public final void c(p... pVarArr) {
        long max;
        if (this.f12631e0 == null) {
            this.f12631e0 = Boolean.valueOf(i.a(this.A, this.f12629c0));
        }
        if (!this.f12631e0.booleanValue()) {
            v.e().f(f12627i0, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.R) {
            this.Z.a(this);
            this.R = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            if (!this.Y.u(l.k(pVar))) {
                synchronized (this.X) {
                    try {
                        x8.i k10 = l.k(pVar);
                        b bVar = (b) this.f12630d0.get(k10);
                        if (bVar == null) {
                            int i2 = pVar.f14430k;
                            this.f12629c0.f11455d.getClass();
                            bVar = new b(i2, System.currentTimeMillis());
                            this.f12630d0.put(k10, bVar);
                        }
                        max = (Math.max((pVar.f14430k - bVar.f12625a) - 5, 0) * 30000) + bVar.f12626b;
                    } finally {
                    }
                }
                long max2 = Math.max(pVar.a(), max);
                this.f12629c0.f11455d.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (pVar.f14421b == e0.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        a aVar = this.L;
                        if (aVar != null) {
                            i0 i0Var = aVar.f12622b;
                            HashMap hashMap = aVar.f12624d;
                            Runnable runnable = (Runnable) hashMap.remove(pVar.f14420a);
                            if (runnable != null) {
                                ((Handler) i0Var.B).removeCallbacks(runnable);
                            }
                            h hVar = new h(7, aVar, pVar, false);
                            hashMap.put(pVar.f14420a, hVar);
                            aVar.f12623c.getClass();
                            ((Handler) i0Var.B).postDelayed(hVar, max2 - System.currentTimeMillis());
                        }
                    } else if (!k.a(p8.e.f11470j, pVar.f14429j)) {
                        p8.e eVar = pVar.f14429j;
                        if (eVar.f11474d) {
                            v.e().a(f12627i0, "Ignoring " + pVar + ". Requires device idle.");
                        } else if (!eVar.f11479i.isEmpty()) {
                            v.e().a(f12627i0, "Ignoring " + pVar + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(pVar);
                            hashSet2.add(pVar.f14420a);
                        }
                    } else if (!this.Y.u(l.k(pVar))) {
                        v.e().a(f12627i0, "Starting work for " + pVar.f14420a);
                        a0 a0Var = this.Y;
                        a0Var.getClass();
                        q8.j K = a0Var.K(l.k(pVar));
                        this.f12634h0.K(K);
                        a0 a0Var2 = this.f12628b0;
                        a0Var2.getClass();
                        a0Var2.I(K, null);
                    }
                }
            }
        }
        synchronized (this.X) {
            try {
                if (!hashSet.isEmpty()) {
                    v.e().a(f12627i0, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        p pVar2 = (p) it.next();
                        x8.i k11 = l.k(pVar2);
                        if (!this.B.containsKey(k11)) {
                            this.B.put(k11, t8.h.a(this.f12632f0, pVar2, this.f12633g0.f14970b, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // t8.f
    public final void d(p pVar, t8.c cVar) {
        x8.i k10 = l.k(pVar);
        boolean z10 = cVar instanceof t8.a;
        a0 a0Var = this.f12628b0;
        e eVar = this.f12634h0;
        String str = f12627i0;
        a0 a0Var2 = this.Y;
        if (z10) {
            if (!a0Var2.u(k10)) {
                v e6 = v.e();
                e6.a(str, "Constraints met: Scheduling work ID " + k10);
                q8.j K = a0Var2.K(k10);
                eVar.K(K);
                a0Var.getClass();
                a0Var.I(K, null);
                return;
            }
            return;
        }
        v e10 = v.e();
        e10.a(str, "Constraints not met: Cancelling work ID " + k10);
        q8.j E = a0Var2.E(k10);
        if (E != null) {
            eVar.i(E);
            int i2 = ((t8.b) cVar).f13136a;
            a0Var.getClass();
            a0Var.J(E, i2);
        }
    }

    @Override // q8.f
    public final boolean e() {
        return false;
    }
}
