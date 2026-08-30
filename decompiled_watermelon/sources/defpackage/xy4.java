package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xy4  reason: default package */
/* loaded from: classes.dex */
public final class xy4 extends k11 {
    public long R;
    public String X;
    public boolean Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ az4 c0;
    public int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy4(az4 az4Var, k11 k11Var) {
        super(k11Var);
        this.c0 = az4Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.Z = obj;
        this.d0 |= Integer.MIN_VALUE;
        Object t = this.c0.t(0L, this, null, false);
        if (t == p31.COROUTINE_SUSPENDED) {
            return t;
        }
        return new nc5(t);
    }
}
