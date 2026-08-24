package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b44  reason: default package */
/* loaded from: classes.dex */
public final class b44 {
    public final android.content.Context a;
    public double b;
    public final boolean c;
    public final boolean d;

    public b44(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r3.a = r4
            android.graphics.Bitmap$Config[] r0 = defpackage.k.a
            r0 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            java.lang.Class<android.app.ActivityManager> r2 = android.app.ActivityManager.class
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: java.lang.Exception -> L22
            r4.getClass()     // Catch: java.lang.Exception -> L22
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch: java.lang.Exception -> L22
            boolean r4 = r4.isLowRamDevice()     // Catch: java.lang.Exception -> L22
            if (r4 == 0) goto L22
            r0 = 4594572339843380019(0x3fc3333333333333, double:0.15)
        L22:
            r3.b = r0
            r4 = 1
            r3.c = r4
            r3.d = r4
            return
    }

    public final defpackage.se5 a() {
            r8 = this;
            boolean r0 = r8.d
            r1 = 0
            if (r0 == 0) goto Ld
            zb r0 = new zb
            r2 = 12
            r0.<init>(r2, r1)
            goto L13
        Ld:
            x31 r0 = new x31
            r2 = 3
            r0.<init>(r2)
        L13:
            boolean r2 = r8.c
            r3 = 17
            if (r2 == 0) goto L5c
            double r4 = r8.b
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L4e
            android.content.Context r8 = r8.a
            android.graphics.Bitmap$Config[] r1 = defpackage.k.a
            java.lang.Class<android.app.ActivityManager> r1 = android.app.ActivityManager.class
            java.lang.Object r1 = r8.getSystemService(r1)     // Catch: java.lang.Exception -> L45
            r1.getClass()     // Catch: java.lang.Exception -> L45
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Exception -> L45
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()     // Catch: java.lang.Exception -> L45
            int r8 = r8.flags     // Catch: java.lang.Exception -> L45
            r2 = 1048576(0x100000, float:1.469368E-39)
            r8 = r8 & r2
            if (r8 == 0) goto L40
            int r8 = r1.getLargeMemoryClass()     // Catch: java.lang.Exception -> L45
            goto L47
        L40:
            int r8 = r1.getMemoryClass()     // Catch: java.lang.Exception -> L45
            goto L47
        L45:
            r8 = 256(0x100, float:3.59E-43)
        L47:
            double r1 = (double) r8
            double r4 = r4 * r1
            r1 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r4 = r4 * r1
            double r4 = r4 * r1
            int r1 = (int) r4
        L4e:
            if (r1 <= 0) goto L56
            ap3 r8 = new ap3
            r8.<init>(r1, r0)
            goto L61
        L56:
            d51 r8 = new d51
            r8.<init>(r0, r3)
            goto L61
        L5c:
            d51 r8 = new d51
            r8.<init>(r0, r3)
        L61:
            se5 r1 = new se5
            r1.<init>(r8, r0)
            return r1
    }
}
