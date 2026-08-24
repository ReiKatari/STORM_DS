package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ov7  reason: default package */
/* loaded from: classes.dex */
public final class ov7 implements defpackage.nv7 {
    public final defpackage.rh1 b;

    public ov7() {
            r8 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L9
            sh1 r0 = defpackage.sh1.A
            goto Lb
        L9:
            xd5 r0 = defpackage.xd5.d0
        Lb:
            r8.<init>()
            r8.b = r0
            r8 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r8 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r8 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r8 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r8 = 16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r8 = 32
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r8 = 64
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r8 = 128(0x80, float:1.8E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            java.lang.Integer[] r8 = new java.lang.Integer[]{r0, r1, r2, r3, r4, r5, r6, r7}
            defpackage.hf.w(r8)
            return
    }
}
