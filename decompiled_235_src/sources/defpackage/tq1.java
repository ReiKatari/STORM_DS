package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tq1  reason: default package */
/* loaded from: classes.dex */
public final class tq1 implements gg3 {
    public static final tq1 a = new Object();
    public static final x25 b = new x25("kotlin.time.Duration", v25.m);

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        jd1 jd1Var = oq1.B;
        String I = sc1Var.I();
        I.getClass();
        try {
            long H = n16.H(I);
            if (!oq1.d(H, oq1.X)) {
                return new oq1(H);
            }
            throw new IllegalStateException("invariant failed");
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(lb1.A("Invalid ISO duration string format: '", I, "'."), e);
        }
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        long j;
        boolean z;
        boolean z2;
        long j2 = ((oq1) obj).A;
        jd1 jd1Var = oq1.B;
        StringBuilder sb = new StringBuilder();
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i < 0) {
            sb.append('-');
        }
        sb.append("PT");
        if (i < 0) {
            j = oq1.m(j2);
        } else {
            j = j2;
        }
        long k = oq1.k(j, uq1.HOURS);
        int f = oq1.f(j);
        int h = oq1.h(j);
        int g = oq1.g(j);
        if (oq1.i(j2)) {
            k = 9999999999999L;
        }
        boolean z3 = false;
        if (k != 0) {
            z = true;
        } else {
            z = false;
        }
        if (h == 0 && g == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (f != 0 || (z2 && z)) {
            z3 = true;
        }
        if (z) {
            sb.append(k);
            sb.append('H');
        }
        if (z3) {
            sb.append(f);
            sb.append('M');
        }
        if (z2 || (!z && !z3)) {
            oq1.b(sb, h, g, 9, "S", true);
        }
        x32Var.d0(sb.toString());
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return b;
    }
}
