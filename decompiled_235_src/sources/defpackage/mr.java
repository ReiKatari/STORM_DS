package defpackage;

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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mr  reason: default package */
/* loaded from: classes.dex */
public class mr extends ImageButton {
    public final z9 A;
    public final ei B;
    public boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h67.a(context);
        this.L = false;
        h57.a(this, getContext());
        z9 z9Var = new z9(this);
        this.A = z9Var;
        z9Var.k(attributeSet, i);
        ei eiVar = new ei(this);
        this.B = eiVar;
        eiVar.j(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.a();
        }
        ei eiVar = this.B;
        if (eiVar != null) {
            eiVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        z9 z9Var = this.A;
        if (z9Var != null) {
            return z9Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        z9 z9Var = this.A;
        if (z9Var != null) {
            return z9Var.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        wz0 wz0Var;
        ei eiVar = this.B;
        if (eiVar == null || (wz0Var = (wz0) eiVar.R) == null) {
            return null;
        }
        return (ColorStateList) wz0Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        wz0 wz0Var;
        ei eiVar = this.B;
        if (eiVar == null || (wz0Var = (wz0) eiVar.R) == null) {
            return null;
        }
        return (PorterDuff.Mode) wz0Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.B.L).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.o(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        ei eiVar = this.B;
        if (eiVar != null) {
            eiVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ei eiVar = this.B;
        if (eiVar != null && drawable != null && !this.L) {
            eiVar.B = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (eiVar != null) {
            eiVar.b();
            if (!this.L) {
                ImageView imageView = (ImageView) eiVar.L;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(eiVar.B);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.L = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        ei eiVar = this.B;
        ImageView imageView = (ImageView) eiVar.L;
        if (i != 0) {
            Drawable S = hf.S(imageView.getContext(), i);
            if (S != null) {
                bp1.a(S);
            }
            imageView.setImageDrawable(S);
        } else {
            imageView.setImageDrawable(null);
        }
        eiVar.b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ei eiVar = this.B;
        if (eiVar != null) {
            eiVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        z9 z9Var = this.A;
        if (z9Var != null) {
            z9Var.u(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        ei eiVar = this.B;
        if (eiVar != null) {
            if (((wz0) eiVar.R) == null) {
                eiVar.R = new Object();
            }
            wz0 wz0Var = (wz0) eiVar.R;
            wz0Var.c = colorStateList;
            wz0Var.b = true;
            eiVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ei eiVar = this.B;
        if (eiVar != null) {
            if (((wz0) eiVar.R) == null) {
                eiVar.R = new Object();
            }
            wz0 wz0Var = (wz0) eiVar.R;
            wz0Var.d = mode;
            wz0Var.a = true;
            eiVar.b();
        }
    }
}
