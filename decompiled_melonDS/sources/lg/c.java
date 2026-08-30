package lg;

import a7.d0;
import android.net.Uri;
import c1.p;
import c1.y1;
import cd.a1;
import java.util.UUID;
import jg.u;
import l1.d1;
import l1.e0;
import l1.r1;
import mc.r;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
import n2.w0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements r {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ c(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [kg.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kg.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [kg.f, java.lang.Object] */
    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2 = this.A;
        y yVar = y.f14813a;
        n2.e eVar = n2.l.f9953a;
        Object obj5 = this.L;
        Object obj6 = this.B;
        switch (i2) {
            case 0:
                u uVar = (u) obj6;
                d1 d1Var = (d1) obj5;
                n2.m mVar = (n2.m) obj3;
                ((Integer) obj4).getClass();
                ((p) obj).getClass();
                ((a7.i) obj2).getClass();
                w0 k10 = p7.j.k((a1) uVar.f7883i.getValue(), new Object(), mVar, 0);
                e0 e0Var = r1.f8615c;
                kg.h hVar = (kg.h) k10.getValue();
                n2.r rVar = (n2.r) mVar;
                boolean h2 = rVar.h(uVar);
                Object L = rVar.L();
                if (h2 || L == eVar) {
                    L = new f(uVar, 4);
                    rVar.h0(L);
                }
                j.e(e0Var, d1Var, hVar, (mc.l) L, rVar, 6);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                u uVar2 = (u) obj6;
                d1 d1Var2 = (d1) obj5;
                n2.m mVar2 = (n2.m) obj3;
                ((Integer) obj4).getClass();
                ((p) obj).getClass();
                ((a7.i) obj2).getClass();
                w0 k11 = p7.j.k((a1) uVar2.f7884j.getValue(), new Object(), mVar2, 0);
                e0 e0Var2 = r1.f8615c;
                kg.h hVar2 = (kg.h) k11.getValue();
                n2.r rVar2 = (n2.r) mVar2;
                boolean h10 = rVar2.h(uVar2);
                Object L2 = rVar2.L();
                if (h10 || L2 == eVar) {
                    L2 = new f(uVar2, 1);
                    rVar2.h0(L2);
                }
                mc.l lVar = (mc.l) L2;
                boolean h11 = rVar2.h(uVar2);
                Object L3 = rVar2.L();
                if (h11 || L3 == eVar) {
                    L3 = new f(uVar2, 2);
                    rVar2.h0(L3);
                }
                j.d(e0Var2, d1Var2, hVar2, lVar, (mc.l) L3, rVar2, 6);
                return yVar;
            case 2:
                u uVar3 = (u) obj6;
                d1 d1Var3 = (d1) obj5;
                n2.m mVar3 = (n2.m) obj3;
                ((Integer) obj4).getClass();
                ((p) obj).getClass();
                ((a7.i) obj2).getClass();
                w0 k12 = p7.j.k((a1) uVar3.f7886l.getValue(), new Object(), mVar3, 0);
                e0 e0Var3 = r1.f8615c;
                kg.h hVar3 = (kg.h) k12.getValue();
                n2.r rVar3 = (n2.r) mVar3;
                boolean h12 = rVar3.h(uVar3);
                Object L4 = rVar3.L();
                if (h12 || L4 == eVar) {
                    L4 = new f(uVar3, 3);
                    rVar3.h0(L4);
                }
                j.c(e0Var3, d1Var3, hVar3, (mc.l) L4, rVar3, 6);
                return yVar;
            default:
                y1 y1Var = (y1) obj6;
                d0 d0Var = (d0) obj5;
                p pVar = (p) obj;
                a7.i iVar = (a7.i) obj2;
                int intValue = ((Integer) obj4).intValue();
                int i10 = BackgroundsActivity.f9488y0;
                pVar.getClass();
                iVar.getClass();
                eg.c cVar = ((hg.h) ij.a.y0(iVar, nc.u.a(hg.h.class))).f6496d;
                oe.a aVar = new oe.a(UUID.fromString(cVar.A), cVar.B, Uri.parse(cVar.L));
                n2.r rVar4 = (n2.r) ((n2.m) obj3);
                boolean h13 = rVar4.h(d0Var);
                Object L5 = rVar4.L();
                if (h13 || L5 == eVar) {
                    L5 = new a7.k(d0Var, 2);
                    rVar4.h0(L5);
                }
                ig.m.f(aVar, y1Var, pVar, (mc.a) L5, rVar4, (intValue << 6) & 896);
                return yVar;
        }
    }
}
