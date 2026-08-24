package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gm0  reason: default package */
/* loaded from: classes.dex */
public final class gm0 {
    public static final defpackage.fm0 b = null;
    public final java.lang.Object a;

    static {
            fm0 r0 = new fm0
            r0.<init>()
            defpackage.gm0.b = r0
            return
    }

    public /* synthetic */ gm0(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static final java.lang.Object a(java.lang.Object r1) {
            boolean r0 = r1 instanceof defpackage.fm0
            if (r0 != 0) goto L5
            return r1
        L5:
            r1 = 0
            return r1
    }

    public static final void b(java.lang.Object r1) {
            boolean r0 = r1 instanceof defpackage.fm0
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r1 instanceof defpackage.em0
            if (r0 == 0) goto L16
            em0 r1 = (defpackage.em0) r1
            java.lang.Throwable r1 = r1.a
            if (r1 != 0) goto L15
            java.lang.String r1 = "Trying to call 'getOrThrow' on a channel closed without a cause"
            defpackage.i.m(r1)
            return
        L15:
            throw r1
        L16:
            java.lang.String r1 = "Trying to call 'getOrThrow' on a failed result of a non-closed channel"
            defpackage.i.m(r1)
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.gm0
            if (r0 != 0) goto L5
            goto L11
        L5:
            gm0 r2 = (defpackage.gm0) r2
            java.lang.Object r2 = r2.a
            java.lang.Object r1 = r1.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Object r0 = r0.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.Object r2 = r2.a
            boolean r0 = r2 instanceof defpackage.em0
            if (r0 == 0) goto Ld
            em0 r2 = (defpackage.em0) r2
            java.lang.String r2 = r2.toString()
            return r2
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Value("
            r0.<init>(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
