package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sn5  reason: default package */
/* loaded from: classes.dex */
public final class sn5 extends qo7 {
    public final pn5 b;
    public final tp6 c;
    public final ex6 d;
    public final de5 e;
    public final tp6 f;
    public final de5 g;
    public final of6 h;
    public final be5 i;

    public sn5(pn5 pn5Var) {
        pn5Var.getClass();
        this.b = pn5Var;
        this.c = up6.a(om5.b);
        this.d = new ex6(new er2(this, 19));
        this.e = f04.R(new de5(((pl) pn5Var).d.c), to7.a(this), new mp6(5000L, Long.MAX_VALUE), null);
        tp6 a = up6.a(Boolean.FALSE);
        this.f = a;
        this.g = new de5(a);
        of6 b = pf6.b(0, 1, m80.DROP_OLDEST, 1);
        this.h = b;
        this.i = new be5(b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(sn5 sn5Var, s41 s41Var) {
        rn5 rn5Var;
        int i;
        jb5 jb5Var;
        Object obj;
        if (s41Var instanceof rn5) {
            rn5Var = (rn5) s41Var;
            int i2 = rn5Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rn5Var.Y = i2 - Integer.MIN_VALUE;
                Object obj2 = rn5Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = rn5Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj2);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj2);
                    pn5 pn5Var = sn5Var.b;
                    rn5Var.Y = 1;
                    obj2 = ((pl) pn5Var).c.b(rn5Var);
                    if (obj2 == x61Var) {
                        return x61Var;
                    }
                }
                jb5Var = (jb5) obj2;
                tp6 tp6Var = sn5Var.c;
                if (!(jb5Var instanceof hb5)) {
                    hv.L(to7.a(sn5Var), null, null, new qn5(sn5Var, null, 2), 3);
                    obj = new nm5(((hb5) jb5Var).a);
                } else if (jb5Var instanceof ib5) {
                    obj = new pm5(((ib5) jb5Var).a);
                } else if (jb5Var == null) {
                    obj = om5.a;
                } else {
                    i.d();
                    return null;
                }
                tp6Var.getClass();
                tp6Var.m(null, obj);
                return jg7.a;
            }
        }
        rn5Var = new rn5(sn5Var, s41Var);
        Object obj22 = rn5Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = rn5Var.Y;
        if (i == 0) {
        }
        jb5Var = (jb5) obj22;
        tp6 tp6Var2 = sn5Var.c;
        if (!(jb5Var instanceof hb5)) {
        }
        tp6Var2.getClass();
        tp6Var2.m(null, obj);
        return jg7.a;
    }
}
