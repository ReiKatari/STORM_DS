package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uf1  reason: default package */
/* loaded from: classes.dex */
public final class uf1 implements defpackage.fo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ uf1(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r8 = this;
            int r0 = r8.A
            r1 = 48
            r2 = 16
            jg7 r3 = defpackage.jg7.a
            java.lang.Object r8 = r8.B
            r4 = 0
            r5 = 1
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L39;
                default: goto Lf;
            }
        Lf:
            kt0 r9 = (defpackage.kt0) r9
            long r6 = r9.a
            px0 r10 = (defpackage.px0) r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r9 = r11.intValue()
            r11 = r9 & 17
            if (r11 == r2) goto L20
            r4 = r5
        L20:
            r9 = r9 & r5
            xq2 r10 = (defpackage.xq2) r10
            boolean r9 = r10.S(r9, r4)
            if (r9 == 0) goto L35
            cs1 r9 = defpackage.cs1.m0
            android.app.RemoteAction r8 = (android.app.RemoteAction) r8
            android.graphics.drawable.Icon r8 = defpackage.q66.i(r8)
            r9.i(r8, r10, r1)
            goto L38
        L35:
            r10.V()
        L38:
            return r3
        L39:
            kt0 r9 = (defpackage.kt0) r9
            long r6 = r9.a
            px0 r10 = (defpackage.px0) r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r9 = r11.intValue()
            r11 = r9 & 17
            if (r11 == r2) goto L4a
            r4 = r5
        L4a:
            r9 = r9 & r5
            xq2 r10 = (defpackage.xq2) r10
            boolean r9 = r10.S(r9, r4)
            if (r9 == 0) goto L5b
            cs1 r9 = defpackage.cs1.m0
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            r9.a(r8, r10, r1)
            goto L5e
        L5b:
            r10.V()
        L5e:
            return r3
        L5f:
            kt0 r9 = (defpackage.kt0) r9
            long r0 = r9.a
            px0 r10 = (defpackage.px0) r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r9 = r11.intValue()
            r11 = r9 & 6
            if (r11 != 0) goto L7c
            r11 = r10
            xq2 r11 = (defpackage.xq2) r11
            boolean r11 = r11.e(r0)
            if (r11 == 0) goto L7a
            r11 = 4
            goto L7b
        L7a:
            r11 = 2
        L7b:
            r9 = r9 | r11
        L7c:
            r11 = r9 & 19
            r2 = 18
            if (r11 == r2) goto L83
            r4 = r5
        L83:
            r11 = r9 & 1
            xq2 r10 = (defpackage.xq2) r10
            boolean r11 = r10.S(r11, r4)
            if (r11 == 0) goto L99
            s07 r8 = (defpackage.s07) r8
            int r8 = r8.c
            int r9 = r9 << 3
            r9 = r9 & 112(0x70, float:1.57E-43)
            defpackage.vf1.b(r8, r0, r10, r9)
            goto L9c
        L99:
            r10.V()
        L9c:
            return r3
    }
}
