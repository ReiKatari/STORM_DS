package defpackage;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageReader;
import me.magnum.melonds.translator.capture.ScreenCaptureService;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r66  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class r66 implements ImageReader.OnImageAvailableListener {
    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Image image;
        boolean z = ScreenCaptureService.A;
        try {
            image = imageReader.acquireLatestImage();
            if (image != null) {
                try {
                    boolean z2 = ScreenCaptureService.A;
                    Bitmap l = x31.l(image);
                    if (l != null) {
                        Bitmap bitmap = ScreenCaptureService.d0;
                        ScreenCaptureService.d0 = l;
                        if (bitmap != l && bitmap != null) {
                            bitmap.recycle();
                        }
                    }
                } catch (Throwable unused) {
                    if (image != null) {
                        image.close();
                        return;
                    }
                    return;
                }
            }
            if (image != null) {
                image.close();
            }
        } catch (Throwable unused2) {
            image = null;
        }
    }
}
