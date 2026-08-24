package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e12  reason: default package */
/* loaded from: classes.dex */
public final class e12 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ sz1 Z;
    public final /* synthetic */ pq5 d0;
    public final /* synthetic */ boolean e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e12(sz1 sz1Var, pq5 pq5Var, boolean z, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = sz1Var;
        this.d0 = pq5Var;
        this.e0 = z;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((e12) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((e12) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((e12) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                return new e12(this.Z, this.d0, this.e0, r41Var, 0);
            case 1:
                return new e12(this.Z, this.d0, this.e0, r41Var, 1);
            default:
                return new e12(this.Z, this.d0, this.e0, r41Var, 2);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object j;
        Object x;
        Object A;
        int i = this.X;
        boolean z = this.e0;
        pq5 pq5Var = this.d0;
        sz1 sz1Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        j = ((hm5) obj).A;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    pn5 pn5Var = sz1Var.g;
                    String str = pq5Var.i;
                    this.Y = 1;
                    j = ((pl) pn5Var).j(str, z, this);
                    if (j == x61Var) {
                        return x61Var;
                    }
                }
                return new hm5(j);
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        x = ((hm5) obj).A;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    pn5 pn5Var2 = sz1Var.g;
                    String str2 = pq5Var.i;
                    this.Y = 1;
                    x = ((pl) pn5Var2).x(str2, z, this);
                    if (x == x61Var2) {
                        return x61Var2;
                    }
                }
                Object obj2 = x;
                oi2.Y(obj2);
                return obj2;
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        A = ((hm5) obj).A;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    pn5 pn5Var3 = sz1Var.g;
                    String str3 = pq5Var.i;
                    this.Y = 1;
                    A = ((pl) pn5Var3).A(str3, z, this);
                    if (A == x61Var3) {
                        return x61Var3;
                    }
                }
                return new hm5(A);
        }
    }
}
