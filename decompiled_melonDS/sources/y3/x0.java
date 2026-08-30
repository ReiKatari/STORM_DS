package y3;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface x0 extends v {
    w0 k0(int i2, int i10, Map map, mc.l lVar, mc.l lVar2);

    default w0 u0(int i2, int i10, Map map, mc.l lVar) {
        return k0(i2, i10, map, null, lVar);
    }
}
