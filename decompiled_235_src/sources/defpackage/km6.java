package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: km6  reason: default package */
/* loaded from: classes.dex */
public final class km6 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ eo2 d0;
    public final /* synthetic */ qa4 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ km6(eo2 eo2Var, qa4 qa4Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = eo2Var;
        this.e0 = qa4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((km6) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((km6) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((km6) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((km6) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                km6 km6Var = new km6(this.d0, this.e0, r41Var, 0);
                km6Var.Z = obj;
                return km6Var;
            case 1:
                km6 km6Var2 = new km6(this.d0, this.e0, r41Var, 1);
                km6Var2.Z = obj;
                return km6Var2;
            case 2:
                km6 km6Var3 = new km6(this.d0, this.e0, r41Var, 2);
                km6Var3.Z = obj;
                return km6Var3;
            default:
                km6 km6Var4 = new km6(this.d0, this.e0, r41Var, 3);
                km6Var4.Z = obj;
                return km6Var4;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        qa4 qa4Var = this.e0;
        eo2 eo2Var = this.d0;
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
                q35 q35Var = new q35(qa4Var, ((w61) this.Z).A());
                this.Y = 1;
                if (eo2Var.o(q35Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            case 1:
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
                q35 q35Var2 = new q35(qa4Var, ((w61) this.Z).A());
                this.Y = 1;
                if (eo2Var.o(q35Var2, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                q35 q35Var3 = new q35(qa4Var, ((w61) this.Z).A());
                this.Y = 1;
                if (eo2Var.o(q35Var3, this) == x61Var3) {
                    return x61Var3;
                }
                return jg7Var;
            default:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                q35 q35Var4 = new q35(qa4Var, ((w61) this.Z).A());
                this.Y = 1;
                if (eo2Var.o(q35Var4, this) == x61Var4) {
                    return x61Var4;
                }
                return jg7Var;
        }
    }
}
