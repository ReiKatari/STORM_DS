package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qw5  reason: default package */
/* loaded from: classes.dex */
public final class qw5 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ rw5 Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ float c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw5(rw5 rw5Var, float f, float f2, j11 j11Var) {
        super(2, j11Var);
        this.Y = rw5Var;
        this.Z = f;
        this.c0 = f2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((qw5) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new qw5(this.Y, this.Z, this.c0, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            ax5 ax5Var = this.Y.I0;
            long floatToRawIntBits = Float.floatToRawIntBits(this.Z);
            this.X = 1;
            if (lw5.a(ax5Var, (floatToRawIntBits << 32) | (Float.floatToRawIntBits(this.c0) & 4294967295L), this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
