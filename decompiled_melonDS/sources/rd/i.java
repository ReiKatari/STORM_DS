package rd;

import ah.e0;
import ah.h1;
import bi.i0;
import bi.j0;
import jg.u;
import kf.b1;
import kf.c0;
import kf.d1;
import kf.g1;
import kf.m0;
import kf.r0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import pf.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements nb.c {

    /* renamed from: a  reason: collision with root package name */
    public final g f12689a;

    /* renamed from: b  reason: collision with root package name */
    public final c f12690b;

    /* renamed from: c  reason: collision with root package name */
    public final j f12691c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12692d;

    public i(g gVar, c cVar, j jVar, int i2) {
        this.f12689a = gVar;
        this.f12690b = cVar;
        this.f12691c = jVar;
        this.f12692d = i2;
    }

    @Override // nb.c
    public final Object get() {
        c cVar = this.f12690b;
        j jVar = this.f12691c;
        g gVar = this.f12689a;
        int i2 = this.f12692d;
        switch (i2) {
            case 0:
                return new hg.l((r0) gVar.G.get(), (sd.i) gVar.C.get(), jVar.f12693a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new gi.a((cf.a) gVar.f12666d.get());
            case 2:
                return new u((cf.a) gVar.f12666d.get(), jVar.f12693a);
            case 3:
                return new gi.b((c0) gVar.H.get());
            case 4:
                return new xg.h((kf.g) gVar.J.get(), (cf.d) gVar.f12675n.get(), (c0) gVar.H.get());
            case l1.c.f8511g /* 5 */:
                return new xg.k((cf.c) gVar.f12680s.get(), (cf.d) gVar.f12675n.get(), (g1) gVar.f12678q.get());
            case l1.c.f8509e /* 6 */:
                c0 c0Var = (c0) gVar.H.get();
                xf.a aVar = (xf.a) gVar.f12677p.get();
                kf.g gVar2 = (kf.g) gVar.J.get();
                cf.d dVar = (cf.d) gVar.f12675n.get();
                c0Var.getClass();
                aVar.getClass();
                gVar2.getClass();
                dVar.getClass();
                return new vg.c(new b9.e(c0Var, aVar, gVar2, dVar, 8));
            case 7:
                return new e0((cf.d) gVar.f12675n.get(), (cf.b) gVar.f12673k.get(), (p) cVar.f12651e.get(), (pf.j) cVar.f12656j.get(), jVar.a());
            case 8:
                sf.b bVar = (sf.b) gVar.N.get();
                bVar.getClass();
                return new h1((cf.d) gVar.f12675n.get(), (cf.c) gVar.f12680s.get(), (cf.a) gVar.f12666d.get(), (cf.b) gVar.f12673k.get(), (xf.a) gVar.f12677p.get(), (b1) gVar.F.get(), (r0) gVar.G.get(), (m0) gVar.M.get(), (ae.a) cVar.f12653g.get(), new d5.f(bVar), (pf.j) cVar.f12656j.get(), (p) cVar.f12651e.get(), jVar.a(), jVar.f12693a);
            case l1.c.f8508d /* 9 */:
                return new ph.f((cf.d) gVar.f12675n.get());
            case l1.c.f8510f /* 10 */:
                sf.b bVar2 = (sf.b) gVar.N.get();
                bVar2.getClass();
                return new rh.e0((b1) gVar.F.get(), (r0) gVar.G.get(), new d5.f(bVar2), jVar.f12693a);
            case 11:
                return new xh.c((b1) gVar.F.get(), jVar.f12693a);
            case 12:
                return new xh.d((b1) gVar.F.get(), (cf.d) gVar.f12675n.get());
            case 13:
                return new gi.e((cf.b) gVar.f12673k.get());
            case 14:
                return new yh.e((cf.b) gVar.f12673k.get(), (cf.d) gVar.f12675n.get(), jVar.f12693a);
            case l1.c.f8512h /* 15 */:
                return new yh.j((yh.g) gVar.O.get(), (cf.c) gVar.f12680s.get(), (cf.d) gVar.f12675n.get(), (g1) gVar.f12678q.get(), (sd.i) gVar.C.get(), jVar.f12693a);
            case 16:
                return new i0((cf.c) gVar.f12680s.get(), (cf.d) gVar.f12675n.get(), (g1) gVar.f12678q.get(), (sd.i) gVar.C.get(), (sd.d) gVar.f12681t.get());
            case 17:
                return new gi.f((d1) gVar.f12676o.get());
            case 18:
                return new j0((hf.b) gVar.Q.get(), (jf.b) gVar.R.get());
            default:
                throw new AssertionError(i2);
        }
    }
}
