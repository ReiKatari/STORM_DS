package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v65  reason: default package */
/* loaded from: classes.dex */
public final class v65 {
    public final boolean a;
    public final java.util.Set b;
    public final java.util.Set c;

    public v65(boolean r1, java.util.HashSet r2, java.util.HashSet r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            if (r2 != 0) goto La
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            goto Lf
        La:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r2)
        Lf:
            r0.b = r1
            if (r3 != 0) goto L16
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            goto L1b
        L16:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r3)
        L1b:
            r0.c = r1
            return
    }

    public final boolean a(java.lang.Class r2, boolean r3) {
            r1 = this;
            java.util.Set r0 = r1.b
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L9
            goto L18
        L9:
            java.util.Set r0 = r1.c
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L12
            goto L1a
        L12:
            boolean r1 = r1.a
            if (r1 == 0) goto L1a
            if (r3 == 0) goto L1a
        L18:
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.v65
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r4 != r5) goto La
            return r0
        La:
            v65 r5 = (defpackage.v65) r5
            boolean r2 = r4.a
            boolean r3 = r5.a
            if (r2 != r3) goto L27
            java.util.Set r2 = r4.b
            java.util.Set r3 = r5.b
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L27
            java.util.Set r4 = r4.c
            java.util.Set r5 = r5.c
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.util.Set r1 = r2.b
            java.util.Set r2 = r2.c
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1, r2}
            int r2 = java.util.Objects.hash(r2)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "QuirkSettings{enabledWhenDeviceHasQuirk="
            r0.<init>(r1)
            boolean r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", forceEnabledQuirks="
            r0.append(r1)
            java.util.Set r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", forceDisabledQuirks="
            r0.append(r1)
            java.util.Set r2 = r2.c
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
