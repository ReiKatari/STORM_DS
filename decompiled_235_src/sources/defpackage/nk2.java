package defpackage;

import android.util.Range;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nk2  reason: default package */
/* loaded from: classes.dex */
public final class nk2 extends qu2 {
    public static final Range d = new Range(30, 30);
    public final int a = 60;
    public final int b = 60;
    public final da2 c = da2.FPS_RANGE;

    @Override // defpackage.qu2
    public final da2 a() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FpsRangeFeature(minFps=");
        sb.append(this.a);
        sb.append(", maxFps=");
        return xg6.q(sb, this.b, ')');
    }
}
