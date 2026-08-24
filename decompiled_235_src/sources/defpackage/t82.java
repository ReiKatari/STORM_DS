package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t82  reason: default package */
/* loaded from: classes.dex */
public abstract class t82 {
    public static lw2 a(lv7 lv7Var, FoldingFeature foldingFeature) {
        gr1 gr1Var;
        gr1 gr1Var2;
        lv7Var.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type == 2) {
                gr1Var = gr1.h0;
            } else {
                return null;
            }
        } else {
            gr1Var = gr1.g0;
        }
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state == 2) {
                gr1Var2 = gr1.f0;
            } else {
                return null;
            }
        } else {
            gr1Var2 = gr1.e0;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        w60 w60Var = new w60(bounds);
        Rect c = lv7Var.a.c();
        if (w60Var.a() != 0 || w60Var.b() != 0) {
            if (w60Var.b() == c.width() || w60Var.a() == c.height()) {
                if (w60Var.b() >= c.width() || w60Var.a() >= c.height()) {
                    if (w60Var.b() == c.width() && w60Var.a() == c.height()) {
                        return null;
                    }
                    Rect bounds2 = foldingFeature.getBounds();
                    bounds2.getClass();
                    return new lw2(new w60(bounds2), gr1Var, gr1Var2);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static kv7 b(lv7 lv7Var, WindowLayoutInfo windowLayoutInfo) {
        lw2 lw2Var;
        lv7Var.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                lw2Var = a(lv7Var, foldingFeature);
            } else {
                lw2Var = null;
            }
            if (lw2Var != null) {
                arrayList.add(lw2Var);
            }
        }
        return new kv7(arrayList);
    }

    public static kv7 c(Context context, WindowLayoutInfo windowLayoutInfo) {
        rh1 rh1Var;
        pv7 pv7Var = d90.H0;
        pv7 pv7Var2 = b70.B;
        pv7 pv7Var3 = sh1.B;
        windowLayoutInfo.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            rh1Var = sh1.A;
        } else {
            rh1Var = xd5.d0;
        }
        hf.w(1, 2, 4, 8, 16, 32, 64, 128);
        if (i >= 30) {
            if (i >= 34) {
                pv7Var = pv7Var3;
            } else if (i >= 30) {
                pv7Var = pv7Var2;
            }
            return b(pv7Var.e(context, rh1Var), windowLayoutInfo);
        } else if (i >= 29 && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (i >= 34) {
                pv7Var = pv7Var3;
            } else if (i >= 30) {
                pv7Var = pv7Var2;
            }
            return b(pv7Var.c(activity, rh1Var), windowLayoutInfo);
        } else {
            fa6.h("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
    }
}
