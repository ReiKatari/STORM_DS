package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qa4  reason: default package */
/* loaded from: classes.dex */
public final class qa4 extends k11 {
    public String R;
    public String X;
    public z24 Y;
    public int Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ ra4 d0;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa4(ra4 ra4Var, k11 k11Var) {
        super(k11Var);
        this.d0 = ra4Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.c0 = obj;
        this.e0 |= Integer.MIN_VALUE;
        Object i = this.d0.i(null, null, this);
        if (i == p31.COROUTINE_SUSPENDED) {
            return i;
        }
        return new nc5(i);
    }
}
