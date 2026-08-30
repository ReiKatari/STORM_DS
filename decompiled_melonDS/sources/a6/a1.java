package a6;

import android.view.ViewGroup;
import java.util.Iterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a1 implements uc.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f442a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f443b;

    public /* synthetic */ a1(int i2, Object obj) {
        this.f442a = i2;
        this.f443b = obj;
    }

    @Override // uc.f
    public final Iterator iterator() {
        switch (this.f442a) {
            case 0:
                return new a1.z0(1, (ViewGroup) this.f443b);
            case DSiCameraSource.FrontCamera /* 1 */:
                return (Iterator) this.f443b;
            case 2:
                return new vc.c((String) this.f443b);
            case 3:
                return new a1.z0((Object[]) this.f443b);
            default:
                return ((Iterable) this.f443b).iterator();
        }
    }
}
