package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yj1  reason: default package */
/* loaded from: classes.dex */
public final class yj1 {
    public static final java.util.List b = null;
    public final android.content.Context a;

    static {
            java.lang.String r0 = "rar"
            java.lang.String r1 = "tar"
            java.lang.String r2 = "zip"
            java.lang.String r3 = "7z"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.yj1.b = r0
            return
    }

    public yj1(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final defpackage.xj1 a(android.net.Uri r3, defpackage.sv4 r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            android.content.Context r2 = r2.a
            qi6 r2 = defpackage.zl1.h(r2, r3)
            boolean r0 = r2.e()
            if (r0 != 0) goto L1b
            boolean r0 = r2.a()
            if (r0 != 0) goto L1b
            xj1 r2 = defpackage.xj1.NOT_FOUND
            return r2
        L1b:
            java.lang.String r0 = r2.i()
            java.lang.String r1 = ""
            if (r0 != 0) goto L2a
            java.lang.String r0 = r3.getLastPathSegment()
            if (r0 != 0) goto L2a
            r0 = r1
        L2a:
            sv4 r3 = defpackage.sv4.READ
            if (r4 != r3) goto L31
            xj1 r2 = defpackage.xj1.OK
            return r2
        L31:
            boolean r2 = r2.l()
            if (r2 == 0) goto L3a
            xj1 r2 = defpackage.xj1.READ_ONLY
            return r2
        L3a:
            r2 = 46
            java.lang.String r2 = defpackage.qs6.O0(r2, r0, r1)
            int r3 = r2.length()
            if (r3 != 0) goto L49
            xj1 r2 = defpackage.xj1.OK
            return r2
        L49:
            java.util.List r3 = defpackage.yj1.b
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L54
            xj1 r2 = defpackage.xj1.READ_ONLY
            return r2
        L54:
            xj1 r2 = defpackage.xj1.OK
            return r2
    }
}
