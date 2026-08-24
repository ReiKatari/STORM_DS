package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g23  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g23 implements android.graphics.ImageDecoder.OnHeaderDecodedListener {
    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(android.graphics.ImageDecoder r6, android.graphics.ImageDecoder.ImageInfo r7, android.graphics.ImageDecoder.Source r8) {
            r5 = this;
            r6.getClass()
            r7.getClass()
            r8.getClass()
            android.util.Size r5 = defpackage.yr1.k(r7)
            int r5 = r5.getWidth()
            float r5 = (float) r5
            android.util.Size r8 = defpackage.yr1.k(r7)
            int r8 = r8.getHeight()
            float r8 = (float) r8
            float r5 = r5 / r8
            r8 = 1068149419(0x3faaaaab, float:1.3333334)
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r8 = 0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r5 <= 0) goto L74
            android.util.Size r5 = defpackage.yr1.k(r7)
            int r5 = r5.getHeight()
            float r5 = (float) r5
            r1 = 1139802112(0x43f00000, float:480.0)
            float r1 = r1 / r5
            android.graphics.Rect r5 = new android.graphics.Rect
            android.util.Size r2 = defpackage.yr1.k(r7)
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r2 = r2 * r1
            float r2 = r2 / r0
            r3 = 1134559232(0x43a00000, float:320.0)
            float r2 = r2 - r3
            int r2 = defpackage.u24.E(r2)
            android.util.Size r4 = defpackage.yr1.k(r7)
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r4 = r4 * r1
            float r4 = r4 / r0
            float r4 = r4 + r3
            int r0 = defpackage.u24.E(r4)
            r3 = 480(0x1e0, float:6.73E-43)
            r5.<init>(r2, r8, r0, r3)
            android.graphics.Point r8 = new android.graphics.Point
            android.util.Size r7 = defpackage.yr1.k(r7)
            int r7 = r7.getWidth()
            float r7 = (float) r7
            float r7 = r7 * r1
            int r7 = defpackage.u24.E(r7)
            r8.<init>(r7, r3)
            vr4 r7 = new vr4
            r7.<init>(r5, r8)
            goto Lc1
        L74:
            android.util.Size r5 = defpackage.yr1.k(r7)
            int r5 = r5.getWidth()
            float r5 = (float) r5
            r1 = 1142947840(0x44200000, float:640.0)
            float r5 = r5 / r1
            android.graphics.Rect r1 = new android.graphics.Rect
            android.util.Size r2 = defpackage.yr1.k(r7)
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r5
            float r2 = r2 / r0
            r3 = 1131413504(0x43700000, float:240.0)
            float r2 = r2 - r3
            int r2 = defpackage.u24.E(r2)
            android.util.Size r4 = defpackage.yr1.k(r7)
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r5
            float r4 = r4 / r0
            float r4 = r4 + r3
            int r0 = defpackage.u24.E(r4)
            r3 = 640(0x280, float:8.97E-43)
            r1.<init>(r8, r2, r3, r0)
            android.graphics.Point r8 = new android.graphics.Point
            android.util.Size r7 = defpackage.yr1.k(r7)
            int r7 = r7.getHeight()
            float r7 = (float) r7
            float r7 = r7 * r5
            int r5 = defpackage.u24.E(r7)
            r8.<init>(r3, r5)
            vr4 r7 = new vr4
            r7.<init>(r1, r8)
        Lc1:
            java.lang.Object r5 = r7.A
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.lang.Object r7 = r7.B
            android.graphics.Point r7 = (android.graphics.Point) r7
            defpackage.yr1.v(r6, r5)
            int r5 = r7.x
            int r7 = r7.y
            defpackage.yr1.u(r6, r5, r7)
            return
    }
}
