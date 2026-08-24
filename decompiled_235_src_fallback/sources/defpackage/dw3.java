package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dw3  reason: default package */
/* loaded from: classes.dex */
public final class dw3 extends defpackage.b1 {
    @Override // defpackage.b1
    public final void a(defpackage.m44 r9) {
            r8 = this;
            java.lang.Object r8 = r9.B
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r0 = r9.L
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        Le:
            r4 = 0
            java.lang.Class<m51> r5 = defpackage.m51.class
            if (r3 >= r1) goto L26
            java.lang.Object r6 = r0.get(r3)
            int r3 = r3 + 1
            b1 r6 = (defpackage.b1) r6
            java.lang.Class r7 = r6.getClass()
            boolean r7 = r5.isAssignableFrom(r7)
            if (r7 == 0) goto Le
            goto L27
        L26:
            r6 = r4
        L27:
            if (r6 != 0) goto L55
            int r0 = r8.size()
        L2d:
            if (r2 >= r0) goto L42
            java.lang.Object r1 = r8.get(r2)
            int r2 = r2 + 1
            b1 r1 = (defpackage.b1) r1
            java.lang.Class r3 = r1.getClass()
            boolean r3 = r5.isAssignableFrom(r3)
            if (r3 == 0) goto L2d
            r4 = r1
        L42:
            if (r4 == 0) goto L49
            r9.c(r4)
            r6 = r4
            goto L55
        L49:
            java.lang.String r9 = r5.getName()
            java.lang.String r0 = ", plugins: "
            java.lang.String r1 = "Requested plugin is not added: "
            defpackage.e41.r(r1, r9, r0, r8)
            return
        L55:
            m51 r6 = (defpackage.m51) r6
            cw3 r8 = new cw3
            r8.<init>()
            java.util.ArrayList r9 = r6.a
            r9.add(r8)
            return
    }
}
