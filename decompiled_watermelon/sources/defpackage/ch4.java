package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ch4  reason: default package */
/* loaded from: classes.dex */
public abstract class ch4 {
    public static final String a = y70.h("PackageManagerHelper");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        defpackage.y70.f().b(r2, "Skipping component enablement for ".concat(r8.getName()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r7, java.lang.Class r8, boolean r9) {
        /*
            java.lang.String r0 = "disabled"
            java.lang.String r1 = "enabled"
            java.lang.String r2 = defpackage.ch4.a
            java.lang.String r3 = "Skipping component enablement for "
            java.lang.String r4 = r8.getName()     // Catch: java.lang.Exception -> L33
            android.content.pm.PackageManager r5 = r7.getPackageManager()     // Catch: java.lang.Exception -> L33
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch: java.lang.Exception -> L33
            r6.<init>(r7, r4)     // Catch: java.lang.Exception -> L33
            int r4 = r5.getComponentEnabledSetting(r6)     // Catch: java.lang.Exception -> L33
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L1e
            goto L21
        L1e:
            if (r4 != r6) goto L21
            r5 = r6
        L21:
            if (r9 != r5) goto L35
            y70 r7 = defpackage.y70.f()     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = r8.getName()     // Catch: java.lang.Exception -> L33
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Exception -> L33
            r7.b(r2, r3)     // Catch: java.lang.Exception -> L33
            return
        L33:
            r7 = move-exception
            goto L6f
        L35:
            android.content.pm.PackageManager r3 = r7.getPackageManager()     // Catch: java.lang.Exception -> L33
            android.content.ComponentName r4 = new android.content.ComponentName     // Catch: java.lang.Exception -> L33
            java.lang.String r5 = r8.getName()     // Catch: java.lang.Exception -> L33
            r4.<init>(r7, r5)     // Catch: java.lang.Exception -> L33
            if (r9 == 0) goto L46
            r7 = r6
            goto L47
        L46:
            r7 = 2
        L47:
            r3.setComponentEnabledSetting(r4, r7, r6)     // Catch: java.lang.Exception -> L33
            y70 r7 = defpackage.y70.f()     // Catch: java.lang.Exception -> L33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L33
            r3.<init>()     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = r8.getName()     // Catch: java.lang.Exception -> L33
            r3.append(r4)     // Catch: java.lang.Exception -> L33
            java.lang.String r4 = " "
            r3.append(r4)     // Catch: java.lang.Exception -> L33
            if (r9 == 0) goto L63
            r4 = r1
            goto L64
        L63:
            r4 = r0
        L64:
            r3.append(r4)     // Catch: java.lang.Exception -> L33
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L33
            r7.b(r2, r3)     // Catch: java.lang.Exception -> L33
            return
        L6f:
            y70 r3 = defpackage.y70.f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = r8.getName()
            r4.append(r8)
            java.lang.String r8 = "could not be "
            r4.append(r8)
            if (r9 == 0) goto L87
            r0 = r1
        L87:
            r4.append(r0)
            java.lang.String r8 = r4.toString()
            r3.c(r2, r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch4.a(android.content.Context, java.lang.Class, boolean):void");
    }
}
