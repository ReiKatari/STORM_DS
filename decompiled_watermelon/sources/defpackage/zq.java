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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zq  reason: default package */
/* loaded from: classes.dex */
public class zq extends ImageButton {
    public final y9 A;
    public final sh B;
    public boolean L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qt6.a(context);
        this.L = false;
        qs6.a(this, getContext());
        y9 y9Var = new y9(this);
        this.A = y9Var;
        y9Var.k(attributeSet, i);
        sh shVar = new sh(this);
        this.B = shVar;
        shVar.j(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.a();
        }
        sh shVar = this.B;
        if (shVar != null) {
            shVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        y9 y9Var = this.A;
        if (y9Var != null) {
            return y9Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y9 y9Var = this.A;
        if (y9Var != null) {
            return y9Var.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        zw0 zw0Var;
        sh shVar = this.B;
        if (shVar == null || (zw0Var = (zw0) shVar.d) == null) {
            return null;
        }
        return (ColorStateList) zw0Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        zw0 zw0Var;
        sh shVar = this.B;
        if (shVar == null || (zw0Var = (zw0) shVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) zw0Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.B.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.o(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        sh shVar = this.B;
        if (shVar != null) {
            shVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        sh shVar = this.B;
        if (shVar != null && drawable != null && !this.L) {
            shVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (shVar != null) {
            shVar.b();
            if (!this.L) {
                ImageView imageView = (ImageView) shVar.c;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(shVar.b);
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
        sh shVar = this.B;
        ImageView imageView = (ImageView) shVar.c;
        if (i != 0) {
            Drawable M = l07.M(imageView.getContext(), i);
            if (M != null) {
                vk1.a(M);
            }
            imageView.setImageDrawable(M);
        } else {
            imageView.setImageDrawable(null);
        }
        shVar.b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        sh shVar = this.B;
        if (shVar != null) {
            shVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.u(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        sh shVar = this.B;
        if (shVar != null) {
            if (((zw0) shVar.d) == null) {
                shVar.d = new Object();
            }
            zw0 zw0Var = (zw0) shVar.d;
            zw0Var.c = colorStateList;
            zw0Var.b = true;
            shVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        sh shVar = this.B;
        if (shVar != null) {
            if (((zw0) shVar.d) == null) {
                shVar.d = new Object();
            }
            zw0 zw0Var = (zw0) shVar.d;
            zw0Var.d = mode;
            zw0Var.a = true;
            shVar.b();
        }
    }
}
