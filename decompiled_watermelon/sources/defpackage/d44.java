package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d44  reason: default package */
/* loaded from: classes.dex */
public abstract class d44 {
    public final k54 a;
    public final int b;
    public final String c;
    public final LinkedHashMap d;
    public final ArrayList e;
    public final LinkedHashMap f;

    public d44(k54 k54Var, qo0 qo0Var, Map map) {
        int i;
        String str;
        q9 q9Var;
        map.getClass();
        if (qo0Var != null) {
            i = io2.v(me2.O(qo0Var));
        } else {
            i = -1;
        }
        int i2 = 0;
        if (qo0Var != null) {
            m93 O = me2.O(qo0Var);
            if (O instanceof bq4) {
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                qo0 h0 = ct3.h0(((bq4) O).e());
                throw new IllegalArgumentException(b31.q(sb, h0 != null ? h0.c() : null, ". Routes can only be generated from concrete classes or objects."));
            }
            km4 km4Var = new km4(11, new q9(O));
            int d = O.e().d();
            for (int i3 = 0; i3 < d; i3++) {
                String e = O.e().e(i3);
                z44 r = io2.r(O.e().j(i3), map);
                if (r != null) {
                    km4Var.i(Integer.valueOf(i3), e, r);
                } else {
                    i.i(io2.s0(e, O.e().j(i3).b(), O.e().b(), map.toString()));
                    throw null;
                }
            }
            str = ((String) q9Var.L) + ((String) q9Var.R) + ((String) q9Var.X);
        } else {
            str = null;
        }
        this.a = k54Var;
        this.b = i;
        this.c = str;
        this.d = new LinkedHashMap();
        this.e = new ArrayList();
        this.f = new LinkedHashMap();
        if (qo0Var != null) {
            m93 O2 = me2.O(qo0Var);
            if (!(O2 instanceof bq4)) {
                int d2 = O2.e().d();
                ArrayList arrayList = new ArrayList(d2);
                for (int i4 = 0; i4 < d2; i4++) {
                    String e2 = O2.e().e(i4);
                    e2.getClass();
                    h06 j = O2.e().j(i4);
                    boolean h = j.h();
                    z44 r2 = io2.r(j, map);
                    if (r2 != null) {
                        arrayList.add(new h34(e2, new k34(r2, h, O2.e().k(i4))));
                    } else {
                        i.i(io2.s0(e2, j.b(), O2.e().b(), map.toString()));
                        throw null;
                    }
                }
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    h34 h34Var = (h34) obj;
                    this.d.put(h34Var.a, h34Var.b);
                }
                return;
            }
            c44.x(O2, ". Arguments can only be generated from concrete classes or objects.", "Cannot generate NavArguments for polymorphic serializer ");
            throw null;
        }
    }

    public b44 a() {
        b44 b = b();
        b.getClass();
        y9 y9Var = b.B;
        for (Map.Entry entry : this.d.entrySet()) {
            String str = (String) entry.getKey();
            k34 k34Var = (k34) entry.getValue();
            str.getClass();
            k34Var.getClass();
            y9Var.getClass();
            ((LinkedHashMap) y9Var.d).put(str, k34Var);
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            final y34 y34Var = (y34) obj;
            y34Var.getClass();
            y9Var.getClass();
            ArrayList Q = cg2.Q((LinkedHashMap) y9Var.d, new mi2() { // from class: e44
                @Override // defpackage.mi2
                public final Object n(Object obj2) {
                    boolean contains;
                    int i2 = r2;
                    y34 y34Var2 = y34Var;
                    String str2 = (String) obj2;
                    switch (i2) {
                        case 0:
                            str2.getClass();
                            contains = y34Var2.c().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            contains = y34Var2.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (Q.isEmpty()) {
                ((ArrayList) y9Var.c).add(y34Var);
            } else {
                c44.m("Deep link ", y34Var.a, " can't be used to open destination ", (b44) y9Var.b, ".\nFollowing required arguments are missing: ", Q);
                return null;
            }
        }
        Iterator it = this.f.entrySet().iterator();
        if (!it.hasNext()) {
            String str2 = this.c;
            if (str2 != null) {
                y9Var.getClass();
                if (!zg6.B0(str2)) {
                    String concat = "android-app://androidx.navigation/".concat(str2);
                    final y34 y34Var2 = new y34(concat);
                    ArrayList Q2 = cg2.Q((LinkedHashMap) y9Var.d, new mi2() { // from class: e44
                        @Override // defpackage.mi2
                        public final Object n(Object obj2) {
                            boolean contains;
                            int i2 = r2;
                            y34 y34Var22 = y34Var2;
                            String str22 = (String) obj2;
                            switch (i2) {
                                case 0:
                                    str22.getClass();
                                    contains = y34Var22.c().contains(str22);
                                    break;
                                default:
                                    str22.getClass();
                                    contains = y34Var22.c().contains(str22);
                                    break;
                            }
                            return Boolean.valueOf(!contains);
                        }
                    });
                    if (Q2.isEmpty()) {
                        y9Var.f = new il6(new f44(concat, 0));
                        y9Var.a = concat.hashCode();
                        y9Var.e = str2;
                    } else {
                        StringBuilder u = b31.u("Cannot set route \"", str2, "\" for destination ");
                        u.append((b44) y9Var.b);
                        u.append(". Following required arguments are missing: ");
                        u.append(Q2);
                        throw new IllegalArgumentException(u.toString().toString());
                    }
                } else {
                    i.i("Cannot have an empty route");
                    return null;
                }
            }
            int i2 = this.b;
            if (i2 != -1) {
                y9Var.a = i2;
            }
            return b;
        }
        Map.Entry entry2 = (Map.Entry) it.next();
        ((Number) entry2.getKey()).intValue();
        entry2.getValue().getClass();
        c44.b();
        return null;
    }

    public b44 b() {
        return this.a.a();
    }
}
