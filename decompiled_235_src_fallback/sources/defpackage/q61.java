package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q61  reason: default package */
/* loaded from: classes.dex */
public class q61 implements defpackage.k61, defpackage.x42, defpackage.x93, defpackage.yi7, defpackage.cg4, defpackage.i71, defpackage.k76, defpackage.he4 {
    public static java.util.ArrayList j(java.util.List r4) {
            r4.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        Lc:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r4.next()
            r2 = r1
            k55 r2 = (defpackage.k55) r2
            k55 r3 = defpackage.k55.HTTP_1_0
            if (r2 == r3) goto Lc
            r0.add(r1)
            goto Lc
        L21:
            java.util.ArrayList r4 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ht0.v0(r0, r1)
            r4.<init>(r1)
            int r1 = r0.size()
            r2 = 0
        L31:
            if (r2 >= r1) goto L43
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            k55 r3 = (defpackage.k55) r3
            java.lang.String r3 = r3.toString()
            r4.add(r3)
            goto L31
        L43:
            return r4
    }

    public static byte[] k(java.util.List r5) {
            r5.getClass()
            k80 r0 = new k80
            r0.<init>()
            java.util.ArrayList r5 = j(r5)
            int r1 = r5.size()
            r2 = 0
        L11:
            if (r2 >= r1) goto L26
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r3.length()
            r0.n0(r4)
            r0.t0(r3)
            goto L11
        L26:
            long r1 = r0.B
            byte[] r5 = r0.N(r1)
            return r5
    }

