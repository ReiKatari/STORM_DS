package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zw1  reason: default package */
/* loaded from: classes.dex */
public final class zw1 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ s9 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw1(s9 s9Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = s9Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((zw1) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((zw1) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        s9 s9Var = this.Z;
        switch (i) {
            case 0:
                return new zw1(s9Var, r41Var, 0);
            default:
                return new zw1(s9Var, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        s9 s9Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                be5 be5Var = s9Var.A().e;
                y6 y6Var = new y6(s9Var, 6);
                this.Y = 1;
                if (be5Var.A.b(y6Var, this) == x61Var) {
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
                ku3 ku3Var = ((jq) s9Var.a).A;
                tt3 tt3Var = tt3.CREATED;
                zw1 zw1Var = new zw1(s9Var, null, 0);
                this.Y = 1;
                if (np2.c0(ku3Var, tt3Var, zw1Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }
}
