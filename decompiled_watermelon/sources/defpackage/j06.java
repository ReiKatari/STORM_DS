package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j06  reason: default package */
/* loaded from: classes.dex */
public final class j06 implements h06, q80 {
    public final String a;
    public final ep2 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final h06[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final h06[] k;
    public final il6 l;

    public j06(String str, ep2 ep2Var, int i, List list, ro0 ro0Var) {
        this.a = str;
        this.b = ep2Var;
        this.c = i;
        this.d = ro0Var.b;
        ArrayList arrayList = ro0Var.c;
        arrayList.getClass();
        HashSet hashSet = new HashSet(zt3.j0(uq0.y0(arrayList, 12)));
        tq0.k1(arrayList, hashSet);
        this.e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = mh7.q(ro0Var.e);
        this.h = (List[]) ro0Var.f.toArray(new List[0]);
        this.i = tq0.j1(ro0Var.g);
        strArr.getClass();
        lu luVar = new lu(2, new b5(4, strArr));
        ArrayList arrayList2 = new ArrayList(uq0.y0(luVar, 10));
        Iterator it = luVar.iterator();
        while (true) {
            hl1 hl1Var = (hl1) it;
            if (hl1Var.B.hasNext()) {
                fy2 fy2Var = (fy2) hl1Var.next();
                arrayList2.add(new ti4(fy2Var.b, Integer.valueOf(fy2Var.a)));
            } else {
                this.j = zt3.q0(arrayList2);
                this.k = mh7.q(list);
                this.l = new il6(new bz2(29, this));
                return;
            }
        }
    }

    @Override // defpackage.h06
    public final int a(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
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
    public final ep2 c() {
        return this.b;
    }

    @Override // defpackage.h06
    public final int d() {
        return this.c;
    }

    @Override // defpackage.h06
    public final String e(int i) {
        return this.f[i];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j06) {
                h06 h06Var = (h06) obj;
                if (this.a.equals(h06Var.b()) && Arrays.equals(this.k, ((j06) obj).k)) {
                    int d = h06Var.d();
                    int i = this.c;
                    if (i == d) {
                        for (int i2 = 0; i2 < i; i2++) {
                            h06[] h06VarArr = this.g;
                            if (b53.x(h06VarArr[i2].b(), h06Var.j(i2).b()) && b53.x(h06VarArr[i2].c(), h06Var.j(i2).c())) {
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
        return this.e;
    }

    @Override // defpackage.h06
    public final List getAnnotations() {
        return this.d;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.h06
    public final List i(int i) {
        return this.h[i];
    }

    @Override // defpackage.h06
    public final h06 j(int i) {
        return this.g[i];
    }

    @Override // defpackage.h06
    public final boolean k(int i) {
        return this.i[i];
    }

    public final String toString() {
        return me2.b0(this);
    }
}
