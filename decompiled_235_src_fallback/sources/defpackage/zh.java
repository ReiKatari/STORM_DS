package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zh  reason: default package */
/* loaded from: classes.dex */
public final class zh {
    public final android.graphics.Bitmap a;

    public zh(android.graphics.Bitmap r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final int a() {
            r3 = this;
            android.graphics.Bitmap r3 = r3.a
            android.graphics.Bitmap$Config r3 = r3.getConfig()
            r3.getClass()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            if (r3 != r0) goto Lf
            r3 = 1
            return r3
        Lf:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            if (r3 != r0) goto L15
            r3 = 2
            return r3
        L15:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_4444
            if (r3 != r0) goto L1a
            goto L32
        L1a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L28
            android.graphics.Bitmap$Config r2 = defpackage.k2.b()
            if (r3 != r2) goto L28
            r3 = 3
            return r3
        L28:
            if (r0 < r1) goto L32
            android.graphics.Bitmap$Config r0 = defpackage.k2.A()
            if (r3 != r0) goto L32
            r3 = 4
            return r3
        L32:
            r3 = 0
            return r3
    }
}
