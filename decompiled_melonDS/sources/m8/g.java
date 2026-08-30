package m8;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f9345b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final h8.i f9346a;

    public g() {
        h8.i iVar = h8.i.QUIET;
        iVar.getClass();
        this.f9346a = iVar;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (nc.k.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return nc.k.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list != list2) {
            if (list.size() == list2.size()) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (a((SidecarDisplayFeature) list.get(i2), (SidecarDisplayFeature) list2.get(i2))) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean e(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        if (sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean f(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        if (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean g(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        if (sidecarDisplayFeature.getType() != 1 || sidecarDisplayFeature.getRect().width() == 0 || sidecarDisplayFeature.getRect().height() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        sidecarDisplayFeature.getClass();
        if (sidecarDisplayFeature.getRect().left != 0 && sidecarDisplayFeature.getRect().top != 0) {
            return false;
        }
        return true;
    }

    public final j8.i c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new j8.i(q.A);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        f.d(sidecarDeviceState2, f.b(sidecarDeviceState));
        return new j8.i(d(f.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j8.c i2 = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (i2 != null) {
                arrayList.add(i2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [mc.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [mc.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [mc.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [mc.l, java.lang.Object] */
    public final j8.c i(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        j8.b bVar;
        j8.b bVar2 = j8.b.f7758h;
        sidecarDisplayFeature.getClass();
        h8.i iVar = this.f9346a;
        iVar.getClass();
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new h8.h(sidecarDisplayFeature, iVar, h8.a.f6319a).H("Type must be either TYPE_FOLD or TYPE_HINGE", new Object()).H("Feature bounds must not be 0", new Object()).H("TYPE_FOLD must have 0 area", new Object()).H("Feature be pinned to either left or top", new Object()).o();
        if (sidecarDisplayFeature2 != null) {
            int type = sidecarDisplayFeature2.getType();
            if (type != 1) {
                if (type == 2) {
                    bVar = j8.b.f7761k;
                } else {
                    return null;
                }
            } else {
                bVar = j8.b.f7760j;
            }
            int b10 = f.b(sidecarDeviceState);
            if (b10 != 0 && b10 != 1) {
                if (b10 != 2) {
                    if (b10 != 3 && b10 == 4) {
                        return null;
                    }
                } else {
                    bVar2 = j8.b.f7759i;
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                return new j8.c(new h8.b(rect), bVar, bVar2);
            }
            return null;
        }
        return null;
    }
}
