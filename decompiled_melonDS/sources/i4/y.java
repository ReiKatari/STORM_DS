package i4;

import ah.d0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator[] f6812a;

    /* renamed from: b  reason: collision with root package name */
    public static final k f6813b;

    static {
        g gVar;
        Comparator[] comparatorArr = new Comparator[2];
        for (int i2 = 0; i2 < 2; i2++) {
            if (i2 == 0) {
                gVar = g.f6716c;
            } else {
                gVar = g.f6715b;
            }
            comparatorArr[i2] = new d0(2, new d0(gVar));
        }
        f6812a = comparatorArr;
        f6813b = k.f6739q0;
    }

    public static final void a(p pVar, ArrayList arrayList, a4.a aVar, a4.a aVar2, a1.x xVar) {
        m mVar = pVar.f6770d;
        Object g10 = mVar.A.g(t.m);
        if (g10 == null) {
            g10 = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g10).booleanValue();
        if ((booleanValue || ((Boolean) aVar2.k(pVar)).booleanValue()) && ((Boolean) aVar.k(pVar)).booleanValue()) {
            arrayList.add(pVar);
        }
        if (booleanValue) {
            xVar.i(pVar.f6773g, b(pVar, aVar, aVar2, p.j(7, pVar)));
            return;
        }
        List j2 = p.j(7, pVar);
        int size = j2.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((p) j2.get(i2), arrayList, aVar, aVar2, xVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed A[LOOP:1: B:12:0x0046->B:35:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5 A[EDGE_INSN: B:53:0x00f5->B:37:0x00f5 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(i4.p r17, a4.a r18, a4.a r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.y.b(i4.p, a4.a, a4.a, java.util.List):java.util.ArrayList");
    }
}
