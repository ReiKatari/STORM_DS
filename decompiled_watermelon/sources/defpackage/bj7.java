package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bj7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bj7 implements jn3, jj2 {
    public final /* synthetic */ dv0 A;

    public bj7(dv0 dv0Var) {
        this.A = dv0Var;
    }

    @Override // defpackage.jj2
    public final wi2 a() {
        return new lj2(1, this.A, dv0.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0, 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof jn3) && (obj instanceof jj2)) {
            return a().equals(((jj2) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
