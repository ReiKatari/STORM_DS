package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yu0  reason: default package */
/* loaded from: classes.dex */
public final class yu0 {
    public final java.lang.Object a;
    public final defpackage.lj0 b;
    public final defpackage.fo2 c;
    public final java.lang.Object d;
    public final java.lang.Throwable e;

    public yu0(java.lang.Object r1, defpackage.lj0 r2, defpackage.fo2 r3, java.lang.Object r4, java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public /* synthetic */ yu0(java.lang.Object r3, defpackage.lj0 r4, defpackage.fo2 r5, java.lang.Throwable r6, int r7) {
            r2 = this;
            r0 = r7 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r7 = r7 & 16
            if (r7 == 0) goto L11
            r7 = r1
            goto L12
        L11:
            r7 = r6
        L12:
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    public static defpackage.yu0 a(defpackage.yu0 r6, defpackage.lj0 r7, java.lang.Throwable r8, int r9) {
            java.lang.Object r1 = r6.a
            r0 = r9 & 2
            if (r0 == 0) goto L8
            lj0 r7 = r6.b
        L8:
            r2 = r7
            fo2 r3 = r6.c
            java.lang.Object r4 = r6.d
            r7 = r9 & 16
            if (r7 == 0) goto L13
            java.lang.Throwable r8 = r6.e
        L13:
            r5 = r8
            yu0 r0 = new yu0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.yu0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            yu0 r5 = (defpackage.yu0) r5
            java.lang.Object r1 = r4.a
            java.lang.Object r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            lj0 r1 = r4.b
            lj0 r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            fo2 r1 = r4.c
            fo2 r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Object r1 = r4.d
            java.lang.Object r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Throwable r4 = r4.e
            java.lang.Throwable r5 = r5.e
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            lj0 r2 = r3.b
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            fo2 r2 = r3.c
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object r2 = r3.d
            if (r2 != 0) goto L2d
            r2 = r0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Throwable r3 = r3.e
            if (r3 != 0) goto L39
            goto L3d
        L39:
            int r0 = r3.hashCode()
        L3d:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CompletedContinuation(result="
            r0.<init>(r1)
            java.lang.Object r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", cancelHandler="
            r0.append(r1)
            lj0 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            fo2 r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", idempotentResume="
            r0.append(r1)
            java.lang.Object r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", cancelCause="
            r0.append(r1)
            java.lang.Throwable r2 = r2.e
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
