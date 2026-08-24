package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nq3  reason: default package */
/* loaded from: classes.dex */
public final class nq3 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ pq3 c;

    public nq3(pq3 pq3Var, int i) {
        this.c = pq3Var;
        this.a = i;
    }

    public final void a(int i) {
        pq3 pq3Var = this.c;
        bk1 bk1Var = pq3Var.c;
        if (bk1Var == null) {
            return;
        }
        this.b.add(new a25(bk1Var, i, pq3Var.b, null));
    }
}
