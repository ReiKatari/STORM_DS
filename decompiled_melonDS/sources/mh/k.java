package mh;

import g2.l0;
import g2.m0;
import g2.q0;
import l1.r1;
import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ ah.e0 B;
    public final /* synthetic */ mc.a L;
    public final /* synthetic */ s2 R;

    public /* synthetic */ k(ah.e0 e0Var, mc.a aVar, s2 s2Var, int i2) {
        this.A = i2;
        this.B = e0Var;
        this.L = aVar;
        this.R = s2Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        switch (this.A) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    n2.s.a(q0.f5361a.a(new i3.s(((l0) rVar.j(m0.f5257a)).f())), v2.h.c(-1324761356, new k(this.B, this.L, this.R, 1), rVar), rVar, 56);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            default:
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    l1.e0 e0Var = r1.f8615c;
                    zh.y yVar = (zh.y) this.R.getValue();
                    ah.e0 e0Var2 = this.B;
                    boolean h2 = rVar2.h(e0Var2);
                    Object L = rVar2.L();
                    n2.e eVar = n2.l.f9953a;
                    if (h2 || L == eVar) {
                        a2.g gVar = new a2.g(1, e0Var2, ah.e0.class, "viewAchievement", "viewAchievement(Lme/magnum/rcheevosapi/model/RAAchievement;)V", 0, 0, 16);
                        rVar2.h0(gVar);
                        L = gVar;
                    }
                    mc.l lVar = (mc.l) ((nc.i) L);
                    boolean h10 = rVar2.h(e0Var2);
                    Object L2 = rVar2.L();
                    if (h10 || L2 == eVar) {
                        b4.o oVar = new b4.o(0, e0Var2, ah.e0.class, "retryLoadAchievements", "retryLoadAchievements()V", 0, 0, 4);
                        rVar2.h0(oVar);
                        L2 = oVar;
                    }
                    x.a(e0Var, yVar, lVar, (mc.a) ((nc.i) L2), this.L, rVar2, 6);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
        }
    }
}
