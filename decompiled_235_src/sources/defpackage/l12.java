package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l12  reason: default package */
/* loaded from: classes.dex */
public final class l12 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ sz1 Y;
    public final /* synthetic */ qz1 Z;
    public final /* synthetic */ long d0;
    public final /* synthetic */ long e0;
    public final /* synthetic */ long f0;
    public final /* synthetic */ long g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l12(sz1 sz1Var, qz1 qz1Var, long j, long j2, long j3, long j4, r41 r41Var) {
        super(2, r41Var);
        this.Y = sz1Var;
        this.Z = qz1Var;
        this.d0 = j;
        this.e0 = j2;
        this.f0 = j3;
        this.g0 = j4;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((l12) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new l12(this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object obj2;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        qz1 qz1Var = this.Z;
        sz1 sz1Var = this.Y;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    oi2.Y(obj);
                    obj2 = ((hm5) obj).A;
                    oi2.Y(obj2);
                    return jg7.a;
                }
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oi2.Y(obj);
        } else {
            oi2.Y(obj);
            qf4 qf4Var = sz1Var.h;
            fb5 fb5Var = new fb5(qz1Var.c, this.d0, true, false);
            this.X = 1;
            if (qf4Var.b(fb5Var, this) == x61Var) {
                return x61Var;
            }
        }
        oj4 oj4Var = sz1Var.i;
        String str = qz1Var.a;
        String str2 = qz1Var.b;
        long j = qz1Var.c;
        String str3 = qz1Var.f;
        gk4 gk4Var = gk4.SOFTCORE;
        ik4 ik4Var = qz1Var.e;
        this.X = 2;
        Object b = oj4Var.b(str, str2, j, this.d0, str3, this.e0, this.f0, this.g0, gk4Var, ik4Var, this);
        if (b == x61Var) {
            return x61Var;
        }
        obj2 = b;
        oi2.Y(obj2);
        return jg7.a;
    }
}
