package c9;

import android.content.Context;
import b4.r0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final long f2766a = x4.b.h(0, 0, 0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final n9.e f2767b;

    /* JADX WARN: Type inference failed for: r0v3, types: [n9.e, java.lang.Object] */
    static {
        n9.g gVar = n9.g.f10113c;
        f2767b = new Object();
    }

    public static final m9.j a(Object obj, n2.m mVar) {
        n2.r rVar = (n2.r) mVar;
        rVar.Y(1087186730);
        if (obj instanceof m9.j) {
            m9.j jVar = (m9.j) obj;
            rVar.p(false);
            return jVar;
        }
        Context context = (Context) rVar.j(r0.f1937b);
        rVar.Y(-1245195153);
        boolean f8 = rVar.f(context) | rVar.f(obj);
        Object L = rVar.L();
        if (f8 || L == n2.l.f9953a) {
            m9.h hVar = new m9.h(context);
            hVar.f9388c = obj;
            L = hVar.a();
            rVar.h0(L);
        }
        m9.j jVar2 = (m9.j) L;
        rVar.p(false);
        rVar.p(false);
        return jVar2;
    }
}
