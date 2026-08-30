package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nn6  reason: default package */
/* loaded from: classes.dex */
public final class nn6 extends dz3 {
    public final to a;
    public final ds6 b;
    public final od2 c;
    public final mi2 d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final List i;
    public final mi2 j;
    public final yq0 k;
    public final mi2 l;

    public nn6(to toVar, ds6 ds6Var, od2 od2Var, mi2 mi2Var, int i, boolean z, int i2, int i3, List list, mi2 mi2Var2, yq0 yq0Var, mi2 mi2Var3) {
        this.a = toVar;
        this.b = ds6Var;
        this.c = od2Var;
        this.d = mi2Var;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.j = mi2Var2;
        this.k = yq0Var;
        this.l = mi2Var3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, qn6] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        yy3Var.l0 = this.c;
        yy3Var.m0 = this.d;
        yy3Var.n0 = this.e;
        yy3Var.o0 = this.f;
        yy3Var.p0 = this.g;
        yy3Var.q0 = this.h;
        yy3Var.r0 = this.i;
        yy3Var.s0 = this.j;
        yy3Var.t0 = this.k;
        yy3Var.u0 = this.l;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nn6) {
                nn6 nn6Var = (nn6) obj;
                if (b53.x(this.k, nn6Var.k) && b53.x(this.a, nn6Var.a) && b53.x(this.b, nn6Var.b) && b53.x(this.i, nn6Var.i) && b53.x(this.c, nn6Var.c) && this.d == nn6Var.d && this.l == nn6Var.l && this.e == nn6Var.e && this.f == nn6Var.f && this.g == nn6Var.g && this.h == nn6Var.h && this.j == nn6Var.j) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r5.a.b(r2.a) != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dz3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.yy3 r17) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn6.g(yy3):void");
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i5 = 0;
        mi2 mi2Var = this.d;
        if (mi2Var != null) {
            i = mi2Var.hashCode();
        } else {
            i = 0;
        }
        int c = (((ej6.c(wh1.a(this.e, (hashCode + i) * 31, 31), this.f, 31) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (c + i2) * 31;
        mi2 mi2Var2 = this.j;
        if (mi2Var2 != null) {
            i3 = mi2Var2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 961;
        yq0 yq0Var = this.k;
        if (yq0Var != null) {
            i4 = yq0Var.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        mi2 mi2Var3 = this.l;
        if (mi2Var3 != null) {
            i5 = mi2Var3.hashCode();
        }
        return i8 + i5;
    }
}
