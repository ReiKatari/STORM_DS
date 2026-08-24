package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y37  reason: default package */
/* loaded from: classes.dex */
public final class y37 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public m42 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final yu3[] o;
    public final Rect p = new Rect();
    public s9 q;

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
    */
    public y37(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, dm3 dm3Var) {
        Layout.Alignment alignment;
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layout;
        yu3[] yu3VarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        char c;
        long j;
        int i14;
        int i15;
        long a;
        int i16;
        long j2;
        int i17;
        Layout layout2;
        int i18;
        Paint.FontMetricsInt fontMetricsInt;
        yu3 yu3Var;
        yu3 yu3Var2;
        int i19;
        Layout boringLayout;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic b = d47.b(i2);
        Layout.Alignment alignment2 = xz6.a;
        if (i == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i == 3) {
            alignment = xz6.a;
        } else if (i != 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment = xz6.b;
        }
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, y20.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a2 = dm3Var.a();
            double d = f;
            int ceil = (int) Math.ceil(d);
            if (a2 != null && dm3Var.c() <= f && !z2) {
                this.l = true;
                if (ceil < 0) {
                    q53.a("negative width");
                }
                if (ceil < 0) {
                    q53.a("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    boringLayout = o2.f(charSequence, textPaint, ceil, alignment, a2, z, truncateAt, ceil);
                } else {
                    boringLayout = new BoringLayout(charSequence, textPaint, ceil, alignment, 1.0f, RecyclerView.B1, a2, z, truncateAt, ceil);
                }
                i9 = i3;
                textDirectionHeuristic = b;
                layout = boringLayout;
            } else {
                this.l = false;
                i9 = i3;
                textDirectionHeuristic = b;
                layout = uj2.t(charSequence, textPaint, ceil, charSequence.length(), textDirectionHeuristic, alignment, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            }
            this.f = layout;
            Trace.endSection();
            int min = Math.min(layout.getLineCount(), i9);
            this.g = min;
            int i20 = min - 1;
            this.d = min >= i9 && (layout.getEllipsisCount(i20) > 0 || layout.getLineEnd(i20) != charSequence.length());
            if (layout.getText() instanceof Spanned) {
                CharSequence text = layout.getText();
                text.getClass();
                if (ii2.B((Spanned) text, yu3.class) || layout.getText().length() <= 0) {
                    CharSequence text2 = layout.getText();
                    text2.getClass();
                    i10 = 0;
                    yu3VarArr = (yu3[]) ((Spanned) text2).getSpans(0, layout.getText().length(), yu3.class);
                    this.o = yu3VarArr;
                    if (yu3VarArr != null || (yu3Var2 = (yu3) fv.E0(yu3VarArr)) == null) {
                        i11 = 2;
                        i12 = i10;
                    } else {
                        if (yu3Var2.L) {
                            i11 = 2;
                            if (yu3Var2.Y == 2) {
                                i19 = 1;
                                i12 = i19;
                            }
                        } else {
                            i11 = 2;
                        }
                        i19 = i10;
                        i12 = i19;
                    }
                    i13 = (yu3VarArr == null && (yu3Var = (yu3) fv.E0(yu3VarArr)) != null && yu3Var.R && yu3Var.Y == i11) ? 1 : i10;
                    if (i12 == 0 && i13 != 0) {
                        a = d47.b;
                        c = ' ';
                        j = 4294967295L;
                        i14 = 1;
                        i15 = 33;
                    } else {
                        long j3 = d47.b;
                        if (!z) {
                            c = ' ';
                            j = 4294967295L;
                            i14 = 1;
                            i15 = 33;
                        } else if (this.l) {
                            BoringLayout boringLayout2 = (BoringLayout) layout;
                            i15 = 33;
                            if (Build.VERSION.SDK_INT >= 33) {
                                i16 = o2.y(boringLayout2);
                                if (i16 != 0) {
                                    c = ' ';
                                    j = 4294967295L;
                                    i14 = 1;
                                } else {
                                    TextPaint paint = layout.getPaint();
                                    CharSequence text3 = layout.getText();
                                    c = ' ';
                                    Rect z3 = ej2.z(paint, text3, layout.getLineStart(i10), layout.getLineEnd(i10));
                                    int lineAscent = layout.getLineAscent(i10);
                                    j = 4294967295L;
                                    int i21 = z3.top;
                                    int topPadding = i21 < lineAscent ? lineAscent - i21 : layout.getTopPadding();
                                    i14 = 1;
                                    z3 = min != 1 ? ej2.z(paint, text3, layout.getLineStart(i20), layout.getLineEnd(i20)) : z3;
                                    int lineDescent = layout.getLineDescent(i20);
                                    int i22 = z3.bottom;
                                    int bottomPadding = i22 > lineDescent ? i22 - lineDescent : layout.getBottomPadding();
                                    if (topPadding != 0 || bottomPadding != 0) {
                                        j3 = d47.a(topPadding, bottomPadding);
                                    }
                                }
                            }
                            i16 = i10;
                            if (i16 != 0) {
                            }
                        } else {
                            i15 = 33;
                            StaticLayout staticLayout = (StaticLayout) layout;
                            int i23 = Build.VERSION.SDK_INT;
                            if (i23 >= 33) {
                                i16 = a81.r(staticLayout);
                            } else {
                                if (i23 >= 28) {
                                    i16 = 1;
                                }
                                i16 = i10;
                            }
                            if (i16 != 0) {
                            }
                        }
                        a = d47.a(i12 == 0 ? i10 : (int) (j3 >> c), i13 == 0 ? i10 : (int) (j3 & j));
                    }
                    if (yu3VarArr == null) {
                        int length2 = yu3VarArr.length;
                        int i24 = i10;
                        int i25 = i24;
                        for (int i26 = i25; i26 < length2; i26++) {
                            yu3 yu3Var3 = yu3VarArr[i26];
                            int i27 = yu3Var3.g0;
                            i24 = i27 < 0 ? Math.max(i24, Math.abs(i27)) : i24;
                            int i28 = yu3Var3.h0;
                            if (i28 < 0) {
                                i25 = Math.max(i24, Math.abs(i28));
                            }
                        }
                        if (i24 == 0 && i25 == 0) {
                            j2 = d47.b;
                        } else {
                            j2 = d47.a(i24, i25);
                        }
                    } else {
                        j2 = d47.b;
                    }
                    this.h = Math.max((int) (a >> c), (int) (j2 >> c));
                    this.i = Math.max((int) (a & j), (int) (j2 & j));
                    TextPaint textPaint2 = this.a;
                    yu3[] yu3VarArr2 = this.o;
                    i17 = this.g - i14;
                    layout2 = this.f;
                    if (layout2.getLineStart(i17) == layout2.getLineEnd(i17) || yu3VarArr2 == null || yu3VarArr2.length == 0) {
                        i18 = i10;
                        fontMetricsInt = null;
                    } else {
                        SpannableString spannableString = new SpannableString("\u200b");
                        yu3 yu3Var4 = (yu3) fv.D0(yu3VarArr2);
                        spannableString.setSpan(new yu3(yu3Var4.A, spannableString.length(), (i17 == 0 || !yu3Var4.R) ? yu3Var4.R : i10, yu3Var4.R, yu3Var4.X, yu3Var4.Y), i10, spannableString.length(), i15);
                        i18 = i10;
                        StaticLayout t = uj2.t(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, mj3.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                        fontMetricsInt = new Paint.FontMetricsInt();
                        fontMetricsInt.ascent = t.getLineAscent(i18);
                        fontMetricsInt.descent = t.getLineDescent(i18);
                        fontMetricsInt.top = t.getLineTop(i18);
                        fontMetricsInt.bottom = t.getLineBottom(i18);
                    }
                    this.n = fontMetricsInt == null ? fontMetricsInt.bottom - ((int) (e(i20) - g(i20))) : i18;
                    this.m = fontMetricsInt;
                    Layout layout3 = this.f;
                    this.j = mp2.D(layout3, i20, layout3.getPaint());
                    Layout layout4 = this.f;
                    this.k = mp2.E(layout4, i20, layout4.getPaint());
                }
            }
            yu3VarArr = null;
            i10 = 0;
            this.o = yu3VarArr;
            if (yu3VarArr != null) {
            }
            i11 = 2;
            i12 = i10;
            if (yu3VarArr == null) {
            }
            if (i12 == 0) {
            }
            long j32 = d47.b;
            if (!z) {
            }
            a = d47.a(i12 == 0 ? i10 : (int) (j32 >> c), i13 == 0 ? i10 : (int) (j32 & j));
            if (yu3VarArr == null) {
            }
            this.h = Math.max((int) (a >> c), (int) (j2 >> c));
            this.i = Math.max((int) (a & j), (int) (j2 & j));
            TextPaint textPaint22 = this.a;
            yu3[] yu3VarArr22 = this.o;
            i17 = this.g - i14;
            layout2 = this.f;
            if (layout2.getLineStart(i17) == layout2.getLineEnd(i17)) {
            }
            i18 = i10;
            fontMetricsInt = null;
            this.n = fontMetricsInt == null ? fontMetricsInt.bottom - ((int) (e(i20) - g(i20))) : i18;
            this.m = fontMetricsInt;
            Layout layout32 = this.f;
            this.j = mp2.D(layout32, i20, layout32.getPaint());
            Layout layout42 = this.f;
            this.k = mp2.E(layout42, i20, layout42.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
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
        return RecyclerView.B1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [s9, java.lang.Object] */
    public final s9 c() {
        s9 s9Var = this.q;
        if (s9Var == null) {
            ?? obj = new Object();
            obj.a = this.f;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            do {
                int s0 = qs6.s0('\n', i, 4, ((Layout) obj.a).getText());
                if (s0 < 0) {
                    i = ((Layout) obj.a).getText().length();
                } else {
                    i = s0 + 1;
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
        return s9Var;
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
        ThreadLocal threadLocal = d47.a;
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

    public final m42 j() {
        m42 m42Var = this.e;
        if (m42Var != null) {
            return m42Var;
        }
        Layout layout = this.f;
        m42 m42Var2 = new m42(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = m42Var2;
        return m42Var2;
    }
}
