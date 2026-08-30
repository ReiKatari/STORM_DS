package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dk  reason: default package */
/* loaded from: classes.dex */
public final class dk extends k11 {
    public long R;
    public yj X;
    public t05 Y;
    public Throwable Z;
    public boolean c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ dl i0;
    public int j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(dl dlVar, k11 k11Var) {
        super(k11Var);
        this.i0 = dlVar;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.h0 = obj;
        this.j0 |= Integer.MIN_VALUE;
        Object f = this.i0.f(0L, null, null, false, this);
        if (f == p31.COROUTINE_SUSPENDED) {
            return f;
        }
        return new nc5(f);
    }
}
