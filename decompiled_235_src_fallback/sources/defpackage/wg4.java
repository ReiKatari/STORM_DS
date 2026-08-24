package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wg4  reason: default package */
/* loaded from: classes.dex */
public final class wg4 {
    public final android.os.Bundle a;
    public androidx.core.graphics.drawable.IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final java.lang.CharSequence f;
    public final android.app.PendingIntent g;

    public wg4(java.lang.String r11, android.app.PendingIntent r12) {
            r10 = this;
            java.lang.String r0 = ""
            r1 = 0
            r2 = 2131230896(0x7f0800b0, float:1.8077858E38)
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.b(r1, r0, r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r10.<init>()
            r3 = 1
            r10.d = r3
            r10.b = r0
            int r4 = r0.a
            r5 = -1
            if (r4 != r5) goto L78
            java.lang.Object r4 = r0.b
            java.lang.String r6 = "Unable to get icon type "
            java.lang.String r7 = "IconCompat"
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r8 < r9) goto L2d
            int r4 = defpackage.pp.r(r4)
            goto L78
        L2d:
            java.lang.Class r8 = r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L42 java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            java.lang.String r9 = "getType"
            java.lang.reflect.Method r8 = r8.getMethod(r9, r1)     // Catch: java.lang.NoSuchMethodException -> L42 java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            java.lang.Object r1 = r8.invoke(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L42 java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.NoSuchMethodException -> L42 java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            int r4 = r1.intValue()     // Catch: java.lang.NoSuchMethodException -> L42 java.lang.reflect.InvocationTargetException -> L44 java.lang.IllegalAccessException -> L46
            goto L78
        L42:
            r1 = move-exception
            goto L48
        L44:
            r1 = move-exception
            goto L58
        L46:
            r1 = move-exception
            goto L68
        L48:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            android.util.Log.e(r7, r4, r1)
            goto L77
        L58:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            android.util.Log.e(r7, r4, r1)
            goto L77
        L68:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            android.util.Log.e(r7, r4, r1)
        L77:
            r4 = r5
        L78:
            r1 = 2
            if (r4 != r1) goto L81
            int r0 = r0.c()
            r10.e = r0
        L81:
            java.lang.CharSequence r11 = defpackage.xg4.b(r11)
            r10.f = r11
            r10.g = r12
            r10.a = r2
            r10.c = r3
            r10.d = r3
            return
    }
}
