package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ks3  reason: default package */
/* loaded from: classes.dex */
public final class ks3 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public long c;
    public long d;
    public boolean e;

    public static boolean b(as3 as3Var) {
        if (as3Var != as3.SCOREBOARD && as3Var != as3.FAILED && as3Var != as3.CANCELED) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(ls3 ls3Var, boolean z) {
        boolean z2;
        long j;
        Long l;
        long j2;
        as3 as3Var;
        LinkedHashMap linkedHashMap = this.a;
        if (z) {
            bs3 bs3Var = (bs3) linkedHashMap.get(ls3Var);
            if (bs3Var != null) {
                as3Var = bs3Var.b;
            } else {
                as3Var = null;
            }
            if (as3Var == as3.PENDING) {
                z2 = true;
                j = ls3Var.b;
                long j3 = ls3Var.a;
                if (j <= this.d || z2) {
                    Long valueOf = Long.valueOf(j3);
                    LinkedHashMap linkedHashMap2 = this.b;
                    l = (Long) linkedHashMap2.get(valueOf);
                    if (linkedHashMap.get(ls3Var) == null || l == null || j >= l.longValue()) {
                        Long valueOf2 = Long.valueOf(j3);
                        if (l == null) {
                            j2 = l.longValue();
                        } else {
                            j2 = 0;
                        }
                        linkedHashMap2.put(valueOf2, Long.valueOf(Math.max(j2, j)));
                        this.c = Math.max(this.c, j);
                        return true;
                    }
                }
                return false;
            }
        }
        z2 = false;
        j = ls3Var.b;
        long j32 = ls3Var.a;
        if (j <= this.d) {
        }
        Long valueOf3 = Long.valueOf(j32);
        LinkedHashMap linkedHashMap22 = this.b;
        l = (Long) linkedHashMap22.get(valueOf3);
        if (linkedHashMap.get(ls3Var) == null) {
        }
        Long valueOf22 = Long.valueOf(j32);
        if (l == null) {
        }
        linkedHashMap22.put(valueOf22, Long.valueOf(Math.max(j2, j)));
        this.c = Math.max(this.c, j);
        return true;
    }

    public final void c() {
        this.a.clear();
        this.b.clear();
        this.d = this.c;
        this.e = false;
    }
}
