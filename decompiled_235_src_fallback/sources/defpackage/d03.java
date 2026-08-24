package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d03  reason: default package */
/* loaded from: classes.dex */
public final class d03 implements defpackage.ka2 {
    public final defpackage.ex6 a;
    public final defpackage.ex6 b;
    public final boolean c;

    public d03(defpackage.ex6 r1, defpackage.ex6 r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.ka2
    public final defpackage.la2 a(java.lang.Object r7, defpackage.fo4 r8, defpackage.pe5 r9) {
            r6 = this;
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.String r9 = r7.getScheme()
            java.lang.String r0 = "http"
            boolean r9 = defpackage.nb3.k(r9, r0)
            if (r9 != 0) goto L1d
            java.lang.String r9 = r7.getScheme()
            java.lang.String r0 = "https"
            boolean r9 = defpackage.nb3.k(r9, r0)
            if (r9 == 0) goto L1b
            goto L1d
        L1b:
            r6 = 0
            return r6
        L1d:
            g03 r0 = new g03
            java.lang.String r1 = r7.toString()
            ex6 r4 = r6.b
            boolean r5 = r6.c
            ex6 r3 = r6.a
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
