package v2;

import java.util.ArrayList;
import n2.m;
import n2.p1;
import n2.r;
import n2.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final StackTraceElement[] f13612a = new StackTraceElement[0];

    /* renamed from: b  reason: collision with root package name */
    public static final j f13613b = new j(0, new long[0], new Object[0]);

    public static final int a(int i2, int i10) {
        return i2 << (((i10 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final c c(int i2, yb.d dVar, m mVar) {
        r rVar = (r) mVar;
        Object L = rVar.L();
        if (L == n2.l.f9953a) {
            L = new c(i2, true, dVar);
            rVar.h0(L);
        }
        c cVar = (c) L;
        if (!cVar.L.equals(dVar)) {
            cVar.L = dVar;
            if (cVar.B) {
                p1 p1Var = cVar.R;
                if (p1Var != null) {
                    y yVar = p1Var.f9980a;
                    if (yVar != null) {
                        yVar.s(p1Var, null);
                    }
                    cVar.R = null;
                }
                ArrayList arrayList = cVar.X;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        p1 p1Var2 = (p1) arrayList.get(i10);
                        y yVar2 = p1Var2.f9980a;
                        if (yVar2 != null) {
                            yVar2.s(p1Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return cVar;
    }

    public static final boolean d(p1 p1Var, p1 p1Var2) {
        if (p1Var != null && p1Var.a() && !p1Var.equals(p1Var2) && !nc.k.a(p1Var.f9982c, p1Var2.f9982c)) {
            return false;
        }
        return true;
    }
}
