package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s46  reason: default package */
/* loaded from: classes.dex */
public final class s46 extends nk6 implements bj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ k46 Y;
    public /* synthetic */ boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s46(int i, int i2, j11 j11Var) {
        super(i, j11Var);
        this.X = i2;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        o27 o27Var = o27.a;
        k46 k46Var = (k46) obj;
        Boolean bool = (Boolean) obj2;
        switch (i) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                s46 s46Var = new s46(3, 0, (j11) obj3);
                s46Var.Y = k46Var;
                s46Var.Z = booleanValue;
                return s46Var.v(o27Var);
            case 1:
                boolean booleanValue2 = bool.booleanValue();
                s46 s46Var2 = new s46(3, 1, (j11) obj3);
                s46Var2.Y = k46Var;
                s46Var2.Z = booleanValue2;
                return s46Var2.v(o27Var);
            default:
                boolean booleanValue3 = bool.booleanValue();
                s46 s46Var3 = new s46(3, 2, (j11) obj3);
                s46Var3.Y = k46Var;
                s46Var3.Z = booleanValue3;
                return s46Var3.v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        switch (this.X) {
            case 0:
                k46 k46Var = this.Y;
                boolean z = this.Z;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return k46.a(k46Var, z, false, false, 223);
            case 1:
                k46 k46Var2 = this.Y;
                boolean z2 = this.Z;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return k46.a(k46Var2, false, z2, false, 191);
            default:
                k46 k46Var3 = this.Y;
                boolean z3 = this.Z;
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return k46.a(k46Var3, false, false, z3, 127);
        }
    }
}
