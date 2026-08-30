package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jy1  reason: default package */
/* loaded from: classes.dex */
public final class jy1 extends nk6 implements aj2 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jm4 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy1(jm4 jm4Var, long j, j11 j11Var) {
        super(2, j11Var);
        this.Y = jm4Var;
        this.Z = j;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((jy1) t((j11) obj2, (iv1) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        jy1 jy1Var = new jy1(this.Y, this.Z, j11Var);
        jy1Var.X = obj;
        return jy1Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        boolean z;
        iv1 iv1Var = (iv1) this.X;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        if (iv1Var.a == this.Y.a.e && iv1Var.b >= this.Z) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
