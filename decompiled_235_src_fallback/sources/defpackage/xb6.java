package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xb6  reason: default package */
/* loaded from: classes.dex */
public final class xb6 implements defpackage.wb6, defpackage.ya0 {
    public final defpackage.wb6 a;
    public final java.lang.String b;
    public final java.util.Set c;

    public xb6(defpackage.wb6 r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            r2.a = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.a()
            r0.append(r1)
            r1 = 63
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.b = r0
            java.util.Set r3 = defpackage.q60.k(r3)
            r2.c = r3
            return
    }

    @Override // defpackage.wb6
    public final java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    @Override // defpackage.ya0
    public final java.util.Set b() {
            r0 = this;
            java.util.Set r0 = r0.c
            return r0
    }

    @Override // defpackage.wb6
    public final boolean c() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.wb6
    public final int d(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            wb6 r0 = r0.a
            int r0 = r0.d(r1)
            return r0
    }

    @Override // defpackage.wb6
    public final defpackage.np2 e() {
            r0 = this;
            wb6 r0 = r0.a
            np2 r0 = r0.e()
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.xb6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xb6 r4 = (defpackage.xb6) r4
            wb6 r4 = r4.a
            wb6 r3 = r3.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // defpackage.wb6
    public final int f() {
            r0 = this;
            wb6 r0 = r0.a
            int r0 = r0.f()
            return r0
    }

    @Override // defpackage.wb6
    public final java.lang.String g(int r1) {
            r0 = this;
            wb6 r0 = r0.a
            java.lang.String r0 = r0.g(r1)
            return r0
    }

    @Override // defpackage.wb6
    public final java.util.List getAnnotations() {
            r0 = this;
            wb6 r0 = r0.a
            java.util.List r0 = r0.getAnnotations()
            return r0
    }

    @Override // defpackage.wb6
    public final boolean h() {
            r0 = this;
            wb6 r0 = r0.a
            boolean r0 = r0.h()
            return r0
    }

    public final int hashCode() {
            r0 = this;
            wb6 r0 = r0.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }

    @Override // defpackage.wb6
    public final java.util.List i(int r1) {
            r0 = this;
            wb6 r0 = r0.a
            java.util.List r0 = r0.i(r1)
            return r0
    }

    @Override // defpackage.wb6
    public final defpackage.wb6 j(int r1) {
            r0 = this;
            wb6 r0 = r0.a
            wb6 r0 = r0.j(r1)
            return r0
    }

    @Override // defpackage.wb6
    public final boolean k(int r1) {
            r0 = this;
            wb6 r0 = r0.a
            boolean r0 = r0.k(r1)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            wb6 r1 = r1.a
            r0.append(r1)
            r1 = 63
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