    public static boolean n(defpackage.ct1 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
            r0 = 0
            if (r8 == 0) goto Lef
            if (r9 < 0) goto Lef
            if (r10 >= 0) goto L9
            goto Lef
        L9:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            r3 = -1
            if (r1 == r3) goto Lef
            if (r2 == r3) goto Lef
            if (r1 == r2) goto L1a
            goto Lef
        L1a:
            r4 = 1
            if (r11 == 0) goto La5
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            if (r1 < 0) goto L2c
            if (r11 >= r1) goto L2a
            goto L2c
        L2a:
            if (r9 >= 0) goto L2e
        L2c:
            r1 = r3
            goto L5d
        L2e:
            r11 = r0
        L2f:
            if (r9 != 0) goto L32
            goto L5d
        L32:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L3b
            if (r11 == 0) goto L39
            goto L2c
        L39:
            r1 = r0
            goto L5d
        L3b:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L4b
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L48
            goto L2c
        L48:
            int r9 = r9 + (-1)
            goto L2e
        L4b:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L54
            int r9 = r9 + (-1)
            goto L2f
        L54:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L5b
            goto L2c
        L5b:
            r11 = r4
            goto L2f
        L5d:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L6c
            if (r10 >= r2) goto L6a
            goto L6c
        L6a:
            if (r9 >= 0) goto L6e
        L6c:
            r10 = r3
            goto La0
        L6e:
            r11 = r0
        L6f:
            if (r9 != 0) goto L73
            r10 = r2
            goto La0
        L73:
            if (r2 < r10) goto L78
            if (r11 == 0) goto La0
            goto L6c
        L78:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L8a
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L85
            goto L6c
        L85:
            int r9 = r9 + (-1)
            int r2 = r2 + 1
            goto L6e
        L8a:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L95
            int r9 = r9 + (-1)
            int r2 = r2 + 1
            goto L6f
        L95:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L9c
            goto L6c
        L9c:
            int r2 = r2 + 1
            r11 = r4
            goto L6f
        La0:
            if (r1 == r3) goto Lef
            if (r10 != r3) goto Lb3
            goto Lef
        La5:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        Lb3:
            java.lang.Class<se7> r9 = defpackage.se7.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            se7[] r9 = (defpackage.se7[]) r9
            if (r9 == 0) goto Lef
            int r11 = r9.length
            if (r11 <= 0) goto Lef
            int r11 = r9.length
            r2 = r0
        Lc2:
            if (r2 >= r11) goto Ld9
            r3 = r9[r2]
            int r5 = r8.getSpanStart(r3)
            int r3 = r8.getSpanEnd(r3)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r3, r10)
            int r2 = r2 + 1
            goto Lc2
        Ld9:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            return r4
        Lef:
            return r0
    }

    public static defpackage.il5 o(defpackage.cg0 r10, defpackage.qi1 r11) {
            d51 r0 = new d51
            r1 = 4
            r0.<init>(r10, r1)
            java.lang.Object r1 = r11.f
            java.util.List r1 = (java.util.List) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "resolveFeatureGroup: sessionConfig = "
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r3 = ", lensFacing = "
            r2.append(r3)
            int r10 = r10.m()
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            java.lang.String r2 = "ResolvedFeatureGroup"
            defpackage.kj2.t(r2, r10)
            java.lang.Object r10 = r11.e
            java.util.Set r10 = (java.util.Set) r10
            boolean r3 = r10.isEmpty()
            r4 = 0
            if (r3 == 0) goto L3b
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L3b
            return r4
        L3b:
            java.lang.Object r3 = r11.g
            java.util.List r3 = (java.util.List) r3
            r5 = r10
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L55
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L4f
            goto L55
        L4f:
            java.lang.String r10 = "Must have at least one required or preferred feature"
            defpackage.i.h(r10)
            return r4
        L55:
            java.util.Iterator r5 = r3.iterator()
        L59:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L78
            java.lang.Object r6 = r5.next()
            di7 r6 = (defpackage.di7) r6
            mj7 r7 = defpackage.oj7.Companion
            r7.getClass()
            oj7 r7 = defpackage.mj7.a(r6)
            oj7 r8 = defpackage.oj7.UNDEFINED
            if (r7 != r8) goto L59
            aa2 r10 = new aa2
            r10.<init>(r6)
            goto Le1
        L78:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L7e:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L92
            java.lang.Object r5 = r10.next()
            qu2 r5 = (defpackage.qu2) r5
            ba2 r5 = defpackage.d51.j(r5, r3)
            if (r5 == 0) goto L7e
            r10 = r5
            goto Le1
        L92:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r1 = r1.iterator()
        L9b:
            boolean r5 = r1.hasNext()
            java.lang.String r6 = "DefaultFeatureGroupResolver"
            if (r5 == 0) goto Lc9
            java.lang.Object r5 = r1.next()
            r7 = r5
            qu2 r7 = (defpackage.qu2) r7
            ba2 r7 = defpackage.d51.j(r7, r3)
            if (r7 == 0) goto Lc2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "resolveFeatureGroup: filtered out preferred feature due to "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            defpackage.kj2.t(r6, r8)
            goto Lc3
        Lc2:
            r7 = r4
        Lc3:
            if (r7 != 0) goto L9b
            r10.add(r5)
            goto L9b
        Lc9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "resolveFeatureGroup: filteredPreferredFeatures = "
            r1.<init>(r3)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            defpackage.kj2.t(r6, r1)
            r1 = 0
            yt1 r3 = defpackage.yt1.A
            ca2 r10 = r0.f(r11, r10, r1, r3)
        Le1:
            boolean r11 = r10 instanceof defpackage.y92
            if (r11 == 0) goto Lfb
            y92 r10 = (defpackage.y92) r10
            il5 r10 = r10.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "resolvedFeatureGroup = "
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            defpackage.kj2.t(r2, r11)
            return r10
        Lfb:
            boolean r11 = r10 instanceof defpackage.z92
            if (r11 != 0) goto L146
            boolean r11 = r10 instanceof defpackage.aa2
            if (r11 != 0) goto L12b
            boolean r11 = r10 instanceof defpackage.ba2
            if (r11 != 0) goto L10b
            defpackage.i.d()
            return r4
        L10b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            ba2 r10 = (defpackage.ba2) r10
            java.lang.String r0 = r10.a
            qu2 r10 = r10.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " must be added for "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r11.<init>(r10)
            throw r11
        L12b:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            aa2 r10 = (defpackage.aa2) r10
            di7 r10 = r10.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = " is not supported"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r11.<init>(r10)
            throw r11
        L146:
            java.lang.String r10 = "Feature group is not supported"
            defpackage.i.h(r10)
            return r4
    }

    @Override // defpackage.x42
    public java.lang.Object a(java.lang.String r1, java.security.Provider r2) {
            r0 = this;
            if (r2 != 0) goto L7
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r1)
            return r0
        L7:
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r1, r2)
            return r0
    }

    @Override // defpackage.cg4
    public boolean b(defpackage.z64 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.cg4
    public int c() {
            r0 = this;
            r0 = 8
            return r0
    }

    @Override // defpackage.cg4
    public boolean d(defpackage.z64 r1) {
            r0 = this;
            sm3 r0 = defpackage.nc1.f0(r1)
            r1 = 0
            xa6 r0 = defpackage.kn2.h(r0, r1)
            boolean r0 = defpackage.u24.w(r0)
            return r0
    }

    @Override // defpackage.cg4
    public void e(defpackage.sm3 r8, long r9, defpackage.zx2 r11, int r12, boolean r13) {
            r7 = this;
            if0 r7 = r8.B0
            java.lang.Object r8 = r7.e
            eg4 r8 = (defpackage.eg4) r8
            op5 r12 = defpackage.eg4.K0
            r12 = 1
            long r2 = r8.V0(r9, r12)
            java.lang.Object r7 = r7.e
            r0 = r7
            eg4 r0 = (defpackage.eg4) r0
            q61 r1 = defpackage.eg4.O0
            r5 = 1
            r4 = r11
            r6 = r13
            r0.d1(r1, r2, r4, r5, r6)
            return
    }

    @Override // defpackage.c82
    public defpackage.da4 f() {
            r0 = this;
            da4 r0 = defpackage.da4.d()
            return r0
    }

    @Override // defpackage.cg4
    public boolean g(defpackage.zx2 r1, defpackage.sm3 r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.yi7
    public defpackage.zi7 h() {
            r0 = this;
            u54 r0 = new u54
            r0.<init>()
            return r0
    }

    @Override // defpackage.cg4
    public boolean i(defpackage.sm3 r2) {
            r1 = this;
            ta6 r1 = r2.x()
            r2 = 0
            r0 = 1
            if (r1 == 0) goto Ld
            boolean r1 = r1.R
            if (r1 != r0) goto Ld
            r2 = r0
        Ld:
            r1 = r2 ^ 1
            return r1
    }

    public defpackage.al1 l(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            al1 r0 = defpackage.al1.k
            if (r0 != 0) goto L21
            monitor-enter(r1)
            al1 r0 = defpackage.al1.k     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1d
            al1 r0 = new al1     // Catch: java.lang.Throwable -> L1b
            android.content.Context r2 = defpackage.q41.a(r2)     // Catch: java.lang.Throwable -> L1b
            r2.getClass()     // Catch: java.lang.Throwable -> L1b
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            defpackage.al1.k = r0     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r2 = move-exception
            goto L1f
        L1d:
            monitor-exit(r1)
            return r0
        L1f:
            monitor-exit(r1)
            throw r2
        L21:
            return r0
    }

    public void m(android.view.View r2, android.graphics.Rect r3) {
            r1 = this;
            android.content.res.Resources r1 = r2.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r2 = r1.widthPixels
            int r1 = r1.heightPixels
            r0 = 0
            r3.set(r0, r0, r2, r1)
            return
    }

    @Override // defpackage.k76
    public void onScrollLimit(int r1, int r2, int r3, boolean r4) {
            r0 = this;
            return
    }

    @Override // defpackage.k76
    public void onScrollProgress(int r1, int r2, int r3, int r4) {
            r0 = this;
            return
    }

    public void p(defpackage.c05 r1, int r2, int r3) {
            r0 = this;
            return
    }
}
