package defpackage;

import java.util.Arrays;
import java.util.List;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: td7  reason: default package */
/* loaded from: classes.dex */
public abstract class td7 {
    public static final sd2 a;
    public static final sd2 b;
    public static final ml2 c;

    static {
        pe2 pe2Var = pe2.Y;
        tb5 a2 = a(R.font.space_grotesk, pe2Var);
        pe2 pe2Var2 = pe2.Z;
        tb5 a3 = a(R.font.space_grotesk, pe2Var2);
        pe2 pe2Var3 = pe2.c0;
        tb5 a4 = a(R.font.space_grotesk, pe2Var3);
        pe2 pe2Var4 = pe2.d0;
        List asList = Arrays.asList(a2, a3, a4, a(R.font.space_grotesk, pe2Var4));
        asList.getClass();
        a = new sd2(asList);
        List asList2 = Arrays.asList(a(R.font.manrope, pe2Var), a(R.font.manrope, pe2Var2), a(R.font.manrope, pe2Var3), a(R.font.manrope, pe2Var4), a(R.font.manrope, pe2.e0));
        asList2.getClass();
        b = new sd2(asList2);
        c = pd2.B;
    }

    public static final tb5 a(int i, pe2 pe2Var) {
        int i2 = pe2Var.A;
        if (1 > i2 || i2 >= 1001) {
            nz2.a("'wght' value must be in [1, 1000]. Actual: " + i2);
        }
        return new tb5(i, pe2Var, new oe2(new ne2(i2)));
    }
}
