package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: po1  reason: default package */
/* loaded from: classes.dex */
public final class po1 extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
    public final defpackage.oo1 A;

    public po1(defpackage.oo1 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(android.text.TextPaint r4) {
            r3 = this;
            if (r4 == 0) goto L5d
            kc2 r0 = defpackage.kc2.a
            oo1 r3 = r3.A
            boolean r0 = defpackage.nb3.k(r3, r0)
            if (r0 == 0) goto L12
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
            r4.setStyle(r3)
            return
        L12:
            boolean r0 = r3 instanceof defpackage.ys6
            if (r0 == 0) goto L5a
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r4.setStyle(r0)
            ys6 r3 = (defpackage.ys6) r3
            float r0 = r3.a
            r4.setStrokeWidth(r0)
            float r0 = r3.b
            r4.setStrokeMiter(r0)
            int r0 = r3.d
            r1 = 2
            r2 = 1
            if (r0 != 0) goto L30
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            goto L3c
        L30:
            if (r0 != r2) goto L35
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L3c
        L35:
            if (r0 != r1) goto L3a
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
            goto L3c
        L3a:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
        L3c:
            r4.setStrokeJoin(r0)
            int r3 = r3.c
            if (r3 != 0) goto L46
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto L52
        L46:
            if (r3 != r2) goto L4b
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L52
        L4b:
            if (r3 != r1) goto L50
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
            goto L52
        L50:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
        L52:
            r4.setStrokeCap(r3)
            r3 = 0
            r4.setPathEffect(r3)
            return
        L5a:
            defpackage.i.d()
        L5d:
            return
    }
}
