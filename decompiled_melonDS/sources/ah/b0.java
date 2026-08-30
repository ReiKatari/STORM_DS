package ah;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f746a;

    public /* synthetic */ b0(int i2) {
        this.f746a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        int i2;
        int i10 = 0;
        switch (this.f746a) {
            case 0:
                return d0.d.M(Integer.valueOf(((zh.b) obj).f15108a.getDisplayOrder()), Integer.valueOf(((zh.b) obj2).f15108a.getDisplayOrder()));
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((c5.g) obj).B - ((c5.g) obj2).B;
            case 2:
                return Integer.compare(((d5.g) obj).f3847a, ((d5.g) obj2).f3847a);
            case 3:
                return d0.d.M(((gj.j) obj).f5693a, ((gj.j) obj2).f5693a);
            case 4:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case l1.c.f8511g /* 5 */:
                return ((j7.j) obj).f7590a - ((j7.j) obj2).f7590a;
            case l1.c.f8509e /* 6 */:
                j7.u uVar = (j7.u) obj;
                j7.u uVar2 = (j7.u) obj2;
                RecyclerView recyclerView = uVar.f7706d;
                if (recyclerView == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (uVar2.f7706d == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 != z11) {
                    if (recyclerView != null) {
                        return -1;
                    }
                } else {
                    boolean z12 = uVar.f7703a;
                    if (z12 != uVar2.f7703a) {
                        if (z12) {
                            return -1;
                        }
                    } else {
                        int i11 = uVar2.f7704b - uVar.f7704b;
                        if (i11 == 0) {
                            int i12 = uVar.f7705c - uVar2.f7705c;
                            if (i12 == 0) {
                                return 0;
                            }
                            return i12;
                        }
                        return i11;
                    }
                }
                return 1;
            case 7:
                return d0.d.M(Long.valueOf(((ji.g) obj).f7910a), Long.valueOf(((ji.g) obj2).f7910a));
            case 8:
                return d0.d.M(Long.valueOf(((ji.g) obj).f7910a), Long.valueOf(((ji.g) obj2).f7910a));
            case l1.c.f8508d /* 9 */:
                WeakHashMap weakHashMap = a6.x0.f533a;
                float f8 = a6.p0.f((View) obj);
                float f10 = a6.p0.f((View) obj2);
                if (f8 > f10) {
                    return -1;
                }
                if (f8 >= f10) {
                    return 0;
                }
                return 1;
            case l1.c.f8510f /* 10 */:
                return d0.d.M(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
            case 11:
                return d0.d.M((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 12:
                return d0.d.M((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 13:
                return d0.d.M(((p7.p) obj).f11428a, ((p7.p) obj2).f11428a);
            case 14:
                return d0.d.M(((p7.r) obj).f11440a, ((p7.r) obj2).f11440a);
            case l1.c.f8512h /* 15 */:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 16:
                zh.a aVar = ((zh.b) obj).f15108a;
                zh.a aVar2 = zh.a.Unlocked;
                if (aVar == aVar2) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                Integer valueOf = Integer.valueOf(i2);
                if (((zh.b) obj2).f15108a != aVar2) {
                    i10 = 1;
                }
                return d0.d.M(valueOf, Integer.valueOf(i10));
            default:
                return d0.d.M(Integer.valueOf(((zf.k) obj).a()), Integer.valueOf(((zf.k) obj2).a()));
        }
    }
}
