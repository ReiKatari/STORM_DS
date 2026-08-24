package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ds2  reason: default package */
/* loaded from: classes.dex */
public final class ds2 {
    public static final defpackage.ds2 a = null;

    static {
            ds2 r0 = new ds2
            r0.<init>()
            defpackage.ds2.a = r0
            return
    }

    public final defpackage.cs2 a(java.util.List r12, defpackage.bm7 r13, defpackage.fs2 r14, defpackage.bm7 r15) {
            r11 = this;
            r12.getClass()
            r13.getClass()
            r14.getClass()
            ev r0 = new ev
            r1 = 1
            r0.<init>(r12, r1)
            a0 r2 = new a0
            r9 = 0
            r10 = 15
            r3 = 1
            java.lang.Class<ds2> r5 = defpackage.ds2.class
            java.lang.String r6 = "belongsToConfiguredRepository"
            java.lang.String r7 = "belongsToConfiguredRepository(Lme/magnum/melonds/github/dtos/ReleaseDto;)Z"
            r8 = 0
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            pc2 r11 = new pc2
            r11.<init>(r0, r1, r2)
            bz1 r12 = new bz1
            r0 = 20
            r12.<init>(r0)
            pc2 r0 = new pc2
            r2 = 0
            r0.<init>(r11, r2, r12)
            bg2 r11 = new bg2
            r12 = 2
            r11.<init>(r14, r12)
            pc2 r12 = new pc2
            r12.<init>(r0, r1, r11)
            bi2 r11 = new bi2
            r14 = 5
            r11.<init>(r14, r13, r15)
            pc2 r11 = defpackage.sb6.b0(r12, r11)
            oc2 r12 = new oc2
            r12.<init>(r11)
            boolean r11 = r12.hasNext()
            if (r11 != 0) goto L54
            r11 = 0
            goto L7f
        L54:
            java.lang.Object r11 = r12.next()
        L58:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L7f
            java.lang.Object r13 = r12.next()
            r14 = r11
            cs2 r14 = (defpackage.cs2) r14
            bm7 r15 = r14.c
            r0 = r13
            cs2 r0 = (defpackage.cs2) r0
            bm7 r1 = r0.c
            int r15 = defpackage.g04.z(r15, r1)
            if (r15 == 0) goto L73
            goto L7b
        L73:
            s83 r14 = r14.d
            s83 r15 = r0.d
            int r15 = defpackage.g04.z(r14, r15)
        L7b:
            if (r15 >= 0) goto L58
            r11 = r13
            goto L58
        L7f:
            cs2 r11 = (defpackage.cs2) r11
            return r11
    }
}
