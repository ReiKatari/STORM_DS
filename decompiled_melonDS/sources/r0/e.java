package r0;

import a1.w0;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p1.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements z5.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12576a;

    /* renamed from: b  reason: collision with root package name */
    public Object f12577b;

    public /* synthetic */ e(int i2, Object obj) {
        this.f12576a = i2;
        this.f12577b = obj;
    }

    @Override // z5.a
    public final void accept(Object obj) {
        switch (this.f12576a) {
            case 0:
                ((z5.a) this.f12577b).getClass();
                ((z5.a) this.f12577b).accept(obj);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                v5.e eVar = (v5.e) obj;
                if (eVar == null) {
                    eVar = new v5.e(-3);
                }
                ((a0) this.f12577b).A(eVar);
                return;
            default:
                v5.e eVar2 = (v5.e) obj;
                synchronized (v5.f.f13743c) {
                    try {
                        w0 w0Var = v5.f.f13744d;
                        ArrayList arrayList = (ArrayList) w0Var.get((String) this.f12577b);
                        if (arrayList != null) {
                            w0Var.remove((String) this.f12577b);
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                ((z5.a) arrayList.get(i2)).accept(eVar2);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ e() {
        this.f12576a = 0;
    }
}
