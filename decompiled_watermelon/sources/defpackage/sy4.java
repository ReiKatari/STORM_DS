package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sy4  reason: default package */
/* loaded from: classes.dex */
public final class sy4 extends k11 {
    public long R;
    public boolean X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ az4 Z;
    public int c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy4(az4 az4Var, k11 k11Var) {
        super(k11Var);
        this.Z = az4Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.Y = obj;
        this.c0 |= Integer.MIN_VALUE;
        Object p = this.Z.p(0L, false, this);
        if (p == p31.COROUTINE_SUSPENDED) {
            return p;
        }
        return new nc5(p);
    }
}
