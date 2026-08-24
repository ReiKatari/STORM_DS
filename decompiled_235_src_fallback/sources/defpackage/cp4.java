package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cp4  reason: default package */
/* loaded from: classes.dex */
public final class cp4 {
    public final java.util.ArrayList a;
    public final java.util.LinkedHashMap b;
    public final defpackage.xi c;
    public final java.util.LinkedHashMap d;

    public cp4(java.util.ArrayList r1, java.util.LinkedHashMap r2, defpackage.xi r3, java.util.LinkedHashMap r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof defpackage.cp4
            if (r0 != 0) goto L8
            goto L35
        L8:
            cp4 r3 = (defpackage.cp4) r3
            java.util.ArrayList r0 = r2.a
            java.util.ArrayList r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.util.LinkedHashMap r0 = r2.b
            java.util.LinkedHashMap r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            xi r0 = r2.c
            xi r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.util.LinkedHashMap r2 = r2.d
            java.util.LinkedHashMap r3 = r3.d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.util.ArrayList r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.LinkedHashMap r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            xi r0 = r2.c
            if (r0 != 0) goto L17
            r0 = 0
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.LinkedHashMap r2 = r2.d
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OutputConfigurations(all="
            r0.<init>(r1)
            java.util.ArrayList r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", deferred="
            r0.append(r1)
            java.util.LinkedHashMap r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", postviewOutput="
            r0.append(r1)
            xi r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", outputSurfaceMap="
            r0.append(r1)
            java.util.LinkedHashMap r2 = r2.d
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
