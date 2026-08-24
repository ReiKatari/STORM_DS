package defpackage;

import com.google.mlkit.common.MlKitException;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oj2  reason: default package */
/* loaded from: classes.dex */
public final class oj2 implements Comparable {
    public static final oj2 B;
    public static final oj2 L;
    public static final oj2 R;
    public static final oj2 X;
    public static final oj2 Y;
    public static final oj2 Z;
    public static final oj2 d0;
    public static final oj2 e0;
    public static final oj2 f0;
    public static final oj2 g0;
    public static final List h0;
    public final int A;

    static {
        oj2 oj2Var = new oj2(100);
        oj2 oj2Var2 = new oj2(MlKitException.CODE_SCANNER_UNAVAILABLE);
        oj2 oj2Var3 = new oj2(MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        oj2 oj2Var4 = new oj2(400);
        B = oj2Var4;
        oj2 oj2Var5 = new oj2(500);
        L = oj2Var5;
        oj2 oj2Var6 = new oj2(600);
        R = oj2Var6;
        oj2 oj2Var7 = new oj2(700);
        oj2 oj2Var8 = new oj2(800);
        oj2 oj2Var9 = new oj2(900);
        X = oj2Var3;
        Y = oj2Var4;
        Z = oj2Var5;
        d0 = oj2Var6;
        e0 = oj2Var7;
        f0 = oj2Var8;
        g0 = oj2Var9;
        h0 = hf.c0(oj2Var, oj2Var2, oj2Var3, oj2Var4, oj2Var5, oj2Var6, oj2Var7, oj2Var8, oj2Var9);
    }

    public oj2(int i) {
        this.A = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (!z) {
            q53.a("Font weight can be in range [1, 1000]. Current value: " + i);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(oj2 oj2Var) {
        return nb3.p(this.A, oj2Var.A);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj2)) {
            return false;
        }
        if (this.A == ((oj2) obj).A) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A;
    }

    public final String toString() {
        return xg6.q(new StringBuilder("FontWeight(weight="), this.A, ')');
    }
}
