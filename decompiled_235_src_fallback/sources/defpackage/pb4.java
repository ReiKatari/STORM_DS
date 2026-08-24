package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pb4  reason: default package */
/* loaded from: classes.dex */
public final class pb4 {
    public final java.util.Set a;
    public final java.util.Set b;
    public final java.util.Set c;
    public final java.util.Set d;
    public final boolean e;

    public /* synthetic */ pb4() {
            r6 = this;
            du1 r1 = defpackage.du1.A
            r5 = 1
            r2 = r1
            r3 = r1
            r4 = r1
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public pb4(java.util.Set r1, java.util.Set r2, java.util.Set r3, java.util.Set r4, boolean r5) {
            r0 = this;
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
            boolean r0 = r3 instanceof defpackage.pb4
            if (r0 != 0) goto L8
            goto L3c
        L8:
            pb4 r3 = (defpackage.pb4) r3
            java.util.Set r0 = r2.a
            java.util.Set r1 = r3.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            java.util.Set r0 = r2.b
            java.util.Set r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            java.util.Set r0 = r2.c
            java.util.Set r1 = r3.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2b
            goto L3c
        L2b:
            java.util.Set r0 = r2.d
            java.util.Set r1 = r3.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L36
            goto L3c
        L36:
            boolean r2 = r2.e
            boolean r3 = r3.e
            if (r2 == r3) goto L3e
        L3c:
            r2 = 0
            return r2
        L3e:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.util.Set r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Set r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.Set r0 = r2.c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.Set r1 = r2.d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r2 = r2.e
            int r2 = java.lang.Boolean.hashCode(r2)
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NativeRaRetryOutcome(acceptedNativeSubmissionIds="
            r0.<init>(r1)
            java.util.Set r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", alreadyAcceptedNativeSubmissionIds="
            r0.append(r1)
            java.util.Set r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", retryableFailureNativeSubmissionIds="
            r0.append(r1)
            java.util.Set r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", permanentFailureNativeSubmissionIds="
            r0.append(r1)
            java.util.Set r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", transientFailure="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r2.e
            java.lang.String r2 = defpackage.i61.o(r0, r2, r1)
            return r2
    }
}
