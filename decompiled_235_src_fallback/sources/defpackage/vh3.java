package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vh3  reason: default package */
/* loaded from: classes.dex */
public final class vh3 {
    public static final defpackage.vh3 b = null;
    public final defpackage.qn2 a;

    static {
            vh3 r0 = new vh3
            r1 = 0
            r2 = 63
            r0.<init>(r2, r1)
            defpackage.vh3.b = r0
            return
    }

    public vh3(int r1, defpackage.qn2 r2) {
            r0 = this;
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>()
            r0.a = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.vh3
            if (r1 != 0) goto L9
            goto L12
        L9:
            vh3 r3 = (defpackage.vh3) r3
            qn2 r3 = r3.a
            qn2 r2 = r2.a
            if (r2 != r3) goto L12
            return r0
        L12:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            qn2 r1 = r1.a
            if (r1 == 0) goto L9
            int r1 = r1.hashCode()
            goto La
        L9:
            r1 = 0
        La:
            r0 = 28629151(0x1b4d89f, float:6.6432393E-38)
            int r1 = r1 * r0
            return r1
    }
}
