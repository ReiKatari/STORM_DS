package q;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class t extends EditText implements a6.w {
    public final a4.k2 A;
    public final v0 B;
    public final z L;
    public final f6.i R;

    /* renamed from: b0  reason: collision with root package name */
    public final z f12021b0;

    /* renamed from: c0  reason: collision with root package name */
    public s f12022c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v5, types: [f6.i, java.lang.Object] */
    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        c3.a(context);
        b3.a(this, getContext());
        a4.k2 k2Var = new a4.k2(this);
        this.A = k2Var;
        k2Var.k(attributeSet, R.attr.editTextStyle);
        v0 v0Var = new v0(this);
        this.B = v0Var;
        v0Var.f(attributeSet, R.attr.editTextStyle);
        v0Var.b();
        z zVar = new z();
        zVar.f12066b = this;
        this.L = zVar;
        this.R = new Object();
        z zVar2 = new z(this);
        this.f12021b0 = zVar2;
        zVar2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a10 = zVar2.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private s getSuperCaller() {
        if (this.f12022c0 == null) {
            this.f12022c0 = new s(this);
        }
        return this.f12022c0;
    }

    @Override // a6.w
    public final a6.g a(a6.g gVar) {
        this.R.getClass();
        return f6.i.a(this, gVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a4.k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.a();
        }
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return aj.g.w0(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.B.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.B.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.L) != null) {
            TextClassifier textClassifier = (TextClassifier) zVar.f12067c;
            if (textClassifier == null) {
                return q0.a((TextView) zVar.f12066b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r1 != null) goto L21;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            q.v0 r1 = r7.B
            r1.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L18
            if (r0 == 0) goto L18
            java.lang.CharSequence r3 = r7.getText()
            c6.d.a(r8, r3)
        L18:
            zb.k.E(r8, r0, r7)
            if (r0 == 0) goto L7f
            if (r1 > r2) goto L7f
            java.lang.String[] r2 = a6.x0.h(r7)
            if (r2 == 0) goto L7f
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L31
            c6.a.k(r8, r2)
            goto L46
        L31:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L3c
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L3c:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L46:
            ah.e r2 = new ah.e
            r6 = 2
            r2.<init>(r6, r7)
            if (r1 < r5) goto L55
            c6.e r1 = new c6.e
            r1.<init>(r0, r2)
        L53:
            r0 = r1
            goto L7f
        L55:
            java.lang.String[] r6 = c6.d.f2615a
            if (r1 < r5) goto L61
            java.lang.String[] r1 = c6.a.l(r8)
            if (r1 == 0) goto L75
        L5f:
            r6 = r1
            goto L75
        L61:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L66
            goto L75
        L66:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L72
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L72:
            if (r1 == 0) goto L75
            goto L5f
        L75:
            int r1 = r6.length
            if (r1 != 0) goto L79
            goto L7f
        L79:
            c6.f r1 = new c6.f
            r1.<init>(r0, r2)
            goto L53
        L7f:
            q.z r1 = r7.f12021b0
            o6.b r8 = r1.c(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q.t.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 && i2 < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z10 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && a6.x0.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z10 = c0.a(dragEvent, this, activity);
            }
        }
        if (z10) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i2) {
        ClipData primaryClip;
        a6.d dVar;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 && a6.x0.h(this) != null && (i2 == 16908322 || i2 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i11 >= 31) {
                    dVar = new a0.b(primaryClip, 1);
                } else {
                    a6.e eVar = new a6.e();
                    eVar.B = primaryClip;
                    eVar.L = 1;
                    dVar = eVar;
                }
                if (i2 == 16908322) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                dVar.M(i10);
                a6.x0.k(this, dVar.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i2);
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

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(aj.g.A0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f12021b0.d(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f12021b0.a(keyListener));
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.B;
        v0Var.k(colorStateList);
        v0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.B;
        v0Var.l(mode);
        v0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        v0 v0Var = this.B;
        if (v0Var != null) {
            v0Var.g(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.L) != null) {
            zVar.f12067c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }
}
