package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b96  reason: default package */
/* loaded from: classes.dex */
public final class b96 extends k11 {
    public long R;
    public long X;
    public boolean Y;
    public String Z;
    public Long c0;
    public l75 d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ g96 f0;
    public int g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b96(g96 g96Var, k11 k11Var) {
        super(k11Var);
        this.f0 = g96Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.e0 = obj;
        this.g0 |= Integer.MIN_VALUE;
        Object a = g96.a(this.f0, 0L, false, null, null, this);
        if (a == p31.COROUTINE_SUSPENDED) {
            return a;
        }
        return new nc5(a);
    }
}
