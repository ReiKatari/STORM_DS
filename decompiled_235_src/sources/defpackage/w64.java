package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w64  reason: default package */
/* loaded from: classes.dex */
public final class w64 extends View implements r03 {
    public final nj3 A;
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
    public boolean l0;
    public boolean m0;
    public rk3 n0;
    public final Handler o0;

    public w64(Context context, nj3 nj3Var) {
        super(context, null, 0);
        this.A = nj3Var;
        n90.a(context);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(Color.parseColor("#E6232730"));
        this.B = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(3.0f);
        paint2.setColor(Color.parseColor("#66FFFFFF"));
        this.L = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setColor(Color.parseColor("#59000000"));
        this.R = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setColor(Color.parseColor("#6600E5FF"));
        this.d0 = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(style2);
        paint5.setStrokeWidth(4.5f);
        paint5.setColor(Color.parseColor("#FF00E5FF"));
        this.e0 = paint5;
        Paint paint6 = new Paint(1);
        Paint.Style style3 = Paint.Style.FILL_AND_STROKE;
        paint6.setStyle(style3);
        paint6.setStrokeWidth(3.0f);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint6.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint6.setStrokeJoin(join);
        paint6.setColor(Color.parseColor("#F0F4F8"));
        this.f0 = paint6;
        Paint paint7 = new Paint(1);
        paint7.setStyle(style3);
        paint7.setStrokeWidth(3.0f);
        paint7.setStrokeCap(cap);
        paint7.setStrokeJoin(join);
        paint7.setColor(Color.parseColor("#99000000"));
        this.g0 = paint7;
        Paint paint8 = new Paint(1);
        paint8.setColor(Color.parseColor("#F0F4F8"));
        Paint.Align align = Paint.Align.CENTER;
        paint8.setTextAlign(align);
        paint8.setTypeface(Typeface.create("sans-serif-medium", 1));
        this.h0 = paint8;
        Paint paint9 = new Paint(1);
        paint9.setColor(Color.parseColor("#99000000"));
        paint9.setTextAlign(align);
        paint9.setTypeface(Typeface.create("sans-serif-medium", 1));
        this.i0 = paint9;
        this.j0 = 1.0f;
        this.l0 = true;
        this.o0 = new Handler(Looper.getMainLooper());
    }

