package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i47  reason: default package */
/* loaded from: classes.dex */
public final class i47 {
    public static final defpackage.i47 c = null;
    public static final defpackage.i47 d = null;
    public final int a;
    public final boolean b;

    static {
            i47 r0 = new i47
            r1 = 2
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.i47.c = r0
            i47 r0 = new i47
            r1 = 1
            r0.<init>(r1, r1)
            defpackage.i47.d = r0
            return
    }

    public i47(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.i47
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i47 r5 = (defpackage.i47) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 != r1) goto L1a
            boolean r4 = r4.b
            boolean r5 = r5.b
            if (r4 == r5) goto L19
            return r2
        L19:
            return r0
        L1a:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            boolean r1 = r1.b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            i47 r0 = defpackage.i47.c
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r1 = "TextMotion.Static"
            return r1
        Lb:
            i47 r0 = defpackage.i47.d
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L16
            java.lang.String r1 = "TextMotion.Animated"
            return r1
        L16:
            java.lang.String r1 = "Invalid"
            return r1
    }
}
