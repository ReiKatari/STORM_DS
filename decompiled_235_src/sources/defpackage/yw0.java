package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yw0  reason: default package */
/* loaded from: classes.dex */
public final class yw0 extends RuntimeException {
    public final ca4 A;
    public final ca4 B;
    public final o94 L;
    public final int R;

    public yw0(ca4 ca4Var, ca4 ca4Var2, o94 o94Var, int i, Exception exc) {
        super(exc);
        this.A = ca4Var;
        this.B = ca4Var2;
        this.L = o94Var;
        this.R = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.R);
        sb.append(":\n            |");
        rb6 C = qo2.C(new xw0(this, null));
        if (!C.hasNext()) {
            list = yt1.A;
        } else {
            Object next = C.next();
            if (!C.hasNext()) {
                list = hf.b0(next);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (C.hasNext()) {
                    arrayList.add(C.next());
                }
                list = arrayList;
            }
        }
        sb.append(gt0.P0(gt0.f1(50, list), "\n", null, null, null, 62));
        sb.append("\n            ");
        return rs6.S(sb.toString());
    }
}
