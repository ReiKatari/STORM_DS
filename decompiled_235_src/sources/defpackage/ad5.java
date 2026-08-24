package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ad5  reason: default package */
/* loaded from: classes.dex */
public final class ad5 {
    public final nv4 a;
    public final w61 b;
    public final yc1 c;
    public final Object d;
    public tu0 e;
    public ap6 f;
    public boolean g;

    public ad5(nv4 nv4Var, w61 w61Var, yc1 yc1Var) {
        w61Var.getClass();
        this.a = nv4Var;
        this.b = w61Var;
        this.c = yc1Var;
        this.d = new Object();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:(2:3|(22:5|6|7|8|(1:(1:(22:12|13|(3:133|(3:136|(2:138|139)|134)|140)|17|18|(1:132)(1:21)|(1:23)(1:131)|24|25|(1:27)|28|(2:31|29)|32|33|(1:35)(4:111|(5:114|(1:116)(1:128)|117|(1:126)(3:122|123|124)|112)|129|130)|36|(1:38)(4:91|(5:94|(1:96)(1:108)|97|(1:106)(3:102|103|104)|92)|109|110)|39|(4:71|(5:74|(1:76)(1:88)|77|(1:86)(3:82|83|84)|72)|89|90)(1:43)|(4:51|(5:54|(1:56)(1:68)|57|(1:66)(3:62|63|64)|52)|69|70)(1:47)|48|49)(2:141|142))(4:143|144|145|146))(5:183|(4:186|(3:188|189|190)(1:192)|191|184)|193|194|(2:196|197)(9:198|199|200|(9:202|203|204|205|206|207|208|209|210)|220|221|222|223|(1:226)(1:225)))|147|148|149|150|(2:153|151)|154|155|(2:158|156)|159|160|(3:171|(2:173|(1:176)(1:175))|177)|162|163|(3:170|166|(1:169)(34:168|13|(1:15)|133|(1:134)|140|17|18|(0)|132|(0)(0)|24|25|(0)|28|(1:29)|32|33|(0)(0)|36|(0)(0)|39|(1:41)|71|(1:72)|89|90|(1:45)|51|(1:52)|69|70|48|49))(0)|165|166|(0)(0)))|8|(0)(0)|147|148|149|150|(1:151)|154|155|(1:156)|159|160|(0)|162|163|(0)(0)|165|166|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b4 A[LOOP:0: B:102:0x02ae->B:104:0x02b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a A[LOOP:6: B:53:0x0134->B:55:0x013a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0178 A[LOOP:7: B:57:0x0172->B:59:0x0178, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ad5 ad5Var, fd5 fd5Var, s41 s41Var) {
        zc5 zc5Var;
        zc5 zc5Var2;
        x61 x61Var;
        int i;
        bv4 bv4Var;
        fd5 fd5Var2;
        Throwable th;
        int i2;
        List list;
        pb4 pb4Var;
        List<av4> list2;
        LinkedHashSet<Number> linkedHashSet;
        int i3;
        ArrayList arrayList;
        bv4 bv4Var2;
        pb4 pb4Var2;
        LinkedHashSet M0;
        Set F;
        Set F2;
        Set F3;
        Set set;
        pb4 pb4Var3;
        fd5 fd5Var3;
        Set set2;
        Set set3;
        bv4 bv4Var3;
        LinkedHashSet<Number> linkedHashSet2;
        int i4;
        boolean z;
        Iterable K;
        int k0;
        int i5;
        Object obj;
        int i6;
        Object obj2;
        Iterable<Number> iterable;
        boolean z2;
        int i7;
        Object obj3;
        int i8;
        Object obj4;
        nv4 nv4Var = ad5Var.a;
        de5 de5Var = nv4Var.i;
        try {
            if (s41Var instanceof zc5) {
                zc5Var = (zc5) s41Var;
                int i9 = zc5Var.k0;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    zc5Var.k0 = i9 - Integer.MIN_VALUE;
                    zc5Var2 = zc5Var;
                    Object obj5 = zc5Var2.i0;
                    x61Var = x61.COROUTINE_SUSPENDED;
                    i = zc5Var2.k0;
                    Throwable th2 = null;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                set = zc5Var2.h0;
                                set3 = zc5Var2.g0;
                                set2 = zc5Var2.f0;
                                linkedHashSet2 = zc5Var2.e0;
                                pb4Var3 = zc5Var2.d0;
                                linkedHashSet = zc5Var2.Z;
                                list2 = zc5Var2.Y;
                                bv4Var3 = zc5Var2.X;
                                fd5 fd5Var4 = zc5Var2.R;
                                oi2.Y(obj5);
                                fd5Var3 = fd5Var4;
                                th = null;
                                i3 = 1;
                                i2 = 0;
                                Set set4 = set2;
                                Set set5 = set3;
                                LinkedHashSet K2 = ii2.K(ii2.K(ii2.K(linkedHashSet2, set4), set), set5);
                                if (linkedHashSet != null || !linkedHashSet.isEmpty()) {
                                    for (Number number : linkedHashSet) {
                                        if (!K2.contains(new Long(number.longValue()))) {
                                            i4 = i3;
                                            break;
                                        }
                                    }
                                }
                                i4 = i2;
                                if (pb4Var3.e && i4 == 0) {
                                    z = i2;
                                } else {
                                    z = i3;
                                }
                                if (z == 0) {
                                    K = ii2.F(ii2.F(linkedHashSet, linkedHashSet2), set4);
                                } else {
                                    K = ii2.K(set, set5);
                                }
                                k0 = c14.k0(ht0.v0(list2, 10));
                                if (k0 < 16) {
                                    k0 = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(k0);
                                for (Object obj6 : list2) {
                                    linkedHashMap.put(new Long(((av4) obj6).a.e()), obj6);
                                }
                                if (!linkedHashSet2.isEmpty()) {
                                    i5 = i2;
                                } else {
                                    int i10 = i2;
                                    for (Number number2 : linkedHashSet2) {
                                        av4 av4Var = (av4) linkedHashMap.get(new Long(number2.longValue()));
                                        if (av4Var != null) {
                                            obj = av4Var.a;
                                        } else {
                                            obj = th;
                                        }
                                        if ((obj instanceof xu4) && (i10 = i10 + 1) < 0) {
                                            hf.p0();
                                            throw th;
                                        }
                                    }
                                    i5 = i10;
                                }
                                if (!linkedHashSet2.isEmpty()) {
                                    i6 = i2;
                                } else {
                                    int i11 = i2;
                                    for (Number number3 : linkedHashSet2) {
                                        av4 av4Var2 = (av4) linkedHashMap.get(new Long(number3.longValue()));
                                        if (av4Var2 != null) {
                                            obj2 = av4Var2.a;
                                        } else {
                                            obj2 = th;
                                        }
                                        if ((obj2 instanceof yu4) && (i11 = i11 + 1) < 0) {
                                            hf.p0();
                                            throw th;
                                        }
                                    }
                                    i6 = i11;
                                }
                                iterable = K;
                                z2 = iterable instanceof Collection;
                                if (!z2 && ((Collection) iterable).isEmpty()) {
                                    i7 = i2;
                                } else {
                                    int i12 = i2;
                                    for (Number number4 : iterable) {
                                        av4 av4Var3 = (av4) linkedHashMap.get(new Long(number4.longValue()));
                                        if (av4Var3 != null) {
                                            obj3 = av4Var3.a;
                                        } else {
                                            obj3 = th;
                                        }
                                        if ((obj3 instanceof xu4) && (i12 = i12 + 1) < 0) {
                                            hf.p0();
                                            throw th;
                                        }
                                    }
                                    i7 = i12;
                                }
                                if (!z2 && ((Collection) iterable).isEmpty()) {
                                    i8 = i2;
                                } else {
                                    int i13 = i2;
                                    for (Number number5 : iterable) {
                                        av4 av4Var4 = (av4) linkedHashMap.get(new Long(number5.longValue()));
                                        if (av4Var4 != null) {
                                            obj4 = av4Var4.a;
                                        } else {
                                            obj4 = th;
                                        }
                                        if ((obj4 instanceof yu4) && (i13 = i13 + 1) < 0) {
                                            hf.p0();
                                            throw th;
                                        }
                                    }
                                    i8 = i13;
                                }
                                return new dd5(fd5Var3, bv4Var3.c, i5, i6, set2.size(), i7, i8, ((bv4) de5Var.A.getValue()).c, z);
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = zc5Var2.Y;
                        bv4Var = zc5Var2.X;
                        fd5 fd5Var5 = zc5Var2.R;
                        try {
                            oi2.Y(obj5);
                            th = null;
                            fd5Var2 = fd5Var5;
                            i2 = 0;
                        } catch (Throwable unused) {
                            th = null;
                            fd5Var2 = fd5Var5;
                            i2 = 0;
                            pb4Var = new pb4();
                            list2 = list;
                            bv4 bv4Var4 = bv4Var;
                            linkedHashSet = new LinkedHashSet();
                            while (r0.hasNext()) {
                            }
                            Set set6 = pb4Var.a;
                            Set set7 = pb4Var.b;
                            Set set8 = pb4Var.c;
                            Set set9 = pb4Var.d;
                            Set[] setArr = new Set[4];
                            setArr[i2] = set6;
                            i3 = 1;
                            setArr[1] = set7;
                            setArr[2] = set8;
                            setArr[3] = set9;
                            List<Iterable> c0 = hf.c0(setArr);
                            arrayList = new ArrayList();
                            while (r0.hasNext()) {
                            }
                            if (!arrayList.isEmpty()) {
                            }
                            bv4Var2 = bv4Var4;
                            if (arrayList.size() == gt0.p1(arrayList).size()) {
                            }
                            pb4Var2 = new pb4();
                            M0 = gt0.M0(pb4Var2.a, linkedHashSet);
                            F = ii2.F(gt0.M0(pb4Var2.b, linkedHashSet), M0);
                            Set set10 = F;
                            F2 = ii2.F(ii2.F(gt0.M0(pb4Var2.d, linkedHashSet), M0), set10);
                            F3 = ii2.F(ii2.F(ii2.F(gt0.M0(pb4Var2.c, linkedHashSet), M0), set10), F2);
                            zc5Var2.R = fd5Var2;
                            bv4 bv4Var5 = bv4Var2;
                            zc5Var2.X = bv4Var5;
                            zc5Var2.Y = list2;
                            zc5Var2.Z = linkedHashSet;
                            zc5Var2.d0 = pb4Var2;
                            zc5Var2.e0 = M0;
                            zc5Var2.f0 = F;
                            zc5Var2.g0 = F2;
                            zc5Var2.h0 = F3;
                            zc5Var2.k0 = 2;
                            if (nv4Var.c(M0, F, F3, F2, zc5Var2) == x61Var) {
                            }
                        }
                    } else {
                        oi2.Y(obj5);
                        bv4Var = (bv4) de5Var.A.getValue();
                        List list3 = bv4Var.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj7 : list3) {
                            if (((av4) obj7).b == cv4.RETRYABLE) {
                                arrayList2.add(obj7);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            lc5 lc5Var = bv4Var.c;
                            return new dd5(fd5Var, lc5Var, 0, 0, 0, 0, 0, lc5Var, false);
                        }
                        try {
                            yc1 yc1Var = ad5Var.c;
                            ArrayList arrayList3 = new ArrayList(ht0.v0(arrayList2, 10));
                            int size = arrayList2.size();
                            int i14 = 0;
                            while (i14 < size) {
                                try {
                                    Object obj8 = arrayList2.get(i14);
                                    i14++;
                                    av4 av4Var5 = (av4) obj8;
                                    th = th2;
                                    try {
                                        i2 = 0;
                                        try {
                                            arrayList3.add(new b82(av4Var5.a.e(), av4Var5.a.a()));
                                            th2 = th;
                                        } catch (Throwable unused2) {
                                            fd5Var2 = fd5Var;
                                            list = arrayList2;
                                            pb4Var = new pb4();
                                            list2 = list;
                                            bv4 bv4Var42 = bv4Var;
                                            linkedHashSet = new LinkedHashSet();
                                            while (r0.hasNext()) {
                                            }
                                            Set set62 = pb4Var.a;
                                            Set set72 = pb4Var.b;
                                            Set set82 = pb4Var.c;
                                            Set set92 = pb4Var.d;
                                            Set[] setArr2 = new Set[4];
                                            setArr2[i2] = set62;
                                            i3 = 1;
                                            setArr2[1] = set72;
                                            setArr2[2] = set82;
                                            setArr2[3] = set92;
                                            List<Iterable> c02 = hf.c0(setArr2);
                                            arrayList = new ArrayList();
                                            while (r0.hasNext()) {
                                            }
                                            if (!arrayList.isEmpty()) {
                                            }
                                            bv4Var2 = bv4Var42;
                                            if (arrayList.size() == gt0.p1(arrayList).size()) {
                                            }
                                            pb4Var2 = new pb4();
                                            M0 = gt0.M0(pb4Var2.a, linkedHashSet);
                                            F = ii2.F(gt0.M0(pb4Var2.b, linkedHashSet), M0);
                                            Set set102 = F;
                                            F2 = ii2.F(ii2.F(gt0.M0(pb4Var2.d, linkedHashSet), M0), set102);
                                            F3 = ii2.F(ii2.F(ii2.F(gt0.M0(pb4Var2.c, linkedHashSet), M0), set102), F2);
                                            zc5Var2.R = fd5Var2;
                                            bv4 bv4Var52 = bv4Var2;
                                            zc5Var2.X = bv4Var52;
                                            zc5Var2.Y = list2;
                                            zc5Var2.Z = linkedHashSet;
                                            zc5Var2.d0 = pb4Var2;
                                            zc5Var2.e0 = M0;
                                            zc5Var2.f0 = F;
                                            zc5Var2.g0 = F2;
                                            zc5Var2.h0 = F3;
                                            zc5Var2.k0 = 2;
                                            if (nv4Var.c(M0, F, F3, F2, zc5Var2) == x61Var) {
                                            }
                                        }
                                    } catch (Throwable unused3) {
                                        i2 = 0;
                                        fd5Var2 = fd5Var;
                                        list = arrayList2;
                                        pb4Var = new pb4();
                                        list2 = list;
                                        bv4 bv4Var422 = bv4Var;
                                        linkedHashSet = new LinkedHashSet();
                                        while (r0.hasNext()) {
                                        }
                                        Set set622 = pb4Var.a;
                                        Set set722 = pb4Var.b;
                                        Set set822 = pb4Var.c;
                                        Set set922 = pb4Var.d;
                                        Set[] setArr22 = new Set[4];
                                        setArr22[i2] = set622;
                                        i3 = 1;
                                        setArr22[1] = set722;
                                        setArr22[2] = set822;
                                        setArr22[3] = set922;
                                        List<Iterable> c022 = hf.c0(setArr22);
                                        arrayList = new ArrayList();
                                        while (r0.hasNext()) {
                                        }
                                        if (!arrayList.isEmpty()) {
                                        }
                                        bv4Var2 = bv4Var422;
                                        if (arrayList.size() == gt0.p1(arrayList).size()) {
                                        }
                                        pb4Var2 = new pb4();
                                        M0 = gt0.M0(pb4Var2.a, linkedHashSet);
                                        F = ii2.F(gt0.M0(pb4Var2.b, linkedHashSet), M0);
                                        Set set1022 = F;
                                        F2 = ii2.F(ii2.F(gt0.M0(pb4Var2.d, linkedHashSet), M0), set1022);
                                        F3 = ii2.F(ii2.F(ii2.F(gt0.M0(pb4Var2.c, linkedHashSet), M0), set1022), F2);
                                        zc5Var2.R = fd5Var2;
                                        bv4 bv4Var522 = bv4Var2;
                                        zc5Var2.X = bv4Var522;
                                        zc5Var2.Y = list2;
                                        zc5Var2.Z = linkedHashSet;
                                        zc5Var2.d0 = pb4Var2;
                                        zc5Var2.e0 = M0;
                                        zc5Var2.f0 = F;
                                        zc5Var2.g0 = F2;
                                        zc5Var2.h0 = F3;
                                        zc5Var2.k0 = 2;
                                        if (nv4Var.c(M0, F, F3, F2, zc5Var2) == x61Var) {
                                        }
                                    }
                                } catch (Throwable unused4) {
                                    th = th2;
                                }
                            }
                            fd5Var2 = fd5Var;
                            th = th2;
                            i2 = 0;
                            try {
                                zc5Var2.R = fd5Var2;
                                zc5Var2.X = bv4Var;
                                zc5Var2.Y = arrayList2;
                                zc5Var2.k0 = 1;
                                obj5 = yc1Var.K(arrayList3, zc5Var2);
                                if (obj5 != x61Var) {
                                    list = arrayList2;
                                } else {
                                    return x61Var;
                                }
                            } catch (Throwable unused5) {
                                list = arrayList2;
                                pb4Var = new pb4();
                                list2 = list;
                                bv4 bv4Var4222 = bv4Var;
                                linkedHashSet = new LinkedHashSet();
                                while (r0.hasNext()) {
                                }
                                Set set6222 = pb4Var.a;
                                Set set7222 = pb4Var.b;
                                Set set8222 = pb4Var.c;
                                Set set9222 = pb4Var.d;
                                Set[] setArr222 = new Set[4];
                                setArr222[i2] = set6222;
                                i3 = 1;
                                setArr222[1] = set7222;
                                setArr222[2] = set8222;
                                setArr222[3] = set9222;
                                List<Iterable> c0222 = hf.c0(setArr222);
                                arrayList = new ArrayList();
                                while (r0.hasNext()) {
                                }
                                if (!arrayList.isEmpty()) {
                                }
                                bv4Var2 = bv4Var4222;
                                if (arrayList.size() == gt0.p1(arrayList).size()) {
                                }
                                pb4Var2 = new pb4();
                                M0 = gt0.M0(pb4Var2.a, linkedHashSet);
                                F = ii2.F(gt0.M0(pb4Var2.b, linkedHashSet), M0);
                                Set set10222 = F;
                                F2 = ii2.F(ii2.F(gt0.M0(pb4Var2.d, linkedHashSet), M0), set10222);
                                F3 = ii2.F(ii2.F(ii2.F(gt0.M0(pb4Var2.c, linkedHashSet), M0), set10222), F2);
                                zc5Var2.R = fd5Var2;
                                bv4 bv4Var5222 = bv4Var2;
                                zc5Var2.X = bv4Var5222;
                                zc5Var2.Y = list2;
                                zc5Var2.Z = linkedHashSet;
                                zc5Var2.d0 = pb4Var2;
                                zc5Var2.e0 = M0;
                                zc5Var2.f0 = F;
                                zc5Var2.g0 = F2;
                                zc5Var2.h0 = F3;
                                zc5Var2.k0 = 2;
                                if (nv4Var.c(M0, F, F3, F2, zc5Var2) == x61Var) {
                                }
                            }
                        } catch (Throwable unused6) {
                            fd5Var2 = fd5Var;
                            th = null;
                            i2 = 0;
                        }
                    }
                    pb4Var = (pb4) obj5;
                    list2 = list;
                    bv4 bv4Var42222 = bv4Var;
                    linkedHashSet = new LinkedHashSet();
                    for (av4 av4Var6 : list2) {
                        linkedHashSet.add(new Long(av4Var6.a.e()));
                    }
                    Set set62222 = pb4Var.a;
                    Set set72222 = pb4Var.b;
                    Set set82222 = pb4Var.c;
                    Set set92222 = pb4Var.d;
                    Set[] setArr2222 = new Set[4];
                    setArr2222[i2] = set62222;
                    i3 = 1;
                    setArr2222[1] = set72222;
                    setArr2222[2] = set82222;
                    setArr2222[3] = set92222;
                    List<Iterable> c02222 = hf.c0(setArr2222);
                    arrayList = new ArrayList();
                    for (Iterable iterable2 : c02222) {
                        gt0.A0(arrayList, iterable2);
                    }
                    if (!arrayList.isEmpty()) {
                        int size2 = arrayList.size();
                        int i15 = i2;
                        while (i15 < size2) {
                            Object obj9 = arrayList.get(i15);
                            i15++;
                            bv4Var2 = bv4Var42222;
                            if (!linkedHashSet.contains(new Long(((Number) obj9).longValue()))) {
                                break;
                            }
                            bv4Var42222 = bv4Var2;
                        }
                    }
                    bv4Var2 = bv4Var42222;
                    if (arrayList.size() == gt0.p1(arrayList).size()) {
                        pb4Var2 = pb4Var;
                        M0 = gt0.M0(pb4Var2.a, linkedHashSet);
                        F = ii2.F(gt0.M0(pb4Var2.b, linkedHashSet), M0);
                        Set set102222 = F;
                        F2 = ii2.F(ii2.F(gt0.M0(pb4Var2.d, linkedHashSet), M0), set102222);
                        F3 = ii2.F(ii2.F(ii2.F(gt0.M0(pb4Var2.c, linkedHashSet), M0), set102222), F2);
                        zc5Var2.R = fd5Var2;
                        bv4 bv4Var52222 = bv4Var2;
                        zc5Var2.X = bv4Var52222;
                        zc5Var2.Y = list2;
                        zc5Var2.Z = linkedHashSet;
                        zc5Var2.d0 = pb4Var2;
                        zc5Var2.e0 = M0;
                        zc5Var2.f0 = F;
                        zc5Var2.g0 = F2;
                        zc5Var2.h0 = F3;
                        zc5Var2.k0 = 2;
                        if (nv4Var.c(M0, F, F3, F2, zc5Var2) == x61Var) {
                            set = F3;
                            pb4Var3 = pb4Var2;
                            fd5Var3 = fd5Var2;
                            set2 = F;
                            set3 = F2;
                            bv4Var3 = bv4Var52222;
                            linkedHashSet2 = M0;
                            Set set42 = set2;
                            Set set52 = set3;
                            LinkedHashSet K22 = ii2.K(ii2.K(ii2.K(linkedHashSet2, set42), set), set52);
                            if (linkedHashSet != null) {
                            }
                            while (r8.hasNext()) {
                            }
                            i4 = i2;
                            if (pb4Var3.e) {
                            }
                            z = i3;
                            if (z == 0) {
                            }
                            k0 = c14.k0(ht0.v0(list2, 10));
                            if (k0 < 16) {
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(k0);
                            while (r1.hasNext()) {
                            }
                            if (!linkedHashSet2.isEmpty()) {
                            }
                            if (!linkedHashSet2.isEmpty()) {
                            }
                            iterable = K;
                            z2 = iterable instanceof Collection;
                            if (!z2) {
                            }
                            int i122 = i2;
                            while (r4.hasNext()) {
                            }
                            i7 = i122;
                            if (!z2) {
                            }
                            int i132 = i2;
                            while (r0.hasNext()) {
                            }
                            i8 = i132;
                            return new dd5(fd5Var3, bv4Var3.c, i5, i6, set2.size(), i7, i8, ((bv4) de5Var.A.getValue()).c, z);
                        }
                        return x61Var;
                    }
                    pb4Var2 = new pb4();
                    M0 = gt0.M0(pb4Var2.a, linkedHashSet);
                    F = ii2.F(gt0.M0(pb4Var2.b, linkedHashSet), M0);
                    Set set1022222 = F;
                    F2 = ii2.F(ii2.F(gt0.M0(pb4Var2.d, linkedHashSet), M0), set1022222);
                    F3 = ii2.F(ii2.F(ii2.F(gt0.M0(pb4Var2.c, linkedHashSet), M0), set1022222), F2);
                    zc5Var2.R = fd5Var2;
                    bv4 bv4Var522222 = bv4Var2;
                    zc5Var2.X = bv4Var522222;
                    zc5Var2.Y = list2;
                    zc5Var2.Z = linkedHashSet;
                    zc5Var2.d0 = pb4Var2;
                    zc5Var2.e0 = M0;
                    zc5Var2.f0 = F;
                    zc5Var2.g0 = F2;
                    zc5Var2.h0 = F3;
                    zc5Var2.k0 = 2;
                    if (nv4Var.c(M0, F, F3, F2, zc5Var2) == x61Var) {
                    }
                }
            }
            if (i == 0) {
            }
            pb4Var = (pb4) obj5;
            list2 = list;
            bv4 bv4Var422222 = bv4Var;
            linkedHashSet = new LinkedHashSet();
            while (r0.hasNext()) {
            }
            Set set622222 = pb4Var.a;
            Set set722222 = pb4Var.b;
            Set set822222 = pb4Var.c;
            Set set922222 = pb4Var.d;
            Set[] setArr22222 = new Set[4];
            setArr22222[i2] = set622222;
            i3 = 1;
            setArr22222[1] = set722222;
            setArr22222[2] = set822222;
            setArr22222[3] = set922222;
            List<Iterable> c022222 = hf.c0(setArr22222);
            arrayList = new ArrayList();
            while (r0.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
            }
            bv4Var2 = bv4Var422222;
            if (arrayList.size() == gt0.p1(arrayList).size()) {
            }
            pb4Var2 = new pb4();
            M0 = gt0.M0(pb4Var2.a, linkedHashSet);
            F = ii2.F(gt0.M0(pb4Var2.b, linkedHashSet), M0);
            Set set10222222 = F;
            F2 = ii2.F(ii2.F(gt0.M0(pb4Var2.d, linkedHashSet), M0), set10222222);
            F3 = ii2.F(ii2.F(ii2.F(gt0.M0(pb4Var2.c, linkedHashSet), M0), set10222222), F2);
            zc5Var2.R = fd5Var2;
            bv4 bv4Var5222222 = bv4Var2;
            zc5Var2.X = bv4Var5222222;
            zc5Var2.Y = list2;
            zc5Var2.Z = linkedHashSet;
            zc5Var2.d0 = pb4Var2;
            zc5Var2.e0 = M0;
            zc5Var2.f0 = F;
            zc5Var2.g0 = F2;
            zc5Var2.h0 = F3;
            zc5Var2.k0 = 2;
            if (nv4Var.c(M0, F, F3, F2, zc5Var2) == x61Var) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        zc5Var = new zc5(ad5Var, s41Var);
        zc5Var2 = zc5Var;
        Object obj52 = zc5Var2.i0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = zc5Var2.k0;
        Throwable th22 = null;
    }

    public final Object b(fd5 fd5Var, r32 r32Var) {
        tu0 tu0Var;
        ap6 ap6Var;
        synchronized (this.d) {
            if (!this.g) {
                tu0Var = this.e;
                ap6Var = null;
                if (tu0Var == null) {
                    tu0 tu0Var2 = new tu0();
                    this.e = tu0Var2;
                    ap6Var = hv.L(this.b, null, a71.LAZY, new l5(tu0Var2, this, fd5Var, (r41) null, 26), 1);
                    this.f = ap6Var;
                    ap6Var.a0(new qk4(6, tu0Var2, this));
                    tu0Var = tu0Var2;
                }
            } else {
                throw new CancellationException("Pending submission coordinator is closed");
            }
        }
        if (ap6Var != null) {
            ap6Var.start();
        }
        Object q = tu0Var.q(r32Var);
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        return q;
    }
}
