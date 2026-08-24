package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iv7  reason: default package */
/* loaded from: classes.dex */
public abstract class iv7 {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final x61 a(ne2 ne2Var, Object obj, Object obj2, s41 s41Var) {
        jf2 jf2Var;
        int i;
        if (s41Var instanceof jf2) {
            jf2 jf2Var2 = (jf2) s41Var;
            int i2 = jf2Var2.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jf2Var2.Y = i2 - Integer.MIN_VALUE;
                jf2Var = jf2Var2;
                Object obj3 = jf2Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = jf2Var.Y;
                if (i == 0) {
                    if (i != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = jf2Var.R;
                    oi2.Y(obj3);
                } else {
                    oi2.Y(obj3);
                    jf2Var.R = obj2;
                    jf2Var.Y = 1;
                    if (ne2Var.a(obj, jf2Var) == x61Var) {
                        return x61Var;
                    }
                }
                throw new o(obj2);
            }
        }
        jf2Var = new s41(s41Var);
        Object obj32 = jf2Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = jf2Var.Y;
        if (i == 0) {
        }
        throw new o(obj2);
    }

    public static final void b(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
