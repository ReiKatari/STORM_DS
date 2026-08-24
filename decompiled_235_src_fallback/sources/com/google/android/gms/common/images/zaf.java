package com.google.android.gms.common.images;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaf extends com.google.android.gms.common.images.zag {
    private final java.lang.ref.WeakReference zac;

    public zaf(com.google.android.gms.common.images.ImageManager.OnImageLoadedListener r2, android.net.Uri r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r3, r0)
            com.google.android.gms.common.internal.Asserts.checkNotNull(r2)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r1.zac = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.common.images.zaf
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.common.images.zaf r5 = (com.google.android.gms.common.images.zaf) r5
            java.lang.ref.WeakReference r1 = r4.zac
            java.lang.Object r1 = r1.get()
            com.google.android.gms.common.images.ImageManager$OnImageLoadedListener r1 = (com.google.android.gms.common.images.ImageManager.OnImageLoadedListener) r1
            java.lang.ref.WeakReference r3 = r5.zac
            java.lang.Object r3 = r3.get()
            com.google.android.gms.common.images.ImageManager$OnImageLoadedListener r3 = (com.google.android.gms.common.images.ImageManager.OnImageLoadedListener) r3
            if (r3 == 0) goto L31
            if (r1 == 0) goto L31
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r3, r1)
            if (r1 == 0) goto L31
            com.google.android.gms.common.images.zad r5 = r5.zaa
            com.google.android.gms.common.images.zad r4 = r4.zaa
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r5, r4)
            if (r4 == 0) goto L31
            return r0
        L31:
            return r2
    }

    public final int hashCode() {
            r0 = this;
            com.google.android.gms.common.images.zad r0 = r0.zaa
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.gms.common.images.zag
    public final void zaa(android.graphics.drawable.Drawable r1, boolean r2, boolean r3, boolean r4) {
            r0 = this;
            if (r3 != 0) goto L13
            java.lang.ref.WeakReference r2 = r0.zac
            java.lang.Object r2 = r2.get()
            com.google.android.gms.common.images.ImageManager$OnImageLoadedListener r2 = (com.google.android.gms.common.images.ImageManager.OnImageLoadedListener) r2
            if (r2 == 0) goto L13
            com.google.android.gms.common.images.zad r0 = r0.zaa
            android.net.Uri r0 = r0.zaa
            r2.onImageLoaded(r0, r1, r4)
        L13:
            return
    }
}
