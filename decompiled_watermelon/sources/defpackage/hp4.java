package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hp4  reason: default package */
/* loaded from: classes.dex */
public class hp4 implements h06, q80 {
    public final String a;
    public final kl2 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final gh3 i;
    public final gh3 j;
    public final gh3 k;

    public hp4(String str, kl2 kl2Var, int i) {
        this.a = str;
        this.b = kl2Var;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = qp1.A;
        wk3 wk3Var = wk3.PUBLICATION;
        this.i = yf2.H(wk3Var, new ki2(this) { // from class: gp4
            public final /* synthetic */ hp4 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                m93[] a;
                ArrayList arrayList;
                m93[] c;
                int i4 = r2;
                hp4 hp4Var = this.B;
                switch (i4) {
                    case 0:
                        kl2 kl2Var2 = hp4Var.b;
                        if (kl2Var2 == null || (a = kl2Var2.a()) == null) {
                            return dk7.i;
                        }
                        return a;
                    case 1:
                        kl2 kl2Var3 = hp4Var.b;
                        if (kl2Var3 != null && (c = kl2Var3.c()) != null) {
                            arrayList = new ArrayList(c.length);
                            for (m93 m93Var : c) {
                                arrayList.add(m93Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return mh7.q(arrayList);
                    default:
                        return Integer.valueOf(me2.D(hp4Var, (h06[]) hp4Var.j.getValue()));
                }
            }
        });
        this.j = yf2.H(wk3Var, new ki2(this) { // from class: gp4
            public final /* synthetic */ hp4 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                m93[] a;
                ArrayList arrayList;
                m93[] c;
                int i4 = r2;
                hp4 hp4Var = this.B;
                switch (i4) {
                    case 0:
                        kl2 kl2Var2 = hp4Var.b;
                        if (kl2Var2 == null || (a = kl2Var2.a()) == null) {
                            return dk7.i;
                        }
                        return a;
                    case 1:
                        kl2 kl2Var3 = hp4Var.b;
                        if (kl2Var3 != null && (c = kl2Var3.c()) != null) {
                            arrayList = new ArrayList(c.length);
                            for (m93 m93Var : c) {
                                arrayList.add(m93Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return mh7.q(arrayList);
                    default:
                        return Integer.valueOf(me2.D(hp4Var, (h06[]) hp4Var.j.getValue()));
                }
            }
        });
        this.k = yf2.H(wk3Var, new ki2(this) { // from class: gp4
            public final /* synthetic */ hp4 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                m93[] a;
                ArrayList arrayList;
                m93[] c;
                int i4 = r2;
                hp4 hp4Var = this.B;
                switch (i4) {
                    case 0:
                        kl2 kl2Var2 = hp4Var.b;
                        if (kl2Var2 == null || (a = kl2Var2.a()) == null) {
                            return dk7.i;
                        }
                        return a;
                    case 1:
                        kl2 kl2Var3 = hp4Var.b;
                        if (kl2Var3 != null && (c = kl2Var3.c()) != null) {
                            arrayList = new ArrayList(c.length);
                            for (m93 m93Var : c) {
                                arrayList.add(m93Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return mh7.q(arrayList);
                    default:
                        return Integer.valueOf(me2.D(hp4Var, (h06[]) hp4Var.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.h06
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.h06
    public final String b() {
        return this.a;
    }

    @Override // defpackage.h06
    public ep2 c() {
        return kh6.h;
    }

    @Override // defpackage.h06
    public final int d() {
        return this.c;
    }

    @Override // defpackage.h06
    public final String e(int i) {
        return this.e[i];
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hp4) {
                h06 h06Var = (h06) obj;
                if (this.a.equals(h06Var.b()) && Arrays.equals((h06[]) this.j.getValue(), (h06[]) ((hp4) obj).j.getValue())) {
                    int d = h06Var.d();
                    int i = this.c;
                    if (i == d) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (b53.x(j(i2).b(), h06Var.j(i2).b()) && b53.x(j(i2).c(), h06Var.j(i2).c())) {
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

    @Override // defpackage.q80
    public final Set g() {
        return this.h.keySet();
    }

    @Override // defpackage.h06
    public final List getAnnotations() {
        return pp1.A;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.h06
    public final List i(int i) {
        List list = this.f[i];
        if (list == null) {
            return pp1.A;
        }
        return list;
    }

    @Override // defpackage.h06
    public h06 j(int i) {
        return ((m93[]) this.i.getValue())[i].e();
    }

    @Override // defpackage.h06
    public final boolean k(int i) {
        return this.g[i];
    }

    public final void l(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = hashMap;
        }
    }

    public final void m(kv4 kv4Var) {
        int i = this.d;
        List[] listArr = this.f;
        List list = listArr[i];
        if (list == null) {
            list = new ArrayList(1);
            listArr[this.d] = list;
        }
        list.add(kv4Var);
    }

    public String toString() {
        return me2.b0(this);
    }
}
