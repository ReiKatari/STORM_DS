package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y47  reason: default package */
/* loaded from: classes.dex */
public final class y47 {
    public final long a;

    public /* synthetic */ y47(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static final boolean a(long r0, long r2) {
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public static java.lang.String b(long r2) {
            r0 = 0
            boolean r0 = a(r2, r0)
            if (r0 == 0) goto Lb
            java.lang.String r2 = "Unspecified"
            return r2
        Lb:
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r0 = a(r2, r0)
            if (r0 == 0) goto L19
            java.lang.String r2 = "Sp"
            return r2
        L19:
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r2 = a(r2, r0)
            if (r2 == 0) goto L27
            java.lang.String r2 = "Em"
            return r2
        L27:
            java.lang.String r2 = "Invalid"
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.y47
            if (r0 != 0) goto L5
            goto Lf
        L5:
            y47 r3 = (defpackage.y47) r3
            long r0 = r3.a
            long r2 = r2.a
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.a
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            long r0 = r2.a
            java.lang.String r2 = b(r0)
            return r2
    }
}
