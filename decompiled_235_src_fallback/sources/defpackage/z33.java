package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z33  reason: default package */
/* loaded from: classes.dex */
public final class z33 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final boolean g;
    public final java.lang.String h;
    public final java.lang.String i;

    public z33(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4, java.lang.String r5, java.lang.String r6, boolean r7, java.lang.String r8, java.lang.String r9) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L67
        L4:
            boolean r0 = r3 instanceof defpackage.z33
            if (r0 != 0) goto L9
            goto L65
        L9:
            z33 r3 = (defpackage.z33) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L16
            goto L65
        L16:
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L65
        L21:
            java.lang.String r0 = r2.c
            java.lang.String r1 = r3.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            goto L65
        L2c:
            boolean r0 = r2.d
            boolean r1 = r3.d
            if (r0 == r1) goto L33
            goto L65
        L33:
            java.lang.String r0 = r2.e
            java.lang.String r1 = r3.e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto L65
        L3e:
            java.lang.String r0 = r2.f
            java.lang.String r1 = r3.f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L49
            goto L65
        L49:
            boolean r0 = r2.g
            boolean r1 = r3.g
            if (r0 == r1) goto L50
            goto L65
        L50:
            java.lang.String r0 = r2.h
            java.lang.String r1 = r3.h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5b
            goto L65
        L5b:
            java.lang.String r2 = r2.i
            java.lang.String r3 = r3.i
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L67
        L65:
            r2 = 0
            return r2
        L67:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r2 = r3.d
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r2 = r3.e
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r3.f
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r2 = r3.g
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r2 = r3.h
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r3 = r3.i
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", layoutValue="
            java.lang.String r1 = ", videoFilteringValue="
            java.lang.String r2 = "InGameRomSettingsMenuState(controllerMappingValue="
            java.lang.String r3 = r5.a
            java.lang.String r4 = r5.b
            java.lang.StringBuilder r0 = defpackage.i61.u(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", showRetroArchSettings="
            r0.append(r1)
            boolean r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", retroArchPresetPathValue="
            r0.append(r1)
            java.lang.String r1 = ", retroArchParametersValue="
            java.lang.String r2 = ", hasValidRetroArchShaderRoot="
            java.lang.String r3 = r5.e
            java.lang.String r4 = r5.f
            defpackage.i61.B(r0, r3, r1, r4, r2)
            boolean r1 = r5.g
            r0.append(r1)
            java.lang.String r1 = ", micSourceValue="
            r0.append(r1)
            java.lang.String r1 = r5.h
            r0.append(r1)
            java.lang.String r1 = ", dualScreenPresetValue="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r5 = r5.i
            java.lang.String r5 = defpackage.i61.n(r0, r5, r1)
            return r5
    }
}
