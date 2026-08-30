package rd;

import ah.m1;
import android.content.Context;
import android.os.Build;
import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
import pf.q;
import pf.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements nb.c {

    /* renamed from: a  reason: collision with root package name */
    public final g f12644a;

    /* renamed from: b  reason: collision with root package name */
    public final c f12645b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12646c;

    public b(g gVar, c cVar, int i2) {
        this.f12644a = gVar;
        this.f12645b = cVar;
        this.f12646c = i2;
    }

    @Override // nb.c
    public final Object get() {
        g gVar = this.f12644a;
        d7.c cVar = gVar.f12663a;
        c cVar2 = this.f12645b;
        int i2 = this.f12646c;
        switch (i2) {
            case 0:
                return new jb.h();
            case DSiCameraSource.FrontCamera /* 1 */:
                return new Object();
            case 2:
                return new Object();
            case 3:
                Context context = cVar.f3920a;
                cf.d dVar = (cf.d) gVar.f12675n.get();
                s sVar = (s) cVar2.f12652f.get();
                ae.a aVar = (ae.a) cVar2.f12653g.get();
                xf.a aVar2 = (xf.a) gVar.f12677p.get();
                sd.h hVar = (sd.h) gVar.f12687z.get();
                lf.c cVar3 = (lf.c) cVar2.f12655i.get();
                dVar.getClass();
                sVar.getClass();
                aVar.getClass();
                aVar2.getClass();
                hVar.getClass();
                cVar3.getClass();
                return new pf.j(context, dVar, sVar, aVar, aVar2, hVar, cVar3);
            case 4:
                cf.d dVar2 = (cf.d) gVar.f12675n.get();
                be.c cVar4 = (be.c) gVar.m.get();
                dVar2.getClass();
                cVar4.getClass();
                return new s(dVar2, cVar4);
            case l1.c.f8511g /* 5 */:
                return new Object();
            case l1.c.f8509e /* 6 */:
                cf.d dVar3 = (cf.d) gVar.f12675n.get();
                m1 m1Var = new m1(3);
                m1Var.g(qe.a.BLACK_SCREEN, new Object());
                qe.a aVar3 = qe.a.PHYSICAL_CAMERAS;
                g gVar2 = cVar2.f12647a;
                d7.c cVar5 = gVar2.f12663a;
                Context context2 = cVar5.f3920a;
                q qVar = (q) cVar2.f12650d.get();
                sd.h hVar2 = (sd.h) gVar2.f12687z.get();
                qVar.getClass();
                hVar2.getClass();
                m1Var.g(aVar3, new lf.d(context2, qVar, hVar2));
                qe.a aVar4 = qe.a.STATIC_IMAGE;
                Context context3 = cVar5.f3920a;
                cf.d dVar4 = (cf.d) gVar2.f12675n.get();
                qf.a aVar5 = (qf.a) cVar2.f12654h.get();
                dVar4.getClass();
                aVar5.getClass();
                m1Var.g(aVar4, new lf.f(context3, dVar4, aVar5));
                Map d4 = m1Var.d();
                dVar3.getClass();
                d4.getClass();
                return new lf.c(d4, dVar3);
            case 7:
                Context context4 = cVar.f3920a;
                if (Build.VERSION.SDK_INT >= 28) {
                    return new qf.a(context4, 1);
                }
                return new qf.a(context4, 0);
            default:
                throw new AssertionError(i2);
        }
    }
}
