package s;

import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends f {
    public final HashMap X = new HashMap();

    @Override // s.f
    public final c a(Object obj) {
        return (c) this.X.get(obj);
    }

    @Override // s.f
    public final Object b(Object obj) {
        Object b10 = super.b(obj);
        this.X.remove(obj);
        return b10;
    }
}
