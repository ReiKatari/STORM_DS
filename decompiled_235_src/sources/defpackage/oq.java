package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oq  reason: default package */
/* loaded from: classes.dex */
public final class oq extends CheckedTextView {
    public final pq A;
    public final z9 B;
    public final ms L;
    public lr R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:7:0x0059, B:16:0x007f, B:18:0x0086, B:19:0x008d, B:21:0x0094, B:11:0x0068, B:13:0x006e, B:15:0x0074), top: B:29:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:7:0x0059, B:16:0x007f, B:18:0x0086, B:19:0x008d, B:21:0x0094, B:11:0x0068, B:13:0x006e, B:15:0x0074), top: B:29:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        h67.a(context);
        h57.a(this, getContext());
        ms msVar = new ms(this);
        this.L = msVar;
        msVar.f(attributeSet, R.attr.checkedTextViewStyle);
        msVar.b();
        z9 z9Var = new z9(this);
        this.B = z9Var;
        z9Var.k(attributeSet, R.attr.checkedTextViewStyle);
        this.A = new pq(this);
        Context context2 = getContext();
        int[] iArr = m75.l;
        m44 A = m44.A(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) A.L;
        ao7.m(this, getContext(), iArr, attributeSet, (TypedArray) A.L, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(hf.S(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(A.g(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(bp1.c(typedArray.getInt(3, -1), null));
                }
                A.D();
                getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(hf.S(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            A.D();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            A.D();
            throw th;
        }
    }

    private lr getEmojiTextViewHelper() {
        if (this.R == null) {
            this.R = new lr(this);
        }
        return this.R;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ms msVar = this.L;
        if (msVar != null) {
            msVar.b();
        }
        z9 z9Var = this.B;
        if (z9Var != null) {
            z9Var.a();
        }
        pq pqVar = this.A;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ii2.Z(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        z9 z9Var = this.B;
        if (z9Var != null) {
            return z9Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        z9 z9Var = this.B;
        if (z9Var != null) {
            return z9Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        pq pqVar = this.A;
        if (pqVar != null) {
            return (ColorStateList) pqVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        pq pqVar = this.A;
        if (pqVar != null) {
            return (PorterDuff.Mode) pqVar.b;
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
        l.G(editorInfo, onCreateInputConnection, this);
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
        z9 z9Var = this.B;
        if (z9Var != null) {
            z9Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        z9 z9Var = this.B;
        if (z9Var != null) {
            z9Var.o(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        pq pqVar = this.A;
        if (pqVar != null) {
            if (pqVar.e) {
                pqVar.e = false;
                return;
            }
            pqVar.e = true;
            pqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.L;
        if (msVar != null) {
            msVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ms msVar = this.L;
        if (msVar != null) {
            msVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ii2.c0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        z9 z9Var = this.B;
        if (z9Var != null) {
            z9Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        z9 z9Var = this.B;
        if (z9Var != null) {
            z9Var.u(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        pq pqVar = this.A;
        if (pqVar != null) {
            pqVar.a = colorStateList;
            pqVar.c = true;
            pqVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        pq pqVar = this.A;
        if (pqVar != null) {
            pqVar.b = mode;
            pqVar.d = true;
            pqVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ms msVar = this.L;
        msVar.k(colorStateList);
        msVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ms msVar = this.L;
        msVar.l(mode);
        msVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ms msVar = this.L;
        if (msVar != null) {
            msVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(hf.S(getContext(), i));
    }
}
