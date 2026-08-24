package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yz6  reason: default package */
/* loaded from: classes.dex */
public final class yz6 extends android.graphics.Canvas {
    public android.graphics.Canvas a;

    public final android.graphics.Canvas a() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Text drawing wrapper is missing a Canvas!"
            defpackage.q53.d(r0)
            defpackage.e41.c()
            r0 = 0
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(android.graphics.Path r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = defpackage.au.x(r0, r1)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float r1, float r2, float r3, float r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = defpackage.au.v(r0, r1, r2, r3, r4)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = defpackage.au.w(r0, r1, r2, r3, r4)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(android.graphics.Rect r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = defpackage.au.y(r0, r1)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(android.graphics.RectF r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = defpackage.au.z(r0, r1)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(android.graphics.Path r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = r0.clipPath(r1)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(android.graphics.Path r1, android.graphics.Region.Op r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = r0.clipPath(r1, r2)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float r1, float r2, float r3, float r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = r0.clipRect(r1, r2, r3, r4)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float r1, float r2, float r3, float r4, android.graphics.Region.Op r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = r0.clipRect(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = r0.clipRect(r1, r2, r3, r4)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.Rect r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = r0.clipRect(r1)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.Rect r1, android.graphics.Region.Op r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = r0.clipRect(r1, r2)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.RectF r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = r0.clipRect(r1)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(android.graphics.RectF r1, android.graphics.Region.Op r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = r0.clipRect(r1, r2)
            return r0
    }

    @Override // android.graphics.Canvas
    public final void concat(android.graphics.Matrix r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.concat(r1)
            return
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            defpackage.od.i(r0)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawARGB(r1, r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float r1, float r2, float r3, float r4, float r5, float r6, boolean r7, android.graphics.Paint r8) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawArc(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawArc(android.graphics.RectF r1, float r2, float r3, boolean r4, android.graphics.Paint r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawArc(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap r1, float r2, float r3, android.graphics.Paint r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawBitmap(r1, r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap r1, android.graphics.Matrix r2, android.graphics.Paint r3) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawBitmap(r1, r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap r1, android.graphics.Rect r2, android.graphics.Rect r3, android.graphics.Paint r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawBitmap(r1, r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(android.graphics.Bitmap r1, android.graphics.Rect r2, android.graphics.RectF r3, android.graphics.Paint r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawBitmap(r1, r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] r1, int r2, int r3, float r4, float r5, int r6, int r7, boolean r8, android.graphics.Paint r9) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawBitmap(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] r1, int r2, int r3, int r4, int r5, int r6, int r7, boolean r8, android.graphics.Paint r9) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawBitmap(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(android.graphics.Bitmap r1, int r2, int r3, float[] r4, int r5, int[] r6, int r7, android.graphics.Paint r8) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawBitmapMesh(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float r1, float r2, float r3, android.graphics.Paint r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawCircle(r1, r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawColor(r1)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int r1, android.graphics.BlendMode r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            defpackage.od.j(r0, r1, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawColor(r1, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            defpackage.od.k(r0, r1)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long r1, android.graphics.BlendMode r3) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            defpackage.od.l(r0, r1, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(android.graphics.RectF r1, float r2, float r3, android.graphics.RectF r4, float r5, float r6, android.graphics.Paint r7) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            defpackage.od.m(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(android.graphics.RectF r1, float[] r2, android.graphics.RectF r3, float[] r4, android.graphics.Paint r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            defpackage.od.n(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] r1, int r2, float[] r3, int r4, int r5, android.graphics.fonts.Font r6, android.graphics.Paint r7) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            defpackage.sd0.t(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float r1, float r2, float r3, float r4, android.graphics.Paint r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawLine(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] r1, int r2, int r3, android.graphics.Paint r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawLines(r1, r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] r1, android.graphics.Paint r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawLines(r1, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float r1, float r2, float r3, float r4, android.graphics.Paint r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawOval(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawOval(android.graphics.RectF r1, android.graphics.Paint r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawOval(r1, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(android.graphics.Paint r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawPaint(r1)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(android.graphics.NinePatch r1, android.graphics.Rect r2, android.graphics.Paint r3) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            defpackage.sd0.r(r0, r1, r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(android.graphics.NinePatch r1, android.graphics.RectF r2, android.graphics.Paint r3) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            defpackage.sd0.s(r0, r1, r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPath(android.graphics.Path r1, android.graphics.Paint r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawPath(r1, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawPicture(r1)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture r1, android.graphics.Rect r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawPicture(r1, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(android.graphics.Picture r1, android.graphics.RectF r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawPicture(r1, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float r1, float r2, android.graphics.Paint r3) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawPoint(r1, r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] r1, int r2, int r3, android.graphics.Paint r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawPoints(r1, r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] r1, android.graphics.Paint r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawPoints(r1, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(java.lang.String r1, float[] r2, android.graphics.Paint r3) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawPosText(r1, r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] r1, int r2, int r3, float[] r4, android.graphics.Paint r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawPosText(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int r1, int r2, int r3) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawRGB(r1, r2, r3)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float r1, float r2, float r3, float r4, android.graphics.Paint r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawRect(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRect(android.graphics.Rect r1, android.graphics.Paint r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawRect(r1, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRect(android.graphics.RectF r1, android.graphics.Paint r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawRect(r1, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(android.graphics.RenderNode r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            defpackage.od.o(r0, r1)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float r1, float r2, float r3, float r4, float r5, float r6, android.graphics.Paint r7) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawRoundRect(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(android.graphics.RectF r1, float r2, float r3, android.graphics.Paint r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawRoundRect(r1, r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.CharSequence r1, int r2, int r3, float r4, float r5, android.graphics.Paint r6) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawText(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.String r1, float r2, float r3, android.graphics.Paint r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawText(r1, r2, r3, r4)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawText(java.lang.String r1, int r2, int r3, float r4, float r5, android.graphics.Paint r6) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawText(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] r1, int r2, int r3, float r4, float r5, android.graphics.Paint r6) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawText(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(java.lang.String r1, android.graphics.Path r2, float r3, float r4, android.graphics.Paint r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawTextOnPath(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] r1, int r2, int r3, android.graphics.Path r4, float r5, float r6, android.graphics.Paint r7) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawTextOnPath(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(android.graphics.text.MeasuredText r1, int r2, int r3, int r4, int r5, float r6, float r7, boolean r8, android.graphics.Paint r9) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            defpackage.od.p(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(java.lang.CharSequence r1, int r2, int r3, int r4, int r5, float r6, float r7, boolean r8, android.graphics.Paint r9) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawTextRun(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] r1, int r2, int r3, int r4, int r5, float r6, float r7, boolean r8, android.graphics.Paint r9) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawTextRun(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(android.graphics.Canvas.VertexMode r1, int r2, float[] r3, int r4, float[] r5, int r6, int[] r7, int r8, short[] r9, int r10, int r11, android.graphics.Paint r12) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.drawVertices(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            defpackage.od.v(r0)
            return
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(android.graphics.Rect r4) {
            r3 = this;
            android.graphics.Canvas r3 = r3.a()
            boolean r3 = r3.getClipBounds(r4)
            if (r3 == 0) goto L15
            int r0 = r4.width()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            r4.set(r2, r2, r0, r1)
        L15:
            return r3
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.getDensity()
            return r0
    }

    @Override // android.graphics.Canvas
    public final android.graphics.DrawFilter getDrawFilter() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            android.graphics.DrawFilter r0 = r0.getDrawFilter()
            return r0
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.getHeight()
            return r0
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(android.graphics.Matrix r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.getMatrix(r1)
            return
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.getMaximumBitmapHeight()
            return r0
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.getMaximumBitmapWidth()
            return r0
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.getSaveCount()
            return r0
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.getWidth()
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = r0.isOpaque()
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float r1, float r2, float r3, float r4) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = defpackage.m2.w(r0, r1, r2, r3, r4)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float r1, float r2, float r3, float r4, android.graphics.Canvas.EdgeType r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = r0.quickReject(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.Path r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = defpackage.m2.x(r0, r1)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.Path r1, android.graphics.Canvas.EdgeType r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = r0.quickReject(r1, r2)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.RectF r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = defpackage.m2.y(r0, r1)
            return r0
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(android.graphics.RectF r1, android.graphics.Canvas.EdgeType r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            boolean r0 = r0.quickReject(r1, r2)
            return r0
    }

    @Override // android.graphics.Canvas
    public final void restore() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.restore()
            return
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.restoreToCount(r1)
            return
    }

    @Override // android.graphics.Canvas
    public final void rotate(float r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.rotate(r1)
            return
    }

    @Override // android.graphics.Canvas
    public final int save() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.save()
            return r0
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float r1, float r2, float r3, float r4, android.graphics.Paint r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.saveLayer(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float r1, float r2, float r3, float r4, android.graphics.Paint r5, int r6) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.saveLayer(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(android.graphics.RectF r1, android.graphics.Paint r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.saveLayer(r1, r2)
            return r0
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(android.graphics.RectF r1, android.graphics.Paint r2, int r3) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.saveLayer(r1, r2, r3)
            return r0
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float r1, float r2, float r3, float r4, int r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.saveLayerAlpha(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float r1, float r2, float r3, float r4, int r5, int r6) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.saveLayerAlpha(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(android.graphics.RectF r1, int r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.saveLayerAlpha(r1, r2)
            return r0
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(android.graphics.RectF r1, int r2, int r3) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            int r0 = r0.saveLayerAlpha(r1, r2, r3)
            return r0
    }

    @Override // android.graphics.Canvas
    public final void scale(float r1, float r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.scale(r1, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(android.graphics.Bitmap r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.setBitmap(r1)
            return
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.setDensity(r1)
            return
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(android.graphics.DrawFilter r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.setDrawFilter(r1)
            return
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(android.graphics.Matrix r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.setMatrix(r1)
            return
    }

    @Override // android.graphics.Canvas
    public final void skew(float r1, float r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.skew(r1, r2)
            return
    }

    @Override // android.graphics.Canvas
    public final void translate(float r1, float r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a()
            r0.translate(r1, r2)
            return
    }
}
