package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ry4  reason: default package */
/* loaded from: classes.dex */
public final class ry4 extends k11 {
    public long R;
    public /* synthetic */ Object X;
    public final /* synthetic */ az4 Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry4(az4 az4Var, k11 k11Var) {
        super(k11Var);
        this.Y = az4Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        Object o = this.Y.o(0L, 0, 0, this);
        if (o == p31.COROUTINE_SUSPENDED) {
            return o;
        }
        return new nc5(o);
    }
}
