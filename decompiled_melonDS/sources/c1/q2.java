package c1;

import android.view.ViewConfiguration;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class q2 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f2513a = ViewConfiguration.getScrollFriction();

    public static final d1.t a(n2.m mVar) {
        n2.r rVar = (n2.r) mVar;
        x4.c cVar = (x4.c) rVar.j(b4.q1.f1919h);
        boolean c4 = rVar.c(cVar.b());
        Object L = rVar.L();
        if (c4 || L == n2.l.f9953a) {
            L = new d1.t(new a0.b(cVar));
            rVar.h0(L);
        }
        return (d1.t) L;
    }
}
