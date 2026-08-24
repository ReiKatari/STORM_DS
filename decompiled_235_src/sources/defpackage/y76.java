package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y76  reason: default package */
/* loaded from: classes.dex */
public abstract class y76 {
    public static final r76 a = new r76(1);
    public static final w76 b = new Object();
    public static final ak1 c = new ak1(1);
    public static final or4 d = new or4(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, ah5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(m86 m86Var, long j, s41 s41Var) {
        x76 x76Var;
        int i;
        m86 m86Var2;
        ah5 ah5Var;
        if (s41Var instanceof x76) {
            x76 x76Var2 = (x76) s41Var;
            int i2 = x76Var2.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x76Var2.Z = i2 - Integer.MIN_VALUE;
                x76Var = x76Var2;
                Object obj = x76Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = x76Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        ah5 ah5Var2 = x76Var.X;
                        m86 m86Var3 = x76Var.R;
                        oi2.Y(obj);
                        ah5Var = ah5Var2;
                        m86Var2 = m86Var3;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ?? obj2 = new Object();
                    xa4 xa4Var = xa4.Default;
                    c0 c0Var = new c0(3, j, (r41) null, m86Var, (Object) obj2);
                    x76Var.R = m86Var;
                    x76Var.X = obj2;
                    x76Var.Z = 1;
                    if (m86Var.f(xa4Var, c0Var, x76Var) == x61Var) {
                        return x61Var;
                    }
                    m86Var2 = m86Var;
                    ah5Var = obj2;
                }
                return new jk4(m86Var2.h(ah5Var.A));
            }
        }
        x76Var = new s41(s41Var);
        Object obj3 = x76Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = x76Var.Z;
        if (i == 0) {
        }
        return new jk4(m86Var2.h(ah5Var.A));
    }

    public static a74 b(h27 h27Var, lo4 lo4Var, boolean z, boolean z2, r94 r94Var) {
        return new v76(h27Var, lo4Var, z, z2, r94Var);
    }
}
