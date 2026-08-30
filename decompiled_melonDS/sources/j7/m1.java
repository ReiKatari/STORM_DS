package j7;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m1 extends x0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7629a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g0 f7630b;

    public m1(g0 g0Var) {
        this.f7630b = g0Var;
    }

    @Override // j7.x0
    public final void a(int i2) {
        if (i2 == 0 && this.f7629a) {
            this.f7629a = false;
            this.f7630b.f();
        }
    }

    @Override // j7.x0
    public final void b(RecyclerView recyclerView, int i2, int i10) {
        if (i2 == 0 && i10 == 0) {
            return;
        }
        this.f7629a = true;
    }
}
