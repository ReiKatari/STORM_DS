package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ek  reason: default package */
/* loaded from: classes.dex */
public final class ek extends k11 {
    public long R;
    public boolean X;
    public boolean Y;
    public yj Z;
    public Object c0;
    public y05 d0;
    public int e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ dl g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(dl dlVar, k11 k11Var) {
        super(k11Var);
        this.g0 = dlVar;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.f0 = obj;
        this.h0 |= Integer.MIN_VALUE;
        Object g = this.g0.g(0L, false, null, false, this);
        if (g == p31.COROUTINE_SUSPENDED) {
            return g;
        }
        return new nc5(g);
    }
}
