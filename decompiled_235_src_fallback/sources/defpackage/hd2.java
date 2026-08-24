package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hd2  reason: default package */
/* loaded from: classes.dex */
public final class hd2 implements defpackage.tt7 {
    public final int a;

    public hd2(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.tt7
    public final int a(defpackage.qh1 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.tt7
    public final int b(defpackage.qh1 r1, defpackage.kk3 r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.tt7
    public final int c(defpackage.qh1 r1) {
            r0 = this;
            int r0 = r0.a
            return r0
    }

    @Override // defpackage.tt7
    public final int d(defpackage.qh1 r1, defpackage.kk3 r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L10
        L3:
            boolean r0 = r2 instanceof defpackage.hd2
            if (r0 != 0) goto L8
            goto L12
        L8:
            hd2 r2 = (defpackage.hd2) r2
            int r1 = r1.a
            int r2 = r2.a
            if (r1 != r2) goto L12
        L10:
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Insets(left=0, top=0, right=0, bottom="
            r0.<init>(r1)
            int r2 = r2.a
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
