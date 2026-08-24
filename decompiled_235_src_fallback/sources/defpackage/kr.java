package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kr  reason: default package */
/* loaded from: classes.dex */
public class kr extends android.widget.EditText implements defpackage.tl4 {
    public final defpackage.z9 A;
    public final defpackage.ms B;
    public final defpackage.u63 L;
    public final defpackage.a57 R;
    public final defpackage.u63 d0;
    public defpackage.jr e0;

    public kr(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            defpackage.h67.a(r5)
            r0 = 2130969050(0x7f0401da, float:1.754677E38)
            r4.<init>(r5, r6, r0)
            android.content.Context r5 = r4.getContext()
            defpackage.h57.a(r4, r5)
            z9 r5 = new z9
            r5.<init>(r4)
            r4.A = r5
            r5.k(r6, r0)
            ms r5 = new ms
            r5.<init>(r4)
            r4.B = r5
            r5.f(r6, r0)
            r5.b()
            u63 r5 = new u63
            r1 = 10
            r5.<init>(r1)
            r5.B = r4
            r4.L = r5
            a57 r5 = new a57
            r5.<init>()
            r4.R = r5
            u63 r5 = new u63
            r5.<init>(r4)
            r4.d0 = r5
            r5.r(r6, r0)
            android.text.method.KeyListener r6 = r4.getKeyListener()
            boolean r0 = r6 instanceof android.text.method.NumberKeyListener
            if (r0 != 0) goto L71
            boolean r0 = super.isFocusable()
            boolean r1 = super.isClickable()
            boolean r2 = super.isLongClickable()
            int r3 = super.getInputType()
            android.text.method.KeyListener r5 = r5.o(r6)
            if (r5 != r6) goto L62
            goto L71
        L62:
            super.setKeyListener(r5)
            super.setRawInputType(r3)
            super.setFocusable(r0)
            super.setClickable(r1)
            super.setLongClickable(r2)
        L71:
            return
    }

    private defpackage.jr getSuperCaller() {
            r1 = this;
            jr r0 = r1.e0
            if (r0 != 0) goto Lb
            jr r0 = new jr
            r0.<init>(r1)
            r1.e0 = r0
        Lb:
            jr r1 = r1.e0
            return r1
    }

