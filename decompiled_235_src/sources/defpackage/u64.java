package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u64  reason: default package */
/* loaded from: classes.dex */
public final class u64 extends View implements r03 {
    public final Paint A;
    public final Paint B;
    public final Paint L;
    public final Paint R;
    public final Paint d0;
    public final Paint e0;
    public final Paint f0;
    public final Paint g0;
    public final Paint h0;
    public final Paint i0;
    public final List j0;
    public final LinkedHashMap k0;
    public final LinkedHashMap l0;
    public final LinkedHashSet m0;
    public final LinkedHashMap n0;
    public final Handler o0;

    public u64(Context context) {
        super(context, null, 0);
        n90.a(context);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(Color.parseColor("#330F1117"));
        this.A = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(3.0f);
        paint2.setColor(Color.parseColor("#33FFFFFF"));
        this.B = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setColor(Color.parseColor("#E6232730"));
        this.L = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style2);
        paint4.setStrokeWidth(3.5f);
        paint4.setColor(Color.parseColor("#80FFFFFF"));
        this.R = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style2);
        paint5.setStrokeWidth(3.5f);
        paint5.setColor(Color.parseColor("#80000000"));
        Paint paint6 = new Paint(1);
        paint6.setStyle(style);
        paint6.setColor(Color.parseColor("#59000000"));
        this.d0 = paint6;
        Paint paint7 = new Paint(1);
        paint7.setStyle(style);
        paint7.setColor(Color.parseColor("#CC1A1C22"));
        this.e0 = paint7;
        Paint paint8 = new Paint(1);
        paint8.setStyle(style2);
        paint8.setStrokeWidth(2.5f);
        paint8.setColor(Color.parseColor("#4DFFFFFF"));
        this.f0 = paint8;
        Paint paint9 = new Paint(1);
        paint9.setStyle(style);
        paint9.setColor(Color.parseColor("#6600E5FF"));
        this.g0 = paint9;
        Paint paint10 = new Paint(1);
        paint10.setStyle(style2);
        paint10.setStrokeWidth(5.0f);
        paint10.setColor(Color.parseColor("#FF00E5FF"));
        Paint paint11 = new Paint(1);
        paint11.setStyle(style);
        paint11.setColor(Color.parseColor("#F0F4F8"));
        this.h0 = paint11;
        Paint paint12 = new Paint(1);
        paint12.setStyle(style);
        paint12.setColor(Color.parseColor("#80000000"));
        this.i0 = paint12;
        List<b63> c0 = hf.c0(b63.UP, b63.LEFT, b63.DOWN, b63.RIGHT);
        this.j0 = c0;
        this.k0 = new LinkedHashMap();
        this.l0 = new LinkedHashMap();
        new LinkedHashMap();
        this.m0 = new LinkedHashSet();
        this.n0 = new LinkedHashMap();
        this.o0 = new Handler(Looper.getMainLooper());
        for (b63 b63Var : c0) {
            this.k0.put(b63Var, Float.valueOf(1.0f));
            this.l0.put(b63Var, Float.valueOf((float) RecyclerView.B1));
        }
    }

    @Override // defpackage.r03
    public final void a(Set set) {
        float f;
        boolean z;
        Float valueOf = Float.valueOf((float) RecyclerView.B1);
        Float valueOf2 = Float.valueOf(1.0f);
        for (b63 b63Var : this.j0) {
            boolean contains = set.contains(b63Var);
            LinkedHashMap linkedHashMap = this.k0;
            Float f2 = (Float) linkedHashMap.get(b63Var);
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                f = 1.0f;
            }
            if (f < 0.95f) {
                z = true;
            } else {
                z = false;
            }
            Handler handler = this.o0;
            LinkedHashMap linkedHashMap2 = this.n0;
            LinkedHashMap linkedHashMap3 = this.l0;
            if (contains) {
                if (!z) {
                    linkedHashMap.put(b63Var, Float.valueOf(0.9f));
                    linkedHashMap3.put(b63Var, valueOf2);
                    q64 q64Var = new q64(1, this, b63Var);
                    linkedHashMap2.put(b63Var, q64Var);
                    handler.postDelayed(q64Var, 3000L);
                }
            } else {
                LinkedHashSet linkedHashSet = this.m0;
                if (z) {
                    Runnable runnable = (Runnable) linkedHashMap2.remove(b63Var);
                    if (runnable != null) {
                        handler.removeCallbacks(runnable);
                    }
                    if (linkedHashSet.contains(b63Var)) {
                        linkedHashSet.remove(b63Var);
                        linkedHashMap.put(b63Var, valueOf2);
                        linkedHashMap3.put(b63Var, valueOf);
                    } else {
                        linkedHashMap.put(b63Var, valueOf2);
                        linkedHashMap3.put(b63Var, valueOf);
                    }
                } else if (linkedHashSet.contains(b63Var)) {
                    linkedHashMap.put(b63Var, valueOf2);
                    linkedHashMap3.put(b63Var, valueOf2);
                } else {
                    linkedHashMap.put(b63Var, valueOf2);
                    linkedHashMap3.put(b63Var, valueOf);
                }
            }
        }
        invalidate();
    }

    public final void b(Canvas canvas, float f, float f2, float f3, float f4) {
        canvas.save();
        canvas.rotate(f4, f, f2);
        Path path = new Path();
        path.moveTo(f, f2 - f3);
        float f5 = 0.85f * f3;
        float f6 = (0.6f * f3) + f2;
        path.lineTo(f + f5, f6);
        path.lineTo(f, (f3 * 0.2f) + f2);
        path.lineTo(f - f5, f6);
        path.close();
        canvas.drawPath(path, this.i0);
        canvas.drawPath(path, this.h0);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int parseColor;
        float f;
        float f2;
        float f3;
        int parseColor2;
        RectF rectF;
        canvas.getClass();
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width > RecyclerView.B1 && height > RecyclerView.B1) {
            float min = Math.min(width, height);
            float f4 = width / 2.0f;
            float f5 = height / 2.0f;
            float f6 = 0.32f * min;
            float f7 = 0.46f * min;
            float f8 = 0.06f * min;
            j90 j90Var = n90.a;
            int i = t64.a[j90Var.ordinal()];
            Paint paint = this.B;
            Paint paint2 = this.A;
            Paint paint3 = this.e0;
            Paint paint4 = this.R;
            Paint paint5 = this.L;
            switch (i) {
                case 1:
                    paint5.setColor(Color.parseColor("#F2FFFFFF"));
                    paint4.setColor(Color.parseColor("#80CBD5E1"));
                    paint3.setColor(Color.parseColor("#E2E8F0"));
                    paint2.setColor(Color.parseColor("#33E2E8F0"));
                    paint.setColor(Color.parseColor("#4DE2E8F0"));
                    break;
                case 2:
                    paint5.setColor(Color.parseColor("#E65A6577"));
                    paint4.setColor(Color.parseColor("#80D1D5DB"));
                    paint3.setColor(Color.parseColor("#CC475569"));
                    paint2.setColor(Color.parseColor("#33475569"));
                    paint.setColor(Color.parseColor("#4D94A3B8"));
                    break;
                case 3:
                    paint5.setColor(Color.parseColor("#E68F0E17"));
                    paint4.setColor(Color.parseColor("#80FF2A37"));
                    paint3.setColor(Color.parseColor("#CC5C060D"));
                    paint2.setColor(Color.parseColor("#332D0608"));
                    paint.setColor(Color.parseColor("#4DE50914"));
                    break;
                case 4:
                    paint5.setColor(Color.parseColor("#E6491979"));
                    paint4.setColor(Color.parseColor("#80C084FC"));
                    paint3.setColor(Color.parseColor("#CC2D0B4E"));
                    paint2.setColor(Color.parseColor("#331F1738"));
                    paint.setColor(Color.parseColor("#4DC084FC"));
                    break;
                case 5:
                    paint5.setColor(Color.parseColor("#E6B45309"));
                    paint4.setColor(Color.parseColor("#80FBBF24"));
                    paint3.setColor(Color.parseColor("#CC78350F"));
                    paint2.setColor(Color.parseColor("#332A200B"));
                    paint.setColor(Color.parseColor("#4DD4A017"));
                    break;
                case 6:
                    paint5.setColor(Color.parseColor("#E6047857"));
                    paint4.setColor(Color.parseColor("#8034D399"));
                    paint3.setColor(Color.parseColor("#CC064E3B"));
                    paint2.setColor(Color.parseColor("#33052614"));
                    paint.setColor(Color.parseColor("#4D00E676"));
                    break;
                case 7:
                    paint5.setColor(Color.parseColor("#F2FFFFFF"));
                    paint4.setColor(Color.parseColor("#80CBD5E1"));
                    paint3.setColor(Color.parseColor("#E2E8F0"));
                    paint2.setColor(Color.parseColor("#33FFFFFF"));
                    paint.setColor(Color.parseColor("#6600D2FF"));
                    break;
                case 8:
                    paint5.setColor(Color.parseColor("#E61E222B"));
                    paint4.setColor(Color.parseColor("#80475569"));
                    paint3.setColor(Color.parseColor("#CC111318"));
                    paint2.setColor(Color.parseColor("#331E222B"));
                    paint.setColor(Color.parseColor("#4D38BDF8"));
                    break;
                case 9:
                case 10:
                    paint5.setColor(Color.parseColor("#E61E293B"));
                    paint4.setColor(Color.parseColor("#8064748B"));
                    paint3.setColor(Color.parseColor("#CC0F172A"));
                    paint2.setColor(Color.parseColor("#330F172A"));
                    paint.setColor(Color.parseColor("#4D38BDF8"));
                    break;
                case 11:
                    paint5.setColor(Color.parseColor("#E61A0005"));
                    paint4.setColor(Color.parseColor("#80FF0033"));
                    paint3.setColor(Color.parseColor("#CC0A0002"));
                    paint2.setColor(Color.parseColor("#40000000"));
                    paint.setColor(Color.parseColor("#66FF0033"));
                    break;
                case 12:
                    paint5.setColor(Color.parseColor("#E63C3B6E"));
                    paint4.setColor(Color.parseColor("#806C5CE7"));
                    paint3.setColor(Color.parseColor("#CC2A2952"));
                    paint2.setColor(Color.parseColor("#333C3B6E"));
                    paint.setColor(Color.parseColor("#4D6C5CE7"));
                    break;
                case 13:
                    paint5.setColor(Color.parseColor("#E65A5A66"));
                    paint4.setColor(Color.parseColor("#808E8E93"));
                    paint3.setColor(Color.parseColor("#CC3A3A44"));
                    paint2.setColor(Color.parseColor("#338E8E93"));
                    paint.setColor(Color.parseColor("#4D5856D6"));
                    break;
                case 14:
                    paint5.setColor(Color.parseColor("#E64A69BD"));
                    paint4.setColor(Color.parseColor("#80706FD3"));
                    paint3.setColor(Color.parseColor("#CC2C2C54"));
                    paint2.setColor(Color.parseColor("#334A69BD"));
                    paint.setColor(Color.parseColor("#4D6A89CC"));
                    break;
                case 15:
                    paint5.setColor(Color.parseColor("#E68B0000"));
                    paint4.setColor(Color.parseColor("#80FFD700"));
                    paint3.setColor(Color.parseColor("#CC4A0000"));
                    paint2.setColor(Color.parseColor("#33B8860B"));
                    paint.setColor(Color.parseColor("#4DDAA520"));
                    break;
                case 16:
                    paint5.setColor(Color.parseColor("#E6004D40"));
                    paint4.setColor(Color.parseColor("#8000D2D3"));
                    paint3.setColor(Color.parseColor("#CC002B24"));
                    paint2.setColor(Color.parseColor("#33004E64"));
                    paint.setColor(Color.parseColor("#4D00A896"));
                    break;
                default:
                    paint5.setColor(Color.parseColor("#E6232730"));
                    paint4.setColor(Color.parseColor("#66FFFFFF"));
                    paint3.setColor(Color.parseColor("#CC1A1C22"));
                    paint2.setColor(Color.parseColor("#330F1117"));
                    paint.setColor(Color.parseColor("#33FFFFFF"));
                    break;
            }
            float f9 = 1.05f * f7;
            canvas.drawCircle(f4, f5, f9, paint2);
            canvas.drawCircle(f4, f5, f9, paint);
            float f10 = f6 / 2.0f;
            Path path = new Path();
            float f11 = f4 - f10;
            float f12 = f11 + f8;
            float f13 = f5 - f7;
            path.moveTo(f12, f13);
            float f14 = f4 + f10;
            float f15 = f14 - f8;
            path.lineTo(f15, f13);
            float f16 = f13 + f8;
            path.quadTo(f14, f13, f14, f16);
            float f17 = f5 - f10;
            path.lineTo(f14, f17);
            float f18 = f4 + f7;
            float f19 = f18 - f8;
            path.lineTo(f19, f17);
            float f20 = f17 + f8;
            path.quadTo(f18, f17, f18, f20);
            float f21 = f8;
            float f22 = f5 + f10;
            float f23 = f22 - f21;
            path.lineTo(f18, f23);
            path.quadTo(f18, f22, f19, f22);
            path.lineTo(f14, f22);
            float f24 = f5 + f7;
            float f25 = f18;
            float f26 = f24 - f21;
            path.lineTo(f14, f26);
            path.quadTo(f14, f24, f15, f24);
            path.lineTo(f12, f24);
            path.quadTo(f11, f24, f11, f26);
            path.lineTo(f11, f22);
            float f27 = f4 - f7;
            float f28 = f27 + f21;
            path.lineTo(f28, f22);
            path.quadTo(f27, f22, f27, f23);
            path.lineTo(f27, f20);
            path.quadTo(f27, f17, f28, f17);
            path.lineTo(f11, f17);
            path.lineTo(f11, f16);
            path.quadTo(f11, f13, f12, f13);
            path.close();
            canvas.save();
            canvas.translate(2.5f, 4.5f);
            canvas.drawPath(path, this.d0);
            canvas.restore();
            canvas.drawPath(path, paint5);
            canvas.drawPath(path, paint4);
            for (b63 b63Var : this.j0) {
                Float f29 = (Float) this.l0.get(b63Var);
                if (f29 != null) {
                    f = f29.floatValue();
                } else {
                    f = 0.0f;
                }
                if (f > RecyclerView.B1) {
                    switch (t64.a[j90Var.ordinal()]) {
                        case 1:
                            parseColor2 = Color.parseColor("#6638BDF8");
                            break;
                        case 2:
                            parseColor2 = Color.parseColor("#6694A3B8");
                            break;
                        case 3:
                            parseColor2 = Color.parseColor("#66FF1744");
                            break;
                        case 4:
                            parseColor2 = Color.parseColor("#66C084FC");
                            break;
                        case 5:
                            parseColor2 = Color.parseColor("#66FFD700");
                            break;
                        case 6:
                            parseColor2 = Color.parseColor("#6600E676");
                            break;
                        case 7:
                            parseColor2 = Color.parseColor("#6600D2FF");
                            break;
                        case 8:
                            parseColor2 = Color.parseColor("#6638BDF8");
                            break;
                        case 9:
                            int i2 = t64.b[b63Var.ordinal()];
                            if (i2 != 1 && i2 != 2) {
                                parseColor2 = Color.parseColor("#660AB9E6");
                                break;
                            } else {
                                parseColor2 = Color.parseColor("#66FF3E3E");
                                break;
                            }
                        case 10:
                            parseColor2 = Color.parseColor("#6694A3B8");
                            break;
                        case 11:
                            parseColor2 = Color.parseColor("#80FF0033");
                            break;
                        case 12:
                            parseColor2 = Color.parseColor("#666C5CE7");
                            break;
                        case 13:
                            parseColor2 = Color.parseColor("#66C70039");
                            break;
                        case 14:
                            parseColor2 = Color.parseColor("#66706FD3");
                            break;
                        case 15:
                            parseColor2 = Color.parseColor("#66FFD700");
                            break;
                        case 16:
                            parseColor2 = Color.parseColor("#6600D2D3");
                            break;
                        default:
                            parseColor2 = Color.parseColor("#6600E5FF");
                            break;
                    }
                    Paint paint6 = this.g0;
                    paint6.setColor(parseColor2);
                    paint6.setAlpha((int) (f * 180.0f));
                    int i3 = t64.b[b63Var.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    rectF = null;
                                } else {
                                    rectF = new RectF(f27, f17, f11, f22);
                                }
                            } else {
                                rectF = new RectF(f11, f13, f14, f17);
                            }
                        } else {
                            rectF = new RectF(f11, f22, f14, f24);
                        }
                        f3 = f25;
                    } else {
                        f3 = f25;
                        rectF = new RectF(f14, f17, f3, f22);
                    }
                    f2 = f21;
                    if (rectF != null) {
                        canvas.drawRoundRect(rectF, f2, f2, paint6);
                    }
                } else {
                    f2 = f21;
                    f3 = f25;
                }
                f25 = f3;
                f21 = f2;
            }
            float f30 = min * 0.13f;
            canvas.drawCircle(f4, f5, f30, paint3);
            canvas.drawCircle(f4, f5, f30, this.f0);
            float f31 = ((f7 + f10) / 2.0f) * 0.95f;
            float f32 = min * 0.055f;
            int i4 = t64.a[j90Var.ordinal()];
            if (i4 != 1 && i4 != 7) {
                if (i4 != 11) {
                    if (i4 != 15) {
                        if (i4 != 16) {
                            parseColor = Color.parseColor("#F0F4F8");
                        } else {
                            parseColor = Color.parseColor("#00FFFF");
                        }
                    } else {
                        parseColor = Color.parseColor("#FFD700");
                    }
                } else {
                    parseColor = Color.parseColor("#FF0033");
                }
            } else {
                parseColor = Color.parseColor("#0F172A");
            }
            this.h0.setColor(parseColor);
            b(canvas, f4, f5 - f31, f32, RecyclerView.B1);
            b(canvas, f4 + f31, f5, f32, 90.0f);
            b(canvas, f4, f5 + f31, f32, 180.0f);
            b(canvas, f4 - f31, f5, f32, 270.0f);
        }
    }
}
