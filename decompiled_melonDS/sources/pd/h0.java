package pd;

import java.util.Set;
import nd.b2;
import nd.s1;
import nd.v1;
import nd.y1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f11587a = zb.k.S(new ld.e[]{v1.f10377b, y1.f10395b, s1.f10365b, b2.f10272b});

    public static final boolean a(ld.e eVar) {
        eVar.getClass();
        if (eVar.f() && f11587a.contains(eVar)) {
            return true;
        }
        return false;
    }
}
