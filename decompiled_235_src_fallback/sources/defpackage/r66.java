package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r66  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r66 implements android.media.ImageReader.OnImageAvailableListener {
    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader r2) {
            r1 = this;
            boolean r1 = me.magnum.melonds.translator.capture.ScreenCaptureService.A
            android.media.Image r1 = r2.acquireLatestImage()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1b
            boolean r2 = me.magnum.melonds.translator.capture.ScreenCaptureService.A     // Catch: java.lang.Throwable -> L22
            android.graphics.Bitmap r2 = defpackage.x31.l(r1)     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L1b
            android.graphics.Bitmap r0 = me.magnum.melonds.translator.capture.ScreenCaptureService.d0     // Catch: java.lang.Throwable -> L22
            me.magnum.melonds.translator.capture.ScreenCaptureService.d0 = r2     // Catch: java.lang.Throwable -> L22
            if (r0 == r2) goto L1b
            if (r0 == 0) goto L1b
            r0.recycle()     // Catch: java.lang.Throwable -> L22
        L1b:
            if (r1 == 0) goto L27
            r1.close()
            return
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L27
            r1.close()
        L27:
            return
    }
}
