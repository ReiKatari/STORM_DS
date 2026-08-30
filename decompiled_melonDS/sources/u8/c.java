package u8;

import android.os.Build;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p8.w;
import x8.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13505b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v8.e eVar, int i2) {
        super(eVar);
        this.f13505b = i2;
        eVar.getClass();
        switch (i2) {
            case 2:
                super(eVar);
                this.f13506c = 7;
                return;
            case 3:
                super(eVar);
                this.f13506c = 7;
                return;
            case 4:
                super(eVar);
                this.f13506c = 9;
                return;
            default:
                this.f13506c = 6;
                return;
        }
    }

    @Override // u8.d
    public final boolean c(p pVar) {
        int i2 = this.f13505b;
        pVar.getClass();
        switch (i2) {
            case 0:
                return pVar.f14429j.f11473c;
            case DSiCameraSource.FrontCamera /* 1 */:
                return pVar.f14429j.f11475e;
            case 2:
                if (pVar.f14429j.f11471a == w.CONNECTED) {
                    return true;
                }
                return false;
            case 3:
                w wVar = pVar.f14429j.f11471a;
                if (wVar != w.UNMETERED && (Build.VERSION.SDK_INT < 30 || wVar != w.TEMPORARILY_UNMETERED)) {
                    return false;
                }
                return true;
            default:
                return pVar.f14429j.f11476f;
        }
    }

    @Override // u8.b
    public final int d() {
        switch (this.f13505b) {
            case 0:
                return this.f13506c;
            case DSiCameraSource.FrontCamera /* 1 */:
                return this.f13506c;
            case 2:
                return this.f13506c;
            case 3:
                return this.f13506c;
            default:
                return this.f13506c;
        }
    }

    @Override // u8.b
    public final boolean e(Object obj) {
        boolean booleanValue;
        switch (this.f13505b) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                t8.e eVar = (t8.e) obj;
                eVar.getClass();
                if (!eVar.f13142e && eVar.f13138a && (Build.VERSION.SDK_INT < 26 || eVar.f13139b)) {
                    return false;
                }
                return true;
            case 3:
                t8.e eVar2 = (t8.e) obj;
                eVar2.getClass();
                if (eVar2.f13138a && !eVar2.f13140c && !eVar2.f13142e) {
                    return false;
                }
                return true;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v8.a aVar) {
        super(aVar);
        this.f13505b = 1;
        aVar.getClass();
        this.f13506c = 5;
    }
}
