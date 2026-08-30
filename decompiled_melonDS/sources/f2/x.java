package f2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements mc.a {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    public /* synthetic */ x(int i2, s sVar) {
        this.L = sVar;
        this.B = i2;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                return Integer.valueOf(((l4.o0) ((s) this.L).f4792e).f8866b.d(this.B));
            default:
                return new q1.b(this.B, 0.0f, (mc.a) this.L);
        }
    }

    public /* synthetic */ x(int i2, mc.a aVar) {
        this.B = i2;
        this.L = aVar;
    }
}
