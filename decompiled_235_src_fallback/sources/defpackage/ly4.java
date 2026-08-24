package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly4  reason: default package */
/* loaded from: classes.dex */
public class ly4 implements defpackage.wb6, defpackage.ya0 {
    public final java.lang.String a;
    public final defpackage.qr2 b;
    public final int c;
    public int d;
    public final java.lang.String[] e;
    public final java.util.List[] f;
    public final boolean[] g;
    public java.util.Map h;
    public final defpackage.go3 i;
    public final defpackage.go3 j;
    public final defpackage.go3 k;

    public ly4(java.lang.String r3, defpackage.qr2 r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r3 = -1
            r2.d = r3
            java.lang.String[] r3 = new java.lang.String[r5]
            r4 = 0
            r0 = r4
        L10:
            if (r0 >= r5) goto L19
            java.lang.String r1 = "[UNINITIALIZED]"
            r3[r0] = r1
            int r0 = r0 + 1
            goto L10
        L19:
            r2.e = r3
            int r3 = r2.c
            java.util.List[] r5 = new java.util.List[r3]
            r2.f = r5
            boolean[] r3 = new boolean[r3]
            r2.g = r3
            zt1 r3 = defpackage.zt1.A
            r2.h = r3
            xr3 r3 = defpackage.xr3.PUBLICATION
            ky4 r5 = new ky4
            r5.<init>(r2, r4)
            go3 r4 = defpackage.kj2.M(r3, r5)
            r2.i = r4
            ky4 r4 = new ky4
            r5 = 1
            r4.<init>(r2, r5)
            go3 r4 = defpackage.kj2.M(r3, r4)
            r2.j = r4
            ky4 r4 = new ky4
            r5 = 2
            r4.<init>(r2, r5)
            go3 r3 = defpackage.kj2.M(r3, r4)
            r2.k = r3
            return
    }

    @Override // defpackage.wb6
    public final java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
    }

    @Override // defpackage.ya0
    public final java.util.Set b() {
            r0 = this;
            java.util.Map r0 = r0.h
            java.util.Set r0 = r0.keySet()
            return r0
    }

    @Override // defpackage.wb6
    public final int d(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            java.util.Map r0 = r0.h
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L12
            int r0 = r0.intValue()
            return r0
        L12:
            r0 = -3
            return r0
    }

    @Override // defpackage.wb6
    public defpackage.np2 e() {
            r0 = this;
            bt6 r0 = defpackage.bt6.e
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            if (r5 != r6) goto L4
            goto L70
        L4:
            boolean r0 = r6 instanceof defpackage.ly4
            r1 = 0
            if (r0 != 0) goto La
            goto L6c
        La:
            r0 = r6
            wb6 r0 = (defpackage.wb6) r0
            java.lang.String r2 = r0.a()
            java.lang.String r3 = r5.a
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1a
            goto L6c
        L1a:
            ly4 r6 = (defpackage.ly4) r6
            go3 r2 = r5.j
            java.lang.Object r2 = r2.getValue()
            wb6[] r2 = (defpackage.wb6[]) r2
            go3 r6 = r6.j
            java.lang.Object r6 = r6.getValue()
            wb6[] r6 = (defpackage.wb6[]) r6
            boolean r6 = java.util.Arrays.equals(r2, r6)
            if (r6 != 0) goto L33
            goto L6c
        L33:
            int r6 = r0.f()
            int r2 = r5.c
            if (r2 == r6) goto L3c
            goto L6c
        L3c:
            r6 = r1
        L3d:
            if (r6 >= r2) goto L70
            wb6 r3 = r5.j(r6)
            java.lang.String r3 = r3.a()
            wb6 r4 = r0.j(r6)
            java.lang.String r4 = r4.a()
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L56
            goto L6c
        L56:
            wb6 r3 = r5.j(r6)
            np2 r3 = r3.e()
            wb6 r4 = r0.j(r6)
            np2 r4 = r4.e()
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L6d
        L6c:
            return r1
        L6d:
            int r6 = r6 + 1
            goto L3d
        L70:
            r5 = 1
            return r5
    }

    @Override // defpackage.wb6
    public final int f() {
            r0 = this;
            int r0 = r0.c
            return r0
    }

    @Override // defpackage.wb6
    public final java.lang.String g(int r1) {
            r0 = this;
            java.lang.String[] r0 = r0.e
            r0 = r0[r1]
            return r0
    }

    @Override // defpackage.wb6
    public final java.util.List getAnnotations() {
            r0 = this;
            yt1 r0 = defpackage.yt1.A
            return r0
    }

    public int hashCode() {
            r0 = this;
            go3 r0 = r0.k
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    @Override // defpackage.wb6
    public final java.util.List i(int r1) {
            r0 = this;
            java.util.List[] r0 = r0.f
            r0 = r0[r1]
            if (r0 != 0) goto L8
            yt1 r0 = defpackage.yt1.A
        L8:
            return r0
    }

    @Override // defpackage.wb6
    public defpackage.wb6 j(int r1) {
            r0 = this;
            go3 r0 = r0.i
            java.lang.Object r0 = r0.getValue()
            gg3[] r0 = (defpackage.gg3[]) r0
            r0 = r0[r1]
            wb6 r0 = r0.e()
            return r0
    }

    @Override // defpackage.wb6
    public final boolean k(int r1) {
            r0 = this;
            boolean[] r0 = r0.g
            boolean r0 = r0[r1]
            return r0
    }

    public final void l(java.lang.String r5, boolean r6) {
            r4 = this;
            r5.getClass()
            int r0 = r4.d
            int r0 = r0 + 1
            r4.d = r0
            java.lang.String[] r1 = r4.e
            r1[r0] = r5
            boolean[] r5 = r4.g
            r5[r0] = r6
            java.util.List[] r5 = r4.f
            r6 = 0
            r5[r0] = r6
            int r5 = r4.c
            int r5 = r5 + (-1)
            if (r0 != r5) goto L33
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            int r6 = r1.length
            r0 = 0
        L23:
            if (r0 >= r6) goto L31
            r2 = r1[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5.put(r2, r3)
            int r0 = r0 + 1
            goto L23
        L31:
            r4.h = r5
        L33:
            return
    }

    public final void m(defpackage.r45 r4) {
            r3 = this;
            int r0 = r3.d
            java.util.List[] r1 = r3.f
            r0 = r1[r0]
            if (r0 != 0) goto L12
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 1
            r0.<init>(r2)
            int r3 = r3.d
            r1[r3] = r0
        L12:
            r0.add(r4)
            return
    }

    public java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = defpackage.oi2.Z(r0)
            return r0
    }
}
