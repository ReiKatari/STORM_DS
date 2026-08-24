package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h17  reason: default package */
/* loaded from: classes.dex */
public final class h17 {
    public final android.text.TextPaint a;
    public final defpackage.kq0 b;
    public float c;
    public boolean d;
    public final java.lang.ref.WeakReference e;
    public defpackage.g07 f;

    public h17(defpackage.nq0 r3) {
            r2 = this;
            r2.<init>()
            android.text.TextPaint r0 = new android.text.TextPaint
            r1 = 1
            r0.<init>(r1)
            r2.a = r0
            kq0 r0 = new kq0
            r0.<init>(r2, r1)
            r2.b = r0
            r2.d = r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r2.e = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.e = r0
            return
    }

    public final float a(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.d
            if (r0 != 0) goto L7
            float r3 = r3.c
            return r3
        L7:
            r0 = 0
            android.text.TextPaint r1 = r3.a
            if (r4 != 0) goto Le
            r2 = 0
            goto L16
        Le:
            int r2 = r4.length()
            float r2 = r1.measureText(r4, r0, r2)
        L16:
            r3.c = r2
            if (r4 != 0) goto L1b
            goto L24
        L1b:
            android.graphics.Paint$FontMetrics r4 = r1.getFontMetrics()
            float r4 = r4.ascent
            java.lang.Math.abs(r4)
        L24:
            r3.d = r0
            float r3 = r3.c
            return r3
    }
}
