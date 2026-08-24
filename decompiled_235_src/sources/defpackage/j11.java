package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j11  reason: default package */
/* loaded from: classes.dex */
public final class j11 {
    public boolean a = false;
    public String b;
    public i11 c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    public j11(j11 j11Var, Object obj) {
        this.b = j11Var.b;
        this.c = j11Var.c;
        f(obj);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, j11] */
    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        i11 i11Var;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e75.d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        i11 i11Var2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i11Var2 = i11.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    i11Var = i11.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    i11Var = i11.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    i11Var = i11.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, RecyclerView.B1), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    i11Var = i11.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, RecyclerView.B1));
                } else if (index == 5) {
                    i11Var = i11.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    i11Var = i11.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    i11Var = i11.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    i11Var = i11.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                i11Var2 = i11Var;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            ?? obj3 = new Object();
            obj3.b = str;
            obj3.c = i11Var2;
            obj3.a = z;
            obj3.f(obj);
            hashMap.put(str, obj3);
        }
        obtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            j11 j11Var = (j11) hashMap.get(str2);
            if (!j11Var.a) {
                str = i61.m("set", str2);
            } else {
                str = str2;
            }
            try {
                int ordinal = j11Var.c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (ordinal) {
                    case 0:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(j11Var.d));
                        continue;
                    case 1:
                        cls.getMethod(str, cls2).invoke(view, Float.valueOf(j11Var.e));
                        continue;
                    case 2:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(j11Var.h));
                        continue;
                    case 3:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(j11Var.h);
                        method.invoke(view, colorDrawable);
                        continue;
                    case 4:
                        cls.getMethod(str, CharSequence.class).invoke(view, j11Var.f);
                        continue;
                    case 5:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(j11Var.g));
                        continue;
                    case 6:
                        cls.getMethod(str, cls2).invoke(view, Float.valueOf(j11Var.e));
                        continue;
                    case 7:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(j11Var.d));
                        continue;
                }
            } catch (IllegalAccessException e) {
                StringBuilder t = i61.t(" Custom Attribute \"", str2, "\" not found on ");
                t.append(cls.getName());
                Log.e("TransitionLayout", t.toString(), e);
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
            } catch (InvocationTargetException e3) {
                StringBuilder t2 = i61.t(" Custom Attribute \"", str2, "\" not found on ");
                t2.append(cls.getName());
                Log.e("TransitionLayout", t2.toString(), e3);
            }
        }
    }

    public final float a() {
        switch (this.c.ordinal()) {
            case 0:
                return this.d;
            case 1:
            case 6:
                return this.e;
            case 2:
            case 3:
                u34.j("Color does not have a single color to interpolate");
                return RecyclerView.B1;
            case 4:
                u34.j("Cannot interpolate String");
                return RecyclerView.B1;
            case 5:
                if (this.g) {
                    return 1.0f;
                }
                return RecyclerView.B1;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        float f;
        switch (this.c.ordinal()) {
            case 0:
                fArr[0] = this.d;
                return;
            case 1:
                fArr[0] = this.e;
                return;
            case 2:
            case 3:
                int i = this.h;
                float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case 4:
                u34.j("Color does not have a single color to interpolate");
                return;
            case 5:
                if (this.g) {
                    f = 1.0f;
                } else {
                    f = RecyclerView.B1;
                }
                fArr[0] = f;
                return;
            case 6:
                fArr[0] = this.e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int ordinal = this.c.ordinal();
        if (ordinal != 2 && ordinal != 3) {
            return 1;
        }
        return 4;
    }

    public final void f(Object obj) {
        switch (this.c.ordinal()) {
            case 0:
            case 7:
                this.d = ((Integer) obj).intValue();
                return;
            case 1:
                this.e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f = (String) obj;
                return;
            case 5:
                this.g = ((Boolean) obj).booleanValue();
                return;
            case 6:
                this.e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
