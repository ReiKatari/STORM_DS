package g0;

import android.util.Range;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends e0.b {

    /* renamed from: d  reason: collision with root package name */
    public static final Range f5003d = new Range(30, 30);

    /* renamed from: a  reason: collision with root package name */
    public final int f5004a = 60;

    /* renamed from: b  reason: collision with root package name */
    public final int f5005b = 60;

    /* renamed from: c  reason: collision with root package name */
    public final b f5006c = b.FPS_RANGE;

    @Override // e0.b
    public final b a() {
        return this.f5006c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FpsRangeFeature(minFps=");
        sb2.append(this.f5004a);
        sb2.append(", maxFps=");
        return w.d.p(sb2, this.f5005b, ')');
    }
}
