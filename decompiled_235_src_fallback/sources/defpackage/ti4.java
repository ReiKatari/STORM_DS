package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: ti4  reason: default package */
/* loaded from: classes.dex */
public final class ti4 {
    public static final defpackage.si4 Companion = null;
    public static final defpackage.go3[] c = null;
    public final java.util.List a;
    public final int b;

    static {
            si4 r0 = new si4
            r0.<init>()
            defpackage.ti4.Companion = r0
            xr3 r0 = defpackage.xr3.PUBLICATION
            pi3 r1 = new pi3
            r2 = 15
            r1.<init>(r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            r1 = 2
            go3[] r1 = new defpackage.go3[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 0
            r2 = 1
            r1[r2] = r0
            defpackage.ti4.c = r1
            return
    }

    public ti4(int r1, java.util.List r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r2
            r0.b = r1
            return
    }

    public /* synthetic */ ti4(int r2, java.util.List r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = r2 & 1
            if (r0 != 0) goto L9
            yt1 r3 = defpackage.yt1.A
        L9:
            r1.a = r3
            r2 = r2 & 2
            if (r2 != 0) goto L13
            r2 = 0
            r1.b = r2
            return
        L13:
            r1.b = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ti4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ti4 r5 = (defpackage.ti4) r5
            java.util.List r1 = r4.a
            java.util.List r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.util.List r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r1.b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OfflineLedgerFile(records="
            r0.<init>(r1)
            java.util.List r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", expirationPolicyVersion="
            r0.append(r1)
            int r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
