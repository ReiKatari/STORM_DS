package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wc4  reason: default package */
/* loaded from: classes.dex */
public final class wc4 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public float Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc4(float f, n96 n96Var, sb4 sb4Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = f;
        this.d0 = n96Var;
        this.e0 = sb4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((wc4) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((wc4) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((wc4) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.e0;
        switch (i) {
            case 0:
                return new wc4(this.Z, (n96) this.d0, (sb4) obj2, r41Var);
            case 1:
                return new wc4((ka0) this.d0, this.Z, (to) obj2, r41Var);
            default:
                wc4 wc4Var = new wc4((ga7) obj2, r41Var);
                wc4Var.d0 = obj;
                return wc4Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
        if (r11.v(r0, r11.b.getValue(), r11) == r6) goto L48;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object a;
        float y;
        w61 w61Var;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.e0;
        switch (i) {
            case 0:
                n96 n96Var = (n96) this.d0;
                float f = this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    if (f > RecyclerView.B1) {
                        this.Y = 1;
                        break;
                    }
                }
                if (f == RecyclerView.B1) {
                    sb4 sb4Var = (sb4) obj2;
                    this.Y = 2;
                    ga7 ga7Var = n96Var.e;
                    if (ga7Var == null || ((nb3.k(n96Var.c.getValue(), sb4Var) && nb3.k(n96Var.b.getValue(), sb4Var)) || (a = eb4.a(n96Var.l, new h96(n96Var, sb4Var, ga7Var, (r41) null), this)) != x61Var)) {
                        a = jg7Var;
                    }
                    if (a != x61Var) {
                        return jg7Var;
                    }
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
                this.Y = 1;
                if (gn.c((gn) ((ka0) this.d0).c, new Float(this.Z), (to) obj2, null, this, 12) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y = this.Z;
                        w61Var = (w61) this.d0;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    w61 w61Var2 = (w61) this.d0;
                    y = kj2.y(w61Var2.A());
                    w61Var = w61Var2;
                }
                while (g04.H(w61Var)) {
                    n4 n4Var = new n4((ga7) obj2, y);
                    this.d0 = w61Var;
                    this.Z = y;
                    this.Y = 1;
                    l61 l61Var = this.B;
                    l61Var.getClass();
                    if (ii2.x(l61Var).a(n4Var, this) == x61Var3) {
                        return x61Var3;
                    }
                }
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc4(ka0 ka0Var, float f, to toVar, r41 r41Var) {
        super(2, r41Var);
        this.d0 = ka0Var;
        this.Z = f;
        this.e0 = toVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc4(ga7 ga7Var, r41 r41Var) {
        super(2, r41Var);
        this.e0 = ga7Var;
    }
}
