package c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends nc.l implements mc.l {
    public final /* synthetic */ u B;
    public final /* synthetic */ y3.i1 L;
    public final /* synthetic */ long R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, y3.i1 i1Var, long j2) {
        super(1);
        this.B = uVar;
        this.L = i1Var;
        this.R = j2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        b3.d dVar = this.B.f2529l0.f2533b;
        y3.i1 i1Var = this.L;
        int i2 = i1Var.A;
        y3.h1.l((y3.h1) obj, i1Var, dVar.a((i1Var.B & 4294967295L) | (i2 << 32), this.R, x4.m.Ltr));
        return yb.y.f14813a;
    }
}
