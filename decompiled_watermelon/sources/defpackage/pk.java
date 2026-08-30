package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pk  reason: default package */
/* loaded from: classes.dex */
public final class pk extends k11 {
    public String R;
    public w05 X;
    public yj Y;
    public Object Z;
    public boolean c0;
    public boolean d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ dl f0;
    public int g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(dl dlVar, k11 k11Var) {
        super(k11Var);
        this.f0 = dlVar;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.e0 = obj;
        this.g0 |= Integer.MIN_VALUE;
        Object q = this.f0.q(null, false, false, this);
        if (q == p31.COROUTINE_SUSPENDED) {
            return q;
        }
        return new nc5(q);
    }
}
