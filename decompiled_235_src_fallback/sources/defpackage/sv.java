package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sv  reason: default package */
/* loaded from: classes.dex */
public final class sv implements defpackage.ka2 {
    public final /* synthetic */ int a;

    public /* synthetic */ sv(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ka2
    public final defpackage.la2 a(java.lang.Object r4, defpackage.fo4 r5, defpackage.pe5 r6) {
            r3 = this;
            int r3 = r3.a
            r6 = 0
            r0 = 1
            r1 = 2
            r2 = 0
            switch(r3) {
                case 0: goto L53;
                case 1: goto L4b;
                case 2: goto L43;
                case 3: goto L2e;
                case 4: goto L26;
                case 5: goto L1e;
                default: goto L9;
            }
        L9:
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.String r3 = r4.getScheme()
            java.lang.String r6 = "android.resource"
            boolean r3 = defpackage.nb3.k(r3, r6)
            if (r3 != 0) goto L18
            goto L1d
        L18:
            tv r2 = new tv
            r2.<init>(r4, r5, r1)
        L1d:
            return r2
        L1e:
            java.io.File r4 = (java.io.File) r4
            ua2 r3 = new ua2
            r3.<init>(r4)
            return r3
        L26:
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            t40 r3 = new t40
            r3.<init>(r4, r5, r1)
            return r3
        L2e:
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.String r3 = r4.getScheme()
            java.lang.String r6 = "content"
            boolean r3 = defpackage.nb3.k(r3, r6)
            if (r3 != 0) goto L3d
            goto L42
        L3d:
            tv r2 = new tv
            r2.<init>(r4, r5, r0)
        L42:
            return r2
        L43:
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            t40 r3 = new t40
            r3.<init>(r4, r5, r0)
            return r3
        L4b:
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            t40 r3 = new t40
            r3.<init>(r4, r5, r6)
            return r3
        L53:
            android.net.Uri r4 = (android.net.Uri) r4
            boolean r3 = defpackage.k.c(r4)
            if (r3 != 0) goto L5c
            goto L61
        L5c:
            tv r2 = new tv
            r2.<init>(r4, r5, r6)
        L61:
            return r2
    }
}
