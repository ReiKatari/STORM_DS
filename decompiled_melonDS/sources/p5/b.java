package p5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import c8.c0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f11328a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b  reason: collision with root package name */
    public static final float[][] f11329b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f11330c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d  reason: collision with root package name */
    public static final float[][] f11331d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* renamed from: e  reason: collision with root package name */
    public static final Object f11332e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public static Method f11333f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f11334g;

    public static int b(Context context, int i2, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i2;
        }
        return i10;
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!e(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i2 = typedValue.type;
        if (i2 != 2) {
            if (i2 >= 28 && i2 <= 31) {
                return ColorStateList.valueOf(typedValue.data);
            }
            Resources resources = typedArray.getResources();
            int resourceId = typedArray.getResourceId(1, 0);
            ThreadLocal threadLocal = c.f11335a;
            try {
                return c.a(resources, resources.getXml(resourceId), theme);
            } catch (Exception e6) {
                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e6);
                return null;
            }
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
    }

    public static c0 d(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        c0 c0Var;
        if (e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return new c0((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c0Var = c0.c(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e6) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e6);
                c0Var = null;
            }
            if (c0Var != null) {
                return c0Var;
            }
        }
        return new c0((Shader) null, (ColorStateList) null, 0);
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int f(float f8) {
        float f10;
        boolean z10;
        float f11;
        if (f8 < 1.0f) {
            return -16777216;
        }
        if (f8 > 99.0f) {
            return -1;
        }
        float f12 = (f8 + 16.0f) / 116.0f;
        if (f8 > 8.0f) {
            f10 = f12 * f12 * f12;
        } else {
            f10 = f8 / 903.2963f;
        }
        float f13 = f12 * f12 * f12;
        if (f13 > 0.008856452f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f11 = f13;
        } else {
            f11 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z10) {
            f13 = ((f12 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f11330c;
        return q5.a.a(f11 * fArr[0], f10 * fArr[1], f13 * fArr[2]);
    }

    public static float g(int i2) {
        float pow;
        float f8 = i2 / 255.0f;
        if (f8 <= 0.04045f) {
            pow = f8 / 12.92f;
        } else {
            pow = (float) Math.pow((f8 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p5.d k(android.content.res.XmlResourceParser r26, android.content.res.Resources r27) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.b.k(android.content.res.XmlResourceParser, android.content.res.Resources):p5.d");
    }

    public static List l(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i10 = 0; i10 < obtainTypedArray.length(); i10++) {
                    int resourceId = obtainTypedArray.getResourceId(i10, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void m(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i2--;
                }
            } else {
                i2++;
            }
        }
    }

    public static float n() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public void a(int i2) {
        new Handler(Looper.getMainLooper()).post(new d2.d(i2, 3, this));
    }

    public abstract void i(int i2);

    public abstract void j(Typeface typeface);
}
