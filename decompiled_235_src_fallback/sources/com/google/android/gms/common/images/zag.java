package com.google.android.gms.common.images;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zag {
    final com.google.android.gms.common.images.zad zaa;
    protected int zab;

    public zag(android.net.Uri r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zab = r0
            com.google.android.gms.common.images.zad r0 = new com.google.android.gms.common.images.zad
            r0.<init>(r2)
            r1.zaa = r0
            r1.zab = r3
            return
    }

    public abstract void zaa(android.graphics.drawable.Drawable r1, boolean r2, boolean r3, boolean r4);

    public final void zab(android.content.Context r1, defpackage.zz7 r2, boolean r3) {
            r0 = this;
            int r2 = r0.zab
            if (r2 == 0) goto Ld
            android.content.res.Resources r1 = r1.getResources()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            goto Le
        Ld:
            r1 = 0
        Le:
            r2 = 0
            r0.zaa(r1, r3, r2, r2)
            return
    }

    public final void zac(android.content.Context r1, android.graphics.Bitmap r2, boolean r3) {
            r0 = this;
            com.google.android.gms.common.internal.Asserts.checkNotNull(r2)
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r1.getResources()
            r3.<init>(r1, r2)
            r1 = 0
            r2 = 1
            r0.zaa(r3, r1, r1, r2)
            return
    }
}
