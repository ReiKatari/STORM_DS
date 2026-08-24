package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: il0  reason: default package */
/* loaded from: classes.dex */
public final class il0 {
    public static final defpackage.il0 c = null;
    public final java.util.Set a;
    public final defpackage.q60 b;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            il0 r1 = new il0
            java.util.Set r0 = defpackage.gt0.p1(r0)
            r2 = 0
            r1.<init>(r0, r2)
            defpackage.il0.c = r1
            return
    }

    public il0(java.util.Set r1, defpackage.q60 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.il0
            if (r0 == 0) goto L1c
            il0 r3 = (defpackage.il0) r3
            java.util.Set r0 = r3.a
            java.util.Set r1 = r2.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            q60 r3 = r3.b
            q60 r2 = r2.b
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 + 1517
            int r0 = r0 * 41
            q60 r1 = r1.b
            if (r1 == 0) goto L13
            int r1 = r1.hashCode()
            goto L14
        L13:
            r1 = 0
        L14:
            int r0 = r0 + r1
            return r0
    }
}
