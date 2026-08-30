package me.magnum.melonds.ui.settings.fragments;

import f1.n;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.l0;
import g2.m0;
import g2.n0;
import g2.p4;
import l1.r1;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.b1;
import n2.r;
import n2.s;
import n2.t2;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements p {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ Object B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ yb.d Y;

    public /* synthetic */ k(b3.p pVar, String str, String str2, boolean z10, mc.a aVar, int i2) {
        this.R = pVar;
        this.B = str;
        this.X = str2;
        this.L = z10;
        this.Y = aVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                SoftInputBehaviourPreferencesFragmentKt.a((b3.p) this.R, (String) this.B, (String) this.X, this.L, (mc.a) this.Y, (n2.m) obj, s.F(7));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                String str = (String) this.B;
                b1 b1Var = (b1) this.R;
                sc.a aVar = (sc.a) this.X;
                mc.l lVar = (mc.l) this.Y;
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    e7.b(str, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, ((f7) rVar.j(g7.f5161b)).f5150i, rVar, 0, 3120, 55294);
                    b3.p l10 = n.l(r1.b(b3.m.f1770a, 1.0f), false, null, 2);
                    float g10 = b1Var.g();
                    t2 t2Var = m0.f5257a;
                    g2.b1 p10 = n0.p(((l0) rVar.j(t2Var)).i(), ((l0) rVar.j(t2Var)).i(), rVar, 1018);
                    boolean f8 = rVar.f(b1Var);
                    Object L = rVar.L();
                    n2.e eVar = n2.l.f9953a;
                    if (f8 || L == eVar) {
                        L = new mh.r(b1Var, 2);
                        rVar.h0(L);
                    }
                    mc.l lVar2 = (mc.l) L;
                    boolean f10 = rVar.f(lVar) | rVar.f(b1Var);
                    Object L2 = rVar.L();
                    if (f10 || L2 == eVar) {
                        L2 = new q1.e(8, lVar, b1Var);
                        rVar.h0(L2);
                    }
                    p4.b(g10, lVar2, l10, this.L, aVar, (mc.a) L2, p10, rVar, 384);
                } else {
                    rVar.R();
                }
                return y.f14813a;
            default:
                ((Integer) obj2).getClass();
                wh.a.a((ve.f) this.R, this.L, (mc.a) this.Y, (mc.a) this.B, (mc.a) this.X, (n2.m) obj, s.F(1));
                break;
        }
        return y.f14813a;
    }

    public /* synthetic */ k(String str, b1 b1Var, boolean z10, sc.a aVar, mc.l lVar) {
        this.B = str;
        this.R = b1Var;
        this.L = z10;
        this.X = aVar;
        this.Y = lVar;
    }

    public /* synthetic */ k(ve.f fVar, boolean z10, mc.a aVar, mc.a aVar2, mc.a aVar3, int i2) {
        this.R = fVar;
        this.L = z10;
        this.Y = aVar;
        this.B = aVar2;
        this.X = aVar3;
    }
}
