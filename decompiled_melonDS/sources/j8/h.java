package j8;

import bd.v;
import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements z5.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7774a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7775b;

    public /* synthetic */ h(int i2, Object obj) {
        this.f7774a = i2;
        this.f7775b = obj;
    }

    @Override // z5.a
    public final void accept(Object obj) {
        switch (this.f7774a) {
            case 0:
                ((v) this.f7775b).a((i) obj);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((v) this.f7775b).a((i) obj);
                return;
            default:
                d0.k kVar = (d0.k) obj;
                for (Map.Entry entry : ((Map) this.f7775b).entrySet()) {
                    int i2 = kVar.f3409b - ((t0.b) entry.getKey()).f13050f;
                    if (((t0.b) entry.getKey()).f13051g) {
                        i2 = -i2;
                    }
                    int i10 = k0.h.i(i2);
                    r0.l lVar = (r0.l) entry.getValue();
                    lVar.getClass();
                    l0.f.B(new r0.i(lVar, i10, -1));
                }
                return;
        }
    }
}
