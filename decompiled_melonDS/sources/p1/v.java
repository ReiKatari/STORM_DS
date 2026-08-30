package p1;

import java.util.Comparator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11266a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c8.c0 f11267b;

    public /* synthetic */ v(c8.c0 c0Var, int i2) {
        this.f11266a = i2;
        this.f11267b = c0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f11266a) {
            case 0:
                Object key = ((g0) obj).getKey();
                c8.c0 c0Var = this.f11267b;
                return d0.d.M(Integer.valueOf(c0Var.e(key)), Integer.valueOf(c0Var.e(((g0) obj2).getKey())));
            case DSiCameraSource.FrontCamera /* 1 */:
                Object key2 = ((g0) obj).getKey();
                c8.c0 c0Var2 = this.f11267b;
                return d0.d.M(Integer.valueOf(c0Var2.e(key2)), Integer.valueOf(c0Var2.e(((g0) obj2).getKey())));
            case 2:
                Object key3 = ((g0) obj2).getKey();
                c8.c0 c0Var3 = this.f11267b;
                return d0.d.M(Integer.valueOf(c0Var3.e(key3)), Integer.valueOf(c0Var3.e(((g0) obj).getKey())));
            default:
                Object key4 = ((g0) obj2).getKey();
                c8.c0 c0Var4 = this.f11267b;
                return d0.d.M(Integer.valueOf(c0Var4.e(key4)), Integer.valueOf(c0Var4.e(((g0) obj).getKey())));
        }
    }
}
