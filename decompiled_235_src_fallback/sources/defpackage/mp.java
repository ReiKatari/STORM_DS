package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mp  reason: default package */
/* loaded from: classes.dex */
public final class mp {
    public final android.content.Context a;
    public final java.util.Map b;

    public mp(android.content.Context r8, defpackage.uh7 r9, defpackage.ud4 r10) {
            r7 = this;
            r7.<init>()
            r7.a = r8
            vd4 r0 = new vd4
            r0.<init>(r8, r9)
            vr4 r1 = new vr4
            java.lang.String r2 = "nds"
            r1.<init>(r2, r0)
            vr4 r2 = new vr4
            java.lang.String r3 = "dsi"
            r2.<init>(r3, r0)
            vr4 r3 = new vr4
            java.lang.String r4 = "ids"
            r3.<init>(r4, r0)
            ny7 r0 = new ny7
            r0.<init>(r8, r9, r10)
            vr4 r4 = new vr4
            java.lang.String r5 = "zip"
            r4.<init>(r5, r0)
            vd6 r0 = new vd6
            r0.<init>(r8, r9, r10)
            vr4 r5 = new vr4
            java.lang.String r6 = "7z"
            r5.<init>(r6, r0)
            rd5 r0 = new rd5
            r0.<init>(r8, r9, r10)
            vr4 r6 = new vr4
            java.lang.String r8 = "rar"
            r6.<init>(r8, r0)
            vr4[] r8 = new defpackage.vr4[]{r1, r2, r3, r4, r5, r6}
            java.util.Map r8 = defpackage.c14.m0(r8)
            r7.b = r8
            return
    }

    public final defpackage.pw5 a(defpackage.zl1 r2) {
            r1 = this;
            java.lang.String r0 = r2.i()
            if (r0 != 0) goto L12
            android.net.Uri r2 = r2.j()
            java.lang.String r0 = r2.getLastPathSegment()
            if (r0 != 0) goto L12
            r1 = 0
            return r1
        L12:
            pw5 r1 = r1.c(r0)
            return r1
    }

    public final defpackage.pw5 b(android.net.Uri r2) {
            r1 = this;
            r2.getClass()
            android.content.Context r0 = r1.a
            qi6 r0 = defpackage.zl1.g(r0, r2)
            java.lang.String r0 = r0.i()
            if (r0 != 0) goto L17
            java.lang.String r0 = r2.getLastPathSegment()
            if (r0 != 0) goto L17
            r1 = 0
            return r1
        L17:
            pw5 r1 = r1.c(r0)
            return r1
    }

    public final defpackage.pw5 c(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            r0 = 0
            r1 = 6
            r2 = 46
            int r0 = defpackage.qs6.x0(r2, r0, r1, r4)
            if (r0 >= 0) goto Lf
            r3 = 0
            return r3
        Lf:
            int r0 = r0 + 1
            java.lang.String r4 = r4.substring(r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            java.util.Map r3 = r3.b
            java.lang.Object r3 = r3.get(r4)
            pw5 r3 = (defpackage.pw5) r3
            return r3
    }
}
