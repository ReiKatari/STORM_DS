package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pd2  reason: default package */
/* loaded from: classes.dex */
public final class pd2 {
    public static final java.util.List b = null;
    public final int a;

    static {
            pd2 r0 = new pd2
            r1 = 0
            r0.<init>(r1)
            pd2 r1 = new pd2
            r2 = 1
            r1.<init>(r2)
            pd2 r2 = new pd2
            r3 = 2
            r2.<init>(r3)
            pd2[] r0 = new defpackage.pd2[]{r0, r1, r2}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.pd2.b = r0
            return
    }

    public /* synthetic */ pd2(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.pd2
            if (r0 != 0) goto L5
            goto Ld
        L5:
            pd2 r2 = (defpackage.pd2) r2
            int r2 = r2.a
            int r1 = r1.a
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "FlashMode(value="
            r1 = 41
            int r2 = r2.a
            java.lang.String r2 = defpackage.xg6.o(r0, r2, r1)
            return r2
    }
}
