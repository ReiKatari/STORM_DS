package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rc6  reason: default package */
/* loaded from: classes.dex */
public final class rc6 {
    public static final List j = Arrays.asList(1, 5, 3);
    public final ArrayList a;
    public final wy b;
    public final List c;
    public final List d;
    public final List e;
    public final nc6 f;
    public final ek0 g;
    public final int h;
    public final InputConfiguration i;

    public rc6(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ek0 ek0Var, nc6 nc6Var, InputConfiguration inputConfiguration, int i, wy wyVar) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = nc6Var;
        this.g = ek0Var;
        this.i = inputConfiguration;
        this.h = i;
        this.b = wyVar;
    }

    public static rc6 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        da4 d = da4.d();
        ArrayList arrayList5 = new ArrayList();
        sa4 a = sa4.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        go4 a2 = go4.a(d);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        sy6 sy6Var = sy6.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new rc6(arrayList, arrayList2, arrayList3, arrayList4, new ek0(arrayList6, a2, -1, arrayList7, new sy6(arrayMap)), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            wy wyVar = (wy) obj;
            arrayList.add(wyVar.a);
            for (ig1 ig1Var : wyVar.b) {
                arrayList.add(ig1Var);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
