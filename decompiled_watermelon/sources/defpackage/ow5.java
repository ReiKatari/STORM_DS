package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ow5  reason: default package */
/* loaded from: classes.dex */
public final class ow5 extends nk6 implements aj2 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow5(long j, j11 j11Var) {
        super(2, j11Var);
        this.Y = j;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        o27 o27Var = o27.a;
        ((ow5) t((j11) obj2, (xw5) obj)).v(o27Var);
        return o27Var;
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        ow5 ow5Var = new ow5(this.Y, j11Var);
        ow5Var.X = obj;
        return ow5Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        ax5 ax5Var = ((xw5) this.X).a;
        ax5Var.c(ax5Var.k, this.Y, 1);
        return o27.a;
    }
}
