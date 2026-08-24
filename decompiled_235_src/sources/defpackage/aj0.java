package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.ArrayMap;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aj0  reason: default package */
/* loaded from: classes.dex */
public final class aj0 implements cj7 {
    public final al1 b;

    public aj0(Context context) {
        context.getClass();
        this.b = al1.g.l(context);
        if ((context instanceof Application) && kj2.H()) {
            Log.i("CXCP", "The provided context (" + context + ") is application scoped and will be used to infer the default display for computing the default preview size, orientation, and default aspect ratio for UseCase outputs.");
        }
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "Created UseCaseConfigurationMap");
        }
    }

    @Override // defpackage.cj7
    public final yy0 a(bj7 bj7Var, int i) {
        int i2;
        int i3;
        int i4;
        Object obj;
        int i5;
        bj7Var.getClass();
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "Creating config for " + bj7Var);
        }
        da4 d = da4.d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        da4 d2 = da4.d();
        ArrayList arrayList = new ArrayList();
        ArrayMap arrayMap = sa4.a().a;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int[] iArr = yi0.a;
        switch (iArr[bj7Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                i2 = 1;
                break;
            case 6:
                if (si1.a().b(PreviewUnderExposureQuirk.class) != null) {
                    i5 = 1;
                } else {
                    i5 = 3;
                }
                i2 = i5;
                break;
            default:
                i.d();
                return null;
        }
        xx xxVar = zi7.G;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        go4 a = go4.a(d2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        sy6 sy6Var = sy6.b;
        ArrayMap arrayMap2 = new ArrayMap();
        for (String str : arrayMap.keySet()) {
            arrayMap2.put(str, arrayMap.get(str));
        }
        d.m(xxVar, new rc6(arrayList5, arrayList6, arrayList7, arrayList8, new ek0(arrayList9, a, i2, arrayList10, new sy6(arrayMap2)), null, null, 0, null));
        HashSet hashSet2 = new HashSet();
        da4 d3 = da4.d();
        ArrayList arrayList11 = new ArrayList();
        ArrayMap arrayMap3 = sa4.a().a;
        switch (iArr[bj7Var.ordinal()]) {
            case 1:
                int i6 = 2;
                if (i == 2) {
                    i6 = 5;
                }
                i3 = i6;
                i4 = i3;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i4 = 1;
                break;
            case 6:
                if (si1.a().b(PreviewUnderExposureQuirk.class) != null) {
                    i3 = 1;
                } else {
                    i3 = 3;
                }
                i4 = i3;
                break;
            default:
                i.d();
                return null;
        }
        xx xxVar2 = zi7.H;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        go4 a2 = go4.a(d3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        sy6 sy6Var2 = sy6.b;
        ArrayMap arrayMap4 = new ArrayMap();
        for (String str2 : arrayMap3.keySet()) {
            arrayMap4.put(str2, arrayMap3.get(str2));
        }
        d.m(xxVar2, new ek0(arrayList12, a2, i4, arrayList13, new sy6(arrayMap4)));
        xx xxVar3 = zi7.J;
        if (bj7Var == bj7.IMAGE_CAPTURE) {
            obj = xi0.b;
        } else {
            obj = vi0.a;
        }
        d.m(xxVar3, obj);
        d.m(zi7.I, wi0.a);
        bj7 bj7Var2 = bj7.PREVIEW;
        al1 al1Var = this.b;
        if (bj7Var == bj7Var2) {
            d.m(n23.u, al1Var.c());
        }
        xx xxVar4 = n23.p;
        q61 q61Var = al1.g;
        d.m(xxVar4, Integer.valueOf(al1Var.b(true).getRotation()));
        return go4.a(d);
    }
}
