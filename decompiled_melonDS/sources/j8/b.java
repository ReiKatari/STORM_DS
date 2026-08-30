package j8;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: d  reason: collision with root package name */
    public static final b f7754d = new b("NONE", 0);

    /* renamed from: e  reason: collision with root package name */
    public static final b f7755e = new b("FULL", 0);

    /* renamed from: f  reason: collision with root package name */
    public static final b f7756f = new b("VERTICAL", 1);

    /* renamed from: g  reason: collision with root package name */
    public static final b f7757g = new b("HORIZONTAL", 1);

    /* renamed from: h  reason: collision with root package name */
    public static final b f7758h = new b("FLAT", 2);

    /* renamed from: i  reason: collision with root package name */
    public static final b f7759i = new b("HALF_OPENED", 2);

    /* renamed from: j  reason: collision with root package name */
    public static final b f7760j = new b("FOLD", 3);

    /* renamed from: k  reason: collision with root package name */
    public static final b f7761k = new b("HINGE", 3);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7762b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7763c;

    public b(m mVar, k8.a aVar, na.f fVar) {
        this.f7762b = 4;
        this.f7763c = aVar;
    }

    public String toString() {
        switch (this.f7762b) {
            case 0:
                return (String) this.f7763c;
            case DSiCameraSource.FrontCamera /* 1 */:
                return (String) this.f7763c;
            case 2:
                return (String) this.f7763c;
            case 3:
                return (String) this.f7763c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(String str, int i2) {
        this.f7762b = i2;
        this.f7763c = str;
    }
}
