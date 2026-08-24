package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fp  reason: default package */
/* loaded from: classes.dex */
public final class fp implements java.lang.CharSequence {
    public final java.util.List A;
    public final java.lang.String B;
    public final java.util.ArrayList L;
    public final java.util.ArrayList R;

    static {
            ap3 r0 = defpackage.p56.a
            return
    }

    public /* synthetic */ fp(java.lang.String r2) {
            r1 = this;
            yt1 r0 = defpackage.yt1.A
            r1.<init>(r2, r0)
            return
    }

    public fp(java.lang.String r2, java.util.List r3) {
            r1 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            r3 = 0
        L7:
            r1.<init>(r3, r2)
            return
    }

    public fp(java.util.List r8, java.lang.String r9) {
            r7 = this;
            r7.<init>()
            r7.A = r8
            r7.B = r9
            r9 = 0
            if (r8 == 0) goto L3b
            int r0 = r8.size()
            r1 = 0
            r2 = r9
            r3 = r2
        L11:
            if (r1 >= r0) goto L3d
            java.lang.Object r4 = r8.get(r1)
            ep r4 = (defpackage.ep) r4
            java.lang.Object r5 = r4.a
            boolean r6 = r5 instanceof defpackage.nn6
            if (r6 == 0) goto L2a
            if (r2 != 0) goto L26
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L26:
            r2.add(r4)
            goto L38
        L2a:
            boolean r5 = r5 instanceof defpackage.ds4
            if (r5 == 0) goto L38
            if (r3 != 0) goto L35
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L35:
            r3.add(r4)
        L38:
            int r1 = r1 + 1
            goto L11
        L3b:
            r2 = r9
            r3 = r2
        L3d:
            r7.L = r2
            r7.R = r3
            if (r3 == 0) goto L4d
            zh2 r7 = new zh2
            r8 = 7
            r7.<init>(r8)
            java.util.List r9 = defpackage.gt0.d1(r3, r7)
        L4d:
            if (r9 == 0) goto Laf
            boolean r7 = r9.isEmpty()
            if (r7 == 0) goto L56
            goto Laf
        L56:
            java.lang.Object r7 = defpackage.gt0.H0(r9)
            ep r7 = (defpackage.ep) r7
            int r7 = r7.c
            o94 r8 = defpackage.f93.a
            o94 r8 = new o94
            r0 = 1
            r8.<init>(r0)
            r8.a(r7)
            int r7 = r9.size()
            r1 = r0
        L6e:
            if (r1 >= r7) goto Laf
            java.lang.Object r2 = r9.get(r1)
            ep r2 = (defpackage.ep) r2
        L76:
            int r3 = r8.b
            if (r3 == 0) goto La7
            int r3 = r8.d()
            int r4 = r2.b
            int r5 = r2.c
            if (r4 < r3) goto L8b
            int r3 = r8.b
            int r3 = r3 - r0
            r8.e(r3)
            goto L76
        L8b:
            if (r5 > r3) goto L8e
            goto La7
        L8e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Paragraph overlap not allowed, end "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r5 = " should be less than or equal to "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            defpackage.q53.a(r3)
        La7:
            int r2 = r2.c
            r8.a(r2)
            int r1 = r1 + 1
            goto L6e
        Laf:
            return
    }

    public final java.util.List a(int r8) {
            r7 = this;
            java.util.List r7 = r7.A
            if (r7 == 0) goto L33
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.size()
            r0.<init>(r1)
            int r1 = r7.size()
            r2 = 0
            r3 = r2
        L13:
            if (r3 >= r1) goto L32
            java.lang.Object r4 = r7.get(r3)
            r5 = r4
            ep r5 = (defpackage.ep) r5
            java.lang.Object r6 = r5.a
            boolean r6 = r6 instanceof defpackage.pv3
            if (r6 == 0) goto L2f
            int r6 = r5.b
            int r5 = r5.c
            boolean r5 = defpackage.gp.b(r2, r8, r6, r5)
            if (r5 == 0) goto L2f
            r0.add(r4)
        L2f:
            int r3 = r3 + 1
            goto L13
        L32:
            return r0
        L33:
            yt1 r7 = defpackage.yt1.A
            return r7
    }

    public final defpackage.fp b(defpackage.qn2 r9) {
            r8 = this;
            dp r0 = new dp
            r0.<init>(r8)
            java.util.ArrayList r8 = r0.L
            int r1 = r8.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L33
            java.lang.Object r3 = r8.get(r2)
            cp r3 = (defpackage.cp) r3
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            ep r3 = r3.a(r4)
            java.lang.Object r3 = r9.g(r3)
            ep r3 = (defpackage.ep) r3
            cp r4 = new cp
            java.lang.Object r5 = r3.a
            int r6 = r3.b
            int r7 = r3.c
            java.lang.String r3 = r3.d
            r4.<init>(r5, r6, r7, r3)
            r8.set(r2, r4)
            int r2 = r2 + 1
            goto Lc
        L33:
            fp r8 = r0.f()
            return r8
    }

    public final defpackage.fp c(int r10, int r11) {
            r9 = this;
            r0 = 0
            if (r10 > r11) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.q53.a(r1)
        L26:
            java.lang.String r1 = r9.B
            if (r10 != 0) goto L31
            int r4 = r1.length()
            if (r11 != r4) goto L31
            return r9
        L31:
            java.lang.String r1 = r1.substring(r10, r11)
            fp r4 = defpackage.gp.a
            if (r10 > r11) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r10)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r11)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            defpackage.q53.a(r2)
        L54:
            java.util.List r9 = r9.A
            if (r9 != 0) goto L59
            goto L99
        L59:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r9.size()
            r2.<init>(r3)
            int r3 = r9.size()
        L66:
            if (r0 >= r3) goto L93
            java.lang.Object r4 = r9.get(r0)
            ep r4 = (defpackage.ep) r4
            int r5 = r4.b
            int r6 = r4.c
            boolean r5 = defpackage.gp.b(r10, r11, r5, r6)
            if (r5 == 0) goto L90
            ep r5 = new ep
            java.lang.Object r7 = r4.a
            int r8 = r4.b
            int r8 = java.lang.Math.max(r10, r8)
            int r8 = r8 - r10
            int r6 = java.lang.Math.min(r11, r6)
            int r6 = r6 - r10
            java.lang.String r4 = r4.d
            r5.<init>(r7, r8, r6, r4)
            r2.add(r5)
        L90:
            int r0 = r0 + 1
            goto L66
        L93:
            boolean r9 = r2.isEmpty()
            if (r9 == 0) goto L9a
        L99:
            r2 = 0
        L9a:
            fp r9 = new fp
            r9.<init>(r2, r1)
            return r9
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r1) {
            r0 = this;
            java.lang.String r0 = r0.B
            char r0 = r0.charAt(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.fp
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fp r5 = (defpackage.fp) r5
            java.lang.String r1 = r5.B
            java.lang.String r3 = r4.B
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List r4 = r4.A
            java.util.List r5 = r5.A
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.B
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List r1 = r1.A
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            return r0
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r0 = this;
            java.lang.String r0 = r0.B
            int r0 = r0.length()
            return r0
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ /* synthetic */ java.lang.CharSequence subSequence(int r1, int r2) {
            r0 = this;
            fp r0 = r0.c(r1, r2)
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.B
            return r0
    }
}