    private final String getLabel() {
        int i;
        nj3 nj3Var = this.A;
        if (nj3Var == null) {
            i = -1;
        } else {
            i = v64.a[nj3Var.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "";
                    }
                    return "SELECT";
                }
                return "START";
            }
            return "R";
        }
        return "L";
    }

    @Override // defpackage.r03
    public final void a(Set set) {
        boolean z;
        boolean isEmpty = set.isEmpty();
        if (this.j0 < 0.95f) {
            z = true;
        } else {
            z = false;
        }
        Handler handler = this.o0;
        if (!isEmpty) {
            if (!z) {
                this.j0 = 0.86f;
                this.k0 = 1.0f;
                rk3 rk3Var = new rk3(this, 4);
                this.n0 = rk3Var;
                handler.postDelayed(rk3Var, 3000L);
            }
        } else if (z) {
            rk3 rk3Var2 = this.n0;
            if (rk3Var2 != null) {
                handler.removeCallbacks(rk3Var2);
            }
            this.n0 = null;
            if (this.m0) {
                this.m0 = false;
                this.j0 = 1.0f;
                this.k0 = RecyclerView.B1;
            } else {
                this.j0 = 1.0f;
                this.k0 = RecyclerView.B1;
            }
        } else if (this.m0) {
            this.j0 = 1.0f;
            this.k0 = 1.0f;
        } else {
            this.j0 = 1.0f;
            this.k0 = RecyclerView.B1;
        }
        invalidate();
    }

    public final void b(Canvas canvas, float f, float f2, String str, float f3, float f4, j90 j90Var) {
        Paint paint = this.h0;
        paint.setTextSize(f3);
        float measureText = paint.measureText(str);
        if (measureText > f4 && f4 > RecyclerView.B1) {
            paint.setTextSize((f4 / measureText) * f3);
        }
        float textSize = paint.getTextSize();
        Paint paint2 = this.i0;
        paint2.setTextSize(textSize);
        float ascent = f2 - ((paint.ascent() + paint.descent()) / 2.0f);
        canvas.drawText(str, f, 1.5f + ascent, paint2);
        int i = -1;
        if (this.k0 > RecyclerView.B1) {
            int i2 = v64.b[j90Var.ordinal()];
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (i2 != 7) {
                                    if (i2 != 10) {
                                        if (i2 != 11) {
                                            if (i2 != 15) {
                                                if (i2 == 16) {
                                                    i = Color.parseColor("#00FFFF");
                                                }
                                            } else {
                                                i = Color.parseColor("#FFD700");
                                            }
                                        } else {
                                            i = Color.parseColor("#FF0033");
                                        }
                                    } else {
                                        i = Color.parseColor("#0F172A");
                                    }
                                }
                            } else {
                                i = Color.parseColor("#00E676");
                            }
                        } else {
                            i = Color.parseColor("#FFD700");
                        }
                    } else {
                        i = Color.parseColor("#C084FC");
                    }
                } else {
                    i = Color.parseColor("#FF1744");
                }
                paint.setColor(i);
            }
            i = Color.parseColor("#0284C7");
            paint.setColor(i);
        } else {
            int i3 = v64.b[j90Var.ordinal()];
            if (i3 != 1 && i3 != 7) {
                if (i3 != 13) {
                    if (i3 != 10) {
                        if (i3 != 11) {
                            if (i3 != 15) {
                                if (i3 == 16) {
                                    i = Color.parseColor("#00FFFF");
                                }
                            } else {
                                i = Color.parseColor("#FFD700");
                            }
                        } else {
                            i = Color.parseColor("#FF0033");
                        }
                    }
                } else {
                    i = Color.parseColor("#F2C9D8");
                }
                paint.setColor(i);
            }
            i = Color.parseColor("#0F172A");
            paint.setColor(i);
        }
        canvas.drawText(str, f, ascent, paint);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int parseColor;
        int parseColor2;
        int parseColor3;
        int parseColor4;
        int parseColor5;
        boolean z;
        boolean z2;
        Canvas canvas2;
        int parseColor6;
        String str;
        int parseColor7;
        Canvas canvas3 = canvas;
        canvas3.getClass();
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width > RecyclerView.B1 && height > RecyclerView.B1) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            canvas3.save();
            float f3 = this.j0;
            canvas3.scale(f3, f3, f, f2);
            RectF rectF = new RectF(4.0f, 4.0f, width - 4.0f, height - 4.0f);
            j90 j90Var = n90.a;
            int[] iArr = v64.b;
            switch (iArr[j90Var.ordinal()]) {
                case 1:
                    parseColor = Color.parseColor("#F2FFFFFF");
                    break;
                case 2:
                    parseColor = Color.parseColor("#E65A6577");
                    break;
                case 3:
                    parseColor = Color.parseColor("#E68F0E17");
                    break;
                case 4:
                    parseColor = Color.parseColor("#E6491979");
                    break;
                case 5:
                    parseColor = Color.parseColor("#E6B45309");
                    break;
                case 6:
                    parseColor = Color.parseColor("#E6047857");
                    break;
                case 7:
                    parseColor = Color.parseColor("#F2FFFFFF");
                    break;
                case 8:
                    parseColor = Color.parseColor("#E61E222B");
                    break;
                case 9:
                case 10:
                    parseColor = Color.parseColor("#E61E293B");
                    break;
                case 11:
                    parseColor = Color.parseColor("#E61A0005");
                    break;
                case 12:
                    parseColor = Color.parseColor("#E63C3B6E");
                    break;
                case 13:
                    parseColor = Color.parseColor("#E6801336");
                    break;
                case 14:
                    parseColor = Color.parseColor("#E6575FCF");
                    break;
                case 15:
                    parseColor = Color.parseColor("#E68B0000");
                    break;
                case 16:
                    parseColor = Color.parseColor("#E6006266");
                    break;
                default:
                    parseColor = Color.parseColor("#E6232730");
                    break;
            }
            switch (iArr[j90Var.ordinal()]) {
                case 1:
                    parseColor2 = Color.parseColor("#E6E2E8F0");
                    break;
                case 2:
                    parseColor2 = Color.parseColor("#E6374151");
                    break;
                case 3:
                    parseColor2 = Color.parseColor("#E65C060D");
                    break;
                case 4:
                    parseColor2 = Color.parseColor("#E62D0B4E");
                    break;
                case 5:
                    parseColor2 = Color.parseColor("#E678350F");
                    break;
                case 6:
                    parseColor2 = Color.parseColor("#E6064E3B");
                    break;
                case 7:
                    parseColor2 = Color.parseColor("#E6DDE3EA");
                    break;
                case 8:
                    parseColor2 = Color.parseColor("#E6111318");
                    break;
                case 9:
                case 10:
                    parseColor2 = Color.parseColor("#E60F172A");
                    break;
                case 11:
                    parseColor2 = Color.parseColor("#E60A0002");
                    break;
                case 12:
                    parseColor2 = Color.parseColor("#E62A2952");
                    break;
                case 13:
                    parseColor2 = Color.parseColor("#E64A0E17");
                    break;
                case 14:
                    parseColor2 = Color.parseColor("#E62C2C54");
                    break;
                case 15:
                    parseColor2 = Color.parseColor("#E64A0000");
                    break;
                case 16:
                    parseColor2 = Color.parseColor("#E6002B36");
                    break;
                default:
                    parseColor2 = Color.parseColor("#E61A3A4D");
                    break;
            }
            switch (iArr[j90Var.ordinal()]) {
                case 1:
                    parseColor3 = Color.parseColor("#80CBD5E1");
                    break;
                case 2:
                    parseColor3 = Color.parseColor("#80D1D5DB");
                    break;
                case 3:
                    parseColor3 = Color.parseColor("#80E50914");
                    break;
                case 4:
                    parseColor3 = Color.parseColor("#80C084FC");
                    break;
                case 5:
                    parseColor3 = Color.parseColor("#80F59E0B");
                    break;
                case 6:
                    parseColor3 = Color.parseColor("#8010B981");
                    break;
                case 7:
                    parseColor3 = Color.parseColor("#80CBD5E1");
                    break;
                case 8:
                    parseColor3 = Color.parseColor("#80475569");
                    break;
                case 9:
                    parseColor3 = Color.parseColor("#80FF3B30");
                    break;
                case 10:
                    parseColor3 = Color.parseColor("#80FFFFFF");
                    break;
                case 11:
                    parseColor3 = Color.parseColor("#80FF0033");
                    break;
                case 12:
                    parseColor3 = Color.parseColor("#806C5CE7");
                    break;
                case 13:
                    parseColor3 = Color.parseColor("#805856D6");
                    break;
                case 14:
                    parseColor3 = Color.parseColor("#80706FD3");
                    break;
                case 15:
                    parseColor3 = Color.parseColor("#80FFD700");
                    break;
                case 16:
                    parseColor3 = Color.parseColor("#8000D2D3");
                    break;
                default:
                    parseColor3 = Color.parseColor("#66FFFFFF");
                    break;
            }
            switch (iArr[j90Var.ordinal()]) {
                case 1:
                    parseColor4 = Color.parseColor("#6638BDF8");
                    break;
                case 2:
                    parseColor4 = Color.parseColor("#6694A3B8");
                    break;
                case 3:
                    parseColor4 = Color.parseColor("#66FF1744");
                    break;
                case 4:
                    parseColor4 = Color.parseColor("#66C084FC");
                    break;
                case 5:
                    parseColor4 = Color.parseColor("#66FFD700");
                    break;
                case 6:
                    parseColor4 = Color.parseColor("#6600E676");
                    break;
                case 7:
                    parseColor4 = Color.parseColor("#6600D2FF");
                    break;
                case 8:
                    parseColor4 = Color.parseColor("#6638BDF8");
                    break;
                case 9:
                    parseColor4 = Color.parseColor("#66FF3E3E");
                    break;
                case 10:
                    parseColor4 = Color.parseColor("#6694A3B8");
                    break;
                case 11:
                    parseColor4 = Color.parseColor("#80FF0033");
                    break;
                case 12:
                    parseColor4 = Color.parseColor("#666C5CE7");
                    break;
                case 13:
                    parseColor4 = Color.parseColor("#66C70039");
                    break;
                case 14:
                    parseColor4 = Color.parseColor("#66706FD3");
                    break;
                case 15:
                    parseColor4 = Color.parseColor("#66FFD700");
                    break;
                case 16:
                    parseColor4 = Color.parseColor("#6600D2D3");
                    break;
                default:
                    parseColor4 = Color.parseColor("#6600E5FF");
                    break;
            }
            switch (iArr[j90Var.ordinal()]) {
                case 1:
                    parseColor5 = Color.parseColor("#0284C7");
                    break;
                case 2:
                    parseColor5 = Color.parseColor("#CBD5E1");
                    break;
                case 3:
                    parseColor5 = Color.parseColor("#FF1744");
                    break;
                case 4:
                    parseColor5 = Color.parseColor("#C084FC");
                    break;
                case 5:
                    parseColor5 = Color.parseColor("#FFD700");
                    break;
                case 6:
                    parseColor5 = Color.parseColor("#00E676");
                    break;
                case 7:
                    parseColor5 = Color.parseColor("#00D2FF");
                    break;
                case 8:
                    parseColor5 = Color.parseColor("#38BDF8");
                    break;
                case 9:
                    parseColor5 = Color.parseColor("#FF3E3E");
                    break;
                case 10:
                    parseColor5 = Color.parseColor("#FFFFFF");
                    break;
                case 11:
                    parseColor5 = Color.parseColor("#FF0033");
                    break;
                case 12:
                    parseColor5 = Color.parseColor("#6C5CE7");
                    break;
                case 13:
                    parseColor5 = Color.parseColor("#FF4081");
                    break;
                case 14:
                    parseColor5 = Color.parseColor("#706FD3");
                    break;
                case 15:
                    parseColor5 = Color.parseColor("#FFD700");
                    break;
                case 16:
                    parseColor5 = Color.parseColor("#00D2D3");
                    break;
                default:
                    parseColor5 = Color.parseColor("#FF00E5FF");
                    break;
            }
            int i = parseColor5;
            Paint paint = this.L;
            paint.setColor(parseColor3);
            Paint paint2 = this.d0;
            paint2.setColor(parseColor4);
            Paint paint3 = this.e0;
            paint3.setColor(i);
            nj3 nj3Var = nj3.BUTTON_L;
            nj3 nj3Var2 = this.A;
            if (nj3Var2 != nj3Var && nj3Var2 != nj3.BUTTON_R) {
                z = false;
            } else {
                z = true;
            }
            if (nj3Var2 != nj3.BUTTON_START && nj3Var2 != nj3.BUTTON_SELECT) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z3 = z2;
            Paint paint4 = this.R;
            Paint paint5 = this.B;
            if (z) {
                float min = Math.min(width, height) * 0.45f;
                Path path = new Path();
                if (nj3Var2 == nj3Var) {
                    float f4 = min * 0.25f;
                    float f5 = min * 0.75f;
                    path.addRoundRect(rectF, new float[]{min, min, f4, f4, f4, f4, f5, f5}, Path.Direction.CW);
                } else {
                    float f6 = min * 0.25f;
                    float f7 = min * 0.75f;
                    path.addRoundRect(rectF, new float[]{f6, f6, min, min, f7, f7, f6, f6}, Path.Direction.CW);
                }
                float f8 = min * 0.5f;
                canvas3.drawRoundRect(new RectF(rectF.left + 2.0f, rectF.top + 4.0f, rectF.right + 2.0f, rectF.bottom + 4.0f), f8, f8, paint4);
                if (this.k0 > RecyclerView.B1) {
                    paint5.setColor(parseColor2);
                    paint2.setAlpha((int) (this.k0 * 170.0f));
                    canvas3.drawPath(path, paint2);
                    canvas3.drawPath(path, paint5);
                    canvas3.drawPath(path, paint3);
                } else {
                    paint5.setColor(parseColor);
                    canvas3.drawPath(path, paint5);
                    canvas3.drawPath(path, paint);
                }
                b(canvas3, f, f2, getLabel(), 0.52f * Math.min(width, height), width - 8.0f, j90Var);
            } else {
                canvas2 = canvas3;
                if (z3) {
                    float min2 = Math.min(width, height) * 0.44f;
                    canvas2.drawRoundRect(new RectF(rectF.left + 2.0f, rectF.top + 3.5f, rectF.right + 2.0f, rectF.bottom + 3.5f), min2, min2, paint4);
                    if (this.k0 > RecyclerView.B1) {
                        paint5.setColor(parseColor2);
                        paint2.setAlpha((int) (this.k0 * 170.0f));
                        float f9 = min2 + 3.0f;
                        canvas2.drawRoundRect(new RectF(rectF.left - 3.0f, rectF.top - 3.0f, rectF.right + 3.0f, rectF.bottom + 3.0f), f9, f9, paint2);
                        canvas2.drawRoundRect(rectF, min2, min2, paint5);
                        canvas2.drawRoundRect(rectF, min2, min2, paint3);
                    } else {
                        paint5.setColor(parseColor);
                        canvas2.drawRoundRect(rectF, min2, min2, paint5);
                        canvas2.drawRoundRect(rectF, min2, min2, paint);
                    }
                    canvas3 = canvas2;
                    b(canvas3, f, f2, getLabel(), 0.31f * Math.min(width, height), width - 16.0f, j90Var);
                } else {
                    float min3 = Math.min(width, height) * 0.38f;
                    int i2 = parseColor;
                    canvas2.drawRoundRect(new RectF(rectF.left + 2.0f, rectF.top + 3.5f, rectF.right + 2.0f, rectF.bottom + 3.5f), min3, min3, paint4);
                    if (this.k0 > RecyclerView.B1) {
                        paint5.setColor(parseColor2);
                        paint2.setAlpha((int) (this.k0 * 170.0f));
                        float f10 = min3 + 3.0f;
                        canvas2.drawRoundRect(new RectF(rectF.left - 3.0f, rectF.top - 3.0f, rectF.right + 3.0f, rectF.bottom + 3.0f), f10, f10, paint2);
                        canvas2.drawRoundRect(rectF, min3, min3, paint5);
                        canvas2.drawRoundRect(rectF, min3, min3, paint3);
                    } else {
                        if (this.l0) {
                            parseColor6 = i2;
                        } else {
                            parseColor6 = Color.parseColor("#B3181B22");
                        }
                        paint5.setColor(parseColor6);
                        canvas2.drawRoundRect(rectF, min3, min3, paint5);
                        canvas2.drawRoundRect(rectF, min3, min3, paint);
                    }
                    int i3 = (this.k0 > RecyclerView.B1 ? 1 : (this.k0 == RecyclerView.B1 ? 0 : -1));
                    int i4 = -1;
                    Paint paint6 = this.h0;
                    Paint paint7 = this.f0;
                    if (i3 > 0) {
                        switch (iArr[j90Var.ordinal()]) {
                            case 1:
                                parseColor7 = Color.parseColor("#0284C7");
                                break;
                            case 2:
                                parseColor7 = -1;
                                break;
                            case 3:
                                parseColor7 = Color.parseColor("#FF1744");
                                break;
                            case 4:
                                parseColor7 = Color.parseColor("#C084FC");
                                break;
                            case 5:
                                parseColor7 = Color.parseColor("#FFD700");
                                break;
                            case 6:
                                parseColor7 = Color.parseColor("#00E676");
                                break;
                            default:
                                parseColor7 = Color.parseColor("#00E5FF");
                                break;
                        }
                        paint7.setColor(parseColor7);
                        paint6.setColor(parseColor7);
                    } else if (!this.l0) {
                        paint7.setColor(Color.parseColor("#808A98"));
                        paint6.setColor(Color.parseColor("#808A98"));
                    } else {
                        if (j90Var == j90.CLASSIC_WHITE) {
                            str = "#0F172A";
                        } else {
                            str = "#F0F4F8";
                        }
                        int parseColor8 = Color.parseColor(str);
                        paint7.setColor(parseColor8);
                        paint6.setColor(parseColor8);
                    }
                    float min4 = Math.min(width, height) * 0.48f;
                    if (nj3Var2 != null) {
                        i4 = v64.a[nj3Var2.ordinal()];
                    }
                    Paint paint8 = this.g0;
                    switch (i4) {
                        case 5:
                            float f11 = min4 / 2.0f;
                            Path path2 = new Path();
                            float f12 = f - (0.85f * f11);
                            float f13 = 0.7f * f11;
                            float f14 = f2 - f13;
                            path2.moveTo(f12, f14);
                            float f15 = f - (0.05f * f11);
                            path2.lineTo(f15, f2);
                            float f16 = f2 + f13;
                            path2.lineTo(f12, f16);
                            path2.close();
                            path2.moveTo(f15, f14);
                            path2.lineTo((f11 * 0.75f) + f, f2);
                            path2.lineTo(f15, f16);
                            path2.close();
                            canvas2.drawPath(path2, paint8);
                            canvas2.drawPath(path2, paint7);
                            break;
                        case 6:
                            float f17 = min4 / 2.0f;
                            Path path3 = new Path();
                            float f18 = (0.85f * f17) + f;
                            float f19 = 0.7f * f17;
                            float f20 = f2 - f19;
                            path3.moveTo(f18, f20);
                            float f21 = (0.05f * f17) + f;
                            path3.lineTo(f21, f2);
                            float f22 = f2 + f19;
                            path3.lineTo(f18, f22);
                            path3.close();
                            path3.moveTo(f21, f20);
                            path3.lineTo(f - (f17 * 0.75f), f2);
                            path3.lineTo(f21, f22);
                            path3.close();
                            canvas2.drawPath(path3, paint8);
                            canvas2.drawPath(path3, paint7);
                            break;
                        case 7:
                            float f23 = min4 * 0.22f;
                            float f24 = min4 * 0.48f;
                            float f25 = 0.65f * f24;
                            canvas2.drawRoundRect(new RectF(f - f23, f2 - f25, f + f23, (0.15f * f24) + f2), f23, f23, paint7);
                            Paint paint9 = new Paint(paint7);
                            Paint.Style style = Paint.Style.STROKE;
                            paint9.setStyle(style);
                            paint9.setStrokeWidth(3.0f);
                            float f26 = 1.55f * f23;
                            float f27 = f24 * 0.35f;
                            float f28 = f2 + f27;
                            canvas2.drawArc(new RectF(f - f26, f2 - f27, f26 + f, f28), RecyclerView.B1, 180.0f, false, paint9);
                            float f29 = f2 + f25;
                            canvas.drawLine(f, f28, f, f29, paint9);
                            float f30 = f23 * 1.2f;
                            canvas.drawLine(f - f30, f29, f + f30, f29, paint9);
                            if (!this.l0) {
                                Paint paint10 = new Paint(1);
                                paint10.setStyle(style);
                                paint10.setStrokeWidth(3.5f);
                                paint10.setColor(Color.parseColor("#FF5252"));
                                float f31 = min4 * 0.35f;
                                canvas2 = canvas;
                                canvas2.drawLine(f - f31, f2 + f31, f + f31, f2 - f31, paint10);
                                break;
                            }
                            canvas2 = canvas;
                            break;
                        case 8:
                            float f32 = 0.22f * min4;
                            float f33 = 0.7f * min4;
                            float f34 = (min4 * 0.18f) / 2.0f;
                            float f35 = f - f34;
                            float f36 = f33 / 2.0f;
                            float f37 = f2 - f36;
                            float f38 = f2 + f36;
                            RectF rectF2 = new RectF(f35 - f32, f37, f35, f38);
                            float f39 = f + f34;
                            RectF rectF3 = new RectF(f39, f37, f39 + f32, f38);
                            canvas2.drawRoundRect(rectF2, 3.5f, 3.5f, paint7);
                            canvas2.drawRoundRect(rectF3, 3.5f, 3.5f, paint7);
                            break;
                        case 9:
                            float f40 = min4 * 0.36f;
                            Paint paint11 = new Paint(paint7);
                            paint11.setStyle(Paint.Style.STROKE);
                            paint11.setStrokeWidth(3.5f);
                            canvas2 = canvas;
                            canvas2.drawArc(new RectF(f - f40, f2 - f40, f + f40, f2 + f40), 45.0f, 275.0f, false, paint11);
                            Path path4 = new Path();
                            float f41 = 0.6f * f40;
                            path4.moveTo(f + f41, f2 - (1.1f * f40));
                            path4.lineTo((1.05f * f40) + f, f2 - f41);
                            float f42 = f40 * 0.45f;
                            path4.lineTo(f + f42, f2 - f42);
                            path4.close();
                            canvas2.drawPath(path4, paint7);
                            break;
                        case 10:
                            float f43 = 0.22f * min4;
                            Paint paint12 = new Paint(paint7);
                            paint12.setStyle(Paint.Style.STROKE);
                            paint12.setStrokeWidth(3.0f);
                            float f44 = f - f43;
                            float f45 = (0.65f * min4) / 2.0f;
                            float f46 = f2 + f45;
                            float f47 = f2 - f45;
                            canvas2 = canvas;
                            canvas2.drawLine(f44, f46, f44, f47, paint12);
                            float f48 = min4 * 0.15f;
                            float f49 = f47 + f48;
                            canvas2.drawLine(f44, f47, f44 - f48, f49, paint12);
                            canvas2.drawLine(f44, f47, f44 + f48, f49, paint12);
                            float f50 = f + f43;
                            canvas2.drawLine(f50, f47, f50, f46, paint12);
                            float f51 = f46 - f48;
                            canvas2.drawLine(f50, f46, f50 - f48, f51, paint12);
                            canvas2.drawLine(f50, f46, f50 + f48, f51, paint12);
                            break;
                        case 11:
                            canvas2.drawCircle(f, f2, 0.18f * min4, paint7);
                            Paint paint13 = new Paint(paint7);
                            Paint.Style style2 = Paint.Style.STROKE;
                            paint13.setStyle(style2);
                            paint13.setStrokeWidth(2.8f);
                            canvas2.drawCircle(f, f2, 0.4f * min4, paint13);
                            if (!this.l0) {
                                Paint paint14 = new Paint(1);
                                paint14.setStyle(style2);
                                paint14.setStrokeWidth(3.5f);
                                paint14.setColor(Color.parseColor("#FF5252"));
                                float f52 = min4 * 0.35f;
                                canvas2.drawLine(f - f52, f2 + f52, f + f52, f2 - f52, paint14);
                            }
                            canvas2 = canvas;
                            break;
                        case 12:
                            float f53 = min4 * 0.65f;
                            float f54 = f53 / 2.0f;
                            RectF rectF4 = new RectF(f - f54, f2 - f54, f + f54, f54 + f2);
                            Paint paint15 = new Paint(paint7);
                            Paint.Style style3 = Paint.Style.STROKE;
                            paint15.setStyle(style3);
                            paint15.setStrokeWidth(2.8f);
                            canvas2.drawRoundRect(rectF4, 4.0f, 4.0f, paint15);
                            Paint paint16 = new Paint(paint7);
                            paint16.setStyle(style3);
                            paint16.setStrokeWidth(3.0f);
                            float f55 = 0.22f * f53;
                            float f56 = f2 - f55;
                            canvas2.drawLine(f, (0.25f * f53) + f2, f, f56, paint16);
                            float f57 = f2 - (f53 * 0.02f);
                            canvas2 = canvas;
                            canvas2.drawLine(f, f56, f - f55, f57, paint16);
                            canvas2.drawLine(f, f56, f + f55, f57, paint16);
                            break;
                        case 13:
                            float f58 = min4 * 0.65f;
                            float f59 = f58 / 2.0f;
                            RectF rectF5 = new RectF(f - f59, f2 - f59, f + f59, f59 + f2);
                            Paint paint17 = new Paint(paint7);
                            Paint.Style style4 = Paint.Style.STROKE;
                            paint17.setStyle(style4);
                            paint17.setStrokeWidth(2.8f);
                            canvas2.drawRoundRect(rectF5, 4.0f, 4.0f, paint17);
                            Paint paint18 = new Paint(paint7);
                            paint18.setStyle(style4);
                            paint18.setStrokeWidth(3.0f);
                            float f60 = 0.22f * f58;
                            float f61 = f2 + f60;
                            canvas2.drawLine(f, f2 - (0.25f * f58), f, f61, paint18);
                            float f62 = (f58 * 0.02f) + f2;
                            canvas2 = canvas;
                            canvas2.drawLine(f, f61, f - f60, f62, paint18);
                            canvas2.drawLine(f, f61, f + f60, f62, paint18);
                            break;
                        case 14:
                            float f63 = 0.75f * min4;
                            float f64 = 0.32f * min4;
                            float f65 = f63 / 2.0f;
                            float f66 = f - f65;
                            float f67 = f2 - f64;
                            float f68 = (min4 * 0.12f) / 2.0f;
                            float f69 = f65 + f;
                            RectF rectF6 = new RectF(f66, f67 - f68, f69, f2 - f68);
                            RectF rectF7 = new RectF(f66, f2 + f68, f69, f64 + f2 + f68);
                            Paint paint19 = new Paint(paint7);
                            paint19.setStyle(Paint.Style.STROKE);
                            paint19.setStrokeWidth(2.8f);
                            canvas2.drawRoundRect(rectF6, 4.0f, 4.0f, paint19);
                            canvas2.drawRoundRect(rectF7, 4.0f, 4.0f, paint19);
                            float f70 = f63 * 0.35f;
                            canvas2.drawLine(f - f70, f2, f + f70, f2, paint19);
                            break;
                        case 15:
                            Paint paint20 = new Paint(1);
                            paint20.setColor(paint7.getColor());
                            paint20.setTextAlign(Paint.Align.CENTER);
                            paint20.setTypeface(Typeface.create("sans-serif-medium", 1));
                            paint20.setTextSize(min4 * 0.48f);
                            canvas2.drawText("TR", f, f2 - ((paint20.ascent() + paint20.descent()) / 2.0f), paint20);
                            break;
                        case 16:
                            float f71 = 0.09f * min4;
                            float f72 = min4 * 0.28f;
                            Paint paint21 = new Paint(paint7);
                            paint21.setStyle(Paint.Style.FILL);
                            canvas2.drawCircle(f - f72, f2, f71, paint21);
                            canvas2.drawCircle(f, f2, f71, paint21);
                            canvas2.drawCircle(f + f72, f2, f71, paint21);
                            Paint paint22 = new Paint(paint7);
                            paint22.setStyle(Paint.Style.STROKE);
                            paint22.setStrokeWidth(2.4f);
                            float f73 = 1.5f * f72;
                            float f74 = f72 * 0.65f;
                            canvas2.drawRoundRect(new RectF(f - f73, f2 - f74, f + f73, f74 + f2), 4.0f, 4.0f, paint22);
                            break;
                        default:
                            String label = getLabel();
                            if (qs6.v0(label)) {
                                label = "BTN";
                            }
                            canvas3 = canvas2;
                            b(canvas3, f, f2, label, Math.min(width, height) * 0.35f, width - 8.0f, j90Var);
                            break;
                    }
                    canvas2.restore();
                }
            }
            canvas2 = canvas3;
            canvas2.restore();
        }
    }

    public final void setToggleState(boolean z) {
        if (this.l0 != z) {
            this.l0 = z;
            invalidate();
        }
    }
}
