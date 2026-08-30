package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melonds.ui.settings.fragments.ComposableSingletons$SoftInputBehaviourPreferencesFragmentKt;
import me.magnum.melonds.ui.settings.fragments.SoftInputBehaviourPreferencesFragmentKt;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qt0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qt0 implements aj2 {
    public final /* synthetic */ int A;

    public /* synthetic */ qt0(int i) {
        this.A = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        ur0 ur0Var;
        int i = this.A;
        Bundle bundle = null;
        boolean z3 = false;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (!sk2Var.O(intValue & 1, z3)) {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (!sk2Var2.O(intValue2 & 1, z3)) {
                    sk2Var2.R();
                }
                return o27Var;
            case 2:
                tu0 tu0Var3 = (tu0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (!sk2Var3.O(intValue3 & 1, z3)) {
                    sk2Var3.R();
                }
                return o27Var;
            case 3:
                tu0 tu0Var4 = (tu0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z3 = true;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (!sk2Var4.O(intValue4 & 1, z3)) {
                    sk2Var4.R();
                }
                return o27Var;
            case 4:
                tu0 tu0Var5 = (tu0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var5 = (sk2) tu0Var5;
                if (sk2Var5.O(intValue5 & 1, z)) {
                    SoftInputBehaviourPreferencesFragmentKt.b(sk2Var5, 0);
                } else {
                    sk2Var5.R();
                }
                return o27Var;
            case 5:
                tu0 tu0Var6 = (tu0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var6 = (sk2) tu0Var6;
                if (sk2Var6.O(intValue6 & 1, z2)) {
                    mj2.b(false, ComposableSingletons$SoftInputBehaviourPreferencesFragmentKt.a, sk2Var6, 48, 1);
                } else {
                    sk2Var6.R();
                }
                return o27Var;
            case ig7.b /* 6 */:
                e31 e31Var = (e31) obj;
                c31 c31Var = (c31) obj2;
                e31Var.getClass();
                c31Var.getClass();
                e31 T = e31Var.T(c31Var.getKey());
                mp1 mp1Var = mp1.A;
                if (T != mp1Var) {
                    k45 k45Var = k45.Y;
                    g31 g31Var = (g31) T.I(k45Var);
                    if (g31Var == null) {
                        ur0Var = new ur0(c31Var, T);
                    } else {
                        e31 T2 = T.T(k45Var);
                        if (T2 == mp1Var) {
                            return new ur0(g31Var, c31Var);
                        }
                        ur0Var = new ur0(g31Var, new ur0(c31Var, T2));
                    }
                    return ur0Var;
                }
                return c31Var;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                c31 c31Var2 = (c31) obj2;
                return bool;
            case 8:
                return ((e31) obj).C((c31) obj2);
            case 9:
                return ((e31) obj).C((c31) obj2);
            case 10:
                it5 it5Var = (it5) obj;
                ya1 ya1Var = (ya1) obj2;
                return l07.c0(Integer.valueOf(ya1Var.k()), Float.valueOf(io2.l(ya1Var.l(), -0.5f, 0.5f)), Integer.valueOf(ya1Var.n()));
            case 11:
                it5 it5Var2 = (it5) obj;
                return (zk1) ((yk1) obj2).a.g.getValue();
            case mj2.L /* 12 */:
                ((Integer) obj2).getClass();
                pu.e((tu0) obj, ep2.I(1));
                return o27Var;
            case 13:
                return Boolean.valueOf(b53.x(obj, obj2));
            case 14:
                ei3 ei3Var = (ei3) obj;
                ((Integer) obj2).intValue();
                return new fo2(ve2.b(1));
            case ig7.e /* 15 */:
                it5 it5Var3 = (it5) obj;
                ki3 ki3Var = (ki3) obj2;
                return l07.c0(Integer.valueOf(ki3Var.g()), Integer.valueOf(ki3Var.d.c.h()));
            case 16:
                it5 it5Var4 = (it5) obj;
                pk3 pk3Var = (pk3) obj2;
                return l07.c0(Integer.valueOf(pk3Var.h()), Integer.valueOf(pk3Var.i()));
            case 17:
                it5 it5Var5 = (it5) obj;
                Map d = ((rk3) obj2).d();
                if (d.isEmpty()) {
                    return null;
                }
                return d;
            case 18:
                it5 it5Var6 = (it5) obj;
                l44 l44Var = (l44) obj2;
                s34 s34Var = l44Var.b;
                LinkedHashMap linkedHashMap = s34Var.m;
                xt xtVar = s34Var.f;
                LinkedHashMap linkedHashMap2 = s34Var.l;
                ArrayList arrayList = new ArrayList();
                Bundle k = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                for (Map.Entry entry : zt3.r0(s34Var.s.a).entrySet()) {
                    String str = (String) entry.getKey();
                    ((k54) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundle = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                    nk2.T(k, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", k);
                }
                if (!xtVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator<E> it = xtVar.iterator();
                    while (it.hasNext()) {
                        l34 l34Var = (l34) it.next();
                        l34Var.getClass();
                        int i2 = l34Var.B.B.a;
                        String str2 = l34Var.Y;
                        qg1 qg1Var = l34Var.c0;
                        Bundle c = qg1Var.c();
                        Bundle k2 = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                        ((yt5) qg1Var.j).c(k2);
                        Bundle k3 = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                        str2.getClass();
                        k3.putString("nav-entry-state:id", str2);
                        k3.putInt("nav-entry-state:destination-id", i2);
                        if (c == null) {
                            c = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                        }
                        k3.putBundle("nav-entry-state:args", c);
                        k3.putBundle("nav-entry-state:saved-state", k2);
                        arrayList2.add(k3);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue7 = ((Number) entry2.getKey()).intValue();
                        String str3 = (String) entry2.getValue();
                        int i4 = i3 + 1;
                        iArr[i3] = intValue7;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList3.add(str3);
                        i3 = i4;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    nk2.T(bundle, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        arrayList4.add(str4);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it2 = ((xt) entry3.getValue()).iterator();
                        while (it2.hasNext()) {
                            oi oiVar = ((n34) it2.next()).a;
                            oiVar.getClass();
                            Bundle k4 = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                            String str5 = (String) oiVar.L;
                            str5.getClass();
                            k4.putString("nav-entry-state:id", str5);
                            k4.putInt("nav-entry-state:destination-id", oiVar.B);
                            Bundle bundle2 = (Bundle) oiVar.R;
                            if (bundle2 == null) {
                                bundle2 = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                            }
                            k4.putBundle("nav-entry-state:args", bundle2);
                            Bundle bundle3 = (Bundle) oiVar.X;
                            bundle3.getClass();
                            k4.putBundle("nav-entry-state:saved-state", bundle3);
                            arrayList5.add(k4);
                        }
                        bundle.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str4, arrayList5);
                    }
                    nk2.T(bundle, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (l44Var.e) {
                    if (bundle == null) {
                        bundle = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", l44Var.e);
                }
                return bundle;
            case 19:
                return Integer.valueOf(((mv3) obj).g0(((Integer) obj2).intValue()));
            case 20:
                return Integer.valueOf(((mv3) obj).e0(((Integer) obj2).intValue()));
            case 21:
                return Integer.valueOf(((mv3) obj).T(((Integer) obj2).intValue()));
            case 22:
                return Integer.valueOf(((mv3) obj).f(((Integer) obj2).intValue()));
            case 23:
                ((Integer) obj2).getClass();
                jk2.d((tu0) obj, ep2.I(1));
                return o27Var;
            case 24:
                ((Integer) obj).intValue();
                RewindSaveState rewindSaveState = (RewindSaveState) obj2;
                rewindSaveState.getClass();
                return Integer.valueOf(rewindSaveState.getFrame());
            case 25:
                ((Integer) obj).getClass();
                kh5 kh5Var = (kh5) obj2;
                kh5Var.getClass();
                return wh1.i(kh5Var.a.d, "rom:");
            case 26:
                ((Integer) obj).getClass();
                lh5 lh5Var = (lh5) obj2;
                lh5Var.getClass();
                if (lh5Var instanceof jh5) {
                    return b31.p("folder:", ((jh5) lh5Var).a);
                }
                if (lh5Var instanceof kh5) {
                    return wh1.i(((kh5) lh5Var).a.d, "rom:");
                }
                i.c();
                return null;
            case 27:
                String str6 = (String) obj2;
                ((String) obj).getClass();
                return o27Var;
            case 28:
                c31 c31Var3 = (c31) obj2;
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            default:
                it5 it5Var7 = (it5) obj;
                kt5 kt5Var = (kt5) obj2;
                Map map = kt5Var.A;
                d24 d24Var = kt5Var.B;
                Object[] objArr = d24Var.b;
                Object[] objArr2 = d24Var.c;
                long[] jArr = d24Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j) < 128) {
                                    int i8 = (i5 << 3) + i7;
                                    Object obj3 = objArr[i8];
                                    Map d2 = ((lt5) objArr2[i8]).d();
                                    if (d2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, d2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                            }
                        }
                        if (i5 != length) {
                            i5++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
        }
    }

    public /* synthetic */ qt0(int i, int i2) {
        this.A = i2;
    }
}
