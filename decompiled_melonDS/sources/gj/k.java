package gj;

import fj.a0;
import mc.p;
import nc.t;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements p {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ t B;
    public final /* synthetic */ a0 L;
    public final /* synthetic */ t R;
    public final /* synthetic */ t X;

    public /* synthetic */ k(a0 a0Var, t tVar, t tVar2, t tVar3) {
        this.L = a0Var;
        this.B = tVar;
        this.R = tVar2;
        this.X = tVar3;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int i2 = this.A;
        int intValue = ((Integer) obj).intValue();
        Long l10 = (Long) obj2;
        switch (i2) {
            case 0:
                long longValue = l10.longValue();
                if (intValue == 21589) {
                    long j2 = 1;
                    if (longValue >= 1) {
                        a0 a0Var = this.L;
                        byte readByte = a0Var.readByte();
                        boolean z12 = false;
                        if ((readByte & 1) == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((readByte & 2) == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((readByte & 4) == 4) {
                            z12 = true;
                        }
                        if (z10) {
                            j2 = 5;
                        }
                        if (z11) {
                            j2 += 4;
                        }
                        if (z12) {
                            j2 += 4;
                        }
                        if (longValue >= j2) {
                            if (z10) {
                                this.B.A = Integer.valueOf(a0Var.t());
                            }
                            if (z11) {
                                this.R.A = Integer.valueOf(a0Var.t());
                            }
                            if (z12) {
                                this.X.A = Integer.valueOf(a0Var.t());
                            }
                        } else {
                            fj.j.h("bad zip: extended timestamp extra too short");
                        }
                    } else {
                        fj.j.h("bad zip: extended timestamp extra too short");
                    }
                    return null;
                }
                return y.f14813a;
            default:
                long longValue2 = l10.longValue();
                if (intValue == 1) {
                    t tVar = this.B;
                    if (tVar.A == null) {
                        if (longValue2 == 24) {
                            a0 a0Var2 = this.L;
                            tVar.A = Long.valueOf(a0Var2.v());
                            this.R.A = Long.valueOf(a0Var2.v());
                            this.X.A = Long.valueOf(a0Var2.v());
                        } else {
                            fj.j.h("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        }
                    } else {
                        fj.j.h("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    return null;
                }
                return y.f14813a;
        }
    }

    public /* synthetic */ k(t tVar, a0 a0Var, t tVar2, t tVar3) {
        this.B = tVar;
        this.L = a0Var;
        this.R = tVar2;
        this.X = tVar3;
    }
}
