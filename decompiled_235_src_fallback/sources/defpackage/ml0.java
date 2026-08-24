package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ml0  reason: default package */
/* loaded from: classes.dex */
public final class ml0 extends android.util.Property {
    public final /* synthetic */ int a;

    public /* synthetic */ ml0(java.lang.String r1, int r2, java.lang.Class r3) {
            r0 = this;
            r0.a = r2
            r0.<init>(r3, r1)
            return
    }

    @Override // android.util.Property
    public final java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            int r1 = r1.a
            r0 = 0
            switch(r1) {
                case 0: goto L2f;
                case 1: goto L2c;
                case 2: goto L29;
                case 3: goto L26;
                case 4: goto L23;
                case 5: goto L1a;
                case 6: goto Ld;
                default: goto L6;
            }
        L6:
            android.view.View r2 = (android.view.View) r2
            android.graphics.Rect r1 = r2.getClipBounds()
            return r1
        Ld:
            android.view.View r2 = (android.view.View) r2
            gq7 r1 = defpackage.dq7.a
            float r1 = r1.K(r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L1a:
            androidx.appcompat.widget.SwitchCompat r2 = (androidx.appcompat.widget.SwitchCompat) r2
            float r1 = r2.y0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L23:
            android.view.View r2 = (android.view.View) r2
            return r0
        L26:
            android.view.View r2 = (android.view.View) r2
            return r0
        L29:
            android.view.View r2 = (android.view.View) r2
            return r0
        L2c:
            pl0 r2 = (defpackage.pl0) r2
            return r0
        L2f:
            pl0 r2 = (defpackage.pl0) r2
            return r0
    }

    @Override // android.util.Property
    public final void set(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r4 = r4.a
            r0 = 0
            switch(r4) {
                case 0: goto Laf;
                case 1: goto L7e;
                case 2: goto L62;
                case 3: goto L46;
                case 4: goto L28;
                case 5: goto L1c;
                case 6: goto Le;
                default: goto L6;
            }
        L6:
            android.view.View r5 = (android.view.View) r5
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            r5.setClipBounds(r6)
            return
        Le:
            android.view.View r5 = (android.view.View) r5
            java.lang.Float r6 = (java.lang.Float) r6
            float r4 = r6.floatValue()
            gq7 r6 = defpackage.dq7.a
            r6.Y(r5, r4)
            return
        L1c:
            androidx.appcompat.widget.SwitchCompat r5 = (androidx.appcompat.widget.SwitchCompat) r5
            java.lang.Float r6 = (java.lang.Float) r6
            float r4 = r6.floatValue()
            r5.setThumbPosition(r4)
            return
        L28:
            android.view.View r5 = (android.view.View) r5
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            float r4 = r6.x
            int r4 = java.lang.Math.round(r4)
            float r6 = r6.y
            int r6 = java.lang.Math.round(r6)
            int r0 = r5.getWidth()
            int r0 = r0 + r4
            int r1 = r5.getHeight()
            int r1 = r1 + r6
            defpackage.dq7.a(r5, r4, r6, r0, r1)
            return
        L46:
            android.view.View r5 = (android.view.View) r5
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            float r4 = r6.x
            int r4 = java.lang.Math.round(r4)
            float r6 = r6.y
            int r6 = java.lang.Math.round(r6)
            int r0 = r5.getRight()
            int r1 = r5.getBottom()
            defpackage.dq7.a(r5, r4, r6, r0, r1)
            return
        L62:
            android.view.View r5 = (android.view.View) r5
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            int r4 = r5.getLeft()
            int r0 = r5.getTop()
            float r1 = r6.x
            int r1 = java.lang.Math.round(r1)
            float r6 = r6.y
            int r6 = java.lang.Math.round(r6)
            defpackage.dq7.a(r5, r4, r0, r1, r6)
            return
        L7e:
            pl0 r5 = (defpackage.pl0) r5
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            r5.getClass()
            float r4 = r6.x
            int r4 = java.lang.Math.round(r4)
            r5.c = r4
            float r4 = r6.y
            int r4 = java.lang.Math.round(r4)
            r5.d = r4
            int r6 = r5.g
            int r6 = r6 + 1
            r5.g = r6
            int r1 = r5.f
            if (r1 != r6) goto Lae
            android.view.View r6 = r5.e
            int r1 = r5.a
            int r2 = r5.b
            int r3 = r5.c
            defpackage.dq7.a(r6, r1, r2, r3, r4)
            r5.f = r0
            r5.g = r0
        Lae:
            return
        Laf:
            pl0 r5 = (defpackage.pl0) r5
            android.graphics.PointF r6 = (android.graphics.PointF) r6
            r5.getClass()
            float r4 = r6.x
            int r4 = java.lang.Math.round(r4)
            r5.a = r4
            float r4 = r6.y
            int r4 = java.lang.Math.round(r4)
            r5.b = r4
            int r6 = r5.f
            int r6 = r6 + 1
            r5.f = r6
            int r1 = r5.g
            if (r6 != r1) goto Ldf
            android.view.View r6 = r5.e
            int r1 = r5.a
            int r2 = r5.c
            int r3 = r5.d
            defpackage.dq7.a(r6, r1, r4, r2, r3)
            r5.f = r0
            r5.g = r0
        Ldf:
            return
    }
}
