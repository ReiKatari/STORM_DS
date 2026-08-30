package m4;

import a7.v;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f9216a;

    /* renamed from: b  reason: collision with root package name */
    public final TextUtils.TruncateAt f9217b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9218c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f9219d;

    /* renamed from: e  reason: collision with root package name */
    public dk.a f9220e;

    /* renamed from: f  reason: collision with root package name */
    public final Layout f9221f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9222g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9223h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9224i;

    /* renamed from: j  reason: collision with root package name */
    public final float f9225j;

    /* renamed from: k  reason: collision with root package name */
    public final float f9226k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f9227l;
    public final Paint.FontMetricsInt m;

    /* renamed from: n  reason: collision with root package name */
    public final int f9228n;

    /* renamed from: o  reason: collision with root package name */
    public final o4.h[] f9229o;

    /* renamed from: p  reason: collision with root package name */
    public final Rect f9230p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    public v f9231q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0198  */
    /* JADX WARN: Type inference failed for: r2v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, m4.f r35) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.k.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, m4.f):void");
    }

    public final int a() {
        int height;
        boolean z10 = this.f9219d;
        Layout layout = this.f9221f;
        if (z10) {
            height = layout.getLineBottom(this.f9222g - 1);
        } else {
            height = layout.getHeight();
        }
        return height + this.f9223h + this.f9224i + this.f9228n;
    }

    public final float b(int i2) {
        if (i2 == this.f9222g - 1) {
            return this.f9225j + this.f9226k;
        }
        return 0.0f;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [a7.v, java.lang.Object] */
    public final v c() {
        v vVar = this.f9231q;
        if (vVar == null) {
            ?? obj = new Object();
            obj.A = this.f9221f;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            do {
                int g02 = vc.h.g0('\n', i2, 4, ((Layout) obj.A).getText());
                if (g02 < 0) {
                    i2 = ((Layout) obj.A).getText().length();
                } else {
                    i2 = g02 + 1;
                }
                arrayList.add(Integer.valueOf(i2));
            } while (i2 < ((Layout) obj.A).getText().length());
            obj.X = arrayList;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(null);
            }
            obj.B = arrayList2;
            obj.L = new boolean[((ArrayList) obj.X).size()];
            ((ArrayList) obj.X).size();
            this.f9231q = obj;
            return obj;
        }
        return vVar;
    }

    public final float d(int i2) {
        float lineBaseline;
        Paint.FontMetricsInt fontMetricsInt;
        float f8 = this.f9223h;
        if (i2 == this.f9222g - 1 && (fontMetricsInt = this.m) != null) {
            lineBaseline = g(i2) - fontMetricsInt.ascent;
        } else {
            lineBaseline = this.f9221f.getLineBaseline(i2);
        }
        return f8 + lineBaseline;
    }

    public final float e(int i2) {
        int i10;
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f9222g;
        int i12 = i11 - 1;
        Layout layout = this.f9221f;
        if (i2 == i12 && (fontMetricsInt = this.m) != null) {
            return layout.getLineBottom(i2 - 1) + fontMetricsInt.bottom;
        }
        float lineBottom = this.f9223h + layout.getLineBottom(i2);
        if (i2 == i11 - 1) {
            i10 = this.f9224i;
        } else {
            i10 = 0;
        }
        return lineBottom + i10;
    }

    public final int f(int i2) {
        ThreadLocal threadLocal = l.f9232a;
        Layout layout = this.f9221f;
        if (layout.getEllipsisCount(i2) > 0 && this.f9217b == TextUtils.TruncateAt.END) {
            return layout.getText().length();
        }
        return layout.getLineEnd(i2);
    }

    public final float g(int i2) {
        int i10;
        float lineTop = this.f9221f.getLineTop(i2);
        if (i2 == 0) {
            i10 = 0;
        } else {
            i10 = this.f9223h;
        }
        return lineTop + i10;
    }

    public final float h(int i2, boolean z10) {
        return b(this.f9221f.getLineForOffset(i2)) + c().p(i2, true, z10);
    }

    public final float i(int i2, boolean z10) {
        return b(this.f9221f.getLineForOffset(i2)) + c().p(i2, false, z10);
    }

    public final dk.a j() {
        dk.a aVar = this.f9220e;
        if (aVar != null) {
            return aVar;
        }
        Layout layout = this.f9221f;
        dk.a aVar2 = new dk.a(layout.getText(), layout.getText().length(), this.f9216a.getTextLocale());
        this.f9220e = aVar2;
        return aVar2;
    }
}
