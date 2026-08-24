package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t40  reason: default package */
/* loaded from: classes.dex */
public final class t40 implements defpackage.la2 {
    public final /* synthetic */ int a;
    public final defpackage.fo4 b;
    public final java.lang.Object c;

    public /* synthetic */ t40(java.lang.Object r1, defpackage.fo4 r2, int r3) {
            r0 = this;
            r0.a = r3
            r0.c = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // defpackage.la2
    public final java.lang.Object a(defpackage.r41 r7) {
            r6 = this;
            int r7 = r6.a
            r0 = 0
            java.lang.Object r1 = r6.c
            fo4 r6 = r6.b
            switch(r7) {
                case 0: goto L5b;
                case 1: goto L39;
                default: goto La;
            }
        La:
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            android.graphics.Bitmap$Config[] r7 = defpackage.k.a
            boolean r7 = r1 instanceof android.graphics.drawable.VectorDrawable
            if (r7 != 0) goto L16
            boolean r7 = r1 instanceof defpackage.bl7
            if (r7 == 0) goto L17
        L16:
            r0 = 1
        L17:
            wo1 r7 = new wo1
            if (r0 == 0) goto L33
            android.graphics.Bitmap$Config r2 = r6.b
            wi6 r3 = r6.d
            y56 r4 = r6.e
            boolean r5 = r6.f
            android.graphics.Bitmap r1 = defpackage.g04.A(r1, r2, r3, r4, r5)
            android.content.Context r6 = r6.a
            android.content.res.Resources r6 = r6.getResources()
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r6, r1)
            r1 = r2
        L33:
            zb1 r6 = defpackage.zb1.MEMORY
            r7.<init>(r1, r0, r6)
            return r7
        L39:
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            k80 r7 = new k80     // Catch: java.lang.Throwable -> L56
            r7.<init>()     // Catch: java.lang.Throwable -> L56
            r7.write(r1)     // Catch: java.lang.Throwable -> L56
            r1.position(r0)
            mn6 r0 = new mn6
            android.content.Context r6 = r6.a
            jn6 r6 = new jn6
            r1 = 0
            r6.<init>(r7, r1)
            zb1 r7 = defpackage.zb1.MEMORY
            r0.<init>(r6, r1, r7)
            return r0
        L56:
            r6 = move-exception
            r1.position(r0)
            throw r6
        L5b:
            wo1 r7 = new wo1
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            android.content.Context r6 = r6.a
            android.content.res.Resources r6 = r6.getResources()
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            r2.<init>(r6, r1)
            zb1 r6 = defpackage.zb1.MEMORY
            r7.<init>(r2, r0, r6)
            return r7
    }
}
