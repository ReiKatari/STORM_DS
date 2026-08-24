package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: au7  reason: default package */
/* loaded from: classes.dex */
public final class au7 {
    public zt7 a;

    public au7(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new yt7(zm6.i(i, interpolator, j));
        } else {
            this.a = new zt7(i, interpolator, j);
        }
    }
}
