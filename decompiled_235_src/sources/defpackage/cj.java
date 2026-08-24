package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cj  reason: default package */
/* loaded from: classes.dex */
public final class cj {
    public final gj a;
    public final int b;
    public final long c;
    public final y37 d;
    public final CharSequence e;
    public final List f;

    /* JADX WARN: Removed duplicated region for block: B:104:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x033b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cj(gj gjVar, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        nn6 nn6Var;
        int i13;
        int i14;
        int i15;
        char c;
        nn6 nn6Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        y37 a;
        int i16;
        int i17;
        cj cjVar;
        int i18;
        int i19;
        int i20;
        Layout layout;
        yd6[] yd6VarArr;
        CharSequence charSequence;
        List list;
        boolean z;
        boolean z2;
        boolean z3;
        of5 of5Var;
        boolean z4;
        float i21;
        int c2;
        float h;
        int c3;
        float d;
        int b;
        float g;
        float f;
        float d2;
        int i22;
        int i23;
        int i24;
        Spannable spannable;
        this.a = gjVar;
        this.b = i;
        this.c = j;
        if (q21.i(j) != 0 || q21.j(j) != 0) {
            q53.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            q53.a("maxLines should be greater than 0");
        }
        s47 s47Var = gjVar.b;
        CharSequence charSequence2 = gjVar.h;
        if (i2 == 2) {
            i3 = 0;
            if (!x47.a(s47Var.a.h, hi2.E(0)) && !x47.a(s47Var.a.h, x47.c) && (i24 = s47Var.b.a) != 0 && i24 != 5 && i24 != 4 && charSequence2.length() != 0) {
                if (charSequence2 instanceof Spannable) {
                    spannable = (Spannable) charSequence2;
                } else {
                    spannable = null;
                }
                spannable = spannable == null ? new SpannableString(charSequence2) : spannable;
                if (!ii2.B(spannable, g43.class)) {
                    spannable.setSpan(new Object(), spannable.length() - 1, spannable.length() - 1, 33);
                }
                charSequence2 = spannable;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        ds4 ds4Var = s47Var.b;
        nn6 nn6Var3 = s47Var.a;
        int i25 = ds4Var.a;
        int i26 = 3;
        if (i25 == 1) {
            i4 = 3;
        } else if (i25 == 2) {
            i4 = 4;
        } else if (i25 == 3) {
            i4 = 2;
        } else if (i25 != 5 && i25 == 6) {
            i4 = 1;
        } else {
            i4 = i3;
        }
        if (i25 == 4) {
            i5 = 1;
        } else {
            i5 = i3;
        }
        if (ds4Var.h == 2) {
            if (Build.VERSION.SDK_INT <= 32) {
                i6 = 2;
            } else {
                i6 = 4;
            }
        } else {
            i6 = i3;
        }
        int i27 = ds4Var.g;
        int i28 = i27 & 255;
        if (i28 != 1) {
            if (i28 == 2) {
                i7 = i27;
                i8 = i5;
                i9 = 1;
            } else if (i28 == 3) {
                i7 = i27;
                i8 = i5;
                i9 = 2;
            }
            i10 = (i7 >> 8) & 255;
            if (i10 != 1) {
                if (i10 == 2) {
                    i26 = 1;
                } else if (i10 == 3) {
                    i26 = 2;
                } else if (i10 == 4) {
                }
                i11 = (i7 >> 16) & 255;
                if (i11 == 1) {
                    i12 = 2;
                } else {
                    i12 = 2;
                    if (i11 == 2) {
                        nn6Var = nn6Var3;
                        i13 = i4;
                        i14 = 1;
                        if (i2 != i12) {
                            truncateAt2 = TextUtils.TruncateAt.END;
                        } else if (i2 == 5) {
                            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
                        } else if (i2 == 4) {
                            truncateAt2 = TextUtils.TruncateAt.START;
                        } else {
                            i15 = i6;
                            c = ' ';
                            nn6Var2 = nn6Var;
                            truncateAt = null;
                            a = a(i13, i8, truncateAt, i, i15, i9, i26, i14, charSequence3);
                            Layout layout2 = a.f;
                            i16 = i13;
                            if (Build.VERSION.SDK_INT < 35 || gjVar.g.getLetterSpacing() == RecyclerView.B1 || ((i2 != 4 && i2 != 5) || layout2.getEllipsisCount(0) <= 0)) {
                                i17 = 2;
                                cjVar = this;
                                i18 = i;
                                i19 = i16;
                            } else {
                                int ellipsisStart = layout2.getEllipsisStart(0);
                                i17 = 2;
                                CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                                cjVar = this;
                                i18 = i;
                                i19 = i16;
                                a = cjVar.a(i19, i8, truncateAt, i18, i15, i9, i26, i14, TextUtils.concat(charSequenceArr));
                            }
                            i20 = a.g;
                            if (i2 != i17 && a.a() > q21.g(j) && i18 > 1) {
                                int g2 = q21.g(j);
                                i22 = 0;
                                while (true) {
                                    if (i22 >= i20) {
                                        if (a.e(i22) > g2) {
                                            break;
                                        }
                                        i22++;
                                    } else {
                                        i22 = i20;
                                        break;
                                    }
                                }
                                if (i22 >= 0 && i22 != cjVar.b) {
                                    if (i22 >= 1) {
                                        i23 = 1;
                                    } else {
                                        i23 = i22;
                                    }
                                    a = cjVar.a(i19, i8, truncateAt, i23, i15, i9, i26, i14, cjVar.e);
                                }
                                cjVar.d = a;
                                cjVar.a.g.c(nn6Var2.a.c(), (Float.floatToRawIntBits(cjVar.b()) & 4294967295L) | (Float.floatToRawIntBits(cjVar.d()) << c), nn6Var2.a.a());
                                layout = cjVar.d.f;
                                if (layout.getText() instanceof Spanned) {
                                    CharSequence text = layout.getText();
                                    text.getClass();
                                    Spanned spanned = (Spanned) text;
                                    if (spanned.nextSpanTransition(-1, spanned.length(), yd6.class) != spanned.length()) {
                                        CharSequence text2 = layout.getText();
                                        text2.getClass();
                                        yd6VarArr = (yd6[]) ((Spanned) text2).getSpans(0, layout.getText().length(), yd6.class);
                                        if (yd6VarArr != null) {
                                            for (yd6 yd6Var : yd6VarArr) {
                                                yd6Var.L.setValue(new xi6((Float.floatToRawIntBits(cjVar.b()) & 4294967295L) | (Float.floatToRawIntBits(cjVar.d()) << c)));
                                            }
                                        }
                                        charSequence = cjVar.e;
                                        if (charSequence instanceof Spanned) {
                                            list = yt1.A;
                                        } else {
                                            Spanned spanned2 = (Spanned) charSequence;
                                            Object[] spans = spanned2.getSpans(0, charSequence.length(), ix4.class);
                                            ArrayList arrayList = new ArrayList(spans.length);
                                            for (Object obj : spans) {
                                                ix4 ix4Var = (ix4) obj;
                                                int spanStart = spanned2.getSpanStart(ix4Var);
                                                int spanEnd = spanned2.getSpanEnd(ix4Var);
                                                int lineForOffset = cjVar.d.f.getLineForOffset(spanStart);
                                                if (lineForOffset >= cjVar.b) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (cjVar.d.f.getEllipsisCount(lineForOffset) > 0 && spanEnd > cjVar.d.f.getEllipsisStart(lineForOffset) + cjVar.d.f.getLineStart(lineForOffset)) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (spanEnd > cjVar.d.f(lineForOffset)) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (!z2 && !z3 && !z) {
                                                    if (cjVar.d.f.getParagraphDirection(lineForOffset) == 1) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    boolean isRtlCharAt = cjVar.d.f.isRtlCharAt(spanStart);
                                                    if (z4 && !isRtlCharAt) {
                                                        i21 = cjVar.d.h(spanStart, false);
                                                        c2 = ix4Var.c();
                                                    } else {
                                                        if (z4 && isRtlCharAt) {
                                                            h = cjVar.d.i(spanStart, false);
                                                            c3 = ix4Var.c();
                                                        } else {
                                                            y37 y37Var = cjVar.d;
                                                            if (isRtlCharAt) {
                                                                h = y37Var.h(spanStart, false);
                                                                c3 = ix4Var.c();
                                                            } else {
                                                                i21 = y37Var.i(spanStart, false);
                                                                c2 = ix4Var.c();
                                                            }
                                                        }
                                                        i21 = h - c3;
                                                        y37 y37Var2 = cjVar.d;
                                                        switch (ix4Var.Z) {
                                                            case 0:
                                                                d = y37Var2.d(lineForOffset);
                                                                b = ix4Var.b();
                                                                g = d - b;
                                                                break;
                                                            case 1:
                                                                g = y37Var2.g(lineForOffset);
                                                                break;
                                                            case 2:
                                                                d = y37Var2.e(lineForOffset);
                                                                b = ix4Var.b();
                                                                g = d - b;
                                                                break;
                                                            case 3:
                                                                g = ((y37Var2.e(lineForOffset) + y37Var2.g(lineForOffset)) - ix4Var.b()) / 2.0f;
                                                                break;
                                                            case 4:
                                                                f = ix4Var.a().ascent;
                                                                d2 = y37Var2.d(lineForOffset);
                                                                g = d2 + f;
                                                                break;
                                                            case 5:
                                                                d = y37Var2.d(lineForOffset) + ix4Var.a().descent;
                                                                b = ix4Var.b();
                                                                g = d - b;
                                                                break;
                                                            case 6:
                                                                Paint.FontMetricsInt a2 = ix4Var.a();
                                                                f = ((a2.ascent + a2.descent) - ix4Var.b()) / 2;
                                                                d2 = y37Var2.d(lineForOffset);
                                                                g = d2 + f;
                                                                break;
                                                            default:
                                                                i.m("unexpected verticalAlignment");
                                                                throw null;
                                                        }
                                                        of5Var = new of5(i21, g, h, ix4Var.b() + g);
                                                    }
                                                    h = c2 + i21;
                                                    y37 y37Var22 = cjVar.d;
                                                    switch (ix4Var.Z) {
                                                    }
                                                    of5Var = new of5(i21, g, h, ix4Var.b() + g);
                                                } else {
                                                    of5Var = null;
                                                }
                                                arrayList.add(of5Var);
                                            }
                                            list = arrayList;
                                        }
                                        cjVar.f = list;
                                    }
                                }
                                yd6VarArr = null;
                                if (yd6VarArr != null) {
                                }
                                charSequence = cjVar.e;
                                if (charSequence instanceof Spanned) {
                                }
                                cjVar.f = list;
                            }
                            cjVar.d = a;
                            cjVar.a.g.c(nn6Var2.a.c(), (Float.floatToRawIntBits(cjVar.b()) & 4294967295L) | (Float.floatToRawIntBits(cjVar.d()) << c), nn6Var2.a.a());
                            layout = cjVar.d.f;
                            if (layout.getText() instanceof Spanned) {
                            }
                            yd6VarArr = null;
                            if (yd6VarArr != null) {
                            }
                            charSequence = cjVar.e;
                            if (charSequence instanceof Spanned) {
                            }
                            cjVar.f = list;
                        }
                        i15 = i6;
                        c = ' ';
                        nn6Var2 = nn6Var;
                        truncateAt = truncateAt2;
                        a = a(i13, i8, truncateAt, i, i15, i9, i26, i14, charSequence3);
                        Layout layout22 = a.f;
                        i16 = i13;
                        if (Build.VERSION.SDK_INT < 35) {
                        }
                        i17 = 2;
                        cjVar = this;
                        i18 = i;
                        i19 = i16;
                        i20 = a.g;
                        if (i2 != i17) {
                            int g22 = q21.g(j);
                            i22 = 0;
                            while (true) {
                                if (i22 >= i20) {
                                }
                                i22++;
                            }
                            if (i22 >= 0) {
                                if (i22 >= 1) {
                                }
                                a = cjVar.a(i19, i8, truncateAt, i23, i15, i9, i26, i14, cjVar.e);
                            }
                            cjVar.d = a;
                            cjVar.a.g.c(nn6Var2.a.c(), (Float.floatToRawIntBits(cjVar.b()) & 4294967295L) | (Float.floatToRawIntBits(cjVar.d()) << c), nn6Var2.a.a());
                            layout = cjVar.d.f;
                            if (layout.getText() instanceof Spanned) {
                            }
                            yd6VarArr = null;
                            if (yd6VarArr != null) {
                            }
                            charSequence = cjVar.e;
                            if (charSequence instanceof Spanned) {
                            }
                            cjVar.f = list;
                        }
                        cjVar.d = a;
                        cjVar.a.g.c(nn6Var2.a.c(), (Float.floatToRawIntBits(cjVar.b()) & 4294967295L) | (Float.floatToRawIntBits(cjVar.d()) << c), nn6Var2.a.a());
                        layout = cjVar.d.f;
                        if (layout.getText() instanceof Spanned) {
                        }
                        yd6VarArr = null;
                        if (yd6VarArr != null) {
                        }
                        charSequence = cjVar.e;
                        if (charSequence instanceof Spanned) {
                        }
                        cjVar.f = list;
                    }
                }
                nn6Var = nn6Var3;
                i13 = i4;
                i14 = i3;
                if (i2 != i12) {
                }
                i15 = i6;
                c = ' ';
                nn6Var2 = nn6Var;
                truncateAt = truncateAt2;
                a = a(i13, i8, truncateAt, i, i15, i9, i26, i14, charSequence3);
                Layout layout222 = a.f;
                i16 = i13;
                if (Build.VERSION.SDK_INT < 35) {
                }
                i17 = 2;
                cjVar = this;
                i18 = i;
                i19 = i16;
                i20 = a.g;
                if (i2 != i17) {
                }
                cjVar.d = a;
                cjVar.a.g.c(nn6Var2.a.c(), (Float.floatToRawIntBits(cjVar.b()) & 4294967295L) | (Float.floatToRawIntBits(cjVar.d()) << c), nn6Var2.a.a());
                layout = cjVar.d.f;
                if (layout.getText() instanceof Spanned) {
                }
                yd6VarArr = null;
                if (yd6VarArr != null) {
                }
                charSequence = cjVar.e;
                if (charSequence instanceof Spanned) {
                }
                cjVar.f = list;
            }
            i26 = i3;
            i11 = (i7 >> 16) & 255;
            if (i11 == 1) {
            }
            nn6Var = nn6Var3;
            i13 = i4;
            i14 = i3;
            if (i2 != i12) {
            }
            i15 = i6;
            c = ' ';
            nn6Var2 = nn6Var;
            truncateAt = truncateAt2;
            a = a(i13, i8, truncateAt, i, i15, i9, i26, i14, charSequence3);
            Layout layout2222 = a.f;
            i16 = i13;
            if (Build.VERSION.SDK_INT < 35) {
            }
            i17 = 2;
            cjVar = this;
            i18 = i;
            i19 = i16;
            i20 = a.g;
            if (i2 != i17) {
            }
            cjVar.d = a;
            cjVar.a.g.c(nn6Var2.a.c(), (Float.floatToRawIntBits(cjVar.b()) & 4294967295L) | (Float.floatToRawIntBits(cjVar.d()) << c), nn6Var2.a.a());
            layout = cjVar.d.f;
            if (layout.getText() instanceof Spanned) {
            }
            yd6VarArr = null;
            if (yd6VarArr != null) {
            }
            charSequence = cjVar.e;
            if (charSequence instanceof Spanned) {
            }
            cjVar.f = list;
        }
        i7 = i27;
        i8 = i5;
        i9 = i3;
        i10 = (i7 >> 8) & 255;
        if (i10 != 1) {
        }
        i26 = i3;
        i11 = (i7 >> 16) & 255;
        if (i11 == 1) {
        }
        nn6Var = nn6Var3;
        i13 = i4;
        i14 = i3;
        if (i2 != i12) {
        }
        i15 = i6;
        c = ' ';
        nn6Var2 = nn6Var;
        truncateAt = truncateAt2;
        a = a(i13, i8, truncateAt, i, i15, i9, i26, i14, charSequence3);
        Layout layout22222 = a.f;
        i16 = i13;
        if (Build.VERSION.SDK_INT < 35) {
        }
        i17 = 2;
        cjVar = this;
        i18 = i;
        i19 = i16;
        i20 = a.g;
        if (i2 != i17) {
        }
        cjVar.d = a;
        cjVar.a.g.c(nn6Var2.a.c(), (Float.floatToRawIntBits(cjVar.b()) & 4294967295L) | (Float.floatToRawIntBits(cjVar.d()) << c), nn6Var2.a.a());
        layout = cjVar.d.f;
        if (layout.getText() instanceof Spanned) {
        }
        yd6VarArr = null;
        if (yd6VarArr != null) {
        }
        charSequence = cjVar.e;
        if (charSequence instanceof Spanned) {
        }
        cjVar.f = list;
    }

    public final y37 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        boolean z;
        ux4 ux4Var;
        float d = d();
        gj gjVar = this.a;
        km kmVar = gjVar.g;
        int i8 = gjVar.l;
        dm3 dm3Var = gjVar.i;
        s47 s47Var = gjVar.b;
        dj djVar = ej.a;
        hy4 hy4Var = s47Var.c;
        if (hy4Var != null && (ux4Var = hy4Var.b) != null) {
            z = ux4Var.a;
        } else {
            z = false;
        }
        return new y37(charSequence, d, kmVar, i, truncateAt, i8, z, i3, i5, i6, i7, i4, i2, dm3Var);
    }

    public final float b() {
        return this.d.a();
    }

    /* JADX WARN: Type inference failed for: r10v26, types: [hi] */
    public final long c(of5 of5Var, int i, fa6 fa6Var) {
        boolean z;
        q96 st2Var;
        int i2;
        int[] iArr;
        SegmentFinder i3;
        RectF a0 = ej2.a0(of5Var);
        if (i != 0 && i == 1) {
            z = true;
        } else {
            z = false;
        }
        final z5 z5Var = new z5(fa6Var, 2);
        y37 y37Var = this.d;
        TextPaint textPaint = y37Var.a;
        Layout layout = y37Var.f;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            if (z) {
                i3 = new wp(new rr6(15, layout.getText(), y37Var.j()));
            } else {
                gi.l();
                i3 = gi.i(gi.h(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(a0, i3, new Layout.TextInclusionStrategy() { // from class: hi
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) z5.this.o(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            s9 c = y37Var.c();
            if (z) {
                st2Var = new rr6(15, layout.getText(), y37Var.j());
            } else {
                CharSequence text = layout.getText();
                if (i4 >= 29) {
                    st2Var = new rt2(text, textPaint);
                } else {
                    st2Var = new st2(text);
                }
            }
            q96 q96Var = st2Var;
            int lineForVertical = layout.getLineForVertical((int) a0.top);
            if (a0.top <= y37Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < y37Var.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) a0.bottom);
                if (lineForVertical2 != 0 || a0.bottom >= y37Var.g(0)) {
                    int U = np2.U(y37Var, layout, c, i5, a0, q96Var, z5Var, true);
                    while (true) {
                        i2 = i5;
                        if (U != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        U = np2.U(y37Var, layout, c, i5, a0, q96Var, z5Var, true);
                    }
                    if (U != -1) {
                        int i6 = lineForVertical2;
                        int U2 = np2.U(y37Var, layout, c, i6, a0, q96Var, z5Var, false);
                        while (U2 == -1 && i2 < i6) {
                            i6--;
                            U2 = np2.U(y37Var, layout, c, i6, a0, q96Var, z5Var, false);
                        }
                        if (U2 != -1) {
                            iArr = new int[]{q96Var.c(U + 1), q96Var.d(U2 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        if (iArr == null) {
            return k47.b;
        }
        return jx2.f(iArr[0], iArr[1]);
    }

    public final float d() {
        return q21.h(this.c);
    }

    public final void e(xj0 xj0Var) {
        Canvas a = xd.a(xj0Var);
        y37 y37Var = this.d;
        if (y37Var.d) {
            a.save();
            a.clipRect(RecyclerView.B1, RecyclerView.B1, d(), b());
        }
        int i = y37Var.h;
        if (a.getClipBounds(y37Var.p)) {
            if (i != 0) {
                a.translate(RecyclerView.B1, i);
            }
            ThreadLocal threadLocal = d47.a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new Canvas();
                threadLocal.set(obj);
            }
            yz6 yz6Var = (yz6) obj;
            yz6Var.a = a;
            try {
                y37Var.f.draw(yz6Var);
                if (i != 0) {
                    a.translate(RecyclerView.B1, (-1.0f) * i);
                }
            } finally {
                yz6Var.a = null;
            }
        }
        if (y37Var.d) {
            a.restore();
        }
    }

    public final void f(xj0 xj0Var, long j, ge6 ge6Var, b17 b17Var, oo1 oo1Var) {
        km kmVar = this.a.g;
        int i = kmVar.c;
        kmVar.d(j);
        kmVar.f(ge6Var);
        kmVar.g(b17Var);
        kmVar.e(oo1Var);
        kmVar.b(3);
        e(xj0Var);
        kmVar.b(i);
    }

    public final void g(xj0 xj0Var, f80 f80Var, float f, ge6 ge6Var, b17 b17Var, oo1 oo1Var) {
        km kmVar = this.a.g;
        int i = kmVar.c;
        float d = d();
        float b = b();
        kmVar.c(f80Var, (Float.floatToRawIntBits(b) & 4294967295L) | (Float.floatToRawIntBits(d) << 32), f);
        kmVar.f(ge6Var);
        kmVar.g(b17Var);
        kmVar.e(oo1Var);
        kmVar.b(3);
        e(xj0Var);
        kmVar.b(i);
    }
}
