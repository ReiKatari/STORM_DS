package defpackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lo5  reason: default package */
/* loaded from: classes.dex */
public final class lo5 extends hw6 implements eo2 {
    public pq5 X;
    public Map Y;
    public Map Z;
    public no5 d0;
    public List e0;
    public Collection f0;
    public Iterator g0;
    public gb5 h0;
    public Collection i0;
    public qq5 j0;
    public URL k0;
    public r75 l0;
    public String m0;
    public boolean n0;
    public int o0;
    public int p0;
    public int q0;
    public long r0;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ no5 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo5(no5 no5Var, r41 r41Var) {
        super(2, r41Var);
        this.u0 = no5Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((lo5) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        lo5 lo5Var = new lo5(this.u0, r41Var);
        lo5Var.t0 = obj;
        return lo5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d3, code lost:
        if (r0 == r6) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0115, code lost:
        if (r11 == r6) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031e  */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v1, types: [em5] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x024f -> B:9:0x008d). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object b;
        pq5 em5Var;
        pq5 pq5Var;
        boolean z;
        int i;
        Object d0;
        Object d02;
        pq5 pq5Var2;
        Map map;
        Object k;
        Map map2;
        Map map3;
        Throwable a;
        jg7 jg7Var;
        Object b2;
        Iterable iterable;
        boolean z2;
        Iterator it;
        Map map4;
        int i2;
        no5 no5Var;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        List list;
        Object d03;
        jg7 jg7Var2;
        URL url;
        int i6;
        int i7;
        int i8;
        int i9;
        Object e;
        x61 x61Var;
        long j;
        Iterator it2;
        gb5 gb5Var;
        String str;
        qq5 qq5Var;
        r75 r75Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10;
        jb5 jb5Var;
        ib5 ib5Var;
        String str2;
        no5 no5Var2 = this.u0;
        pn5 pn5Var = no5Var2.b;
        tp6 tp6Var = no5Var2.d;
        w61 w61Var = (w61) this.t0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        int i11 = this.s0;
        jg7 jg7Var3 = jg7.a;
        e06 e06Var = e06.a;
        switch (i11) {
            case 0:
                oi2.Y(obj);
                this.t0 = w61Var;
                this.s0 = 1;
                b = ((pl) pn5Var).c.b(this);
                break;
            case 1:
                oi2.Y(obj);
                b = obj;
                jb5 jb5Var2 = (jb5) b;
                if (jb5Var2 instanceof hb5) {
                    try {
                        em5Var = no5Var2.h();
                    } catch (Throwable th) {
                        em5Var = new em5(th);
                    }
                    if (hm5.a(em5Var) == null) {
                        pq5Var = em5Var;
                        z = ((ng6) no5Var2.c).b.getBoolean("ra_hardcore_enabled", false);
                        xe1 xe1Var = xk1.a;
                        jo5 jo5Var = new jo5(no5Var2, pq5Var, null, 1);
                        this.t0 = w61Var;
                        this.X = pq5Var;
                        this.n0 = z;
                        i = 2;
                        this.s0 = 2;
                        d0 = hv.d0(xe1Var, jo5Var, this);
                        break;
                    } else {
                        tp6Var.getClass();
                        tp6Var.m(null, e06Var);
                        return jg7Var3;
                    }
                } else if (jb5Var2 instanceof ib5) {
                    g06 g06Var = new g06(((ib5) jb5Var2).a);
                    tp6Var.getClass();
                    tp6Var.m(null, g06Var);
                    return jg7Var3;
                } else if (jb5Var2 == null) {
                    g06 g06Var2 = new g06(null);
                    tp6Var.getClass();
                    tp6Var.m(null, g06Var2);
                    return jg7Var3;
                } else {
                    i.d();
                    return null;
                }
            case 2:
                z = this.n0;
                pq5Var = this.X;
                oi2.Y(obj);
                d0 = obj;
                i = 2;
                Map map5 = (Map) d0;
                xe1 xe1Var2 = xk1.a;
                jo5 jo5Var2 = new jo5(no5Var2, pq5Var, null, i);
                this.t0 = w61Var;
                this.X = pq5Var;
                this.Y = map5;
                this.n0 = z;
                this.s0 = 3;
                d02 = hv.d0(xe1Var2, jo5Var2, this);
                if (d02 != x61Var2) {
                    pq5Var2 = pq5Var;
                    map = map5;
                    Map map6 = (Map) d02;
                    this.t0 = w61Var;
                    this.X = pq5Var2;
                    this.Y = map;
                    this.Z = map6;
                    this.n0 = z;
                    this.s0 = 4;
                    k = no5Var2.k(pq5Var2, z, this);
                    if (k != x61Var2) {
                        map2 = map;
                        map3 = map6;
                        a = hm5.a(k);
                        if (a != null) {
                            kb5 kb5Var = (kb5) k;
                            if (kb5Var != null) {
                                iterable = kb5Var.e;
                            } else {
                                iterable = null;
                            }
                            if (iterable == null) {
                                iterable = yt1.A;
                            }
                            ArrayList arrayList4 = new ArrayList(ht0.v0(iterable, 10));
                            z2 = z;
                            it = iterable.iterator();
                            map4 = map3;
                            i2 = 0;
                            no5Var = no5Var2;
                            arrayList = arrayList4;
                            i3 = 0;
                            i4 = 0;
                            if (it.hasNext()) {
                                gb5 gb5Var2 = (gb5) it.next();
                                long j2 = gb5Var2.a;
                                ArrayList arrayList5 = arrayList;
                                ArrayList arrayList6 = gb5Var2.f;
                                jg7Var2 = jg7Var3;
                                String str3 = gb5Var2.b;
                                x61 x61Var3 = x61Var2;
                                r75 r75Var2 = gb5Var2.c;
                                url = gb5Var2.e;
                                no5Var.getClass();
                                int size = arrayList6.size();
                                if (arrayList6.isEmpty()) {
                                    i6 = i3;
                                    i7 = i4;
                                    i8 = 0;
                                } else {
                                    i6 = i3;
                                    int size2 = arrayList6.size();
                                    i7 = i4;
                                    int i12 = 0;
                                    int i13 = 0;
                                    while (i12 < size2) {
                                        Object obj2 = arrayList6.get(i12);
                                        i12++;
                                        int i14 = size2;
                                        if (!((eb5) obj2).b || (i13 = i13 + 1) >= 0) {
                                            size2 = i14;
                                        } else {
                                            hf.p0();
                                            throw null;
                                        }
                                    }
                                    i8 = i13;
                                }
                                int size3 = arrayList6.size();
                                int i15 = i2;
                                int i16 = 0;
                                int i17 = 0;
                                while (i17 < size3) {
                                    Object obj3 = arrayList6.get(i17);
                                    int i18 = i17 + 1;
                                    int i19 = size3;
                                    eb5 eb5Var = (eb5) obj3;
                                    if (eb5Var.b) {
                                        i10 = eb5Var.a.h;
                                    } else {
                                        i10 = 0;
                                    }
                                    i16 += i10;
                                    i17 = i18;
                                    size3 = i19;
                                }
                                qq5 qq5Var2 = new qq5(size, i8, i16, z2);
                                this.t0 = null;
                                this.X = pq5Var2;
                                this.Y = map2;
                                this.Z = map4;
                                this.d0 = no5Var;
                                this.e0 = null;
                                ArrayList arrayList7 = arrayList5;
                                this.f0 = arrayList7;
                                this.g0 = it;
                                this.h0 = gb5Var2;
                                this.i0 = arrayList7;
                                this.j0 = qq5Var2;
                                this.k0 = url;
                                this.l0 = r75Var2;
                                this.m0 = str3;
                                this.n0 = z2;
                                i2 = i15;
                                this.o0 = i2;
                                int i20 = i7;
                                this.p0 = i20;
                                i9 = i6;
                                this.q0 = i9;
                                Iterator it3 = it;
                                this.r0 = j2;
                                this.s0 = 5;
                                e = no5Var.e(arrayList6, map2, this);
                                x61Var = x61Var3;
                                if (e != x61Var) {
                                    j = j2;
                                    it2 = it3;
                                    gb5Var = gb5Var2;
                                    str = str3;
                                    qq5Var = qq5Var2;
                                    r75Var = r75Var2;
                                    i4 = i20;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList2;
                                    arrayList2.add(new c6(j, str, r75Var, url, qq5Var, (List) e, gb5Var.g));
                                    x61Var2 = x61Var;
                                    arrayList = arrayList3;
                                    it = it2;
                                    i3 = i9;
                                    jg7Var3 = jg7Var2;
                                    if (it.hasNext()) {
                                        ArrayList arrayList8 = arrayList;
                                        jg7Var = jg7Var3;
                                        x61 x61Var4 = x61Var2;
                                        ArrayList arrayList9 = arrayList8;
                                        if (!map4.isEmpty()) {
                                            i5 = 0;
                                            list = gt0.d1(arrayList9, new ix1(new ko5(0, map4), 2));
                                        } else {
                                            i5 = 0;
                                            list = arrayList9;
                                        }
                                        xe1 xe1Var3 = xk1.a;
                                        de1 de1Var = de1.L;
                                        jo5 jo5Var3 = new jo5(no5Var, pq5Var2, null, i5);
                                        this.t0 = null;
                                        this.X = null;
                                        this.Y = null;
                                        this.Z = null;
                                        this.d0 = no5Var;
                                        this.e0 = list;
                                        this.f0 = null;
                                        this.g0 = null;
                                        this.h0 = null;
                                        this.i0 = null;
                                        this.j0 = null;
                                        this.k0 = null;
                                        this.l0 = null;
                                        this.m0 = null;
                                        this.n0 = z2;
                                        this.o0 = i2;
                                        this.s0 = 6;
                                        d03 = hv.d0(de1Var, jo5Var3, this);
                                        if (d03 == x61Var4) {
                                            return x61Var4;
                                        }
                                        tp6 tp6Var2 = no5Var.d;
                                        i06 i06Var = new i06(list, (Set) d03);
                                        tp6Var2.getClass();
                                        tp6Var2.m(null, i06Var);
                                        return jg7Var;
                                    }
                                } else {
                                    return x61Var;
                                }
                            }
                        } else {
                            jg7Var = jg7Var3;
                            yh2.o(w61Var.A());
                            if (a instanceof sj7) {
                                this.t0 = null;
                                this.X = null;
                                this.Y = null;
                                this.Z = null;
                                this.d0 = no5Var2;
                                this.n0 = z;
                                this.o0 = 0;
                                this.s0 = 7;
                                b2 = ((pl) pn5Var).c.b(this);
                                if (b2 == x61Var2) {
                                    return x61Var2;
                                }
                                jb5Var = (jb5) b2;
                                if (!(jb5Var instanceof ib5)) {
                                    ib5Var = (ib5) jb5Var;
                                } else {
                                    ib5Var = null;
                                }
                                if (ib5Var == null) {
                                    str2 = ib5Var.a;
                                } else {
                                    str2 = null;
                                }
                                tp6 tp6Var3 = no5Var2.d;
                                g06 g06Var3 = new g06(str2);
                                tp6Var3.getClass();
                                tp6Var3.m(null, g06Var3);
                                return jg7Var;
                            }
                            tp6Var.getClass();
                            tp6Var.m(null, e06Var);
                            return jg7Var;
                        }
                    }
                }
                return x61Var2;
            case 3:
                z = this.n0;
                map = this.Y;
                pq5 pq5Var3 = this.X;
                oi2.Y(obj);
                pq5Var2 = pq5Var3;
                d02 = obj;
                Map map62 = (Map) d02;
                this.t0 = w61Var;
                this.X = pq5Var2;
                this.Y = map;
                this.Z = map62;
                this.n0 = z;
                this.s0 = 4;
                k = no5Var2.k(pq5Var2, z, this);
                if (k != x61Var2) {
                }
                return x61Var2;
            case 4:
                z = this.n0;
                map3 = this.Z;
                map2 = this.Y;
                pq5Var2 = this.X;
                oi2.Y(obj);
                k = ((hm5) obj).A;
                a = hm5.a(k);
                if (a != null) {
                }
                break;
            case 5:
                long j3 = this.r0;
                int i21 = this.q0;
                i4 = this.p0;
                i2 = this.o0;
                z2 = this.n0;
                String str4 = this.m0;
                r75 r75Var3 = this.l0;
                url = this.k0;
                qq5 qq5Var3 = this.j0;
                Collection collection = this.i0;
                gb5Var = this.h0;
                Iterator it4 = this.g0;
                Collection collection2 = this.f0;
                no5 no5Var3 = this.d0;
                Map map7 = this.Z;
                Map map8 = this.Y;
                pq5 pq5Var4 = this.X;
                oi2.Y(obj);
                x61Var = x61Var2;
                arrayList2 = collection;
                str = str4;
                map2 = map8;
                r75Var = r75Var3;
                qq5Var = qq5Var3;
                i9 = i21;
                jg7Var2 = jg7Var3;
                it2 = it4;
                arrayList3 = collection2;
                pq5Var2 = pq5Var4;
                map4 = map7;
                e = obj;
                no5Var = no5Var3;
                j = j3;
                arrayList2.add(new c6(j, str, r75Var, url, qq5Var, (List) e, gb5Var.g));
                x61Var2 = x61Var;
                arrayList = arrayList3;
                it = it2;
                i3 = i9;
                jg7Var3 = jg7Var2;
                if (it.hasNext()) {
                }
                break;
            case 6:
                list = this.e0;
                no5 no5Var4 = this.d0;
                oi2.Y(obj);
                no5Var = no5Var4;
                jg7Var = jg7Var3;
                d03 = obj;
                tp6 tp6Var22 = no5Var.d;
                i06 i06Var2 = new i06(list, (Set) d03);
                tp6Var22.getClass();
                tp6Var22.m(null, i06Var2);
                return jg7Var;
            case 7:
                no5Var2 = this.d0;
                oi2.Y(obj);
                b2 = obj;
                jg7Var = jg7Var3;
                jb5Var = (jb5) b2;
                if (!(jb5Var instanceof ib5)) {
                }
                if (ib5Var == null) {
                }
                tp6 tp6Var32 = no5Var2.d;
                g06 g06Var32 = new g06(str2);
                tp6Var32.getClass();
                tp6Var32.m(null, g06Var32);
                return jg7Var;
            default:
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
