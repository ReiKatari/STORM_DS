package p1;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a  reason: collision with root package name */
    public final List f11176a;

    /* renamed from: b  reason: collision with root package name */
    public final List[] f11177b;

    /* renamed from: c  reason: collision with root package name */
    public int f11178c;

    /* renamed from: d  reason: collision with root package name */
    public int f11179d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11180e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b1 f11181f;

    public a1(b1 b1Var, List list) {
        this.f11181f = b1Var;
        this.f11176a = list;
        this.f11177b = new List[list.size()];
        if (list.isEmpty()) {
            k1.b.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
