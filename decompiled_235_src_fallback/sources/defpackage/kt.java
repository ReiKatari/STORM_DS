package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt  reason: default package */
/* loaded from: classes.dex */
public final class kt {
    public final defpackage.jt a;
    public final long b;
    public final android.net.Uri c;
    public final defpackage.bm7 d;
    public final java.lang.String e;
    public final long f;
    public final defpackage.s83 g;
    public final java.lang.String h;
    public final java.lang.String i;

    public kt(defpackage.jt r1, long r2, android.net.Uri r4, defpackage.bm7 r5, java.lang.String r6, long r7, defpackage.s83 r9, java.lang.String r10, java.lang.String r11) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r6.getClass()
            r10.getClass()
            r11.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.g = r9
            r0.h = r10
            r0.i = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L67
        L4:
            boolean r0 = r5 instanceof defpackage.kt
            if (r0 != 0) goto L9
            goto L65
        L9:
            kt r5 = (defpackage.kt) r5
            jt r0 = r4.a
            jt r1 = r5.a
            if (r0 == r1) goto L12
            goto L65
        L12:
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1b
            goto L65
        L1b:
            android.net.Uri r0 = r4.c
            android.net.Uri r1 = r5.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L26
            goto L65
        L26:
            bm7 r0 = r4.d
            bm7 r1 = r5.d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L31
            goto L65
        L31:
            java.lang.String r0 = r4.e
            java.lang.String r1 = r5.e
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L3c
            goto L65
        L3c:
            long r0 = r4.f
            long r2 = r5.f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L45
            goto L65
        L45:
            s83 r0 = r4.g
            s83 r1 = r5.g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L50
            goto L65
        L50:
            java.lang.String r0 = r4.h
            java.lang.String r1 = r5.h
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L5b
            goto L65
        L5b:
            java.lang.String r4 = r4.i
            java.lang.String r5 = r5.i
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L67
        L65:
            r4 = 0
            return r4
        L67:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            jt r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            android.net.Uri r2 = r4.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            bm7 r0 = r4.d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.e
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.f
            int r0 = defpackage.i61.c(r2, r0, r1)
            s83 r2 = r4.g
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r4.h
            int r0 = defpackage.xg6.d(r2, r1, r0)
            java.lang.String r4 = r4.i
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AppUpdate(type="
            r0.<init>(r1)
            jt r1 = r4.a
            r0.append(r1)
            java.lang.String r1 = ", id="
            r0.append(r1)
            long r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = ", downloadUri="
            r0.append(r1)
            android.net.Uri r1 = r4.c
            r0.append(r1)
            java.lang.String r1 = ", newVersion="
            r0.append(r1)
            bm7 r1 = r4.d
            r0.append(r1)
            java.lang.String r1 = ", description="
            r0.append(r1)
            java.lang.String r1 = r4.e
            r0.append(r1)
            java.lang.String r1 = ", binarySize="
            r0.append(r1)
            long r1 = r4.f
            r0.append(r1)
            java.lang.String r1 = ", updateDate="
            r0.append(r1)
            s83 r1 = r4.g
            r0.append(r1)
            java.lang.String r1 = ", releaseTag="
            java.lang.String r2 = ", sourceReleaseUrl="
            java.lang.String r3 = r4.h
            java.lang.String r4 = r4.i
            defpackage.i61.B(r0, r1, r3, r2, r4)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
