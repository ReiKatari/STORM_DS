package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: la4  reason: default package */
/* loaded from: classes.dex */
public final class la4 extends k11 {
    public String R;
    public String X;
    public ba4 Y;
    public z24 Z;
    public int c0;
    public /* synthetic */ Object d0;
    public final /* synthetic */ ra4 e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la4(ra4 ra4Var, k11 k11Var) {
        super(k11Var);
        this.e0 = ra4Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.d0 = obj;
        this.f0 |= Integer.MIN_VALUE;
        Object c = this.e0.c(null, null, null, this);
        if (c == p31.COROUTINE_SUSPENDED) {
            return c;
        }
        return new nc5(c);
    }
}
