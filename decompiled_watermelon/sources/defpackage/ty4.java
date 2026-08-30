package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ty4  reason: default package */
/* loaded from: classes.dex */
public final class ty4 extends k11 {
    public String R;
    public String X;
    public Object Y;
    public v57 Z;
    public int c0;
    public /* synthetic */ Object d0;
    public final /* synthetic */ az4 e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty4(az4 az4Var, k11 k11Var) {
        super(k11Var);
        this.e0 = az4Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.d0 = obj;
        this.f0 |= Integer.MIN_VALUE;
        Object q = this.e0.q(null, null, this);
        if (q == p31.COROUTINE_SUSPENDED) {
            return q;
        }
        return new nc5(q);
    }
}
