package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ep3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ep3 implements eo2 {
    public final /* synthetic */ int A;

    public /* synthetic */ ep3(int i) {
        this.A = 8;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Bundle bundle = null;
        switch (i) {
            case 0:
                n46 n46Var = (n46) obj;
                ip3 ip3Var = (ip3) obj2;
                return hf.c0(Integer.valueOf(ip3Var.g()), Integer.valueOf(ip3Var.d.c.h()));
            case 1:
                n46 n46Var2 = (n46) obj;
                pr3 pr3Var = (pr3) obj2;
                return hf.c0(Integer.valueOf(pr3Var.h()), Integer.valueOf(pr3Var.i()));
            case 2:
                n46 n46Var3 = (n46) obj;
                Map d = ((rr3) obj2).d();
                if (d.isEmpty()) {
                    return null;
                }
                return d;
            case 3:
                n46 n46Var4 = (n46) obj;
                rc4 rc4Var = (rc4) obj2;
                zb4 zb4Var = rc4Var.b;
                LinkedHashMap linkedHashMap = zb4Var.m;
                pu puVar = zb4Var.f;
                LinkedHashMap linkedHashMap2 = zb4Var.l;
                ArrayList arrayList = new ArrayList();
                Bundle l = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                for (Map.Entry entry : c14.s0(zb4Var.s.a).entrySet()) {
                    String str = (String) entry.getKey();
                    ((qd4) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundle = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                    bl2.N(l, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", l);
                }
                if (!puVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator<E> it = puVar.iterator();
                    while (it.hasNext()) {
                        sb4 sb4Var = (sb4) it.next();
                        sb4Var.getClass();
                        int i2 = sb4Var.B.B.a;
                        String str2 = sb4Var.Y;
                        uk1 uk1Var = sb4Var.d0;
                        Bundle c = uk1Var.c();
                        Bundle l2 = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                        ((e56) uk1Var.j).c(l2);
                        Bundle l3 = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                        str2.getClass();
                        l3.putString("nav-entry-state:id", str2);
                        l3.putInt("nav-entry-state:destination-id", i2);
                        if (c == null) {
                            c = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                        }
                        l3.putBundle("nav-entry-state:args", c);
                        l3.putBundle("nav-entry-state:saved-state", l2);
                        arrayList2.add(l3);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue = ((Number) entry2.getKey()).intValue();
                        String str3 = (String) entry2.getValue();
                        int i4 = i3 + 1;
                        iArr[i3] = intValue;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList3.add(str3);
                        i3 = i4;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    bl2.N(bundle, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        arrayList4.add(str4);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it2 = ((pu) entry3.getValue()).iterator();
                        while (it2.hasNext()) {
                            aj ajVar = ((ub4) it2.next()).a;
                            ajVar.getClass();
                            Bundle l4 = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                            String str5 = (String) ajVar.L;
                            str5.getClass();
                            l4.putString("nav-entry-state:id", str5);
                            l4.putInt("nav-entry-state:destination-id", ajVar.B);
                            Bundle bundle2 = (Bundle) ajVar.R;
                            if (bundle2 == null) {
                                bundle2 = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                            }
                            l4.putBundle("nav-entry-state:args", bundle2);
                            Bundle bundle3 = (Bundle) ajVar.X;
                            bundle3.getClass();
                            l4.putBundle("nav-entry-state:saved-state", bundle3);
                            arrayList5.add(l4);
                        }
                        bundle.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str4, arrayList5);
                    }
                    bl2.N(bundle, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (rc4Var.e) {
                    if (bundle == null) {
                        bundle = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", rc4Var.e);
                }
                return bundle;
            case 4:
                return Integer.valueOf(((x24) obj).V(((Integer) obj2).intValue()));
            case 5:
                return Integer.valueOf(((x24) obj).u(((Integer) obj2).intValue()));
            case 6:
                return Integer.valueOf(((x24) obj).n(((Integer) obj2).intValue()));
            case 7:
                return Integer.valueOf(((x24) obj).c(((Integer) obj2).intValue()));
            case 8:
                ((Integer) obj2).getClass();
                qo2.d((px0) obj, ii2.a0(1));
                return jg7Var;
            case 9:
                ((Integer) obj).intValue();
                RewindSaveState rewindSaveState = (RewindSaveState) obj2;
                rewindSaveState.getClass();
                return Integer.valueOf(rewindSaveState.getFrame());
            case 10:
                ((Integer) obj).getClass();
                mr5 mr5Var = (mr5) obj2;
                mr5Var.getClass();
                return xg6.n(mr5Var.a.d, "rom:");
            case 11:
                ((Integer) obj).getClass();
                nr5 nr5Var = (nr5) obj2;
                nr5Var.getClass();
                if (nr5Var instanceof lr5) {
                    return i61.m("folder:", ((lr5) nr5Var).a);
                }
                if (nr5Var instanceof mr5) {
                    return xg6.n(((mr5) nr5Var).a.d, "rom:");
                }
                i.d();
                return null;
            case 12:
                String str6 = (String) obj2;
                ((String) obj).getClass();
                return jg7Var;
            case 13:
                j61 j61Var = (j61) obj2;
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 14:
                n46 n46Var5 = (n46) obj;
                p46 p46Var = (p46) obj2;
                Map map = p46Var.A;
                ja4 ja4Var = p46Var.B;
                Object[] objArr = ja4Var.b;
                Object[] objArr2 = ja4Var.c;
                long[] jArr = ja4Var.a;
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
                                    Map d2 = ((q46) objArr2[i8]).d();
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
            case 15:
                n46 n46Var6 = (n46) obj;
                return obj2;
            case 16:
                fp fpVar = (fp) obj2;
                return hf.w(fpVar.B, p56.a(fpVar.A, p56.b, (n46) obj));
            case 17:
                n46 n46Var7 = (n46) obj;
                return Integer.valueOf(((b17) obj2).a);
            case 18:
                n46 n46Var8 = (n46) obj;
                f37 f37Var = (f37) obj2;
                return hf.w(Float.valueOf(f37Var.a), Float.valueOf(f37Var.b));
            case 19:
                n46 n46Var9 = (n46) obj;
                g37 g37Var = (g37) obj2;
                x47 x47Var = new x47(g37Var.a);
                n56 n56Var = p56.x;
                return hf.w(p56.a(x47Var, n56Var, n46Var9), p56.a(new x47(g37Var.b), n56Var, n46Var9));
            case 20:
                n46 n46Var10 = (n46) obj;
                return Integer.valueOf(((oj2) obj2).A);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                ov3 ov3Var = (ov3) obj2;
                return hf.w(ov3Var.a, p56.a(ov3Var.b, p56.j, (n46) obj));
            case 22:
                n46 n46Var11 = (n46) obj;
                return Float.valueOf(((x20) obj2).a);
            case ConnectionResult.API_DISABLED /* 23 */:
                n46 n46Var12 = (n46) obj;
                List list = (List) obj2;
                ArrayList arrayList6 = new ArrayList(list.size());
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    arrayList6.add(p56.a((ep) list.get(i9), p56.c, n46Var12));
                }
                return arrayList6;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                n46 n46Var13 = (n46) obj;
                k47 k47Var = (k47) obj2;
                return hf.w(Integer.valueOf((int) (k47Var.a >> 32)), Integer.valueOf((int) (k47Var.a & 4294967295L)));
            case 25:
                n46 n46Var14 = (n46) obj;
                ge6 ge6Var = (ge6) obj2;
                return hf.w(p56.a(new kt0(ge6Var.a), p56.r, n46Var14), p56.a(new jk4(ge6Var.b), p56.z, n46Var14), Float.valueOf(ge6Var.c));
            case SubAllocator.N4 /* 26 */:
                n46 n46Var15 = (n46) obj;
                return Integer.valueOf(((wz6) obj2).a);
            case 27:
                n46 n46Var16 = (n46) obj;
                return Integer.valueOf(((e17) obj2).a);
            case 28:
                n46 n46Var17 = (n46) obj;
                return Integer.valueOf(((q03) obj2).a);
            default:
                n46 n46Var18 = (n46) obj;
                return Integer.valueOf(((ij2) obj2).a);
        }
    }

    public /* synthetic */ ep3(int i, byte b) {
        this.A = i;
    }
}
