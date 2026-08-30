package gk;

import java.lang.reflect.Array;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends y0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5714d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ y0 f5715e;

    public /* synthetic */ b0(y0 y0Var, int i2) {
        this.f5714d = i2;
        this.f5715e = y0Var;
    }

    @Override // gk.y0
    public final void a(o0 o0Var, Object obj) {
        switch (this.f5714d) {
            case 0:
                Iterable<Object> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (Object obj2 : iterable) {
                        this.f5715e.a(o0Var, obj2);
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        this.f5715e.a(o0Var, Array.get(obj, i2));
                    }
                    return;
                }
                return;
        }
    }
}
