package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ua2  reason: default package */
/* loaded from: classes.dex */
public final class ua2 implements defpackage.la2 {
    public final java.io.File a;

    public ua2(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.la2
    public final java.lang.Object a(defpackage.r41 r5) {
            r4 = this;
            mn6 r5 = new mn6
            java.lang.String r0 = defpackage.lt4.B
            java.io.File r4 = r4.a
            lt4 r0 = defpackage.w31.q(r4)
            xf3 r1 = defpackage.db2.A
            xa2 r2 = new xa2
            r3 = 0
            r2.<init>(r0, r1, r3, r3)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r4 = defpackage.jc2.y0(r4)
            java.lang.String r4 = r0.getMimeTypeFromExtension(r4)
            zb1 r0 = defpackage.zb1.DISK
            r5.<init>(r2, r4, r0)
            return r5
    }
}
