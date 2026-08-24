package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qc1  reason: default package */
/* loaded from: classes.dex */
public final class qc1 {
    public final android.graphics.drawable.BitmapDrawable a;
    public final boolean b;

    public qc1(android.graphics.drawable.BitmapDrawable r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L19
        L3:
            boolean r0 = r3 instanceof defpackage.qc1
            if (r0 == 0) goto L1b
            qc1 r3 = (defpackage.qc1) r3
            android.graphics.drawable.BitmapDrawable r0 = r3.a
            android.graphics.drawable.BitmapDrawable r1 = r2.a
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1b
            boolean r2 = r2.b
            boolean r3 = r3.b
            if (r2 != r3) goto L1b
        L19:
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            android.graphics.drawable.BitmapDrawable r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r1.b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
