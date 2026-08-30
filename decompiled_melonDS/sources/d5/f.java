package d5;

import android.content.Context;
import android.os.Trace;
import bi.g0;
import cd.q;
import cd.q1;
import cd.u0;
import cd.x;
import d0.b1;
import d0.p;
import d0.r;
import d0.v1;
import d0.z;
import j0.b0;
import j0.d0;
import j0.l0;
import j0.o2;
import j0.w;
import j0.w0;
import j0.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public Object f3839a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3840b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3841c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3842d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3843e;

    /* renamed from: f  reason: collision with root package name */
    public Object f3844f;

    /* renamed from: g  reason: collision with root package name */
    public Object f3845g;

    /* renamed from: h  reason: collision with root package name */
    public Object f3846h;

    public f(sf.b bVar) {
        this.f3839a = bVar;
        q1 c4 = q.c(null);
        this.f3840b = c4;
        q1 c10 = q.c(null);
        this.f3841c = c10;
        q1 c11 = q.c(null);
        this.f3842d = c11;
        q1 c12 = q.c(null);
        this.f3843e = c12;
        q1 c13 = q.c(null);
        this.f3844f = c13;
        cd.h m = q.m(new x(new cd.h[]{c4, c10, c11, c12, c13}, new sf.e(null)));
        l7.a aVar = wc.b.B;
        cd.h l10 = q.l(m, zc.x.C(wc.j.l(50, wc.e.MILLISECONDS)));
        q1 c14 = q.c(null);
        this.f3845g = c14;
        this.f3846h = new u0(c14, l10, new g0(2, null, this));
    }

    public static final j0.x a(f fVar, r rVar) {
        Iterator it = rVar.f3444a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            p pVar = (p) next;
            j0.h hVar = p.f3434a;
            if (!nc.k.a(hVar, hVar)) {
                synchronized (w0.f7313a) {
                    w wVar = (w) w0.f7314b.get(hVar);
                }
                ((Context) fVar.f3844f).getClass();
            }
        }
        return y.f7326a;
    }

    public static final void b(f fVar, int i2) {
        int i10;
        boolean z10;
        d0.w wVar = (d0.w) fVar.f3843e;
        if (wVar != null) {
            w.j jVar = wVar.f3490g;
            if (jVar != null) {
                b0.a aVar = jVar.f13975b;
                synchronized (aVar.f1732a) {
                    try {
                        int i11 = aVar.f1738g;
                        if (i2 == i11) {
                            return;
                        }
                        aVar.f1738g = i2;
                        ArrayList arrayList = new ArrayList(aVar.f1734c);
                        if (i11 == 2 && i2 != 2) {
                            aVar.f1737f.clear();
                        }
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList.get(i12);
                            i12++;
                            l0 l0Var = (l0) obj;
                            synchronized (l0Var.f7256b) {
                                boolean z11 = true;
                                if (i2 == 2) {
                                    i10 = 2;
                                } else {
                                    i10 = 1;
                                }
                                l0Var.f7257c = i10;
                                if (i11 != 2 && i2 == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (i11 != 2 || i2 == 2) {
                                    z11 = false;
                                }
                                if (z10 || z11) {
                                    l0Var.b();
                                }
                            }
                        }
                        return;
                    } finally {
                    }
                }
            }
            a0.j.p("CameraX not initialized yet.");
        }
    }

    public static x0.b c(f fVar, EmulatorActivity emulatorActivity, r rVar, b1 b1Var) {
        x0.b bVar;
        Collection unmodifiableCollection;
        boolean contains;
        z zVar = z.R;
        Trace.beginSection(aj.g.v0("CX:bindToLifecycle-internal"));
        try {
            l0.f.e();
            d0.w wVar = (d0.w) fVar.f3843e;
            wVar.getClass();
            d0 c4 = rVar.c(wVar.f3484a.c());
            c4.getClass();
            c4.j(true);
            j0.c d4 = fVar.d(rVar);
            j0.h hVar = ((j0.x) d4.f7165c).A;
            hVar.getClass();
            String d10 = d4.f7325a.d();
            d10.getClass();
            d0.q qVar = new d0.q(t.A(d10), hVar);
            x0.e eVar = (x0.e) fVar.f3842d;
            synchronized (eVar.f14314a) {
                bVar = (x0.b) eVar.f14315b.get(new x0.a(System.identityHashCode(emulatorActivity), qVar));
            }
            x0.e eVar2 = (x0.e) fVar.f3842d;
            synchronized (eVar2.f14314a) {
                unmodifiableCollection = Collections.unmodifiableCollection(eVar2.f14315b.values());
            }
            for (v1 v1Var : (List) b1Var.f3334d) {
                for (Object obj : unmodifiableCollection) {
                    obj.getClass();
                    x0.b bVar2 = (x0.b) obj;
                    synchronized (bVar2.A) {
                        contains = ((ArrayList) bVar2.L.z()).contains(v1Var);
                    }
                    if (contains && !nc.k.a(bVar2.n(), emulatorActivity)) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{v1Var}, 1)));
                    }
                }
            }
            if (bVar == null) {
                x0.e eVar3 = (x0.e) fVar.f3842d;
                d0.w wVar2 = (d0.w) fVar.f3843e;
                wVar2.getClass();
                b9.e eVar4 = wVar2.f3494k;
                if (eVar4 != null) {
                    bVar = eVar3.b(emulatorActivity, new n0.f(c4, null, d4, null, zVar, zVar, (b0.a) eVar4.L, (jb.c) eVar4.X, (o2) eVar4.R));
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (!((List) b1Var.f3334d).isEmpty()) {
                x0.e eVar5 = (x0.e) fVar.f3842d;
                d0.w wVar3 = (d0.w) fVar.f3843e;
                wVar3.getClass();
                w.j jVar = wVar3.f3490g;
                if (jVar != null) {
                    eVar5.a(bVar, b1Var, jVar.f13975b);
                    ((HashSet) fVar.f3846h).add(new x0.a(System.identityHashCode(emulatorActivity), qVar));
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            return bVar;
        } finally {
            Trace.endSection();
        }
    }

    public j0.c d(r rVar) {
        Object obj;
        Trace.beginSection(aj.g.v0("CX:getCameraInfo"));
        try {
            d0.w wVar = (d0.w) this.f3843e;
            wVar.getClass();
            b0 k10 = rVar.c(wVar.f3484a.c()).k();
            k10.getClass();
            j0.x a10 = a(this, rVar);
            String d4 = k10.d();
            d4.getClass();
            d0.q qVar = new d0.q(t.A(d4), a10.A);
            synchronized (this.f3839a) {
                obj = ((HashMap) this.f3845g).get(qVar);
                if (obj == null) {
                    obj = new j0.c(k10, a10);
                    ((HashMap) this.f3845g).put(qVar, obj);
                }
            }
            return (j0.c) obj;
        } finally {
            Trace.endSection();
        }
    }

    public ve.n e(ve.n nVar, ve.o oVar) {
        boolean z10;
        ve.m mVar = nVar.f13822b;
        ve.m mVar2 = nVar.f13821a;
        boolean z11 = false;
        if (mVar2.f13820c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (mVar.f13820c == null && oVar.f13827e.f13810b != null) {
            z11 = true;
        }
        if (!z10 && !z11) {
            return nVar;
        }
        ve.n c4 = ((sf.b) this.f3839a).c(oVar);
        if (z10) {
            mVar2 = ve.m.a(mVar2, null, null, c4.f13821a.f13820c, 3);
        }
        if (z11) {
            mVar = ve.m.a(mVar, null, null, c4.f13822b.f13820c, 3);
        }
        return new ve.n(mVar2, mVar);
    }

    public void f() {
        Trace.beginSection(aj.g.v0("CX:unbindAll"));
        try {
            l0.f.e();
            b(this, 0);
            ((x0.e) this.f3842d).i((HashSet) this.f3846h);
        } finally {
            Trace.endSection();
        }
    }
}
