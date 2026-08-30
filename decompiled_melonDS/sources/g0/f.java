package g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends e0.b {

    /* renamed from: c  reason: collision with root package name */
    public static final e f5009c = e.OFF;

    /* renamed from: a  reason: collision with root package name */
    public final e f5010a;

    /* renamed from: b  reason: collision with root package name */
    public final b f5011b;

    public f(e eVar) {
        eVar.getClass();
        this.f5010a = eVar;
        this.f5011b = b.VIDEO_STABILIZATION;
    }

    @Override // e0.b
    public final b a() {
        return this.f5011b;
    }

    public final String toString() {
        return "VideoStabilizationFeature(mode=" + this.f5010a.name() + ')';
    }
}
