package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ic5  reason: default package */
/* loaded from: classes.dex */
public abstract class ic5 extends m00 {
    public ic5(j11 j11Var) {
        super(j11Var);
        if (j11Var != null && j11Var.a() != mp1.A) {
            i.i("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        }
    }

    @Override // defpackage.j11
    public final e31 a() {
        return mp1.A;
    }
}
