package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z62  reason: default package */
/* loaded from: classes.dex */
public final class z62 implements defpackage.zc7, java.lang.Cloneable {
    public static final defpackage.z62 L = null;
    public final java.util.List A;
    public final java.util.List B;

    static {
            z62 r0 = new z62
            r0.<init>()
            defpackage.z62.L = r0
            return
    }

    public z62() {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r1.A = r0
            r1.B = r0
            return
    }

    @Override // defpackage.zc7
    public final defpackage.yc7 a(defpackage.su2 r9, defpackage.ie7 r10) {
            r8 = this;
            java.lang.Class r0 = r10.a
            r1 = 1
            boolean r5 = r8.b(r0, r1)
            r1 = 0
            boolean r4 = r8.b(r0, r1)
            if (r5 != 0) goto L12
            if (r4 != 0) goto L12
            r8 = 0
            return r8
        L12:
            y62 r2 = new y62
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    public final boolean b(java.lang.Class r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L24
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 != 0) goto L24
            uj2 r0 = defpackage.oh5.a
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L24
            boolean r0 = r2.isAnonymousClass()
            if (r0 != 0) goto L22
            boolean r2 = r2.isLocalClass()
            if (r2 == 0) goto L24
        L22:
            r1 = 1
            return r1
        L24:
            if (r3 == 0) goto L29
            java.util.List r1 = r1.A
            goto L2b
        L29:
            java.util.List r1 = r1.B
        L2b:
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L37
            r1 = 0
            return r1
        L37:
            java.lang.ClassCastException r1 = defpackage.i61.j(r1)
            throw r1
    }

    public final java.lang.Object clone() {
            r1 = this;
            java.lang.Object r1 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            z62 r1 = (defpackage.z62) r1     // Catch: java.lang.CloneNotSupportedException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
    }
}
