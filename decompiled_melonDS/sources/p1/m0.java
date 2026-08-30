package p1;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f11231a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f11232b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o0 f11233c;

    public m0(o0 o0Var, int i2) {
        this.f11233c = o0Var;
        this.f11231a = i2;
    }

    public final void a(int i2) {
        o0 o0Var = this.f11233c;
        e9.a aVar = o0Var.f11240c;
        if (aVar == null) {
            return;
        }
        this.f11232b.add(new b1(aVar, i2, o0Var.f11239b, null));
    }
}
