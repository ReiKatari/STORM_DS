package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g66  reason: default package */
/* loaded from: classes.dex */
public final class g66 {
    public static final /* synthetic */ int b = 0;
    public final w77 a;

    public g66() {
        w77 w77Var = w77.QUIET;
        w77Var.getClass();
        this.a = w77Var;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (b53.x(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return b53.x(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list != list2) {
            if (list.size() == list2.size()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (a((SidecarDisplayFeature) list.get(i), (SidecarDisplayFeature) list2.get(i))) {
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

    public final kg7 c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new kg7(pp1.A);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        f66.d(sidecarDeviceState2, f66.b(sidecarDeviceState));
        return new kg7(d(f66.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kq2 i = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (i != null) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [mi2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [mi2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [mi2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [mi2, java.lang.Object] */
    public final kq2 i(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        an1 an1Var;
        an1 an1Var2 = an1.d0;
        sidecarDisplayFeature.getClass();
        iq0 iq0Var = iq0.R;
        w77 w77Var = this.a;
        w77Var.getClass();
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new k67(sidecarDisplayFeature, w77Var, iq0Var).d0("Type must be either TYPE_FOLD or TYPE_HINGE", new Object()).d0("Feature bounds must not be 0", new Object()).d0("TYPE_FOLD must have 0 area", new Object()).d0("Feature be pinned to either left or top", new Object()).y();
        if (sidecarDisplayFeature2 != null) {
            int type = sidecarDisplayFeature2.getType();
            if (type != 1) {
                if (type == 2) {
                    an1Var = an1.g0;
                } else {
                    return null;
                }
            } else {
                an1Var = an1.f0;
            }
            int b2 = f66.b(sidecarDeviceState);
            if (b2 != 0 && b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3 && b2 == 4) {
                        return null;
                    }
                } else {
                    an1Var2 = an1.e0;
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                return new kq2(new t40(rect), an1Var, an1Var2);
            }
            return null;
        }
        return null;
    }
}
