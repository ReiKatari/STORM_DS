package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xz  reason: default package */
/* loaded from: classes.dex */
public final class xz {
    public static final java.util.List b = null;
    public final int a;

    static {
            xz r0 = new xz
            r1 = 0
            r0.<init>(r1)
            xz r1 = new xz
            r2 = 1
            r1.<init>(r2)
            xz r2 = new xz
            r3 = 6
            r2.<init>(r3)
            xz r3 = new xz
            r4 = 5
            r3.<init>(r4)
            xz r4 = new xz
            r5 = 2
            r4.<init>(r5)
            xz r5 = new xz
            r6 = 3
            r5.<init>(r6)
            xz r6 = new xz
            r7 = 8
            r6.<init>(r7)
            xz r7 = new xz
            r8 = 7
            r7.<init>(r8)
            xz[] r0 = new defpackage.xz[]{r0, r1, r2, r3, r4, r5, r6, r7}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.xz.b = r0
            return
    }

    public /* synthetic */ xz(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.xz
            if (r0 != 0) goto L5
            goto Ld
        L5:
            xz r2 = (defpackage.xz) r2
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
            java.lang.String r0 = "AwbMode(value="
            r1 = 41
            int r2 = r2.a
            java.lang.String r2 = defpackage.xg6.o(r0, r2, r1)
            return r2
    }
}
