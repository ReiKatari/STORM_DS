package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qb  reason: default package */
/* loaded from: classes.dex */
public final class qb {
    public static final java.util.List b = null;
    public final int a;

    static {
            qb r0 = new qb
            r1 = 0
            r0.<init>(r1)
            qb r1 = new qb
            r2 = 1
            r1.<init>(r2)
            qb r2 = new qb
            r3 = 2
            r2.<init>(r3)
            qb r3 = new qb
            r4 = 3
            r3.<init>(r4)
            qb r4 = new qb
            r5 = 4
            r4.<init>(r5)
            qb r5 = new qb
            r6 = 5
            r5.<init>(r6)
            qb[] r0 = new defpackage.qb[]{r0, r1, r2, r3, r4, r5}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.qb.b = r0
            return
    }

    public /* synthetic */ qb(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.qb
            if (r0 != 0) goto L5
            goto Ld
        L5:
            qb r2 = (defpackage.qb) r2
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
            java.lang.String r0 = "AfMode(value="
            r1 = 41
            int r2 = r2.a
            java.lang.String r2 = defpackage.xg6.o(r0, r2, r1)
            return r2
    }
}
