package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements cc.f {
    public static final m9.o B = new Object();
    public static final /* synthetic */ e L = new e(1);
    public static final e R = new e(2);
    public static final e X = new e(3);
    public static final e Y = new e(4);
    public static final e Z = new e(5);
    public final /* synthetic */ int A;

    public /* synthetic */ e(int i2) {
        this.A = i2;
    }

    public static final void a(e eVar) {
        cd.q1 q1Var;
        t2.b bVar;
        int i2;
        Object obj;
        t2.b bVar2;
        cd.q1 q1Var2 = u1.f10038z;
        do {
            q1Var = u1.f10038z;
            bVar = (t2.b) q1Var.getValue();
            s2.b bVar3 = bVar.L;
            t2.a aVar = (t2.a) bVar3.get(eVar);
            if (aVar == null) {
                bVar2 = bVar;
            } else {
                Object obj2 = aVar.f13080a;
                Object obj3 = aVar.f13081b;
                s2.k kVar = bVar3.A;
                if (eVar != null) {
                    i2 = eVar.hashCode();
                } else {
                    i2 = 0;
                }
                s2.k v10 = kVar.v(i2, 0, eVar);
                if (kVar != v10) {
                    if (v10 == null) {
                        bVar3 = s2.b.L;
                    } else {
                        bVar3 = new s2.b(v10, bVar3.B - 1);
                    }
                }
                u2.b bVar4 = u2.b.f13479a;
                if (obj2 != bVar4) {
                    Object obj4 = bVar3.get(obj2);
                    obj4.getClass();
                    bVar3 = bVar3.c(obj2, new t2.a(((t2.a) obj4).f13080a, obj3));
                }
                if (obj3 != bVar4) {
                    Object obj5 = bVar3.get(obj3);
                    obj5.getClass();
                    bVar3 = bVar3.c(obj3, new t2.a(obj2, ((t2.a) obj5).f13081b));
                }
                if (obj2 != bVar4) {
                    obj = bVar.A;
                } else {
                    obj = obj3;
                }
                if (obj3 != bVar4) {
                    obj2 = bVar.B;
                }
                bVar2 = new t2.b(obj, obj2, bVar3);
            }
            if (bVar == bVar2) {
                return;
            }
        } while (!q1Var.i(bVar, bVar2));
    }

    public boolean b(Object obj, Object obj2) {
        switch (this.A) {
            case 2:
                return false;
            case 3:
                if (obj == obj2) {
                    return true;
                }
                return false;
            default:
                return nc.k.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.A) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case l1.c.f8509e /* 6 */:
            default:
                return super.toString();
            case l1.c.f8511g /* 5 */:
                return "StructuralEqualityPolicy";
            case 7:
                return "Empty";
        }
    }
}
