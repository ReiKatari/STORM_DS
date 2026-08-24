package defpackage;

import android.view.InputDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kz0  reason: default package */
/* loaded from: classes.dex */
public final class kz0 extends hw6 implements fo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kz0(Object obj, r41 r41Var, int i) {
        super(3, r41Var);
        this.X = i;
        this.d0 = obj;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Object obj4 = this.d0;
        switch (i) {
            case 0:
                kz0 kz0Var = new kz0((lz0) obj4, (r41) obj3, 0);
                kz0Var.Y = (List) obj;
                kz0Var.Z = (u41) obj2;
                return kz0Var.s(jg7Var);
            case 1:
                kz0 kz0Var2 = new kz0((sz1) obj4, (r41) obj3, 1);
                kz0Var2.Y = (vz1) obj;
                kz0Var2.Z = (jz1) obj2;
                return kz0Var2.s(jg7Var);
            case 2:
                kz0 kz0Var3 = new kz0((tz5) obj4, (r41) obj3, 2);
                kz0Var3.Y = (List) obj;
                kz0Var3.Z = (List) obj2;
                return kz0Var3.s(jg7Var);
            default:
                kz0 kz0Var4 = new kz0((ci0) obj4, (r41) obj3, 3);
                kz0Var4.Y = (fk3) obj;
                kz0Var4.Z = (jf7) obj2;
                return kz0Var4.s(jg7Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0595 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        List<b63> list;
        Object obj2;
        ArrayList arrayList;
        Boolean bool;
        boolean z;
        boolean z2;
        jf7 jf7Var;
        ff7 ff7Var;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        Long l;
        jw5 jw5Var;
        Object obj3;
        ff7 ff7Var2;
        ff7 ff7Var3;
        float f;
        ArrayList arrayList2;
        j05 a;
        j05 j05Var;
        ?? r11;
        ArrayList arrayList3;
        ?? r4;
        ff7 c;
        mk3 mk3Var;
        int i2 = this.X;
        Object obj4 = this.d0;
        int i3 = 0;
        switch (i2) {
            case 0:
                List<InputDevice> list2 = (List) this.Y;
                u41 u41Var = (u41) this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (!list2.isEmpty() && u41Var != null) {
                    ArrayList arrayList4 = u41Var.b;
                    ((lz0) obj4).getClass();
                    b63.Companion.getClass();
                    list = b63.SYSTEM_BUTTONS;
                    g63 g63Var = g63.a;
                    if (list == null || !list.isEmpty()) {
                        for (b63 b63Var : list) {
                            b63Var.getClass();
                            int size = arrayList4.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size) {
                                    obj2 = arrayList4.get(i4);
                                    i4++;
                                    i63 i63Var = (i63) obj2;
                                    if (i63Var.a != b63Var || !i63Var.b()) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            i63 i63Var2 = (i63) obj2;
                            if (i63Var2 != null) {
                                h63 h63Var = i63Var2.b;
                                if (nb3.k(h63Var, g63Var)) {
                                    h63Var = null;
                                }
                                h63 h63Var2 = i63Var2.c;
                                if (nb3.k(h63Var2, g63Var)) {
                                    h63Var2 = null;
                                }
                                arrayList = fv.C0(new h63[]{h63Var, h63Var2});
                            } else {
                                arrayList = null;
                            }
                            if (arrayList != null) {
                                if (!arrayList.isEmpty()) {
                                    int size2 = arrayList.size();
                                    int i5 = 0;
                                    while (i5 < size2) {
                                        Object obj5 = arrayList.get(i5);
                                        i5++;
                                        h63 h63Var3 = (h63) obj5;
                                        if (!list2.isEmpty()) {
                                            for (InputDevice inputDevice : list2) {
                                                if (h63Var3 instanceof e63) {
                                                    if (inputDevice.getMotionRange(((e63) h63Var3).b) != null) {
                                                        z = true;
                                                        continue;
                                                        if (z) {
                                                            z2 = true;
                                                            bool = Boolean.valueOf(z2);
                                                        }
                                                    }
                                                    z = false;
                                                    continue;
                                                    if (z) {
                                                    }
                                                } else if (h63Var3 instanceof f63) {
                                                    z = inputDevice.hasKeys(((f63) h63Var3).b)[0];
                                                    continue;
                                                    if (z) {
                                                    }
                                                } else {
                                                    if (!nb3.k(h63Var3, g63Var)) {
                                                        i.d();
                                                        return null;
                                                    }
                                                    z = false;
                                                    continue;
                                                    if (z) {
                                                    }
                                                }
                                                return nz0.a;
                                            }
                                            continue;
                                        }
                                    }
                                }
                                z2 = false;
                                bool = Boolean.valueOf(z2);
                            } else {
                                bool = null;
                            }
                            if (!nb3.k(bool, Boolean.TRUE)) {
                                return nz0.a;
                            }
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    int size3 = arrayList4.size();
                    int i6 = 0;
                    while (i6 < size3) {
                        Object obj6 = arrayList4.get(i6);
                        i6++;
                        i63 i63Var3 = (i63) obj6;
                        h63 h63Var4 = i63Var3.b;
                        if (nb3.k(h63Var4, g63Var)) {
                            h63Var4 = null;
                        }
                        h63 h63Var5 = i63Var3.c;
                        if (nb3.k(h63Var5, g63Var)) {
                            h63Var5 = null;
                        }
                        ArrayList C0 = fv.C0(new h63[]{h63Var4, h63Var5});
                        if (!C0.isEmpty()) {
                            int size4 = C0.size();
                            int i7 = 0;
                            while (i7 < size4) {
                                Object obj7 = C0.get(i7);
                                i7++;
                                h63 h63Var6 = (h63) obj7;
                                if (h63Var6 instanceof e63) {
                                    if (!list2.isEmpty()) {
                                        for (InputDevice inputDevice2 : list2) {
                                            if (inputDevice2.getMotionRange(((e63) h63Var6).b) != null) {
                                                arrayList5.add(obj6);
                                            }
                                        }
                                    }
                                } else if (h63Var6 instanceof f63) {
                                    if (!list2.isEmpty()) {
                                        for (InputDevice inputDevice3 : list2) {
                                            if (inputDevice3.hasKeys(((f63) h63Var6).b)[0]) {
                                                arrayList5.add(obj6);
                                            }
                                        }
                                    }
                                } else if (!nb3.k(h63Var6, g63Var)) {
                                    i.d();
                                    return null;
                                }
                            }
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(ht0.v0(arrayList5, 10));
                    int size5 = arrayList5.size();
                    int i8 = 0;
                    while (i8 < size5) {
                        Object obj8 = arrayList5.get(i8);
                        i8++;
                        arrayList6.add(((i63) obj8).a);
                    }
                    return new mz0(arrayList6);
                }
                return nz0.a;
            case 1:
                vz1 vz1Var = (vz1) this.Y;
                jz1 jz1Var = (jz1) this.Z;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                fk3 fk3Var = vz1Var.a;
                vr4 vr4Var = vz1Var.b;
                if (vr4Var != null) {
                    jf7Var = (jf7) vr4Var.A;
                } else {
                    jf7Var = null;
                }
                if (vr4Var != null) {
                    ff7Var = (ff7) vr4Var.B;
                } else {
                    ff7Var = null;
                }
                if (fk3Var == null || ff7Var == null || jf7Var == null) {
                    return null;
                }
                mk3 mk3Var2 = jf7Var.e.b;
                if (fk3Var.e) {
                    i = fk3Var.f;
                } else {
                    i = vz1Var.e;
                }
                int i9 = i;
                jq1 jq1Var = jz1Var.a;
                if (jq1Var != jq1.OFF && mk3Var2 != null) {
                    if (!jz1Var.b && !jz1Var.c) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    p66 p66Var = jz1Var.h;
                    if (p66Var == null) {
                        p66Var = lb4.r(jq1Var);
                    }
                    p66 p66Var2 = p66Var;
                    p66 p66Var3 = jz1Var.i;
                    if (p66Var3 == null) {
                        p66Var3 = lb4.q(jz1Var.a);
                    }
                    p66 p66Var4 = p66Var3;
                    z66 z66Var = ff7Var.a;
                    my4 my4Var = jf7Var.a;
                    int i10 = my4Var.a;
                    int i11 = my4Var.b;
                    boolean z8 = jz1Var.b;
                    boolean z9 = jz1Var.c;
                    if (jz1Var.d && z3) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (jz1Var.e && z3) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z66 X = sz1.X(z66Var, i10, i11, z8, z9, z4, z5, p66Var2);
                    z66 z66Var2 = ff7Var.b;
                    int i12 = mk3Var2.c;
                    int i13 = mk3Var2.d;
                    boolean z10 = jz1Var.b;
                    boolean z11 = jz1Var.c;
                    if (jz1Var.f && z3) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (jz1Var.g && z3) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    ff7Var = ff7.a(X, sz1.X(z66Var2, i12, i13, z10, z11, z6, z7, p66Var4));
                }
                return new w26(vz1Var.c, i9, vz1Var.d, fk3Var.d, ff7Var);
            case 2:
                List<lz5> list3 = (List) this.Y;
                List list4 = (List) this.Z;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                xh5 xh5Var = tz5.L;
                int k0 = c14.k0(ht0.v0(list4, 10));
                if (k0 < 16) {
                    k0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(k0);
                for (Object obj9 : list4) {
                    linkedHashMap.put(((kw5) obj9).a.toString(), obj9);
                }
                ArrayList arrayList7 = new ArrayList(ht0.v0(list3, 10));
                for (lz5 lz5Var : list3) {
                    kw5 kw5Var = (kw5) linkedHashMap.get(lz5Var.a.toString());
                    String str = lz5Var.c;
                    if (kw5Var != null) {
                        l = kw5Var.b;
                    } else {
                        l = null;
                    }
                    if (kw5Var == null || (jw5Var = kw5Var.c) == null) {
                        jw5Var = jw5.NOT_SCANNED;
                    }
                    arrayList7.add(new iz5(str, l, jw5Var));
                }
                return arrayList7;
            default:
                fk3 fk3Var2 = (fk3) this.Y;
                jf7 jf7Var2 = (jf7) this.Z;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                if (fk3Var2 == null || jf7Var2 == null) {
                    return null;
                }
                ci0 ci0Var = (ci0) obj4;
                ne1 ne1Var = (ne1) ci0Var.a;
                Map map = fk3Var2.g;
                ff7 ff7Var4 = (ff7) map.get(jf7Var2);
                if (ff7Var4 != null) {
                    c = ci0Var.k(ff7Var4, jf7Var2);
                } else {
                    ok3 ok3Var = jf7Var2.e;
                    mk3 mk3Var3 = ok3Var.b;
                    d83 d83Var = jf7Var2.b;
                    ko4 ko4Var = jf7Var2.c;
                    my4 my4Var2 = jf7Var2.a;
                    if (mk3Var3 != null) {
                        jf7 a2 = jf7.a(jf7Var2, new my4(0, 0), ko4.PORTRAIT, new ok3(mk3Var3, ok3Var.a), 2);
                        ArrayList arrayList8 = new ArrayList(map.size());
                        Iterator it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            arrayList8.add(new vr4(jf7.a((jf7) entry.getKey(), new my4(i3, i3), ko4.PORTRAIT, null, 18), entry.getValue()));
                            mk3Var3 = mk3Var3;
                            it = it;
                            i3 = 0;
                        }
                        mk3 mk3Var4 = mk3Var3;
                        ff7 ff7Var5 = (ff7) c14.r0(arrayList8).get(a2);
                        if (ff7Var5 != null) {
                            ff7Var2 = ff7.a(ff7Var5.b, ff7Var5.a);
                        } else {
                            ok3 a3 = ok3.a(ok3Var, mk3.a(mk3Var4));
                            ArrayList arrayList9 = new ArrayList(map.size());
                            for (Map.Entry entry2 : map.entrySet()) {
                                ok3 ok3Var2 = ((jf7) entry2.getKey()).e;
                                mk3 mk3Var5 = ((jf7) entry2.getKey()).e.b;
                                if (mk3Var5 != null) {
                                    mk3Var = mk3.a(mk3Var5);
                                } else {
                                    mk3Var = null;
                                }
                                arrayList9.add(new vr4(jf7.a((jf7) entry2.getKey(), null, null, ok3.a(ok3Var2, mk3Var), 15), entry2.getValue()));
                            }
                            ff7Var3 = (ff7) c14.r0(arrayList9).get(jf7.a(jf7Var2, null, null, a3, 15));
                            if (ff7Var3 == null) {
                                ff7 ff7Var6 = (ff7) map.get(jf7.a(jf7Var2, null, null, ok3.a(ok3Var, null), 15));
                                if (ff7Var6 != null) {
                                    z66 z66Var3 = ff7Var6.a;
                                    ff7 c2 = ne1Var.c(jf7Var2);
                                    Collection collection = z66Var3.c;
                                    if (collection == null) {
                                        collection = yt1.A;
                                    }
                                    ArrayList arrayList10 = new ArrayList(collection);
                                    gt0.W0(arrayList10, new h37(12));
                                    List list5 = c2.a.c;
                                    if (list5 != null) {
                                        ArrayList arrayList11 = new ArrayList();
                                        for (Object obj10 : list5) {
                                            if (((j05) obj10).b.isScreen()) {
                                                arrayList11.add(obj10);
                                            }
                                        }
                                        arrayList10.addAll(0, arrayList11);
                                    }
                                    ff7Var2 = ff7.a(z66.a(z66Var3, null, null, arrayList10, 3), c2.b);
                                }
                            }
                            ff7Var2 = ff7Var3;
                        }
                        if (ff7Var2 == null) {
                            c = ci0Var.k(ff7Var2, jf7Var2);
                        } else {
                            c = ne1Var.c(jf7Var2);
                        }
                    }
                    Iterator it2 = map.entrySet().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj3 = it2.next();
                            Map.Entry entry3 = (Map.Entry) obj3;
                            if (((jf7) entry3.getKey()).c != ko4Var || !nb3.k(((jf7) entry3.getKey()).a, my4Var2)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    Map.Entry entry4 = (Map.Entry) obj3;
                    if (entry4 == null) {
                        Iterator it3 = map.entrySet().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                r4 = it3.next();
                                if (((jf7) ((Map.Entry) r4).getKey()).c == ko4Var) {
                                }
                            } else {
                                r4 = 0;
                            }
                        }
                        entry4 = r4;
                    }
                    if (entry4 != null) {
                        jf7 jf7Var3 = (jf7) entry4.getKey();
                        ff7Var3 = (ff7) entry4.getValue();
                        my4 my4Var3 = jf7Var3.a;
                        d83 d83Var2 = jf7Var3.b;
                        if (!nb3.k(my4Var3, my4Var2) || !nb3.k(d83Var2, d83Var)) {
                            if (nb3.k(my4Var3, my4Var2)) {
                                int i14 = d83Var2.c;
                                int i15 = d83Var2.a;
                                if (new d83(i14, d83Var2.d, i15, d83Var2.b).equals(d83Var)) {
                                    int i16 = (-i15) + d83Var2.c;
                                    List<j05> list6 = ff7Var3.a.c;
                                    if (list6 != null) {
                                        arrayList3 = new ArrayList(ht0.v0(list6, 10));
                                        for (j05 j05Var2 : list6) {
                                            Rect rect = j05Var2.a;
                                            arrayList3.add(j05.a(j05Var2, Rect.copy$default(rect, rect.getX() + i16, 0, 0, 0, 14, null)));
                                        }
                                    } else {
                                        arrayList3 = null;
                                    }
                                    ff7Var2 = ff7.b(ff7Var3, z66.a(ff7Var3.a, null, null, arrayList3, 3), null, 2);
                                }
                            } else {
                                int i17 = my4Var3.a;
                                float f2 = 1.0f;
                                if (i17 > 0) {
                                    f = my4Var2.a / i17;
                                } else {
                                    f = 1.0f;
                                }
                                int i18 = my4Var3.b;
                                if (i18 > 0) {
                                    f2 = my4Var2.b / i18;
                                }
                                ff7 c3 = ne1Var.c(jf7Var2);
                                List<j05> list7 = ff7Var3.a.c;
                                if (list7 != null) {
                                    arrayList2 = new ArrayList(ht0.v0(list7, 10));
                                    for (j05 j05Var3 : list7) {
                                        nj3 nj3Var = j05Var3.b;
                                        Rect rect2 = j05Var3.a;
                                        if (nj3Var.isScreen()) {
                                            List list8 = c3.a.c;
                                            if (list8 != null) {
                                                Iterator it4 = list8.iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        r11 = it4.next();
                                                        if (((j05) r11).b == j05Var3.b) {
                                                        }
                                                    } else {
                                                        r11 = 0;
                                                    }
                                                }
                                                j05Var = r11;
                                            } else {
                                                j05Var = null;
                                            }
                                            if (j05Var != null) {
                                                a = j05.a(j05Var3, j05Var.a);
                                            } else {
                                                int width = (int) (rect2.getWidth() * f);
                                                a = j05.a(j05Var3, new Rect((int) (rect2.getX() * f), (int) (rect2.getY() * f2), width, (int) (width / 1.3333334f)));
                                            }
                                        } else {
                                            a = j05.a(j05Var3, new Rect((int) (rect2.getX() * f), (int) (rect2.getY() * f2), (int) (rect2.getWidth() * f), (int) (rect2.getHeight() * f2)));
                                        }
                                        arrayList2.add(a);
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                ff7Var2 = ff7.b(ff7Var3, z66.a(ff7Var3.a, null, null, arrayList2, 3), null, 2);
                            }
                        }
                        ff7Var2 = ff7Var3;
                    } else {
                        ff7Var2 = null;
                    }
                    if (ff7Var2 == null) {
                    }
                }
                return new vr4(jf7Var2, c);
        }
    }
}
