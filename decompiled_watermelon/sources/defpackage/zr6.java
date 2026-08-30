package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zr6  reason: default package */
/* loaded from: classes.dex */
public final class zr6 extends dz3 {
    public final String a;
    public final ds6 b;
    public final od2 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final yq0 h;

    public zr6(String str, ds6 ds6Var, od2 od2Var, int i, boolean z, int i2, int i3, yq0 yq0Var) {
        this.a = str;
        this.b = ds6Var;
        this.c = od2Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = yq0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, cs6] */
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
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr6)) {
            return false;
        }
        zr6 zr6Var = (zr6) obj;
        if (b53.x(this.h, zr6Var.h) && b53.x(this.a, zr6Var.a) && b53.x(this.b, zr6Var.b) && b53.x(this.c, zr6Var.c) && this.d == zr6Var.d && this.e == zr6Var.e && this.f == zr6Var.f && this.g == zr6Var.g) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r5.a.b(r2.a) != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dz3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.yy3 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            cs6 r1 = (defpackage.cs6) r1
            yq0 r2 = r1.q0
            yq0 r3 = r0.h
            boolean r2 = defpackage.b53.x(r3, r2)
            r1.q0 = r3
            r3 = 0
            r4 = 1
            ds6 r5 = r0.b
            if (r2 == 0) goto L2a
            ds6 r2 = r1.k0
            if (r5 == r2) goto L25
            xb6 r6 = r5.a
            xb6 r2 = r2.a
            boolean r2 = r6.b(r2)
            if (r2 == 0) goto L2a
            goto L28
        L25:
            r5.getClass()
        L28:
            r2 = r3
            goto L2b
        L2a:
            r2 = r4
        L2b:
            java.lang.String r6 = r1.j0
            java.lang.String r7 = r0.a
            boolean r6 = defpackage.b53.x(r6, r7)
            r8 = 0
            if (r6 == 0) goto L37
            goto L3c
        L37:
            r1.j0 = r7
            r1.v0 = r8
            r3 = r4
        L3c:
            ds6 r6 = r1.k0
            boolean r6 = r6.c(r5)
            r6 = r6 ^ r4
            r1.k0 = r5
            int r5 = r1.p0
            int r7 = r0.g
            if (r5 == r7) goto L4e
            r1.p0 = r7
            r6 = r4
        L4e:
            int r5 = r1.o0
            int r7 = r0.f
            if (r5 == r7) goto L57
            r1.o0 = r7
            r6 = r4
        L57:
            boolean r5 = r1.n0
            boolean r7 = r0.e
            if (r5 == r7) goto L60
            r1.n0 = r7
            r6 = r4
        L60:
            od2 r5 = r1.l0
            od2 r7 = r0.c
            boolean r5 = defpackage.b53.x(r5, r7)
            if (r5 != 0) goto L6d
            r1.l0 = r7
            r6 = r4
        L6d:
            int r5 = r1.m0
            int r0 = r0.d
            if (r5 != r0) goto L75
            r4 = r6
            goto L77
        L75:
            r1.m0 = r0
        L77:
            if (r2 != 0) goto L7d
            if (r3 != 0) goto L7d
            if (r4 == 0) goto L7f
        L7d:
            r1.t0 = r8
        L7f:
            if (r3 != 0) goto L83
            if (r4 == 0) goto L9a
        L83:
            zi4 r9 = r1.R0()
            java.lang.String r10 = r1.j0
            ds6 r11 = r1.k0
            od2 r12 = r1.l0
            int r13 = r1.m0
            boolean r14 = r1.n0
            int r15 = r1.o0
            int r0 = r1.p0
            r16 = r0
            r9.f(r10, r11, r12, r13, r14, r15, r16)
        L9a:
            boolean r0 = r1.i0
            if (r0 != 0) goto L9f
            goto Lb9
        L9f:
            if (r3 != 0) goto La7
            if (r2 == 0) goto Laa
            as6 r0 = r1.u0
            if (r0 == 0) goto Laa
        La7:
            defpackage.nl2.M(r1)
        Laa:
            if (r3 != 0) goto Lae
            if (r4 == 0) goto Lb4
        Lae:
            defpackage.hi2.D(r1)
            defpackage.n40.M(r1)
        Lb4:
            if (r2 == 0) goto Lb9
            defpackage.n40.M(r1)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr6.g(yy3):void");
    }

    public final int hashCode() {
        int i;
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int c = (((ej6.c(wh1.a(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31), this.e, 31) + this.f) * 31) + this.g) * 31;
        yq0 yq0Var = this.h;
        if (yq0Var != null) {
            i = yq0Var.hashCode();
        } else {
            i = 0;
        }
        return c + i;
    }
}
