package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zj1  reason: default package */
/* loaded from: classes.dex */
public final class zj1 extends defpackage.b9 {
    public final /* synthetic */ int a;
    public final defpackage.sv4 b;

    public zj1(defpackage.sv4 r1, int r2) {
            r0 = this;
            r0.a = r2
            r1.getClass()
            switch(r2) {
                case 1: goto Le;
                default: goto L8;
            }
        L8:
            r0.<init>()
            r0.b = r1
            return
        Le:
            r0.<init>()
            r0.b = r1
            return
    }

    @Override // defpackage.b9
    public final android.content.Intent a(android.content.Context r6, java.lang.Object r7) {
            r5 = this;
            int r6 = r5.a
            java.lang.String r0 = "android.provider.extra.INITIAL_URI"
            r1 = 26
            sv4 r5 = r5.b
            switch(r6) {
                case 0: goto L4e;
                default: goto Lb;
            }
        Lb:
            vr4 r7 = (defpackage.vr4) r7
            r7.getClass()
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.OPEN_DOCUMENT"
            r6.<init>(r2)
            java.lang.Object r2 = r7.B
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.lang.String r3 = "*/*"
            if (r2 != 0) goto L25
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r4 = 0
            r2[r4] = r3
        L25:
            java.lang.String r4 = "android.intent.extra.MIME_TYPES"
            android.content.Intent r6 = r6.putExtra(r4, r2)
            android.content.Intent r6 = r6.setType(r3)
            java.lang.String r2 = "android.intent.category.OPENABLE"
            android.content.Intent r6 = r6.addCategory(r2)
            int r5 = r5.toFlags()
            android.content.Intent r5 = r6.addFlags(r5)
            r5.getClass()
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r1) goto L4d
            java.lang.Object r6 = r7.A
            if (r6 == 0) goto L4d
            android.os.Parcelable r6 = (android.os.Parcelable) r6
            r5.putExtra(r0, r6)
        L4d:
            return r5
        L4e:
            android.net.Uri r7 = (android.net.Uri) r7
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.OPEN_DOCUMENT_TREE"
            r6.<init>(r2)
            int r5 = r5.toFlags()
            r5 = r5 | 192(0xc0, float:2.69E-43)
            r6.addFlags(r5)
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r1) goto L69
            if (r7 == 0) goto L69
            r6.putExtra(r0, r7)
        L69:
            return r6
    }

    @Override // defpackage.b9
    public final java.lang.Object c(android.content.Intent r3, int r4) {
            r2 = this;
            int r2 = r2.a
            r0 = 0
            r1 = -1
            switch(r2) {
                case 0: goto L11;
                default: goto L7;
            }
        L7:
            if (r3 == 0) goto L10
            if (r4 == r1) goto Lc
            goto L10
        Lc:
            android.net.Uri r0 = r3.getData()
        L10:
            return r0
        L11:
            if (r3 == 0) goto L1a
            if (r4 == r1) goto L16
            goto L1a
        L16:
            android.net.Uri r0 = r3.getData()
        L1a:
            return r0
    }
}
