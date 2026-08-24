package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yh4  reason: default package */
/* loaded from: classes.dex */
public final class yh4 extends defpackage.yc7 {
    public static final defpackage.kh4 c = null;
    public final defpackage.su2 a;
    public final defpackage.o67 b;

    static {
            n67 r0 = defpackage.n67.DOUBLE
            kh4 r1 = new kh4
            r2 = 1
            r1.<init>(r0, r2)
            defpackage.yh4.c = r1
            return
    }

    public yh4(defpackage.su2 r1, defpackage.o67 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static java.io.Serializable e(defpackage.hf3 r2, defpackage.jf3 r3) {
            int[] r0 = defpackage.xh4.a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L19
            r1 = 2
            if (r3 == r1) goto L10
            r2 = 0
            return r2
        L10:
            r2.h()
            aw3 r2 = new aw3
            r2.<init>(r0)
            return r2
        L19:
            r2.e()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            return r2
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r7) {
            r6 = this;
            jf3 r0 = r7.n0()
            java.io.Serializable r1 = e(r7, r0)
            if (r1 != 0) goto Lf
            java.io.Serializable r6 = r6.d(r7, r0)
            return r6
        Lf:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
        L14:
            boolean r2 = r7.F()
            if (r2 == 0) goto L4f
            boolean r2 = r1 instanceof java.util.Map
            if (r2 == 0) goto L23
            java.lang.String r2 = r7.c0()
            goto L24
        L23:
            r2 = 0
        L24:
            jf3 r3 = r7.n0()
            java.io.Serializable r4 = e(r7, r3)
            if (r4 == 0) goto L30
            r5 = 1
            goto L31
        L30:
            r5 = 0
        L31:
            if (r4 != 0) goto L37
            java.io.Serializable r4 = r6.d(r7, r3)
        L37:
            boolean r3 = r1 instanceof java.util.List
            if (r3 == 0) goto L42
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            r2.add(r4)
            goto L48
        L42:
            r3 = r1
            java.util.Map r3 = (java.util.Map) r3
            r3.put(r2, r4)
        L48:
            if (r5 == 0) goto L14
            r0.addLast(r1)
            r1 = r4
            goto L14
        L4f:
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L57
            r7.r()
            goto L5a
        L57:
            r7.u()
        L5a:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L61
            return r1
        L61:
            java.lang.Object r1 = r0.removeLast()
            goto L14
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r3, java.lang.Object r4) {
            r2 = this;
            if (r4 != 0) goto L6
            r3.A()
            return
        L6:
            java.lang.Class r0 = r4.getClass()
            su2 r2 = r2.a
            r2.getClass()
            ie7 r1 = new ie7
            r1.<init>(r0)
            yc7 r2 = r2.d(r1)
            boolean r0 = r2 instanceof defpackage.yh4
            if (r0 == 0) goto L23
            r3.k()
            r3.u()
            return
        L23:
            r2.c(r3, r4)
            return
    }

    public final java.io.Serializable d(defpackage.hf3 r3, defpackage.jf3 r4) {
            r2 = this;
            int[] r0 = defpackage.xh4.a
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 3
            if (r0 == r1) goto L2f
            r1 = 4
            if (r0 == r1) goto L28
            r2 = 5
            if (r0 == r2) goto L1f
            r2 = 6
            r1 = 0
            if (r0 != r2) goto L19
            r3.j0()
            return r1
        L19:
            java.lang.String r2 = "Unexpected token: "
            defpackage.e41.y(r4, r2)
            return r1
        L1f:
            boolean r2 = r3.U()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L28:
            o67 r2 = r2.b
            java.lang.Number r2 = r2.readNumber(r3)
            return r2
        L2f:
            java.lang.String r2 = r3.l0()
            return r2
    }
}
