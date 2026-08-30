package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cu0  reason: default package */
/* loaded from: classes.dex */
public final class cu0 extends RuntimeException {
    public final w14 A;
    public final w14 B;
    public final i14 L;
    public final int R;

    public cu0(w14 w14Var, w14 w14Var2, i14 i14Var, int i, Exception exc) {
        super(exc);
        this.A = w14Var;
        this.B = w14Var2;
        this.L = i14Var;
        this.R = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.R);
        sb.append(":\n            |");
        c06 W = io2.W(new bu0(this, null));
        if (!W.hasNext()) {
            list = pp1.A;
        } else {
            Object next = W.next();
            if (!W.hasNext()) {
                list = l07.b0(next);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (W.hasNext()) {
                    arrayList.add(W.next());
                }
                list = arrayList;
            }
        }
        sb.append(tq0.S0(tq0.i1(50, list), "\n", null, null, null, 62));
        sb.append("\n            ");
        return ah6.Z(sb.toString());
    }
}
