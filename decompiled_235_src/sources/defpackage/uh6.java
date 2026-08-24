package defpackage;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uh6  reason: default package */
/* loaded from: classes.dex */
public final class uh6 {
    public static final /* synthetic */ int b = 0;
    public final vl7 a;

    public uh6() {
        vl7 vl7Var = vl7.QUIET;
        vl7Var.getClass();
        this.a = vl7Var;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (nb3.k(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return nb3.k(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
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

    public final kv7 c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        if (sidecarWindowLayoutInfo == null) {
            return new kv7(yt1.A);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        th6.d(sidecarDeviceState2, th6.b(sidecarDeviceState));
        return new kv7(d(th6.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lw2 i = i((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (i != null) {
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [qn2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [qn2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [qn2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [qn2, java.lang.Object] */
    public final lw2 i(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        gr1 gr1Var;
        gr1 gr1Var2 = gr1.e0;
        sidecarDisplayFeature.getClass();
        vs0 vs0Var = vs0.R;
        vl7 vl7Var = this.a;
        vl7Var.getClass();
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new hk7(sidecarDisplayFeature, vl7Var, vs0Var).U("Type must be either TYPE_FOLD or TYPE_HINGE", new Object()).U("Feature bounds must not be 0", new Object()).U("TYPE_FOLD must have 0 area", new Object()).U("Feature be pinned to either left or top", new Object()).o();
        if (sidecarDisplayFeature2 != null) {
            int type = sidecarDisplayFeature2.getType();
            if (type != 1) {
                if (type == 2) {
                    gr1Var = gr1.h0;
                } else {
                    return null;
                }
            } else {
                gr1Var = gr1.g0;
            }
            int b2 = th6.b(sidecarDeviceState);
            if (b2 != 0 && b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3 && b2 == 4) {
                        return null;
                    }
                } else {
                    gr1Var2 = gr1.f0;
                }
                Rect rect = sidecarDisplayFeature.getRect();
                rect.getClass();
                return new lw2(new w60(rect), gr1Var, gr1Var2);
            }
            return null;
        }
        return null;
    }
}
