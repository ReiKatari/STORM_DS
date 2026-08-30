package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@j54("dialog")
/* renamed from: ef1  reason: default package */
/* loaded from: classes.dex */
public final class ef1 extends k54 {
    @Override // defpackage.k54
    public final b44 a() {
        et0 et0Var = mt0.a;
        return new df1(this);
    }

    @Override // defpackage.k54
    public final void d(List list, u44 u44Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((l34) it.next());
        }
    }

    @Override // defpackage.k54
    public final void e(l34 l34Var, boolean z) {
        b().e(l34Var, z);
        int O0 = tq0.O0((Iterable) b().f.A.getValue(), l34Var);
        int i = 0;
        for (Object obj : (Iterable) b().f.A.getValue()) {
            int i2 = i + 1;
            if (i >= 0) {
                l34 l34Var2 = (l34) obj;
                if (i > O0) {
                    b().c(l34Var2);
                }
                i = i2;
            } else {
                l07.v0();
                throw null;
            }
        }
    }
}
