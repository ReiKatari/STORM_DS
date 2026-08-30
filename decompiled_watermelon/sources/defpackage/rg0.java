package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.ArrayMap;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rg0  reason: default package */
/* loaded from: classes.dex */
public final class rg0 implements e57 {
    public final wg1 b;

    public rg0(Context context) {
        context.getClass();
        this.b = wg1.g.l(context);
        if ((context instanceof Application) && ve2.F()) {
            Log.i("CXCP", "The provided context (" + context + ") is application scoped and will be used to infer the default display for computing the default preview size, orientation, and default aspect ratio for UseCase outputs.");
        }
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "Created UseCaseConfigurationMap");
        }
    }

    @Override // defpackage.e57
    public final cw0 a(d57 d57Var, int i) {
        int i2;
        int i3;
        int i4;
        Object obj;
        int i5;
        d57Var.getClass();
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "Creating config for " + d57Var);
        }
        x14 f = x14.f();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        x14 f2 = x14.f();
        ArrayList arrayList = new ArrayList();
        ArrayMap arrayMap = m24.a().a;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int[] iArr = pg0.a;
        switch (iArr[d57Var.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                i2 = 1;
                break;
            case ig7.b /* 6 */:
                if (oe1.a().b(PreviewUnderExposureQuirk.class) != null) {
                    i5 = 1;
                } else {
                    i5 = 3;
                }
                i2 = i5;
                break;
            default:
                i.c();
                return null;
        }
        uw uwVar = b57.F;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        ef4 b = ef4.b(f2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        im6 im6Var = im6.b;
        ArrayMap arrayMap2 = new ArrayMap();
        for (String str : arrayMap.keySet()) {
            arrayMap2.put(str, arrayMap.get(str));
        }
        f.r(uwVar, new d16(arrayList5, arrayList6, arrayList7, arrayList8, new wh0(arrayList9, b, i2, arrayList10, new im6(arrayMap2)), null, null, 0, null));
        HashSet hashSet2 = new HashSet();
        x14 f3 = x14.f();
        ArrayList arrayList11 = new ArrayList();
        ArrayMap arrayMap3 = m24.a().a;
        switch (iArr[d57Var.ordinal()]) {
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
            case ig7.b /* 6 */:
                if (oe1.a().b(PreviewUnderExposureQuirk.class) != null) {
                    i3 = 1;
                } else {
                    i3 = 3;
                }
                i4 = i3;
                break;
            default:
                i.c();
                return null;
        }
        uw uwVar2 = b57.G;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        ef4 b2 = ef4.b(f3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        im6 im6Var2 = im6.b;
        ArrayMap arrayMap4 = new ArrayMap();
        for (String str2 : arrayMap3.keySet()) {
            arrayMap4.put(str2, arrayMap3.get(str2));
        }
        f.r(uwVar2, new wh0(arrayList12, b2, i4, arrayList13, new im6(arrayMap4)));
        uw uwVar3 = b57.I;
        if (d57Var == d57.IMAGE_CAPTURE) {
            obj = og0.b;
        } else {
            obj = mg0.a;
        }
        f.r(uwVar3, obj);
        f.r(b57.H, ng0.a);
        d57 d57Var2 = d57.PREVIEW;
        wg1 wg1Var = this.b;
        if (d57Var == d57Var2) {
            f.r(jw2.u, wg1Var.c());
        }
        uw uwVar4 = jw2.p;
        k45 k45Var = wg1.g;
        f.r(uwVar4, Integer.valueOf(wg1Var.b(true).getRotation()));
        return ef4.b(f);
    }
}
