package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qw2  reason: default package */
/* loaded from: classes.dex */
public final class qw2 extends defpackage.m0 {
    public final defpackage.gg3 a;
    public final defpackage.gg3 b;
    public final /* synthetic */ int c;
    public final defpackage.pw2 d;

    public qw2(defpackage.gg3 r1, defpackage.gg3 r2, byte r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public qw2(defpackage.gg3 r2, defpackage.gg3 r3, int r4) {
            r1 = this;
            r1.c = r4
            r0 = 0
            r2.getClass()
            r3.getClass()
            switch(r4) {
                case 1: goto L27;
                default: goto Lc;
            }
        Lc:
            r1.<init>(r2, r3, r0)
            pw2 r4 = new pw2
            wb6 r2 = r2.e()
            wb6 r3 = r3.e()
            r2.getClass()
            r3.getClass()
            java.lang.String r0 = "kotlin.collections.HashMap"
            r4.<init>(r0, r2, r3)
            r1.d = r4
            return
        L27:
            r1.<init>(r2, r3, r0)
            pw2 r4 = new pw2
            wb6 r2 = r2.e()
            wb6 r3 = r3.e()
            r2.getClass()
            r3.getClass()
            java.lang.String r0 = "kotlin.collections.LinkedHashMap"
            r4.<init>(r0, r2, r3)
            r1.d = r4
            return
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.i(r9)
            wb6 r1 = r7.e()
            vx0 r8 = r8.g0(r1, r0)
            java.util.Iterator r9 = r7.h(r9)
            r0 = 0
        L11:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            wb6 r4 = r7.e()
            int r5 = r0 + 1
            gg3 r6 = r7.a
            gg3 r6 = (defpackage.gg3) r6
            r8.w(r4, r0, r6, r3)
            wb6 r3 = r7.e()
            int r0 = r0 + 2
            gg3 r4 = r7.b
            gg3 r4 = (defpackage.gg3) r4
            r8.w(r3, r5, r4, r2)
            goto L11
        L40:
            r8.a(r1)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r1 = this;
            int r0 = r1.c
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            pw2 r1 = r1.d
            return r1
        L8:
            pw2 r1 = r1.d
            return r1
    }

    @Override // defpackage.m0
    public final java.lang.Object f() {
            r0 = this;
            int r0 = r0.c
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            return r0
        Lb:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
    }

    @Override // defpackage.m0
    public final int g(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.c
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            r1.getClass()
            int r0 = r1.size()
        Le:
            int r0 = r0 * 2
            return r0
        L11:
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.getClass()
            int r0 = r1.size()
            goto Le
    }

    @Override // defpackage.m0
    public final java.util.Iterator h(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.c
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            java.util.Map r1 = (java.util.Map) r1
            r1.getClass()
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
        L13:
            java.util.Map r1 = (java.util.Map) r1
            r1.getClass()
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // defpackage.m0
    public final int i(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.c
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.util.Map r1 = (java.util.Map) r1
            r1.getClass()
            int r0 = r1.size()
            return r0
        Lf:
            java.util.Map r1 = (java.util.Map) r1
            r1.getClass()
            int r0 = r1.size()
            return r0
    }

    @Override // defpackage.m0
    public final void k(defpackage.ux0 r5, int r6, java.lang.Object r7) {
            r4 = this;
            java.util.Map r7 = (java.util.Map) r7
            r7.getClass()
            wb6 r0 = r4.e()
            gg3 r1 = r4.a
            gg3 r1 = (defpackage.gg3) r1
            r2 = 0
            java.lang.Object r0 = r5.G(r0, r6, r1, r2)
            wb6 r1 = r4.e()
            int r1 = r5.q(r1)
            int r3 = r6 + 1
            if (r1 != r3) goto L4f
            boolean r6 = r7.containsKey(r0)
            gg3 r3 = r4.b
            if (r6 == 0) goto L41
            wb6 r6 = r3.e()
            np2 r6 = r6.e()
            boolean r6 = r6 instanceof defpackage.v25
            if (r6 != 0) goto L41
            wb6 r4 = r4.e()
            gg3 r3 = (defpackage.gg3) r3
            java.lang.Object r6 = defpackage.c14.j0(r7, r0)
            java.lang.Object r4 = r5.G(r4, r1, r3, r6)
            goto L4b
        L41:
            wb6 r4 = r4.e()
            gg3 r3 = (defpackage.gg3) r3
            java.lang.Object r4 = r5.G(r4, r1, r3, r2)
        L4b:
            r7.put(r0, r4)
            return
        L4f:
            java.lang.String r4 = "Value must follow key in a map, index for key: "
            java.lang.String r5 = ", returned index for value: "
            java.lang.String r4 = defpackage.lb1.j(r4, r6, r1, r5)
            defpackage.i.f(r4)
            return
    }

    @Override // defpackage.m0
    public final java.lang.Object l(java.lang.Object r2) {
            r1 = this;
            int r1 = r1.c
            r0 = 0
            switch(r1) {
                case 0: goto L1a;
                default: goto L6;
            }
        L6:
            java.util.Map r2 = (java.util.Map) r2
            r2.getClass()
            boolean r1 = r2 instanceof java.util.LinkedHashMap
            if (r1 == 0) goto L12
            r0 = r2
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
        L12:
            if (r0 != 0) goto L19
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r2)
        L19:
            return r0
        L1a:
            java.util.Map r2 = (java.util.Map) r2
            r2.getClass()
            boolean r1 = r2 instanceof java.util.HashMap
            if (r1 == 0) goto L26
            r0 = r2
            java.util.HashMap r0 = (java.util.HashMap) r0
        L26:
            if (r0 != 0) goto L2d
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
        L2d:
            return r0
    }

    @Override // defpackage.m0
    public final java.lang.Object m(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.c
            switch(r0) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            r1.getClass()
            return r1
        Lb:
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.getClass()
            return r1
    }
}
