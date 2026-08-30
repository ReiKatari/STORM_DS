package q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f11889l = new RectF();
    public static final ConcurrentHashMap m = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f11890a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11891b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f11892c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f11893d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f11894e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f11895f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f11896g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f11897h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f11898i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f11899j;

    /* renamed from: k  reason: collision with root package name */
    public final b1 f11900k;

    public e1(TextView textView) {
        this.f11898i = textView;
        this.f11899j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f11900k = new c1();
        } else {
            this.f11900k = new b1();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i2 : iArr) {
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i10 = 0; i10 < size; i10++) {
                    iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
                return method;
            }
            return method;
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e6);
            return null;
        }
    }

    public static Object e(Object obj, Object obj2, String str) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e6) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e6);
            return obj2;
        }
    }

    public final void a() {
        int measuredWidth;
        if (f()) {
            if (this.f11891b) {
                if (this.f11898i.getMeasuredHeight() > 0 && this.f11898i.getMeasuredWidth() > 0) {
                    if (this.f11900k.b(this.f11898i)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f11898i.getMeasuredWidth() - this.f11898i.getTotalPaddingLeft()) - this.f11898i.getTotalPaddingRight();
                    }
                    int height = (this.f11898i.getHeight() - this.f11898i.getCompoundPaddingBottom()) - this.f11898i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f11889l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float c4 = c(rectF);
                                if (c4 != this.f11898i.getTextSize()) {
                                    g(0, c4);
                                }
                            } finally {
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f11891b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence charSequence;
        CharSequence transformation;
        int length = this.f11895f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i10 = 0;
            int i11 = 1;
            while (true) {
                int[] iArr = this.f11895f;
                if (i11 <= i2) {
                    int i12 = (i11 + i2) / 2;
                    int i13 = iArr[i12];
                    TextView textView = this.f11898i;
                    CharSequence text = textView.getText();
                    TransformationMethod transformationMethod = textView.getTransformationMethod();
                    if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                        charSequence = transformation;
                    } else {
                        charSequence = text;
                    }
                    int maxLines = textView.getMaxLines();
                    TextPaint textPaint = this.f11897h;
                    if (textPaint == null) {
                        this.f11897h = new TextPaint();
                    } else {
                        textPaint.reset();
                    }
                    this.f11897h.set(textView.getPaint());
                    this.f11897h.setTextSize(i13);
                    StaticLayout a10 = a1.a(charSequence, (Layout.Alignment) e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f11898i, this.f11897h, this.f11900k);
                    if ((maxLines != -1 && (a10.getLineCount() > maxLines || a10.getLineEnd(a10.getLineCount() - 1) != charSequence.length())) || a10.getHeight() > rectF.bottom) {
                        i10 = i12 - 1;
                        i2 = i10;
                    } else {
                        int i14 = i12 + 1;
                        i10 = i11;
                        i11 = i14;
                    }
                } else {
                    return iArr[i10];
                }
            }
        } else {
            a0.j.p("No available text sizes to choose from.");
            return 0;
        }
    }

    public final boolean f() {
        if (j() && this.f11890a != 0) {
            return true;
        }
        return false;
    }

    public final void g(int i2, float f8) {
        Resources resources;
        Context context = this.f11899j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i2, f8, resources.getDisplayMetrics());
        TextView textView = this.f11898i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f11891b = false;
                try {
                    Method d4 = d("nullLayouts");
                    if (d4 != null) {
                        d4.invoke(textView, null);
                    }
                } catch (Exception e6) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e6);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f11890a == 1) {
            if (!this.f11896g || this.f11895f.length == 0) {
                int floor = ((int) Math.floor((this.f11894e - this.f11893d) / this.f11892c)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f11892c) + this.f11893d);
                }
                this.f11895f = b(iArr);
            }
            this.f11891b = true;
        } else {
            this.f11891b = false;
        }
        return this.f11891b;
    }

    public final boolean i() {
        int[] iArr;
        int length;
        boolean z10;
        if (this.f11895f.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11896g = z10;
        if (z10) {
            this.f11890a = 1;
            this.f11893d = iArr[0];
            this.f11894e = iArr[length - 1];
            this.f11892c = -1.0f;
        }
        return z10;
    }

    public final boolean j() {
        return !(this.f11898i instanceof t);
    }

    public final void k(float f8, float f10, float f11) {
        if (f8 > 0.0f) {
            if (f10 > f8) {
                if (f11 > 0.0f) {
                    this.f11890a = 1;
                    this.f11893d = f8;
                    this.f11894e = f10;
                    this.f11892c = f11;
                    this.f11896g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f8 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f8 + "px) is less or equal to (0px)");
    }
}
