package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w26  reason: default package */
/* loaded from: classes.dex */
public final class w26 {
    public final defpackage.um6 a;
    public final int b;
    public final boolean c;
    public final defpackage.ck3 d;
    public final defpackage.ff7 e;

    public w26(defpackage.um6 r1, int r2, boolean r3, defpackage.ck3 r4, defpackage.ff7 r5) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L32
        L3:
            boolean r0 = r3 instanceof defpackage.w26
            if (r0 != 0) goto L8
            goto L30
        L8:
            w26 r3 = (defpackage.w26) r3
            um6 r0 = r2.a
            um6 r1 = r3.a
            if (r0 == r1) goto L11
            goto L30
        L11:
            int r0 = r2.b
            int r1 = r3.b
            if (r0 == r1) goto L18
            goto L30
        L18:
            boolean r0 = r2.c
            boolean r1 = r3.c
            if (r0 == r1) goto L1f
            goto L30
        L1f:
            ck3 r0 = r2.d
            ck3 r1 = r3.d
            if (r0 == r1) goto L26
            goto L30
        L26:
            ff7 r2 = r2.e
            ff7 r3 = r3.e
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L32
        L30:
            r2 = 0
            return r2
        L32:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            um6 r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            boolean r2 = r3.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            ck3 r2 = r3.d
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            ff7 r3 = r3.e
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RuntimeInputLayoutConfiguration(softInputBehaviour="
            r0.<init>(r1)
            um6 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", softInputOpacity="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", isHapticFeedbackEnabled="
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", layoutOrientation="
            r0.append(r1)
            ck3 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", layout="
            r0.append(r1)
            ff7 r2 = r2.e
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
