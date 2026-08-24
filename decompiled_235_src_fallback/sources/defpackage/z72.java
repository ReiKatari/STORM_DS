package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z72  reason: default package */
/* loaded from: classes.dex */
public final class z72 {
    public static final defpackage.z72 b = null;
    public static final defpackage.z72 c = null;
    public final defpackage.ha7 a;

    static {
            z72 r0 = new z72
            ha7 r1 = new ha7
            r6 = 0
            r7 = 127(0x7f, float:1.78E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            defpackage.z72.b = r0
            z72 r0 = new z72
            ha7 r1 = new ha7
            r7 = 95
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            defpackage.z72.c = r0
            return
    }

    public z72(defpackage.ha7 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final defpackage.z72 a(defpackage.z72 r9) {
            r8 = this;
            z72 r0 = new z72
            ha7 r1 = new ha7
            ha7 r9 = r9.a
            i92 r2 = r9.a
            ha7 r8 = r8.a
            if (r2 != 0) goto Le
            i92 r2 = r8.a
        Le:
            pj6 r3 = r9.b
            if (r3 != 0) goto L14
            pj6 r3 = r8.b
        L14:
            sl0 r4 = r9.c
            if (r4 != 0) goto L1a
            sl0 r4 = r8.c
        L1a:
            z56 r5 = r9.d
            if (r5 != 0) goto L20
            z56 r5 = r8.d
        L20:
            boolean r6 = r9.e
            if (r6 != 0) goto L2b
            boolean r6 = r8.e
            if (r6 == 0) goto L29
            goto L2b
        L29:
            r6 = 0
            goto L2c
        L2b:
            r6 = 1
        L2c:
            java.util.Map r8 = r8.f
            java.util.Map r9 = r9.f
            java.util.LinkedHashMap r7 = defpackage.c14.o0(r8, r9)
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.z72
            if (r0 == 0) goto L12
            z72 r2 = (defpackage.z72) r2
            ha7 r2 = r2.a
            ha7 r1 = r1.a
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            ha7 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            z72 r0 = defpackage.z72.b
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r3 = "ExitTransition.None"
            return r3
        Lb:
            z72 r0 = defpackage.z72.c
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L16
            java.lang.String r3 = "ExitTransition.KeepUntilTransitionsFinished"
            return r3
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExitTransition: \nFade - "
            r0.<init>(r1)
            ha7 r3 = r3.a
            i92 r1 = r3.a
            r2 = 0
            if (r1 == 0) goto L29
            java.lang.String r1 = r1.toString()
            goto L2a
        L29:
            r1 = r2
        L2a:
            r0.append(r1)
            java.lang.String r1 = ",\nSlide - "
            r0.append(r1)
            pj6 r1 = r3.b
            if (r1 == 0) goto L3b
            java.lang.String r1 = r1.toString()
            goto L3c
        L3b:
            r1 = r2
        L3c:
            r0.append(r1)
            java.lang.String r1 = ",\nShrink - "
            r0.append(r1)
            sl0 r1 = r3.c
            if (r1 == 0) goto L4d
            java.lang.String r1 = r1.toString()
            goto L4e
        L4d:
            r1 = r2
        L4e:
            r0.append(r1)
            java.lang.String r1 = ",\nScale - "
            r0.append(r1)
            z56 r1 = r3.d
            if (r1 == 0) goto L5e
            java.lang.String r2 = r1.toString()
        L5e:
            r0.append(r2)
            java.lang.String r1 = ",\nKeepUntilTransitionsFinished - "
            r0.append(r1)
            boolean r3 = r3.e
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
