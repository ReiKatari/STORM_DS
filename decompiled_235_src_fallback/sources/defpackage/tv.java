package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tv  reason: default package */
/* loaded from: classes.dex */
public final class tv implements defpackage.la2 {
    public final /* synthetic */ int a;
    public final android.net.Uri b;
    public final defpackage.fo4 c;

    public /* synthetic */ tv(android.net.Uri r1, defpackage.fo4 r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    @Override // defpackage.la2
    public final java.lang.Object a(defpackage.r41 r11) {
            r10 = this;
            int r11 = r10.a
            r0 = 2
            android.net.Uri r1 = r10.b
            fo4 r10 = r10.c
            r2 = 1
            r3 = 0
            switch(r11) {
                case 0: goto L208;
                case 1: goto L126;
                default: goto Lc;
            }
        Lc:
            java.lang.String r11 = r1.getAuthority()
            java.lang.String r4 = "Invalid android.resource URI: "
            if (r11 == 0) goto L11e
            boolean r5 = defpackage.qs6.v0(r11)
            if (r5 != 0) goto L1b
            goto L1c
        L1b:
            r11 = r3
        L1c:
            if (r11 == 0) goto L11e
            java.util.List r5 = r1.getPathSegments()
            java.lang.Object r5 = defpackage.gt0.R0(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L116
            java.lang.Integer r5 = defpackage.xs6.h0(r5)
            if (r5 == 0) goto L116
            int r1 = r5.intValue()
            android.content.Context r4 = r10.a
            java.lang.String r5 = r4.getPackageName()
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L45
            android.content.res.Resources r5 = r4.getResources()
            goto L4d
        L45:
            android.content.pm.PackageManager r5 = r4.getPackageManager()
            android.content.res.Resources r5 = r5.getResourcesForApplication(r11)
        L4d:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            r5.getValue(r1, r6, r2)
            java.lang.CharSequence r6 = r6.string
            r7 = 47
            r8 = 6
            r9 = 0
            int r7 = defpackage.qs6.x0(r7, r9, r8, r6)
            int r8 = r6.length()
            java.lang.CharSequence r6 = r6.subSequence(r7, r8)
            java.lang.String r6 = r6.toString()
            android.webkit.MimeTypeMap r7 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r6 = defpackage.k.b(r7, r6)
            java.lang.String r7 = "text/xml"
            boolean r7 = defpackage.nb3.k(r6, r7)
            if (r7 == 0) goto Lf0
            java.lang.String r6 = r4.getPackageName()
            boolean r11 = r11.equals(r6)
            java.lang.String r6 = "Invalid resource ID: "
            if (r11 == 0) goto L97
            android.graphics.drawable.Drawable r11 = defpackage.hf.S(r4, r1)
            if (r11 == 0) goto L8e
            goto Lb6
        L8e:
            java.lang.String r10 = defpackage.lb1.g(r1, r6)
            defpackage.u34.f(r10)
            goto L125
        L97:
            android.content.res.XmlResourceParser r11 = r5.getXml(r1)
            int r7 = r11.next()
        L9f:
            if (r7 == r0) goto La8
            if (r7 == r2) goto La8
            int r7 = r11.next()
            goto L9f
        La8:
            if (r7 != r0) goto Le8
            android.content.res.Resources$Theme r11 = r4.getTheme()
            java.lang.ThreadLocal r0 = defpackage.sl5.a
            android.graphics.drawable.Drawable r11 = r5.getDrawable(r1, r11)
            if (r11 == 0) goto Le0
        Lb6:
            boolean r0 = r11 instanceof android.graphics.drawable.VectorDrawable
            if (r0 != 0) goto Lc0
            boolean r0 = r11 instanceof defpackage.bl7
            if (r0 == 0) goto Lbf
            goto Lc0
        Lbf:
            r2 = r9
        Lc0:
            wo1 r3 = new wo1
            if (r2 == 0) goto Lda
            android.graphics.Bitmap$Config r0 = r10.b
            wi6 r1 = r10.d
            y56 r5 = r10.e
            boolean r10 = r10.f
            android.graphics.Bitmap r10 = defpackage.g04.A(r11, r0, r1, r5, r10)
            android.content.res.Resources r11 = r4.getResources()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r11, r10)
            r11 = r0
        Lda:
            zb1 r10 = defpackage.zb1.DISK
            r3.<init>(r11, r2, r10)
            goto L125
        Le0:
            java.lang.String r10 = defpackage.lb1.g(r1, r6)
            defpackage.u34.f(r10)
            goto L125
        Le8:
            org.xmlpull.v1.XmlPullParserException r10 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r11 = "No start tag found."
            r10.<init>(r11)
            throw r10
        Lf0:
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            java.io.InputStream r11 = r5.openRawResource(r1, r10)
            mn6 r3 = new mn6
            a83 r11 = defpackage.hi2.P(r11)
            fe5 r0 = new fe5
            r0.<init>(r11)
            pl5 r11 = new pl5
            int r10 = r10.density
            r11.<init>(r10)
            jn6 r10 = new jn6
            r10.<init>(r0, r11)
            zb1 r11 = defpackage.zb1.DISK
            r3.<init>(r10, r6, r11)
            goto L125
        L116:
            java.lang.String r10 = defpackage.xg6.n(r1, r4)
            defpackage.i.m(r10)
            goto L125
        L11e:
            java.lang.String r10 = defpackage.xg6.n(r1, r4)
            defpackage.i.m(r10)
        L125:
            return r3
        L126:
            android.content.Context r11 = r10.a
            android.content.ContentResolver r11 = r11.getContentResolver()
            java.lang.String r4 = r1.getAuthority()
            java.lang.String r5 = "com.android.contacts"
            boolean r4 = defpackage.nb3.k(r4, r5)
            java.lang.String r5 = "'."
            if (r4 == 0) goto L15f
            java.lang.String r4 = r1.getLastPathSegment()
            java.lang.String r6 = "display_photo"
            boolean r4 = defpackage.nb3.k(r4, r6)
            if (r4 == 0) goto L15f
            java.lang.String r10 = "r"
            android.content.res.AssetFileDescriptor r10 = r11.openAssetFileDescriptor(r1, r10)
            if (r10 == 0) goto L153
            java.io.FileInputStream r10 = r10.createInputStream()
            goto L154
        L153:
            r10 = r3
        L154:
            if (r10 == 0) goto L158
            goto L1e3
        L158:
            java.lang.String r10 = "Unable to find a contact photo associated with '"
            defpackage.e41.g(r1, r5, r10)
            goto L207
        L15f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r4 < r6) goto L1dd
            java.lang.String r4 = r1.getAuthority()
            java.lang.String r6 = "media"
            boolean r4 = defpackage.nb3.k(r4, r6)
            if (r4 != 0) goto L173
            goto L1dd
        L173:
            java.util.List r4 = r1.getPathSegments()
            int r6 = r4.size()
            r7 = 3
            if (r6 < r7) goto L1dd
            int r7 = r6 + (-3)
            java.lang.Object r7 = r4.get(r7)
            java.lang.String r8 = "audio"
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 == 0) goto L1dd
            int r6 = r6 - r0
            java.lang.Object r0 = r4.get(r6)
            java.lang.String r4 = "albums"
            boolean r0 = defpackage.nb3.k(r0, r4)
            if (r0 == 0) goto L1dd
            wi6 r10 = r10.d
            ge7 r0 = r10.a
            boolean r4 = r0 instanceof defpackage.pj1
            if (r4 == 0) goto L1a4
            pj1 r0 = (defpackage.pj1) r0
            goto L1a5
        L1a4:
            r0 = r3
        L1a5:
            if (r0 == 0) goto L1c7
            int r0 = r0.m
            ge7 r10 = r10.b
            boolean r4 = r10 instanceof defpackage.pj1
            if (r4 == 0) goto L1b2
            pj1 r10 = (defpackage.pj1) r10
            goto L1b3
        L1b2:
            r10 = r3
        L1b3:
            if (r10 == 0) goto L1c7
            int r10 = r10.m
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r2)
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r0, r10)
            java.lang.String r10 = "android.content.extra.SIZE"
            r4.putParcelable(r10, r2)
            goto L1c8
        L1c7:
            r4 = r3
        L1c8:
            android.content.res.AssetFileDescriptor r10 = defpackage.yz0.c(r11, r1, r4)
            if (r10 == 0) goto L1d3
            java.io.FileInputStream r10 = r10.createInputStream()
            goto L1d4
        L1d3:
            r10 = r3
        L1d4:
            if (r10 == 0) goto L1d7
            goto L1e3
        L1d7:
            java.lang.String r10 = "Unable to find a music thumbnail associated with '"
            defpackage.e41.g(r1, r5, r10)
            goto L207
        L1dd:
            java.io.InputStream r10 = r11.openInputStream(r1)
            if (r10 == 0) goto L202
        L1e3:
            mn6 r3 = new mn6
            a83 r10 = defpackage.hi2.P(r10)
            fe5 r0 = new fe5
            r0.<init>(r10)
            qv r10 = new qv
            r10.<init>()
            jn6 r2 = new jn6
            r2.<init>(r0, r10)
            java.lang.String r10 = r11.getType(r1)
            zb1 r11 = defpackage.zb1.DISK
            r3.<init>(r2, r10, r11)
            goto L207
        L202:
            java.lang.String r10 = "Unable to open '"
            defpackage.e41.g(r1, r5, r10)
        L207:
            return r3
        L208:
            java.util.List r11 = r1.getPathSegments()
            java.util.List r3 = defpackage.gt0.D0(r11, r2)
            r7 = 0
            r8 = 62
            java.lang.String r4 = "/"
            r5 = 0
            r6 = 0
            java.lang.String r11 = defpackage.gt0.P0(r3, r4, r5, r6, r7, r8)
            mn6 r0 = new mn6
            android.content.Context r10 = r10.a
            android.content.res.AssetManager r10 = r10.getAssets()
            java.io.InputStream r10 = r10.open(r11)
            a83 r10 = defpackage.hi2.P(r10)
            fe5 r1 = new fe5
            r1.<init>(r10)
            qv r10 = new qv
            r10.<init>()
            jn6 r2 = new jn6
            r2.<init>(r1, r10)
            android.webkit.MimeTypeMap r10 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r10 = defpackage.k.b(r10, r11)
            zb1 r11 = defpackage.zb1.DISK
            r0.<init>(r2, r10, r11)
            return r0
    }
}
