package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o3 implements f2, nc.g {
    public final /* synthetic */ n2.v A;

    public o3(n2.v vVar) {
        this.A = vVar;
    }

    @Override // nc.g
    public final yb.d b() {
        return new nc.i(1, this.A, n2.v.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof f2) && (obj instanceof nc.g)) {
            return b().equals(((nc.g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
