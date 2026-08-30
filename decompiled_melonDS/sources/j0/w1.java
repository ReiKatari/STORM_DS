package j0;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: j  reason: collision with root package name */
    public static final List f7315j = Arrays.asList(1, 5, 3);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7316a;

    /* renamed from: b  reason: collision with root package name */
    public final i f7317b;

    /* renamed from: c  reason: collision with root package name */
    public final List f7318c;

    /* renamed from: d  reason: collision with root package name */
    public final List f7319d;

    /* renamed from: e  reason: collision with root package name */
    public final List f7320e;

    /* renamed from: f  reason: collision with root package name */
    public final t1 f7321f;

    /* renamed from: g  reason: collision with root package name */
    public final p0 f7322g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7323h;

    /* renamed from: i  reason: collision with root package name */
    public final InputConfiguration f7324i;

    public w1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, p0 p0Var, t1 t1Var, InputConfiguration inputConfiguration, int i2, i iVar) {
        this.f7316a = arrayList;
        this.f7318c = Collections.unmodifiableList(arrayList2);
        this.f7319d = Collections.unmodifiableList(arrayList3);
        this.f7320e = Collections.unmodifiableList(arrayList4);
        this.f7321f = t1Var;
        this.f7322g = p0Var;
        this.f7324i = inputConfiguration;
        this.f7323h = i2;
        this.f7317b = iVar;
    }

    public static w1 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        g1 b10 = g1.b();
        ArrayList arrayList5 = new ArrayList();
        h1 a10 = h1.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        i1 a11 = i1.a(b10);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        h2 h2Var = h2.f7211b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a10.f7212a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new w1(arrayList, arrayList2, arrayList3, arrayList4, new p0(arrayList6, a11, -1, arrayList7, false, new h2(arrayMap), null), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f7316a;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            i iVar = (i) obj;
            arrayList.add(iVar.f7213a);
            for (u0 u0Var : iVar.f7214b) {
                arrayList.add(u0Var);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
