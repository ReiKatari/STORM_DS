package defpackage;

import android.content.ClipData;
import android.hardware.camera2.CameraExtensionSession;
import android.view.ContentInfo;
import android.view.ScrollCaptureSession;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sd0  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class sd0 {
    public static /* bridge */ /* synthetic */ CameraExtensionSession f(Object obj) {
        return (CameraExtensionSession) obj;
    }

    public static /* synthetic */ ContentInfo.Builder j(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo l(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession n(Object obj) {
        return (ScrollCaptureSession) obj;
    }
}
