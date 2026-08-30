package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jh1  reason: default package */
/* loaded from: classes.dex */
public final class jh1 implements u92 {
    public final u92 A;
    public final mi2 B;

    public jh1(u92 u92Var, mi2 mi2Var) {
        this.A = u92Var;
        this.B = mi2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, n75] */
    @Override // defpackage.u92
    public final Object a(w92 w92Var, j11 j11Var) {
        ?? obj = new Object();
        obj.A = n84.a;
        Object a = this.A.a(new hc(this, obj, w92Var), j11Var);
        if (a == p31.COROUTINE_SUSPENDED) {
            return a;
        }
        return o27.a;
    }
}
