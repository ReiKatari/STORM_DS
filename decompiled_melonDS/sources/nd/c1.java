package nd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class c1 implements ld.e, l {

    /* renamed from: a  reason: collision with root package name */
    public final String f10276a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f10277b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10278c;

    /* renamed from: d  reason: collision with root package name */
    public int f10279d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f10280e;

    /* renamed from: f  reason: collision with root package name */
    public final List[] f10281f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean[] f10282g;

    /* renamed from: h  reason: collision with root package name */
    public Object f10283h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f10284i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f10285j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f10286k;

    public c1(String str, d0 d0Var, int i2) {
        this.f10276a = str;
        this.f10277b = d0Var;
        this.f10278c = i2;
        String[] strArr = new String[i2];
        for (int i10 = 0; i10 < i2; i10++) {
            strArr[i10] = "[UNINITIALIZED]";
        }
        this.f10280e = strArr;
        int i11 = this.f10278c;
        this.f10281f = new List[i11];
        this.f10282g = new boolean[i11];
        this.f10283h = zb.r.A;
        yb.h hVar = yb.h.PUBLICATION;
        this.f10284i = p7.a.s(hVar, new mc.a(this) { // from class: nd.b1
            public final /* synthetic */ c1 B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [yb.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                jd.a[] b10;
                ArrayList arrayList;
                jd.a[] c4;
                switch (r2) {
                    case 0:
                        d0 d0Var2 = this.B.f10277b;
                        if (d0Var2 == null || (b10 = d0Var2.b()) == null) {
                            return a1.f10267b;
                        }
                        return b10;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        d0 d0Var3 = this.B.f10277b;
                        if (d0Var3 != null && (c4 = d0Var3.c()) != null) {
                            arrayList = new ArrayList(c4.length);
                            for (jd.a aVar : c4) {
                                arrayList.add(aVar.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return a1.c(arrayList);
                    default:
                        c1 c1Var = this.B;
                        return Integer.valueOf(a1.e(c1Var, (ld.e[]) c1Var.f10285j.getValue()));
                }
            }
        });
        this.f10285j = p7.a.s(hVar, new mc.a(this) { // from class: nd.b1
            public final /* synthetic */ c1 B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [yb.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                jd.a[] b10;
                ArrayList arrayList;
                jd.a[] c4;
                switch (r2) {
                    case 0:
                        d0 d0Var2 = this.B.f10277b;
                        if (d0Var2 == null || (b10 = d0Var2.b()) == null) {
                            return a1.f10267b;
                        }
                        return b10;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        d0 d0Var3 = this.B.f10277b;
                        if (d0Var3 != null && (c4 = d0Var3.c()) != null) {
                            arrayList = new ArrayList(c4.length);
                            for (jd.a aVar : c4) {
                                arrayList.add(aVar.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return a1.c(arrayList);
                    default:
                        c1 c1Var = this.B;
                        return Integer.valueOf(a1.e(c1Var, (ld.e[]) c1Var.f10285j.getValue()));
                }
            }
        });
        this.f10286k = p7.a.s(hVar, new mc.a(this) { // from class: nd.b1
            public final /* synthetic */ c1 B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [yb.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                jd.a[] b10;
                ArrayList arrayList;
                jd.a[] c4;
                switch (r2) {
                    case 0:
                        d0 d0Var2 = this.B.f10277b;
                        if (d0Var2 == null || (b10 = d0Var2.b()) == null) {
                            return a1.f10267b;
                        }
                        return b10;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        d0 d0Var3 = this.B.f10277b;
                        if (d0Var3 != null && (c4 = d0Var3.c()) != null) {
                            arrayList = new ArrayList(c4.length);
                            for (jd.a aVar : c4) {
                                arrayList.add(aVar.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return a1.c(arrayList);
                    default:
                        c1 c1Var = this.B;
                        return Integer.valueOf(a1.e(c1Var, (ld.e[]) c1Var.f10285j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // ld.e
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.f10283h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // ld.e
    public final String b() {
        return this.f10276a;
    }

    @Override // ld.e
    public d0.d c() {
        return ld.j.f9044o;
    }

    @Override // ld.e
    public final int d() {
        return this.f10278c;
    }

    @Override // ld.e
    public final String e(int i2) {
        return this.f10280e[i2];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [yb.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [yb.f, java.lang.Object] */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c1) {
                ld.e eVar = (ld.e) obj;
                if (this.f10276a.equals(eVar.b()) && Arrays.equals((ld.e[]) this.f10285j.getValue(), (ld.e[]) ((c1) obj).f10285j.getValue())) {
                    int d4 = eVar.d();
                    int i2 = this.f10278c;
                    if (i2 == d4) {
                        for (int i10 = 0; i10 < i2; i10++) {
                            if (nc.k.a(j(i10).b(), eVar.j(i10).b()) && nc.k.a(j(i10).c(), eVar.j(i10).c())) {
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // nd.l
    public final Set g() {
        return this.f10283h.keySet();
    }

    @Override // ld.e
    public final List getAnnotations() {
        return zb.q.A;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yb.f, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f10286k.getValue()).intValue();
    }

    @Override // ld.e
    public final List i(int i2) {
        List list = this.f10281f[i2];
        if (list == null) {
            return zb.q.A;
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yb.f, java.lang.Object] */
    @Override // ld.e
    public ld.e j(int i2) {
        return ((jd.a[]) this.f10284i.getValue())[i2].e();
    }

    @Override // ld.e
    public final boolean k(int i2) {
        return this.f10282g[i2];
    }

    public final void l(String str, boolean z10) {
        str.getClass();
        int i2 = this.f10279d + 1;
        this.f10279d = i2;
        String[] strArr = this.f10280e;
        strArr[i2] = str;
        this.f10282g[i2] = z10;
        this.f10281f[i2] = null;
        if (i2 == this.f10278c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                hashMap.put(strArr[i10], Integer.valueOf(i10));
            }
            this.f10283h = hashMap;
        }
    }

    public String toString() {
        return a1.l(this);
    }
}
