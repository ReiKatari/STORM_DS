package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ya6  reason: default package */
/* loaded from: classes.dex */
public final class ya6 {
    public final ta6 a;
    public final q94 b;

    public ya6(xa6 xa6Var, g93 g93Var) {
        this.a = xa6Var.d;
        List j = xa6.j(4, xa6Var);
        this.b = new q94(j.size());
        int size = j.size();
        for (int i = 0; i < size; i++) {
            xa6 xa6Var2 = (xa6) j.get(i);
            if (g93Var.a(xa6Var2.f)) {
                this.b.a(xa6Var2.f);
            }
        }
    }
}
