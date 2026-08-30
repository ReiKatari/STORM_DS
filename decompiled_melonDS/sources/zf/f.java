package zf;

import bg.h;
import mc.l;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.DSiWareTitle;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements l {
    public final /* synthetic */ int A;

    @Override // mc.l
    public final Object k(Object obj) {
        h.a aVar;
        switch (this.A) {
            case 0:
                bg.f fVar = (bg.f) obj;
                fVar.getClass();
                String p10 = fVar.p();
                String m = fVar.m();
                String n10 = fVar.n();
                String s10 = fVar.s();
                String q10 = fVar.q();
                af.f m10 = fVar.l().m();
                af.h n11 = fVar.l().n();
                String k10 = fVar.l().k();
                bg.d l10 = fVar.l();
                if (l10.l()) {
                    aVar = h.a.GbaRom;
                } else {
                    aVar = h.a.None;
                }
                return new bg.g(p10, m, n10, s10, q10, new bg.e(m10, n11, k10, new bg.h(aVar, l10.i(), l10.j())), fVar.o(), fVar.t(), fVar.r());
            case DSiCameraSource.FrontCamera /* 1 */:
                od.h hVar = (od.h) obj;
                hVar.getClass();
                hVar.f10895a = false;
                return y.f14813a;
            case 2:
                of.b bVar = (of.b) obj;
                bVar.getClass();
                if (bVar.c()) {
                    return of.b.a(bVar, of.a.a(bVar.b(), af.f.DSi));
                }
                return bVar;
            case 3:
                od.h hVar2 = (od.h) obj;
                hVar2.getClass();
                hVar2.f10895a = false;
                return y.f14813a;
            default:
                DSiWareTitle dSiWareTitle = (DSiWareTitle) obj;
                dSiWareTitle.getClass();
                return Long.valueOf(dSiWareTitle.getTitleId());
        }
    }
}
