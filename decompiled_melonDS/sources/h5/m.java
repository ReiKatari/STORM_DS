package h5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: w  reason: collision with root package name */
    public float f6196w;

    /* renamed from: e  reason: collision with root package name */
    public float f6179e = 0.1f;

    /* renamed from: f  reason: collision with root package name */
    public int f6180f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f6181g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f6182h = -1;

    /* renamed from: i  reason: collision with root package name */
    public RectF f6183i = new RectF();

    /* renamed from: j  reason: collision with root package name */
    public RectF f6184j = new RectF();

    /* renamed from: k  reason: collision with root package name */
    public HashMap f6185k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public String f6186l = null;
    public int m = -1;

    /* renamed from: n  reason: collision with root package name */
    public String f6187n = null;

    /* renamed from: o  reason: collision with root package name */
    public String f6188o = null;

    /* renamed from: p  reason: collision with root package name */
    public int f6189p = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f6190q = -1;

    /* renamed from: r  reason: collision with root package name */
    public View f6191r = null;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6192s = true;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6193t = true;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6194u = true;

    /* renamed from: v  reason: collision with root package name */
    public float f6195v = Float.NaN;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6197x = false;

    public m() {
        this.f6084d = new HashMap();
    }

    public static void i(RectF rectF, View view, boolean z10) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // h5.b
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // h5.b
    /* renamed from: b */
    public final b clone() {
        m mVar = new m();
        super.c(this);
        mVar.f6186l = this.f6186l;
        mVar.m = this.m;
        mVar.f6187n = this.f6187n;
        mVar.f6188o = this.f6188o;
        mVar.f6189p = this.f6189p;
        mVar.f6190q = this.f6190q;
        mVar.f6191r = this.f6191r;
        mVar.f6179e = this.f6179e;
        mVar.f6192s = this.f6192s;
        mVar.f6193t = this.f6193t;
        mVar.f6194u = this.f6194u;
        mVar.f6195v = this.f6195v;
        mVar.f6196w = this.f6196w;
        mVar.f6197x = this.f6197x;
        mVar.f6183i = this.f6183i;
        mVar.f6184j = this.f6184j;
        mVar.f6185k = this.f6185k;
        return mVar;
    }

    @Override // h5.b
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i5.v.f7001i);
        SparseIntArray sparseIntArray = l.f6178a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray2 = l.f6178a;
            switch (sparseIntArray2.get(index)) {
                case DSiCameraSource.FrontCamera /* 1 */:
                    this.f6187n = obtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f6188o = obtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f6186l = obtainStyledAttributes.getString(index);
                    break;
                case l1.c.f8511g /* 5 */:
                    this.f6179e = obtainStyledAttributes.getFloat(index, this.f6179e);
                    break;
                case l1.c.f8509e /* 6 */:
                    this.f6189p = obtainStyledAttributes.getResourceId(index, this.f6189p);
                    break;
                case 7:
                    if (MotionLayout.f1074r1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f6082b);
                        this.f6082b = resourceId;
                        if (resourceId == -1) {
                            this.f6083c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.f6083c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.f6082b = obtainStyledAttributes.getResourceId(index, this.f6082b);
                        break;
                    }
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.f6081a);
                    this.f6081a = integer;
                    this.f6195v = (integer + 0.5f) / 100.0f;
                    break;
                case l1.c.f8508d /* 9 */:
                    this.f6190q = obtainStyledAttributes.getResourceId(index, this.f6190q);
                    break;
                case l1.c.f8510f /* 10 */:
                    this.f6197x = obtainStyledAttributes.getBoolean(index, this.f6197x);
                    break;
                case 11:
                    this.m = obtainStyledAttributes.getResourceId(index, this.m);
                    break;
                case 12:
                    this.f6182h = obtainStyledAttributes.getResourceId(index, this.f6182h);
                    break;
                case 13:
                    this.f6180f = obtainStyledAttributes.getResourceId(index, this.f6180f);
                    break;
                case 14:
                    this.f6181g = obtainStyledAttributes.getResourceId(index, this.f6181g);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.view.View r11, float r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.m.g(android.view.View, float):void");
    }

    public final void h(View view, String str) {
        Method method;
        boolean z10;
        String str2;
        if (str != null) {
            if (str.startsWith(".")) {
                if (str.length() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    str = str.substring(1).toLowerCase(Locale.ROOT);
                }
                for (String str3 : this.f6084d.keySet()) {
                    String lowerCase = str3.toLowerCase(Locale.ROOT);
                    if (z10 || lowerCase.matches(str)) {
                        i5.b bVar = (i5.b) this.f6084d.get(str3);
                        if (bVar != null) {
                            Class<?> cls = view.getClass();
                            String str4 = bVar.f6815b;
                            if (!bVar.f6814a) {
                                str2 = "set" + str4;
                            } else {
                                str2 = str4;
                            }
                            try {
                                int ordinal = bVar.f6816c.ordinal();
                                Class cls2 = Integer.TYPE;
                                Class cls3 = Float.TYPE;
                                switch (ordinal) {
                                    case 0:
                                    case 7:
                                        cls.getMethod(str2, cls2).invoke(view, Integer.valueOf(bVar.f6817d));
                                        continue;
                                    case DSiCameraSource.FrontCamera /* 1 */:
                                        cls.getMethod(str2, cls3).invoke(view, Float.valueOf(bVar.f6818e));
                                        continue;
                                    case 2:
                                        cls.getMethod(str2, cls2).invoke(view, Integer.valueOf(bVar.f6821h));
                                        continue;
                                    case 3:
                                        Method method2 = cls.getMethod(str2, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(bVar.f6821h);
                                        method2.invoke(view, colorDrawable);
                                        continue;
                                    case 4:
                                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.f6819f);
                                        continue;
                                    case l1.c.f8511g /* 5 */:
                                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f6820g));
                                        continue;
                                    case l1.c.f8509e /* 6 */:
                                        cls.getMethod(str2, cls3).invoke(view, Float.valueOf(bVar.f6818e));
                                        continue;
                                }
                            } catch (IllegalAccessException e6) {
                                StringBuilder u4 = w.d.u(" Custom Attribute \"", str4, "\" not found on ");
                                u4.append(cls.getName());
                                Log.e("TransitionLayout", u4.toString(), e6);
                            } catch (NoSuchMethodException e10) {
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e10);
                            } catch (InvocationTargetException e11) {
                                StringBuilder u10 = w.d.u(" Custom Attribute \"", str4, "\" not found on ");
                                u10.append(cls.getName());
                                Log.e("TransitionLayout", u10.toString(), e11);
                            }
                        }
                    }
                }
                return;
            }
            if (this.f6185k.containsKey(str)) {
                method = (Method) this.f6185k.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.f6185k.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f6185k.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + d0.d.W(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.f6186l + "\"on class " + view.getClass().getSimpleName() + " " + d0.d.W(view));
            }
        }
    }

    @Override // h5.b
    public final void d(HashSet hashSet) {
    }
}
