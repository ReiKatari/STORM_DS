package qh;

import a7.v;
import android.graphics.drawable.Drawable;
import b2.g;
import b4.o;
import cd.o1;
import g2.e7;
import g2.f7;
import g2.g7;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import n2.l;
import n2.m;
import n2.r;
import n2.s;
import n2.s2;
import n2.w0;
import ph.f;
import u1.m1;
import v2.h;
import yb.y;
import yh.j;
import z1.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ c(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int i2 = this.A;
        n2.e eVar = l.f9953a;
        boolean z12 = false;
        y yVar = y.f14813a;
        Object obj3 = this.L;
        Object obj4 = this.B;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                b.b((f) obj4, (mc.a) obj3, (m) obj, s.F(1));
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                String str = (String) obj4;
                String str2 = (String) obj3;
                m mVar = (m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z12 = true;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z12)) {
                    e7.b(str, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((f7) rVar.j(g7.f5161b)).f5150i, rVar, 0, 3120, 55294);
                    p7.l.b(str2, null, 0L, 0L, 0L, 0L, 2, false, 1, 0, null, null, rVar, 0, 3120, 120830);
                } else {
                    rVar.R();
                }
                return yVar;
            case 2:
                ((Integer) obj2).getClass();
                wh.a.b((xh.b) obj4, (mc.a) obj3, (m) obj, s.F(1));
                return yVar;
            case 3:
                RomDetailsActivity romDetailsActivity = (RomDetailsActivity) obj4;
                v vVar = romDetailsActivity.f9570x0;
                v vVar2 = (v) obj3;
                m mVar2 = (m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i10 = RomDetailsActivity.f9566z0;
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.O(intValue2 & 1, z10)) {
                    w0 m = s.m(((j) vVar.getValue()).f14842f, rVar2);
                    w0 m10 = s.m((o1) ((j) vVar.getValue()).f14844h.getValue(), rVar2);
                    w0 m11 = s.m((o1) ((yh.e) romDetailsActivity.f9571y0.getValue()).f12534e.getValue(), rVar2);
                    boolean h2 = rVar2.h(romDetailsActivity);
                    Object L = rVar2.L();
                    if (h2 || L == eVar) {
                        L = new m1(2, null, romDetailsActivity);
                        rVar2.h0(L);
                    }
                    s.g(null, (p) L, rVar2);
                    ij.a.u(false, h.c(-1991523385, new ai.v(romDetailsActivity, vVar2, m, m10, m11, 6), rVar2), rVar2, 48, 1);
                } else {
                    rVar2.R();
                }
                return yVar;
            case 4:
                g gVar = (g) obj4;
                x1.g gVar2 = (x1.g) obj3;
                m mVar3 = (m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar3 = (r) mVar3;
                if (rVar3.O(1 & intValue3, z11)) {
                    boolean f8 = rVar3.f(gVar);
                    Object L2 = rVar3.L();
                    if (f8 || L2 == eVar) {
                        L2 = s.q(new o(0, gVar, g.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 9));
                        rVar3.h0(L2);
                    }
                    k.a(gVar2, (x1.c) ((s2) L2).getValue(), rVar3, 0);
                } else {
                    rVar3.R();
                }
                return yVar;
            case l1.c.f8511g /* 5 */:
                ((Integer) obj2).getClass();
                k.a((x1.g) obj4, (x1.c) obj3, (m) obj, s.F(1));
                return yVar;
            case l1.c.f8509e /* 6 */:
                ((Integer) obj2).getClass();
                ((z1.p) obj4).a((Drawable) obj3, (m) obj, s.F(49));
                return yVar;
            default:
                ((Integer) obj2).getClass();
                zg.a.b((xg.h) obj4, (mc.a) obj3, (m) obj, s.F(1));
                return yVar;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, int i2, int i10) {
        this.A = i10;
        this.B = obj;
        this.L = obj2;
    }
}
