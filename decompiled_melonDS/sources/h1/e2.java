package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e2 extends nc.a implements mc.p {

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ int f5888b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(int i2, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i2, i10, cls, obj, str, str2);
        this.f5888b0 = i11;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [nc.l, mc.a] */
    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.f5888b0) {
            case 0:
                long j2 = ((x4.q) obj).f14352a;
                cc.c cVar = (cc.c) obj2;
                i2 i2Var = (i2) this.A;
                zc.u uVar = (zc.u) ((nc.l) i2Var.E0.R).b();
                if (uVar != null) {
                    zc.x.v(uVar, null, null, new g2(i2Var, j2, null, 1), 3);
                    return yb.y.f14813a;
                }
                a0.j.p("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
                return null;
            default:
                int intValue = ((Number) obj2).intValue();
                ((v2.c) this.A).m((n2.m) obj, intValue);
                return yb.y.f14813a;
        }
    }
}
