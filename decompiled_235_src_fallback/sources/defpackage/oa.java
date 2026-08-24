package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oa  reason: default package */
/* loaded from: classes.dex */
public final class oa {
    public static final java.util.List b = null;
    public final int a;

    static {
            oa r0 = new oa
            r1 = 0
            r0.<init>(r1)
            oa r1 = new oa
            r2 = 1
            r1.<init>(r2)
            oa r2 = new oa
            r3 = 2
            r2.<init>(r3)
            oa r3 = new oa
            r4 = 3
            r3.<init>(r4)
            oa r4 = new oa
            r5 = 4
            r4.<init>(r5)
            oa r5 = new oa
            r6 = 5
            r5.<init>(r6)
            oa r6 = new oa
            r7 = 6
            r6.<init>(r7)
            oa[] r0 = new defpackage.oa[]{r0, r1, r2, r3, r4, r5, r6}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.oa.b = r0
            return
    }

    public /* synthetic */ oa(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.oa
            if (r0 != 0) goto L5
            goto Ld
        L5:
            oa r2 = (defpackage.oa) r2
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
            java.lang.String r0 = "AeMode(value="
            r1 = 41
            int r2 = r2.a
            java.lang.String r2 = defpackage.xg6.o(r0, r2, r1)
            return r2
    }
}
