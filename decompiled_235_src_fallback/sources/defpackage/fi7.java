package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fi7  reason: default package */
/* loaded from: classes.dex */
public final class fi7 {
    public final defpackage.qn2 a;
    public final defpackage.qt2 b;
    public final defpackage.tc6 c;
    public final defpackage.go3 d;

    public fi7(defpackage.qn2 r1, defpackage.qt2 r2, defpackage.tc6 r3, defpackage.go3 r4) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r5 == 0) goto Lb
            java.lang.Class r1 = r5.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<fi7> r2 = defpackage.fi7.class
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            r5.getClass()
            fi7 r5 = (defpackage.fi7) r5
            tc6 r1 = r4.c
            tc6 r3 = r5.c
            if (r1 == r3) goto L22
            return r2
        L22:
            qt2 r4 = r4.b
            qt2 r5 = r5.b
            if (r4 == r5) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            tc6 r0 = r1.c
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            qt2 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UseCaseCameraConfig(cameraGraphFactory="
            r0.<init>(r1)
            qn2 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", graphStateToCameraStateAdapter="
            r0.append(r1)
            qt2 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", sessionConfigAdapter="
            r0.append(r1)
            tc6 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", sessionProcessor=null, lazyCreationResult="
            r0.append(r1)
            go3 r2 = r2.d
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
