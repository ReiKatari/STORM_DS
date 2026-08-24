package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ke3  reason: default package */
/* loaded from: classes.dex */
public class ke3 extends defpackage.yc7 {
    public static final defpackage.ke3 a = null;

    static {
            ke3 r0 = new ke3
            r0.<init>()
            defpackage.ke3.a = r0
            return
    }

    private ke3() {
            r0 = this;
            r0.<init>()
            return
    }

    public static defpackage.ee3 d(defpackage.hf3 r7) {
            boolean r0 = r7 instanceof defpackage.rf3
            r1 = 0
            if (r0 == 0) goto L2d
            rf3 r7 = (defpackage.rf3) r7
            jf3 r0 = r7.n0()
            jf3 r2 = defpackage.jf3.NAME
            if (r0 == r2) goto L25
            jf3 r2 = defpackage.jf3.END_ARRAY
            if (r0 == r2) goto L25
            jf3 r2 = defpackage.jf3.END_OBJECT
            if (r0 == r2) goto L25
            jf3 r2 = defpackage.jf3.END_DOCUMENT
            if (r0 == r2) goto L25
            java.lang.Object r0 = r7.C0()
            ee3 r0 = (defpackage.ee3) r0
            r7.u0()
            return r0
        L25:
            java.lang.String r7 = "Unexpected "
            java.lang.String r2 = " when reading a JsonElement."
            defpackage.e41.o(r0, r2, r7)
            return r1
        L2d:
            jf3 r0 = r7.n0()
            ee3 r2 = f(r7, r0)
            if (r2 != 0) goto L3c
            ee3 r7 = e(r7, r0)
            return r7
        L3c:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
        L41:
            boolean r3 = r7.F()
            if (r3 == 0) goto L7e
            boolean r3 = r2 instanceof defpackage.ze3
            if (r3 == 0) goto L50
            java.lang.String r3 = r7.c0()
            goto L51
        L50:
            r3 = r1
        L51:
            jf3 r4 = r7.n0()
            ee3 r5 = f(r7, r4)
            if (r5 == 0) goto L5d
            r6 = 1
            goto L5e
        L5d:
            r6 = 0
        L5e:
            if (r5 != 0) goto L64
            ee3 r5 = e(r7, r4)
        L64:
            boolean r4 = r2 instanceof defpackage.od3
            if (r4 == 0) goto L71
            r3 = r2
            od3 r3 = (defpackage.od3) r3
            java.util.ArrayList r3 = r3.A
            r3.add(r5)
            goto L77
        L71:
            r4 = r2
            ze3 r4 = (defpackage.ze3) r4
            r4.d(r3, r5)
        L77:
            if (r6 == 0) goto L41
            r0.addLast(r2)
            r2 = r5
            goto L41
        L7e:
            boolean r3 = r2 instanceof defpackage.od3
            if (r3 == 0) goto L86
            r7.r()
            goto L89
        L86:
            r7.u()
        L89:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L90
            return r2
        L90:
            java.lang.Object r2 = r0.removeLast()
            ee3 r2 = (defpackage.ee3) r2
            goto L41
    }

    public static defpackage.ee3 e(defpackage.hf3 r2, defpackage.jf3 r3) {
            int[] r0 = defpackage.je3.a
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 3
            if (r0 == r1) goto L3e
            r1 = 4
            if (r0 == r1) goto L2f
            r1 = 5
            if (r0 == r1) goto L21
            r1 = 6
            if (r0 != r1) goto L1a
            r2.j0()
            ve3 r2 = defpackage.ve3.A
            return r2
        L1a:
            java.lang.String r2 = "Unexpected token: "
            defpackage.e41.y(r3, r2)
            r2 = 0
            return r2
        L21:
            ef3 r3 = new ef3
            boolean r2 = r2.U()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3.<init>(r2)
            return r3
        L2f:
            java.lang.String r2 = r2.l0()
            ef3 r3 = new ef3
            fo3 r0 = new fo3
            r0.<init>(r2)
            r3.<init>(r0)
            return r3
        L3e:
            ef3 r3 = new ef3
            java.lang.String r2 = r2.l0()
            r3.<init>(r2)
            return r3
    }

    public static defpackage.ee3 f(defpackage.hf3 r1, defpackage.jf3 r2) {
            int[] r0 = defpackage.je3.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L19
            r0 = 2
            if (r2 == r0) goto L10
            r1 = 0
            return r1
        L10:
            r1.h()
            ze3 r1 = new ze3
            r1.<init>()
            return r1
        L19:
            r1.e()
            od3 r1 = new od3
            r1.<init>()
            return r1
    }

    public static void g(defpackage.vf3 r3, defpackage.ee3 r4) {
            if (r4 == 0) goto Lb1
            boolean r0 = r4 instanceof defpackage.ve3
            if (r0 == 0) goto L8
            goto Lb1
        L8:
            boolean r0 = r4 instanceof defpackage.ef3
            if (r0 == 0) goto L3f
            ef3 r4 = (defpackage.ef3) r4
            java.io.Serializable r0 = r4.A
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L1c
            java.lang.Number r4 = r4.g()
            r3.a0(r4)
            return
        L1c:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L37
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L2b
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
            goto L33
        L2b:
            java.lang.String r4 = r4.c()
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
        L33:
            r3.e0(r4)
            return
        L37:
            java.lang.String r4 = r4.c()
            r3.c0(r4)
            return
        L3f:
            boolean r0 = r4 instanceof defpackage.od3
            if (r0 == 0) goto L69
            r3.h()
            if (r0 == 0) goto L63
            od3 r4 = (defpackage.od3) r4
            java.util.ArrayList r4 = r4.A
            int r0 = r4.size()
            r1 = 0
        L51:
            if (r1 >= r0) goto L5f
            java.lang.Object r2 = r4.get(r1)
            int r1 = r1 + 1
            ee3 r2 = (defpackage.ee3) r2
            g(r3, r2)
            goto L51
        L5f:
            r3.r()
            return
        L63:
            java.lang.String r3 = "Not a JSON Array: "
            defpackage.e41.y(r4, r3)
            return
        L69:
            boolean r0 = r4 instanceof defpackage.ze3
            if (r0 == 0) goto La7
            r3.k()
            ze3 r4 = r4.b()
            aw3 r4 = r4.A
            java.util.Set r4 = r4.entrySet()
            yv3 r4 = (defpackage.yv3) r4
            java.util.Iterator r4 = r4.iterator()
        L80:
            r0 = r4
            xv3 r0 = (defpackage.xv3) r0
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto La3
            r0 = r4
            xv3 r0 = (defpackage.xv3) r0
            zv3 r0 = r0.b()
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r3.v(r1)
            java.lang.Object r0 = r0.getValue()
            ee3 r0 = (defpackage.ee3) r0
            g(r3, r0)
            goto L80
        La3:
            r3.u()
            return
        La7:
            java.lang.String r3 = "Couldn't write "
            java.lang.Class r4 = r4.getClass()
            defpackage.e41.A(r4, r3)
            return
        Lb1:
            r3.A()
            return
    }

    @Override // defpackage.yc7
    public final /* bridge */ /* synthetic */ java.lang.Object b(defpackage.hf3 r1) {
            r0 = this;
            ee3 r0 = d(r1)
            return r0
    }

    @Override // defpackage.yc7
    public final /* bridge */ /* synthetic */ void c(defpackage.vf3 r1, java.lang.Object r2) {
            r0 = this;
            ee3 r2 = (defpackage.ee3) r2
            g(r1, r2)
            return
    }
}
