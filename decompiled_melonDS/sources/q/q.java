package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends CheckedTextView {
    public final n2.o1 A;
    public final a4.k2 B;
    public final v0 L;
    public u R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:7:0x0059, B:16:0x007f, B:18:0x0086, B:19:0x008d, B:21:0x0094, B:11:0x0068, B:13:0x006e, B:15:0x0074), top: B:29:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:7:0x0059, B:16:0x007f, B:18:0x0086, B:19:0x008d, B:21:0x0094, B:11:0x0068, B:13:0x006e, B:15:0x0074), top: B:29:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            q.c3.a(r8)
            r6 = 2130968780(0x7f0400cc, float:1.7546223E38)
            r7.<init>(r8, r9, r6)
            android.content.Context r8 = r7.getContext()
            q.b3.a(r7, r8)
            q.v0 r8 = new q.v0
            r8.<init>(r7)
            r7.L = r8
            r8.f(r9, r6)
            r8.b()
            a4.k2 r8 = new a4.k2
            r8.<init>(r7)
            r7.B = r8
            r8.k(r9, r6)
            n2.o1 r8 = new n2.o1
            r0 = 2
            r8.<init>(r7, r0)
            r7.A = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = k.a.f7922l
            p1.c1 r8 = p1.c1.o(r8, r9, r3, r6)
            java.lang.Object r0 = r8.B
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r7.getContext()
            java.lang.Object r1 = r8.B
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r7
            r4 = r9
            a6.x0.n(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L65
            r3 = 0
            if (r2 == 0) goto L68
            int r9 = r0.getResourceId(r9, r3)     // Catch: java.lang.Throwable -> L65
            if (r9 == 0) goto L68
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L65 android.content.res.Resources.NotFoundException -> L68
            android.graphics.drawable.Drawable r9 = k7.w.p(r2, r9)     // Catch: java.lang.Throwable -> L65 android.content.res.Resources.NotFoundException -> L68
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L65 android.content.res.Resources.NotFoundException -> L68
            goto L7f
        L65:
            r0 = move-exception
            r9 = r0
            goto Lac
        L68:
            boolean r9 = r0.hasValue(r3)     // Catch: java.lang.Throwable -> L65
            if (r9 == 0) goto L7f
            int r9 = r0.getResourceId(r3, r3)     // Catch: java.lang.Throwable -> L65
            if (r9 == 0) goto L7f
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L65
            android.graphics.drawable.Drawable r9 = k7.w.p(r2, r9)     // Catch: java.lang.Throwable -> L65
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L65
        L7f:
            r9 = 2
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto L8d
            android.content.res.ColorStateList r9 = r8.e(r9)     // Catch: java.lang.Throwable -> L65
            r7.setCheckMarkTintList(r9)     // Catch: java.lang.Throwable -> L65
        L8d:
            r9 = 3
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L65
            if (r2 == 0) goto La1
            r2 = -1
            int r9 = r0.getInt(r9, r2)     // Catch: java.lang.Throwable -> L65
            r0 = 0
            android.graphics.PorterDuff$Mode r9 = q.l1.c(r9, r0)     // Catch: java.lang.Throwable -> L65
            r7.setCheckMarkTintMode(r9)     // Catch: java.lang.Throwable -> L65
        La1:
            r8.p()
            q.u r8 = r7.getEmojiTextViewHelper()
            r8.b(r4, r6)
            return
        Lac:
            r8.p()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q.q.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private u getEmojiTextViewHelper() {
        if (this.R == null) {
            this.R = new u(this);
        }
        return this.R;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        v0 v0Var = this.L;
        if (v0Var != null) {
            v0Var.b();
        }
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            k2Var.a();
        }
        n2.o1 o1Var = this.A;
        if (o1Var != null) {
            o1Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return aj.g.w0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            return k2Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            return k2Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        n2.o1 o1Var = this.A;
        if (o1Var != null) {
            return (ColorStateList) o1Var.f9969f;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        n2.o1 o1Var = this.A;
        if (o1Var != null) {
            return (PorterDuff.Mode) o1Var.f9970g;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.L.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.L.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        zb.k.E(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            k2Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            k2Var.o(i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        n2.o1 o1Var = this.A;
        if (o1Var != null) {
            if (o1Var.f9967d) {
                o1Var.f9967d = false;
                return;
            }
            o1Var.f9967d = true;
            o1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.L;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.L;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(aj.g.A0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            k2Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a4.k2 k2Var = this.B;
        if (k2Var != null) {
            k2Var.u(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        n2.o1 o1Var = this.A;
        if (o1Var != null) {
            o1Var.f9969f = colorStateList;
            o1Var.f9965b = true;
            o1Var.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        n2.o1 o1Var = this.A;
        if (o1Var != null) {
            o1Var.f9970g = mode;
            o1Var.f9966c = true;
            o1Var.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.L;
        v0Var.k(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.L;
        v0Var.l(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        v0 v0Var = this.L;
        if (v0Var != null) {
            v0Var.g(context, i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(k7.w.p(getContext(), i2));
    }
}
