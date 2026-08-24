package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ng4  reason: default package */
/* loaded from: classes.dex */
public abstract class ng4 {
    public final m86 a;
    public final eo2 b;
    public qh1 c;
    public boolean d;
    public final yc1 e = new yc1(8);

    public ng4(m86 m86Var, eo2 eo2Var, qh1 qh1Var) {
        this.a = m86Var;
        this.b = eo2Var;
        this.c = qh1Var;
    }

    public static void a(oy4 oy4Var) {
        List list = oy4Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((vy4) list.get(i)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(eo2 eo2Var, s41 s41Var) {
        mg4 mg4Var;
        int i;
        if (s41Var instanceof mg4) {
            mg4Var = (mg4) s41Var;
            int i2 = mg4Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mg4Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = mg4Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = mg4Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.d = true;
                    bf4 bf4Var = new bf4(this, eo2Var, null, 1);
                    mg4Var.Y = 1;
                    o66 o66Var = new o66(mg4Var, mg4Var.b());
                    if (mp2.Z(o66Var, true, o66Var, bf4Var) == x61Var) {
                        return x61Var;
                    }
                }
                this.d = false;
                return jg7.a;
            }
        }
        mg4Var = new mg4(this, s41Var);
        Object obj2 = mg4Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = mg4Var.Y;
        if (i == 0) {
        }
        this.d = false;
        return jg7.a;
    }
}
