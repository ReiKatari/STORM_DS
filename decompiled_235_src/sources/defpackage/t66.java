package defpackage;

import android.media.projection.MediaProjection;
import me.magnum.melonds.translator.capture.ScreenCaptureService;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t66  reason: default package */
/* loaded from: classes.dex */
public final class t66 extends MediaProjection.Callback {
    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        boolean z = ScreenCaptureService.A;
        x31.q();
    }
}
