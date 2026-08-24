package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nn6  reason: default package */
/* loaded from: classes.dex */
public final class nn6 implements bp {
    public final e37 a;
    public final long b;
    public final oj2 c;
    public final ij2 d;
    public final jj2 e;
    public final li2 f;
    public final String g;
    public final long h;
    public final x20 i;
    public final f37 j;
    public final gy3 k;
    public final long l;
    public final b17 m;
    public final ge6 n;
    public final cy4 o;
    public final oo1 p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nn6(long j, long j2, oj2 oj2Var, ij2 ij2Var, jj2 jj2Var, li2 li2Var, String str, long j3, x20 x20Var, f37 f37Var, gy3 gy3Var, long j4, b17 b17Var, ge6 ge6Var, int i) {
        this(r4, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, (cy4) null);
        long j5;
        long j6;
        oj2 oj2Var2;
        ij2 ij2Var2;
        jj2 jj2Var2;
        li2 li2Var2;
        String str2;
        long j7;
        x20 x20Var2;
        f37 f37Var2;
        gy3 gy3Var2;
        long j8;
        b17 b17Var2;
        ge6 ge6Var2;
        if ((i & 1) != 0) {
            j5 = kt0.h;
        } else {
            j5 = j;
        }
        if ((i & 2) != 0) {
            j6 = x47.c;
        } else {
            j6 = j2;
        }
        if ((i & 4) != 0) {
            oj2Var2 = null;
        } else {
            oj2Var2 = oj2Var;
        }
        if ((i & 8) != 0) {
            ij2Var2 = null;
        } else {
            ij2Var2 = ij2Var;
        }
        if ((i & 16) != 0) {
            jj2Var2 = null;
        } else {
            jj2Var2 = jj2Var;
        }
        if ((i & 32) != 0) {
            li2Var2 = null;
        } else {
            li2Var2 = li2Var;
        }
        if ((i & 64) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i & 128) != 0) {
            j7 = x47.c;
        } else {
            j7 = j3;
        }
        if ((i & 256) != 0) {
            x20Var2 = null;
        } else {
            x20Var2 = x20Var;
        }
        if ((i & 512) != 0) {
            f37Var2 = null;
        } else {
            f37Var2 = f37Var;
        }
        if ((i & 1024) != 0) {
            gy3Var2 = null;
        } else {
            gy3Var2 = gy3Var;
        }
        if ((i & 2048) != 0) {
            j8 = kt0.h;
        } else {
            j8 = j4;
        }
        if ((i & 4096) != 0) {
            b17Var2 = null;
        } else {
            b17Var2 = b17Var;
        }
        if ((i & 8192) != 0) {
            ge6Var2 = null;
        } else {
            ge6Var2 = ge6Var;
        }
    }

    public final boolean a(nn6 nn6Var) {
        if (this == nn6Var) {
            return true;
        }
        if (x47.a(this.b, nn6Var.b) && nb3.k(this.c, nn6Var.c) && nb3.k(this.d, nn6Var.d) && nb3.k(this.e, nn6Var.e) && nb3.k(this.f, nn6Var.f) && nb3.k(this.g, nn6Var.g) && x47.a(this.h, nn6Var.h) && nb3.k(this.i, nn6Var.i) && nb3.k(this.j, nn6Var.j) && nb3.k(this.k, nn6Var.k) && kt0.d(this.l, nn6Var.l) && nb3.k(this.o, nn6Var.o)) {
            return true;
        }
        return false;
    }

    public final boolean b(nn6 nn6Var) {
        if (!nb3.k(this.a, nn6Var.a) || !nb3.k(this.m, nn6Var.m) || !nb3.k(this.n, nn6Var.n) || !nb3.k(this.p, nn6Var.p)) {
            return false;
        }
        return true;
    }

    public final nn6 c(nn6 nn6Var) {
        if (nn6Var == null) {
            return this;
        }
        e37 e37Var = nn6Var.a;
        return on6.a(this, e37Var.b(), e37Var.c(), e37Var.a(), nn6Var.b, nn6Var.c, nn6Var.d, nn6Var.e, nn6Var.f, nn6Var.g, nn6Var.h, nn6Var.i, nn6Var.j, nn6Var.k, nn6Var.l, nn6Var.m, nn6Var.n, nn6Var.o, nn6Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn6)) {
            return false;
        }
        nn6 nn6Var = (nn6) obj;
        if (a(nn6Var) && b(nn6Var)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        e37 e37Var = this.a;
        long b = e37Var.b();
        int i13 = kt0.i;
        int hashCode = Long.hashCode(b) * 31;
        f80 c = e37Var.c();
        int i14 = 0;
        if (c != null) {
            i = c.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = Float.hashCode(e37Var.a());
        y47[] y47VarArr = x47.b;
        int c2 = i61.c(this.b, (hashCode2 + ((hashCode + i) * 31)) * 31, 31);
        oj2 oj2Var = this.c;
        if (oj2Var != null) {
            i2 = oj2Var.A;
        } else {
            i2 = 0;
        }
        int i15 = (c2 + i2) * 31;
        ij2 ij2Var = this.d;
        if (ij2Var != null) {
            i3 = Integer.hashCode(ij2Var.a);
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        jj2 jj2Var = this.e;
        if (jj2Var != null) {
            i4 = Integer.hashCode(jj2Var.a);
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        li2 li2Var = this.f;
        if (li2Var != null) {
            i5 = li2Var.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 31;
        String str = this.g;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int c3 = i61.c(this.h, (i18 + i6) * 31, 31);
        x20 x20Var = this.i;
        if (x20Var != null) {
            i7 = Float.hashCode(x20Var.a);
        } else {
            i7 = 0;
        }
        int i19 = (c3 + i7) * 31;
        f37 f37Var = this.j;
        if (f37Var != null) {
            i8 = f37Var.hashCode();
        } else {
            i8 = 0;
        }
        int i20 = (i19 + i8) * 31;
        gy3 gy3Var = this.k;
        if (gy3Var != null) {
            i9 = gy3Var.A.hashCode();
        } else {
            i9 = 0;
        }
        int c4 = i61.c(this.l, (i20 + i9) * 31, 31);
        b17 b17Var = this.m;
        if (b17Var != null) {
            i10 = b17Var.a;
        } else {
            i10 = 0;
        }
        int i21 = (c4 + i10) * 31;
        ge6 ge6Var = this.n;
        if (ge6Var != null) {
            i11 = ge6Var.hashCode();
        } else {
            i11 = 0;
        }
        int i22 = (i21 + i11) * 31;
        cy4 cy4Var = this.o;
        if (cy4Var != null) {
            i12 = cy4Var.hashCode();
        } else {
            i12 = 0;
        }
        int i23 = (i22 + i12) * 31;
        oo1 oo1Var = this.p;
        if (oo1Var != null) {
            i14 = oo1Var.hashCode();
        }
        return i23 + i14;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        e37 e37Var = this.a;
        sb.append((Object) kt0.j(e37Var.b()));
        sb.append(", brush=");
        sb.append(e37Var.c());
        sb.append(", alpha=");
        sb.append(e37Var.a());
        sb.append(", fontSize=");
        sb.append((Object) x47.d(this.b));
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.g);
        sb.append(", letterSpacing=");
        sb.append((Object) x47.d(this.h));
        sb.append(", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append((Object) kt0.j(this.l));
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }

    public nn6(e37 e37Var, long j, oj2 oj2Var, ij2 ij2Var, jj2 jj2Var, li2 li2Var, String str, long j2, x20 x20Var, f37 f37Var, gy3 gy3Var, long j3, b17 b17Var, ge6 ge6Var, cy4 cy4Var, oo1 oo1Var) {
        this.a = e37Var;
        this.b = j;
        this.c = oj2Var;
        this.d = ij2Var;
        this.e = jj2Var;
        this.f = li2Var;
        this.g = str;
        this.h = j2;
        this.i = x20Var;
        this.j = f37Var;
        this.k = gy3Var;
        this.l = j3;
        this.m = b17Var;
        this.n = ge6Var;
        this.o = cy4Var;
        this.p = oo1Var;
    }

    public nn6(long j, long j2, oj2 oj2Var, ij2 ij2Var, jj2 jj2Var, li2 li2Var, String str, long j3, x20 x20Var, f37 f37Var, gy3 gy3Var, long j4, b17 b17Var, ge6 ge6Var, cy4 cy4Var) {
        this(j != 16 ? new st0(j) : d37.a, j2, oj2Var, ij2Var, jj2Var, li2Var, str, j3, x20Var, f37Var, gy3Var, j4, b17Var, ge6Var, cy4Var, null);
    }
}
