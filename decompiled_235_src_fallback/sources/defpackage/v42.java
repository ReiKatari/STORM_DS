package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v42  reason: default package */
/* loaded from: classes.dex */
public final class v42 extends defpackage.hw6 implements defpackage.eo2 {
    public java.util.List X;
    public defpackage.fo4 Y;
    public int Z;
    public int d0;
    public int e0;
    public /* synthetic */ java.lang.Object f0;
    public final /* synthetic */ defpackage.w42 g0;
    public final /* synthetic */ defpackage.q42 h0;
    public final /* synthetic */ defpackage.fo4 i0;
    public final /* synthetic */ java.util.List j0;
    public final /* synthetic */ defpackage.k62 k0;
    public final /* synthetic */ defpackage.z23 l0;

    public v42(defpackage.w42 r1, defpackage.q42 r2, defpackage.fo4 r3, java.util.List r4, defpackage.k62 r5, defpackage.z23 r6, defpackage.r41 r7) {
            r0 = this;
            r0.g0 = r1
            r0.h0 = r2
            r0.i0 = r3
            r0.j0 = r4
            r0.k0 = r5
            r0.l0 = r6
            r1 = 2
            r0.<init>(r1, r7)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            v42 r0 = (defpackage.v42) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r9, java.lang.Object r10) {
            r8 = this;
            v42 r0 = new v42
            k62 r5 = r8.k0
            z23 r6 = r8.l0
            w42 r1 = r8.g0
            q42 r2 = r8.h0
            fo4 r3 = r8.i0
            java.util.List r4 = r8.j0
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.f0 = r10
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r10.e0
            r1 = 0
            k62 r2 = r10.k0
            q42 r3 = r10.h0
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L28
            int r0 = r10.d0
            int r5 = r10.Z
            fo4 r6 = r10.Y
            java.util.List r7 = r10.X
            java.lang.Object r8 = r10.f0
            w61 r8 = (defpackage.w61) r8
            defpackage.oi2.Y(r11)
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            l61 r9 = r8.A()
            defpackage.yh2.o(r9)
            int r5 = r5 + r4
            goto L6d
        L28:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r1
        L2e:
            defpackage.oi2.Y(r11)
            java.lang.Object r11 = r10.f0
            r8 = r11
            w61 r8 = (defpackage.w61) r8
            android.graphics.drawable.Drawable r11 = r3.a
            boolean r0 = r11 instanceof android.graphics.drawable.BitmapDrawable
            fo4 r6 = r10.i0
            if (r0 == 0) goto L57
            r0 = r11
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r5 = r0.getConfig()
            if (r5 != 0) goto L4d
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L4d:
            android.graphics.Bitmap$Config[] r7 = defpackage.k.a
            boolean r5 = defpackage.fv.o0(r7, r5)
            if (r5 == 0) goto L57
            r11 = r0
            goto L63
        L57:
            android.graphics.Bitmap$Config r0 = r6.b
            wi6 r5 = r6.d
            y56 r7 = r6.e
            boolean r9 = r6.f
            android.graphics.Bitmap r11 = defpackage.g04.A(r11, r0, r5, r7, r9)
        L63:
            r2.getClass()
            java.util.List r7 = r10.j0
            int r0 = r7.size()
            r5 = 0
        L6d:
            if (r5 < r0) goto L8b
            r2.getClass()
            z23 r10 = r10.l0
            android.content.Context r10 = r10.a
            android.content.res.Resources r10 = r10.getResources()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r10, r11)
            boolean r10 = r3.b
            zb1 r11 = r3.c
            java.lang.String r1 = r3.d
            q42 r2 = new q42
            r2.<init>(r0, r10, r11, r1)
            return r2
        L8b:
            java.lang.Object r11 = r7.get(r5)
            if (r11 == 0) goto L95
            defpackage.u34.a()
            return r1
        L95:
            wi6 r11 = r6.d
            r10.f0 = r8
            r10.X = r7
            r10.Y = r6
            r10.Z = r5
            r10.d0 = r0
            r10.e0 = r4
            throw r1
    }
}
