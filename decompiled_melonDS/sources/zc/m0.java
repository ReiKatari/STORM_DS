package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 extends o0 {
    public final h L;
    public final /* synthetic */ q0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(q0 q0Var, long j2, h hVar) {
        super(j2);
        this.R = q0Var;
        this.L = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.L.F(this.R, yb.y.f14813a);
    }

    @Override // zc.o0
    public final String toString() {
        return super.toString() + this.L;
    }
}
