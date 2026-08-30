package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jl3  reason: default package */
/* loaded from: classes.dex */
public final class jl3 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public long c;
    public long d;
    public boolean e;

    public static boolean b(zk3 zk3Var) {
        if (zk3Var != zk3.SCOREBOARD && zk3Var != zk3.FAILED && zk3Var != zk3.CANCELED) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.kl3 r11, boolean r12) {
        /*
            r10 = this;
            r0 = 1
            java.util.LinkedHashMap r1 = r10.a
            r2 = 0
            if (r12 == 0) goto L18
            java.lang.Object r12 = r1.get(r11)
            al3 r12 = (defpackage.al3) r12
            if (r12 == 0) goto L11
            zk3 r12 = r12.b
            goto L12
        L11:
            r12 = 0
        L12:
            zk3 r3 = defpackage.zk3.PENDING
            if (r12 != r3) goto L18
            r12 = r0
            goto L19
        L18:
            r12 = r2
        L19:
            long r3 = r11.b
            long r5 = r11.a
            long r7 = r10.d
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 > 0) goto L26
            if (r12 != 0) goto L26
            goto L42
        L26:
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            java.util.LinkedHashMap r7 = r10.b
            java.lang.Object r12 = r7.get(r12)
            java.lang.Long r12 = (java.lang.Long) r12
            java.lang.Object r11 = r1.get(r11)
            if (r11 != 0) goto L43
            if (r12 == 0) goto L43
            long r8 = r12.longValue()
            int r11 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r11 >= 0) goto L43
        L42:
            return r2
        L43:
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            if (r12 == 0) goto L4e
            long r1 = r12.longValue()
            goto L50
        L4e:
            r1 = 0
        L50:
            long r1 = java.lang.Math.max(r1, r3)
            java.lang.Long r12 = java.lang.Long.valueOf(r1)
            r7.put(r11, r12)
            long r11 = r10.c
            long r11 = java.lang.Math.max(r11, r3)
            r10.c = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl3.a(kl3, boolean):boolean");
    }

    public final void c() {
        this.a.clear();
        this.b.clear();
        this.d = this.c;
        this.e = false;
    }
}
