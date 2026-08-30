package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o60  reason: default package */
/* loaded from: classes.dex */
public final class o60 extends k11 {
    public /* synthetic */ Object R;
    public final /* synthetic */ q60 X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(q60 q60Var, k11 k11Var) {
        super(k11Var);
        this.X = q60Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object M = q60.M(this.X, this);
        if (M == p31.COROUTINE_SUSPENDED) {
            return M;
        }
        return new xj0(M);
    }
}
