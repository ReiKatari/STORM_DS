package u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ v0 B;

    public /* synthetic */ r0(v0 v0Var, int i2) {
        this.A = i2;
        this.B = v0Var;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                this.B.b();
                break;
            default:
                this.B.onCancel();
                break;
        }
        return yb.y.f14813a;
    }
}
