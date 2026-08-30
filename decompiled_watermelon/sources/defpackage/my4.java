package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: my4  reason: default package */
/* loaded from: classes.dex */
public final class my4 extends k11 {
    public long R;
    public boolean X;
    public x15 Y;
    public Object Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ az4 d0;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my4(az4 az4Var, k11 k11Var) {
        super(k11Var);
        this.d0 = az4Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.c0 = obj;
        this.e0 |= Integer.MIN_VALUE;
        Object e = this.d0.e(0L, false, null, null, null, this);
        if (e == p31.COROUTINE_SUSPENDED) {
            return e;
        }
        return new nc5(e);
    }
}
