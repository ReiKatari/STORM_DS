package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bt1  reason: default package */
/* loaded from: classes.dex */
public final class bt1 extends k11 {
    public /* synthetic */ Object R;
    public final /* synthetic */ ct1 X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt1(ct1 ct1Var, k11 k11Var) {
        super(k11Var);
        this.X = ct1Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object k = this.X.k(null, false, this);
        if (k == p31.COROUTINE_SUSPENDED) {
            return k;
        }
        return new nc5(k);
    }
}
