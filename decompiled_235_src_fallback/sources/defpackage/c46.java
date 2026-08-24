package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c46  reason: default package */
/* loaded from: classes.dex */
public final class c46 {
    public final int a;
    public final boolean b;
    public final java.util.Date c;
    public final android.net.Uri d;
    public final java.lang.String e;

    public c46(int r1, boolean r2, java.util.Date r3, android.net.Uri r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public /* synthetic */ c46(int r7, boolean r8, java.util.Date r9, java.lang.String r10, int r11) {
            r6 = this;
            r11 = r11 & 16
            if (r11 == 0) goto L5
            r10 = 0
        L5:
            r5 = r10
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static defpackage.c46 a(defpackage.c46 r6, android.net.Uri r7) {
            int r1 = r6.a
            boolean r2 = r6.b
            java.util.Date r3 = r6.c
            java.lang.String r5 = r6.e
            c46 r0 = new c46
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3a
        L3:
            boolean r0 = r3 instanceof defpackage.c46
            if (r0 != 0) goto L8
            goto L38
        L8:
            c46 r3 = (defpackage.c46) r3
            int r0 = r2.a
            int r1 = r3.a
            if (r0 == r1) goto L11
            goto L38
        L11:
            boolean r0 = r2.b
            boolean r1 = r3.b
            if (r0 == r1) goto L18
            goto L38
        L18:
            java.util.Date r0 = r2.c
            java.util.Date r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L23
            goto L38
        L23:
            android.net.Uri r0 = r2.d
            android.net.Uri r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2e
            goto L38
        L2e:
            java.lang.String r2 = r2.e
            java.lang.String r3 = r3.e
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L3a
        L38:
            r2 = 0
            return r2
        L3a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r4.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            r2 = 0
            java.util.Date r3 = r4.c
            if (r3 != 0) goto L16
            r3 = r2
            goto L1a
        L16:
            int r3 = r3.hashCode()
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            android.net.Uri r3 = r4.d
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r4 = r4.e
            if (r4 != 0) goto L2d
            goto L31
        L2d:
            int r2 = r4.hashCode()
        L31:
            int r0 = r0 + r2
            int r0 = r0 * r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SaveStateSlot(slot="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", exists="
            r0.append(r1)
            boolean r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", lastUsedDate="
            r0.append(r1)
            java.util.Date r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", screenshot="
            r0.append(r1)
            android.net.Uri r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", customName="
            r0.append(r1)
            java.lang.String r1 = ", bookmarkTag=null)"
            java.lang.String r2 = r2.e
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}
