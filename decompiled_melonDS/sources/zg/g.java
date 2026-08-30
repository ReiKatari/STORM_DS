package zg;

import java.util.List;
import l1.d1;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ b3.p B;
    public final /* synthetic */ d1 L;
    public final /* synthetic */ List R;
    public final /* synthetic */ mc.l X;
    public final /* synthetic */ mc.p Y;
    public final /* synthetic */ mc.p Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ mc.l f15093b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ int f15094c0;

    public /* synthetic */ g(b3.p pVar, d1 d1Var, List list, mc.l lVar, mc.p pVar2, mc.p pVar3, mc.l lVar2, int i2, int i10) {
        this.A = i10;
        this.B = pVar;
        this.L = d1Var;
        this.R = list;
        this.X = lVar;
        this.Y = pVar2;
        this.Z = pVar3;
        this.f15093b0 = lVar2;
        this.f15094c0 = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).intValue();
                a.p(this.B, this.L, this.R, this.X, this.Y, this.Z, this.f15093b0, (n2.m) obj, n2.s.F(this.f15094c0 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                a.f(this.B, this.L, this.R, this.X, this.Y, this.Z, this.f15093b0, (n2.m) obj, n2.s.F(this.f15094c0 | 1));
                break;
        }
        return y.f14813a;
    }
}
