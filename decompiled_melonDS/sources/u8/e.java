package u8;

import android.os.Build;
import p8.v;
import p8.w;
import x8.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: c  reason: collision with root package name */
    public static final String f13507c = v.g("NetworkMeteredCtrlr");

    /* renamed from: b  reason: collision with root package name */
    public final int f13508b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v8.e eVar) {
        super(eVar);
        eVar.getClass();
        this.f13508b = 7;
    }

    @Override // u8.d
    public final boolean c(p pVar) {
        pVar.getClass();
        if (pVar.f14429j.f11471a == w.METERED) {
            return true;
        }
        return false;
    }

    @Override // u8.b
    public final int d() {
        return this.f13508b;
    }

    @Override // u8.b
    public final boolean e(Object obj) {
        t8.e eVar = (t8.e) obj;
        eVar.getClass();
        boolean z10 = eVar.f13142e;
        boolean z11 = eVar.f13138a;
        if (Build.VERSION.SDK_INT < 26) {
            v.e().a(f13507c, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (z11 && !z10) {
                return false;
            }
            return true;
        } else if (z11 && eVar.f13140c && !z10) {
            return false;
        } else {
            return true;
        }
    }
}
