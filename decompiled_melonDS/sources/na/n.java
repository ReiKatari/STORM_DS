package na;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public k0.d f10198a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public k0.d f10199b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public k0.d f10200c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public k0.d f10201d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public d f10202e = new a(0.0f);

    /* renamed from: f  reason: collision with root package name */
    public d f10203f = new a(0.0f);

    /* renamed from: g  reason: collision with root package name */
    public d f10204g = new a(0.0f);

    /* renamed from: h  reason: collision with root package name */
    public d f10205h = new a(0.0f);

    /* renamed from: i  reason: collision with root package name */
    public f f10206i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public f f10207j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public f f10208k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public f f10209l = new Object();

    public static m a(Context context, int i2, int i10, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i10 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i10, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(t9.a.f13173y);
        try {
            int i11 = obtainStyledAttributes.getInt(0, 0);
            int i12 = obtainStyledAttributes.getInt(3, i11);
            int i13 = obtainStyledAttributes.getInt(4, i11);
            int i14 = obtainStyledAttributes.getInt(2, i11);
            int i15 = obtainStyledAttributes.getInt(1, i11);
            d c4 = c(obtainStyledAttributes, 5, aVar);
            d c10 = c(obtainStyledAttributes, 8, c4);
            d c11 = c(obtainStyledAttributes, 9, c4);
            d c12 = c(obtainStyledAttributes, 7, c4);
            d c13 = c(obtainStyledAttributes, 6, c4);
            m mVar = new m();
            mVar.f10186a = k7.w.h(i12);
            mVar.f10190e = c10;
            mVar.f10187b = k7.w.h(i13);
            mVar.f10191f = c11;
            mVar.f10188c = k7.w.h(i14);
            mVar.f10192g = c12;
            mVar.f10189d = k7.w.h(i15);
            mVar.f10193h = c13;
            return mVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static m b(Context context, AttributeSet attributeSet, int i2, int i10) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t9.a.f13166r, i2, i10);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static d c(TypedArray typedArray, int i2, d dVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            int i10 = peekValue.type;
            if (i10 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i10 == 6) {
                return new k(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean d() {
        if ((this.f10199b instanceof l) && (this.f10198a instanceof l) && (this.f10200c instanceof l) && (this.f10201d instanceof l)) {
            return true;
        }
        return false;
    }

    public final boolean e(RectF rectF) {
        boolean z10;
        boolean z11;
        if (this.f10209l.getClass().equals(f.class) && this.f10207j.getClass().equals(f.class) && this.f10206i.getClass().equals(f.class) && this.f10208k.getClass().equals(f.class)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float a10 = this.f10202e.a(rectF);
        if (this.f10203f.a(rectF) == a10 && this.f10205h.a(rectF) == a10 && this.f10204g.a(rectF) == a10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 || !z11 || !d()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [na.m, java.lang.Object] */
    public final m f() {
        ?? obj = new Object();
        obj.f10186a = this.f10198a;
        obj.f10187b = this.f10199b;
        obj.f10188c = this.f10200c;
        obj.f10189d = this.f10201d;
        obj.f10190e = this.f10202e;
        obj.f10191f = this.f10203f;
        obj.f10192g = this.f10204g;
        obj.f10193h = this.f10205h;
        obj.f10194i = this.f10206i;
        obj.f10195j = this.f10207j;
        obj.f10196k = this.f10208k;
        obj.f10197l = this.f10209l;
        return obj;
    }

    public final String toString() {
        return "[" + this.f10202e + ", " + this.f10203f + ", " + this.f10204g + ", " + this.f10205h + "]";
    }
}
