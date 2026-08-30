package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hk  reason: default package */
/* loaded from: classes.dex */
public final class hk extends k11 {
    public t05 R;
    public boolean X;
    public int Y;
    public int Z;
    public long c0;
    public /* synthetic */ Object d0;
    public final /* synthetic */ dl e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(dl dlVar, k11 k11Var) {
        super(k11Var);
        this.e0 = dlVar;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.d0 = obj;
        this.f0 |= Integer.MIN_VALUE;
        Object j = this.e0.j(null, false, this);
        if (j == p31.COROUTINE_SUSPENDED) {
            return j;
        }
        return new nc5(j);
    }
}
