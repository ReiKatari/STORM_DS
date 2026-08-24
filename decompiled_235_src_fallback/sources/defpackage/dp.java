package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dp  reason: default package */
/* loaded from: classes.dex */
public final class dp implements java.lang.Appendable {
    public final java.lang.StringBuilder A;
    public final java.util.ArrayList B;
    public final java.util.ArrayList L;

    public dp() {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 16
            r0.<init>(r1)
            r2.A = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.B = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.L = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            return
    }

    public dp(defpackage.fp r1) {
            r0 = this;
            r0.<init>()
            r0.a(r1)
            return
    }

    public final void a(defpackage.fp r9) {
            r8 = this;
            java.lang.StringBuilder r0 = r8.A
            int r1 = r0.length()
            java.lang.String r2 = r9.B
            r0.append(r2)
            java.util.List r9 = r9.A
            if (r9 == 0) goto L33
            int r0 = r9.size()
            r2 = 0
        L14:
            if (r2 >= r0) goto L33
            java.lang.Object r3 = r9.get(r2)
            ep r3 = (defpackage.ep) r3
            cp r4 = new cp
            java.lang.Object r5 = r3.a
            int r6 = r3.b
            int r6 = r6 + r1
            int r7 = r3.c
            int r7 = r7 + r1
            java.lang.String r3 = r3.d
            r4.<init>(r5, r6, r7, r3)
            java.util.ArrayList r3 = r8.L
            r3.add(r4)
            int r2 = r2 + 1
            goto L14
        L33:
            return
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(char r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.A
            r0.append(r2)
            return r1
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.fp
            if (r0 == 0) goto La
            fp r2 = (defpackage.fp) r2
            r1.a(r2)
            return r1
        La:
            java.lang.StringBuilder r0 = r1.A
            r0.append(r2)
            return r1
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence r7, int r8, int r9) {
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fp
            java.lang.StringBuilder r1 = r6.A
            if (r0 == 0) goto L3d
            fp r7 = (defpackage.fp) r7
            int r0 = r1.length()
            java.lang.String r2 = r7.B
            r1.append(r2, r8, r9)
            r1 = 0
            java.util.List r7 = defpackage.gp.a(r7, r8, r9, r1)
            if (r7 == 0) goto L3c
            int r8 = r7.size()
            r9 = 0
        L1d:
            if (r9 >= r8) goto L3c
            java.lang.Object r1 = r7.get(r9)
            ep r1 = (defpackage.ep) r1
            cp r2 = new cp
            java.lang.Object r3 = r1.a
            int r4 = r1.b
            int r4 = r4 + r0
            int r5 = r1.c
            int r5 = r5 + r0
            java.lang.String r1 = r1.d
            r2.<init>(r3, r4, r5, r1)
            java.util.ArrayList r1 = r6.L
            r1.add(r2)
            int r9 = r9 + 1
            goto L1d
        L3c:
            return r6
        L3d:
            r1.append(r7, r8, r9)
            return r6
    }

    public final void b(java.lang.String r1) {
            r0 = this;
            java.lang.StringBuilder r0 = r0.A
            r0.append(r1)
            return
    }

    public final void c() {
            r2 = this;
            java.util.ArrayList r0 = r2.B
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            java.lang.String r1 = "Nothing to pop."
            defpackage.q53.c(r1)
        Ld:
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.remove(r1)
            cp r0 = (defpackage.cp) r0
            java.lang.StringBuilder r2 = r2.A
            int r2 = r2.length()
            r0.c = r2
            return
    }

    public final void d(int r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.B
            int r1 = r0.size()
            if (r4 >= r1) goto L9
            goto L24
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = " should be less than "
            r1.append(r2)
            int r2 = r0.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.q53.c(r1)
        L24:
            int r1 = r0.size()
            int r1 = r1 + (-1)
            if (r1 < r4) goto L30
            r3.c()
            goto L24
        L30:
            return
    }

    public final int e(defpackage.ds4 r5) {
            r4 = this;
            cp r0 = new cp
            java.lang.StringBuilder r1 = r4.A
            int r1 = r1.length()
            r2 = 0
            r3 = 12
            r0.<init>(r5, r1, r2, r3)
            java.util.ArrayList r5 = r4.B
            r5.add(r0)
            java.util.ArrayList r4 = r4.L
            r4.add(r0)
            int r4 = r5.size()
            int r4 = r4 + (-1)
            return r4
    }

    public final defpackage.fp f() {
            r7 = this;
            java.lang.StringBuilder r0 = r7.A
            java.lang.String r1 = r0.toString()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList r7 = r7.L
            int r3 = r7.size()
            r2.<init>(r3)
            int r3 = r7.size()
            r4 = 0
        L16:
            if (r4 >= r3) goto L2c
            java.lang.Object r5 = r7.get(r4)
            cp r5 = (defpackage.cp) r5
            int r6 = r0.length()
            ep r5 = r5.a(r6)
            r2.add(r5)
            int r4 = r4 + 1
            goto L16
        L2c:
            fp r7 = new fp
            r7.<init>(r1, r2)
            return r7
    }
}
