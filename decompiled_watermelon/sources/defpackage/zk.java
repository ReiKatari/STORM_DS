package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zk  reason: default package */
/* loaded from: classes.dex */
public final class zk extends k11 {
    public long R;
    public long X;
    public boolean Y;
    public Long Z;
    public x15 c0;
    public v15 d0;
    public String e0;
    public Long f0;
    public Object g0;
    public ez4 h0;
    public q15 i0;
    public /* synthetic */ Object j0;
    public final /* synthetic */ dl k0;
    public int l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(dl dlVar, k11 k11Var) {
        super(k11Var);
        this.k0 = dlVar;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.j0 = obj;
        this.l0 |= Integer.MIN_VALUE;
        Object B = this.k0.B(0L, 0L, false, null, null, this);
        if (B == p31.COROUTINE_SUSPENDED) {
            return B;
        }
        return new nc5(B);
    }
}
