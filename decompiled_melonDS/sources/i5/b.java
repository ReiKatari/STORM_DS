package i5;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6814a = false;

    /* renamed from: b  reason: collision with root package name */
    public String f6815b;

    /* renamed from: c  reason: collision with root package name */
    public a f6816c;

    /* renamed from: d  reason: collision with root package name */
    public int f6817d;

    /* renamed from: e  reason: collision with root package name */
    public float f6818e;

    /* renamed from: f  reason: collision with root package name */
    public String f6819f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6820g;

    /* renamed from: h  reason: collision with root package name */
    public int f6821h;

    public b(b bVar, Object obj) {
        this.f6815b = bVar.f6815b;
        this.f6816c = bVar.f6816c;
        f(obj);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [i5.b, java.lang.Object] */
    public static void d(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        a aVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), v.f6996d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        a aVar2 = null;
        boolean z10 = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z10 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                aVar2 = a.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    aVar = a.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    aVar = a.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    aVar = a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    aVar = a.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    aVar = a.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    aVar = a.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    aVar = a.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    aVar = a.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                aVar2 = aVar;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            ?? obj3 = new Object();
            obj3.f6815b = str;
            obj3.f6816c = aVar2;
            obj3.f6814a = z10;
            obj3.f(obj);
            hashMap.put(str, obj3);
        }
        obtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap hashMap) {
        String str;
        Class<?> cls = view.getClass();
        for (String str2 : hashMap.keySet()) {
            b bVar = (b) hashMap.get(str2);
            if (!bVar.f6814a) {
                str = "set" + str2;
            } else {
                str = str2;
            }
            try {
                int ordinal = bVar.f6816c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (ordinal) {
                    case 0:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(bVar.f6817d));
                        continue;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        cls.getMethod(str, cls2).invoke(view, Float.valueOf(bVar.f6818e));
                        continue;
                    case 2:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(bVar.f6821h));
                        continue;
                    case 3:
                        Method method = cls.getMethod(str, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f6821h);
                        method.invoke(view, colorDrawable);
                        continue;
                    case 4:
                        cls.getMethod(str, CharSequence.class).invoke(view, bVar.f6819f);
                        continue;
                    case l1.c.f8511g /* 5 */:
                        cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f6820g));
                        continue;
                    case l1.c.f8509e /* 6 */:
                        cls.getMethod(str, cls2).invoke(view, Float.valueOf(bVar.f6818e));
                        continue;
                    case 7:
                        cls.getMethod(str, cls3).invoke(view, Integer.valueOf(bVar.f6817d));
                        continue;
                }
            } catch (IllegalAccessException e6) {
                StringBuilder u4 = w.d.u(" Custom Attribute \"", str2, "\" not found on ");
                u4.append(cls.getName());
                Log.e("TransitionLayout", u4.toString(), e6);
            } catch (NoSuchMethodException e10) {
                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e10);
            } catch (InvocationTargetException e11) {
                StringBuilder u10 = w.d.u(" Custom Attribute \"", str2, "\" not found on ");
                u10.append(cls.getName());
                Log.e("TransitionLayout", u10.toString(), e11);
            }
        }
    }

    public final float a() {
        switch (this.f6816c.ordinal()) {
            case 0:
                return this.f6817d;
            case DSiCameraSource.FrontCamera /* 1 */:
            case l1.c.f8509e /* 6 */:
                return this.f6818e;
            case 2:
            case 3:
                m9.o.r("Color does not have a single color to interpolate");
                return 0.0f;
            case 4:
                m9.o.r("Cannot interpolate String");
                return 0.0f;
            case l1.c.f8511g /* 5 */:
                if (this.f6820g) {
                    return 1.0f;
                }
                return 0.0f;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        float f8;
        switch (this.f6816c.ordinal()) {
            case 0:
                fArr[0] = this.f6817d;
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                fArr[0] = this.f6818e;
                return;
            case 2:
            case 3:
                int i2 = this.f6821h;
                float pow = (float) Math.pow(((i2 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i2 >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i2 & 255) / 255.0f, 2.2d);
                fArr[3] = ((i2 >> 24) & 255) / 255.0f;
                return;
            case 4:
                m9.o.r("Color does not have a single color to interpolate");
                return;
            case l1.c.f8511g /* 5 */:
                if (this.f6820g) {
                    f8 = 1.0f;
                } else {
                    f8 = 0.0f;
                }
                fArr[0] = f8;
                return;
            case l1.c.f8509e /* 6 */:
                fArr[0] = this.f6818e;
                return;
            default:
                return;
        }
    }

    public final int c() {
        int ordinal = this.f6816c.ordinal();
        if (ordinal != 2 && ordinal != 3) {
            return 1;
        }
        return 4;
    }

    public final void f(Object obj) {
        switch (this.f6816c.ordinal()) {
            case 0:
            case 7:
                this.f6817d = ((Integer) obj).intValue();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f6818e = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f6821h = ((Integer) obj).intValue();
                return;
            case 4:
                this.f6819f = (String) obj;
                return;
            case l1.c.f8511g /* 5 */:
                this.f6820g = ((Boolean) obj).booleanValue();
                return;
            case l1.c.f8509e /* 6 */:
                this.f6818e = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }
}
