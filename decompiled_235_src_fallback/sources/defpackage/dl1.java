package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dl1  reason: default package */
/* loaded from: classes.dex */
public final class dl1 implements defpackage.fj6 {
    public final android.content.Context a;

    public dl1(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.fj6
    public final java.lang.Object e(defpackage.oe5 r1) {
            r0 = this;
            android.content.Context r0 = r0.a
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r0 = r0.heightPixels
            int r0 = java.lang.Math.max(r1, r0)
            pj1 r1 = new pj1
            r1.<init>(r0)
            wi6 r0 = new wi6
            r0.<init>(r1, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.dl1
            if (r1 == 0) goto L15
            dl1 r3 = (defpackage.dl1) r3
            android.content.Context r3 = r3.a
            android.content.Context r2 = r2.a
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L15
            return r0
        L15:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            android.content.Context r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
