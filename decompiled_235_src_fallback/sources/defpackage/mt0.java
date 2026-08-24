package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mt0  reason: default package */
/* loaded from: classes.dex */
public final class mt0 {
    public final int a;
    public final defpackage.k45 b;
    public defpackage.e83 c;
    public defpackage.e83 d;
    public defpackage.l45 e;
    public final android.graphics.drawable.ColorDrawable f;
    public boolean g;
    public int h;

    static {
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r1, r2)
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r3 = 1058642330(0x3f19999a, float:0.6)
            r0.<init>(r3, r1, r2, r2)
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r0.<init>(r1, r1, r3, r2)
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r3 = 1053609165(0x3ecccccd, float:0.4)
            r0.<init>(r3, r1, r2, r2)
            return
    }

    public mt0(int r6, int r7) {
            r5 = this;
            r5.<init>()
            k45 r0 = new k45
            r0.<init>()
            r1 = -1
            r0.a = r1
            r0.b = r1
            e83 r1 = defpackage.e83.e
            r0.c = r1
            r2 = 0
            r0.d = r2
            r3 = 0
            r0.e = r3
            r4 = 0
            r0.f = r4
            r0.g = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.h = r4
            r5.b = r0
            r5.c = r1
            r5.d = r1
            r5.e = r3
            r1 = 1
            if (r6 == r1) goto L40
            r4 = 2
            if (r6 == r4) goto L40
            r4 = 4
            if (r6 == r4) goto L40
            r4 = 8
            if (r6 != r4) goto L36
            goto L40
        L36:
            java.lang.String r5 = "Unexpected side: "
            java.lang.String r5 = defpackage.lb1.g(r6, r5)
            defpackage.i.h(r5)
            throw r3
        L40:
            r5.a = r6
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r5.f = r6
            r5.h = r2
            r5.g = r1
            if (r7 == 0) goto L61
            r5.h = r7
            r6.setColor(r7)
            r0.e = r6
            ap3 r5 = r0.i
            if (r5 == 0) goto L61
            java.lang.Object r5 = r5.L
            android.view.View r5 = (android.view.View) r5
            r5.setBackground(r6)
        L61:
            return
    }

    public final void a(float r2) {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 * r0
            k45 r1 = r1.b
            float r0 = r1.h
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L18
            r1.h = r2
            ap3 r1 = r1.i
            if (r1 == 0) goto L18
            java.lang.Object r1 = r1.L
            android.view.View r1 = (android.view.View) r1
            r1.setAlpha(r2)
        L18:
            return
    }

    public final void b(float r4) {
            r3 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r0
            r1 = 1
            k45 r2 = r3.b
            int r3 = r3.a
            if (r3 == r1) goto L61
            r1 = 2
            if (r3 == r1) goto L47
            r1 = 4
            if (r3 == r1) goto L2e
            r1 = 8
            if (r3 == r1) goto L15
            goto L7a
        L15:
            float r0 = r0 - r4
            int r3 = r2.b
            float r3 = (float) r3
            float r0 = r0 * r3
            float r3 = r2.g
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L7a
            r2.g = r0
            ap3 r3 = r2.i
            if (r3 == 0) goto L7a
            java.lang.Object r3 = r3.L
            android.view.View r3 = (android.view.View) r3
            r3.setTranslationY(r0)
            return
        L2e:
            float r0 = r0 - r4
            int r3 = r2.a
            float r3 = (float) r3
            float r0 = r0 * r3
            float r3 = r2.f
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 == 0) goto L7a
            r2.f = r0
            ap3 r3 = r2.i
            if (r3 == 0) goto L7a
            java.lang.Object r3 = r3.L
            android.view.View r3 = (android.view.View) r3
            r3.setTranslationX(r0)
            return
        L47:
            float r0 = r0 - r4
            float r3 = -r0
            int r4 = r2.b
            float r4 = (float) r4
            float r3 = r3 * r4
            float r4 = r2.g
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L7a
            r2.g = r3
            ap3 r4 = r2.i
            if (r4 == 0) goto L7a
            java.lang.Object r4 = r4.L
            android.view.View r4 = (android.view.View) r4
            r4.setTranslationY(r3)
            return
        L61:
            float r0 = r0 - r4
            float r3 = -r0
            int r4 = r2.a
            float r4 = (float) r4
            float r3 = r3 * r4
            float r4 = r2.f
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L7a
            r2.f = r3
            ap3 r4 = r2.i
            if (r4 == 0) goto L7a
            java.lang.Object r4 = r4.L
            android.view.View r4 = (android.view.View) r4
            r4.setTranslationX(r3)
        L7a:
            return
    }
}
