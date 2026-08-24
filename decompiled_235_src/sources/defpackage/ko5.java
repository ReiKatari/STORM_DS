package defpackage;

import java.util.Comparator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ko5  reason: default package */
/* loaded from: classes.dex */
public final class ko5 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ ko5(int i, Map map) {
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
                Integer num = Integer.MAX_VALUE;
                Integer num2 = (Integer) map.get(Long.valueOf(((c6) obj).a));
                if (num2 == null) {
                    num2 = num;
                }
                Integer num3 = (Integer) map.get(Long.valueOf(((c6) obj2).a));
                if (num3 != null) {
                    num = num3;
                }
                return g04.z(num2, num);
            default:
                Long l3 = Long.MAX_VALUE;
                dk4 dk4Var = (dk4) map.get((String) obj);
                if (dk4Var == null || (l = dk4Var.c) == null) {
                    l = l3;
                }
                dk4 dk4Var2 = (dk4) map.get((String) obj2);
                if (dk4Var2 != null && (l2 = dk4Var2.c) != null) {
                    l3 = l2;
                }
                return g04.z(l, l3);
        }
    }
}
