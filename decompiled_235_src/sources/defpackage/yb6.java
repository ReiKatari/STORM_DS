package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb6  reason: default package */
/* loaded from: classes.dex */
public final class yb6 implements wb6, ya0 {
    public final String a;
    public final np2 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final wb6[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final wb6[] k;
    public final ex6 l;

    public yb6(String str, np2 np2Var, int i, List list, br0 br0Var) {
        this.a = str;
        this.b = np2Var;
        this.c = i;
        this.d = br0Var.b;
        ArrayList arrayList = br0Var.c;
        arrayList.getClass();
        HashSet hashSet = new HashSet(c14.k0(ht0.v0(arrayList, 12)));
        gt0.h1(arrayList, hashSet);
        this.e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = q60.r(br0Var.e);
        this.h = (List[]) br0Var.f.toArray(new List[0]);
        this.i = gt0.g1(br0Var.g);
        strArr.getClass();
        dv dvVar = new dv(new a5(strArr, 4), 2);
        ArrayList arrayList2 = new ArrayList(ht0.v0(dvVar, 10));
        Iterator it = dvVar.iterator();
        while (true) {
            op1 op1Var = (op1) it;
            if (op1Var.B.hasNext()) {
                j43 j43Var = (j43) op1Var.next();
                arrayList2.add(new vr4(j43Var.b, Integer.valueOf(j43Var.a)));
            } else {
                this.j = c14.r0(arrayList2);
                this.k = q60.r(list);
                this.l = new ex6(new t46(this, 6));
                return;
            }
        }
    }

    @Override // defpackage.wb6
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ya0
    public final Set b() {
        return this.e;
    }

    @Override // defpackage.wb6
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.wb6
    public final np2 e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yb6) {
                wb6 wb6Var = (wb6) obj;
                if (this.a.equals(wb6Var.a()) && Arrays.equals(this.k, ((yb6) obj).k)) {
                    int f = wb6Var.f();
                    int i = this.c;
                    if (i == f) {
                        for (int i2 = 0; i2 < i; i2++) {
                            wb6[] wb6VarArr = this.g;
                            if (nb3.k(wb6VarArr[i2].a(), wb6Var.j(i2).a()) && nb3.k(wb6VarArr[i2].e(), wb6Var.j(i2).e())) {
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
        return this.f[i];
    }

    @Override // defpackage.wb6
    public final List getAnnotations() {
        return this.d;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.wb6
    public final List i(int i) {
        return this.h[i];
    }

    @Override // defpackage.wb6
    public final wb6 j(int i) {
        return this.g[i];
    }

    @Override // defpackage.wb6
    public final boolean k(int i) {
        return this.i[i];
    }

    public final String toString() {
        return oi2.Z(this);
    }
}
