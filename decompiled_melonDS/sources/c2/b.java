package c2;

import a4.o;
import b3.m;
import b3.p;
import v3.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final o f2551a;

    static {
        float f8 = 40;
        float f10 = 10;
        f2551a = new o(f10, f8, f10, f8);
    }

    public static final p a(boolean z10, boolean z11, mc.a aVar) {
        p pVar = m.f1770a;
        if (z10 && e.f2556a) {
            if (z11) {
                pVar = new z(f2551a);
            }
            return pVar.f(new a(aVar));
        }
        return pVar;
    }
}
