package ai;

import android.view.KeyEvent;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 implements mc.l {
    public final /* synthetic */ q1.a0 A;
    public final /* synthetic */ mc.l B;
    public final /* synthetic */ mc.l L;
    public final /* synthetic */ ze.a R;

    public h0(q1.b bVar, mc.l lVar, mc.l lVar2, ze.a aVar) {
        this.A = bVar;
        this.B = lVar;
        this.L = lVar2;
        this.R = aVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        KeyEvent keyEvent = ((t3.b) obj).f13107a;
        keyEvent.getClass();
        if (keyEvent.getAction() == 0) {
            long a10 = t3.c.a(keyEvent.getKeyCode());
            boolean a11 = t3.a.a(a10, t3.a.H);
            mc.l lVar = this.B;
            q1.a0 a0Var = this.A;
            if (a11) {
                if (a0Var.k() > 0) {
                    lVar.k(((fc.b) zh.q.getEntries()).get(a0Var.k() - 1));
                    return Boolean.TRUE;
                }
            } else if (t3.a.a(a10, t3.a.I)) {
                if (a0Var.k() < p7.t.l(zh.q.getEntries())) {
                    lVar.k(((fc.b) zh.q.getEntries()).get(a0Var.k() + 1));
                    return Boolean.TRUE;
                }
            } else if (t3.a.a(a10, t3.a.L)) {
                this.L.k(this.R);
            }
        }
        return Boolean.FALSE;
    }
}
