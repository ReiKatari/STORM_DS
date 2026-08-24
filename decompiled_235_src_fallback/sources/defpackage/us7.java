package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: us7  reason: default package */
/* loaded from: classes.dex */
public final class us7 {
    public final boolean a;
    public final java.lang.Integer b;
    public final boolean c;
    public final java.lang.Integer d;
    public final boolean e;
    public final boolean f;

    public us7(boolean r1, java.lang.Integer r2, boolean r3, java.lang.Integer r4, boolean r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.us7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            us7 r5 = (defpackage.us7) r5
            boolean r1 = r4.a
            boolean r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Integer r1 = r4.b
            java.lang.Integer r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.Integer r1 = r4.d
            java.lang.Integer r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L37
            return r2
        L37:
            boolean r4 = r4.f
            boolean r5 = r5.f
            if (r4 == r5) goto L3e
            return r2
        L3e:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            boolean r0 = r4.a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            java.lang.Integer r3 = r4.b
            if (r3 != 0) goto L10
            r3 = r2
            goto L14
        L10:
            int r3 = r3.hashCode()
        L14:
            int r0 = r0 + r3
            int r0 = r0 * r1
            boolean r3 = r4.c
            int r0 = defpackage.xg6.e(r0, r3, r1)
            java.lang.Integer r3 = r4.d
            if (r3 != 0) goto L21
            goto L25
        L21:
            int r2 = r3.hashCode()
        L25:
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r4.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r4 = r4.f
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WebSocketExtensions(perMessageDeflate="
            r0.<init>(r1)
            boolean r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", clientMaxWindowBits="
            r0.append(r1)
            java.lang.Integer r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", clientNoContextTakeover="
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", serverMaxWindowBits="
            r0.append(r1)
            java.lang.Integer r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", serverNoContextTakeover="
            r0.append(r1)
            boolean r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", unknownValues="
            r0.append(r1)
            boolean r2 = r2.f
            r1 = 41
            java.lang.String r2 = defpackage.xg6.r(r0, r2, r1)
            return r2
    }
}
