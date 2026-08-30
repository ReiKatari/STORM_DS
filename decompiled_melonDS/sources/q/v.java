package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class v extends ImageButton {
    public final a4.k2 A;
    public final c8.c0 B;
    public boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c3.a(context);
        this.L = false;
        b3.a(this, getContext());
        a4.k2 k2Var = new a4.k2(this);
        this.A = k2Var;
        k2Var.k(attributeSet, i2);
        c8.c0 c0Var = new c8.c0(this);
        this.B = c0Var;
        c0Var.k(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.a();
        }
        c8.c0 c0Var = this.B;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            return k2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            return k2Var.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        pi.l lVar;
        c8.c0 c0Var = this.B;
        if (c0Var == null || (lVar = (pi.l) c0Var.f2626d) == null) {
            return null;
        }
        return (ColorStateList) lVar.f11753c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        pi.l lVar;
        c8.c0 c0Var = this.B;
        if (c0Var == null || (lVar = (pi.l) c0Var.f2626d) == null) {
            return null;
        }
        return (PorterDuff.Mode) lVar.f11754d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.B.f2625c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.o(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        c8.c0 c0Var = this.B;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        c8.c0 c0Var = this.B;
        if (c0Var != null && drawable != null && !this.L) {
            c0Var.f2624b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0Var != null) {
            c0Var.b();
            if (!this.L) {
                ImageView imageView = (ImageView) c0Var.f2625c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(c0Var.f2624b);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.L = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        c8.c0 c0Var = this.B;
        ImageView imageView = (ImageView) c0Var.f2625c;
        if (i2 != 0) {
            Drawable p10 = k7.w.p(imageView.getContext(), i2);
            if (p10 != null) {
                l1.a(p10);
            }
            imageView.setImageDrawable(p10);
        } else {
            imageView.setImageDrawable(null);
        }
        c0Var.b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        c8.c0 c0Var = this.B;
        if (c0Var != null) {
            c0Var.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.u(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        c8.c0 c0Var = this.B;
        if (c0Var != null) {
            if (((pi.l) c0Var.f2626d) == null) {
                c0Var.f2626d = new Object();
            }
            pi.l lVar = (pi.l) c0Var.f2626d;
            lVar.f11753c = colorStateList;
            lVar.f11752b = true;
            c0Var.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        c8.c0 c0Var = this.B;
        if (c0Var != null) {
            if (((pi.l) c0Var.f2626d) == null) {
                c0Var.f2626d = new Object();
            }
            pi.l lVar = (pi.l) c0Var.f2626d;
            lVar.f11754d = mode;
            lVar.f11751a = true;
            c0Var.b();
        }
    }
}
