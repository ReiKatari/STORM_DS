package xg;

import kf.s0;
import mc.p;
import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
import n2.l;
import n2.m;
import n2.r;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ DSiWareManagerActivity B;

    public /* synthetic */ a(DSiWareManagerActivity dSiWareManagerActivity, int i2) {
        this.A = i2;
        this.B = dSiWareManagerActivity;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int i2 = this.A;
        y yVar = y.f14813a;
        DSiWareManagerActivity dSiWareManagerActivity = this.B;
        m mVar = (m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i2) {
            case 0:
                int i10 = DSiWareManagerActivity.f9498y0;
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    ij.a.u(false, v2.h.c(-1462418469, new a(dSiWareManagerActivity, 1), rVar), rVar, 48, 1);
                } else {
                    rVar.R();
                }
                return yVar;
            default:
                int i11 = DSiWareManagerActivity.f9498y0;
                if ((intValue & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar;
                if (rVar2.O(intValue & 1, z11)) {
                    h hVar = (h) dSiWareManagerActivity.f9502x0.getValue();
                    boolean h2 = rVar2.h(dSiWareManagerActivity);
                    Object L = rVar2.L();
                    if (h2 || L == l.f9953a) {
                        L = new s0(21, dSiWareManagerActivity);
                        rVar2.h0(L);
                    }
                    zg.a.b(hVar, (mc.a) L, rVar2, 0);
                } else {
                    rVar2.R();
                }
                return yVar;
        }
    }
}
