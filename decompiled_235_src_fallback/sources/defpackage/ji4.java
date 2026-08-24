package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ji4  reason: default package */
/* loaded from: classes.dex */
public final class ji4 {
    public final java.lang.String a;
    public final java.util.List b;
    public final defpackage.ki4 c;
    public final java.lang.String d;
    public final java.lang.String e;

    public ji4(java.lang.String r1, java.util.List r2, defpackage.ki4 r3, java.lang.String r4, java.lang.String r5) {
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

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3e
        L3:
            boolean r0 = r3 instanceof defpackage.ji4
            if (r0 != 0) goto L8
            goto L3c
        L8:
            ji4 r3 = (defpackage.ji4) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            java.util.List r0 = r2.b
            java.util.List r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            ki4 r0 = r2.c
            ki4 r1 = r3.c
            if (r0 == r1) goto L27
            goto L3c
        L27:
            java.lang.String r0 = r2.d
            java.lang.String r1 = r3.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L3c
        L32:
            java.lang.String r2 = r2.e
            java.lang.String r3 = r3.e
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3e
        L3c:
            r2 = 0
            return r2
        L3e:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.b
            int r0 = defpackage.i61.b(r0, r2, r1)
            ki4 r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.d
            int r0 = defpackage.xg6.d(r2, r1, r0)
            java.lang.String r3 = r3.e
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CharacterEntity(name="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", aliases="
            r0.append(r1)
            java.util.List r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", gender="
            r0.append(r1)
            ki4 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", role="
            r0.append(r1)
            java.lang.String r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", defaultPersona="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.e
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}
