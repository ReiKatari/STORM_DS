package nd;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends n0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10273b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ld.e eVar, int i2) {
        super(eVar);
        this.f10273b = i2;
    }

    @Override // ld.e
    public final String b() {
        switch (this.f10273b) {
            case 0:
                return "kotlin.Array";
            case DSiCameraSource.FrontCamera /* 1 */:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
