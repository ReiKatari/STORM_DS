package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nm1  reason: default package */
/* loaded from: classes.dex */
public final class nm1 implements m93 {
    public static final nm1 a = new Object();
    public static final vt4 b = new vt4("kotlin.time.Duration", tt4.p);

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        hm1 hm1Var = im1.B;
        String X = b91Var.X();
        X.getClass();
        try {
            long c0 = b53.c0(X);
            if (!im1.d(c0, im1.X)) {
                return new im1(c0);
            }
            throw new IllegalStateException("invariant failed");
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(wh1.A("Invalid ISO duration string format: '", X, "'."), e);
        }
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        long j;
        boolean z;
        boolean z2;
        long j2 = ((im1) obj).A;
        hm1 hm1Var = im1.B;
        StringBuilder sb = new StringBuilder();
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i < 0) {
            sb.append('-');
        }
        sb.append("PT");
        if (i < 0) {
            j = im1.m(j2);
        } else {
            j = j2;
        }
        long k = im1.k(j, om1.HOURS);
        int f = im1.f(j);
        int h = im1.h(j);
        int g = im1.g(j);
        if (im1.i(j2)) {
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
            im1.b(sb, h, g, 9, "S", true);
        }
        mz1Var.b0(sb.toString());
    }

    @Override // defpackage.m93
    public final h06 e() {
        return b;
    }
}
