package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d76  reason: default package */
/* loaded from: classes.dex */
public final class d76 {
    public java.nio.ByteBuffer a;

    public final android.graphics.Bitmap a() {
            r7 = this;
            java.nio.ByteBuffer r0 = r7.a
            if (r0 == 0) goto L5
            goto L18
        L5:
            r0 = 393216(0x60000, float:5.51013E-40)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            r7.a = r0
            r0.getClass()
        L18:
            r7 = 98304(0x18000, float:1.37753E-40)
            int[] r1 = new int[r7]
            r2 = 0
        L1e:
            if (r2 >= r7) goto L3e
            int r3 = r2 * 4
            int r3 = r0.getInt(r3)
            r4 = r3 & 255(0xff, float:3.57E-43)
            int r5 = r3 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r3 = r3 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r3 = r3 << 16
            r3 = r3 | r6
            int r5 = r5 << 8
            r3 = r3 | r5
            r3 = r3 | r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L1e
        L3e:
            r7 = 384(0x180, float:5.38E-43)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r2 = 256(0x100, float:3.59E-43)
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r2, r7, r0)
            r7.getClass()
            return r7
    }
}
