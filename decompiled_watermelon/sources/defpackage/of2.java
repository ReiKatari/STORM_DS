package defpackage;

import android.util.Range;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: of2  reason: default package */
/* loaded from: classes.dex */
public final class of2 extends no2 {
    public static final Range d = new Range(30, 30);
    public final int a = 60;
    public final int b = 60;
    public final k52 c = k52.FPS_RANGE;

    @Override // defpackage.no2
    public final k52 a() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FpsRangeFeature(minFps=");
        sb.append(this.a);
        sb.append(", maxFps=");
        return ej6.g(sb, this.b, ')');
    }
}
