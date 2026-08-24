package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import defpackage.ik3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bi2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bi2 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ bi2(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0360, code lost:
        if (r0 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0270, code lost:
        if (defpackage.ks3.b(r1) != false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:388:0x088e  */
    @Override // defpackage.qn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        vr4 vr4Var;
        Object obj2;
        Object ue7Var;
        Object g;
        Object obj3;
        Typeface e;
        Object obj4;
        Object em5Var;
        s83 s83Var;
        String str;
        long j;
        mc4 mc4Var;
        ut3 lifecycle;
        boolean z = true;
        int i = 0;
        switch (this.A) {
            case 0:
                Throwable th = (Throwable) obj;
                ((r94) this.B).b((t93) this.L);
                return jg7.a;
            case 1:
                mi2 mi2Var = (mi2) this.B;
                te7 te7Var = (te7) this.L;
                qn2 qn2Var = (qn2) obj;
                ri2 ri2Var = mi2Var.d;
                rh rhVar = mi2Var.a;
                bg2 bg2Var = mi2Var.f;
                ri2Var.getClass();
                li2 li2Var = te7Var.a;
                if (!(li2Var instanceof pi2)) {
                    obj2 = null;
                    ue7Var = null;
                } else {
                    List list = ((pi2) li2Var).R;
                    oj2 oj2Var = te7Var.b;
                    int i2 = te7Var.c;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        Object obj5 = list.get(i3);
                        if (nb3.k(((ll5) obj5).b, oj2Var) && i2 == 0) {
                            arrayList.add(obj5);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size2 = list.size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            Object obj6 = list.get(i4);
                            ((ll5) obj6).getClass();
                            if (i2 == 0) {
                                arrayList2.add(obj6);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list = arrayList2;
                        }
                        int compareTo = oj2Var.compareTo(oj2.B);
                        int i5 = oj2Var.A;
                        if (compareTo < 0) {
                            int size3 = list.size();
                            oj2 oj2Var2 = null;
                            oj2 oj2Var3 = null;
                            int i6 = 0;
                            while (true) {
                                if (i6 < size3) {
                                    oj2 oj2Var4 = ((ll5) list.get(i6)).b;
                                    int i7 = oj2Var4.A;
                                    if (nb3.p(i7, i5) < 0) {
                                        if (oj2Var2 == null || nb3.p(i7, oj2Var2.A) > 0) {
                                            oj2Var2 = oj2Var4;
                                        }
                                    } else if (nb3.p(i7, i5) > 0) {
                                        if (oj2Var3 == null || nb3.p(i7, oj2Var3.A) < 0) {
                                            oj2Var3 = oj2Var4;
                                        }
                                    } else {
                                        oj2Var2 = oj2Var4;
                                        oj2Var3 = oj2Var2;
                                    }
                                    i6++;
                                }
                            }
                            if (oj2Var2 == null) {
                                oj2Var2 = oj2Var3;
                            }
                            ArrayList arrayList3 = new ArrayList(list.size());
                            int size4 = list.size();
                            for (int i8 = 0; i8 < size4; i8++) {
                                Object obj7 = list.get(i8);
                                if (nb3.k(((ll5) obj7).b, oj2Var2)) {
                                    arrayList3.add(obj7);
                                }
                            }
                            arrayList = arrayList3;
                        } else {
                            oj2 oj2Var5 = oj2.L;
                            if (oj2Var.compareTo(oj2Var5) > 0) {
                                int size5 = list.size();
                                int i9 = 0;
                                oj2 oj2Var6 = null;
                                oj2 oj2Var7 = null;
                                while (true) {
                                    if (i9 < size5) {
                                        oj2 oj2Var8 = ((ll5) list.get(i9)).b;
                                        int i10 = oj2Var8.A;
                                        if (nb3.p(i10, i5) < 0) {
                                            if (oj2Var6 == null || nb3.p(i10, oj2Var6.A) > 0) {
                                                oj2Var6 = oj2Var8;
                                            }
                                        } else if (nb3.p(i10, i5) > 0) {
                                            if (oj2Var7 == null || nb3.p(i10, oj2Var7.A) < 0) {
                                                oj2Var7 = oj2Var8;
                                            }
                                        } else {
                                            oj2Var6 = oj2Var8;
                                            oj2Var7 = oj2Var6;
                                        }
                                        i9++;
                                    }
                                }
                                if (oj2Var7 != null) {
                                    oj2Var6 = oj2Var7;
                                }
                                arrayList = new ArrayList(list.size());
                                int size6 = list.size();
                                for (int i11 = 0; i11 < size6; i11++) {
                                    Object obj8 = list.get(i11);
                                    if (nb3.k(((ll5) obj8).b, oj2Var6)) {
                                        arrayList.add(obj8);
                                    }
                                }
                            } else {
                                int size7 = list.size();
                                int i12 = 0;
                                oj2 oj2Var9 = null;
                                oj2 oj2Var10 = null;
                                while (true) {
                                    if (i12 < size7) {
                                        oj2 oj2Var11 = ((ll5) list.get(i12)).b;
                                        if (nb3.p(oj2Var11.A, oj2Var5.A) <= 0) {
                                            int i13 = oj2Var11.A;
                                            if (nb3.p(i13, i5) < 0) {
                                                if (oj2Var9 == null || nb3.p(i13, oj2Var9.A) > 0) {
                                                    oj2Var9 = oj2Var11;
                                                }
                                            } else if (nb3.p(i13, i5) > 0) {
                                                if (oj2Var10 == null || nb3.p(i13, oj2Var10.A) < 0) {
                                                    oj2Var10 = oj2Var11;
                                                }
                                            } else {
                                                oj2Var9 = oj2Var11;
                                                oj2Var10 = oj2Var9;
                                            }
                                        }
                                        i12++;
                                    }
                                }
                                if (oj2Var10 != null) {
                                    oj2Var9 = oj2Var10;
                                }
                                arrayList = new ArrayList(list.size());
                                int size8 = list.size();
                                for (int i14 = 0; i14 < size8; i14++) {
                                    Object obj9 = list.get(i14);
                                    if (nb3.k(((ll5) obj9).b, oj2Var9)) {
                                        arrayList.add(obj9);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    oj2 oj2Var12 = oj2.L;
                                    int size9 = list.size();
                                    oj2 oj2Var13 = null;
                                    oj2 oj2Var14 = null;
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 < size9) {
                                            oj2 oj2Var15 = ((ll5) list.get(i15)).b;
                                            if (oj2Var12 == null || nb3.p(oj2Var15.A, oj2Var12.A) >= 0) {
                                                int i16 = oj2Var15.A;
                                                if (nb3.p(i16, i5) < 0) {
                                                    if (oj2Var13 == null || nb3.p(i16, oj2Var13.A) > 0) {
                                                        oj2Var13 = oj2Var15;
                                                    }
                                                } else if (nb3.p(i16, i5) > 0) {
                                                    if (oj2Var14 == null || nb3.p(i16, oj2Var14.A) < 0) {
                                                        oj2Var14 = oj2Var15;
                                                    }
                                                } else {
                                                    oj2Var13 = oj2Var15;
                                                    oj2Var14 = oj2Var13;
                                                }
                                            }
                                            i15++;
                                        }
                                    }
                                    if (oj2Var14 != null) {
                                        oj2Var13 = oj2Var14;
                                    }
                                    arrayList = new ArrayList(list.size());
                                    int size10 = list.size();
                                    for (int i17 = 0; i17 < size10; i17++) {
                                        Object obj10 = list.get(i17);
                                        if (nb3.k(((ll5) obj10).b, oj2Var13)) {
                                            arrayList.add(obj10);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    bt btVar = ri2Var.a;
                    if (arrayList.size() > 0) {
                        ll5 ll5Var = (ll5) arrayList.get(0);
                        ll5Var.getClass();
                        synchronized (((w31) btVar.R)) {
                            try {
                                rhVar.getClass();
                                rw rwVar = new rw(ll5Var);
                                qw qwVar = (qw) ((yz3) btVar.B).h(rwVar);
                                if (qwVar == null) {
                                    qwVar = (qw) ((ja4) btVar.L).g(rwVar);
                                }
                                if (qwVar != null) {
                                    obj3 = qwVar.a;
                                } else {
                                    try {
                                        g = rhVar.e(ll5Var);
                                    } catch (Exception unused) {
                                        g = bg2Var.g(te7Var);
                                    }
                                    btVar.getClass();
                                    rhVar.getClass();
                                    rw rwVar2 = new rw(ll5Var);
                                    synchronized (((w31) btVar.R)) {
                                        try {
                                            if (g == null) {
                                                ((ja4) btVar.L).m(rwVar2, new qw(null));
                                            } else {
                                                ((yz3) btVar.B).l(rwVar2, new qw(g));
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                    obj3 = g;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                        if (obj3 == null) {
                            obj3 = bg2Var.g(te7Var);
                        }
                        vr4Var = new vr4(null, kj2.Z(te7Var.d, obj3, ll5Var, te7Var.b, te7Var.c));
                    } else {
                        vr4Var = new vr4(null, bg2Var.g(te7Var));
                    }
                    List list2 = (List) vr4Var.A;
                    Object obj11 = vr4Var.B;
                    if (list2 == null) {
                        ue7Var = new ve7(true, obj11);
                        obj2 = null;
                    } else {
                        zv zvVar = new zv(list2, obj11, te7Var, ri2Var.a, qn2Var, rhVar);
                        obj2 = null;
                        hv.L(ri2Var.b, null, a71.UNDISPATCHED, new a6(zvVar, null, 22), 1);
                        ue7Var = new ue7(zvVar);
                    }
                }
                if (ue7Var == null) {
                    jy4 jy4Var = (jy4) mi2Var.e.B;
                    li2 li2Var2 = te7Var.a;
                    int i18 = te7Var.c;
                    oj2 oj2Var16 = te7Var.b;
                    if (li2Var2 != null && !(li2Var2 instanceof zd1)) {
                        if (li2Var2 instanceof sr2) {
                            e = jy4Var.k((sr2) li2Var2, oj2Var16, i18);
                        } else {
                            ue7Var = obj2;
                            if (ue7Var == null) {
                                i.m("Could not load font");
                                return obj2;
                            }
                        }
                    } else {
                        e = jy4Var.e(i18, oj2Var16);
                    }
                    ue7Var = new ve7(true, e);
                    if (ue7Var == null) {
                    }
                }
                return ue7Var;
            case 2:
                mn2 mn2Var = (mn2) this.B;
                ((gl1) obj).getClass();
                mn2Var.i0.addView(mn2Var, mn2Var.j0);
                ((qa4) this.L).setValue(Boolean.TRUE);
                return new z3(mn2Var, 9);
            case 3:
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                return Long.valueOf(((ip2) this.B).b.Z(e36Var, (lp2) this.L));
            case 4:
                hz3 hz3Var = (hz3) obj;
                hz3Var.getClass();
                ((ip2) this.B).a((e36) this.L, hz3Var);
                return jg7.a;
            case 5:
                bm7 bm7Var = (bm7) this.B;
                bm7 bm7Var2 = (bm7) this.L;
                ki5 ki5Var = (ki5) obj;
                ki5Var.getClass();
                bm7 bm7Var3 = bm7.Z;
                bm7 Z = np2.Z(ki5Var.a);
                if (Z == null || Z.A == wl7.NIGHTLY || Z.compareTo(bm7Var) <= 0) {
                    return null;
                }
                if (bm7Var2 != null && Z.equals(bm7Var2)) {
                    return null;
                }
                Iterator it = ki5Var.i.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj4 = it.next();
                        pv pvVar = (pv) obj4;
                        pvVar.getClass();
                        String lowerCase = pvVar.c.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (pvVar.a > 0 && pvVar.d > 0 && xs6.g0(pvVar.b, "https://github.com/ReiKatari/STORM_DS/releases/download/", false) && nb3.k(pvVar.e, "application/vnd.android.package-archive") && xs6.Y(lowerCase, ".apk", false) && (qs6.j0(lowerCase, "storm", false) || qs6.j0(lowerCase, "melondualds", false) || qs6.j0(lowerCase, "app", false))) {
                            if (!qs6.j0(lowerCase, "nightly", false)) {
                            }
                        }
                    } else {
                        obj4 = null;
                    }
                }
                pv pvVar2 = (pv) obj4;
                if (pvVar2 == null) {
                    return null;
                }
                String str2 = ki5Var.e;
                if (str2 == null) {
                    str2 = ki5Var.d;
                }
                if (str2 != null) {
                    try {
                        s83 s83Var2 = s83.L;
                        em5Var = bl2.L(str2);
                    } catch (Throwable th4) {
                        em5Var = new em5(th4);
                    }
                    if (em5Var instanceof em5) {
                        em5Var = null;
                    }
                    s83Var = (s83) em5Var;
                } else {
                    s83Var = null;
                }
                if (s83Var == null) {
                    return null;
                }
                return new cs2(ki5Var, pvVar2, Z, s83Var);
            case 6:
                Throwable th5 = (Throwable) obj;
                ((jv2) this.B).L.removeCallbacks((mf) this.L);
                return jg7.a;
            case 7:
                bh5 bh5Var = (bh5) this.B;
                bh5 bh5Var2 = (bh5) this.L;
                n14 n14Var = (n14) obj;
                if (bh5Var.A == -1) {
                    bh5Var.A = n14Var.b().A;
                }
                bh5Var2.A = n14Var.b().B + 1;
                return "";
            case 8:
                g53 g53Var = (g53) this.B;
                e53 e53Var = (e53) this.L;
                gl1 gl1Var = (gl1) obj;
                g53Var.a.b(e53Var);
                g53Var.b.setValue(Boolean.TRUE);
                return new j00(2, g53Var, e53Var);
            case 9:
                nh2 nh2Var = (nh2) this.L;
                fh2 fh2Var = (fh2) obj;
                fh2Var.getClass();
                if (!((i63) this.B).b()) {
                    nh2Var = nh2.b;
                }
                fh2Var.d(nh2Var);
                return jg7.a;
            case 10:
                Integer num = (Integer) this.B;
                qn2 qn2Var2 = (qn2) this.L;
                ((uh3) obj).getClass();
                if (num != null) {
                    qn2Var2.g(num);
                }
                return jg7.a;
            case 11:
                b.g((b) this.B, (oj3) this.L, ((Integer) obj).intValue());
                return jg7.a;
            case 12:
                m20 m20Var = (m20) this.B;
                Context context = (Context) this.L;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    zn3 zn3Var = new zn3(context, 0);
                    m20Var.getClass();
                    context.getClass();
                    as0 a = to7.a(m20Var);
                    xe1 xe1Var = xk1.a;
                    hv.L(a, de1.L, null, new hn(context, uri, m20Var, zn3Var, (r41) null, 1), 2);
                }
                return jg7.a;
            case 13:
                j04 j04Var = (j04) this.B;
                fk3 fk3Var = (fk3) obj;
                fk3Var.getClass();
                ((qa4) this.L).setValue(fk3Var);
                String str3 = fk3Var.b;
                if (str3 != null) {
                    Pattern compile = Pattern.compile("[^\\p{L}\\p{N}_\\- ]");
                    compile.getClass();
                    String replaceAll = compile.matcher(str3).replaceAll("_");
                    replaceAll.getClass();
                    str = qs6.T0(replaceAll).toString();
                    break;
                }
                str = "layout";
                j04Var.a(str.concat(".json"));
                return jg7.a;
            case 14:
                UUID uuid = (UUID) obj;
                uuid.getClass();
                Intent intent = new Intent((Context) this.B, LayoutEditorActivity.class);
                intent.putExtra("layout_id", uuid.toString());
                ((j04) this.L).a(intent);
                return jg7.a;
            case 15:
                to3 to3Var = (to3) this.L;
                qj2 c = ((dp3) this.B).c(((Integer) obj).intValue());
                int i19 = c.a;
                List list3 = c.b;
                ArrayList arrayList4 = new ArrayList(list3.size());
                int size11 = list3.size();
                int i20 = 0;
                while (i < size11) {
                    int i21 = (int) ((ju2) list3.get(i)).a;
                    arrayList4.add(new vr4(Integer.valueOf(i19), new q21(to3Var.a(i20, i21))));
                    i19++;
                    i20 += i21;
                    i++;
                }
                return arrayList4;
            case 16:
                to3 to3Var2 = (to3) this.B;
                so3 so3Var = (so3) this.L;
                int intValue = ((Integer) obj).intValue();
                dp3 dp3Var = to3Var2.e;
                int i22 = dp3Var.f;
                int g2 = dp3Var.g(intValue);
                return so3Var.o(intValue, 0, g2, so3Var.d, to3Var2.a(0, g2));
            case 17:
                rr3 rr3Var = (rr3) this.B;
                Object obj12 = this.L;
                gl1 gl1Var2 = (gl1) obj;
                rr3Var.L.i(obj12);
                return new j00(3, rr3Var, obj12);
            case 18:
                return new rr3((q46) this.B, (Map) obj, (o46) this.L);
            case 19:
                ls3 ls3Var = (ls3) this.B;
                ks3 ks3Var = (ks3) this.L;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                ls3 ls3Var2 = (ls3) entry.getKey();
                bs3 bs3Var = (bs3) entry.getValue();
                if (ls3Var2.a == ls3Var.a && ls3Var2.b < ls3Var.b) {
                    as3 as3Var = bs3Var.b;
                    ks3Var.getClass();
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 20:
                cx4 cx4Var = (cx4) obj;
                ArrayList i23 = jw2.i((List) this.B, ((fw3) this.L).a);
                if (i23 != null) {
                    int size12 = i23.size();
                    while (i < size12) {
                        vr4 vr4Var2 = (vr4) i23.get(i);
                        dx4 dx4Var = (dx4) vr4Var2.A;
                        on2 on2Var = (on2) vr4Var2.B;
                        if (on2Var != null) {
                            j = ((i93) on2Var.c()).a;
                        } else {
                            j = 0;
                        }
                        cx4.k(cx4Var, dx4Var, j);
                        i++;
                    }
                }
                return jg7.a;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                br0 br0Var = (br0) obj;
                br0Var.getClass();
                br0.a(br0Var, "key", ((gg3) this.B).e());
                br0.a(br0Var, "value", ((gg3) this.L).e());
                return jg7.a;
            case 22:
                my4 my4Var = (my4) this.B;
                my4 my4Var2 = (my4) this.L;
                hk3 hk3Var = (hk3) obj;
                hk3Var.getClass();
                try {
                    String k = hk3Var.k();
                    String m = hk3Var.m();
                    String q = hk3Var.q();
                    String o = hk3Var.o();
                    boolean r = hk3Var.r();
                    int n = hk3Var.n();
                    my4Var.getClass();
                    ny4 ny4Var = new ny4(my4Var.a, my4Var.b);
                    yt1 yt1Var = yt1.A;
                    ik3.a aVar = new ik3.a(new lf7(ny4Var, "PORTRAIT", yt1Var), hk3Var.p());
                    my4Var2.getClass();
                    return new ik3(k, m, q, o, r, n, hf.c0(aVar, new ik3.a(new lf7(new ny4(my4Var2.a, my4Var2.b), "LANDSCAPE", yt1Var), hk3Var.l())), null, 128, null);
                } catch (Exception unused2) {
                    return null;
                }
            case ConnectionResult.API_DISABLED /* 23 */:
                ((f94) this.B).c.add(new c94((ob6) this.L, obj));
                return jg7.a;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                f94 f94Var = (f94) this.L;
                if (((Set) this.B).contains(obj)) {
                    ja4 ja4Var = f94Var.b;
                    ka4 ka4Var = f94Var.d;
                    Object g3 = ja4Var.g(obj);
                    if (g3 != null) {
                        if (g3 instanceof ka4) {
                            ka4 ka4Var2 = (ka4) g3;
                            Object[] objArr = ka4Var2.b;
                            long[] jArr = ka4Var2.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i24 = 0;
                                while (true) {
                                    long j2 = jArr[i24];
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i25 = 8 - ((~(i24 - length)) >>> 31);
                                        for (int i26 = 0; i26 < i25; i26++) {
                                            if ((255 & j2) < 128) {
                                                ka4Var.a((ob6) objArr[(i24 << 3) + i26]);
                                            }
                                            j2 >>= 8;
                                        }
                                        if (i25 != 8) {
                                        }
                                    }
                                    if (i24 != length) {
                                        i24++;
                                    }
                                }
                            }
                        } else {
                            ka4Var.a((ob6) g3);
                        }
                    }
                }
                return jg7.a;
            case 25:
                ic4 ic4Var = (ic4) this.B;
                zb4 zb4Var = ((rc4) this.L).b;
                bd4 bd4Var = (bd4) obj;
                bd4Var.getClass();
                dy7 dy7Var = bd4Var.a;
                dy7Var.a = 0;
                dy7Var.b = 0;
                if (ic4Var instanceof mc4) {
                    int i27 = ic4.X;
                    Iterator it2 = mp2.G(ic4Var).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ic4 ic4Var2 = (ic4) it2.next();
                            ic4 f = zb4Var.f();
                            if (f != null) {
                                mc4Var = f.L;
                            } else {
                                mc4Var = null;
                            }
                            if (nb3.k(ic4Var2, mc4Var)) {
                            }
                        } else {
                            int i28 = mc4.Z;
                            bd4Var.b = np2.M(zb4Var.g()).B.a;
                            bd4Var.c = true;
                        }
                    }
                }
                return jg7.a;
            case SubAllocator.N4 /* 26 */:
                gl1 gl1Var3 = (gl1) obj;
                return new j00(4, (pp6) this.B, (uw0) this.L);
            case 27:
                rc4 rc4Var = (rc4) this.B;
                hu3 hu3Var = (hu3) this.L;
                gl1 gl1Var4 = (gl1) obj;
                rc4Var.getClass();
                hu3Var.getClass();
                zb4 zb4Var2 = rc4Var.b;
                wb4 wb4Var = zb4Var2.r;
                if (!hu3Var.equals(zb4Var2.n)) {
                    hu3 hu3Var2 = zb4Var2.n;
                    if (hu3Var2 != null && (lifecycle = hu3Var2.getLifecycle()) != null) {
                        lifecycle.c(wb4Var);
                    }
                    zb4Var2.n = hu3Var;
                    hu3Var.getLifecycle().a(wb4Var);
                }
                return new vj(2);
            case 28:
                ((ap6) this.B).h(null);
                ((r35) this.L).c((x21) obj);
                return jg7.a;
            default:
                nk4 nk4Var = (nk4) this.B;
                dx4 dx4Var2 = (dx4) this.L;
                cx4 cx4Var2 = (cx4) obj;
                boolean z2 = nk4Var.m0;
                float f2 = nk4Var.k0;
                if (z2) {
                    cx4.l(cx4Var2, dx4Var2, cx4Var2.r0(f2), cx4Var2.r0(nk4Var.l0));
                } else {
                    cx4.j(cx4Var2, dx4Var2, cx4Var2.r0(f2), cx4Var2.r0(nk4Var.l0));
                }
                return jg7.a;
        }
    }
}
