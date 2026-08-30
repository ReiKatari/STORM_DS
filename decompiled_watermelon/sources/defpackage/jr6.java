package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jr6  reason: default package */
/* loaded from: classes.dex */
public final class jr6 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public xz1 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final wn3[] o;
    public final Rect p = new Rect();
    public r9 q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jr6(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, defpackage.gf3 r35) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr6.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, gf3):void");
    }

    public final int a() {
        int height;
        boolean z = this.d;
        Layout layout = this.f;
        if (z) {
            height = layout.getLineBottom(this.g - 1);
        } else {
            height = layout.getHeight();
        }
        return height + this.h + this.i + this.n;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return RecyclerView.A1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [r9, java.lang.Object] */
    public final r9 c() {
        r9 r9Var = this.q;
        if (r9Var == null) {
            ?? obj = new Object();
            obj.a = this.f;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            do {
                int y0 = zg6.y0('\n', i, 4, ((Layout) obj.a).getText());
                if (y0 < 0) {
                    i = ((Layout) obj.a).getText().length();
                } else {
                    i = y0 + 1;
                }
                arrayList.add(Integer.valueOf(i));
            } while (i < ((Layout) obj.a).getText().length());
            obj.b = arrayList;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(null);
            }
            obj.c = arrayList2;
            obj.d = new boolean[((ArrayList) obj.b).size()];
            ((ArrayList) obj.b).size();
            this.q = obj;
            return obj;
        }
        return r9Var;
    }

    public final float d(int i) {
        float lineBaseline;
        Paint.FontMetricsInt fontMetricsInt;
        float f = this.h;
        if (i == this.g - 1 && (fontMetricsInt = this.m) != null) {
            lineBaseline = g(i) - fontMetricsInt.ascent;
        } else {
            lineBaseline = this.f.getLineBaseline(i);
        }
        return f + lineBaseline;
    }

    public final float e(int i) {
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        int i3 = this.g;
        int i4 = i3 - 1;
        Layout layout = this.f;
        if (i == i4 && (fontMetricsInt = this.m) != null) {
            return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
        }
        float lineBottom = this.h + layout.getLineBottom(i);
        if (i == i3 - 1) {
            i2 = this.i;
        } else {
            i2 = 0;
        }
        return lineBottom + i2;
    }

    public final int f(int i) {
        ThreadLocal threadLocal = or6.a;
        Layout layout = this.f;
        if (layout.getEllipsisCount(i) > 0 && this.b == TextUtils.TruncateAt.END) {
            return layout.getText().length();
        }
        return layout.getLineEnd(i);
    }

    public final float g(int i) {
        int i2;
        float lineTop = this.f.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.h;
        }
        return lineTop + i2;
    }

    public final float h(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().x(i, true, z);
    }

    public final float i(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().x(i, false, z);
    }

    public final xz1 j() {
        xz1 xz1Var = this.e;
        if (xz1Var != null) {
            return xz1Var;
        }
        Layout layout = this.f;
        xz1 xz1Var2 = new xz1(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = xz1Var2;
        return xz1Var2;
    }
}
