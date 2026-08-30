package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a06  reason: default package */
/* loaded from: classes.dex */
public final class a06 implements w92 {
    public final zz5 A;

    public a06(nu4 nu4Var) {
        this.A = nu4Var;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        Object b = this.A.b(j11Var, obj);
        if (b == p31.COROUTINE_SUSPENDED) {
            return b;
        }
        return o27.a;
    }
}
