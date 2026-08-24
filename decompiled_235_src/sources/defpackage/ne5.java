package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ne5  reason: default package */
/* loaded from: classes.dex */
public final class ne5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ pe5 Z;
    public final /* synthetic */ z23 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne5(pe5 pe5Var, z23 z23Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = pe5Var;
        this.d0 = z23Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((ne5) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((ne5) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        z23 z23Var = this.d0;
        pe5 pe5Var = this.Z;
        switch (i) {
            case 0:
                return new ne5(pe5Var, z23Var, r41Var, 0);
            default:
                return new ne5(pe5Var, z23Var, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        z23 z23Var = this.d0;
        pe5 pe5Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    obj = pe5.a(pe5Var, z23Var, 0, this);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                a33 a33Var = (a33) obj;
                return obj;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object a = pe5.a(pe5Var, z23Var, 1, this);
                if (a == x61Var2) {
                    return x61Var2;
                }
                return a;
        }
    }
}
