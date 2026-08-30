package i4;

import java.util.Comparator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    public static final g f6715b = new g(0);

    /* renamed from: c  reason: collision with root package name */
    public static final g f6716c = new g(1);

    /* renamed from: d  reason: collision with root package name */
    public static final g f6717d = new g(2);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6718a;

    public /* synthetic */ g(int i2) {
        this.f6718a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6718a) {
            case 0:
                h3.c h2 = ((p) obj).h();
                h3.c h10 = ((p) obj2).h();
                int compare = Float.compare(h2.f6052a, h10.f6052a);
                if (compare == 0) {
                    int compare2 = Float.compare(h2.f6053b, h10.f6053b);
                    if (compare2 == 0) {
                        int compare3 = Float.compare(h2.f6055d, h10.f6055d);
                        if (compare3 == 0) {
                            return Float.compare(h2.f6054c, h10.f6054c);
                        }
                        return compare3;
                    }
                    return compare2;
                }
                return compare;
            case DSiCameraSource.FrontCamera /* 1 */:
                h3.c h11 = ((p) obj).h();
                h3.c h12 = ((p) obj2).h();
                int compare4 = Float.compare(h12.f6054c, h11.f6054c);
                if (compare4 == 0) {
                    int compare5 = Float.compare(h11.f6053b, h12.f6053b);
                    if (compare5 == 0) {
                        int compare6 = Float.compare(h11.f6055d, h12.f6055d);
                        if (compare6 == 0) {
                            return Float.compare(h12.f6052a, h11.f6052a);
                        }
                        return compare6;
                    }
                    return compare5;
                }
                return compare4;
            default:
                yb.j jVar = (yb.j) obj;
                yb.j jVar2 = (yb.j) obj2;
                int compare7 = Float.compare(((h3.c) jVar.A).f6053b, ((h3.c) jVar2.A).f6053b);
                if (compare7 == 0) {
                    return Float.compare(((h3.c) jVar.A).f6055d, ((h3.c) jVar2.A).f6055d);
                }
                return compare7;
        }
    }
}
