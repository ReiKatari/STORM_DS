package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yx  reason: default package */
/* loaded from: classes.dex */
public final class yx extends defpackage.f71 {
    public final android.content.Context a;
    public final defpackage.wr0 b;
    public final defpackage.wr0 c;
    public final java.lang.String d;

    public yx(android.content.Context r2, defpackage.wr0 r3, defpackage.wr0 r4, java.lang.String r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            if (r2 == 0) goto L27
            r1.a = r2
            if (r3 == 0) goto L21
            r1.b = r3
            if (r4 == 0) goto L1b
            r1.c = r4
            if (r5 == 0) goto L15
            r1.d = r5
            return
        L15:
            java.lang.String r1 = "Null backendName"
            defpackage.u34.x(r1)
            throw r0
        L1b:
            java.lang.String r1 = "Null monotonicClock"
            defpackage.u34.x(r1)
            throw r0
        L21:
            java.lang.String r1 = "Null wallClock"
            defpackage.u34.x(r1)
            throw r0
        L27:
            java.lang.String r1 = "Null applicationContext"
            defpackage.u34.x(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.f71
            r2 = 0
            if (r1 == 0) goto L36
            f71 r5 = (defpackage.f71) r5
            yx r5 = (defpackage.yx) r5
            android.content.Context r1 = r5.a
            android.content.Context r3 = r4.a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L36
            wr0 r1 = r4.b
            wr0 r3 = r5.b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L36
            wr0 r1 = r4.c
            wr0 r3 = r5.c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L36
            java.lang.String r4 = r4.d
            java.lang.String r5 = r5.d
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L36
            return r0
        L36:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.content.Context r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            wr0 r2 = r3.b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            wr0 r2 = r3.c
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.lang.String r3 = r3.d
            int r3 = r3.hashCode()
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CreationContext{applicationContext="
            r0.<init>(r1)
            android.content.Context r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", wallClock="
            r0.append(r1)
            wr0 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", monotonicClock="
            r0.append(r1)
            wr0 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", backendName="
            r0.append(r1)
            java.lang.String r2 = r2.d
            java.lang.String r1 = "}"
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}
