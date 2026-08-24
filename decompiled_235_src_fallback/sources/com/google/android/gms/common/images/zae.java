package com.google.android.gms.common.images;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zae extends com.google.android.gms.common.images.zag {
    private final java.lang.ref.WeakReference zac;

    public zae(android.widget.ImageView r2, int r3) {
            r1 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            r1.<init>(r0, r3)
            com.google.android.gms.common.internal.Asserts.checkNotNull(r2)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r1.zac = r3
            return
    }

    public zae(android.widget.ImageView r2, android.net.Uri r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r3, r0)
            com.google.android.gms.common.internal.Asserts.checkNotNull(r2)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            r1.zac = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.gms.common.images.zae
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.common.images.zae r4 = (com.google.android.gms.common.images.zae) r4
            java.lang.ref.WeakReference r3 = r3.zac
            java.lang.Object r3 = r3.get()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.ref.WeakReference r4 = r4.zac
            java.lang.Object r4 = r4.get()
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L27
            if (r3 == 0) goto L27
            boolean r3 = com.google.android.gms.common.internal.Objects.equal(r4, r3)
            if (r3 == 0) goto L27
            return r0
        L27:
            return r2
    }

    public final int hashCode() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.images.zag
    public final void zaa(android.graphics.drawable.Drawable r5, boolean r6, boolean r7, boolean r8) {
            r4 = this;
            java.lang.ref.WeakReference r4 = r4.zac
            java.lang.Object r4 = r4.get()
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            if (r4 == 0) goto L6a
            r8 = 1
            r0 = 0
            if (r7 != 0) goto L10
            if (r6 == 0) goto L12
        L10:
            r6 = r0
            goto L13
        L12:
            r6 = r8
        L13:
            if (r6 == 0) goto L52
            android.graphics.drawable.Drawable r7 = r4.getDrawable()
            r1 = 0
            if (r7 == 0) goto L25
            boolean r2 = r7 instanceof defpackage.yz7
            if (r2 == 0) goto L26
            yz7 r7 = (defpackage.yz7) r7
            android.graphics.drawable.Drawable r7 = r7.g0
            goto L26
        L25:
            r7 = r1
        L26:
            yz7 r2 = new yz7
            r2.<init>(r1)
            if (r7 != 0) goto L2f
            vz7 r7 = defpackage.vz7.a
        L2f:
            r2.f0 = r7
            r7.setCallback(r2)
            wz7 r1 = r2.e0
            int r3 = r1.b
            int r7 = r7.getChangingConfigurations()
            r7 = r7 | r3
            r1.b = r7
            if (r5 != 0) goto L43
            vz7 r5 = defpackage.vz7.a
        L43:
            r2.g0 = r5
            r5.setCallback(r2)
            int r7 = r1.b
            int r5 = r5.getChangingConfigurations()
            r5 = r5 | r7
            r1.b = r5
            r5 = r2
        L52:
            r4.setImageDrawable(r5)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            yz7 r5 = (defpackage.yz7) r5
            int r4 = r5.R
            r5.L = r4
            r5.Y = r0
            r4 = 250(0xfa, float:3.5E-43)
            r5.X = r4
            r5.A = r8
            r5.invalidateSelf()
        L6a:
            return
    }
}
