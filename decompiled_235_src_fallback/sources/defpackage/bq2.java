package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bq2  reason: default package */
/* loaded from: classes.dex */
public final class bq2 implements android.view.PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.rj0 b;
    public final /* synthetic */ android.graphics.Bitmap c;

    public /* synthetic */ bq2(defpackage.rj0 r1, android.graphics.Bitmap r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int r4) {
            r3 = this;
            int r0 = r3.a
            android.graphics.Bitmap r1 = r3.c
            rj0 r3 = r3.b
            r2 = 0
            switch(r0) {
                case 0: goto L24;
                default: goto La;
            }
        La:
            if (r4 != 0) goto L18
            java.lang.Object r4 = r3.u()
            boolean r4 = r4 instanceof defpackage.sg4
            if (r4 == 0) goto L23
            r3.G(r1, r2)
            goto L23
        L18:
            java.lang.Object r4 = r3.u()
            boolean r4 = r4 instanceof defpackage.sg4
            if (r4 == 0) goto L23
            r3.G(r2, r2)
        L23:
            return
        L24:
            if (r4 != 0) goto L32
            java.lang.Object r4 = r3.u()
            boolean r4 = r4 instanceof defpackage.sg4
            if (r4 == 0) goto L3d
            r3.G(r1, r2)
            goto L3d
        L32:
            java.lang.Object r4 = r3.u()
            boolean r4 = r4 instanceof defpackage.sg4
            if (r4 == 0) goto L3d
            r3.G(r2, r2)
        L3d:
            return
    }
}
