package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s47  reason: default package */
/* loaded from: classes.dex */
public final class s47 {
    public static final s47 d = new s47(0, 0, null, 0, 0, 0, 0, 16777215);
    public final nn6 a;
    public final ds4 b;
    public final hy4 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s47(long j, long j2, oj2 oj2Var, long j3, long j4, int i, long j5, int i2) {
        this(new nn6(r4, r6, r8, (ij2) null, (jj2) null, (li2) null, (String) null, r13, (x20) null, (f37) null, (gy3) null, r18, (b17) null, (ge6) null, (cy4) null), new ds4(r1, 0, r23, null, null, null, 0, 0, null), null);
        long j6;
        long j7;
        oj2 oj2Var2;
        long j8;
        long j9;
        int i3;
        long j10;
        if ((i2 & 1) != 0) {
            j6 = kt0.h;
        } else {
            j6 = j;
        }
        if ((i2 & 2) != 0) {
            j7 = x47.c;
        } else {
            j7 = j2;
        }
        if ((i2 & 4) != 0) {
            oj2Var2 = null;
        } else {
            oj2Var2 = oj2Var;
        }
        if ((i2 & 128) != 0) {
            j8 = x47.c;
        } else {
            j8 = j3;
        }
        if ((i2 & 2048) != 0) {
            j9 = kt0.h;
        } else {
            j9 = j4;
        }
        if ((32768 & i2) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 131072) != 0) {
            j10 = x47.c;
        } else {
            j10 = j5;
        }
    }

    public static s47 a(s47 s47Var, long j, long j2, oj2 oj2Var, li2 li2Var, long j3, long j4, xu3 xu3Var, int i) {
        long j5;
        long j6;
        oj2 oj2Var2;
        li2 li2Var2;
        long j7;
        int i2;
        x20 x20Var;
        f37 f37Var;
        long j8;
        hy4 hy4Var;
        xu3 xu3Var2;
        e37 e37Var;
        cy4 cy4Var;
        hy4 hy4Var2 = nw7.X;
        if ((i & 1) != 0) {
            j5 = s47Var.a.a.b();
        } else {
            j5 = j;
        }
        if ((i & 2) != 0) {
            j6 = s47Var.a.b;
        } else {
            j6 = j2;
        }
        if ((i & 4) != 0) {
            oj2Var2 = s47Var.a.c;
        } else {
            oj2Var2 = oj2Var;
        }
        nn6 nn6Var = s47Var.a;
        ij2 ij2Var = nn6Var.d;
        jj2 jj2Var = nn6Var.e;
        if ((i & 32) != 0) {
            li2Var2 = nn6Var.f;
        } else {
            li2Var2 = li2Var;
        }
        String str = nn6Var.g;
        if ((i & 128) != 0) {
            j7 = nn6Var.h;
        } else {
            j7 = j3;
        }
        x20 x20Var2 = nn6Var.i;
        f37 f37Var2 = nn6Var.j;
        gy3 gy3Var = nn6Var.k;
        long j9 = nn6Var.l;
        b17 b17Var = nn6Var.m;
        ge6 ge6Var = nn6Var.n;
        oo1 oo1Var = nn6Var.p;
        if ((i & 32768) != 0) {
            i2 = s47Var.b.a;
        } else {
            i2 = 3;
        }
        int i3 = i2;
        ds4 ds4Var = s47Var.b;
        int i4 = ds4Var.b;
        if ((i & 131072) != 0) {
            x20Var = x20Var2;
            f37Var = f37Var2;
            j8 = ds4Var.c;
        } else {
            x20Var = x20Var2;
            f37Var = f37Var2;
            j8 = j4;
        }
        g37 g37Var = ds4Var.d;
        if ((i & 524288) != 0) {
            hy4Var = s47Var.c;
        } else {
            hy4Var = hy4Var2;
        }
        if ((i & 1048576) != 0) {
            xu3Var2 = ds4Var.f;
        } else {
            xu3Var2 = xu3Var;
        }
        int i5 = ds4Var.g;
        int i6 = ds4Var.h;
        i47 i47Var = ds4Var.i;
        if (kt0.d(j5, nn6Var.a.b())) {
            e37Var = nn6Var.a;
        } else if (j5 != 16) {
            e37Var = new st0(j5);
        } else {
            e37Var = d37.a;
        }
        ux4 ux4Var = null;
        if (hy4Var != null) {
            cy4Var = hy4Var.a;
        } else {
            cy4Var = null;
        }
        nn6 nn6Var2 = new nn6(e37Var, j6, oj2Var2, ij2Var, jj2Var, li2Var2, str, j7, x20Var, f37Var, gy3Var, j9, b17Var, ge6Var, cy4Var, oo1Var);
        if (hy4Var != null) {
            ux4Var = hy4Var.b;
        }
        return new s47(nn6Var2, new ds4(i3, i4, j8, g37Var, ux4Var, xu3Var2, i5, i6, i47Var), hy4Var);
    }

    public static s47 e(s47 s47Var, long j, long j2, oj2 oj2Var, li2 li2Var, long j3, int i, long j4, int i2) {
        long j5;
        long j6;
        oj2 oj2Var2;
        li2 li2Var2;
        long j7;
        int i3;
        long j8;
        if ((i2 & 1) != 0) {
            j5 = kt0.h;
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = x47.c;
        } else {
            j6 = j2;
        }
        if ((i2 & 4) != 0) {
            oj2Var2 = null;
        } else {
            oj2Var2 = oj2Var;
        }
        if ((i2 & 32) != 0) {
            li2Var2 = null;
        } else {
            li2Var2 = li2Var;
        }
        if ((i2 & 128) != 0) {
            j7 = x47.c;
        } else {
            j7 = j3;
        }
        long j9 = kt0.h;
        if ((32768 & i2) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 131072) != 0) {
            j8 = x47.c;
        } else {
            j8 = j4;
        }
        nn6 a = on6.a(s47Var.a, j5, null, Float.NaN, j6, oj2Var2, null, null, li2Var2, null, j7, null, null, null, j9, null, null, null, null);
        ds4 a2 = es4.a(s47Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        if (s47Var.a == a && s47Var.b == a2) {
            return s47Var;
        }
        return new s47(a, a2);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final boolean c(s47 s47Var) {
        if (this != s47Var) {
            if (!nb3.k(this.b, s47Var.b) || !this.a.a(s47Var.a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final s47 d(s47 s47Var) {
        if (s47Var != null && !s47Var.equals(d)) {
            return new s47(this.a.c(s47Var.a), this.b.a(s47Var.b));
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s47)) {
            return false;
        }
        s47 s47Var = (s47) obj;
        if (nb3.k(this.a, s47Var.a) && nb3.k(this.b, s47Var.b) && nb3.k(this.c, s47Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        hy4 hy4Var = this.c;
        if (hy4Var != null) {
            i = hy4Var.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) kt0.j(b()));
        sb.append(", brush=");
        nn6 nn6Var = this.a;
        sb.append(nn6Var.a.c());
        sb.append(", alpha=");
        sb.append(nn6Var.a.a());
        sb.append(", fontSize=");
        sb.append((Object) x47.d(nn6Var.b));
        sb.append(", fontWeight=");
        sb.append(nn6Var.c);
        sb.append(", fontStyle=");
        sb.append(nn6Var.d);
        sb.append(", fontSynthesis=");
        sb.append(nn6Var.e);
        sb.append(", fontFamily=");
        sb.append(nn6Var.f);
        sb.append(", fontFeatureSettings=");
        sb.append(nn6Var.g);
        sb.append(", letterSpacing=");
        sb.append((Object) x47.d(nn6Var.h));
        sb.append(", baselineShift=");
        sb.append(nn6Var.i);
        sb.append(", textGeometricTransform=");
        sb.append(nn6Var.j);
        sb.append(", localeList=");
        sb.append(nn6Var.k);
        sb.append(", background=");
        sb.append((Object) kt0.j(nn6Var.l));
        sb.append(", textDecoration=");
        sb.append(nn6Var.m);
        sb.append(", shadow=");
        sb.append(nn6Var.n);
        sb.append(", drawStyle=");
        sb.append(nn6Var.p);
        sb.append(", textAlign=");
        ds4 ds4Var = this.b;
        sb.append((Object) wz6.a(ds4Var.a));
        sb.append(", textDirection=");
        sb.append((Object) e17.a(ds4Var.b));
        sb.append(", lineHeight=");
        sb.append((Object) x47.d(ds4Var.c));
        sb.append(", textIndent=");
        sb.append(ds4Var.d);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(ds4Var.f);
        sb.append(", lineBreak=");
        sb.append((Object) su3.a(ds4Var.g));
        sb.append(", hyphens=");
        sb.append((Object) q03.a(ds4Var.h));
        sb.append(", textMotion=");
        sb.append(ds4Var.i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s47(nn6 nn6Var, ds4 ds4Var) {
        this(nn6Var, ds4Var, (r0 == null && r1 == null) ? null : new hy4(r0, r1));
        cy4 cy4Var = nn6Var.o;
        ux4 ux4Var = ds4Var.e;
    }

    public s47(nn6 nn6Var, ds4 ds4Var, hy4 hy4Var) {
        this.a = nn6Var;
        this.b = ds4Var;
        this.c = hy4Var;
    }
}
