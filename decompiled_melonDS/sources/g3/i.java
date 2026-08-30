package g3;

import a1.n0;
import a1.v0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final p f5515a;

    /* renamed from: b  reason: collision with root package name */
    public final b4.x f5516b;

    /* renamed from: c  reason: collision with root package name */
    public final n0 f5517c;

    /* renamed from: d  reason: collision with root package name */
    public final n0 f5518d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5519e;

    public i(p pVar, b4.x xVar) {
        this.f5515a = pVar;
        this.f5516b = xVar;
        n0 n0Var = v0.f110a;
        this.f5517c = new n0();
        this.f5518d = new n0();
    }

    public final void a() {
        if (!this.f5519e) {
            b4.o oVar = new b4.o(0, this, i.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 2);
            a1.h0 h0Var = this.f5516b.f1986q1;
            if (h0Var.g(oVar) < 0) {
                h0Var.a(oVar);
            }
            this.f5519e = true;
        }
    }
}
