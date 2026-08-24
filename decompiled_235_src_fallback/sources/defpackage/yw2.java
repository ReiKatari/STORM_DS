package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yw2  reason: default package */
/* loaded from: classes.dex */
public final class yw2 implements java.lang.Iterable, defpackage.zf3 {
    public static final defpackage.yw2 B = null;
    public final java.lang.String[] A;

    static {
            yw2 r0 = new yw2
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.<init>(r1)
            defpackage.yw2.B = r0
            return
    }

    public yw2(java.lang.String[] r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    public final java.lang.String a(java.lang.String r4) {
            r3 = this;
            java.lang.String[] r3 = r3.A
            r3.getClass()
            int r0 = r3.length
            int r0 = r0 + (-2)
            r1 = 0
            r2 = -2
            int r1 = defpackage.nj2.s(r0, r1, r2)
            if (r1 > r0) goto L22
        L10:
            r2 = r3[r0]
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L1d
            int r0 = r0 + 1
            r3 = r3[r0]
            return r3
        L1d:
            if (r0 == r1) goto L22
            int r0 = r0 + (-2)
            goto L10
        L22:
            r3 = 0
            return r3
    }

    public final java.lang.String b(int r2) {
            r1 = this;
            int r0 = r2 * 2
            java.lang.String[] r1 = r1.A
            java.lang.Object r1 = defpackage.fv.J0(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Ld
            return r1
        Ld:
            java.lang.String r1 = "name["
            r0 = 93
            java.lang.String r1 = defpackage.xg6.o(r1, r2, r0)
            defpackage.e41.q(r1)
            r1 = 0
            return r1
    }

    public final defpackage.ww2 c() {
            r2 = this;
            ww2 r0 = new ww2
            r1 = 0
            r0.<init>(r1, r1)
            java.util.ArrayList r1 = r0.b
            r1.getClass()
            java.lang.String[] r2 = r2.A
            r2.getClass()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r2.getClass()
            r1.addAll(r2)
            return r0
    }

    public final java.lang.String d(int r2) {
            r1 = this;
            int r0 = r2 * 2
            int r0 = r0 + 1
            java.lang.String[] r1 = r1.A
            java.lang.Object r1 = defpackage.fv.J0(r0, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lf
            return r1
        Lf:
            java.lang.String r1 = "value["
            r0 = 93
            java.lang.String r1 = defpackage.xg6.o(r1, r2, r0)
            defpackage.e41.q(r1)
            r1 = 0
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.yw2
            if (r0 == 0) goto L12
            yw2 r2 = (defpackage.yw2) r2
            java.lang.String[] r2 = r2.A
            java.lang.String[] r1 = r1.A
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final java.util.List f(java.lang.String r6) {
            r5 = this;
            r6.getClass()
            int r0 = r5.size()
            r1 = 0
            r2 = 0
            r3 = r1
        La:
            if (r2 >= r0) goto L28
            java.lang.String r4 = r5.b(r2)
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L25
            if (r3 != 0) goto L1e
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
        L1e:
            java.lang.String r4 = r5.d(r2)
            r3.add(r4)
        L25:
            int r2 = r2 + 1
            goto La
        L28:
            if (r3 == 0) goto L31
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            r1.getClass()
        L31:
            if (r1 != 0) goto L36
            yt1 r5 = defpackage.yt1.A
            return r5
        L36:
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String[] r0 = r0.A
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r6 = this;
            int r0 = r6.size()
            vr4[] r1 = new defpackage.vr4[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L1b
            java.lang.String r3 = r6.b(r2)
            java.lang.String r4 = r6.d(r2)
            vr4 r5 = new vr4
            r5.<init>(r3, r4)
            r1[r2] = r5
            int r2 = r2 + 1
            goto L7
        L1b:
            w0 r6 = new w0
            r6.<init>(r1)
            return r6
    }

    public final int size() {
            r0 = this;
            java.lang.String[] r0 = r0.A
            int r0 = r0.length
            int r0 = r0 / 2
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L2f
            java.lang.String r3 = r6.b(r2)
            java.lang.String r4 = r6.d(r2)
            r0.append(r3)
            java.lang.String r5 = ": "
            r0.append(r5)
            boolean r3 = defpackage.yy7.m(r3)
            if (r3 == 0) goto L24
            java.lang.String r4 = "██"
        L24:
            r0.append(r4)
            java.lang.String r3 = "\n"
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L2f:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
