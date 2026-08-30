package g3;

import a4.o0;
import java.util.Comparator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final j0 f5522a = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object[], java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        g0 g0Var = (g0) obj;
        g0 g0Var2 = (g0) obj2;
        int i2 = 0;
        if (d.s(g0Var) && d.s(g0Var2)) {
            o0 t5 = a4.l.t(g0Var);
            o0 t10 = a4.l.t(g0Var2);
            if (!nc.k.a(t5, t10)) {
                o0[] o0VarArr = new o0[16];
                int i10 = 0;
                while (t5 != null) {
                    int i11 = i10 + 1;
                    if (o0VarArr.length < i11) {
                        int length = o0VarArr.length;
                        ?? r5 = new Object[Math.max(i11, length * 2)];
                        System.arraycopy(o0VarArr, 0, r5, 0, length);
                        o0VarArr = r5;
                    }
                    if (i10 != 0) {
                        System.arraycopy(o0VarArr, 0, o0VarArr, 0 + 1, i10 + 0);
                    }
                    o0VarArr[0] = t5;
                    i10++;
                    t5 = t5.u();
                }
                o0[] o0VarArr2 = new o0[16];
                int i12 = 0;
                while (t10 != null) {
                    int i13 = i12 + 1;
                    if (o0VarArr2.length < i13) {
                        int length2 = o0VarArr2.length;
                        ?? r52 = new Object[Math.max(i13, length2 * 2)];
                        System.arraycopy(o0VarArr2, 0, r52, 0, length2);
                        o0VarArr2 = r52;
                    }
                    if (i12 != 0) {
                        System.arraycopy(o0VarArr2, 0, o0VarArr2, 0 + 1, i12 + 0);
                    }
                    o0VarArr2[0] = t10;
                    i12++;
                    t10 = t10.u();
                }
                int min = Math.min(i10 - 1, i12 - 1);
                if (min >= 0) {
                    while (nc.k.a(o0VarArr[i2], o0VarArr2[i2])) {
                        if (i2 != min) {
                            i2++;
                        }
                    }
                    return nc.k.b(o0VarArr[i2].v(), o0VarArr2[i2].v());
                }
                a0.j.p("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            }
        } else if (d.s(g0Var)) {
            return -1;
        } else {
            if (d.s(g0Var2)) {
                return 1;
            }
        }
        return 0;
    }
}
