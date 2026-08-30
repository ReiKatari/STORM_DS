package l8;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import j8.i;
import j8.j;
import java.util.ArrayList;
import java.util.List;
import m9.o;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g {
    public static j8.c a(j jVar, FoldingFeature foldingFeature) {
        j8.b bVar;
        j8.b bVar2;
        jVar.getClass();
        foldingFeature.getClass();
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type == 2) {
                bVar = j8.b.f7761k;
            } else {
                return null;
            }
        } else {
            bVar = j8.b.f7760j;
        }
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state == 2) {
                bVar2 = j8.b.f7759i;
            } else {
                return null;
            }
        } else {
            bVar2 = j8.b.f7758h;
        }
        Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        h8.b bVar3 = new h8.b(bounds);
        Rect c4 = jVar.f7777a.c();
        if (bVar3.a() != 0 || bVar3.b() != 0) {
            if (bVar3.b() == c4.width() || bVar3.a() == c4.height()) {
                if (bVar3.b() >= c4.width() || bVar3.a() >= c4.height()) {
                    if (bVar3.b() == c4.width() && bVar3.a() == c4.height()) {
                        return null;
                    }
                    Rect bounds2 = foldingFeature.getBounds();
                    bounds2.getClass();
                    return new j8.c(new h8.b(bounds2), bVar, bVar2);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static i b(Context context, WindowLayoutInfo windowLayoutInfo) {
        n8.e eVar;
        n8.g gVar = n8.c.f10104g;
        n8.g gVar2 = n8.d.f10107c;
        n8.g gVar3 = n8.f.f10109c;
        windowLayoutInfo.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            eVar = n8.f.f10108b;
        } else {
            eVar = n8.c.f10103f;
        }
        t.b(1, 2, 4, 8, 16, 32, 64, 128);
        if (i2 >= 30) {
            if (i2 >= 34) {
                gVar = gVar3;
            } else if (i2 >= 30) {
                gVar = gVar2;
            }
            return c(gVar.b(context, eVar), windowLayoutInfo);
        } else if (i2 >= 29 && (context instanceof Activity)) {
            Activity activity = (Activity) context;
            if (i2 >= 34) {
                gVar = gVar3;
            } else if (i2 >= 30) {
                gVar = gVar2;
            }
            return c(gVar.a(activity, eVar), windowLayoutInfo);
        } else {
            o.v("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            return null;
        }
    }

    public static i c(j jVar, WindowLayoutInfo windowLayoutInfo) {
        j8.c cVar;
        jVar.getClass();
        windowLayoutInfo.getClass();
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                cVar = a(jVar, foldingFeature);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        return new i(arrayList);
    }
}
