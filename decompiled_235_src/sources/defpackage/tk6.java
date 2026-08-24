package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tk6  reason: default package */
/* loaded from: classes.dex */
public final class tk6 extends hw6 implements eo2 {
    public String X;
    public pj4 Y;
    public List Z;
    public vj4 d0;
    public Map e0;
    public Map f0;
    public List g0;
    public Iterator h0;
    public ek4 i0;
    public int j0;
    public int k0;
    public final /* synthetic */ vk6 l0;
    public final /* synthetic */ Set m0;
    public final /* synthetic */ String n0;
    public final /* synthetic */ String o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk6(vk6 vk6Var, Set set, String str, String str2, r41 r41Var) {
        super(2, r41Var);
        this.l0 = vk6Var;
        this.m0 = set;
        this.n0 = str;
        this.o0 = str2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((tk6) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new tk6(this.l0, this.m0, this.n0, this.o0, r41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0534, code lost:
        if (r9 > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x05e6, code lost:
        if (defpackage.qs6.v0(r0) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x05f6, code lost:
        if (defpackage.nj2.y(r8) != false) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e9  */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v52, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Enum, yk6] */
    /* JADX WARN: Type inference failed for: r9v40, types: [vj4, pj4] */
    /* JADX WARN: Type inference failed for: r9v50, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:213:0x0795 -> B:214:0x07a3). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object obj2;
        String str;
        Object g;
        pj4 pj4Var;
        oj4 oj4Var;
        String str2;
        Object b;
        String str3;
        List list;
        boolean z;
        vj4 vj4Var;
        yt1 yt1Var;
        pj4 pj4Var2;
        vj4 vj4Var2;
        List list2;
        Map map;
        Object obj3;
        Throwable a;
        yt1 yt1Var2;
        ArrayList arrayList;
        Iterator it;
        Map map2;
        String str4;
        int i;
        LinkedHashMap linkedHashMap;
        List list3;
        Object obj4;
        String str5;
        String str6;
        String str7;
        Iterator it2;
        String str8;
        String str9;
        List list4;
        Map map3;
        Object obj5;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList2;
        ek4 ek4Var;
        vk6 vk6Var;
        int i2;
        x61 x61Var;
        x61 x61Var2;
        String str10;
        Object obj6;
        String str11;
        Object obj7;
        boolean z2;
        ek4 ek4Var2;
        ArrayList arrayList3;
        String str12;
        LinkedHashMap linkedHashMap3;
        Map map4;
        List list5;
        int i3;
        Iterator it3;
        Throwable th;
        String message;
        String str13;
        Throwable th2;
        String str14;
        boolean z3;
        gk4 gk4Var;
        boolean z4;
        String str15;
        Object obj8;
        vk6 vk6Var2;
        String str16;
        oj4 oj4Var2;
        Object obj9;
        String str17;
        Object obj10;
        Map map5;
        String str18;
        String str19;
        Object a2;
        Object obj11;
        yk6 yk6Var;
        boolean z5;
        Object obj12;
        String str20;
        boolean z6;
        tk6 tk6Var = this;
        vk6 vk6Var3 = tk6Var.l0;
        oj4 oj4Var3 = vk6Var3.b;
        x61 x61Var3 = x61.COROUTINE_SUSPENDED;
        int i4 = tk6Var.k0;
        yt1 yt1Var3 = yt1.A;
        String str21 = tk6Var.o0;
        Set set = tk6Var.m0;
        String str22 = tk6Var.n0;
        String str23 = "smart_sync_failed";
        Object obj13 = "error";
        String str24 = "reason";
        String str25 = "smart_sync_unlock_skipped";
        String str26 = "filter";
        Object obj14 = "hardcore";
        Object obj15 = "achievement_id";
        if (i4 != 0) {
            if (i4 != 1) {
                obj2 = null;
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 == 5) {
                                int i5 = tk6Var.j0;
                                ek4 ek4Var3 = tk6Var.i0;
                                Iterator it4 = tk6Var.h0;
                                ?? r5 = tk6Var.g0;
                                ?? r9 = tk6Var.f0;
                                Map map6 = tk6Var.e0;
                                List list6 = tk6Var.Z;
                                String str27 = tk6Var.X;
                                oi2.Y(obj);
                                a2 = ((hm5) obj).A;
                                vk6Var2 = vk6Var3;
                                oj4Var2 = oj4Var3;
                                str19 = "smart_sync_failed";
                                obj9 = obj13;
                                str15 = str25;
                                obj8 = obj14;
                                obj10 = obj15;
                                str18 = null;
                                i = i5;
                                str16 = "filter";
                                map5 = map6;
                                list3 = list6;
                                arrayList = r5;
                                linkedHashMap = r9;
                                it = it4;
                                ek4 ek4Var4 = ek4Var3;
                                String str28 = str27;
                                str17 = "reason";
                                Throwable a3 = hm5.a(a2);
                                if (a3 != null) {
                                    tk6Var = this;
                                    str4 = str28;
                                    str24 = str17;
                                    str26 = str16;
                                    str25 = str15;
                                    map2 = map5;
                                    obj13 = obj9;
                                    str23 = str19;
                                    obj15 = obj10;
                                    obj2 = str18;
                                    obj14 = obj8;
                                    oj4Var = oj4Var2;
                                    vk6Var3 = vk6Var2;
                                    if (!it.hasNext()) {
                                        ek4 ek4Var5 = ((wk6) it.next()).a;
                                        long j = ek4Var5.e;
                                        str6 = str23;
                                        gk4 gk4Var2 = ek4Var5.k;
                                        str7 = str26;
                                        Object obj16 = (String) map2.get(new Long(j));
                                        x61Var2 = x61Var3;
                                        o75 o75Var = (o75) linkedHashMap.get(new Long(j));
                                        int i6 = i;
                                        if (o75Var != null) {
                                            obj11 = o75Var.l;
                                        } else {
                                            obj11 = obj2;
                                        }
                                        if (obj16 == null) {
                                            yk6Var = yk6.NOT_IN_PREFETCH_CACHE;
                                        } else if (obj11 == null) {
                                            yk6Var = yk6.MISSING_FROM_CURRENT_SET;
                                        } else if (!obj11.equals(obj16)) {
                                            yk6Var = yk6.DEFINITION_CHANGED;
                                        } else if (o75Var.m == n75.UNOFFICIAL) {
                                            yk6Var = yk6.SERVER_REJECTED;
                                        } else {
                                            yk6Var = obj2;
                                        }
                                        if (yk6Var != 0) {
                                            if (yk6Var == yk6.SERVER_REJECTED) {
                                                str20 = "unofficial achievement in current RA set";
                                            } else {
                                                str20 = obj2;
                                            }
                                            Iterator it5 = it;
                                            LinkedHashMap linkedHashMap4 = linkedHashMap;
                                            vr4 vr4Var = new vr4(obj15, new Long(j));
                                            vr4 vr4Var2 = new vr4(str24, yk6Var.name());
                                            str12 = str24;
                                            vr4 vr4Var3 = new vr4("detail", str20);
                                            if (gk4Var2 == gk4.HARDCORE) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            Map map7 = map2;
                                            Object obj17 = obj14;
                                            str9 = str25;
                                            vk6Var3.c(str9, vr4Var, vr4Var2, vr4Var3, new vr4(obj17, Boolean.valueOf(z6)));
                                            arrayList.add(new zk6(j, yk6Var, str20));
                                            ArrayList arrayList4 = arrayList;
                                            list5 = list3;
                                            arrayList3 = arrayList4;
                                            str8 = str4;
                                            obj7 = obj17;
                                            str10 = str7;
                                            obj6 = obj15;
                                            str11 = str6;
                                            linkedHashMap3 = linkedHashMap4;
                                            map4 = map7;
                                            vk6Var = vk6Var3;
                                            ek4Var2 = ek4Var5;
                                            i3 = i6;
                                            it3 = it5;
                                            long j2 = ek4Var2.d;
                                            long j3 = ek4Var2.e;
                                            vk6 vk6Var4 = vk6Var;
                                            gk4Var = ek4Var2.k;
                                            String str29 = str10;
                                            if (gk4Var == gk4.HARDCORE) {
                                            }
                                            long j4 = ek4Var2.a;
                                            str15 = str9;
                                            ik4 ik4Var = ek4Var2.l;
                                            this.X = str8;
                                            this.Y = null;
                                            this.Z = list5;
                                            this.d0 = null;
                                            this.e0 = map4;
                                            this.f0 = linkedHashMap3;
                                            this.g0 = arrayList3;
                                            this.h0 = it3;
                                            this.i0 = ek4Var2;
                                            this.j0 = i3;
                                            this.k0 = 5;
                                            ArrayList arrayList5 = arrayList3;
                                            String str30 = str8;
                                            int i7 = i3;
                                            obj8 = obj7;
                                            vk6Var2 = vk6Var4;
                                            x61Var3 = x61Var2;
                                            String str31 = str11;
                                            str16 = str29;
                                            Iterator it6 = it3;
                                            oj4Var2 = oj4Var;
                                            obj9 = obj13;
                                            ek4 ek4Var6 = ek4Var2;
                                            str17 = str12;
                                            obj10 = obj6;
                                            LinkedHashMap linkedHashMap5 = linkedHashMap3;
                                            map5 = map4;
                                            str18 = null;
                                            List list7 = list5;
                                            str19 = str31;
                                            a2 = oj4Var2.a(this.o0, this.n0, j2, j3, z4, j4, gk4Var, ik4Var, this);
                                            if (a2 == x61Var3) {
                                            }
                                        } else {
                                            Iterator it7 = it;
                                            str5 = str24;
                                            LinkedHashMap linkedHashMap6 = linkedHashMap;
                                            Map map8 = map2;
                                            str9 = str25;
                                            Object obj18 = obj14;
                                            long j5 = ek4Var5.e;
                                            if (gk4Var2 == gk4.HARDCORE) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            long j6 = ek4Var5.h;
                                            if (j6 > 0) {
                                                long longValue = (((Number) vk6Var3.d.c()).longValue() - j6) / 1000;
                                                if (longValue < 0) {
                                                    longValue = 0;
                                                }
                                                if (longValue > 1209600) {
                                                    longValue = 1209600;
                                                }
                                                int i8 = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
                                                obj12 = Long.valueOf(longValue);
                                            }
                                            obj12 = obj2;
                                            tk6Var.X = str4;
                                            ?? r92 = obj2;
                                            tk6Var.Y = r92;
                                            tk6Var.Z = list3;
                                            tk6Var.d0 = r92;
                                            map3 = map8;
                                            tk6Var.e0 = map3;
                                            tk6Var.f0 = linkedHashMap6;
                                            tk6Var.g0 = arrayList;
                                            it2 = it7;
                                            tk6Var.h0 = it2;
                                            tk6Var.i0 = ek4Var5;
                                            tk6Var.j0 = i6;
                                            tk6Var.k0 = 4;
                                            List list8 = list3;
                                            String str32 = str4;
                                            obj4 = obj18;
                                            Object a4 = vk6.a(vk6Var3, j5, z5, tk6Var.n0, obj12, tk6Var);
                                            vk6Var = vk6Var3;
                                            x61Var = x61Var2;
                                            if (a4 == x61Var) {
                                                return x61Var;
                                            }
                                            arrayList2 = arrayList;
                                            linkedHashMap2 = linkedHashMap6;
                                            list4 = list8;
                                            ek4Var = ek4Var5;
                                            str8 = str32;
                                            obj5 = a4;
                                            i2 = i6;
                                            if (!(obj5 instanceof em5)) {
                                                Throwable a5 = hm5.a(obj5);
                                                String str33 = "unknown";
                                                if (nj2.y(a5)) {
                                                    if (!(a5 instanceof kh7) || (message = ((kh7) a5).getMessage()) == null) {
                                                        x61Var2 = x61Var;
                                                        th2 = a5;
                                                    } else {
                                                        Pattern compile = Pattern.compile("\"Error\"\\s*:\\s*\"([^\"]+)\"");
                                                        compile.getClass();
                                                        Matcher matcher = compile.matcher(message);
                                                        matcher.getClass();
                                                        n14 k = kn2.k(matcher, 0, message);
                                                        if (k != null && (str14 = (String) gt0.K0(1, k.a())) != null) {
                                                            x61Var2 = x61Var;
                                                            String replace = str14.replace('_', ' ');
                                                            replace.getClass();
                                                            str13 = qs6.T0(replace).toString();
                                                            if (str13 != null) {
                                                            }
                                                        } else {
                                                            x61Var2 = x61Var;
                                                        }
                                                        str13 = null;
                                                        if (str13 == null) {
                                                            th2 = a5;
                                                        } else {
                                                            message = str13;
                                                            th2 = a5;
                                                        }
                                                        obj6 = obj15;
                                                        vr4 vr4Var4 = new vr4(obj6, new Long(ek4Var.e));
                                                        LinkedHashMap linkedHashMap7 = linkedHashMap2;
                                                        String str34 = str5;
                                                        vr4 vr4Var5 = new vr4(str34, "SERVER_REJECTED");
                                                        Map map9 = map3;
                                                        if (ek4Var.k != gk4.HARDCORE) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        Iterator it8 = it2;
                                                        obj7 = obj4;
                                                        vr4 vr4Var6 = new vr4(obj7, Boolean.valueOf(z3));
                                                        if (th2 != null) {
                                                            str33 = th2.getClass().getSimpleName();
                                                        }
                                                        vk6Var.c(str9, vr4Var4, vr4Var5, vr4Var6, new vr4(obj13, str33));
                                                        arrayList2.add(new zk6(ek4Var.e, yk6.SERVER_REJECTED, message));
                                                        ek4Var2 = ek4Var;
                                                        str12 = str34;
                                                        str10 = str7;
                                                        map4 = map9;
                                                        it3 = it8;
                                                        str11 = str6;
                                                        list5 = list4;
                                                        i3 = i2;
                                                        arrayList3 = arrayList2;
                                                        linkedHashMap3 = linkedHashMap7;
                                                    }
                                                    message = null;
                                                    obj6 = obj15;
                                                    vr4 vr4Var42 = new vr4(obj6, new Long(ek4Var.e));
                                                    LinkedHashMap linkedHashMap72 = linkedHashMap2;
                                                    String str342 = str5;
                                                    vr4 vr4Var52 = new vr4(str342, "SERVER_REJECTED");
                                                    Map map92 = map3;
                                                    if (ek4Var.k != gk4.HARDCORE) {
                                                    }
                                                    Iterator it82 = it2;
                                                    obj7 = obj4;
                                                    vr4 vr4Var62 = new vr4(obj7, Boolean.valueOf(z3));
                                                    if (th2 != null) {
                                                    }
                                                    vk6Var.c(str9, vr4Var42, vr4Var52, vr4Var62, new vr4(obj13, str33));
                                                    arrayList2.add(new zk6(ek4Var.e, yk6.SERVER_REJECTED, message));
                                                    ek4Var2 = ek4Var;
                                                    str12 = str342;
                                                    str10 = str7;
                                                    map4 = map92;
                                                    it3 = it82;
                                                    str11 = str6;
                                                    list5 = list4;
                                                    i3 = i2;
                                                    arrayList3 = arrayList2;
                                                    linkedHashMap3 = linkedHashMap72;
                                                } else {
                                                    Object obj19 = obj13;
                                                    vr4 vr4Var7 = new vr4(str7, str8);
                                                    vr4 vr4Var8 = new vr4(str5, "award_failed");
                                                    vr4 vr4Var9 = new vr4(obj15, new Long(ek4Var.e));
                                                    if (a5 != null) {
                                                        str33 = a5.getClass().getSimpleName();
                                                    }
                                                    vk6Var.c(str6, vr4Var7, vr4Var8, vr4Var9, new vr4(obj19, str33), new vr4("submitted_so_far", new Integer(i2)));
                                                    if (a5 == null) {
                                                        th = new IllegalStateException("Award failed");
                                                    } else {
                                                        th = a5;
                                                    }
                                                    return new hm5(new em5(th));
                                                }
                                            } else {
                                                x61Var2 = x61Var;
                                                LinkedHashMap linkedHashMap8 = linkedHashMap2;
                                                Map map10 = map3;
                                                List list9 = list4;
                                                str10 = str7;
                                                Object obj20 = obj13;
                                                obj6 = obj15;
                                                str11 = str6;
                                                String str35 = str5;
                                                Iterator it9 = it2;
                                                obj7 = obj4;
                                                vr4 vr4Var10 = new vr4(obj6, new Long(ek4Var.e));
                                                if (ek4Var.k == gk4.HARDCORE) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                vk6Var.c("smart_sync_unlock_submitted", vr4Var10, new vr4(obj7, Boolean.valueOf(z2)));
                                                int i9 = i2 + 1;
                                                vy7.P(i2);
                                                ek4Var2 = ek4Var;
                                                arrayList3 = arrayList2;
                                                str12 = str35;
                                                obj13 = obj20;
                                                linkedHashMap3 = linkedHashMap8;
                                                map4 = map10;
                                                list5 = list9;
                                                i3 = i9;
                                                it3 = it9;
                                            }
                                            long j22 = ek4Var2.d;
                                            long j32 = ek4Var2.e;
                                            vk6 vk6Var42 = vk6Var;
                                            gk4Var = ek4Var2.k;
                                            String str292 = str10;
                                            if (gk4Var == gk4.HARDCORE) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            long j42 = ek4Var2.a;
                                            str15 = str9;
                                            ik4 ik4Var2 = ek4Var2.l;
                                            this.X = str8;
                                            this.Y = null;
                                            this.Z = list5;
                                            this.d0 = null;
                                            this.e0 = map4;
                                            this.f0 = linkedHashMap3;
                                            this.g0 = arrayList3;
                                            this.h0 = it3;
                                            this.i0 = ek4Var2;
                                            this.j0 = i3;
                                            this.k0 = 5;
                                            ArrayList arrayList52 = arrayList3;
                                            String str302 = str8;
                                            int i72 = i3;
                                            obj8 = obj7;
                                            vk6Var2 = vk6Var42;
                                            x61Var3 = x61Var2;
                                            String str312 = str11;
                                            str16 = str292;
                                            Iterator it62 = it3;
                                            oj4Var2 = oj4Var;
                                            obj9 = obj13;
                                            ek4 ek4Var62 = ek4Var2;
                                            str17 = str12;
                                            obj10 = obj6;
                                            LinkedHashMap linkedHashMap52 = linkedHashMap3;
                                            map5 = map4;
                                            str18 = null;
                                            List list72 = list5;
                                            str19 = str312;
                                            a2 = oj4Var2.a(this.o0, this.n0, j22, j32, z4, j42, gk4Var, ik4Var2, this);
                                            if (a2 == x61Var3) {
                                                return x61Var3;
                                            }
                                            arrayList = arrayList52;
                                            i = i72;
                                            ek4Var4 = ek4Var62;
                                            linkedHashMap = linkedHashMap52;
                                            it = it62;
                                            str28 = str302;
                                            list3 = list72;
                                            Throwable a32 = hm5.a(a2);
                                            if (a32 != null) {
                                                vr4 vr4Var11 = new vr4(str16, str28);
                                                vr4 vr4Var12 = new vr4(str17, "ledger_ack_failed");
                                                vr4 vr4Var13 = new vr4(obj10, new Long(ek4Var4.e));
                                                String message2 = a32.getMessage();
                                                if (message2 == null) {
                                                    message2 = a32.getClass().getSimpleName();
                                                }
                                                vk6Var2.c(str19, vr4Var11, vr4Var12, vr4Var13, new vr4(obj9, message2));
                                                return new hm5(new em5(a32));
                                            }
                                        }
                                    } else {
                                        List list10 = list3;
                                        vk6Var3.c("smart_sync_completed", new vr4(str26, str4), new vr4("submitted", new Integer(i)), new vr4("skipped", new Integer(arrayList.size())), new vr4("total", new Integer(list10.size())));
                                        return new hm5(new xk6(i, arrayList, list10.size()));
                                    }
                                }
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            i2 = tk6Var.j0;
                            ek4 ek4Var7 = tk6Var.i0;
                            Iterator it10 = tk6Var.h0;
                            ?? r4 = tk6Var.g0;
                            ?? r52 = tk6Var.f0;
                            map3 = tk6Var.e0;
                            list4 = tk6Var.Z;
                            str8 = tk6Var.X;
                            oi2.Y(obj);
                            vk6Var = vk6Var3;
                            x61Var = x61Var3;
                            it2 = it10;
                            ek4Var = ek4Var7;
                            oj4Var = oj4Var3;
                            str7 = "filter";
                            str5 = "reason";
                            obj5 = ((hm5) obj).A;
                            str6 = "smart_sync_failed";
                            str9 = str25;
                            obj4 = obj14;
                            arrayList2 = r4;
                            linkedHashMap2 = r52;
                            if (!(obj5 instanceof em5)) {
                            }
                            long j222 = ek4Var2.d;
                            long j322 = ek4Var2.e;
                            vk6 vk6Var422 = vk6Var;
                            gk4Var = ek4Var2.k;
                            String str2922 = str10;
                            if (gk4Var == gk4.HARDCORE) {
                            }
                            long j422 = ek4Var2.a;
                            str15 = str9;
                            ik4 ik4Var22 = ek4Var2.l;
                            this.X = str8;
                            this.Y = null;
                            this.Z = list5;
                            this.d0 = null;
                            this.e0 = map4;
                            this.f0 = linkedHashMap3;
                            this.g0 = arrayList3;
                            this.h0 = it3;
                            this.i0 = ek4Var2;
                            this.j0 = i3;
                            this.k0 = 5;
                            ArrayList arrayList522 = arrayList3;
                            String str3022 = str8;
                            int i722 = i3;
                            obj8 = obj7;
                            vk6Var2 = vk6Var422;
                            x61Var3 = x61Var2;
                            String str3122 = str11;
                            str16 = str2922;
                            Iterator it622 = it3;
                            oj4Var2 = oj4Var;
                            obj9 = obj13;
                            ek4 ek4Var622 = ek4Var2;
                            str17 = str12;
                            obj10 = obj6;
                            LinkedHashMap linkedHashMap522 = linkedHashMap3;
                            map5 = map4;
                            str18 = null;
                            List list722 = list5;
                            str19 = str3122;
                            a2 = oj4Var2.a(this.o0, this.n0, j222, j322, z4, j422, gk4Var, ik4Var22, this);
                            if (a2 == x61Var3) {
                            }
                        }
                    } else {
                        map = tk6Var.e0;
                        vj4Var2 = tk6Var.d0;
                        list2 = tk6Var.Z;
                        pj4Var2 = tk6Var.Y;
                        str3 = tk6Var.X;
                        oi2.Y(obj);
                        obj3 = ((hm5) obj).A;
                        yt1Var = yt1Var3;
                        oj4Var = oj4Var3;
                        a = hm5.a(obj3);
                        if (a != null) {
                            da5 da5Var = (da5) obj3;
                            List list11 = list2;
                            long j7 = da5Var.a;
                            Map map11 = map;
                            long j8 = vj4Var2.b;
                            if (j7 != j8) {
                                vk6Var3.c(str23, new vr4("filter", str3), new vr4("reason", "game_id_mismatch"), new vr4("expected", new Long(j8)), new vr4("actual", new Long(da5Var.a)));
                                return new hm5(new em5(new IllegalStateException("Game ID mismatch")));
                            }
                            ev evVar = new ev(da5Var.e, 1);
                            r76 r76Var = new r76(11);
                            tb6 tb6Var = tb6.d0;
                            qd2 qd2Var = new qd2(evVar, r76Var);
                            LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                            oc2 oc2Var = new oc2(qd2Var);
                            while (oc2Var.hasNext()) {
                                Object next = oc2Var.next();
                                linkedHashMap9.put(new Long(((o75) next).a), next);
                                str3 = str3;
                            }
                            String str36 = str3;
                            Map map12 = pj4Var2.c;
                            list11.getClass();
                            map12.getClass();
                            if (list11.isEmpty()) {
                                yt1Var2 = yt1Var;
                            } else {
                                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                                for (Object obj21 : list11) {
                                    String str37 = ((ek4) obj21).g;
                                    if (qs6.v0(str37)) {
                                        str37 = "__unknown__";
                                    }
                                    Object obj22 = linkedHashMap10.get(str37);
                                    if (obj22 == null) {
                                        obj22 = new ArrayList();
                                        linkedHashMap10.put(str37, obj22);
                                    }
                                    ((List) obj22).add(obj21);
                                }
                                List<String> d1 = gt0.d1(linkedHashMap10.keySet(), new ix1(new lv(new ko5(1, map12), map12), 5));
                                ?? arrayList6 = new ArrayList();
                                for (String str38 : d1) {
                                    List list12 = (List) linkedHashMap10.get(str38);
                                    if (list12 == null) {
                                        list12 = yt1Var;
                                    }
                                    for (ek4 ek4Var8 : gt0.d1(list12, new ix1(new ix1(new tp5(9), 6), 7))) {
                                        arrayList6.add(new wk6(ek4Var8));
                                    }
                                }
                                yt1Var2 = arrayList6;
                            }
                            arrayList = new ArrayList();
                            it = yt1Var2.iterator();
                            map2 = map11;
                            str4 = str36;
                            i = 0;
                            linkedHashMap = linkedHashMap9;
                            list3 = list11;
                            if (!it.hasNext()) {
                            }
                        } else {
                            vk6Var3.c(str23, new vr4("filter", str3), new vr4("reason", "fetch_current_set_failed"), new vr4(obj13, a.getClass().getSimpleName()));
                            return new hm5(new em5(a));
                        }
                    }
                } else {
                    list = tk6Var.Z;
                    pj4Var = tk6Var.Y;
                    String str39 = tk6Var.X;
                    oi2.Y(obj);
                    str3 = str39;
                    oj4Var = oj4Var3;
                    str2 = "smart_sync_failed";
                    b = obj;
                    vj4Var = (vj4) b;
                    if (vj4Var != null) {
                        vk6Var3.c(str2, new vr4("filter", str3), new vr4("reason", "prefetch_cache_missing"), new vr4("pending", new Integer(list.size())));
                        return new hm5(new em5(new IllegalStateException("Prefetch cache missing")));
                    }
                    str23 = str2;
                    List list13 = vj4Var.c;
                    int k0 = c14.k0(ht0.v0(list13, 10));
                    if (k0 < 16) {
                        k0 = 16;
                    }
                    LinkedHashMap linkedHashMap11 = new LinkedHashMap(k0);
                    Iterator it11 = list13.iterator();
                    while (it11.hasNext()) {
                        sj4 sj4Var = (sj4) it11.next();
                        linkedHashMap11.put(new Long(sj4Var.a), sj4Var.b);
                        it11 = it11;
                        yt1Var3 = yt1Var3;
                    }
                    yt1Var = yt1Var3;
                    s35 s35Var = vk6Var3.a;
                    tk6Var.X = str3;
                    tk6Var.Y = pj4Var;
                    tk6Var.Z = list;
                    tk6Var.d0 = vj4Var;
                    tk6Var.e0 = linkedHashMap11;
                    tk6Var.k0 = 3;
                    Object v = s35Var.v(str22, tk6Var);
                    if (v != x61Var3) {
                        pj4Var2 = pj4Var;
                        vj4Var2 = vj4Var;
                        list2 = list;
                        map = linkedHashMap11;
                        obj3 = v;
                        a = hm5.a(obj3);
                        if (a != null) {
                        }
                    } else {
                        return x61Var3;
                    }
                }
            } else {
                obj2 = null;
                str = tk6Var.X;
                oi2.Y(obj);
                g = obj;
            }
        } else {
            obj2 = null;
            oi2.Y(obj);
            if (!((Boolean) vk6Var3.f.c()).booleanValue()) {
                return new hm5(new em5(new IllegalStateException("Built-in SmartSync is disabled for the effective RA backend")));
            }
            if (set != null) {
                str = gt0.P0(set, ",", null, null, new r76(10), 30);
            } else {
                str = "ALL";
            }
            vk6Var3.c("smart_sync_started", new vr4("filter", str), new vr4("content_id", str22));
            tk6Var.X = str;
            tk6Var.k0 = 1;
            g = oj4Var3.g(str21, str22, tk6Var);
            if (g == x61Var3) {
                return x61Var3;
            }
        }
        pj4Var = (pj4) g;
        ui4 ui4Var = pj4Var.a;
        oj4Var = oj4Var3;
        if (ui4Var != ui4.OK) {
            vr4 vr4Var14 = new vr4("filter", str);
            String lowerCase = ui4Var.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            vk6Var3.c("smart_sync_failed", vr4Var14, new vr4("reason", "ledger_integrity_".concat(lowerCase)));
            return new hm5(new em5(new IllegalStateException("Ledger integrity is " + pj4Var.a)));
        }
        Long l = pj4Var.e;
        if (l != null && l.longValue() <= 0) {
            vk6Var3.c("smart_sync_failed", new vr4("filter", str), new vr4("reason", "ledger_expired"), new vr4("content_id", str22), new vr4("pending", new Integer(pj4Var.b())));
            return new hm5(new em5(new IllegalStateException("Offline achievements ledger expired")));
        }
        List list14 = pj4Var.b;
        ArrayList arrayList7 = new ArrayList();
        Iterator it12 = list14.iterator();
        while (it12.hasNext()) {
            Object next2 = it12.next();
            Iterator it13 = it12;
            ek4 ek4Var9 = (ek4) next2;
            String str40 = str23;
            if (set != null) {
                z = set.contains(ek4Var9.k);
            } else {
                z = true;
            }
            if (z && ek4Var9.k == gk4.SOFTCORE) {
                arrayList7.add(next2);
            }
            it12 = it13;
            str23 = str40;
        }
        str2 = str23;
        if (arrayList7.isEmpty()) {
            vk6Var3.c("smart_sync_no_pending", new vr4("filter", str));
            return new hm5(new xk6(0, yt1Var3, 0));
        }
        ck4 ck4Var = vk6Var3.c;
        tk6Var.X = str;
        tk6Var.Y = pj4Var;
        tk6Var.Z = arrayList7;
        tk6Var.k0 = 2;
        b = ck4Var.b(str21, str22, tk6Var);
        if (b != x61Var3) {
            str3 = str;
            list = arrayList7;
            vj4Var = (vj4) b;
            if (vj4Var != null) {
            }
        } else {
            return x61Var3;
        }
    }
}
