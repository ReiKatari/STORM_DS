package defpackage;

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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: za3  reason: default package */
/* loaded from: classes.dex */
public final class za3 extends q93 {
    public float w;
    public float e = 0.1f;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public RectF i = new RectF();
    public RectF j = new RectF();
    public HashMap k = new HashMap();
    public String l = null;
    public int m = -1;
    public String n = null;
    public String o = null;
    public int p = -1;
    public int q = -1;
    public View r = null;
    public boolean s = true;
    public boolean t = true;
    public boolean u = true;
    public float v = Float.NaN;
    public boolean x = false;

    public za3() {
        this.d = new HashMap();
    }

    public static void i(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // defpackage.q93
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // defpackage.q93
    /* renamed from: b */
    public final q93 clone() {
        za3 za3Var = new za3();
        super.c(this);
        za3Var.l = this.l;
        za3Var.m = this.m;
        za3Var.n = this.n;
        za3Var.o = this.o;
        za3Var.p = this.p;
        za3Var.q = this.q;
        za3Var.r = this.r;
        za3Var.e = this.e;
        za3Var.s = this.s;
        za3Var.t = this.t;
        za3Var.u = this.u;
        za3Var.v = this.v;
        za3Var.w = this.w;
        za3Var.x = this.x;
        za3Var.i = this.i;
        za3Var.j = this.j;
        za3Var.k = this.k;
        return za3Var;
    }

    @Override // defpackage.q93
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx4.i);
        SparseIntArray sparseIntArray = ya3.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = ya3.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.n = obtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.o = obtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.l = obtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case ig7.b /* 6 */:
                    this.p = obtainStyledAttributes.getResourceId(index, this.p);
                    break;
                case 7:
                    if (MotionLayout.s1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        this.b = obtainStyledAttributes.getResourceId(index, this.b);
                        break;
                    }
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.a);
                    this.a = integer;
                    this.v = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.q = obtainStyledAttributes.getResourceId(index, this.q);
                    break;
                case 10:
                    this.x = obtainStyledAttributes.getBoolean(index, this.x);
                    break;
                case 11:
                    this.m = obtainStyledAttributes.getResourceId(index, this.m);
                    break;
                case mj2.L /* 12 */:
                    this.h = obtainStyledAttributes.getResourceId(index, this.h);
                    break;
                case 13:
                    this.f = obtainStyledAttributes.getResourceId(index, this.f);
                    break;
                case 14:
                    this.g = obtainStyledAttributes.getResourceId(index, this.g);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za3.g(android.view.View, float):void");
    }

    public final void h(View view, String str) {
        Method method;
        boolean z;
        String str2;
        if (str != null) {
            if (str.startsWith(".")) {
                if (str.length() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = str.substring(1).toLowerCase(Locale.ROOT);
                }
                for (String str3 : this.d.keySet()) {
                    String lowerCase = str3.toLowerCase(Locale.ROOT);
                    if (z || lowerCase.matches(str)) {
                        ey0 ey0Var = (ey0) this.d.get(str3);
                        if (ey0Var != null) {
                            Class<?> cls = view.getClass();
                            String str4 = ey0Var.b;
                            if (!ey0Var.a) {
                                str2 = b31.p("set", str4);
                            } else {
                                str2 = str4;
                            }
                            try {
                                int ordinal = ey0Var.c.ordinal();
                                Class cls2 = Integer.TYPE;
                                Class cls3 = Float.TYPE;
                                switch (ordinal) {
                                    case 0:
                                    case 7:
                                        cls.getMethod(str2, cls2).invoke(view, Integer.valueOf(ey0Var.d));
                                        continue;
                                    case 1:
                                        cls.getMethod(str2, cls3).invoke(view, Float.valueOf(ey0Var.e));
                                        continue;
                                    case 2:
                                        cls.getMethod(str2, cls2).invoke(view, Integer.valueOf(ey0Var.h));
                                        continue;
                                    case 3:
                                        Method method2 = cls.getMethod(str2, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(ey0Var.h);
                                        method2.invoke(view, colorDrawable);
                                        continue;
                                    case 4:
                                        cls.getMethod(str2, CharSequence.class).invoke(view, ey0Var.f);
                                        continue;
                                    case 5:
                                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(ey0Var.g));
                                        continue;
                                    case ig7.b /* 6 */:
                                        cls.getMethod(str2, cls3).invoke(view, Float.valueOf(ey0Var.e));
                                        continue;
                                }
                            } catch (IllegalAccessException e) {
                                StringBuilder u = b31.u(" Custom Attribute \"", str4, "\" not found on ");
                                u.append(cls.getName());
                                Log.e("TransitionLayout", u.toString(), e);
                            } catch (NoSuchMethodException e2) {
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e2);
                            } catch (InvocationTargetException e3) {
                                StringBuilder u2 = b31.u(" Custom Attribute \"", str4, "\" not found on ");
                                u2.append(cls.getName());
                                Log.e("TransitionLayout", u2.toString(), e3);
                            }
                        }
                    }
                }
                return;
            }
            if (this.k.containsKey(str)) {
                method = (Method) this.k.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, null);
                    this.k.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.k.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + b53.N(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.l + "\"on class " + view.getClass().getSimpleName() + " " + b53.N(view));
            }
        }
    }

    @Override // defpackage.q93
    public final void d(HashSet hashSet) {
    }
}
