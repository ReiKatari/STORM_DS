package j7;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends x0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f7649a;

    public q(t tVar) {
        this.f7649a = tVar;
    }

    @Override // j7.x0
    public final void b(RecyclerView recyclerView, int i2, int i10) {
        boolean z10;
        boolean z11;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        t tVar = this.f7649a;
        int i11 = tVar.f7674a;
        int computeVerticalScrollRange = tVar.f7691s.computeVerticalScrollRange();
        int i12 = tVar.f7690r;
        if (computeVerticalScrollRange - i12 > 0 && i12 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        tVar.f7692t = z10;
        int computeHorizontalScrollRange = tVar.f7691s.computeHorizontalScrollRange();
        int i13 = tVar.f7689q;
        if (computeHorizontalScrollRange - i13 > 0 && i13 >= i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        tVar.f7693u = z11;
        boolean z12 = tVar.f7692t;
        if (!z12 && !z11) {
            if (tVar.f7694v != 0) {
                tVar.g(0);
                return;
            }
            return;
        }
        if (z12) {
            float f8 = i12;
            tVar.f7685l = (int) ((((f8 / 2.0f) + computeVerticalScrollOffset) * f8) / computeVerticalScrollRange);
            tVar.f7684k = Math.min(i12, (i12 * i12) / computeVerticalScrollRange);
        }
        if (tVar.f7693u) {
            float f10 = computeHorizontalScrollOffset;
            float f11 = i13;
            tVar.f7687o = (int) ((((f11 / 2.0f) + f10) * f11) / computeHorizontalScrollRange);
            tVar.f7686n = Math.min(i13, (i13 * i13) / computeHorizontalScrollRange);
        }
        int i14 = tVar.f7694v;
        if (i14 != 0 && i14 != 1) {
            return;
        }
        tVar.g(1);
    }
}
