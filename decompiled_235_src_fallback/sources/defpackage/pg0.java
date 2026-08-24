package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pg0  reason: default package */
/* loaded from: classes.dex */
public final class pg0 {
    public final android.content.Context a;
    public final defpackage.rg0 b;
    public final defpackage.u63 c;
    public final defpackage.ng0 d;
    public final defpackage.og0 e;
    public final defpackage.qg0 f;

    public pg0(android.content.Context r4, defpackage.rg0 r5, defpackage.og0 r6) {
            r3 = this;
            u63 r0 = new u63
            r1 = 19
            r0.<init>(r1)
            ng0 r1 = new ng0
            r2 = 0
            r1.<init>(r2)
            qg0 r2 = new qg0
            r2.<init>()
            r3.<init>()
            r3.a = r4
            r3.b = r5
            r3.c = r0
            r3.d = r1
            r3.e = r6
            r3.f = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4d
        L3:
            boolean r0 = r3 instanceof defpackage.pg0
            if (r0 != 0) goto L8
            goto L4b
        L8:
            pg0 r3 = (defpackage.pg0) r3
            android.content.Context r0 = r2.a
            android.content.Context r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            rg0 r0 = r2.b
            rg0 r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            u63 r0 = r2.c
            u63 r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            ng0 r0 = r2.d
            ng0 r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            og0 r0 = r2.e
            og0 r1 = r3.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L41
            goto L4b
        L41:
            qg0 r2 = r2.f
            qg0 r3 = r3.f
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L4d
        L4b:
            r2 = 0
            return r2
        L4d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            android.content.Context r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            rg0 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            u63 r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            ng0 r1 = r2.d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            og0 r0 = r2.e
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 961
            qg0 r2 = r2.f
            r2.getClass()
            r2 = 0
            int r2 = java.lang.Boolean.hashCode(r2)
            int r2 = r2 + r0
            int r2 = r2 * 31
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Config(appContext="
            r0.<init>(r1)
            android.content.Context r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", threadConfig="
            r0.append(r1)
            rg0 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", cameraMetadataConfig="
            r0.append(r1)
            u63 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", cameraBackendConfig="
            r0.append(r1)
            ng0 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", cameraInteropConfig="
            r0.append(r1)
            og0 r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", imageSources=null, flags="
            r0.append(r1)
            qg0 r2 = r2.f
            r0.append(r2)
            java.lang.String r2 = ", platformApiCompat=null)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
