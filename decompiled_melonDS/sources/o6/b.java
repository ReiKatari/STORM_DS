package o6;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f10851a;

    /* renamed from: b  reason: collision with root package name */
    public final l7.a f10852b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        l7.a aVar = new l7.a(6);
        this.f10851a = textView;
        this.f10852b = aVar;
        if (m6.i.d()) {
            m6.i.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i10) {
        Editable editableText = this.f10851a.getEditableText();
        this.f10852b.getClass();
        if (!l7.a.h(this, editableText, i2, i10, false) && !super.deleteSurroundingText(i2, i10)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i10) {
        Editable editableText = this.f10851a.getEditableText();
        this.f10852b.getClass();
        if (l7.a.h(this, editableText, i2, i10, true) || super.deleteSurroundingTextInCodePoints(i2, i10)) {
            return true;
        }
        return false;
    }
}
