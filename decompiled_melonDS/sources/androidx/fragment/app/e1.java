package androidx.fragment.app;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e1 implements d1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f1269a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g1 f1270b;

    public e1(g1 g1Var, int i2) {
        this.f1270b = g1Var;
        this.f1269a = i2;
    }

    @Override // androidx.fragment.app.d1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        g1 g1Var = this.f1270b;
        j0 j0Var = g1Var.f1334z;
        int i2 = this.f1269a;
        if (j0Var != null && i2 < 0 && j0Var.getChildFragmentManager().R(-1, 0)) {
            return false;
        }
        return g1Var.S(arrayList, arrayList2, i2, 1);
    }
}
