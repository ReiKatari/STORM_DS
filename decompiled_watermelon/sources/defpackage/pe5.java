package defpackage;

import androidx.preference.Preference;
import java.util.Comparator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pe5  reason: default package */
/* loaded from: classes.dex */
public final class pe5 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ pe5(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long l;
        Long l2;
        int i = this.a;
        Map map = this.b;
        switch (i) {
            case 0:
                Integer valueOf = Integer.valueOf((int) Preference.DEFAULT_ORDER);
                Integer num = (Integer) map.get(Long.valueOf(((c6) obj).a));
                if (num == null) {
                    num = valueOf;
                }
                Integer num2 = (Integer) map.get(Long.valueOf(((c6) obj2).a));
                if (num2 != null) {
                    valueOf = num2;
                }
                return iq2.i(num, valueOf);
            default:
                Long l3 = Long.MAX_VALUE;
                gb4 gb4Var = (gb4) map.get((String) obj);
                if (gb4Var == null || (l = gb4Var.c) == null) {
                    l = l3;
                }
                gb4 gb4Var2 = (gb4) map.get((String) obj2);
                if (gb4Var2 != null && (l2 = gb4Var2.c) != null) {
                    l3 = l2;
                }
                return iq2.i(l, l3);
        }
    }
}
