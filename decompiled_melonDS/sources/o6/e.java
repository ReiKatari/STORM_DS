package o6;

import a4.n;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f10855a;

    public e(KeyListener keyListener) {
        this.f10855a = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f10855a.clearMetaKeyState(view, editable, i2);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f10855a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        boolean n10;
        boolean z10;
        if (i2 != 67) {
            if (i2 != 112) {
                n10 = false;
            } else {
                n10 = n.n(editable, keyEvent, true);
            }
        } else {
            n10 = n.n(editable, keyEvent, false);
        }
        if (n10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f10855a.onKeyDown(view, editable, i2, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f10855a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f10855a.onKeyUp(view, editable, i2, keyEvent);
    }
}
