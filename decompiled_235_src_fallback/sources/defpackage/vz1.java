package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vz1  reason: default package */
/* loaded from: classes.dex */
public final class vz1 {
    public final defpackage.fk3 a;
    public final defpackage.vr4 b;
    public final defpackage.um6 c;
    public final boolean d;
    public final int e;

    public vz1(defpackage.fk3 r1, defpackage.vr4 r2, defpackage.um6 r3, boolean r4, int r5) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.vz1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            vz1 r5 = (defpackage.vz1) r5
            fk3 r1 = r4.a
            fk3 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            vr4 r1 = r4.b
            vr4 r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            um6 r1 = r4.c
            um6 r3 = r5.c
            if (r1 == r3) goto L29
            return r2
        L29:
            boolean r1 = r4.d
            boolean r3 = r5.d
            if (r1 == r3) goto L30
            return r2
        L30:
            int r4 = r4.e
            int r5 = r5.e
            if (r4 == r5) goto L37
            return r2
        L37:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            fk3 r1 = r4.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            vr4 r3 = r4.b
            if (r3 != 0) goto L13
            goto L17
        L13:
            int r0 = r3.hashCode()
        L17:
            int r1 = r1 + r0
            int r1 = r1 * r2
            um6 r0 = r4.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * r2
            boolean r1 = r4.d
            int r0 = defpackage.xg6.e(r0, r1, r2)
            int r4 = r4.e
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RuntimeLayoutConfiguration(layoutConfiguration="
            r0.<init>(r1)
            fk3 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", layoutVariant="
            r0.append(r1)
            vr4 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", softInputBehaviour="
            r0.append(r1)
            um6 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", isHapticFeedbackEnabled="
            r0.append(r1)
            boolean r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", inputOpacity="
            r0.append(r1)
            java.lang.String r1 = ")"
            int r2 = r2.e
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }
}
