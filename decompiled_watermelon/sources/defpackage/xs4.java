package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xs4  reason: default package */
/* loaded from: classes.dex */
public final class xs4 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ ys4 f;

    public xs4(ys4 ys4Var, List list) {
        this.f = ys4Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            pz2.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
