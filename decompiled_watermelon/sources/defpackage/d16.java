package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d16  reason: default package */
/* loaded from: classes.dex */
public final class d16 {
    public static final List j = Arrays.asList(1, 5, 3);
    public final ArrayList a;
    public final hx b;
    public final List c;
    public final List d;
    public final List e;
    public final z06 f;
    public final wh0 g;
    public final int h;
    public final InputConfiguration i;

    public d16(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, wh0 wh0Var, z06 z06Var, InputConfiguration inputConfiguration, int i, hx hxVar) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = z06Var;
        this.g = wh0Var;
        this.i = inputConfiguration;
        this.h = i;
        this.b = hxVar;
    }

    public static d16 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        x14 f = x14.f();
        ArrayList arrayList5 = new ArrayList();
        m24 a = m24.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        ef4 b = ef4.b(f);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        im6 im6Var = im6.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new d16(arrayList, arrayList2, arrayList3, arrayList4, new wh0(arrayList6, b, -1, arrayList7, new im6(arrayMap)), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            hx hxVar = (hx) obj;
            arrayList.add(hxVar.a);
            for (hc1 hc1Var : hxVar.b) {
                arrayList.add(hc1Var);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
