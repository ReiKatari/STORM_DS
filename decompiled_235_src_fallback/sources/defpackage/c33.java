package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c33  reason: default package */
/* loaded from: classes.dex */
public final class c33 {
    public final java.lang.String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final java.util.List i;
    public final java.util.ArrayList j;

    public c33(java.lang.String r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, java.util.List r12, int r13) {
            r3 = this;
            r0 = r13 & 1
            if (r0 == 0) goto L6
            java.lang.String r4 = ""
        L6:
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto Lc
            r5 = r1
        Lc:
            r0 = r13 & 4
            if (r0 == 0) goto L11
            r6 = r1
        L11:
            r0 = r13 & 8
            if (r0 == 0) goto L16
            r7 = r1
        L16:
            r0 = r13 & 16
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L1d
            r8 = r2
        L1d:
            r0 = r13 & 32
            if (r0 == 0) goto L22
            r9 = r2
        L22:
            r0 = r13 & 64
            if (r0 == 0) goto L27
            r10 = r1
        L27:
            r0 = r13 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L2c
            r11 = r1
        L2c:
            r13 = r13 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L34
            int r12 = defpackage.el7.a
            yt1 r12 = defpackage.yt1.A
        L34:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r3.<init>()
            r3.a = r4
            r3.b = r5
            r3.c = r6
            r3.d = r7
            r3.e = r8
            r3.f = r9
            r3.g = r10
            r3.h = r11
            r3.i = r12
            r3.j = r13
            return
    }
}
