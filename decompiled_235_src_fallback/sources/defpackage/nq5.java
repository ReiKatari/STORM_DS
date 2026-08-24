package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nq5  reason: default package */
/* loaded from: classes.dex */
public final class nq5 {
    public static final int f = 8;
    private final java.lang.String a;
    private final android.net.Uri b;
    private final android.net.Uri c;
    private defpackage.it5 d;
    private java.util.Date e;

    public nq5(java.lang.String r1, android.net.Uri r2, android.net.Uri r3, defpackage.it5 r4, java.util.Date r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public /* synthetic */ nq5(java.lang.String r7, android.net.Uri r8, android.net.Uri r9, defpackage.it5 r10, java.util.Date r11, int r12, defpackage.id1 r13) {
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L5
            r11 = 0
        L5:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ defpackage.nq5 g(defpackage.nq5 r0, java.lang.String r1, android.net.Uri r2, android.net.Uri r3, defpackage.it5 r4, java.util.Date r5, int r6, java.lang.Object r7) {
            r7 = r6 & 1
            if (r7 == 0) goto L6
            java.lang.String r1 = r0.a
        L6:
            r7 = r6 & 2
            if (r7 == 0) goto Lc
            android.net.Uri r2 = r0.b
        Lc:
            r7 = r6 & 4
            if (r7 == 0) goto L12
            android.net.Uri r3 = r0.c
        L12:
            r7 = r6 & 8
            if (r7 == 0) goto L18
            it5 r4 = r0.d
        L18:
            r6 = r6 & 16
            if (r6 == 0) goto L1e
            java.util.Date r5 = r0.e
        L1e:
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r2 = r0
            r3 = r1
            nq5 r0 = r2.f(r3, r4, r5, r6, r7)
            return r0
    }

    public final java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
    }

    public final android.net.Uri b() {
            r0 = this;
            android.net.Uri r0 = r0.b
            return r0
    }

    public final android.net.Uri c() {
            r0 = this;
            android.net.Uri r0 = r0.c
            return r0
    }

    public final defpackage.it5 d() {
            r0 = this;
            it5 r0 = r0.d
            return r0
    }

    public final java.util.Date e() {
            r0 = this;
            java.util.Date r0 = r0.e
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.nq5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nq5 r5 = (defpackage.nq5) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            android.net.Uri r1 = r4.b
            android.net.Uri r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            android.net.Uri r1 = r4.c
            android.net.Uri r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            it5 r1 = r4.d
            it5 r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.util.Date r4 = r4.e
            java.util.Date r5 = r5.e
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final defpackage.nq5 f(java.lang.String r1, android.net.Uri r2, android.net.Uri r3, defpackage.it5 r4, java.util.Date r5) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            nq5 r0 = new nq5
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final defpackage.it5 h() {
            r0 = this;
            it5 r0 = r0.d
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.net.Uri r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.net.Uri r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            it5 r1 = r2.d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.Date r2 = r2.e
            if (r2 != 0) goto L29
            r2 = 0
            goto L2d
        L29:
            int r2 = r2.hashCode()
        L2d:
            int r1 = r1 + r2
            return r1
    }

    public final java.util.Date i() {
            r0 = this;
            java.util.Date r0 = r0.e
            return r0
    }

    public final java.lang.String j() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
    }

    public final android.net.Uri k() {
            r0 = this;
            android.net.Uri r0 = r0.c
            return r0
    }

    public final android.net.Uri l() {
            r0 = this;
            android.net.Uri r0 = r0.b
            return r0
    }

    public final void m(defpackage.it5 r1) {
            r0 = this;
            r1.getClass()
            r0.d = r1
            return
    }

    public final void n(java.util.Date r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = r6.a
            android.net.Uri r1 = r6.b
            android.net.Uri r2 = r6.c
            it5 r3 = r6.d
            java.util.Date r6 = r6.e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Rom21(name="
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = ", uri="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ", parentTreeUri="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", config="
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = ", lastPlayed="
            r4.append(r0)
            r4.append(r6)
            java.lang.String r6 = ")"
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            return r6
    }
}
