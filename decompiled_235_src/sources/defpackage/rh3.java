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
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rh3  reason: default package */
/* loaded from: classes.dex */
public final class rh3 extends jg3 {
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

    public rh3() {
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

    @Override // defpackage.jg3
    public final void a(HashMap hashMap) {
        throw null;
    }

    @Override // defpackage.jg3
    /* renamed from: b */
    public final jg3 clone() {
        rh3 rh3Var = new rh3();
        super.c(this);
        rh3Var.l = this.l;
        rh3Var.m = this.m;
        rh3Var.n = this.n;
        rh3Var.o = this.o;
        rh3Var.p = this.p;
        rh3Var.q = this.q;
        rh3Var.r = this.r;
        rh3Var.e = this.e;
        rh3Var.s = this.s;
        rh3Var.t = this.t;
        rh3Var.u = this.u;
        rh3Var.v = this.v;
        rh3Var.w = this.w;
        rh3Var.x = this.x;
        rh3Var.i = this.i;
        rh3Var.j = this.j;
        rh3Var.k = this.k;
        return rh3Var;
    }

    @Override // defpackage.jg3
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e75.i);
        SparseIntArray sparseIntArray = qh3.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = qh3.a;
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
                case 6:
                    this.p = obtainStyledAttributes.getResourceId(index, this.p);
                    break;
                case 7:
                    if (MotionLayout.t1) {
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
                case 12:
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
    */
    public final void g(View view, float f) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        View findViewById;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        boolean z8 = false;
        if (this.q != -1) {
            if (this.r == null) {
                this.r = ((ViewGroup) view.getParent()).findViewById(this.q);
            }
            i(this.i, this.r, this.x);
            i(this.j, view, this.x);
            boolean intersect = this.i.intersect(this.j);
            boolean z9 = this.s;
            if (intersect) {
                if (z9) {
                    this.s = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.u) {
                    this.u = false;
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.t = true;
            } else {
                if (!z9) {
                    this.s = true;
                    z = true;
                } else {
                    z = false;
                }
                if (this.t) {
                    this.t = false;
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.u = true;
                boolean z10 = z5;
                z6 = false;
                z8 = z10;
            }
            z7 = z6;
        } else {
            boolean z11 = this.s;
            float f2 = this.v;
            if (z11) {
                if ((this.w - f2) * (f - f2) < RecyclerView.B1) {
                    this.s = false;
                    z = true;
                    z2 = this.t;
                    float f3 = this.v;
                    if (!z2) {
                        float f4 = f - f3;
                        if ((this.w - f3) * f4 < RecyclerView.B1 && f4 < RecyclerView.B1) {
                            this.t = false;
                            z3 = true;
                            z4 = this.u;
                            float f5 = this.v;
                            if (z4) {
                                float f6 = f - f5;
                                if ((this.w - f5) * f6 < RecyclerView.B1 && f6 > RecyclerView.B1) {
                                    this.u = false;
                                    z8 = z3;
                                }
                            } else if (Math.abs(f - f5) > this.e) {
                                this.u = true;
                            }
                            z7 = false;
                            z8 = z3;
                        }
                    } else if (Math.abs(f - f3) > this.e) {
                        this.t = true;
                    }
                    z3 = false;
                    z4 = this.u;
                    float f52 = this.v;
                    if (z4) {
                    }
                    z7 = false;
                    z8 = z3;
                }
            } else if (Math.abs(f - f2) > this.e) {
                this.s = true;
            }
            z = false;
            z2 = this.t;
            float f32 = this.v;
            if (!z2) {
            }
            z3 = false;
            z4 = this.u;
            float f522 = this.v;
            if (z4) {
            }
            z7 = false;
            z8 = z3;
        }
        this.w = f;
        if (z8 || z || z7) {
            ((MotionLayout) view.getParent()).getClass();
        }
        if (this.m == -1) {
            findViewById = view;
        } else {
            findViewById = ((MotionLayout) view.getParent()).findViewById(this.m);
        }
        if (z8) {
            String str = this.n;
            if (str != null) {
                h(findViewById, str);
            }
            if (this.f != -1) {
                ((MotionLayout) view.getParent()).B(this.f, findViewById);
            }
        }
        if (z7) {
            String str2 = this.o;
            if (str2 != null) {
                h(findViewById, str2);
            }
            if (this.g != -1) {
                ((MotionLayout) view.getParent()).B(this.g, findViewById);
            }
        }
        if (z) {
            String str3 = this.l;
            if (str3 != null) {
                h(findViewById, str3);
            }
            if (this.h != -1) {
                ((MotionLayout) view.getParent()).B(this.h, findViewById);
            }
        }
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
                        j11 j11Var = (j11) this.d.get(str3);
                        if (j11Var != null) {
                            Class<?> cls = view.getClass();
                            String str4 = j11Var.b;
                            if (!j11Var.a) {
                                str2 = i61.m("set", str4);
                            } else {
                                str2 = str4;
                            }
                            try {
                                int ordinal = j11Var.c.ordinal();
                                Class cls2 = Integer.TYPE;
                                Class cls3 = Float.TYPE;
                                switch (ordinal) {
                                    case 0:
                                    case 7:
                                        cls.getMethod(str2, cls2).invoke(view, Integer.valueOf(j11Var.d));
                                        continue;
                                    case 1:
                                        cls.getMethod(str2, cls3).invoke(view, Float.valueOf(j11Var.e));
                                        continue;
                                    case 2:
                                        cls.getMethod(str2, cls2).invoke(view, Integer.valueOf(j11Var.h));
                                        continue;
                                    case 3:
                                        Method method2 = cls.getMethod(str2, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(j11Var.h);
                                        method2.invoke(view, colorDrawable);
                                        continue;
                                    case 4:
                                        cls.getMethod(str2, CharSequence.class).invoke(view, j11Var.f);
                                        continue;
                                    case 5:
                                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(j11Var.g));
                                        continue;
                                    case 6:
                                        cls.getMethod(str2, cls3).invoke(view, Float.valueOf(j11Var.e));
                                        continue;
                                }
                            } catch (IllegalAccessException e) {
                                StringBuilder t = i61.t(" Custom Attribute \"", str4, "\" not found on ");
                                t.append(cls.getName());
                                Log.e("TransitionLayout", t.toString(), e);
                            } catch (NoSuchMethodException e2) {
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str2, e2);
                            } catch (InvocationTargetException e3) {
                                StringBuilder t2 = i61.t(" Custom Attribute \"", str4, "\" not found on ");
                                t2.append(cls.getName());
                                Log.e("TransitionLayout", t2.toString(), e3);
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
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + lb4.y(view));
                    return;
                }
            }
            try {
                method.invoke(view, null);
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.l + "\"on class " + view.getClass().getSimpleName() + " " + lb4.y(view));
            }
        }
    }

    @Override // defpackage.jg3
    public final void d(HashSet hashSet) {
    }
}
