package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b42  reason: default package */
/* loaded from: classes.dex */
public abstract class b42 {
    public static kq2 a(lg7 lg7Var, FoldingFeature foldingFeature) {
        an1 an1Var;
        an1 an1Var2;
        lg7Var.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type == 2) {
                an1Var = an1.g0;
            } else {
                return null;
            }
        } else {
            an1Var = an1.f0;
        }
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state == 2) {
                an1Var2 = an1.e0;
            } else {
                return null;
            }
        } else {
            an1Var2 = an1.d0;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        t40 t40Var = new t40(bounds);
        Rect c = lg7Var.a.c();
        if (t40Var.a() != 0 || t40Var.b() != 0) {
            if (t40Var.b() == c.width() || t40Var.a() == c.height()) {
                if (t40Var.b() >= c.width() || t40Var.a() >= c.height()) {
                    if (t40Var.b() == c.width() && t40Var.a() == c.height()) {
                        return null;
                    }
                    Rect bounds2 = foldingFeature.getBounds();
                    bounds2.getClass();
                    return new kq2(new t40(bounds2), an1Var, an1Var2);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static kg7 b(lg7 lg7Var, WindowLayoutInfo windowLayoutInfo) {
        kq2 kq2Var;
        lg7Var.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                kq2Var = a(lg7Var, foldingFeature);
            } else {
                kq2Var = null;
            }
            if (kq2Var != null) {
                arrayList.add(kq2Var);
            }
        }
        return new kg7(arrayList);
    }

    public static kg7 c(Context context, WindowLayoutInfo windowLayoutInfo) {
        pd1 pd1Var;
        pg7 pg7Var = sn1.v0;
        pg7 pg7Var2 = y40.B;
        pg7 pg7Var3 = qd1.B;
        windowLayoutInfo.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            pd1Var = qd1.A;
        } else {
            pd1Var = sn1.c0;
        }
        l07.n(1, 2, 4, 8, 16, 32, 64, 128);
        if (i >= 30) {
            if (i >= 34) {
                pg7Var = pg7Var3;
            } else if (i >= 30) {
                pg7Var = pg7Var2;
            }
            return b(pg7Var.l(context, pd1Var), windowLayoutInfo);
        } else if (i >= 29 && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (i >= 34) {
                pg7Var = pg7Var3;
            } else if (i >= 30) {
                pg7Var = pg7Var2;
            }
            return b(pg7Var.e(activity, pd1Var), windowLayoutInfo);
        } else {
            vd6.i("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
    }
}
