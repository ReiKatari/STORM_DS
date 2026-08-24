package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jr6  reason: default package */
/* loaded from: classes.dex */
public final class jr6 implements AutoCloseable {
    public static final uw e0 = g04.t(0);
    public static final uw f0 = g04.t(0);
    public static final uw g0 = g04.t(0);
    public static final uw h0 = g04.t(0);
    public static final uw i0 = g04.t(0);
    public static final List j0 = hf.c0(vs0.n0, vs0.o0);
    public static final tp5 k0 = new tp5(10);
    public static final List l0 = hf.c0(new fr6(0), new fr6(34));
    public static final tp5 m0 = new tp5(11);
    public final kf0 A;
    public final LinkedHashMap B;
    public final List L;
    public final LinkedHashMap R;
    public final p04 X;
    public final List Y;
    public final ArrayList Z;
    public final ArrayList d0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [np4] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7, types: [yt1] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jr6(lg0 lg0Var, kf0 kf0Var, jd1 jd1Var, yg1 yg1Var) {
        boolean z;
        Iterator it;
        kf0 kf0Var2;
        ?? r6;
        int i;
        int i2;
        boolean a;
        int i3;
        int i4;
        boolean a2;
        int i5;
        int i6;
        boolean a3;
        vs0 vs0Var;
        np4 np4Var;
        Integer num;
        lg0Var.getClass();
        kf0Var.getClass();
        yg1Var.getClass();
        this.A = kf0Var;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26 && kf0Var.h == 0) {
            lg0.g.getClass();
            if (!kg0.c(lg0Var)) {
                CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
                key.getClass();
                qc0 qc0Var = (qc0) lg0Var;
                Integer num2 = (Integer) qc0Var.c(key);
                if ((num2 == null || num2.intValue() != 0) && (i7 < 28 || (num = (Integer) qc0Var.c(key)) == null || num.intValue() != 4)) {
                    z = true;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    it = kf0Var.c.iterator();
                    while (true) {
                        vs0 vs0Var2 = null;
                        if (!it.hasNext()) {
                            List<ji0> list = (List) it.next();
                            if (!list.isEmpty()) {
                                List<ji0> list2 = this.A.b;
                                ArrayList arrayList3 = new ArrayList();
                                for (ji0 ji0Var : list2) {
                                    gt0.A0(arrayList3, ji0Var.a);
                                }
                                ArrayList arrayList4 = new ArrayList();
                                int size = arrayList3.size();
                                for (int i8 = 0; i8 < size; i8++) {
                                    arrayList3.get(i8);
                                }
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it2 = arrayList4.iterator();
                                if (!it2.hasNext()) {
                                    uw uwVar = i0;
                                    uwVar.getClass();
                                    int incrementAndGet = uw.b.incrementAndGet(uwVar);
                                    while (arrayList5.contains(Integer.valueOf(incrementAndGet))) {
                                        incrementAndGet = uw.b.incrementAndGet(uwVar);
                                    }
                                    for (ji0 ji0Var2 : list) {
                                        if (!linkedHashMap3.containsKey(ji0Var2)) {
                                            linkedHashMap3.put(ji0Var2, Integer.valueOf(incrementAndGet));
                                        } else {
                                            i.m("Check failed.");
                                            throw null;
                                        }
                                    }
                                } else {
                                    throw i61.j(it2);
                                }
                            } else {
                                i.m("Check failed.");
                                throw null;
                            }
                        } else {
                            Iterator it3 = this.A.b.iterator();
                            while (it3.hasNext()) {
                                ji0 ji0Var3 = (ji0) it3.next();
                                for (pp4 pp4Var : ji0Var3.a) {
                                    if (!linkedHashMap.containsKey(pp4Var)) {
                                        uw uwVar2 = h0;
                                        uwVar2.getClass();
                                        int incrementAndGet2 = uw.b.incrementAndGet(uwVar2);
                                        Size size2 = pp4Var.a;
                                        int i9 = pp4Var.b;
                                        String str = pp4Var.c;
                                        String str2 = str == null ? this.A.a : str;
                                        Integer num3 = (Integer) linkedHashMap3.get(ji0Var3);
                                        if (z) {
                                            if (pp4Var instanceof np4) {
                                                np4Var = (np4) pp4Var;
                                            } else {
                                                np4Var = vs0Var2;
                                            }
                                            if (np4Var != 0) {
                                                vs0Var = np4Var.i;
                                                hr6 hr6Var = new hr6(incrementAndGet2, size2, i9, str2, num3, vs0Var, pp4Var.d, pp4Var.e, pp4Var.f, pp4Var.g, pp4Var.h);
                                                linkedHashMap.put(pp4Var, hr6Var);
                                                arrayList.add(hr6Var);
                                                it3 = it3;
                                                vs0Var2 = null;
                                            }
                                        }
                                        vs0Var = vs0Var2;
                                        hr6 hr6Var2 = new hr6(incrementAndGet2, size2, i9, str2, num3, vs0Var, pp4Var.d, pp4Var.e, pp4Var.f, pp4Var.g, pp4Var.h);
                                        linkedHashMap.put(pp4Var, hr6Var2);
                                        arrayList.add(hr6Var2);
                                        it3 = it3;
                                        vs0Var2 = null;
                                    }
                                }
                            }
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            int size3 = this.A.b.size();
                            int i10 = 0;
                            while (true) {
                                kf0Var2 = this.A;
                                if (i10 >= size3) {
                                    break;
                                }
                                ji0 ji0Var4 = (ji0) kf0Var2.b.get(i10);
                                List<pp4> list3 = ji0Var4.a;
                                ArrayList arrayList6 = new ArrayList(ht0.v0(list3, 10));
                                for (pp4 pp4Var2 : list3) {
                                    Object obj = linkedHashMap.get(pp4Var2);
                                    obj.getClass();
                                    hr6 hr6Var3 = (hr6) obj;
                                    uw uwVar3 = f0;
                                    uwVar3.getClass();
                                    int incrementAndGet3 = uw.b.incrementAndGet(uwVar3);
                                    Size size4 = hr6Var3.b;
                                    ir6 ir6Var = new ir6(incrementAndGet3, hr6Var3.c, hr6Var3.f, hr6Var3.h, hr6Var3.g, hr6Var3.i, hr6Var3.j, size4, hr6Var3.d);
                                    linkedHashMap4.put(ir6Var, hr6Var3);
                                    arrayList6.add(ir6Var);
                                    size3 = size3;
                                }
                                int i11 = size3;
                                uw uwVar4 = e0;
                                uwVar4.getClass();
                                ki0 ki0Var = new ki0(uw.b.incrementAndGet(uwVar4), arrayList6);
                                linkedHashMap2.put(ji0Var4, ki0Var);
                                arrayList2.add(ki0Var);
                                int size5 = arrayList6.size();
                                int i12 = 0;
                                while (i12 < size5) {
                                    Object obj2 = arrayList6.get(i12);
                                    i12++;
                                    ir6 ir6Var2 = (ir6) obj2;
                                    ir6Var2.getClass();
                                    ir6Var2.j = ki0Var;
                                }
                                for (pp4 pp4Var3 : ji0Var4.a) {
                                    Object obj3 = linkedHashMap.get(pp4Var3);
                                    obj3.getClass();
                                    ((hr6) obj3).l.add(ki0Var);
                                }
                                i10++;
                                size3 = i11;
                            }
                            ArrayList arrayList7 = kf0Var2.d;
                            if (arrayList7 != null) {
                                r6 = new ArrayList(ht0.v0(arrayList7, 10));
                                int size6 = arrayList7.size();
                                int i13 = 0;
                                while (i13 < size6) {
                                    Object obj4 = arrayList7.get(i13);
                                    i13++;
                                    y73 y73Var = (y73) obj4;
                                    uw uwVar5 = g0;
                                    uwVar5.getClass();
                                    int incrementAndGet4 = uw.b.incrementAndGet(uwVar5);
                                    y73Var.getClass();
                                    r6.add(new gr6(incrementAndGet4, y73Var.b));
                                }
                            } else {
                                r6 = yt1.A;
                            }
                            this.Y = r6;
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList();
                            int size7 = arrayList2.size();
                            int i14 = 0;
                            while (i14 < size7) {
                                Object obj5 = arrayList2.get(i14);
                                int i15 = i14 + 1;
                                ArrayList arrayList10 = ((ki0) obj5).b;
                                if (!arrayList10.isEmpty()) {
                                    int size8 = arrayList10.size();
                                    int i16 = 0;
                                    while (i16 < size8) {
                                        Object obj6 = arrayList10.get(i16);
                                        i16++;
                                        sp4 sp4Var = ((ir6) obj6).g;
                                        if (sp4Var == null) {
                                            i5 = size7;
                                            i6 = i15;
                                            a3 = false;
                                        } else {
                                            i5 = size7;
                                            i6 = i15;
                                            a3 = sp4.a(sp4Var.a, 1L);
                                        }
                                        if (a3) {
                                            arrayList8.add(obj5);
                                            break;
                                        } else {
                                            size7 = i5;
                                            i15 = i6;
                                        }
                                    }
                                }
                                i5 = size7;
                                i6 = i15;
                                arrayList9.add(obj5);
                                size7 = i5;
                                i14 = i6;
                            }
                            if (!arrayList8.isEmpty()) {
                                arrayList2 = gt0.V0(arrayList8, arrayList9);
                            } else {
                                ArrayList arrayList11 = new ArrayList();
                                ArrayList arrayList12 = new ArrayList();
                                int size9 = arrayList2.size();
                                int i17 = 0;
                                while (i17 < size9) {
                                    Object obj7 = arrayList2.get(i17);
                                    i17++;
                                    ArrayList arrayList13 = ((ki0) obj7).b;
                                    if (!arrayList13.isEmpty()) {
                                        int size10 = arrayList13.size();
                                        int i18 = 0;
                                        while (i18 < size10) {
                                            Object obj8 = arrayList13.get(i18);
                                            i18++;
                                            if (gt0.C0(j0, ((ir6) obj8).h)) {
                                                arrayList11.add(obj7);
                                                break;
                                            }
                                        }
                                    }
                                    arrayList12.add(obj7);
                                }
                                if (!arrayList11.isEmpty()) {
                                    arrayList2 = gt0.V0(gt0.d1(arrayList11, k0), arrayList12);
                                } else {
                                    ArrayList arrayList14 = new ArrayList();
                                    ArrayList arrayList15 = new ArrayList();
                                    int size11 = arrayList2.size();
                                    int i19 = 0;
                                    while (i19 < size11) {
                                        Object obj9 = arrayList2.get(i19);
                                        i19++;
                                        ArrayList arrayList16 = ((ki0) obj9).b;
                                        if (!arrayList16.isEmpty()) {
                                            int size12 = arrayList16.size();
                                            int i20 = 0;
                                            while (i20 < size12) {
                                                Object obj10 = arrayList16.get(i20);
                                                i20++;
                                                if (l0.contains(new fr6(((ir6) obj10).c))) {
                                                    arrayList14.add(obj9);
                                                    break;
                                                }
                                            }
                                        }
                                        arrayList15.add(obj9);
                                    }
                                    if (!arrayList14.isEmpty()) {
                                        arrayList2 = gt0.V0(gt0.d1(arrayList14, m0), arrayList15);
                                    }
                                }
                            }
                            ArrayList arrayList17 = new ArrayList();
                            ArrayList arrayList18 = new ArrayList();
                            int size13 = arrayList2.size();
                            int i21 = 0;
                            while (i21 < size13) {
                                Object obj11 = arrayList2.get(i21);
                                int i22 = i21 + 1;
                                ArrayList arrayList19 = ((ki0) obj11).b;
                                if (!arrayList19.isEmpty()) {
                                    int size14 = arrayList19.size();
                                    int i23 = 0;
                                    while (i23 < size14) {
                                        Object obj12 = arrayList19.get(i23);
                                        i23++;
                                        sp4 sp4Var2 = ((ir6) obj12).g;
                                        if (sp4Var2 == null) {
                                            i3 = size13;
                                            i4 = i22;
                                            a2 = false;
                                        } else {
                                            i3 = size13;
                                            i4 = i22;
                                            a2 = sp4.a(sp4Var2.a, 3L);
                                        }
                                        if (a2) {
                                            arrayList17.add(obj11);
                                            break;
                                        } else {
                                            size13 = i3;
                                            i22 = i4;
                                        }
                                    }
                                }
                                i3 = size13;
                                i4 = i22;
                                arrayList18.add(obj11);
                                size13 = i3;
                                i21 = i4;
                            }
                            if (!arrayList17.isEmpty()) {
                                arrayList2 = gt0.V0(arrayList18, arrayList17);
                            } else {
                                ArrayList arrayList20 = new ArrayList();
                                ArrayList arrayList21 = new ArrayList();
                                int size15 = arrayList2.size();
                                int i24 = 0;
                                while (i24 < size15) {
                                    Object obj13 = arrayList2.get(i24);
                                    int i25 = i24 + 1;
                                    ArrayList arrayList22 = ((ki0) obj13).b;
                                    if (!arrayList22.isEmpty()) {
                                        int size16 = arrayList22.size();
                                        int i26 = 0;
                                        while (i26 < size16) {
                                            Object obj14 = arrayList22.get(i26);
                                            i26++;
                                            tp4 tp4Var = ((ir6) obj14).i;
                                            if (tp4Var == null) {
                                                i = size15;
                                                i2 = i25;
                                                a = false;
                                            } else {
                                                i = size15;
                                                i2 = i25;
                                                a = tp4.a(tp4Var.a, 1L);
                                            }
                                            if (a) {
                                                arrayList20.add(obj13);
                                                break;
                                            } else {
                                                size15 = i;
                                                i25 = i2;
                                            }
                                        }
                                    }
                                    i = size15;
                                    i2 = i25;
                                    arrayList21.add(obj13);
                                    size15 = i;
                                    i24 = i2;
                                }
                                if (!arrayList20.isEmpty()) {
                                    arrayList2 = gt0.V0(arrayList21, arrayList20);
                                }
                            }
                            this.Z = arrayList2;
                            ArrayList arrayList23 = new ArrayList(ht0.v0(arrayList2, 10));
                            int size17 = arrayList2.size();
                            int i27 = 0;
                            while (i27 < size17) {
                                Object obj15 = arrayList2.get(i27);
                                i27++;
                                arrayList23.add(new kr6(((ki0) obj15).a));
                            }
                            gt0.p1(arrayList23);
                            this.B = linkedHashMap2;
                            this.L = gt0.d1(arrayList, new ix1(this, 8));
                            this.R = linkedHashMap4;
                            ArrayList arrayList24 = this.Z;
                            ArrayList arrayList25 = new ArrayList();
                            int size18 = arrayList24.size();
                            int i28 = 0;
                            while (i28 < size18) {
                                Object obj16 = arrayList24.get(i28);
                                i28++;
                                gt0.A0(arrayList25, ((ki0) obj16).b);
                            }
                            this.d0 = arrayList25;
                            p04 p04Var = new p04();
                            for (ji0 ji0Var5 : this.A.b) {
                                ji0Var5.getClass();
                            }
                            this.X = p04Var.b();
                            return;
                        }
                    }
                }
            }
        }
        z = false;
        LinkedHashMap linkedHashMap32 = new LinkedHashMap();
        it = kf0Var.c.iterator();
        while (true) {
            vs0 vs0Var22 = null;
            if (!it.hasNext()) {
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        Iterator it = ((r04) this.X.values()).iterator();
        while (it.hasNext()) {
            t23 t23Var = (t23) it.next();
            if (t23Var instanceof AutoCloseable) {
                t23Var.close();
            } else if (t23Var instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) t23Var;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                u34.t();
                return;
            }
        }
    }

    public final ki0 e(int i) {
        Object obj;
        ArrayList arrayList = this.Z;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                if (((ki0) obj).a == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (ki0) obj;
    }

    public final ji0 h(int i) {
        Object obj;
        Iterator it = this.B.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ki0) ((Map.Entry) obj).getValue()).a == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (ji0) entry.getKey();
    }

    public final String toString() {
        return "StreamGraph(" + this.B + ')';
    }
}
