package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements v {
    public final /* synthetic */ int A = 0;
    public final Object B;
    public final Object L;

    public h(w wVar) {
        this.B = wVar;
        d dVar = d.f1456c;
        Class<?> cls = wVar.getClass();
        b bVar = (b) dVar.f1457a.get(cls);
        this.L = bVar == null ? dVar.a(cls, null) : bVar;
    }

    @Override // androidx.lifecycle.v
    public final void d(x xVar, p pVar) {
        switch (this.A) {
            case 0:
                f fVar = (f) this.B;
                switch (g.f1474a[pVar.ordinal()]) {
                    case DSiCameraSource.FrontCamera /* 1 */:
                        fVar.getClass();
                        break;
                    case 2:
                        fVar.onStart(xVar);
                        break;
                    case 3:
                        fVar.onResume(xVar);
                        break;
                    case 4:
                        fVar.getClass();
                        break;
                    case l1.c.f8511g /* 5 */:
                        fVar.onStop(xVar);
                        break;
                    case l1.c.f8509e /* 6 */:
                        fVar.onDestroy(xVar);
                        break;
                    case 7:
                        a0.j.h("ON_ANY must not been send by anybody");
                        return;
                    default:
                        m9.o.o();
                        return;
                }
                v vVar = (v) this.L;
                if (vVar != null) {
                    vVar.d(xVar, pVar);
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                if (pVar == p.ON_START) {
                    ((r) this.B).c(this);
                    ((q7.d) this.L).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((b) this.L).f1445a;
                Object obj = this.B;
                b.a((List) hashMap.get(pVar), xVar, pVar, obj);
                b.a((List) hashMap.get(p.ON_ANY), xVar, pVar, obj);
                return;
        }
    }

    public h(f fVar, v vVar) {
        fVar.getClass();
        this.B = fVar;
        this.L = vVar;
    }

    public h(r rVar, q7.d dVar) {
        this.B = rVar;
        this.L = dVar;
    }
}
