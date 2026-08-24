package defpackage;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.media.ImageWriter;
import android.view.Surface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class od {
    public static /* synthetic */ BlendModeColorFilter c(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* bridge */ /* synthetic */ ImageWriter d(int i, Surface surface) {
        return ImageWriter.newInstance(surface, 1, i);
    }

    public static /* synthetic */ void g() {
    }
}
