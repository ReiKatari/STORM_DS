package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb6  reason: default package */
/* loaded from: classes.dex */
public final class yb6 implements defpackage.wb6, defpackage.ya0 {
    public final java.lang.String a;
    public final defpackage.np2 b;
    public final int c;
    public final java.util.List d;
    public final java.util.HashSet e;
    public final java.lang.String[] f;
    public final defpackage.wb6[] g;
    public final java.util.List[] h;
    public final boolean[] i;
    public final java.util.Map j;
    public final defpackage.wb6[] k;
    public final defpackage.ex6 l;

    public yb6(java.lang.String r2, defpackage.np2 r3, int r4, java.util.List r5, defpackage.br0 r6) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            java.util.List r2 = r6.b
            r1.d = r2
            java.util.ArrayList r2 = r6.c
            r2.getClass()
            java.util.HashSet r3 = new java.util.HashSet
            r4 = 12
            int r4 = defpackage.ht0.v0(r2, r4)
            int r4 = defpackage.c14.k0(r4)
            r3.<init>(r4)
            defpackage.gt0.h1(r2, r3)
            r1.e = r3
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r4)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.f = r2
            java.util.ArrayList r4 = r6.e
            wb6[] r4 = defpackage.q60.r(r4)
            r1.g = r4
            java.util.ArrayList r4 = r6.f
            java.util.List[] r3 = new java.util.List[r3]
            java.lang.Object[] r3 = r4.toArray(r3)
            java.util.List[] r3 = (java.util.List[]) r3
            r1.h = r3
            java.util.ArrayList r3 = r6.g
            boolean[] r3 = defpackage.gt0.g1(r3)
            r1.i = r3
            r2.getClass()
            dv r3 = new dv
            a5 r4 = new a5
            r6 = 4
            r4.<init>(r2, r6)
            r2 = 2
            r3.<init>(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.ht0.v0(r3, r4)
            r2.<init>(r4)
            java.util.Iterator r3 = r3.iterator()
        L6b:
            r4 = r3
            op1 r4 = (defpackage.op1) r4
            java.util.Iterator r6 = r4.B
            boolean r6 = r6.hasNext()
            if (r6 == 0) goto L8d
            java.lang.Object r4 = r4.next()
            j43 r4 = (defpackage.j43) r4
            java.lang.Object r6 = r4.b
            int r4 = r4.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            vr4 r0 = new vr4
            r0.<init>(r6, r4)
            r2.add(r0)
            goto L6b
        L8d:
            java.util.Map r2 = defpackage.c14.r0(r2)
            r1.j = r2
            wb6[] r2 = defpackage.q60.r(r5)
            r1.k = r2
            t46 r2 = new t46
            r3 = 6
            r2.<init>(r1, r3)
            ex6 r3 = new ex6
            r3.<init>(r2)
            r1.l = r3
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
            java.util.HashSet r0 = r0.e
            return r0
    }

    @Override // defpackage.wb6
    public final int d(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            java.util.Map r0 = r0.j
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
    public final defpackage.np2 e() {
            r0 = this;
            np2 r0 = r0.b
            return r0
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L3
            goto L61
        L3:
            boolean r0 = r7 instanceof defpackage.yb6
            r1 = 0
            if (r0 != 0) goto L9
            goto L5d
        L9:
            r0 = r7
            wb6 r0 = (defpackage.wb6) r0
            java.lang.String r2 = r0.a()
            java.lang.String r3 = r6.a
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L19
            goto L5d
        L19:
            yb6 r7 = (defpackage.yb6) r7
            wb6[] r2 = r6.k
            wb6[] r7 = r7.k
            boolean r7 = java.util.Arrays.equals(r2, r7)
            if (r7 != 0) goto L26
            goto L5d
        L26:
            int r7 = r0.f()
            int r2 = r6.c
            if (r2 == r7) goto L2f
            goto L5d
        L2f:
            r7 = r1
        L30:
            if (r7 >= r2) goto L61
            wb6[] r3 = r6.g
            r4 = r3[r7]
            java.lang.String r4 = r4.a()
            wb6 r5 = r0.j(r7)
            java.lang.String r5 = r5.a()
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L49
            goto L5d
        L49:
            r3 = r3[r7]
            np2 r3 = r3.e()
            wb6 r4 = r0.j(r7)
            np2 r4 = r4.e()
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L5e
        L5d:
            return r1
        L5e:
            int r7 = r7 + 1
            goto L30
        L61:
            r6 = 1
            return r6
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
            java.lang.String[] r0 = r0.f
            r0 = r0[r1]
            return r0
    }

    @Override // defpackage.wb6
    public final java.util.List getAnnotations() {
            r0 = this;
            java.util.List r0 = r0.d
            return r0
    }

    public final int hashCode() {
            r0 = this;
            ex6 r0 = r0.l
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    @Override // defpackage.wb6
    public final java.util.List i(int r1) {
            r0 = this;
            java.util.List[] r0 = r0.h
            r0 = r0[r1]
            return r0
    }

    @Override // defpackage.wb6
    public final defpackage.wb6 j(int r1) {
            r0 = this;
            wb6[] r0 = r0.g
            r0 = r0[r1]
            return r0
    }

    @Override // defpackage.wb6
    public final boolean k(int r1) {
            r0 = this;
            boolean[] r0 = r0.i
            boolean r0 = r0[r1]
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = defpackage.oi2.Z(r0)
            return r0
    }
}
