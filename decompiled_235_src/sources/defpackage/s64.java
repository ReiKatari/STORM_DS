package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s64  reason: default package */
/* loaded from: classes.dex */
public final class s64 extends View implements r03 {
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
    public float j0;
    public float k0;
    public final LinkedHashMap l0;
    public final LinkedHashMap m0;
    public final LinkedHashSet n0;
    public final LinkedHashMap o0;
    public final Handler p0;

    public s64(Context context) {
        super(context, null, 0);
        n90.a(context);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(Color.parseColor("#26111318"));
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
        paint4.setStrokeWidth(4.0f);
        paint4.setColor(Color.parseColor("#99FFFFFF"));
        this.R = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style2);
        paint5.setStrokeWidth(4.0f);
        paint5.setColor(Color.parseColor("#99000000"));
        this.d0 = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStyle(style);
        paint6.setColor(Color.parseColor("#6600E5FF"));
        this.e0 = paint6;
        Paint paint7 = new Paint(1);
        paint7.setStyle(style2);
        paint7.setStrokeWidth(5.0f);
        paint7.setColor(Color.parseColor("#FF00E5FF"));
        this.f0 = paint7;
        Paint paint8 = new Paint(1);
        paint8.setColor(Color.parseColor("#F0F4F8"));
        Paint.Align align = Paint.Align.CENTER;
        paint8.setTextAlign(align);
        paint8.setTypeface(Typeface.create("sans-serif-medium", 1));
        this.g0 = paint8;
        Paint paint9 = new Paint(1);
        paint9.setColor(Color.parseColor("#B3000000"));
        paint9.setTextAlign(align);
        paint9.setTypeface(Typeface.create("sans-serif-medium", 1));
        this.h0 = paint9;
        Paint paint10 = new Paint(1);
        paint10.setStyle(style);
        paint10.setColor(Color.parseColor("#59000000"));
        this.i0 = paint10;
        this.j0 = 1.0f;
        this.k0 = 1.0f;
        this.l0 = new LinkedHashMap();
        this.m0 = new LinkedHashMap();
        this.n0 = new LinkedHashSet();
        this.o0 = new LinkedHashMap();
        this.p0 = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.r03
    public final void a(Set set) {
        float f;
        boolean z;
        Float valueOf = Float.valueOf((float) RecyclerView.B1);
        Float valueOf2 = Float.valueOf(1.0f);
        for (b63 b63Var : hf.c0(b63.X, b63.Y, b63.B, b63.A)) {
            boolean contains = set.contains(b63Var);
            LinkedHashMap linkedHashMap = this.l0;
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
            Handler handler = this.p0;
            LinkedHashMap linkedHashMap2 = this.o0;
            LinkedHashMap linkedHashMap3 = this.m0;
            if (contains) {
                if (!z) {
                    linkedHashMap.put(b63Var, Float.valueOf(0.88f));
                    linkedHashMap3.put(b63Var, valueOf2);
                    q64 q64Var = new q64(0, this, b63Var);
                    linkedHashMap2.put(b63Var, q64Var);
                    handler.postDelayed(q64Var, 3000L);
                }
            } else {
                LinkedHashSet linkedHashSet = this.n0;
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

    public final float getButtonInnerScale() {
        return this.k0;
    }

    public final float getButtonSpread() {
        return this.j0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        vr4 vr4Var;
        int i;
        int parseColor;
        int parseColor2;
        s64 s64Var = this;
        Canvas canvas2 = canvas;
        canvas2.getClass();
        super.onDraw(canvas);
        float width = s64Var.getWidth();
        float height = s64Var.getHeight();
        if (width > RecyclerView.B1 && height > RecyclerView.B1) {
            float min = Math.min(width, height);
            float f3 = width / 2.0f;
            float f4 = height / 2.0f;
            float f5 = 0.175f * min * s64Var.k0;
            float f6 = min * 0.285f * s64Var.j0;
            j90 j90Var = n90.a;
            Path path = new Path();
            float f7 = f4 - f6;
            float f8 = 0.7f * f5;
            path.moveTo(f3, f7 - f8);
            float f9 = f3 + f6;
            path.lineTo(f9 + f8, f4);
            float f10 = f4 + f6;
            path.lineTo(f3, f10 + f8);
            float f11 = f3 - f6;
            path.lineTo(f11 - f8, f4);
            path.close();
            int i2 = r64.a[j90Var.ordinal()];
            Paint paint = s64Var.A;
            Paint paint2 = s64Var.B;
            switch (i2) {
                case 1:
                    paint.setColor(Color.parseColor("#33E2E8F0"));
                    paint2.setColor(Color.parseColor("#4DE2E8F0"));
                    break;
                case 2:
                    paint.setColor(Color.parseColor("#33475569"));
                    paint2.setColor(Color.parseColor("#4D94A3B8"));
                    break;
                case 3:
                    paint.setColor(Color.parseColor("#332D0608"));
                    paint2.setColor(Color.parseColor("#4DE50914"));
                    break;
                case 4:
                    paint.setColor(Color.parseColor("#331F1738"));
                    paint2.setColor(Color.parseColor("#4DC084FC"));
                    break;
                case 5:
                    paint.setColor(Color.parseColor("#332A200B"));
                    paint2.setColor(Color.parseColor("#4DD4A017"));
                    break;
                case 6:
                    paint.setColor(Color.parseColor("#33052614"));
                    paint2.setColor(Color.parseColor("#4D00E676"));
                    break;
                case 7:
                    paint.setColor(Color.parseColor("#33FFFFFF"));
                    paint2.setColor(Color.parseColor("#6600D2FF"));
                    break;
                case 8:
                    paint.setColor(Color.parseColor("#331E222B"));
                    paint2.setColor(Color.parseColor("#4D38BDF8"));
                    break;
                case 9:
                    paint.setColor(Color.parseColor("#330F172A"));
                    paint2.setColor(Color.parseColor("#4DFF3B30"));
                    break;
                case 10:
                    paint.setColor(Color.parseColor("#26000000"));
                    paint2.setColor(Color.parseColor("#4DFFFFFF"));
                    break;
                case 11:
                    paint.setColor(Color.parseColor("#40000000"));
                    paint2.setColor(Color.parseColor("#66FF0033"));
                    break;
                case 12:
                    paint.setColor(Color.parseColor("#333C3B6E"));
                    paint2.setColor(Color.parseColor("#4D6C5CE7"));
                    break;
                case 13:
                    paint.setColor(Color.parseColor("#338E8E93"));
                    paint2.setColor(Color.parseColor("#4D5856D6"));
                    break;
                case 14:
                    paint.setColor(Color.parseColor("#334A69BD"));
                    paint2.setColor(Color.parseColor("#4D6A89CC"));
                    break;
                case 15:
                    paint.setColor(Color.parseColor("#33B8860B"));
                    paint2.setColor(Color.parseColor("#4DDAA520"));
                    break;
                case 16:
                    paint.setColor(Color.parseColor("#33004E64"));
                    paint2.setColor(Color.parseColor("#4D00A896"));
                    break;
                default:
                    paint.setColor(Color.parseColor("#26111318"));
                    paint2.setColor(Color.parseColor("#33FFFFFF"));
                    break;
            }
            canvas2.save();
            canvas2.translate(2.0f, 4.0f);
            Paint paint3 = s64Var.i0;
            canvas2.drawPath(path, paint3);
            canvas2.restore();
            canvas2.drawPath(path, paint);
            canvas2.drawPath(path, paint2);
            canvas2.drawCircle(f3, f4, f6, paint2);
            b63 b63Var = b63.X;
            vr4 vr4Var2 = new vr4(b63Var, new vr4(Float.valueOf(f3), Float.valueOf(f7)));
            b63 b63Var2 = b63.Y;
            vr4 vr4Var3 = new vr4(b63Var2, new vr4(Float.valueOf(f11), Float.valueOf(f4)));
            b63 b63Var3 = b63.B;
            vr4 vr4Var4 = new vr4(b63Var3, new vr4(Float.valueOf(f3), Float.valueOf(f10)));
            b63 b63Var4 = b63.A;
            Map m0 = c14.m0(vr4Var2, vr4Var3, vr4Var4, new vr4(b63Var4, new vr4(Float.valueOf(f9), Float.valueOf(f4))));
            Map m02 = c14.m0(new vr4(b63Var, "X"), new vr4(b63Var2, "Y"), new vr4(b63Var3, "B"), new vr4(b63Var4, "A"));
            float f12 = 0.95f * f5;
            Paint paint4 = s64Var.g0;
            paint4.setTextSize(f12);
            Paint paint5 = s64Var.h0;
            paint5.setTextSize(f12);
            Iterator it = m0.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                b63 b63Var5 = (b63) entry.getKey();
                vr4 vr4Var5 = (vr4) entry.getValue();
                float floatValue = ((Number) vr4Var5.A).floatValue();
                float floatValue2 = ((Number) vr4Var5.B).floatValue();
                Float f13 = (Float) s64Var.l0.get(b63Var5);
                if (f13 != null) {
                    f = f13.floatValue();
                } else {
                    f = 1.0f;
                }
                Float f14 = (Float) s64Var.m0.get(b63Var5);
                if (f14 != null) {
                    f2 = f14.floatValue();
                } else {
                    f2 = 0.0f;
                }
                canvas2.save();
                canvas2.scale(f, f, floatValue, floatValue2);
                float f15 = f2;
                canvas2.drawCircle(1.5f + floatValue, (0.16f * f5) + floatValue2 + 2.0f, f5 * 1.05f, paint3);
                int i3 = (f15 > RecyclerView.B1 ? 1 : (f15 == RecyclerView.B1 ? 0 : -1));
                if (i3 > 0) {
                    switch (r64.a[j90Var.ordinal()]) {
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
                            int i4 = r64.b[b63Var5.ordinal()];
                            if (i4 != 1 && i4 != 2) {
                                parseColor2 = Color.parseColor("#660AB9E6");
                                break;
                            } else {
                                parseColor2 = Color.parseColor("#66FF3E3E");
                                break;
                            }
                            break;
                        case 10:
                            parseColor2 = Color.parseColor("#6694A3B8");
                            break;
                        case 11:
                            parseColor2 = Color.parseColor("#80FF0033");
                            break;
                        case 12:
                            int i5 = r64.b[b63Var5.ordinal()];
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    parseColor2 = Color.parseColor("#66A4B0BE");
                                    break;
                                } else {
                                    parseColor2 = Color.parseColor("#66D63031");
                                    break;
                                }
                            } else {
                                parseColor2 = Color.parseColor("#6600B894");
                                break;
                            }
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
                        case 17:
                            int i6 = r64.b[b63Var5.ordinal()];
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        parseColor2 = Color.parseColor("#6655EFC4");
                                        break;
                                    } else {
                                        parseColor2 = Color.parseColor("#6674B9FF");
                                        break;
                                    }
                                } else {
                                    parseColor2 = Color.parseColor("#66FFEAA7");
                                    break;
                                }
                            } else {
                                parseColor2 = Color.parseColor("#66FF7675");
                                break;
                            }
                        case 18:
                            int i7 = r64.b[b63Var5.ordinal()];
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        parseColor2 = Color.parseColor("#6610B981");
                                        break;
                                    } else {
                                        parseColor2 = Color.parseColor("#66EF4444");
                                        break;
                                    }
                                } else {
                                    parseColor2 = Color.parseColor("#66FBBF24");
                                    break;
                                }
                            } else {
                                parseColor2 = Color.parseColor("#663B82F6");
                                break;
                            }
                        case 19:
                            int i8 = r64.b[b63Var5.ordinal()];
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    if (i8 != 3) {
                                        parseColor2 = Color.parseColor("#80FCD34D");
                                        break;
                                    } else {
                                        parseColor2 = Color.parseColor("#8038BDF8");
                                        break;
                                    }
                                } else {
                                    parseColor2 = Color.parseColor("#8034D399");
                                    break;
                                }
                            } else {
                                parseColor2 = Color.parseColor("#80FB7185");
                                break;
                            }
                        case 20:
                            int i9 = r64.b[b63Var5.ordinal()];
                            if (i9 != 1) {
                                if (i9 != 2) {
                                    if (i9 != 3) {
                                        parseColor2 = Color.parseColor("#80B026FF");
                                        break;
                                    } else {
                                        parseColor2 = Color.parseColor("#8000F0FF");
                                        break;
                                    }
                                } else {
                                    parseColor2 = Color.parseColor("#80FF003C");
                                    break;
                                }
                            } else {
                                parseColor2 = Color.parseColor("#80FCEE0A");
                                break;
                            }
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            int i10 = r64.b[b63Var5.ordinal()];
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        parseColor2 = Color.parseColor("#8038BDF8");
                                        break;
                                    } else {
                                        parseColor2 = Color.parseColor("#8006B6D4");
                                        break;
                                    }
                                } else {
                                    parseColor2 = Color.parseColor("#8014B8A6");
                                    break;
                                }
                            } else {
                                parseColor2 = Color.parseColor("#800EA5E9");
                                break;
                            }
                        case 22:
                            int i11 = r64.b[b63Var5.ordinal()];
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 != 3) {
                                        parseColor2 = Color.parseColor("#80FB7185");
                                        break;
                                    } else {
                                        parseColor2 = Color.parseColor("#80C084FC");
                                        break;
                                    }
                                } else {
                                    parseColor2 = Color.parseColor("#80F472B6");
                                    break;
                                }
                            } else {
                                parseColor2 = Color.parseColor("#80E11D48");
                                break;
                            }
                        case ConnectionResult.API_DISABLED /* 23 */:
                            int i12 = r64.b[b63Var5.ordinal()];
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    if (i12 != 3) {
                                        parseColor2 = Color.parseColor("#80FB923C");
                                        break;
                                    } else {
                                        parseColor2 = Color.parseColor("#80EA580C");
                                        break;
                                    }
                                } else {
                                    parseColor2 = Color.parseColor("#80F59E0B");
                                    break;
                                }
                            } else {
                                parseColor2 = Color.parseColor("#80D97706");
                                break;
                            }
                        default:
                            parseColor2 = Color.parseColor("#6600E5FF");
                            break;
                    }
                    Paint paint6 = s64Var.e0;
                    paint6.setColor(parseColor2);
                    paint6.setAlpha((int) (200.0f * f15));
                    canvas2.drawCircle(floatValue, floatValue2, 1.2f * f5, paint6);
                }
                int[] iArr = r64.a;
                switch (iArr[j90Var.ordinal()]) {
                    case 1:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#FFFFFF")), Integer.valueOf(Color.parseColor("#CBD5E1")));
                        break;
                    case 2:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#64748B")), Integer.valueOf(Color.parseColor("#334155")));
                        break;
                    case 3:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#DC2626")), Integer.valueOf(Color.parseColor("#5B090E")));
                        break;
                    case 4:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#9333EA")), Integer.valueOf(Color.parseColor("#3B0764")));
                        break;
                    case 5:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#D97706")), Integer.valueOf(Color.parseColor("#5C2B05")));
                        break;
                    case 6:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#059669")), Integer.valueOf(Color.parseColor("#022C22")));
                        break;
                    case 7:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#FFFFFF")), Integer.valueOf(Color.parseColor("#DDE3EA")));
                        break;
                    case 8:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#2C3240")), Integer.valueOf(Color.parseColor("#151922")));
                        break;
                    case 9:
                        int i13 = r64.b[b63Var5.ordinal()];
                        if (i13 != 1 && i13 != 2) {
                            vr4Var = new vr4(Integer.valueOf(Color.parseColor("#0AB9E6")), Integer.valueOf(Color.parseColor("#0284C7")));
                        } else {
                            vr4Var = new vr4(Integer.valueOf(Color.parseColor("#FF3E3E")), Integer.valueOf(Color.parseColor("#B91C1C")));
                        }
                        break;
                    case 10:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#F8FAFC")), Integer.valueOf(Color.parseColor("#CBD5E1")));
                        break;
                    case 11:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#2B0008")), Integer.valueOf(Color.parseColor("#0A0002")));
                        break;
                    case 12:
                        int i14 = r64.b[b63Var5.ordinal()];
                        if (i14 != 1) {
                            if (i14 != 2) {
                                vr4Var = new vr4(Integer.valueOf(Color.parseColor("#747D8C")), Integer.valueOf(Color.parseColor("#2F3542")));
                            } else {
                                vr4Var = new vr4(Integer.valueOf(Color.parseColor("#D63031")), Integer.valueOf(Color.parseColor("#740E10")));
                            }
                        } else {
                            vr4Var = new vr4(Integer.valueOf(Color.parseColor("#00B894")), Integer.valueOf(Color.parseColor("#006266")));
                        }
                        break;
                    case 13:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#801336")), Integer.valueOf(Color.parseColor("#4A0E17")));
                        break;
                    case 14:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#575FCF")), Integer.valueOf(Color.parseColor("#2C2C54")));
                        break;
                    case 15:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#8B0000")), Integer.valueOf(Color.parseColor("#4A0000")));
                        break;
                    case 16:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#00838F")), Integer.valueOf(Color.parseColor("#004D40")));
                        break;
                    case 17:
                        int i15 = r64.b[b63Var5.ordinal()];
                        if (i15 != 1) {
                            if (i15 != 2) {
                                if (i15 != 3) {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#059669")), Integer.valueOf(Color.parseColor("#064E3B")));
                                } else {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#2563EB")), Integer.valueOf(Color.parseColor("#1E3A8A")));
                                }
                            } else {
                                vr4Var = new vr4(Integer.valueOf(Color.parseColor("#F59E0B")), Integer.valueOf(Color.parseColor("#78350F")));
                            }
                        } else {
                            vr4Var = new vr4(Integer.valueOf(Color.parseColor("#DC2626")), Integer.valueOf(Color.parseColor("#7F1D1D")));
                        }
                        break;
                    case 18:
                        int i16 = r64.b[b63Var5.ordinal()];
                        if (i16 != 1) {
                            if (i16 != 2) {
                                if (i16 != 3) {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#059669")), Integer.valueOf(Color.parseColor("#064E3B")));
                                } else {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#DC2626")), Integer.valueOf(Color.parseColor("#7F1D1D")));
                                }
                            } else {
                                vr4Var = new vr4(Integer.valueOf(Color.parseColor("#D97706")), Integer.valueOf(Color.parseColor("#78350F")));
                            }
                        } else {
                            vr4Var = new vr4(Integer.valueOf(Color.parseColor("#2563EB")), Integer.valueOf(Color.parseColor("#1E3A8A")));
                        }
                        break;
                    case 19:
                        int i17 = r64.b[b63Var5.ordinal()];
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3) {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#FDE047")), Integer.valueOf(Color.parseColor("#D97706")));
                                } else {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#7DD3FC")), Integer.valueOf(Color.parseColor("#0284C7")));
                                }
                            } else {
                                vr4Var = new vr4(Integer.valueOf(Color.parseColor("#6EE7B7")), Integer.valueOf(Color.parseColor("#059669")));
                            }
                        } else {
                            vr4Var = new vr4(Integer.valueOf(Color.parseColor("#FDA4AF")), Integer.valueOf(Color.parseColor("#E11D48")));
                        }
                        break;
                    case 20:
                        int i18 = r64.b[b63Var5.ordinal()];
                        if (i18 != 1) {
                            if (i18 != 2) {
                                if (i18 != 3) {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#B026FF")), Integer.valueOf(Color.parseColor("#5A008A")));
                                } else {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#00F0FF")), Integer.valueOf(Color.parseColor("#007D85")));
                                }
                            } else {
                                vr4Var = new vr4(Integer.valueOf(Color.parseColor("#FF003C")), Integer.valueOf(Color.parseColor("#8A001F")));
                            }
                        } else {
                            vr4Var = new vr4(Integer.valueOf(Color.parseColor("#FCEE0A")), Integer.valueOf(Color.parseColor("#857E02")));
                        }
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        int i19 = r64.b[b63Var5.ordinal()];
                        if (i19 != 1) {
                            if (i19 != 2) {
                                if (i19 != 3) {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#E0F2FE")), Integer.valueOf(Color.parseColor("#0369A1")));
                                } else {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#A5F3FC")), Integer.valueOf(Color.parseColor("#0891B2")));
                                }
                            } else {
                                vr4Var = new vr4(Integer.valueOf(Color.parseColor("#99F6E4")), Integer.valueOf(Color.parseColor("#0D9488")));
                            }
                        } else {
                            vr4Var = new vr4(Integer.valueOf(Color.parseColor("#BAE6FD")), Integer.valueOf(Color.parseColor("#0284C7")));
                        }
                        break;
                    case 22:
                        int i20 = r64.b[b63Var5.ordinal()];
                        if (i20 != 1) {
                            if (i20 != 2) {
                                if (i20 != 3) {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#FBCFE8")), Integer.valueOf(Color.parseColor("#E11D48")));
                                } else {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#E879F9")), Integer.valueOf(Color.parseColor("#A21CAF")));
                                }
                            } else {
                                vr4Var = new vr4(Integer.valueOf(Color.parseColor("#F472B6")), Integer.valueOf(Color.parseColor("#DB2777")));
                            }
                        } else {
                            vr4Var = new vr4(Integer.valueOf(Color.parseColor("#FB7185")), Integer.valueOf(Color.parseColor("#BE123C")));
                        }
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        int i21 = r64.b[b63Var5.ordinal()];
                        if (i21 != 1) {
                            if (i21 != 2) {
                                if (i21 != 3) {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#FED7AA")), Integer.valueOf(Color.parseColor("#EA580C")));
                                } else {
                                    vr4Var = new vr4(Integer.valueOf(Color.parseColor("#FCA5A5")), Integer.valueOf(Color.parseColor("#DC2626")));
                                }
                            } else {
                                vr4Var = new vr4(Integer.valueOf(Color.parseColor("#FCD34D")), Integer.valueOf(Color.parseColor("#B45309")));
                            }
                        } else {
                            vr4Var = new vr4(Integer.valueOf(Color.parseColor("#FDE68A")), Integer.valueOf(Color.parseColor("#D97706")));
                        }
                        break;
                    default:
                        vr4Var = new vr4(Integer.valueOf(Color.parseColor("#334155")), Integer.valueOf(Color.parseColor("#0F172A")));
                        break;
                }
                int intValue = ((Number) vr4Var.A).intValue();
                int intValue2 = ((Number) vr4Var.B).intValue();
                float f16 = floatValue - (0.3f * f5);
                float f17 = floatValue2 - (0.35f * f5);
                float f18 = f5 * 1.35f;
                if (i3 > 0) {
                    i = intValue2;
                } else {
                    i = intValue;
                }
                RadialGradient radialGradient = new RadialGradient(f16, f17, f18, i, intValue2, Shader.TileMode.CLAMP);
                Paint paint7 = s64Var.L;
                paint7.setShader(radialGradient);
                canvas2.drawCircle(floatValue, floatValue2, f5, paint7);
                paint7.setShader(null);
                RectF rectF = new RectF(floatValue - f5, floatValue2 - f5, floatValue + f5, floatValue2 + f5);
                j90 j90Var2 = j90Var;
                Paint paint8 = paint3;
                Iterator it2 = it;
                canvas2 = canvas;
                canvas2.drawArc(rectF, 135.0f, 180.0f, false, s64Var.R);
                canvas2.drawArc(rectF, -45.0f, 180.0f, false, s64Var.d0);
                if (i3 > 0) {
                    switch (iArr[j90Var2.ordinal()]) {
                        case 1:
                            parseColor = Color.parseColor("#0284C7");
                            break;
                        case 2:
                            parseColor = Color.parseColor("#E2E8F0");
                            break;
                        case 3:
                            parseColor = Color.parseColor("#FF1744");
                            break;
                        case 4:
                            parseColor = Color.parseColor("#C084FC");
                            break;
                        case 5:
                            parseColor = Color.parseColor("#FFD700");
                            break;
                        case 6:
                            parseColor = Color.parseColor("#00E676");
                            break;
                        case 7:
                            parseColor = Color.parseColor("#00D2FF");
                            break;
                        case 8:
                            parseColor = Color.parseColor("#38BDF8");
                            break;
                        case 9:
                            int i22 = r64.b[b63Var5.ordinal()];
                            if (i22 != 1 && i22 != 2) {
                                parseColor = Color.parseColor("#0AB9E6");
                                break;
                            } else {
                                parseColor = Color.parseColor("#FF3E3E");
                                break;
                            }
                            break;
                        case 10:
                            parseColor = Color.parseColor("#FFFFFF");
                            break;
                        case 11:
                            parseColor = Color.parseColor("#FF0033");
                            break;
                        case 12:
                            int i23 = r64.b[b63Var5.ordinal()];
                            if (i23 != 1) {
                                if (i23 != 2) {
                                    parseColor = Color.parseColor("#A4B0BE");
                                    break;
                                } else {
                                    parseColor = Color.parseColor("#D63031");
                                    break;
                                }
                            } else {
                                parseColor = Color.parseColor("#00B894");
                                break;
                            }
                        case 13:
                            parseColor = Color.parseColor("#FF4081");
                            break;
                        case 14:
                            parseColor = Color.parseColor("#706FD3");
                            break;
                        case 15:
                            parseColor = Color.parseColor("#FFD700");
                            break;
                        case 16:
                            parseColor = Color.parseColor("#00D2D3");
                            break;
                        case 17:
                            int i24 = r64.b[b63Var5.ordinal()];
                            if (i24 != 1) {
                                if (i24 != 2) {
                                    if (i24 != 3) {
                                        parseColor = Color.parseColor("#34D399");
                                        break;
                                    } else {
                                        parseColor = Color.parseColor("#60A5FA");
                                        break;
                                    }
                                } else {
                                    parseColor = Color.parseColor("#FBBF24");
                                    break;
                                }
                            } else {
                                parseColor = Color.parseColor("#FF1744");
                                break;
                            }
                        case 18:
                            int i25 = r64.b[b63Var5.ordinal()];
                            if (i25 != 1) {
                                if (i25 != 2) {
                                    if (i25 != 3) {
                                        parseColor = Color.parseColor("#10B981");
                                        break;
                                    } else {
                                        parseColor = Color.parseColor("#EF4444");
                                        break;
                                    }
                                } else {
                                    parseColor = Color.parseColor("#FBBF24");
                                    break;
                                }
                            } else {
                                parseColor = Color.parseColor("#3B82F6");
                                break;
                            }
                        case 19:
                        case 22:
                            parseColor = Color.parseColor("#FB7185");
                            break;
                        case 20:
                            parseColor = Color.parseColor("#FCEE0A");
                            break;
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            parseColor = Color.parseColor("#38BDF8");
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            parseColor = Color.parseColor("#F59E0B");
                            break;
                        default:
                            parseColor = Color.parseColor("#00E5FF");
                            break;
                    }
                    Paint paint9 = s64Var.f0;
                    paint9.setColor(parseColor);
                    canvas2.drawCircle(floatValue, floatValue2, f5, paint9);
                }
                float ascent = floatValue2 - ((paint4.ascent() + paint4.descent()) / 2.0f);
                String str = (String) m02.get(b63Var5);
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                canvas2.drawText(str, floatValue, ascent + 2.0f, paint5);
                int i26 = -1;
                if (i3 > 0) {
                    int i27 = iArr[j90Var2.ordinal()];
                    if (i27 != 1 && i27 != 7) {
                        if (i27 != 10) {
                            if (i27 != 11) {
                                switch (i27) {
                                    case 15:
                                        i26 = Color.parseColor("#FFD700");
                                        break;
                                    case 16:
                                        i26 = Color.parseColor("#00FFFF");
                                        break;
                                    case 17:
                                    case 18:
                                        if (r64.b[b63Var5.ordinal()] == 2) {
                                            i26 = Color.parseColor("#0F172A");
                                            break;
                                        }
                                        break;
                                    case 19:
                                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                    case 22:
                                    case ConnectionResult.API_DISABLED /* 23 */:
                                        i26 = Color.parseColor("#0F172A");
                                        break;
                                    case 20:
                                        if (r64.b[b63Var5.ordinal()] == 1) {
                                            i26 = Color.parseColor("#0F172A");
                                            break;
                                        }
                                        break;
                                }
                            } else {
                                i26 = Color.parseColor("#FF0033");
                            }
                        } else {
                            i26 = Color.parseColor("#0F172A");
                        }
                    } else {
                        i26 = Color.parseColor("#0284C7");
                    }
                    paint4.setColor(i26);
                } else {
                    int i28 = iArr[j90Var2.ordinal()];
                    if (i28 != 1 && i28 != 7) {
                        if (i28 != 13) {
                            if (i28 != 10) {
                                if (i28 != 11) {
                                    switch (i28) {
                                        case 15:
                                            i26 = Color.parseColor("#FFD700");
                                            break;
                                        case 16:
                                            i26 = Color.parseColor("#00FFFF");
                                            break;
                                        case 17:
                                        case 18:
                                            if (r64.b[b63Var5.ordinal()] == 2) {
                                                i26 = Color.parseColor("#0F172A");
                                                break;
                                            }
                                            break;
                                        case 19:
                                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                        case 22:
                                        case ConnectionResult.API_DISABLED /* 23 */:
                                            i26 = Color.parseColor("#0F172A");
                                            break;
                                        case 20:
                                            if (r64.b[b63Var5.ordinal()] == 1) {
                                                i26 = Color.parseColor("#0F172A");
                                                break;
                                            }
                                            break;
                                    }
                                } else {
                                    i26 = Color.parseColor("#FF0033");
                                }
                            }
                        } else {
                            i26 = Color.parseColor("#F2C9D8");
                        }
                        paint4.setColor(i26);
                    }
                    i26 = Color.parseColor("#0F172A");
                    paint4.setColor(i26);
                }
                String str3 = (String) m02.get(b63Var5);
                if (str3 != null) {
                    str2 = str3;
                }
                canvas2.drawText(str2, floatValue, ascent, paint4);
                canvas2.restore();
                s64Var = this;
                paint3 = paint8;
                it = it2;
                j90Var = j90Var2;
            }
        }
    }

    public final void setButtonInnerScale(float f) {
        this.k0 = gi2.p(f, 0.6f, 1.4f);
        invalidate();
    }

    public final void setButtonSpread(float f) {
        this.j0 = gi2.p(f, 0.6f, 1.6f);
        invalidate();
    }
}
