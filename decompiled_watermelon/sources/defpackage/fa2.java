package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fa2  reason: default package */
/* loaded from: classes.dex */
public final class fa2 extends nk6 implements mi2 {
    public final /* synthetic */ long X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa2(long j, j11 j11Var) {
        super(1, j11Var);
        this.X = j;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        new fa2(this.X, (j11) obj).v(o27.a);
        throw null;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        throw new lt6("Timed out waiting for " + ((Object) im1.l(this.X)), null);
    }
}
