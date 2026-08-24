package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h41  reason: default package */
/* loaded from: classes.dex */
public final class h41 implements defpackage.wb6 {
    public final defpackage.yb6 a;
    public final defpackage.ar0 b;
    public final java.lang.String c;

    public h41(defpackage.yb6 r2, defpackage.ar0 r3) {
            r1 = this;
            r3.getClass()
            r1.<init>()
            r1.a = r2
            r1.b = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r2.a
            r0.append(r2)
            r2 = 60
            r0.append(r2)
            java.lang.String r2 = r3.c()
            r0.append(r2)
            r2 = 62
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.c = r2
            return
    }

    @Override // defpackage.wb6
    public final java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.c
            return r0
    }

    @Override // defpackage.wb6
    public final boolean c() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.wb6
    public final int d(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            yb6 r0 = r0.a
            int r0 = r0.d(r1)
            return r0
    }

    @Override // defpackage.wb6
    public final defpackage.np2 e() {
            r0 = this;
            yb6 r0 = r0.a
            np2 r0 = r0.b
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.h41
            if (r0 == 0) goto L7
            h41 r3 = (defpackage.h41) r3
            goto L8
        L7:
            r3 = 0
        L8:
            if (r3 != 0) goto Lb
            goto L21
        Lb:
            yb6 r0 = r2.a
            yb6 r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            ar0 r3 = r3.b
            ar0 r2 = r2.b
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 == 0) goto L21
            r2 = 1
            return r2
        L21:
            r2 = 0
            return r2
    }

    @Override // defpackage.wb6
    public final int f() {
            r0 = this;
            yb6 r0 = r0.a
            int r0 = r0.c
            return r0
    }

    @Override // defpackage.wb6
    public final java.lang.String g(int r1) {
            r0 = this;
            yb6 r0 = r0.a
            java.lang.String[] r0 = r0.f
            r0 = r0[r1]
            return r0
    }

    @Override // defpackage.wb6
    public final java.util.List getAnnotations() {
            r0 = this;
            yb6 r0 = r0.a
            java.util.List r0 = r0.d
            return r0
    }

    @Override // defpackage.wb6
    public final boolean h() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r1 = this;
            ar0 r0 = r1.b
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // defpackage.wb6
    public final java.util.List i(int r1) {
            r0 = this;
            yb6 r0 = r0.a
            java.util.List[] r0 = r0.h
            r0 = r0[r1]
            return r0
    }

    @Override // defpackage.wb6
    public final defpackage.wb6 j(int r1) {
            r0 = this;
            yb6 r0 = r0.a
            wb6[] r0 = r0.g
            r0 = r0[r1]
            return r0
    }

    @Override // defpackage.wb6
    public final boolean k(int r1) {
            r0 = this;
            yb6 r0 = r0.a
            boolean[] r0 = r0.i
            boolean r0 = r0[r1]
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContextDescriptor(kClass: "
            r0.<init>(r1)
            ar0 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", original: "
            r0.append(r1)
            yb6 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
