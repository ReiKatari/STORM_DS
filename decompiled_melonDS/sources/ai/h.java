package ai;

import android.view.KeyEvent;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements mc.l {
    public final /* synthetic */ List A;
    public final /* synthetic */ int B;
    public final /* synthetic */ mc.l L;
    public final /* synthetic */ n2.w0 R;
    public final /* synthetic */ x4.m X;

    public h(List list, int i2, mc.l lVar, n2.w0 w0Var, x4.m mVar) {
        this.A = list;
        this.B = i2;
        this.L = lVar;
        this.R = w0Var;
        this.X = mVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        int i2;
        KeyEvent keyEvent = ((t3.b) obj).f13107a;
        keyEvent.getClass();
        boolean z10 = false;
        if (t3.c.c(keyEvent) == 2 && ((Boolean) this.R.getValue()).booleanValue()) {
            long a10 = t3.c.a(keyEvent.getKeyCode());
            if (t3.a.a(a10, t3.a.f13087f)) {
                i2 = -1;
            } else if (t3.a.a(a10, t3.a.f13088g)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.X != x4.m.Ltr) {
                i2 = -i2;
            }
            if (i2 != 0) {
                List list = this.A;
                int size = list.size();
                int i10 = this.B + i2;
                if (i10 >= 0 && i10 < size) {
                    this.L.k(Long.valueOf(((zh.c) list.get(i10)).f15110a));
                    z10 = true;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
