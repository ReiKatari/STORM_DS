package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rt0  reason: default package */
/* loaded from: classes.dex */
public abstract class rt0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0136  */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        TypedArray obtainStyledAttributes;
        int color;
        float f;
        float f2;
        int attributeCount;
        int i;
        char c;
        int[] iArr;
        int i2;
        int T;
        float min;
        float f3;
        int i3;
        float cbrt;
        int i4;
        int i5;
        TypedValue typedValue;
        Resources resources2 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            ?? r4 = 1;
            int depth2 = xmlPullParser.getDepth() + 1;
            int[][] iArr2 = new int[20];
            int[] iArr3 = new int[20];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int next = xmlPullParser.next();
                if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                    break;
                } else if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                    int[] iArr4 = g75.a;
                    if (theme2 == null) {
                        obtainStyledAttributes = resources2.obtainAttributes(attributeSet2, iArr4);
                    } else {
                        obtainStyledAttributes = theme2.obtainStyledAttributes(attributeSet2, iArr4, i6, i6);
                    }
                    int resourceId = obtainStyledAttributes.getResourceId(i6, -1);
                    if (resourceId != -1) {
                        ThreadLocal threadLocal = a;
                        TypedValue typedValue2 = (TypedValue) threadLocal.get();
                        if (typedValue2 == null) {
                            typedValue = new TypedValue();
                            threadLocal.set(typedValue);
                        } else {
                            typedValue = typedValue2;
                        }
                        resources2.getValue(resourceId, typedValue, r4);
                        int i8 = typedValue.type;
                        if (i8 < 28 || i8 > 31) {
                            try {
                                color = a(resources2, resources2.getXml(resourceId), theme2).getDefaultColor();
                            } catch (Exception unused) {
                                color = obtainStyledAttributes.getColor(i6, -65281);
                            }
                            if (!obtainStyledAttributes.hasValue(r4)) {
                                f = obtainStyledAttributes.getFloat(r4, 1.0f);
                            } else if (obtainStyledAttributes.hasValue(3)) {
                                f = obtainStyledAttributes.getFloat(3, 1.0f);
                            } else {
                                f = 1.0f;
                            }
                            char c2 = r4;
                            if (Build.VERSION.SDK_INT < 31 && obtainStyledAttributes.hasValue(2)) {
                                f2 = obtainStyledAttributes.getFloat(2, -1.0f);
                            } else {
                                f2 = obtainStyledAttributes.getFloat(4, -1.0f);
                            }
                            obtainStyledAttributes.recycle();
                            attributeCount = attributeSet2.getAttributeCount();
                            int[] iArr5 = new int[attributeCount];
                            i = i6;
                            int i9 = i;
                            while (i < attributeCount) {
                                int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                                if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                    int i10 = i9 + 1;
                                    if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                        attributeNameResource = -attributeNameResource;
                                    }
                                    iArr5[i9] = attributeNameResource;
                                    i9 = i10;
                                }
                                i++;
                            }
                            int[] trimStateSet = StateSet.trimStateSet(iArr5, i9);
                            float f4 = 100.0f;
                            if (f2 < RecyclerView.B1 && f2 <= 100.0f) {
                                c = c2;
                            } else {
                                c = 0;
                            }
                            if (f != 1.0f && c == 0) {
                                iArr = trimStateSet;
                                i2 = depth2;
                            } else {
                                int q = ej2.q((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                                if (c == 0) {
                                    vb0 a2 = vb0.a(color);
                                    float f5 = a2.a;
                                    float f6 = a2.b;
                                    iq7 iq7Var = iq7.k;
                                    if (f6 < 1.0d || Math.round(f2) <= 0.0d || Math.round(f2) >= 100.0d) {
                                        iArr = trimStateSet;
                                        i2 = depth2;
                                        T = nc1.T(f2);
                                    } else {
                                        if (f5 < RecyclerView.B1) {
                                            min = 0.0f;
                                        } else {
                                            min = Math.min(360.0f, f5);
                                        }
                                        float f7 = 0.0f;
                                        float f8 = f6;
                                        char c3 = c2;
                                        vb0 vb0Var = null;
                                        while (true) {
                                            if (Math.abs(f7 - f6) >= 0.4f) {
                                                float f9 = 1000.0f;
                                                float f10 = f4;
                                                float f11 = 0.0f;
                                                float f12 = 1000.0f;
                                                vb0 vb0Var2 = null;
                                                while (true) {
                                                    if (Math.abs(f11 - f10) > 0.01f) {
                                                        f3 = f4;
                                                        float f13 = ((f10 - f11) / 2.0f) + f11;
                                                        iArr = trimStateSet;
                                                        int c4 = vb0.b(f13, f8, min).c(iq7.k);
                                                        float W = nc1.W(Color.red(c4));
                                                        float W2 = nc1.W(Color.green(c4));
                                                        float W3 = nc1.W(Color.blue(c4));
                                                        float[] fArr = nc1.d[c2];
                                                        float f14 = ((W3 * fArr[2]) + ((W2 * fArr[c2]) + (W * fArr[0]))) / f3;
                                                        if (f14 <= 0.008856452f) {
                                                            cbrt = f14 * 903.2963f;
                                                            i3 = c4;
                                                        } else {
                                                            i3 = c4;
                                                            cbrt = (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
                                                        }
                                                        float abs = Math.abs(f2 - cbrt);
                                                        if (abs < 0.2f) {
                                                            vb0 a3 = vb0.a(i3);
                                                            vb0 b = vb0.b(a3.c, a3.b, min);
                                                            float f15 = a3.d - b.d;
                                                            float f16 = a3.e - b.e;
                                                            float f17 = a3.f - b.f;
                                                            i2 = depth2;
                                                            float pow = (float) (Math.pow(Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15)), 0.63d) * 1.41d);
                                                            if (pow <= 1.0f) {
                                                                f12 = pow;
                                                                f9 = abs;
                                                                vb0Var2 = a3;
                                                            }
                                                        } else {
                                                            i2 = depth2;
                                                        }
                                                        if (f9 == RecyclerView.B1 && f12 == RecyclerView.B1) {
                                                            break;
                                                        }
                                                        if (cbrt < f2) {
                                                            f11 = f13;
                                                        } else {
                                                            f10 = f13;
                                                        }
                                                        f4 = f3;
                                                        trimStateSet = iArr;
                                                        depth2 = i2;
                                                    } else {
                                                        iArr = trimStateSet;
                                                        i2 = depth2;
                                                        f3 = f4;
                                                        break;
                                                    }
                                                }
                                                vb0 vb0Var3 = vb0Var2;
                                                if (c3 != 0) {
                                                    if (vb0Var3 != null) {
                                                        T = vb0Var3.c(iq7Var);
                                                        break;
                                                    }
                                                    f8 = ((f6 - f7) / 2.0f) + f7;
                                                    f4 = f3;
                                                    trimStateSet = iArr;
                                                    depth2 = i2;
                                                    c3 = 0;
                                                } else {
                                                    if (vb0Var3 == null) {
                                                        f6 = f8;
                                                    } else {
                                                        vb0Var = vb0Var3;
                                                        f7 = f8;
                                                    }
                                                    f8 = ((f6 - f7) / 2.0f) + f7;
                                                    f4 = f3;
                                                    trimStateSet = iArr;
                                                    depth2 = i2;
                                                }
                                            } else {
                                                iArr = trimStateSet;
                                                i2 = depth2;
                                                if (vb0Var == null) {
                                                    T = nc1.T(f2);
                                                } else {
                                                    T = vb0Var.c(iq7Var);
                                                }
                                            }
                                        }
                                    }
                                    color = T;
                                } else {
                                    iArr = trimStateSet;
                                    i2 = depth2;
                                }
                                color = (16777215 & color) | (q << 24);
                            }
                            i4 = i7 + 1;
                            int i11 = 8;
                            if (i4 > iArr3.length) {
                                if (i7 <= 4) {
                                    i5 = 8;
                                } else {
                                    i5 = i7 * 2;
                                }
                                int[] iArr6 = new int[i5];
                                System.arraycopy(iArr3, 0, iArr6, 0, i7);
                                iArr3 = iArr6;
                            }
                            iArr3[i7] = color;
                            if (i4 > iArr2.length) {
                                Class<?> componentType = iArr2.getClass().getComponentType();
                                if (i7 > 4) {
                                    i11 = i7 * 2;
                                }
                                ?? r1 = (Object[]) Array.newInstance(componentType, i11);
                                System.arraycopy(iArr2, 0, r1, 0, i7);
                                iArr2 = r1;
                            }
                            iArr2[i7] = iArr;
                            iArr2 = iArr2;
                            attributeSet2 = attributeSet;
                            theme2 = theme;
                            i7 = i4;
                            r4 = c2;
                            depth2 = i2;
                            i6 = 0;
                            resources2 = resources;
                        }
                    }
                    color = obtainStyledAttributes.getColor(i6, -65281);
                    if (!obtainStyledAttributes.hasValue(r4)) {
                    }
                    char c22 = r4;
                    if (Build.VERSION.SDK_INT < 31) {
                    }
                    f2 = obtainStyledAttributes.getFloat(4, -1.0f);
                    obtainStyledAttributes.recycle();
                    attributeCount = attributeSet2.getAttributeCount();
                    int[] iArr52 = new int[attributeCount];
                    i = i6;
                    int i92 = i;
                    while (i < attributeCount) {
                    }
                    int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i92);
                    float f42 = 100.0f;
                    if (f2 < RecyclerView.B1) {
                    }
                    c = 0;
                    if (f != 1.0f) {
                    }
                    int q2 = ej2.q((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                    if (c == 0) {
                    }
                    color = (16777215 & color) | (q2 << 24);
                    i4 = i7 + 1;
                    int i112 = 8;
                    if (i4 > iArr3.length) {
                    }
                    iArr3[i7] = color;
                    if (i4 > iArr2.length) {
                    }
                    iArr2[i7] = iArr;
                    iArr2 = iArr2;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i7 = i4;
                    r4 = c22;
                    depth2 = i2;
                    i6 = 0;
                    resources2 = resources;
                } else {
                    resources2 = resources;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    r4 = r4;
                    depth2 = depth2;
                    i6 = 0;
                }
            }
            int[] iArr7 = new int[i7];
            int[][] iArr8 = new int[i7];
            System.arraycopy(iArr3, 0, iArr7, 0, i7);
            System.arraycopy(iArr2, 0, iArr8, 0, i7);
            return new ColorStateList(iArr8, iArr7);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }
}
