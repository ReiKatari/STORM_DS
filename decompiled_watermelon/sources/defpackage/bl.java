package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bl  reason: default package */
/* loaded from: classes.dex */
public final class bl extends k11 {
    public long R;
    public int X;
    public x15 Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ dl c0;
    public int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(dl dlVar, k11 k11Var) {
        super(k11Var);
        this.c0 = dlVar;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.Z = obj;
        this.d0 |= Integer.MIN_VALUE;
        Object D = this.c0.D(0L, 0, null, this);
        if (D == p31.COROUTINE_SUSPENDED) {
            return D;
        }
        return new nc5(D);
    }
}
