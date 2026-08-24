package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nr1  reason: default package */
/* loaded from: classes.dex */
public final class nr1 extends android.util.LruCache {
    public final /* synthetic */ int a;

    public /* synthetic */ nr1(int r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.<init>(r1)
            return
    }

    @Override // android.util.LruCache
    public final int sizeOf(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L18;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r1.getClass()
            r2.getClass()
            int r0 = r2.getByteCount()
            r1 = 1
            if (r0 >= r1) goto L17
            r0 = r1
        L17:
            return r0
        L18:
            java.lang.String r1 = (java.lang.String) r1
            xz3 r2 = (defpackage.xz3) r2
            int r0 = r2.b
            return r0
        L1f:
            java.lang.String r1 = (java.lang.String) r1
            byte[] r2 = (byte[]) r2
            r1.getClass()
            r2.getClass()
            int r0 = r2.length
            return r0
    }
}
