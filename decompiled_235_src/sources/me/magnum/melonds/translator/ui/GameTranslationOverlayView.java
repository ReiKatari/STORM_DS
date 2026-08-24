package me.magnum.melonds.translator.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.common.MlKitException;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class GameTranslationOverlayView extends View {
    public final o41 A;
    public long A0;
    public final ArrayList B;
    public jp2 B0;
    public final RectF C0;
    public final RectF D0;
    public final RectF E0;
    public a F0;
    public int G0;
    public float H0;
    public float I0;
    public final RectF J0;
    public final RectF K0;
    public final ArrayList L;
    public final Paint L0;
    public final Paint M0;
    public final Paint N0;
    public final Paint O0;
    public final Paint P0;
    public final Paint Q0;
    public ya7 R;
    public final Paint R0;
    public final TextPaint S0;
    public final Paint T0;
    public final Paint U0;
    public final Paint V0;
    public final Paint W0;
    public final Paint X0;
    public final Paint Y0;
    public final Paint Z0;
    public final Paint a1;
    public final Paint b1;
    public final Paint c1;
    public float d0;
    public final Paint d1;
    public float e0;
    public final Paint e1;
    public boolean f0;
    public final Paint f1;
    public on2 g0;
    public final Paint g1;
    public qn2 h0;
    public final Paint h1;
    public on2 i0;
    public float i1;
    public qn2 j0;
    public final RectF j1;
    public qn2 k0;
    public final RectF k1;
    public boolean l0;
    public final RectF l1;
    public boolean m0;
    public final RectF m1;
    public float n0;
    public on2 n1;
    public float o0;
    public final n0 o1;
    public final float p0;
    public boolean q0;
    public float r0;
    public float s0;
    public boolean t0;
    public final Handler u0;
    public boolean v0;
    public boolean w0;
    public float x0;
    public float y0;
    public final RectF z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a NONE = new a("NONE", 0);
        public static final a DRAW_NEW = new a("DRAW_NEW", 1);
        public static final a MOVE_REGION = new a("MOVE_REGION", 2);
        public static final a RESIZE_REGION = new a("RESIZE_REGION", 3);

        private static final /* synthetic */ a[] $values() {
            return new a[]{NONE, DRAW_NEW, MOVE_REGION, RESIZE_REGION};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private a(String str, int i) {
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameTranslationOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        xe1 xe1Var = xk1.a;
        jv2 jv2Var = e04.a;
        gu6 c = oi2.c();
        jv2Var.getClass();
        this.A = g04.i(jw2.y(jv2Var, c));
        this.B = new ArrayList();
        this.L = new ArrayList();
        this.R = ya7.SMART_BACKGROUND_MATCH;
        this.d0 = 0.92f;
        this.e0 = 1.0f;
        this.l0 = true;
        this.n0 = 70.0f;
        this.o0 = 280.0f;
        this.p0 = 65.0f;
        this.u0 = new Handler(Looper.getMainLooper());
        this.z0 = new RectF();
        this.C0 = new RectF();
        this.D0 = new RectF();
        this.E0 = new RectF();
        this.F0 = a.NONE;
        this.G0 = -1;
        this.J0 = new RectF();
        this.K0 = new RectF();
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.L0 = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(2.5f);
        paint2.setColor(Color.parseColor("#4DFFFFFF"));
        this.M0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setColor(Color.parseColor("#80000000"));
        this.N0 = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setColor(Color.parseColor("#E60F172A"));
        this.O0 = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style);
        paint5.setColor(Color.parseColor("#4D00E5FF"));
        this.P0 = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(style2);
        paint6.setStrokeWidth(3.5f);
        paint6.setColor(Color.parseColor("#FF00E5FF"));
        this.Q0 = paint6;
        Paint paint7 = new Paint(1);
        paint7.setColor(Color.parseColor("#00E5FF"));
        Paint.Align align = Paint.Align.CENTER;
        paint7.setTextAlign(align);
        paint7.setTypeface(Typeface.create("sans-serif-medium", 1));
        paint7.setTextSize(28.0f);
        this.R0 = paint7;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 1));
        this.S0 = textPaint;
        Paint paint8 = new Paint(1);
        paint8.setStyle(style2);
        paint8.setStrokeWidth(6.0f);
        paint8.setColor(Color.parseColor("#00E5FF"));
        paint8.setStrokeCap(Paint.Cap.ROUND);
        this.T0 = paint8;
        Paint paint9 = new Paint(1);
        paint9.setStyle(style);
        paint9.setColor(Color.argb(55, 0, 229, 255));
        this.U0 = paint9;
        Paint paint10 = new Paint(1);
        paint10.setStyle(style2);
        paint10.setStrokeWidth(3.0f);
        paint10.setColor(Color.parseColor("#00E5FF"));
        paint10.setPathEffect(new DashPathEffect(new float[]{15.0f, 10.0f}, RecyclerView.B1));
        this.V0 = paint10;
        Paint paint11 = new Paint(1);
        paint11.setStyle(style);
        paint11.setColor(Color.parseColor("#E60F172A"));
        this.W0 = paint11;
        Paint paint12 = new Paint(1);
        paint12.setColor(Color.parseColor("#00E5FF"));
        paint12.setTypeface(Typeface.DEFAULT_BOLD);
        paint12.setTextSize(22.0f);
        paint12.setTextAlign(align);
        this.X0 = paint12;
        Paint paint13 = new Paint(1);
        paint13.setStyle(style);
        paint13.setColor(Color.argb(45, 0, 229, 255));
        this.Y0 = paint13;
        Paint paint14 = new Paint(1);
        paint14.setStyle(style2);
        paint14.setStrokeWidth(3.5f);
        paint14.setColor(Color.parseColor("#00E5FF"));
        this.Z0 = paint14;
        Paint paint15 = new Paint(1);
        paint15.setStyle(style);
        paint15.setColor(Color.parseColor("#00E5FF"));
        this.a1 = paint15;
        Paint paint16 = new Paint(1);
        paint16.setStyle(style);
        paint16.setColor(Color.parseColor("#E60F172A"));
        this.b1 = paint16;
        Paint paint17 = new Paint(1);
        paint17.setColor(Color.parseColor("#00E5FF"));
        paint17.setTypeface(Typeface.create("sans-serif-medium", 1));
        paint17.setTextSize(22.0f);
        this.c1 = paint17;
        Paint paint18 = new Paint(1);
        paint18.setStyle(style);
        paint18.setColor(Color.parseColor("#CCEF4444"));
        this.d1 = paint18;
        Paint paint19 = new Paint(1);
        paint19.setColor(-1);
        paint19.setTextAlign(align);
        paint19.setTypeface(Typeface.create("sans-serif-medium", 1));
        paint19.setTextSize(20.0f);
        this.e1 = paint19;
        Paint paint20 = new Paint(1);
        paint20.setStyle(style);
        paint20.setColor(Color.parseColor("#E60F172A"));
        this.f1 = paint20;
        Paint paint21 = new Paint(1);
        paint21.setStyle(style2);
        paint21.setStrokeWidth(2.0f);
        paint21.setColor(Color.parseColor("#8000E5FF"));
        this.g1 = paint21;
        Paint paint22 = new Paint(1);
        paint22.setColor(-1);
        paint22.setTextAlign(align);
        paint22.setTypeface(Typeface.create("sans-serif-medium", 1));
        paint22.setTextSize(24.0f);
        this.h1 = paint22;
        this.j1 = new RectF();
        this.k1 = new RectF();
        this.l1 = new RectF();
        this.m1 = new RectF();
        this.o1 = new n0(this, 28);
    }

    public final void a() {
        this.B.clear();
        this.B0 = null;
        setTranslating(false);
        invalidate();
    }

    public final void b(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, String str, String str2) {
        rectF.set(f, f2, f3 + f, f4 + f2);
        int parseColor = Color.parseColor(str2);
        int argb = Color.argb(45, Color.red(parseColor), Color.green(parseColor), Color.blue(parseColor));
        Paint paint = this.f1;
        paint.setColor(argb);
        Paint paint2 = this.g1;
        paint2.setColor(parseColor);
        paint2.setStrokeWidth(2.5f);
        Paint paint3 = this.h1;
        paint3.setColor(parseColor);
        canvas.drawRoundRect(rectF, 14.0f, 14.0f, paint);
        canvas.drawRoundRect(rectF, 14.0f, 14.0f, paint2);
        paint3.setTextSize(Math.max(25.0f, getContext().getResources().getDisplayMetrics().density * 14.5f));
        paint3.setTypeface(Typeface.DEFAULT_BOLD);
        float centerY = rectF.centerY();
        float descent = paint3.descent();
        canvas.drawText(str, rectF.centerX(), centerY - ((paint3.ascent() + descent) / 2.0f), paint3);
    }

    public final float getBubbleOpacity() {
        return this.d0;
    }

    public final List<ua7> getCustomRegions() {
        return this.L;
    }

    public final float getFontSizeScale() {
        return this.e0;
    }

    public final on2 getOnDismissRequested() {
        return this.i0;
    }

    public final on2 getOnFloatingButtonLongClickListener() {
        return this.n1;
    }

    public final qn2 getOnLassoRegionSelected() {
        return this.h0;
    }

    public final qn2 getOnRegionsSaved() {
        return this.j0;
    }

    public final qn2 getOnSpeakWordRequested() {
        return this.k0;
    }

    public final on2 getOnTriggerTranslationRequested() {
        return this.g0;
    }

    public final ya7 getOverlayStyle() {
        return this.R;
    }

    public final boolean getShowFloatingButton() {
        return this.l0;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04f9  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v34 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        jp2 jp2Var;
        String str;
        float f2;
        int i;
        boolean z;
        float f3;
        float f4;
        float f5;
        boolean z2;
        float max;
        float f6;
        float f7;
        float f8;
        float f9;
        float p;
        float f10;
        float f11;
        float f12;
        float max2;
        float f13;
        float f14;
        float f15;
        float f16;
        float p2;
        float f17;
        float f18;
        int i2;
        int max3;
        int max4;
        Layout.Alignment alignment;
        TextPaint textPaint;
        ?? r9;
        StaticLayout build;
        float f19;
        ?? r10;
        int argb;
        float f20;
        Paint paint;
        Canvas canvas2 = canvas;
        canvas2.getClass();
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width > RecyclerView.B1 && height > RecyclerView.B1) {
            boolean z3 = this.m0;
            String str2 = "✕";
            Paint paint2 = this.d1;
            Paint paint3 = this.N0;
            float f21 = 48.0f;
            float f22 = 22.0f;
            Paint paint4 = this.e1;
            float f23 = 14.0f;
            Paint paint5 = this.M0;
            Paint paint6 = this.Z0;
            Paint paint7 = this.L0;
            float f24 = 3.0f;
            float f25 = 10.0f;
            float f26 = 2.0f;
            if (z3) {
                canvas2.drawColor(Color.argb(125, 0, 0, 0));
                ArrayList arrayList = this.L;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    paint = this.Y0;
                    if (i3 >= size) {
                        break;
                    }
                    RectF rectF = ((ua7) arrayList.get(i3)).b;
                    ArrayList arrayList2 = arrayList;
                    float f27 = rectF.left * width;
                    float f28 = width;
                    float f29 = rectF.top * height;
                    float f30 = height;
                    float f31 = rectF.right * f28;
                    float f32 = rectF.bottom * f30;
                    int i4 = i3;
                    RectF rectF2 = new RectF(f27, f29, f31, f32);
                    canvas2.drawRoundRect(rectF2, 8.0f, 8.0f, paint);
                    canvas2.drawRoundRect(rectF2, 8.0f, 8.0f, paint6);
                    int i5 = i4 + 1;
                    String string = getContext().getString(R.string.translator_region_badge, Integer.valueOf(i5));
                    string.getClass();
                    Paint paint8 = this.c1;
                    RectF rectF3 = new RectF(f27, Math.max((float) RecyclerView.B1, (f29 - 34.0f) - 4.0f), f27 + paint8.measureText(string) + 20.0f, Math.max(34.0f, f29 - 4.0f));
                    canvas2.drawRoundRect(rectF3, 6.0f, 6.0f, this.b1);
                    canvas2.drawRoundRect(rectF3, 6.0f, 6.0f, paint6);
                    canvas2.drawText(string, rectF3.left + 10.0f, rectF3.bottom - 9.0f, paint8);
                    float f33 = f31 - 4.0f;
                    float f34 = f29 + 4.0f;
                    canvas2.drawCircle(f33, f34, 18.0f, paint2);
                    canvas2.drawText("✕", f33, f34 - ((paint4.ascent() + paint4.descent()) / 2.0f), paint4);
                    canvas2.drawRoundRect(new RectF(f31 - 22.0f, f32 - 22.0f, f31, f32), 4.0f, 4.0f, this.a1);
                    i3 = i5;
                    arrayList = arrayList2;
                    width = f28;
                    height = f30;
                    paint7 = paint7;
                    paint5 = paint5;
                    size = size;
                    paint3 = paint3;
                }
                Paint paint9 = paint7;
                float f35 = height;
                Paint paint10 = paint5;
                Paint paint11 = paint3;
                if (this.F0 == a.DRAW_NEW) {
                    RectF rectF4 = this.K0;
                    canvas2.drawRoundRect(rectF4, 8.0f, 8.0f, paint);
                    canvas2.drawRoundRect(rectF4, 8.0f, 8.0f, paint6);
                }
                float f36 = getContext().getResources().getDisplayMetrics().density;
                float max5 = Math.max(220.0f, 160.0f * f36);
                float max6 = Math.max(66.0f, f36 * 48.0f);
                float max7 = Math.max(16.0f, f36 * 12.0f);
                float max8 = Math.max(18.0f, f36 * 14.0f);
                float f37 = (max8 * 2.0f) + (max7 * 3.0f) + (max6 * 4.0f);
                float max9 = Math.max(24.0f, f36 * 16.0f);
                float max10 = Math.max(24.0f, (f35 - f37) / 2.0f);
                RectF rectF5 = new RectF(max9, max10, max9 + max5, f37 + max10);
                canvas2.drawRoundRect(rectF5, 20.0f, 20.0f, paint11);
                paint9.setColor(Color.parseColor("#E60F172A"));
                canvas2.drawRoundRect(rectF5, 20.0f, 20.0f, paint9);
                paint10.setColor(Color.parseColor("#4D00E5FF"));
                canvas2.drawRoundRect(rectF5, 20.0f, 20.0f, paint10);
                float f38 = max10 + max8;
                float f39 = max9 + 16.0f;
                float f40 = max5 - 32.0f;
                String string2 = getContext().getString(R.string.translator_add_region);
                string2.getClass();
                b(canvas2, this.j1, f39, f38, f40, max6, string2, "#00E5FF");
                float f41 = max7 + max6;
                float f42 = f38 + f41;
                String string3 = getContext().getString(R.string.translator_clear_regions);
                string3.getClass();
                b(canvas, this.k1, f39, f42, f40, max6, string3, "#FFAA00");
                float f43 = f42 + f41;
                String string4 = getContext().getString(R.string.translator_save_regions);
                string4.getClass();
                b(canvas, this.l1, f39, f43, f40, max6, string4, "#10B981");
                String string5 = getContext().getString(R.string.translator_close_regions);
                string5.getClass();
                b(canvas, this.m1, f39, f43 + f41, f40, max6, string5, "#EF4444");
                return;
            }
            ArrayList arrayList3 = this.B;
            int size2 = arrayList3.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj = arrayList3.get(i6);
                int i7 = i6 + 1;
                ta7 ta7Var = (ta7) obj;
                RectF rectF6 = ta7Var.c;
                float f44 = rectF6.left * width;
                float f45 = rectF6.top * height;
                ArrayList arrayList4 = arrayList3;
                float f46 = rectF6.right * width;
                float f47 = rectF6.bottom * height;
                String str3 = ta7Var.b;
                if (qs6.v0(str3)) {
                    str3 = ta7Var.a;
                }
                float f48 = f46 - f44;
                int i8 = size2;
                if (f48 <= width * 0.2f) {
                    f2 = 0.2f;
                    i = i7;
                    if (str3.length() <= 18 && (f45 <= height * 0.2f || f48 <= width * 0.16f)) {
                        z = false;
                        if (!z) {
                            f3 = 24.0f;
                        } else {
                            f3 = 12.0f;
                        }
                        if (!z) {
                            f4 = 12.0f;
                        } else {
                            f4 = 6.0f;
                        }
                        if (!z) {
                            f5 = 0.9f * width;
                        } else {
                            f5 = (f3 * f26) + f48;
                        }
                        z2 = z;
                        float f49 = f3;
                        max = Math.max((f3 * f26) + f48, f5);
                        f6 = width - 16.0f;
                        if (max > f6) {
                            max = f6;
                        }
                        if (!z2) {
                            float f50 = (width - max) / f26;
                            if (f50 < 8.0f) {
                                f50 = 8.0f;
                            }
                            f8 = max;
                            p = f50;
                            f7 = 8.0f;
                        } else {
                            f7 = 8.0f;
                            float f51 = f44 - f49;
                            float f52 = (width - max) - 8.0f;
                            if (f52 < 8.0f) {
                                f8 = max;
                                f9 = 8.0f;
                            } else {
                                f8 = max;
                                f9 = f52;
                            }
                            p = gi2.p(f51, 8.0f, f9);
                        }
                        f10 = p + f8;
                        f11 = width - f7;
                        if (f10 > f11) {
                            f10 = f11;
                        }
                        if (!z2) {
                            f12 = 92.0f;
                        } else {
                            f12 = (f4 * f26) + (f47 - f45);
                        }
                        max2 = Math.max((f4 * f26) + (f47 - f45), f12);
                        f13 = height - 16.0f;
                        if (max2 > f13) {
                            max2 = f13;
                        }
                        if (!z2) {
                            f15 = 8.0f;
                            float f53 = f45 - 8.0f;
                            float f54 = (height - max2) - 8.0f;
                            if (f54 < 8.0f) {
                                f14 = max2;
                                f20 = 8.0f;
                            } else {
                                f14 = max2;
                                f20 = f54;
                            }
                            p2 = gi2.p(f53, 8.0f, f20);
                        } else {
                            f14 = max2;
                            f15 = 8.0f;
                            float f55 = f45 - f4;
                            float f56 = (height - f14) - 8.0f;
                            if (f56 < 8.0f) {
                                f16 = 8.0f;
                            } else {
                                f16 = f56;
                            }
                            p2 = gi2.p(f55, 8.0f, f16);
                        }
                        f17 = p2 + f14;
                        f18 = height - f15;
                        if (f17 > f18) {
                            f17 = f18;
                        }
                        RectF rectF7 = new RectF(p, p2, f10, f17);
                        String str4 = str2;
                        float f57 = f23;
                        canvas2.drawRoundRect(new RectF(rectF7.left + f26, rectF7.top + f24, rectF7.right + f26, rectF7.bottom + f24), f57, f57, paint3);
                        int i9 = ta7Var.d;
                        int q = gi2.q((int) (gi2.p(this.d0, f2, 1.0f) * 255.0f), 60, 255);
                        Paint paint12 = paint4;
                        paint7.setColor(Color.argb(q, gi2.q((int) (Color.red(i9) * 0.93f), 0, 255), gi2.q((int) (Color.green(i9) * 0.93f), 0, 255), gi2.q((int) (Color.blue(i9) * 0.93f), 0, 255)));
                        canvas2.drawRoundRect(rectF7, 14.0f, 14.0f, paint7);
                        paint5.setColor(Color.argb(gi2.q((int) (q * 0.65f), 30, MlKitException.CODE_SCANNER_UNAVAILABLE), gi2.q((int) (Color.red(i9) * 1.15f), 0, 255), gi2.q((int) (Color.green(i9) * 1.15f), 0, 255), gi2.q((int) (Color.blue(i9) * 1.15f), 0, 255)));
                        paint5.setStrokeWidth(f26);
                        canvas2.drawRoundRect(rectF7, 14.0f, 14.0f, paint5);
                        i2 = ta7Var.e;
                        max3 = Math.max(20, (int) (rectF7.width() - 32.0f));
                        max4 = Math.max(20, (int) (rectF7.height() - 20.0f));
                        float p3 = gi2.p(rectF7.height() * 0.38f * this.e0, f22, f21);
                        if (qs6.k0(str3, ' ') && str3.length() < 15) {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                        textPaint = this.S0;
                        textPaint.setTextSize(p3);
                        textPaint.setColor(i2);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 1));
                        r9 = 0;
                        Paint paint13 = paint2;
                        build = StaticLayout.Builder.obtain(str3, 0, str3.length(), textPaint, max3).setAlignment(alignment).setLineSpacing(f24, 1.18f).setIncludePad(false).build();
                        build.getClass();
                        f19 = p3;
                        while (build.getHeight() > max4 && f19 > 16.0f) {
                            f19 -= 1.0f;
                            textPaint.setTextSize(f19);
                            build = StaticLayout.Builder.obtain(str3, r9, str3.length(), textPaint, max3).setAlignment(alignment).setLineSpacing(3.0f, 1.18f).setIncludePad(r9).build();
                            build.getClass();
                            max4 = max4;
                            r9 = 0;
                        }
                        float f58 = rectF7.left + 16.0f;
                        float max11 = Math.max(f25, (rectF7.height() - build.getHeight()) / 2.0f) + rectF7.top;
                        TextPaint textPaint2 = new TextPaint(textPaint);
                        textPaint2.setStyle(Paint.Style.STROKE);
                        textPaint2.setStrokeWidth(gi2.p(f19 * 0.16f, 2.5f, 6.0f));
                        textPaint2.setStrokeCap(Paint.Cap.ROUND);
                        textPaint2.setStrokeJoin(Paint.Join.ROUND);
                        if (Color.luminance(i2) <= 0.5f) {
                            r10 = 0;
                            argb = Color.argb(235, 0, 0, 0);
                        } else {
                            r10 = 0;
                            argb = Color.argb(235, 255, 255, 255);
                        }
                        textPaint2.setColor(argb);
                        StaticLayout build2 = StaticLayout.Builder.obtain(str3, r10, str3.length(), textPaint2, max3).setAlignment(alignment).setLineSpacing(3.0f, 1.18f).setIncludePad(r10).build();
                        build2.getClass();
                        canvas2.save();
                        canvas2.translate(f58, max11);
                        build2.draw(canvas2);
                        build.draw(canvas2);
                        canvas2.restore();
                        arrayList3 = arrayList4;
                        str2 = str4;
                        size2 = i8;
                        paint4 = paint12;
                        i6 = i;
                        paint2 = paint13;
                        f21 = 48.0f;
                        f22 = 22.0f;
                        f23 = 14.0f;
                        f24 = 3.0f;
                        f25 = 10.0f;
                        f26 = 2.0f;
                    }
                } else {
                    f2 = 0.2f;
                    i = i7;
                }
                z = true;
                if (!z) {
                }
                if (!z) {
                }
                if (!z) {
                }
                z2 = z;
                float f492 = f3;
                max = Math.max((f3 * f26) + f48, f5);
                f6 = width - 16.0f;
                if (max > f6) {
                }
                if (!z2) {
                }
                f10 = p + f8;
                f11 = width - f7;
                if (f10 > f11) {
                }
                if (!z2) {
                }
                max2 = Math.max((f4 * f26) + (f47 - f45), f12);
                f13 = height - 16.0f;
                if (max2 > f13) {
                }
                if (!z2) {
                }
                f17 = p2 + f14;
                f18 = height - f15;
                if (f17 > f18) {
                }
                RectF rectF72 = new RectF(p, p2, f10, f17);
                String str42 = str2;
                float f572 = f23;
                canvas2.drawRoundRect(new RectF(rectF72.left + f26, rectF72.top + f24, rectF72.right + f26, rectF72.bottom + f24), f572, f572, paint3);
                int i92 = ta7Var.d;
                int q2 = gi2.q((int) (gi2.p(this.d0, f2, 1.0f) * 255.0f), 60, 255);
                Paint paint122 = paint4;
                paint7.setColor(Color.argb(q2, gi2.q((int) (Color.red(i92) * 0.93f), 0, 255), gi2.q((int) (Color.green(i92) * 0.93f), 0, 255), gi2.q((int) (Color.blue(i92) * 0.93f), 0, 255)));
                canvas2.drawRoundRect(rectF72, 14.0f, 14.0f, paint7);
                paint5.setColor(Color.argb(gi2.q((int) (q2 * 0.65f), 30, MlKitException.CODE_SCANNER_UNAVAILABLE), gi2.q((int) (Color.red(i92) * 1.15f), 0, 255), gi2.q((int) (Color.green(i92) * 1.15f), 0, 255), gi2.q((int) (Color.blue(i92) * 1.15f), 0, 255)));
                paint5.setStrokeWidth(f26);
                canvas2.drawRoundRect(rectF72, 14.0f, 14.0f, paint5);
                i2 = ta7Var.e;
                max3 = Math.max(20, (int) (rectF72.width() - 32.0f));
                max4 = Math.max(20, (int) (rectF72.height() - 20.0f));
                float p32 = gi2.p(rectF72.height() * 0.38f * this.e0, f22, f21);
                if (qs6.k0(str3, ' ')) {
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
                textPaint = this.S0;
                textPaint.setTextSize(p32);
                textPaint.setColor(i2);
                textPaint.setTypeface(Typeface.create("sans-serif-medium", 1));
                r9 = 0;
                Paint paint132 = paint2;
                build = StaticLayout.Builder.obtain(str3, 0, str3.length(), textPaint, max3).setAlignment(alignment).setLineSpacing(f24, 1.18f).setIncludePad(false).build();
                build.getClass();
                f19 = p32;
                while (build.getHeight() > max4) {
                    f19 -= 1.0f;
                    textPaint.setTextSize(f19);
                    build = StaticLayout.Builder.obtain(str3, r9, str3.length(), textPaint, max3).setAlignment(alignment).setLineSpacing(3.0f, 1.18f).setIncludePad(r9).build();
                    build.getClass();
                    max4 = max4;
                    r9 = 0;
                }
                float f582 = rectF72.left + 16.0f;
                float max112 = Math.max(f25, (rectF72.height() - build.getHeight()) / 2.0f) + rectF72.top;
                TextPaint textPaint22 = new TextPaint(textPaint);
                textPaint22.setStyle(Paint.Style.STROKE);
                textPaint22.setStrokeWidth(gi2.p(f19 * 0.16f, 2.5f, 6.0f));
                textPaint22.setStrokeCap(Paint.Cap.ROUND);
                textPaint22.setStrokeJoin(Paint.Join.ROUND);
                if (Color.luminance(i2) <= 0.5f) {
                }
                textPaint22.setColor(argb);
                StaticLayout build22 = StaticLayout.Builder.obtain(str3, r10, str3.length(), textPaint22, max3).setAlignment(alignment).setLineSpacing(3.0f, 1.18f).setIncludePad(r10).build();
                build22.getClass();
                canvas2.save();
                canvas2.translate(f582, max112);
                build22.draw(canvas2);
                build.draw(canvas2);
                canvas2.restore();
                arrayList3 = arrayList4;
                str2 = str42;
                size2 = i8;
                paint4 = paint122;
                i6 = i;
                paint2 = paint132;
                f21 = 48.0f;
                f22 = 22.0f;
                f23 = 14.0f;
                f24 = 3.0f;
                f25 = 10.0f;
                f26 = 2.0f;
            }
            String str5 = str2;
            Paint paint14 = paint2;
            Paint paint15 = paint4;
            boolean z4 = this.v0;
            Paint paint16 = this.X0;
            Paint paint17 = this.W0;
            if (z4) {
                float min = Math.min(0.85f * width, 420.0f);
                RectF rectF8 = new RectF((width - min) / 2.0f, 24.0f, (width + min) / 2.0f, 68.0f);
                canvas2.drawRoundRect(rectF8, 12.0f, 12.0f, paint17);
                canvas2.drawRoundRect(rectF8, 12.0f, 12.0f, paint6);
                canvas2.drawText("👆 Выделите рамку пальцем на экране", rectF8.centerX(), rectF8.centerY() + 7.0f, paint16);
            }
            if (this.w0) {
                RectF rectF9 = this.z0;
                if (!rectF9.isEmpty()) {
                    canvas2.drawRoundRect(rectF9, 10.0f, 10.0f, this.U0);
                    canvas2.drawRoundRect(rectF9, 10.0f, 10.0f, this.V0);
                    f = 7.0f;
                    RectF rectF10 = new RectF(rectF9.centerX() - 100.0f, Math.max(8.0f, (rectF9.top - 36.0f) - 6.0f), rectF9.centerX() + 100.0f, Math.max(44.0f, rectF9.top - 6.0f));
                    canvas2.drawRoundRect(rectF10, 8.0f, 8.0f, paint17);
                    canvas2.drawRoundRect(rectF10, 8.0f, 8.0f, paint6);
                    canvas2.drawText("🔍 Перевести область", rectF10.centerX(), rectF10.centerY() + 7.0f, paint16);
                    jp2Var = this.B0;
                    if (jp2Var != null) {
                        float min2 = Math.min(0.92f * width, 540.0f);
                        float min3 = Math.min(0.7f * height, 380.0f);
                        float f59 = (width - min2) / 2.0f;
                        float f60 = (height - min3) / 2.0f;
                        RectF rectF11 = this.C0;
                        rectF11.set(f59, f60, min2 + f59, min3 + f60);
                        canvas2.drawColor(Color.argb(130, 0, 0, 0));
                        canvas2.drawRoundRect(new RectF(rectF11.left + 4.0f, rectF11.top + 6.0f, rectF11.right + 4.0f, rectF11.bottom + 6.0f), 18.0f, 18.0f, paint3);
                        paint7.setColor(Color.parseColor("#F20F172A"));
                        canvas2.drawRoundRect(rectF11, 18.0f, 18.0f, paint7);
                        paint5.setColor(Color.parseColor("#FF00E5FF"));
                        paint5.setStrokeWidth(3.0f);
                        canvas2.drawRoundRect(rectF11, 18.0f, 18.0f, paint5);
                        float f61 = rectF11.right;
                        float f62 = rectF11.top;
                        RectF rectF12 = this.D0;
                        rectF12.set(f61 - 44.0f, f62 + 12.0f, f61 - 12.0f, f62 + 44.0f);
                        canvas2.drawRoundRect(rectF12, 8.0f, 8.0f, paint14);
                        canvas2.drawText(str5, rectF12.centerX(), rectF12.centerY() + f, paint15);
                        TextPaint textPaint3 = new TextPaint(1);
                        textPaint3.setColor(Color.parseColor("#00E5FF"));
                        Typeface typeface = Typeface.DEFAULT_BOLD;
                        textPaint3.setTypeface(typeface);
                        textPaint3.setTextSize(24.0f);
                        canvas2.drawText("📖 Словарь & Разбор фразы", rectF11.left + 20.0f, rectF11.top + 34.0f, textPaint3);
                        float f63 = rectF11.top + 64.0f;
                        TextPaint textPaint4 = new TextPaint(1);
                        textPaint4.setColor(-1);
                        textPaint4.setTypeface(typeface);
                        float f64 = 28.0f;
                        textPaint4.setTextSize(28.0f);
                        canvas2.drawText(qs6.S0(45, jp2Var.a), rectF11.left + 20.0f, f63, textPaint4);
                        float f65 = f63 + 34.0f;
                        TextPaint textPaint5 = new TextPaint(1);
                        textPaint5.setColor(Color.parseColor("#94A3B8"));
                        textPaint5.setTypeface(Typeface.DEFAULT);
                        textPaint5.setTextSize(22.0f);
                        canvas2.drawText(qs6.S0(55, jp2Var.b), rectF11.left + 20.0f, f65, textPaint5);
                        float f66 = f65 + 36.0f;
                        Paint paint18 = new Paint();
                        paint18.setColor(Color.parseColor("#334155"));
                        paint18.setStrokeWidth(1.5f);
                        canvas2.drawLine(rectF11.left + 20.0f, f66, rectF11.right - 20.0f, f66, paint18);
                        canvas2 = canvas2;
                        float f67 = f66 + 24.0f;
                        for (kp2 kp2Var : gt0.e1(jp2Var.c, 3)) {
                            TextPaint textPaint6 = new TextPaint(1);
                            textPaint6.setColor(Color.parseColor("#38BDF8"));
                            textPaint6.setTypeface(Typeface.DEFAULT_BOLD);
                            textPaint6.setTextSize(22.0f);
                            TextPaint textPaint7 = new TextPaint(1);
                            textPaint7.setColor(Color.parseColor("#F59E0B"));
                            textPaint7.setTypeface(Typeface.DEFAULT);
                            textPaint7.setTextSize(18.0f);
                            if (!qs6.v0(kp2Var.c)) {
                                str = lb1.A(" [", kp2Var.c, "]");
                            } else {
                                str = "";
                            }
                            float f68 = f64;
                            canvas2.drawText(lb1.A("• ", kp2Var.a, str), rectF11.left + 20.0f, f67, textPaint6);
                            canvas2.drawText(lb1.A(" (", kp2Var.d, ")"), textPaint6.measureText("• " + kp2Var.a + str) + rectF11.left + 20.0f, f67, textPaint7);
                            f67 += f68;
                            f64 = f68;
                        }
                        float f69 = rectF11.left;
                        float f70 = rectF11.bottom;
                        RectF rectF13 = this.E0;
                        rectF13.set(f69 + 20.0f, f70 - 52.0f, f69 + 220.0f, f70 - 14.0f);
                        int parseColor = Color.parseColor("#10B981");
                        Paint paint19 = this.f1;
                        paint19.setColor(parseColor);
                        canvas2.drawRoundRect(rectF13, 10.0f, 10.0f, paint19);
                        Paint paint20 = this.h1;
                        paint20.setColor(-1);
                        paint20.setTextSize(20.0f);
                        canvas2.drawText("Озвучить ▶️", rectF13.centerX(), rectF13.centerY() + f, paint20);
                    }
                    if (this.f0) {
                        float f71 = width / 2.0f;
                        float f72 = height * 0.4f;
                        paint7.setColor(Color.parseColor("#CC0F172A"));
                        canvas2.drawCircle(f71, f72, 67.5f, paint7);
                        this.i1 = (this.i1 + 12.0f) % 360.0f;
                        canvas.drawArc(new RectF(f71 - 45.0f, f72 - 45.0f, f71 + 45.0f, f72 + 45.0f), this.i1, 260.0f, false, this.T0);
                        canvas2 = canvas;
                        postInvalidateDelayed(16L);
                    }
                    if (!this.l0) {
                        float f73 = this.n0;
                        float f74 = this.p0;
                        float f75 = f74 + 8.0f;
                        this.n0 = gi2.p(f73, f75, (width - f74) - 8.0f);
                        float p4 = gi2.p(this.o0, f75, (height - f74) - 8.0f);
                        this.o0 = p4;
                        canvas2.drawCircle(this.n0 + 2.0f, p4 + 3.0f, f74, paint3);
                        canvas2.drawCircle(this.n0, this.o0, f74 * 1.15f, this.P0);
                        canvas2.drawCircle(this.n0, this.o0, f74, this.O0);
                        canvas2.drawCircle(this.n0, this.o0, f74, this.Q0);
                        float f76 = this.o0;
                        Paint paint21 = this.R0;
                        canvas2.drawText("TR", this.n0, f76 - ((paint21.ascent() + paint21.descent()) / 2.0f), paint21);
                        return;
                    }
                    return;
                }
            }
            f = 7.0f;
            jp2Var = this.B0;
            if (jp2Var != null) {
            }
            if (this.f0) {
            }
            if (!this.l0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r5 != 3) goto L96;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        boolean z2;
        motionEvent.getClass();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float width = getWidth();
        float height = getHeight();
        boolean z3 = true;
        if (this.B0 != null) {
            if (motionEvent.getActionMasked() == 0) {
                if (this.D0.contains(x, y)) {
                    this.B0 = null;
                    invalidate();
                    return true;
                } else if (this.E0.contains(x, y)) {
                    qn2 qn2Var = this.k0;
                    if (qn2Var != null) {
                        jp2 jp2Var = this.B0;
                        jp2Var.getClass();
                        qn2Var.g(jp2Var.a);
                        return true;
                    }
                } else if (!this.C0.contains(x, y)) {
                    this.B0 = null;
                    invalidate();
                    return true;
                }
            }
        } else {
            int i2 = 0;
            if (this.m0) {
                int actionMasked = motionEvent.getActionMasked();
                RectF rectF = this.K0;
                RectF rectF2 = this.J0;
                ArrayList arrayList = this.L;
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            int i3 = me.magnum.melonds.translator.ui.a.a[this.F0.ordinal()];
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        int size = arrayList.size();
                                        int i4 = this.G0;
                                        if (i4 >= 0 && i4 < size) {
                                            float p = gi2.p(rectF2.right + ((x - this.H0) / width), rectF2.left + 0.05f, 1.0f);
                                            float p2 = gi2.p(rectF2.bottom + ((y - this.I0) / height), rectF2.top + 0.05f, 1.0f);
                                            int i5 = this.G0;
                                            arrayList.set(i5, ua7.a((ua7) arrayList.get(i5), new RectF(rectF2.left, rectF2.top, p, p2)));
                                            invalidate();
                                            return true;
                                        }
                                    }
                                } else {
                                    int size2 = arrayList.size();
                                    int i6 = this.G0;
                                    if (i6 >= 0 && i6 < size2) {
                                        float f = (x - this.H0) / width;
                                        float f2 = (y - this.I0) / height;
                                        float width2 = rectF2.width();
                                        float height2 = rectF2.height();
                                        float p3 = gi2.p(rectF2.left + f, RecyclerView.B1, 1.0f - width2);
                                        float p4 = gi2.p(rectF2.top + f2, RecyclerView.B1, 1.0f - height2);
                                        int i7 = this.G0;
                                        arrayList.set(i7, ua7.a((ua7) arrayList.get(i7), new RectF(p3, p4, width2 + p3, height2 + p4)));
                                        invalidate();
                                        return true;
                                    }
                                }
                            } else {
                                rectF.set(Math.min(this.H0, x), Math.min(this.I0, y), Math.max(this.H0, x), Math.max(this.I0, y));
                                invalidate();
                                return true;
                            }
                        }
                    }
                    if (this.F0 == a.DRAW_NEW && rectF.width() >= 40.0f && rectF.height() >= 40.0f) {
                        arrayList.add(new ua7(new RectF(rectF.left / width, rectF.top / height, rectF.right / width, rectF.bottom / height)));
                    }
                    this.F0 = a.NONE;
                    this.G0 = -1;
                    invalidate();
                    return true;
                } else if (this.j1.contains(x, y)) {
                    arrayList.add(new ua7(new RectF(0.1f, 0.55f, 0.90000004f, 0.83000004f)));
                    invalidate();
                    return true;
                } else if (this.k1.contains(x, y)) {
                    arrayList.clear();
                    invalidate();
                    return true;
                } else if (this.l1.contains(x, y)) {
                    qn2 qn2Var2 = this.j0;
                    if (qn2Var2 != null) {
                        qn2Var2.g(gt0.k1(arrayList));
                    }
                    setEditRegionsMode(false);
                    return true;
                } else if (this.m1.contains(x, y)) {
                    setEditRegionsMode(false);
                    return true;
                } else {
                    int size3 = arrayList.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i8 = size3 - 1;
                            RectF rectF3 = ((ua7) arrayList.get(size3)).b;
                            float f3 = rectF3.right * width;
                            float f4 = rectF3.top * height;
                            double d = x - f3;
                            z2 = z3;
                            float f5 = width;
                            float f6 = height;
                            if (((float) Math.hypot(d, y - f4)) <= 32.0f) {
                                arrayList.remove(size3);
                                invalidate();
                                return z2;
                            }
                            float f7 = rectF3.bottom * f6;
                            ArrayList arrayList2 = arrayList;
                            if (((float) Math.hypot(d, y - f7)) <= 36.0f) {
                                this.F0 = a.RESIZE_REGION;
                                this.G0 = size3;
                                this.H0 = x;
                                this.I0 = y;
                                rectF2.set(rectF3);
                                return z2;
                            } else if (new RectF(rectF3.left * f5, f4, f3, f7).contains(x, y)) {
                                this.F0 = a.MOVE_REGION;
                                this.G0 = size3;
                                this.H0 = x;
                                this.I0 = y;
                                rectF2.set(rectF3);
                                return z2;
                            } else if (i8 < 0) {
                                break;
                            } else {
                                size3 = i8;
                                z3 = z2;
                                width = f5;
                                height = f6;
                                arrayList = arrayList2;
                            }
                        }
                    } else {
                        z2 = true;
                    }
                    this.F0 = a.DRAW_NEW;
                    this.H0 = x;
                    this.I0 = y;
                    rectF.set(x, y, x, y);
                    invalidate();
                    return z2;
                }
            }
            if (this.v0) {
                int actionMasked2 = motionEvent.getActionMasked();
                RectF rectF4 = this.z0;
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 != 2) {
                            if (actionMasked2 != 3) {
                                i = 1;
                            }
                        } else {
                            rectF4.set(Math.min(this.x0, x), Math.min(this.y0, y), Math.max(this.x0, x), Math.max(this.y0, y));
                            invalidate();
                            return true;
                        }
                    }
                    setLassoModeActive(false);
                    this.w0 = false;
                    if (rectF4.width() >= 35.0f && rectF4.height() >= 35.0f) {
                        RectF rectF5 = new RectF(gi2.p(rectF4.left / width, RecyclerView.B1, 1.0f), gi2.p(rectF4.top / height, RecyclerView.B1, 1.0f), gi2.p(rectF4.right / width, RecyclerView.B1, 1.0f), gi2.p(rectF4.bottom / height, RecyclerView.B1, 1.0f));
                        rectF4.setEmpty();
                        invalidate();
                        qn2 qn2Var3 = this.h0;
                        if (qn2Var3 != null) {
                            qn2Var3.g(new ua7(rectF5));
                            return true;
                        }
                        return true;
                    }
                    rectF4.setEmpty();
                    invalidate();
                    return true;
                }
                this.w0 = true;
                this.x0 = x;
                this.y0 = y;
                rectF4.set(x, y, x, y);
                invalidate();
                return true;
            }
            i = 1;
            int actionMasked3 = motionEvent.getActionMasked();
            n0 n0Var = this.o1;
            Handler handler = this.u0;
            if (actionMasked3 != 0) {
                if (actionMasked3 != i) {
                    if (actionMasked3 != 2) {
                        if (actionMasked3 == 3) {
                            handler.removeCallbacks(n0Var);
                            this.q0 = false;
                            invalidate();
                            return false;
                        }
                    } else if (this.q0) {
                        if (((float) Math.hypot(x - this.r0, y - this.s0)) > 16.0f) {
                            this.t0 = true;
                            handler.removeCallbacks(n0Var);
                        }
                        this.n0 = x;
                        this.o0 = y;
                        invalidate();
                        return true;
                    }
                } else if (this.q0) {
                    handler.removeCallbacks(n0Var);
                    this.q0 = false;
                    if (!this.t0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - this.A0 <= 350) {
                            this.A0 = 0L;
                            z = true;
                            setLassoModeActive(true);
                            invalidate();
                        } else {
                            z = true;
                            this.A0 = currentTimeMillis;
                            on2 on2Var = this.g0;
                            if (on2Var != null) {
                                on2Var.c();
                            }
                        }
                    } else {
                        z = true;
                    }
                    invalidate();
                    return z;
                }
            } else {
                float hypot = (float) Math.hypot(x - this.n0, y - this.o0);
                if (this.l0 && hypot <= this.p0 + 15.0f) {
                    this.q0 = true;
                    this.t0 = false;
                    this.r0 = x;
                    this.s0 = y;
                    handler.postDelayed(n0Var, 500L);
                    return true;
                }
                ArrayList arrayList3 = this.B;
                if (!arrayList3.isEmpty()) {
                    int size4 = arrayList3.size();
                    while (i2 < size4) {
                        Object obj = arrayList3.get(i2);
                        i2++;
                        ta7 ta7Var = (ta7) obj;
                        RectF rectF6 = ta7Var.c;
                        if (new RectF((rectF6.left * width) - 10.0f, (rectF6.top * height) - 10.0f, (rectF6.right * width) + 10.0f, (rectF6.bottom * height) + 10.0f).contains(x, y)) {
                            hv.L(this.A, null, null, new xd1(ta7Var, this, null, 18), 3);
                            return true;
                        }
                    }
                    on2 on2Var2 = this.i0;
                    if (on2Var2 == null) {
                        return true;
                    }
                    on2Var2.c();
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void setBubbleOpacity(float f) {
        this.d0 = f;
    }

    public final void setEditRegionsMode(boolean z) {
        this.m0 = z;
        if (z) {
            this.B.clear();
            this.B0 = null;
        }
        invalidate();
    }

    public final void setFontSizeScale(float f) {
        this.e0 = f;
    }

    public final void setLassoModeActive(boolean z) {
        this.v0 = z;
        invalidate();
    }

    public final void setOnDismissRequested(on2 on2Var) {
        this.i0 = on2Var;
    }

    public final void setOnFloatingButtonLongClickListener(on2 on2Var) {
        this.n1 = on2Var;
    }

    public final void setOnLassoRegionSelected(qn2 qn2Var) {
        this.h0 = qn2Var;
    }

    public final void setOnRegionsSaved(qn2 qn2Var) {
        this.j0 = qn2Var;
    }

    public final void setOnSpeakWordRequested(qn2 qn2Var) {
        this.k0 = qn2Var;
    }

    public final void setOnTriggerTranslationRequested(on2 on2Var) {
        this.g0 = on2Var;
    }

    public final void setOverlayStyle(ya7 ya7Var) {
        ya7Var.getClass();
        this.R = ya7Var;
    }

    public final void setSavedRegions(List<ua7> list) {
        list.getClass();
        ArrayList arrayList = this.L;
        arrayList.clear();
        arrayList.addAll(list);
        invalidate();
    }

    public final void setShowFloatingButton(boolean z) {
        this.l0 = z;
        invalidate();
    }

    public final void setTranslatedBlocks(List<ta7> list) {
        list.getClass();
        ArrayList arrayList = this.B;
        arrayList.clear();
        arrayList.addAll(list);
        setTranslating(false);
        this.B0 = null;
        invalidate();
    }

    public final void setTranslating(boolean z) {
        this.f0 = z;
        invalidate();
    }
}
