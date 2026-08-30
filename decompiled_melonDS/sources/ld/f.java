package ld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kf.s0;
import nc.k;
import nd.a1;
import nd.l;
import yb.n;
import zb.m;
import zb.t;
import zb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements e, l {

    /* renamed from: a  reason: collision with root package name */
    public final String f9030a;

    /* renamed from: b  reason: collision with root package name */
    public final d0.d f9031b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9032c;

    /* renamed from: d  reason: collision with root package name */
    public final List f9033d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f9034e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f9035f;

    /* renamed from: g  reason: collision with root package name */
    public final e[] f9036g;

    /* renamed from: h  reason: collision with root package name */
    public final List[] f9037h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean[] f9038i;

    /* renamed from: j  reason: collision with root package name */
    public final Map f9039j;

    /* renamed from: k  reason: collision with root package name */
    public final e[] f9040k;

    /* renamed from: l  reason: collision with root package name */
    public final n f9041l;

    public f(String str, d0.d dVar, int i2, List list, a aVar) {
        this.f9030a = str;
        this.f9031b = dVar;
        this.f9032c = i2;
        this.f9033d = aVar.f9010b;
        ArrayList arrayList = aVar.f9011c;
        arrayList.getClass();
        HashSet hashSet = new HashSet(v.E(m.G(arrayList, 12)));
        zb.l.n0(arrayList, hashSet);
        this.f9034e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f9035f = strArr;
        this.f9036g = a1.c(aVar.f9013e);
        this.f9037h = (List[]) aVar.f9014f.toArray(new List[0]);
        this.f9038i = zb.l.m0(aVar.f9015g);
        strArr.getClass();
        g gVar = new g(3, new s0(29, strArr));
        ArrayList arrayList2 = new ArrayList(m.G(gVar, 10));
        Iterator it = gVar.iterator();
        while (true) {
            uc.b bVar = (uc.b) it;
            if (bVar.B.hasNext()) {
                t tVar = (t) bVar.next();
                arrayList2.add(new yb.j(tVar.f15011b, Integer.valueOf(tVar.f15010a)));
            } else {
                this.f9039j = v.H(arrayList2);
                this.f9040k = a1.c(list);
                this.f9041l = new n(new s0(2, this));
                return;
            }
        }
    }

    @Override // ld.e
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.f9039j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // ld.e
    public final String b() {
        return this.f9030a;
    }

    @Override // ld.e
    public final d0.d c() {
        return this.f9031b;
    }

    @Override // ld.e
    public final int d() {
        return this.f9032c;
    }

    @Override // ld.e
    public final String e(int i2) {
        return this.f9035f[i2];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                e eVar = (e) obj;
                if (this.f9030a.equals(eVar.b()) && Arrays.equals(this.f9040k, ((f) obj).f9040k)) {
                    int d4 = eVar.d();
                    int i2 = this.f9032c;
                    if (i2 == d4) {
                        for (int i10 = 0; i10 < i2; i10++) {
                            e[] eVarArr = this.f9036g;
                            if (k.a(eVarArr[i10].b(), eVar.j(i10).b()) && k.a(eVarArr[i10].c(), eVar.j(i10).c())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // nd.l
    public final Set g() {
        return this.f9034e;
    }

    @Override // ld.e
    public final List getAnnotations() {
        return this.f9033d;
    }

    public final int hashCode() {
        return ((Number) this.f9041l.getValue()).intValue();
    }

    @Override // ld.e
    public final List i(int i2) {
        return this.f9037h[i2];
    }

    @Override // ld.e
    public final e j(int i2) {
        return this.f9036g[i2];
    }

    @Override // ld.e
    public final boolean k(int i2) {
        return this.f9038i[i2];
    }

    public final String toString() {
        return a1.l(this);
    }
}
