package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yk1  reason: default package */
/* loaded from: classes.dex */
public final class yk1 {
    public final android.view.DisplayCutout a;

    public yk1(android.view.DisplayCutout r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final defpackage.e83 a() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            android.view.DisplayCutout r2 = r2.a
            android.graphics.Insets r2 = defpackage.q2.g(r2)
            e83 r2 = defpackage.e83.d(r2)
            return r2
        L11:
            e83 r2 = defpackage.e83.e
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<yk1> r0 = defpackage.yk1.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            yk1 r3 = (defpackage.yk1) r3
            android.view.DisplayCutout r2 = r2.a
            android.view.DisplayCutout r3 = r3.a
            boolean r2 = r2.equals(r3)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            android.view.DisplayCutout r0 = r0.a
            int r0 = defpackage.j2.D(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayCutoutCompat{"
            r0.<init>(r1)
            android.view.DisplayCutout r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
