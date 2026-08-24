package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jc4  reason: default package */
/* loaded from: classes.dex */
public abstract class jc4 {
    public final qd4 a;
    public final int b;
    public final String c;
    public final LinkedHashMap d;
    public final ArrayList e;
    public final LinkedHashMap f;

    public jc4(qd4 qd4Var, ar0 ar0Var, Map map) {
        int i;
        String str;
        eb ebVar;
        map.getClass();
        if (ar0Var != null) {
            i = np2.O(jx2.K(ar0Var));
        } else {
            i = -1;
        }
        int i2 = 0;
        if (ar0Var != null) {
            gg3 K = jx2.K(ar0Var);
            if (K instanceof fz4) {
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                ar0 x = n16.x(((fz4) K).e());
                throw new IllegalArgumentException(i61.n(sb, x != null ? x.c() : null, ". Routes can only be generated from concrete classes or objects."));
            }
            ov4 ov4Var = new ov4(new eb(K), 12);
            int f = K.e().f();
            for (int i3 = 0; i3 < f; i3++) {
                String g = K.e().g(i3);
                fd4 D = np2.D(K.e().j(i3), map);
                if (D != null) {
                    ov4Var.e(Integer.valueOf(i3), g, D);
                } else {
                    i.h(np2.j0(g, K.e().j(i3).a(), K.e().a(), map.toString()));
                    throw null;
                }
            }
            str = ((String) ebVar.L) + ((String) ebVar.R) + ((String) ebVar.X);
        } else {
            str = null;
        }
        this.a = qd4Var;
        this.b = i;
        this.c = str;
        this.d = new LinkedHashMap();
        this.e = new ArrayList();
        this.f = new LinkedHashMap();
        if (ar0Var != null) {
            gg3 K2 = jx2.K(ar0Var);
            if (!(K2 instanceof fz4)) {
                int f2 = K2.e().f();
                ArrayList arrayList = new ArrayList(f2);
                for (int i4 = 0; i4 < f2; i4++) {
                    String g2 = K2.e().g(i4);
                    g2.getClass();
                    wb6 j = K2.e().j(i4);
                    boolean c = j.c();
                    fd4 D2 = np2.D(j, map);
                    if (D2 != null) {
                        arrayList.add(new ob4(g2, new rb4(D2, c, K2.e().k(i4))));
                    } else {
                        i.h(np2.j0(g2, j.a(), K2.e().a(), map.toString()));
                        throw null;
                    }
                }
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ob4 ob4Var = (ob4) obj;
                    this.d.put(ob4Var.a, ob4Var.b);
                }
                return;
            }
            u34.C(K2, ". Arguments can only be generated from concrete classes or objects.", "Cannot generate NavArguments for polymorphic serializer ");
            throw null;
        }
    }

    public ic4 a() {
        ic4 b = b();
        b.getClass();
        z9 z9Var = b.B;
        for (Map.Entry entry : this.d.entrySet()) {
            String str = (String) entry.getKey();
            rb4 rb4Var = (rb4) entry.getValue();
            str.getClass();
            rb4Var.getClass();
            z9Var.getClass();
            ((LinkedHashMap) z9Var.d).put(str, rb4Var);
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            final fc4 fc4Var = (fc4) obj;
            fc4Var.getClass();
            z9Var.getClass();
            ArrayList C = xk2.C((LinkedHashMap) z9Var.d, new qn2() { // from class: kc4
                @Override // defpackage.qn2
                public final Object g(Object obj2) {
                    boolean contains;
                    int i2 = r2;
                    fc4 fc4Var2 = fc4Var;
                    String str2 = (String) obj2;
                    switch (i2) {
                        case 0:
                            str2.getClass();
                            contains = fc4Var2.c().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            contains = fc4Var2.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (C.isEmpty()) {
                ((ArrayList) z9Var.c).add(fc4Var);
            } else {
                u34.n("Deep link ", fc4Var.a, " can't be used to open destination ", (ic4) z9Var.b, ".\nFollowing required arguments are missing: ", C);
                return null;
            }
        }
        Iterator it = this.f.entrySet().iterator();
        if (!it.hasNext()) {
            String str2 = this.c;
            if (str2 != null) {
                z9Var.getClass();
                if (!qs6.v0(str2)) {
                    String concat = "android-app://androidx.navigation/".concat(str2);
                    final fc4 fc4Var2 = new fc4(concat);
                    ArrayList C2 = xk2.C((LinkedHashMap) z9Var.d, new qn2() { // from class: kc4
                        @Override // defpackage.qn2
                        public final Object g(Object obj2) {
                            boolean contains;
                            int i2 = r2;
                            fc4 fc4Var22 = fc4Var2;
                            String str22 = (String) obj2;
                            switch (i2) {
                                case 0:
                                    str22.getClass();
                                    contains = fc4Var22.c().contains(str22);
                                    break;
                                default:
                                    str22.getClass();
                                    contains = fc4Var22.c().contains(str22);
                                    break;
                            }
                            return Boolean.valueOf(!contains);
                        }
                    });
                    if (C2.isEmpty()) {
                        z9Var.f = new ex6(new lc4(concat, 0));
                        z9Var.a = concat.hashCode();
                        z9Var.e = str2;
                    } else {
                        StringBuilder t = i61.t("Cannot set route \"", str2, "\" for destination ");
                        t.append((ic4) z9Var.b);
                        t.append(". Following required arguments are missing: ");
                        t.append(C2);
                        throw new IllegalArgumentException(t.toString().toString());
                    }
                } else {
                    i.h("Cannot have an empty route");
                    return null;
                }
            }
            int i2 = this.b;
            if (i2 != -1) {
                z9Var.a = i2;
            }
            return b;
        }
        Map.Entry entry2 = (Map.Entry) it.next();
        ((Number) entry2.getKey()).intValue();
        entry2.getValue().getClass();
        u34.a();
        return null;
    }

    public ic4 b() {
        return this.a.a();
    }
}
