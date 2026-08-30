package m4;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends Canvas {

    /* renamed from: a  reason: collision with root package name */
    public Canvas f9215a;

    public final Canvas a() {
        Canvas canvas = this.f9215a;
        if (canvas != null) {
            return canvas;
        }
        r4.a.d("Text drawing wrapper is missing a Canvas!");
        wa.b.a();
        return null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        boolean clipOutPath;
        clipOutPath = a().clipOutPath(path);
        return clipOutPath;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        boolean clipOutRect;
        clipOutRect = a().clipOutRect(rectF);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        return a().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f8, float f10, float f11, float f12, Region.Op op) {
        return a().clipRect(f8, f10, f11, f12, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        a().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        a().disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i2, int i10, int i11, int i12) {
        a().drawARGB(i2, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f8, float f10, float f11, float f12, float f13, float f14, boolean z10, Paint paint) {
        a().drawArc(f8, f10, f11, f12, f13, f14, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i2, int i10, float f8, float f10, int i11, int i12, boolean z10, Paint paint) {
        a().drawBitmap(iArr, i2, i10, f8, f10, i11, i12, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i2, int i10, float[] fArr, int i11, int[] iArr, int i12, Paint paint) {
        a().drawBitmapMesh(bitmap, i2, i10, fArr, i11, iArr, i12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f8, float f10, float f11, Paint paint) {
        a().drawCircle(f8, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i2) {
        a().drawColor(i2);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f8, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        a().drawDoubleRoundRect(rectF, f8, f10, rectF2, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i2, float[] fArr, int i10, int i11, Font font, Paint paint) {
        a().drawGlyphs(iArr, i2, fArr, i10, i11, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f8, float f10, float f11, float f12, Paint paint) {
        a().drawLine(f8, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i2, int i10, Paint paint) {
        a().drawLines(fArr, i2, i10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f8, float f10, float f11, float f12, Paint paint) {
        a().drawOval(f8, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        a().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        a().drawPatch(ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        a().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        a().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f8, float f10, Paint paint) {
        a().drawPoint(f8, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i2, int i10, Paint paint) {
        a().drawPoints(fArr, i2, i10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i2, int i10, float[] fArr, Paint paint) {
        a().drawPosText(cArr, i2, i10, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i2, int i10, int i11) {
        a().drawRGB(i2, i10, i11);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f8, float f10, float f11, float f12, Paint paint) {
        a().drawRect(f8, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        a().drawRenderNode(renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f8, float f10, float f11, float f12, float f13, float f14, Paint paint) {
        a().drawRoundRect(f8, f10, f11, f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i2, int i10, float f8, float f10, Paint paint) {
        a().drawText(cArr, i2, i10, f8, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i2, int i10, Path path, float f8, float f10, Paint paint) {
        a().drawTextOnPath(cArr, i2, i10, path, f8, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i2, int i10, int i11, int i12, float f8, float f10, boolean z10, Paint paint) {
        a().drawTextRun(cArr, i2, i10, i11, i12, f8, f10, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i2, float[] fArr, int i10, float[] fArr2, int i11, int[] iArr, int i12, short[] sArr, int i13, int i14, Paint paint) {
        a().drawVertices(vertexMode, i2, fArr, i10, fArr2, i11, iArr, i12, sArr, i13, i14, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        a().enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Preference.DEFAULT_ORDER);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return a().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return a().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return a().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        a().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return a().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return a().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return a().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return a().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return a().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f8, float f10, float f11, float f12, Canvas.EdgeType edgeType) {
        return a().quickReject(f8, f10, f11, f12, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        a().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i2) {
        a().restoreToCount(i2);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f8) {
        a().rotate(f8);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return a().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f8, float f10, float f11, float f12, Paint paint, int i2) {
        return a().saveLayer(f8, f10, f11, f12, paint, i2);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f8, float f10, float f11, float f12, int i2, int i10) {
        return a().saveLayerAlpha(f8, f10, f11, f12, i2, i10);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f8, float f10) {
        a().scale(f8, f10);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        a().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i2) {
        a().setDensity(i2);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        a().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        a().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f8, float f10) {
        a().skew(f8, f10);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f8, float f10) {
        a().translate(f8, f10);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j2) {
        a().drawColor(j2);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        a().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        a().drawPatch(ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        a().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        a().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        boolean clipOutRect;
        clipOutRect = a().clipOutRect(rect);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return a().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        a().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i2, PorterDuff.Mode mode) {
        a().drawColor(i2, mode);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f8, float f10, float f11, float f12) {
        boolean clipOutRect;
        clipOutRect = a().clipOutRect(f8, f10, f11, f12);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i2, BlendMode blendMode) {
        a().drawColor(i2, blendMode);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i2, int i10, int i11, int i12) {
        boolean clipOutRect;
        clipOutRect = a().clipOutRect(i2, i10, i11, i12);
        return clipOutRect;
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j2, BlendMode blendMode) {
        a().drawColor(j2, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        a().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        a().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        a().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        return a().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        a().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f8, float f10, Paint paint) {
        a().drawText(str, f8, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        boolean quickReject;
        quickReject = a().quickReject(rectF);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        return a().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        a().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f8, float f10, Paint paint) {
        a().drawRoundRect(rectF, f8, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i2, int i10, float f8, float f10, Paint paint) {
        a().drawText(str, i2, i10, f8, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f8, float f10, Paint paint) {
        a().drawTextOnPath(str, path, f8, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return a().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i2) {
        return a().saveLayerAlpha(rectF, i2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i2, int i10, float f8, float f10, Paint paint) {
        a().drawText(charSequence, i2, i10, f8, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return a().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i2) {
        return a().saveLayer(rectF, paint, i2);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i2, int i10) {
        return a().saveLayerAlpha(rectF, i2, i10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return a().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        boolean quickReject;
        quickReject = a().quickReject(path);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f8, float f10, float f11, float f12, Paint paint) {
        return a().saveLayer(f8, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f8, float f10, float f11, float f12, int i2) {
        return a().saveLayerAlpha(f8, f10, f11, f12, i2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f8, float f10, float f11, float f12) {
        return a().clipRect(f8, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f8, float f10, boolean z10, Paint paint) {
        a().drawArc(rectF, f8, f10, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i2, int i10, int i11, int i12) {
        return a().clipRect(i2, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return a().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f8, float f10, float f11, float f12) {
        boolean quickReject;
        quickReject = a().quickReject(f8, f10, f11, f12);
        return quickReject;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i2, int i10, int i11, int i12, float f8, float f10, boolean z10, Paint paint) {
        a().drawTextRun(charSequence, i2, i10, i11, i12, f8, f10, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f8, float f10, Paint paint) {
        a().drawBitmap(bitmap, f8, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i2, int i10, int i11, int i12, float f8, float f10, boolean z10, Paint paint) {
        a().drawTextRun(measuredText, i2, i10, i11, i12, f8, f10, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i2, int i10, int i11, int i12, int i13, int i14, boolean z10, Paint paint) {
        a().drawBitmap(iArr, i2, i10, i11, i12, i13, i14, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        a().drawBitmap(bitmap, matrix, paint);
    }
}