    @Override // defpackage.tl4
    public final defpackage.t31 a(defpackage.t31 r2) {
            r1 = this;
            a57 r0 = r1.R
            r0.getClass()
            t31 r1 = defpackage.a57.a(r1, r2)
            return r1
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            z9 r0 = r1.A
            if (r0 == 0) goto La
            r0.a()
        La:
            ms r1 = r1.B
            if (r1 == 0) goto L11
            r1.b()
        L11:
            return
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r0 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = defpackage.ii2.Z(r0)
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r0 = this;
            z9 r0 = r0.A
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.h()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r0 = this;
            z9 r0 = r0.A
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.i()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r0 = this;
            ms r0 = r0.B
            android.content.res.ColorStateList r0 = r0.d()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r0 = this;
            ms r0 = r0.B
            android.graphics.PorterDuff$Mode r0 = r0.e()
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.text.Editable r2 = super.getText()
            return r2
        Lb:
            android.text.Editable r2 = super.getEditableText()
            return r2
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText() {
            r0 = this;
            android.text.Editable r0 = r0.getText()
            return r0
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L1a
            u63 r0 = r2.L
            if (r0 != 0) goto Lb
            goto L1a
        Lb:
            java.lang.Object r2 = r0.L
            android.view.textclassifier.TextClassifier r2 = (android.view.textclassifier.TextClassifier) r2
            if (r2 != 0) goto L19
            java.lang.Object r2 = r0.B
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.view.textclassifier.TextClassifier r2 = defpackage.gs.a(r2)
        L19:
            return r2
        L1a:
            jr r2 = r2.getSuperCaller()
            kr r2 = r2.a
            android.view.textclassifier.TextClassifier r2 = super.getTextClassifier()
            return r2
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            ms r1 = r7.B
            r1.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L18
            if (r0 == 0) goto L18
            java.lang.CharSequence r3 = r7.getText()
            defpackage.jw2.C(r8, r3)
        L18:
            defpackage.l.G(r8, r0, r7)
            if (r0 == 0) goto L80
            if (r1 > r2) goto L80
            java.lang.String[] r2 = defpackage.ao7.h(r7)
            if (r2 == 0) goto L80
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L31
            defpackage.is1.k(r8, r2)
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
            h61 r2 = new h61
            r6 = 9
            r2.<init>(r7, r6)
            if (r1 < r5) goto L56
            o63 r1 = new o63
            r1.<init>(r0, r2)
        L54:
            r0 = r1
            goto L80
        L56:
            java.lang.String[] r6 = defpackage.jw2.p
            if (r1 < r5) goto L62
            java.lang.String[] r1 = defpackage.is1.l(r8)
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
            p63 r1 = new p63
            r1.<init>(r0, r2)
            goto L54
        L80:
            u63 r7 = r7.d0
            ct1 r7 = r7.w(r0, r8)
            return r7
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            r1 = 33
            if (r0 >= r1) goto L1c
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.isActive(r2)
        L1c:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(android.view.DragEvent r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 1
            r3 = 0
            if (r0 >= r1) goto L54
            java.lang.Object r0 = r6.getLocalState()
            if (r0 != 0) goto L54
            java.lang.String[] r0 = defpackage.ao7.h(r5)
            if (r0 != 0) goto L15
            goto L54
        L15:
            android.content.Context r0 = r5.getContext()
        L19:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L2b
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L24
            android.app.Activity r0 = (android.app.Activity) r0
            goto L2c
        L24:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L19
        L2b:
            r0 = 0
        L2c:
            if (r0 != 0) goto L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't handle drop: no activity: view="
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ReceiveContent"
            android.util.Log.i(r1, r0)
            goto L54
        L42:
            int r1 = r6.getAction()
            if (r1 != r2) goto L49
            goto L54
        L49:
            int r1 = r6.getAction()
            r4 = 3
            if (r1 != r4) goto L54
            boolean r3 = defpackage.sr.a(r6, r5, r0)
        L54:
            if (r3 == 0) goto L57
            return r2
        L57:
            boolean r5 = super.onDragEvent(r6)
            return r5
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int r7) {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L55
            java.lang.String[] r2 = defpackage.ao7.h(r6)
            if (r2 == 0) goto L55
            r2 = 16908322(0x1020022, float:2.3877324E-38)
            if (r7 == r2) goto L17
            r3 = 16908337(0x1020031, float:2.3877366E-38)
            if (r7 == r3) goto L17
            goto L55
        L17:
            android.content.Context r3 = r6.getContext()
            java.lang.String r4 = "clipboard"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.content.ClipboardManager r3 = (android.content.ClipboardManager) r3
            if (r3 != 0) goto L27
            r3 = 0
            goto L2b
        L27:
            android.content.ClipData r3 = r3.getPrimaryClip()
        L2b:
            r4 = 1
            if (r3 == 0) goto L54
            int r5 = r3.getItemCount()
            if (r5 <= 0) goto L54
            if (r0 < r1) goto L3c
            os0 r0 = new os0
            r0.<init>(r3, r4)
            goto L45
        L3c:
            r31 r0 = new r31
            r0.<init>()
            r0.B = r3
            r0.L = r4
        L45:
            if (r7 != r2) goto L49
            r7 = 0
            goto L4a
        L49:
            r7 = r4
        L4a:
            r0.v(r7)
            t31 r7 = r0.build()
            defpackage.ao7.j(r6, r7)
        L54:
            return r4
        L55:
            boolean r6 = super.onTextContextMenuItem(r7)
            return r6
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            z9 r0 = r0.A
            if (r0 == 0) goto La
            r0.n()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r1) {
            r0 = this;
            super.setBackgroundResource(r1)
            z9 r0 = r0.A
            if (r0 == 0) goto La
            r0.o(r1)
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawables(r1, r2, r3, r4)
            ms r0 = r0.B
            if (r0 == 0) goto La
            r0.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r1, android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4) {
            r0 = this;
            super.setCompoundDrawablesRelative(r1, r2, r3, r4)
            ms r0 = r0.B
            if (r0 == 0) goto La
            r0.b()
        La:
            return
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r1) {
            r0 = this;
            android.view.ActionMode$Callback r1 = defpackage.ii2.c0(r1, r0)
            super.setCustomSelectionActionModeCallback(r1)
            return
    }

    public void setEmojiCompatEnabled(boolean r1) {
            r0 = this;
            u63 r0 = r0.d0
            r0.F(r1)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            u63 r0 = r1.d0
            android.text.method.KeyListener r2 = r0.o(r2)
            super.setKeyListener(r2)
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            z9 r0 = r0.A
            if (r0 == 0) goto L7
            r0.t(r1)
        L7:
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            z9 r0 = r0.A
            if (r0 == 0) goto L7
            r0.u(r1)
        L7:
            return
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            ms r0 = r0.B
            r0.k(r1)
            r0.b()
            return
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            ms r0 = r0.B
            r0.l(r1)
            r0.b()
            return
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context r1, int r2) {
            r0 = this;
            super.setTextAppearance(r1, r2)
            ms r0 = r0.B
            if (r0 == 0) goto La
            r0.g(r1, r2)
        La:
            return
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Le
            u63 r0 = r2.L
            if (r0 != 0) goto Lb
            goto Le
        Lb:
            r0.L = r3
            return
        Le:
            jr r2 = r2.getSuperCaller()
            kr r2 = r2.a
            super.setTextClassifier(r3)
            return
    }
}
