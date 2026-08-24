package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z02  reason: default package */
/* loaded from: classes.dex */
public final class z02 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ sz1 Z;
    public final /* synthetic */ qz1 d0;
    public final /* synthetic */ long e0;
    public final /* synthetic */ long f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z02(sz1 sz1Var, qz1 qz1Var, long j, long j2, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = sz1Var;
        this.d0 = qz1Var;
        this.e0 = j;
        this.f0 = j2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((z02) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((z02) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new z02(this.Z, this.d0, this.e0, this.f0, r41Var, 0);
            default:
                return new z02(this.Z, this.d0, this.e0, this.f0, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        boolean z;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        ((hm5) obj).getClass();
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                oj4 oj4Var = this.Z.i;
                qz1 qz1Var = this.d0;
                String str = qz1Var.a;
                String str2 = qz1Var.b;
                long j = qz1Var.c;
                String str3 = qz1Var.f;
                gk4 gk4Var = qz1Var.d;
                if (gk4Var == gk4.HARDCORE) {
                    z = true;
                } else {
                    z = false;
                }
                ik4 ik4Var = qz1Var.e;
                this.Y = 1;
                if (oj4Var.d(str, str2, j, str3, this.e0, this.f0, z, gk4Var, ik4Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                xe1 xe1Var = xk1.a;
                de1 de1Var = de1.L;
                z02 z02Var = new z02(this.Z, this.d0, this.e0, this.f0, null, 0);
                this.Y = 1;
                if (hv.d0(de1Var, z02Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }
}
