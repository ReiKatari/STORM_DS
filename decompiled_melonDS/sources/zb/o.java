package zb;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class o extends n {
    public static void H(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void I(List list, Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
