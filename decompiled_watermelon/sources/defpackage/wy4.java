package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wy4  reason: default package */
/* loaded from: classes.dex */
public final class wy4 extends k11 {
    public long R;
    public String X;
    public String Y;
    public boolean Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ az4 d0;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy4(az4 az4Var, k11 k11Var) {
        super(k11Var);
        this.d0 = az4Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.c0 = obj;
        this.e0 |= Integer.MIN_VALUE;
        Object s = this.d0.s(0L, null, false, null, this);
        if (s == p31.COROUTINE_SUSPENDED) {
            return s;
        }
        return new nc5(s);
    }
}
