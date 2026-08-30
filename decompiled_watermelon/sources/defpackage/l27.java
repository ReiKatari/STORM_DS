package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l27  reason: default package */
/* loaded from: classes.dex */
public final class l27 extends nk6 implements cj2 {
    public int X;
    public /* synthetic */ Throwable Y;
    public /* synthetic */ long Z;

    /* JADX WARN: Type inference failed for: r4v2, types: [l27, nk6] */
    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        w92 w92Var = (w92) obj;
        long longValue = ((Number) obj3).longValue();
        ?? nk6Var = new nk6(4, (j11) obj4);
        nk6Var.Y = (Throwable) obj2;
        nk6Var.Z = longValue;
        return nk6Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            Throwable th = this.Y;
            long j = this.Z;
            y70.f().e(m27.a, "Cannot check for unfinished work", th);
            long min = Math.min(j * 30000, m27.b);
            this.X = 1;
            if (dk7.q(min, this) == p31Var) {
                return p31Var;
            }
        }
        return Boolean.TRUE;
    }
}
