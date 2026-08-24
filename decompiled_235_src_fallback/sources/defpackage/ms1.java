package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ms1  reason: default package */
/* loaded from: classes.dex */
public abstract class ms1 {
    public static final defpackage.sc7 a = null;
    public static final defpackage.sc7 b = null;
    public static final defpackage.sc7 c = null;

    static {
            sc7 r0 = new sc7
            v71 r1 = defpackage.ir1.a
            r2 = 120(0x78, float:1.68E-43)
            r3 = 2
            r0.<init>(r2, r1, r3)
            defpackage.ms1.a = r0
            sc7 r0 = new sc7
            v71 r1 = new v71
            r4 = 1053609165(0x3ecccccd, float:0.4)
            r5 = 1058642330(0x3f19999a, float:0.6)
            r1.<init>(r4, r5)
            r6 = 150(0x96, float:2.1E-43)
            r0.<init>(r6, r1, r3)
            defpackage.ms1.b = r0
            sc7 r0 = new sc7
            v71 r1 = new v71
            r1.<init>(r4, r5)
            r0.<init>(r2, r1, r3)
            defpackage.ms1.c = r0
            return
    }

    public static final java.lang.Object a(defpackage.gn r7, float r8, defpackage.t93 r9, defpackage.t93 r10, defpackage.s41 r11) {
            r0 = 0
            if (r10 == 0) goto L1c
            boolean r9 = r10 instanceof defpackage.l25
            sc7 r1 = defpackage.ms1.a
            if (r9 == 0) goto Lb
        L9:
            r0 = r1
            goto L1a
        Lb:
            boolean r9 = r10 instanceof defpackage.ao1
            if (r9 == 0) goto L10
            goto L9
        L10:
            boolean r9 = r10 instanceof defpackage.oy2
            if (r9 == 0) goto L15
            goto L9
        L15:
            boolean r9 = r10 instanceof defpackage.sg2
            if (r9 == 0) goto L1a
            goto L9
        L1a:
            r3 = r0
            goto L36
        L1c:
            if (r9 == 0) goto L1a
            boolean r10 = r9 instanceof defpackage.l25
            sc7 r1 = defpackage.ms1.b
            if (r10 == 0) goto L25
        L24:
            goto L9
        L25:
            boolean r10 = r9 instanceof defpackage.ao1
            if (r10 == 0) goto L2a
            goto L24
        L2a:
            boolean r10 = r9 instanceof defpackage.oy2
            if (r10 == 0) goto L31
            sc7 r0 = defpackage.ms1.c
            goto L1a
        L31:
            boolean r9 = r9 instanceof defpackage.sg2
            if (r9 == 0) goto L1a
            goto L24
        L36:
            if (r3 == 0) goto L4b
            om1 r2 = new om1
            r2.<init>(r8)
            r4 = 0
            r6 = 12
            r1 = r7
            r5 = r11
            java.lang.Object r7 = defpackage.gn.c(r1, r2, r3, r4, r5, r6)
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            if (r7 != r8) goto L5b
            return r7
        L4b:
            r1 = r7
            r5 = r11
            om1 r7 = new om1
            r7.<init>(r8)
            java.lang.Object r7 = r1.e(r5, r7)
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            if (r7 != r8) goto L5b
            return r7
        L5b:
            jg7 r7 = defpackage.jg7.a
            return r7
    }
}
