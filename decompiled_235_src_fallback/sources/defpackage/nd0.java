package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nd0  reason: default package */
/* loaded from: classes.dex */
public final class nd0 {
    public static final java.util.Map c = null;
    public static final java.util.Map d = null;
    public final defpackage.ld0 a;
    public final defpackage.ks6 b;

    static {
            java.lang.String r4 = "cheetah"
            java.lang.String r5 = "lynx"
            java.lang.String r0 = "oriole"
            java.lang.String r1 = "raven"
            java.lang.String r2 = "bluejay"
            java.lang.String r3 = "panther"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            java.util.Set r0 = defpackage.fv.V0(r0)
            java.lang.String r1 = "Google"
            java.util.Map r0 = java.util.Collections.singletonMap(r1, r0)
            r0.getClass()
            defpackage.nd0.c = r0
            java.lang.String r0 = "pixel 4"
            java.lang.String r1 = "pixel 4 xl"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = defpackage.fv.V0(r0)
            vr4 r1 = new vr4
            java.lang.String r2 = "google"
            r1.<init>(r2, r0)
            java.lang.String r0 = "sm-g770f"
            java.util.Set r0 = defpackage.ii2.R(r0)
            vr4 r2 = new vr4
            java.lang.String r3 = "samsung"
            r2.<init>(r3, r0)
            vr4[] r0 = new defpackage.vr4[]{r1, r2}
            java.util.Map r0 = defpackage.c14.m0(r0)
            defpackage.nd0.d = r0
            return
    }

    public nd0(defpackage.ld0 r1, defpackage.ks6 r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean a(java.lang.String r5) {
            r4 = this;
            r5.getClass()
            ks6 r0 = r4.b
            r0.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            r2 = 1
            r3 = 0
            if (r0 > r1) goto L23
            kg0 r0 = defpackage.lg0.g
            ld0 r4 = r4.a
            lg0 r4 = r4.d(r5)
            r0.getClass()
            boolean r4 = defpackage.kg0.c(r4)
            if (r4 == 0) goto L23
            r4 = r2
            goto L24
        L23:
            r4 = r3
        L24:
            java.lang.String r0 = "motorola"
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L42
            java.lang.String r0 = "moto e20"
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L42
            java.lang.String r0 = "1"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r2
            goto L43
        L42:
            r5 = r3
        L43:
            if (r4 != 0) goto L49
            if (r5 == 0) goto L48
            goto L49
        L48:
            return r3
        L49:
            return r2
    }
}
