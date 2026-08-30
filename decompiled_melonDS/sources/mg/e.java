package mg;

import g2.e7;
import mc.p;
import me.magnum.melonds.R;
import n2.r;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ l B;

    public /* synthetic */ e(l lVar, int i2) {
        this.A = i2;
        this.B = lVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        int i2;
        boolean z11;
        int i10;
        int i11;
        switch (this.A) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    k kVar = (k) this.B.f9658f.getValue();
                    if (kVar == null) {
                        i2 = -1;
                    } else {
                        i2 = j.f9651a[kVar.ordinal()];
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            rVar.X(761692536);
                            rVar.p(false);
                        } else {
                            rVar.X(761689740);
                            e7.b(l0.f.I(rVar, R.string.error_code_invalid_format), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
                            rVar.p(false);
                        }
                    } else {
                        rVar.X(761685389);
                        e7.b(l0.f.I(rVar, R.string.error_code_cannot_be_empty), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
                        rVar.p(false);
                    }
                } else {
                    rVar.R();
                }
                return y.f14813a;
            default:
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    if (this.B.f9653a) {
                        i10 = 2108218989;
                        i11 = R.string.new_cheat;
                    } else {
                        i10 = 2108220270;
                        i11 = R.string.edit_cheat;
                    }
                    e7.b(kc.a.h(rVar2, i10, i11, rVar2, false), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131070);
                } else {
                    rVar2.R();
                }
                return y.f14813a;
        }
    }
}
