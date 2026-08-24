package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kf3  reason: default package */
/* loaded from: classes.dex */
public class kf3 extends defpackage.v0 {
    public final defpackage.ye3 Y;
    public final defpackage.wb6 Z;
    public int d0;
    public boolean e0;

    public /* synthetic */ kf3(defpackage.id3 r2, defpackage.ye3 r3, java.lang.String r4, int r5) {
            r1 = this;
            r5 = r5 & 4
            r0 = 0
            if (r5 == 0) goto L6
            r4 = r0
        L6:
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public kf3(defpackage.id3 r1, defpackage.ye3 r2, java.lang.String r3, defpackage.wb6 r4) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1, r3)
            r0.Y = r2
            r0.Z = r4
            return
    }

    @Override // defpackage.v0
    public /* bridge */ /* synthetic */ defpackage.de3 E() {
            r0 = this;
            ye3 r0 = r0.R()
            return r0
    }

    @Override // defpackage.v0, defpackage.sc1
    public final boolean M() {
            r1 = this;
            boolean r0 = r1.e0
            if (r0 != 0) goto Lc
            boolean r1 = super.M()
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public defpackage.ye3 R() {
            r0 = this;
            ye3 r0 = r0.Y
            return r0
    }

    @Override // defpackage.v0, defpackage.ux0
    public void a(defpackage.wb6 r6) {
            r5 = this;
            r6.getClass()
            id3 r0 = r5.L
            boolean r1 = defpackage.te3.c(r0, r6)
            if (r1 != 0) goto Laf
            np2 r1 = r6.e()
            boolean r1 = r1 instanceof defpackage.dz4
            if (r1 == 0) goto L15
            goto Laf
        L15:
            defpackage.te3.d(r0, r6)
            td3 r1 = r5.X
            boolean r1 = r1.e
            r2 = 0
            if (r1 != 0) goto L24
            java.util.Set r6 = defpackage.q60.k(r6)
            goto L58
        L24:
            java.util.Set r1 = defpackage.q60.k(r6)
            d51 r3 = r0.c
            r3.getClass()
            java.lang.Object r3 = r3.B
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            java.lang.Object r6 = r3.get(r6)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L40
            x31 r3 = defpackage.te3.a
            java.lang.Object r6 = r6.get(r3)
            goto L41
        L40:
            r6 = r2
        L41:
            if (r6 != 0) goto L44
            r6 = r2
        L44:
            java.util.Map r6 = (java.util.Map) r6
            if (r6 == 0) goto L4d
            java.util.Set r6 = r6.keySet()
            goto L4e
        L4d:
            r6 = r2
        L4e:
            if (r6 != 0) goto L52
            du1 r6 = defpackage.du1.A
        L52:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.LinkedHashSet r6 = defpackage.ii2.K(r1, r6)
        L58:
            ye3 r1 = r5.R()
            java.util.Map r1 = r1.A
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L66:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Laf
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r6.contains(r3)
            if (r4 != 0) goto L66
            java.lang.String r4 = r5.R
            boolean r4 = defpackage.nb3.k(r3, r4)
            if (r4 != 0) goto L66
            java.lang.String r6 = "Encountered an unknown key '"
            r1 = 39
            java.lang.String r6 = defpackage.i61.k(r1, r6, r3)
            java.lang.String r1 = r5.N()
            td3 r0 = r0.a
            boolean r0 = r0.g
            r3 = -1
            if (r0 == 0) goto La3
            ye3 r5 = r5.R()
            java.lang.String r5 = r5.toString()
            java.lang.CharSequence r5 = defpackage.hi2.H(r3, r5)
            java.lang.String r2 = r5.toString()
        La3:
            ae3 r5 = new ae3
            java.lang.String r0 = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys."
            java.lang.String r6 = defpackage.hi2.x(r6, r1, r3, r0, r2)
            r5.<init>(r6)
            throw r5
        Laf:
            return
    }

    @Override // defpackage.v0, defpackage.sc1
    public final defpackage.ux0 c(defpackage.wb6 r6) {
            r5 = this;
            r6.getClass()
            wb6 r0 = r5.Z
            if (r6 != r0) goto L77
            kf3 r6 = new kf3
            de3 r1 = r5.f()
            java.lang.String r2 = r0.a()
            boolean r3 = r1 instanceof defpackage.ye3
            id3 r4 = r5.L
            if (r3 != 0) goto L6f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected "
            r6.<init>(r0)
            java.lang.Class<ye3> r0 = defpackage.ye3.class
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.String r0 = r0.c()
            r6.append(r0)
            java.lang.String r0 = ", but had "
            r6.append(r0)
            java.lang.Class r0 = r1.getClass()
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.String r0 = r0.c()
            r6.append(r0)
            java.lang.String r0 = " as the serialized body of "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r5 = r5.N()
            td3 r0 = r4.a
            boolean r0 = r0.g
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L64
            java.lang.String r0 = r1.toString()
            java.lang.CharSequence r0 = defpackage.hi2.H(r2, r0)
            java.lang.String r0 = r0.toString()
            goto L65
        L64:
            r0 = r3
        L65:
            ae3 r1 = new ae3
            java.lang.String r5 = defpackage.hi2.x(r6, r5, r2, r3, r0)
            r1.<init>(r5)
            throw r1
        L6f:
            ye3 r1 = (defpackage.ye3) r1
            java.lang.String r5 = r5.R
            r6.<init>(r4, r1, r5, r0)
            return r6
        L77:
            ux0 r5 = super.c(r6)
            return r5
    }

    @Override // defpackage.v0
    public defpackage.de3 d(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            ye3 r0 = r0.R()
            java.lang.Object r0 = defpackage.c14.j0(r0, r1)
            de3 r0 = (defpackage.de3) r0
            return r0
    }

    @Override // defpackage.ux0
    public int q(defpackage.wb6 r6) {
            r5 = this;
            r6.getClass()
        L3:
            int r0 = r5.d0
            int r1 = r6.f()
            if (r0 >= r1) goto L4a
            int r0 = r5.d0
            int r1 = r0 + 1
            r5.d0 = r1
            java.lang.String r0 = r5.D(r6, r0)
            int r1 = r5.d0
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r5.e0 = r3
            ye3 r4 = r5.R()
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L44
            id3 r0 = r5.L
            td3 r0 = r0.a
            boolean r0 = r0.b
            if (r0 != 0) goto L3f
            boolean r0 = r6.k(r1)
            if (r0 != 0) goto L3f
            wb6 r0 = r6.j(r1)
            boolean r0 = r0.c()
            if (r0 == 0) goto L3f
            goto L40
        L3f:
            r2 = r3
        L40:
            r5.e0 = r2
            if (r2 == 0) goto L3
        L44:
            td3 r5 = r5.X
            r5.getClass()
            return r1
        L4a:
            r5 = -1
            return r5
    }

    @Override // defpackage.v0
    public java.lang.String x(defpackage.wb6 r8, int r9) {
            r7 = this;
            r8.getClass()
            id3 r0 = r7.L
            defpackage.te3.d(r0, r8)
            java.lang.String r1 = r8.g(r9)
            td3 r2 = r7.X
            boolean r2 = r2.e
            if (r2 != 0) goto L14
            goto L98
        L14:
            ye3 r2 = r7.R()
            java.util.Map r2 = r2.A
            java.util.Set r2 = r2.keySet()
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L26
            goto L98
        L26:
            d51 r2 = r0.c
            ci2 r3 = new ci2
            r4 = 6
            r3.<init>(r4, r8, r0)
            r2.getClass()
            java.lang.Object r0 = r2.B
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r2 = r0.get(r8)
            java.util.Map r2 = (java.util.Map) r2
            r4 = 0
            x31 r5 = defpackage.te3.a
            if (r2 == 0) goto L45
            java.lang.Object r2 = r2.get(r5)
            goto L46
        L45:
            r2 = r4
        L46:
            if (r2 != 0) goto L49
            r2 = r4
        L49:
            if (r2 == 0) goto L4c
            goto L64
        L4c:
            java.lang.Object r2 = r3.c()
            java.lang.Object r3 = r0.get(r8)
            if (r3 != 0) goto L5f
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r6 = 2
            r3.<init>(r6)
            r0.put(r8, r3)
        L5f:
            java.util.Map r3 = (java.util.Map) r3
            r3.put(r5, r2)
        L64:
            java.util.Map r2 = (java.util.Map) r2
            ye3 r7 = r7.R()
            java.util.Map r7 = r7.A
            java.util.Set r7 = r7.keySet()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L76:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L93
            java.lang.Object r8 = r7.next()
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L8c
            goto L76
        L8c:
            int r0 = r0.intValue()
            if (r0 != r9) goto L76
            r4 = r8
        L93:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L98
            return r4
        L98:
            return r1
    }
}
