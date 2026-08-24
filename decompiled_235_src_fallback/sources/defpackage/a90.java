package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a90  reason: default package */
/* loaded from: classes.dex */
public abstract class a90 {
    public static final /* synthetic */ int a = 0;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L9
            defpackage.q2.e(r1)
        L9:
            if (r0 < r1) goto L10
            r2 = 31
            defpackage.q2.e(r2)
        L10:
            if (r0 < r1) goto L17
            r2 = 33
            defpackage.q2.e(r2)
        L17:
            if (r0 < r1) goto L1f
            r0 = 1000000(0xf4240, float:1.401298E-39)
            defpackage.q2.e(r0)
        L1f:
            return
    }

    public static final boolean a(java.lang.String r8) {
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.getClass()
            java.lang.String r3 = "REL"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L13
            goto L63
        L13:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r4 = r0.toUpperCase(r3)
            r4.getClass()
            java.lang.String r5 = "BAKLAVA"
            boolean r4 = r4.equals(r5)
            r6 = 0
            if (r4 == 0) goto L27
            r4 = r2
            goto L28
        L27:
            r4 = r6
        L28:
            java.lang.String r7 = r8.toUpperCase(r3)
            r7.getClass()
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L36
            goto L37
        L36:
            r2 = r6
        L37:
            if (r4 == 0) goto L46
            if (r2 == 0) goto L46
            int r8 = r4.intValue()
            int r0 = r2.intValue()
            if (r8 < r0) goto L63
            goto L61
        L46:
            if (r4 != 0) goto L5f
            if (r2 != 0) goto L5f
            java.lang.String r0 = r0.toUpperCase(r3)
            r0.getClass()
            java.lang.String r8 = r8.toUpperCase(r3)
            r8.getClass()
            int r8 = r0.compareTo(r8)
            if (r8 < 0) goto L63
            goto L61
        L5f:
            if (r4 == 0) goto L63
        L61:
            r8 = 1
            return r8
        L63:
            return r1
    }
}
