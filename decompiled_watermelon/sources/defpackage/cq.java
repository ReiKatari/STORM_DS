package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cq  reason: default package */
/* loaded from: classes.dex */
public final class cq extends CheckedTextView {
    public final dq A;
    public final y9 B;
    public final zr L;
    public yq R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:7:0x0059, B:16:0x007f, B:18:0x0086, B:19:0x008d, B:21:0x0094, B:11:0x0068, B:13:0x006e, B:15:0x0074), top: B:29:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:7:0x0059, B:16:0x007f, B:18:0x0086, B:19:0x008d, B:21:0x0094, B:11:0x0068, B:13:0x006e, B:15:0x0074), top: B:29:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cq(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            defpackage.qt6.a(r8)
            r5 = 2130968780(0x7f0400cc, float:1.7546223E38)
            r7.<init>(r8, r9, r5)
            android.content.Context r8 = r7.getContext()
            defpackage.qs6.a(r7, r8)
            zr r8 = new zr
            r8.<init>(r7)
            r7.L = r8
            r8.f(r9, r5)
            r8.b()
            y9 r8 = new y9
            r8.<init>(r7)
            r7.B = r8
            r8.k(r9, r5)
            dq r8 = new dq
            r8.<init>(r7)
            r7.A = r8
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.by4.l
            n85 r8 = defpackage.n85.q(r8, r9, r2, r5)
            java.lang.Object r0 = r8.L
            r6 = r0
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            android.content.Context r1 = r7.getContext()
            java.lang.Object r0 = r8.L
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r7
            r3 = r9
            defpackage.aa7.m(r0, r1, r2, r3, r4, r5)
            r7 = 1
            boolean r9 = r6.hasValue(r7)     // Catch: java.lang.Throwable -> L65
            r1 = 0
            if (r9 == 0) goto L68
            int r7 = r6.getResourceId(r7, r1)     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L68
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L65 android.content.res.Resources.NotFoundException -> L68
            android.graphics.drawable.Drawable r7 = defpackage.l07.M(r9, r7)     // Catch: java.lang.Throwable -> L65 android.content.res.Resources.NotFoundException -> L68
            r0.setCheckMarkDrawable(r7)     // Catch: java.lang.Throwable -> L65 android.content.res.Resources.NotFoundException -> L68
            goto L7f
        L65:
            r0 = move-exception
            r7 = r0
            goto Lac
        L68:
            boolean r7 = r6.hasValue(r1)     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L7f
            int r7 = r6.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L65
            if (r7 == 0) goto L7f
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L65
            android.graphics.drawable.Drawable r7 = defpackage.l07.M(r9, r7)     // Catch: java.lang.Throwable -> L65
            r0.setCheckMarkDrawable(r7)     // Catch: java.lang.Throwable -> L65
        L7f:
            r7 = 2
            boolean r9 = r6.hasValue(r7)     // Catch: java.lang.Throwable -> L65
            if (r9 == 0) goto L8d
            android.content.res.ColorStateList r7 = r8.e(r7)     // Catch: java.lang.Throwable -> L65
            r0.setCheckMarkTintList(r7)     // Catch: java.lang.Throwable -> L65
        L8d:
            r7 = 3
            boolean r9 = r6.hasValue(r7)     // Catch: java.lang.Throwable -> L65
            if (r9 == 0) goto La1
            r9 = -1
            int r7 = r6.getInt(r7, r9)     // Catch: java.lang.Throwable -> L65
            r9 = 0
            android.graphics.PorterDuff$Mode r7 = defpackage.vk1.c(r7, r9)     // Catch: java.lang.Throwable -> L65
            r0.setCheckMarkTintMode(r7)     // Catch: java.lang.Throwable -> L65
        La1:
            r8.t()
            yq r7 = r0.getEmojiTextViewHelper()
            r7.b(r3, r5)
            return
        Lac:
            r8.t()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private yq getEmojiTextViewHelper() {
        if (this.R == null) {
            this.R = new yq(this);
        }
        return this.R;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        zr zrVar = this.L;
        if (zrVar != null) {
            zrVar.b();
        }
        y9 y9Var = this.B;
        if (y9Var != null) {
            y9Var.a();
        }
        dq dqVar = this.A;
        if (dqVar != null) {
            dqVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mj2.Z(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        y9 y9Var = this.B;
        if (y9Var != null) {
            return y9Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        y9 y9Var = this.B;
        if (y9Var != null) {
            return y9Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        dq dqVar = this.A;
        if (dqVar != null) {
            return (ColorStateList) dqVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        dq dqVar = this.A;
        if (dqVar != null) {
            return (PorterDuff.Mode) dqVar.b;
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
        tq5.x(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        y9 y9Var = this.B;
        if (y9Var != null) {
            y9Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        y9 y9Var = this.B;
        if (y9Var != null) {
            y9Var.o(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        dq dqVar = this.A;
        if (dqVar != null) {
            if (dqVar.e) {
                dqVar.e = false;
                return;
            }
            dqVar.e = true;
            dqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.L;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.L;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mj2.d0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        y9 y9Var = this.B;
        if (y9Var != null) {
            y9Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        y9 y9Var = this.B;
        if (y9Var != null) {
            y9Var.u(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        dq dqVar = this.A;
        if (dqVar != null) {
            dqVar.a = colorStateList;
            dqVar.c = true;
            dqVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        dq dqVar = this.A;
        if (dqVar != null) {
            dqVar.b = mode;
            dqVar.d = true;
            dqVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        zr zrVar = this.L;
        zrVar.k(colorStateList);
        zrVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        zr zrVar = this.L;
        zrVar.l(mode);
        zrVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        zr zrVar = this.L;
        if (zrVar != null) {
            zrVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(l07.M(getContext(), i));
    }
}
