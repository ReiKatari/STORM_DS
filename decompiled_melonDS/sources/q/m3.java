package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m3 implements h1 {

    /* renamed from: a  reason: collision with root package name */
    public final Toolbar f11964a;

    /* renamed from: b  reason: collision with root package name */
    public int f11965b;

    /* renamed from: c  reason: collision with root package name */
    public final View f11966c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f11967d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f11968e;

    /* renamed from: f  reason: collision with root package name */
    public final Drawable f11969f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11970g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f11971h;

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f11972i;

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f11973j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f11974k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11975l;
    public j m;

    /* renamed from: n  reason: collision with root package name */
    public final int f11976n;

    /* renamed from: o  reason: collision with root package name */
    public final Drawable f11977o;

    public m3(Toolbar toolbar, boolean z10) {
        boolean z11;
        Drawable drawable;
        this.f11976n = 0;
        this.f11964a = toolbar;
        this.f11971h = toolbar.getTitle();
        this.f11972i = toolbar.getSubtitle();
        if (this.f11971h != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11970g = z11;
        this.f11969f = toolbar.getNavigationIcon();
        p1.c1 o5 = p1.c1.o(toolbar.getContext(), null, k.a.f7911a, R.attr.actionBarStyle);
        TypedArray typedArray = (TypedArray) o5.B;
        int i2 = 15;
        this.f11977o = o5.h(15);
        if (z10) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.f11970g = true;
                this.f11971h = text;
                if ((this.f11965b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.f11970g) {
                        a6.x0.p(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.f11972i = text2;
                if ((this.f11965b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable h2 = o5.h(20);
            if (h2 != null) {
                this.f11968e = h2;
                c();
            }
            Drawable h10 = o5.h(17);
            if (h10 != null) {
                this.f11967d = h10;
                c();
            }
            if (this.f11969f == null && (drawable = this.f11977o) != null) {
                this.f11969f = drawable;
                if ((this.f11965b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.f11966c;
                if (view != null && (this.f11965b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f11966c = inflate;
                if (inflate != null && (this.f11965b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                a(this.f11965b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.e();
                toolbar.f1021q0.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f1014i0 = resourceId2;
                z0 z0Var = toolbar.B;
                if (z0Var != null) {
                    z0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f1015j0 = resourceId3;
                z0 z0Var2 = toolbar.L;
                if (z0Var2 != null) {
                    z0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f11977o = toolbar.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.f11965b = i2;
        }
        o5.p();
        if (R.string.abc_action_bar_up_description != this.f11976n) {
            this.f11976n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i10 = this.f11976n;
                this.f11973j = i10 != 0 ? toolbar.getContext().getString(i10) : null;
                b();
            }
        }
        this.f11973j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new l3(this));
    }

    public final void a(int i2) {
        View view;
        int i10 = this.f11965b ^ i2;
        this.f11965b = i2;
        if (i10 != 0) {
            int i11 = i10 & 4;
            Toolbar toolbar = this.f11964a;
            if (i11 != 0) {
                if ((i2 & 4) != 0) {
                    b();
                }
                if ((this.f11965b & 4) != 0) {
                    Drawable drawable = this.f11969f;
                    if (drawable == null) {
                        drawable = this.f11977o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i10 & 3) != 0) {
                c();
            }
            if ((i10 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    toolbar.setTitle(this.f11971h);
                    toolbar.setSubtitle(this.f11972i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i10 & 16) != 0 && (view = this.f11966c) != null) {
                if ((i2 & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f11965b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f11973j);
            Toolbar toolbar = this.f11964a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f11976n);
            } else {
                toolbar.setNavigationContentDescription(this.f11973j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i2 = this.f11965b;
        if ((i2 & 2) != 0) {
            if ((i2 & 1) != 0) {
                drawable = this.f11968e;
                if (drawable == null) {
                    drawable = this.f11967d;
                }
            } else {
                drawable = this.f11967d;
            }
        } else {
            drawable = null;
        }
        this.f11964a.setLogo(drawable);
    }
}
