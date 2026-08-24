package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly4  reason: default package */
/* loaded from: classes.dex */
public class ly4 implements wb6, ya0 {
    public final String a;
    public final qr2 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final go3 i;
    public final go3 j;
    public final go3 k;

    public ly4(String str, qr2 qr2Var, int i) {
        this.a = str;
        this.b = qr2Var;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = zt1.A;
        xr3 xr3Var = xr3.PUBLICATION;
        this.i = kj2.M(xr3Var, new on2(this) { // from class: ky4
            public final /* synthetic */ ly4 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                gg3[] b;
                ArrayList arrayList;
                gg3[] a;
                int i4 = r2;
                ly4 ly4Var = this.B;
                switch (i4) {
                    case 0:
                        qr2 qr2Var2 = ly4Var.b;
                        if (qr2Var2 == null || (b = qr2Var2.b()) == null) {
                            return nc1.h;
                        }
                        return b;
                    case 1:
                        qr2 qr2Var3 = ly4Var.b;
                        if (qr2Var3 != null && (a = qr2Var3.a()) != null) {
                            arrayList = new ArrayList(a.length);
                            for (gg3 gg3Var : a) {
                                arrayList.add(gg3Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return q60.r(arrayList);
                    default:
                        return Integer.valueOf(oi2.H(ly4Var, (wb6[]) ly4Var.j.getValue()));
                }
            }
        });
        this.j = kj2.M(xr3Var, new on2(this) { // from class: ky4
            public final /* synthetic */ ly4 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                gg3[] b;
                ArrayList arrayList;
                gg3[] a;
                int i4 = r2;
                ly4 ly4Var = this.B;
                switch (i4) {
                    case 0:
                        qr2 qr2Var2 = ly4Var.b;
                        if (qr2Var2 == null || (b = qr2Var2.b()) == null) {
                            return nc1.h;
                        }
                        return b;
                    case 1:
                        qr2 qr2Var3 = ly4Var.b;
                        if (qr2Var3 != null && (a = qr2Var3.a()) != null) {
                            arrayList = new ArrayList(a.length);
                            for (gg3 gg3Var : a) {
                                arrayList.add(gg3Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return q60.r(arrayList);
                    default:
                        return Integer.valueOf(oi2.H(ly4Var, (wb6[]) ly4Var.j.getValue()));
                }
            }
        });
        this.k = kj2.M(xr3Var, new on2(this) { // from class: ky4
            public final /* synthetic */ ly4 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                gg3[] b;
                ArrayList arrayList;
                gg3[] a;
                int i4 = r2;
                ly4 ly4Var = this.B;
                switch (i4) {
                    case 0:
                        qr2 qr2Var2 = ly4Var.b;
                        if (qr2Var2 == null || (b = qr2Var2.b()) == null) {
                            return nc1.h;
                        }
                        return b;
                    case 1:
                        qr2 qr2Var3 = ly4Var.b;
                        if (qr2Var3 != null && (a = qr2Var3.a()) != null) {
                            arrayList = new ArrayList(a.length);
                            for (gg3 gg3Var : a) {
                                arrayList.add(gg3Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return q60.r(arrayList);
                    default:
                        return Integer.valueOf(oi2.H(ly4Var, (wb6[]) ly4Var.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.wb6
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ya0
    public final Set b() {
        return this.h.keySet();
    }

    @Override // defpackage.wb6
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.wb6
    public np2 e() {
        return bt6.e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ly4) {
                wb6 wb6Var = (wb6) obj;
                if (this.a.equals(wb6Var.a()) && Arrays.equals((wb6[]) this.j.getValue(), (wb6[]) ((ly4) obj).j.getValue())) {
                    int f = wb6Var.f();
                    int i = this.c;
                    if (i == f) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (nb3.k(j(i2).a(), wb6Var.j(i2).a()) && nb3.k(j(i2).e(), wb6Var.j(i2).e())) {
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

    @Override // defpackage.wb6
    public final int f() {
        return this.c;
    }

    @Override // defpackage.wb6
    public final String g(int i) {
        return this.e[i];
    }

    @Override // defpackage.wb6
    public final List getAnnotations() {
        return yt1.A;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.wb6
    public final List i(int i) {
        List list = this.f[i];
        if (list == null) {
            return yt1.A;
        }
        return list;
    }

    @Override // defpackage.wb6
    public wb6 j(int i) {
        return ((gg3[]) this.i.getValue())[i].e();
    }

    @Override // defpackage.wb6
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

    public final void m(r45 r45Var) {
        int i = this.d;
        List[] listArr = this.f;
        List list = listArr[i];
        if (list == null) {
            list = new ArrayList(1);
            listArr[this.d] = list;
        }
        list.add(r45Var);
    }

    public String toString() {
        return oi2.Z(this);
    }
}
