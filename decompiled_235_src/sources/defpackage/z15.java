package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z15  reason: default package */
/* loaded from: classes.dex */
public final class z15 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ a25 f;

    public z15(a25 a25Var, List list) {
        this.f = a25Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            s53.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
