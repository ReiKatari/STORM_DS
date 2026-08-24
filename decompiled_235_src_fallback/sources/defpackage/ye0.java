package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ye0  reason: default package */
/* loaded from: classes.dex */
public interface ye0 {
    static defpackage.jg1 e(defpackage.vf0 r11, defpackage.oa r12, defpackage.qb r13, defpackage.xz r14, java.util.List r15, java.util.List r16, java.util.List r17, int r18) {
            r0 = r18 & 1
            r1 = 0
            if (r0 == 0) goto L7
            r3 = r1
            goto L8
        L7:
            r3 = r12
        L8:
            r12 = r18 & 2
            if (r12 == 0) goto Le
            r4 = r1
            goto Lf
        Le:
            r4 = r13
        Lf:
            r12 = r18 & 4
            if (r12 == 0) goto L15
            r5 = r1
            goto L16
        L15:
            r5 = r14
        L16:
            r12 = r18 & 8
            if (r12 == 0) goto L1c
            r7 = r1
            goto L1d
        L1c:
            r7 = r15
        L1d:
            r12 = r18 & 16
            if (r12 == 0) goto L23
            r8 = r1
            goto L25
        L23:
            r8 = r16
        L25:
            r12 = r18 & 32
            if (r12 == 0) goto L2b
            r9 = r1
            goto L2d
        L2b:
            r9 = r17
        L2d:
            jb4 r12 = r11.A
            boolean r12 = r12.a()
            if (r12 != 0) goto L3f
            t41 r2 = r11.L
            r6 = 0
            r10 = 8
            tu0 r11 = defpackage.t41.a(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        L3f:
            java.lang.String r12 = "Cannot call update3A on "
            java.lang.String r13 = " after close."
            defpackage.e41.g(r11, r13, r12)
            return r1
    }
}
