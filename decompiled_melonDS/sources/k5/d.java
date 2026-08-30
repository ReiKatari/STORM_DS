package k5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public a f7968a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7969b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7970c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7971d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7972e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7973f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7974g;

    /* renamed from: h  reason: collision with root package name */
    public int f7975h;

    /* renamed from: i  reason: collision with root package name */
    public int f7976i;

    /* renamed from: j  reason: collision with root package name */
    public int f7977j;

    /* renamed from: k  reason: collision with root package name */
    public View f7978k;

    /* renamed from: l  reason: collision with root package name */
    public View f7979l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7980n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f7981o;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7969b = false;
        this.f7970c = 0;
        this.f7971d = 0;
        this.f7972e = -1;
        this.f7973f = -1;
        this.f7974g = 0;
        this.f7975h = 0;
        this.f7981o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j5.a.f7450b);
        this.f7970c = obtainStyledAttributes.getInteger(0, 0);
        this.f7973f = obtainStyledAttributes.getResourceId(1, -1);
        this.f7971d = obtainStyledAttributes.getInteger(2, 0);
        this.f7972e = obtainStyledAttributes.getInteger(6, -1);
        this.f7974g = obtainStyledAttributes.getInt(5, 0);
        this.f7975h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f7969b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1167q0;
            a aVar = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1167q0;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1169s0;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1168r0);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    aVar = (a) constructor.newInstance(context, attributeSet);
                } catch (Exception e6) {
                    o.m("Could not inflate Behavior subclass ".concat(string), e6);
                    throw null;
                }
            }
            this.f7968a = aVar;
        }
        obtainStyledAttributes.recycle();
        a aVar2 = this.f7968a;
        if (aVar2 != null) {
            aVar2.c(this);
        }
    }

    public final boolean a(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            return this.f7980n;
        }
        return this.m;
    }

    public d() {
        super(-2, -2);
        this.f7969b = false;
        this.f7970c = 0;
        this.f7971d = 0;
        this.f7972e = -1;
        this.f7973f = -1;
        this.f7974g = 0;
        this.f7975h = 0;
        this.f7981o = new Rect();
    }

    public d(d dVar) {
        super((ViewGroup.MarginLayoutParams) dVar);
        this.f7969b = false;
        this.f7970c = 0;
        this.f7971d = 0;
        this.f7972e = -1;
        this.f7973f = -1;
        this.f7974g = 0;
        this.f7975h = 0;
        this.f7981o = new Rect();
    }

    public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7969b = false;
        this.f7970c = 0;
        this.f7971d = 0;
        this.f7972e = -1;
        this.f7973f = -1;
        this.f7974g = 0;
        this.f7975h = 0;
        this.f7981o = new Rect();
    }

    public d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7969b = false;
        this.f7970c = 0;
        this.f7971d = 0;
        this.f7972e = -1;
        this.f7973f = -1;
        this.f7974g = 0;
        this.f7975h = 0;
        this.f7981o = new Rect();
    }
}
