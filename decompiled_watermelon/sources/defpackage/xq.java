package defpackage;

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
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xq  reason: default package */
/* loaded from: classes.dex */
public class xq extends EditText implements uc4 {
    public final y9 A;
    public final zr B;
    public final q03 L;
    public final ls6 R;
    public final q03 c0;
    public wq d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, ls6] */
    public xq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        qt6.a(context);
        qs6.a(this, getContext());
        y9 y9Var = new y9(this);
        this.A = y9Var;
        y9Var.k(attributeSet, R.attr.editTextStyle);
        zr zrVar = new zr(this);
        this.B = zrVar;
        zrVar.f(attributeSet, R.attr.editTextStyle);
        zrVar.b();
        q03 q03Var = new q03(10);
        q03Var.B = this;
        this.L = q03Var;
        this.R = new Object();
        q03 q03Var2 = new q03((EditText) this);
        this.c0 = q03Var2;
        q03Var2.o(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener m = q03Var2.m(keyListener);
            if (m != keyListener) {
                super.setKeyListener(m);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private wq getSuperCaller() {
        if (this.d0 == null) {
            this.d0 = new wq(this);
        }
        return this.d0;
    }

    @Override // defpackage.uc4
    public final o01 a(o01 o01Var) {
        this.R.getClass();
        return ls6.a(this, o01Var);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        y9 y9Var = this.A;
        if (y9Var != null) {
            y9Var.a();
        }
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mj2.Z(super.getCustomSelectionActionModeCallback());
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
        q03 q03Var;
        if (Build.VERSION.SDK_INT < 28 && (q03Var = this.L) != null) {
            TextClassifier textClassifier = (TextClassifier) q03Var.L;
            if (textClassifier == null) {
                return tr.a((TextView) q03Var.B);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (r1 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
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
            zr r1 = r7.B
            r1.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L18
            if (r0 == 0) goto L18
            java.lang.CharSequence r3 = r7.getText()
            defpackage.dk7.G(r8, r3)
        L18:
            defpackage.tq5.x(r8, r0, r7)
            if (r0 == 0) goto L80
            if (r1 > r2) goto L80
            java.lang.String[] r2 = defpackage.aa7.h(r7)
            if (r2 == 0) goto L80
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L31
            defpackage.yn1.k(r8, r2)
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
            a31 r2 = new a31
            r6 = 10
            r2.<init>(r6, r7)
            if (r1 < r5) goto L56
            l03 r1 = new l03
            r1.<init>(r0, r2)
        L54:
            r0 = r1
            goto L80
        L56:
            java.lang.String[] r6 = defpackage.dk7.c
            if (r1 < r5) goto L62
            java.lang.String[] r1 = defpackage.yn1.l(r8)
            if (r1 == 0) goto L76
        L60:
            r6 = r1
            goto L76
        L62:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L67
            goto L76
        L67:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L73
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L73:
            if (r1 == 0) goto L76
            goto L60
        L76:
            int r1 = r6.length
            if (r1 != 0) goto L7a
            goto L80
        L7a:
            m03 r1 = new m03
            r1.<init>(r0, r2)
            goto L54
        L80:
            q03 r7 = r7.c0
            to1 r7 = r7.t(r0, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && aa7.h(this) != null) {
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
                z = fr.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        l01 l01Var;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 && aa7.h(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i3 >= 31) {
                    l01Var = new bq0(primaryClip, 1);
                } else {
                    m01 m01Var = new m01();
                    m01Var.B = primaryClip;
                    m01Var.L = 1;
                    l01Var = m01Var;
                }
                if (i == 16908322) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                l01Var.N(i2);
                aa7.j(this, l01Var.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mj2.d0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c0.A(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c0.m(keyListener));
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        zr zrVar = this.B;
        zrVar.k(colorStateList);
        zrVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        zr zrVar = this.B;
        zrVar.l(mode);
        zrVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        zr zrVar = this.B;
        if (zrVar != null) {
            zrVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        q03 q03Var;
        if (Build.VERSION.SDK_INT < 28 && (q03Var = this.L) != null) {
            q03Var.L = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }
}
