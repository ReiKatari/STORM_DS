package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cl0  reason: default package */
/* loaded from: classes.dex */
public final class cl0 extends defpackage.dg5 {
    public final android.graphics.Paint a;
    public final java.util.List b;

    public cl0() {
            r2 = this;
            r2.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2.a = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r2.b = r1
            r2 = 1084227584(0x40a00000, float:5.0)
            r0.setStrokeWidth(r2)
            r2 = -65281(0xffffffffffff00ff, float:NaN)
            r0.setColor(r2)
            return
    }

    @Override // defpackage.dg5
    public final void c(android.graphics.Canvas r10, androidx.recyclerview.widget.RecyclerView r11) {
            r9 = this;
            android.content.res.Resources r0 = r11.getResources()
            r1 = 2131165427(0x7f0700f3, float:1.794507E38)
            float r0 = r0.getDimension(r1)
            android.graphics.Paint r6 = r9.a
            r6.setStrokeWidth(r0)
            java.util.List r9 = r9.b
            java.util.Iterator r9 = r9.iterator()
        L16:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lef
            java.lang.Object r0 = r9.next()
            di3 r0 = (defpackage.di3) r0
            r0.getClass()
            java.lang.ThreadLocal r0 = defpackage.tt0.a
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            float r0 = r0 - r1
            r2 = -65281(0xffffffffffff00ff, float:NaN)
            int r3 = android.graphics.Color.alpha(r2)
            float r3 = (float) r3
            float r3 = r3 * r0
            r4 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            int r5 = android.graphics.Color.alpha(r4)
            float r5 = (float) r5
            float r5 = r5 * r1
            float r5 = r5 + r3
            int r3 = android.graphics.Color.red(r2)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r7 = android.graphics.Color.red(r4)
            float r7 = (float) r7
            float r7 = r7 * r1
            float r7 = r7 + r3
            int r3 = android.graphics.Color.green(r2)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r8 = android.graphics.Color.green(r4)
            float r8 = (float) r8
            float r8 = r8 * r1
            float r8 = r8 + r3
            int r2 = android.graphics.Color.blue(r2)
            float r2 = (float) r2
            float r2 = r2 * r0
            int r0 = android.graphics.Color.blue(r4)
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r2
            int r1 = (int) r5
            int r2 = (int) r7
            int r3 = (int) r8
            int r0 = (int) r0
            int r0 = android.graphics.Color.argb(r1, r2, r3, r0)
            r6.setColor(r0)
            gg5 r0 = r11.getLayoutManager()
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            boolean r0 = r0.E0()
            r1 = 0
            if (r0 == 0) goto Lb4
            gg5 r0 = r11.getLayoutManager()
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            dl0 r0 = r0.q
            int r2 = r0.b
            switch(r2) {
                case 0: goto L90;
                default: goto L8a;
            }
        L8a:
            com.google.android.material.carousel.CarouselLayoutManager r0 = r0.c
            int r1 = r0.F()
        L90:
            float r3 = (float) r1
            gg5 r0 = r11.getLayoutManager()
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            dl0 r0 = r0.q
            int r1 = r0.b
            switch(r1) {
                case 0: goto La8;
                default: goto L9e;
            }
        L9e:
            com.google.android.material.carousel.CarouselLayoutManager r0 = r0.c
            int r1 = r0.o
            int r0 = r0.C()
            int r1 = r1 - r0
            goto Lac
        La8:
            com.google.android.material.carousel.CarouselLayoutManager r0 = r0.c
            int r1 = r0.o
        Lac:
            float r5 = (float) r1
            r2 = 0
            r4 = 0
            r1 = r10
            r1.drawLine(r2, r3, r4, r5, r6)
            goto Lec
        Lb4:
            gg5 r0 = r11.getLayoutManager()
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            dl0 r0 = r0.q
            int r2 = r0.b
            switch(r2) {
                case 0: goto Lc2;
                default: goto Lc1;
            }
        Lc1:
            goto Lc8
        Lc2:
            com.google.android.material.carousel.CarouselLayoutManager r0 = r0.c
            int r1 = r0.D()
        Lc8:
            float r2 = (float) r1
            gg5 r0 = r11.getLayoutManager()
            com.google.android.material.carousel.CarouselLayoutManager r0 = (com.google.android.material.carousel.CarouselLayoutManager) r0
            dl0 r0 = r0.q
            int r1 = r0.b
            switch(r1) {
                case 0: goto Ldb;
                default: goto Ld6;
            }
        Ld6:
            com.google.android.material.carousel.CarouselLayoutManager r0 = r0.c
            int r0 = r0.n
            goto Le5
        Ldb:
            com.google.android.material.carousel.CarouselLayoutManager r0 = r0.c
            int r1 = r0.n
            int r0 = r0.E()
            int r0 = r1 - r0
        Le5:
            float r4 = (float) r0
            r5 = 0
            r3 = 0
            r1 = r10
            r1.drawLine(r2, r3, r4, r5, r6)
        Lec:
            r10 = r1
            goto L16
        Lef:
            return
    }
}
