package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ig3  reason: default package */
/* loaded from: classes.dex */
public final class ig3 implements defpackage.hg3 {
    public final defpackage.hg3 a;

    public ig3(defpackage.hg3 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.hg3
    public final boolean a() {
            r0 = this;
            hg3 r0 = r0.a
            boolean r0 = r0.a()
            return r0
    }

    @Override // defpackage.hg3
    public final java.util.List b() {
            r0 = this;
            hg3 r0 = r0.a
            java.util.List r0 = r0.b()
            return r0
    }

    @Override // defpackage.hg3
    public final defpackage.ar0 c() {
            r0 = this;
            hg3 r0 = r0.a
            ar0 r0 = r0.c()
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L48
        L3:
            boolean r0 = r3 instanceof defpackage.ig3
            r1 = 0
            if (r0 == 0) goto Lc
            r0 = r3
            ig3 r0 = (defpackage.ig3) r0
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L12
            hg3 r0 = r0.a
            goto L13
        L12:
            r0 = r1
        L13:
            hg3 r2 = r2.a
            boolean r0 = defpackage.nb3.k(r2, r0)
            if (r0 != 0) goto L1c
            goto L48
        L1c:
            ar0 r2 = r2.c()
            boolean r0 = r2 instanceof defpackage.ar0
            if (r0 == 0) goto L48
            boolean r0 = r3 instanceof defpackage.hg3
            if (r0 == 0) goto L2b
            hg3 r3 = (defpackage.hg3) r3
            goto L2c
        L2b:
            r3 = r1
        L2c:
            if (r3 == 0) goto L32
            ar0 r1 = r3.c()
        L32:
            if (r1 == 0) goto L48
            boolean r3 = r1 instanceof defpackage.ar0
            if (r3 != 0) goto L39
            goto L48
        L39:
            java.lang.Class r2 = r2.a
            r2.getClass()
            java.lang.Class r3 = r1.a
            r3.getClass()
            boolean r2 = r2.equals(r3)
            return r2
        L48:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            hg3 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "KTypeWrapper: "
            r0.<init>(r1)
            hg3 r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
