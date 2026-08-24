package defpackage;

import com.stormds.emulator.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qs7  reason: default package */
/* loaded from: classes.dex */
public abstract class qs7 {
    public static final pi2 a;
    public static final pi2 b;
    public static final sr2 c;

    static {
        oj2 oj2Var = oj2.Y;
        ll5 c2 = c(R.font.space_grotesk, oj2Var);
        oj2 oj2Var2 = oj2.Z;
        ll5 c3 = c(R.font.space_grotesk, oj2Var2);
        oj2 oj2Var3 = oj2.d0;
        ll5 c4 = c(R.font.space_grotesk, oj2Var3);
        oj2 oj2Var4 = oj2.e0;
        List asList = Arrays.asList(c2, c3, c4, c(R.font.space_grotesk, oj2Var4));
        asList.getClass();
        a = new pi2(asList);
        List asList2 = Arrays.asList(c(R.font.manrope, oj2Var), c(R.font.manrope, oj2Var2), c(R.font.manrope, oj2Var3), c(R.font.manrope, oj2Var4), c(R.font.manrope, oj2.f0));
        asList2.getClass();
        b = new pi2(asList2);
        c = li2.L;
    }

    public static final pi2 a() {
        return a;
    }

    public static final sr2 b() {
        return c;
    }

    public static final ll5 c(int i, oj2 oj2Var) {
        int i2 = oj2Var.A;
        if (1 > i2 || i2 >= 1001) {
            q53.a("'wght' value must be in [1, 1000]. Actual: " + i2);
        }
        return new ll5(i, oj2Var, new mj2(new lj2(i2)));
    }
}
