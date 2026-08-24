package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wl3  reason: default package */
/* loaded from: classes.dex */
public final class wl3 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ yl3 Z;
    public final /* synthetic */ fk3 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl3(yl3 yl3Var, fk3 fk3Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = yl3Var;
        this.d0 = fk3Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((wl3) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((wl3) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        fk3 fk3Var = this.d0;
        yl3 yl3Var = this.Z;
        switch (i) {
            case 0:
                return new wl3(yl3Var, fk3Var, r41Var, 0);
            default:
                return new wl3(yl3Var, fk3Var, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        yl3 yl3Var = this.Z;
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
                wa3 wa3Var = yl3Var.b;
                this.Y = 1;
                if (wa3Var.f(this.d0, this) == x61Var) {
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
                wa3 wa3Var2 = yl3Var.b;
                fk3 a = fk3.a(this.d0, null, null, dk3.CUSTOM, null, false, 0, null, 122);
                this.Y = 1;
                if (wa3Var2.f(a, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }
}
