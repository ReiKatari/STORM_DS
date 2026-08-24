package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sc3  reason: default package */
/* loaded from: classes.dex */
public final class sc3 extends java.util.concurrent.CancellationException {
    public final transient defpackage.rc3 A;

    public sc3(java.lang.String r1, java.lang.Throwable r2, defpackage.ed3 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.A = r3
            if (r2 == 0) goto La
            r0.initCause(r2)
        La:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L39
            boolean r0 = r3 instanceof defpackage.sc3
            if (r0 == 0) goto L37
            sc3 r3 = (defpackage.sc3) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L37
            rc3 r0 = r3.A
            if (r0 != 0) goto L1c
            kg4 r0 = defpackage.kg4.B
        L1c:
            rc3 r1 = r2.A
            if (r1 != 0) goto L22
            kg4 r1 = defpackage.kg4.B
        L22:
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L37
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r2 = r2.getCause()
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 == 0) goto L37
            goto L39
        L37:
            r2 = 0
            return r2
        L39:
            r2 = 1
            return r2
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.getMessage()
            r0.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            rc3 r1 = r3.A
            if (r1 != 0) goto L13
            kg4 r1 = defpackage.kg4.B
        L13:
            r2 = 0
            if (r1 == 0) goto L1b
            int r1 = r1.hashCode()
            goto L1c
        L1b:
            r1 = r2
        L1c:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Throwable r3 = r3.getCause()
            if (r3 == 0) goto L29
            int r2 = r3.hashCode()
        L29:
            int r0 = r0 + r2
            return r0
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "; job="
            r0.append(r1)
            rc3 r2 = r2.A
            if (r2 != 0) goto L17
            kg4 r2 = defpackage.kg4.B
        L17:
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
