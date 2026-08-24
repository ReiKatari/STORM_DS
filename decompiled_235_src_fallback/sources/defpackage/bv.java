package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv  reason: default package */
/* loaded from: classes.dex */
public final class bv extends defpackage.yc7 {
    public static final defpackage.av c = null;
    public final java.lang.Class a;
    public final defpackage.lc3 b;

    static {
            av r0 = new av
            r0.<init>()
            defpackage.bv.c = r0
            return
    }

    public bv(defpackage.su2 r3, defpackage.yc7 r4, java.lang.Class r5) {
            r2 = this;
            r2.<init>()
            lc3 r0 = new lc3
            r1 = 2
            r0.<init>(r3, r4, r5, r1)
            r2.b = r0
            r2.a = r5
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r4) {
            r3 = this;
            jf3 r0 = r4.n0()
            jf3 r1 = defpackage.jf3.NULL
            if (r0 != r1) goto Ld
            r4.j0()
            r3 = 0
            return r3
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.e()
        L15:
            boolean r1 = r4.F()
            if (r1 == 0) goto L27
            lc3 r1 = r3.b
            yc7 r1 = r1.c
            java.lang.Object r1 = r1.b(r4)
            r0.add(r1)
            goto L15
        L27:
            r4.r()
            int r4 = r0.size()
            java.lang.Class r3 = r3.a
            boolean r1 = r3.isPrimitive()
            if (r1 == 0) goto L48
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)
            r1 = 0
        L3b:
            if (r1 >= r4) goto L47
            java.lang.Object r2 = r0.get(r1)
            java.lang.reflect.Array.set(r3, r1, r2)
            int r1 = r1 + 1
            goto L3b
        L47:
            return r3
        L48:
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object[] r3 = r0.toArray(r3)
            return r3
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r5, java.lang.Object r6) {
            r4 = this;
            if (r6 != 0) goto L6
            r5.A()
            return
        L6:
            r5.h()
            int r0 = java.lang.reflect.Array.getLength(r6)
            r1 = 0
        Le:
            if (r1 >= r0) goto L1c
            java.lang.Object r2 = java.lang.reflect.Array.get(r6, r1)
            lc3 r3 = r4.b
            r3.c(r5, r2)
            int r1 = r1 + 1
            goto Le
        L1c:
            r5.r()
            return
    }
}
