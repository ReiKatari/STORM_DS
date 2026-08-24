package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hr  reason: default package */
/* loaded from: classes.dex */
public abstract class hr extends qv0 implements mq {
    public fr X;
    public final gr Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [gr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hr(Context context, int i) {
        super(context, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.Y = new xg3() { // from class: gr
            @Override // defpackage.xg3
            public final boolean j(KeyEvent keyEvent) {
                return hr.this.g(keyEvent);
            }
        };
        tq f = f();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((fr) f).O0 = i;
        f.f();
    }

    @Override // defpackage.qv0, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        fr frVar = (fr) f();
        frVar.z();
        ((ViewGroup) frVar.v0.findViewById(16908290)).addView(view, layoutParams);
        frVar.i0.a(frVar.h0.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return uj2.w(this.Y, getWindow().getDecorView(), this, keyEvent);
    }

    public final tq f() {
        if (this.X == null) {
            zb6 zb6Var = tq.A;
            this.X = new fr(getContext(), getWindow(), this, this);
        }
        return this.X;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        fr frVar = (fr) f();
        frVar.z();
        return frVar.h0.findViewById(i);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        f().d();
    }

    @Override // defpackage.qv0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        f().c();
        super.onCreate(bundle);
        f().f();
    }

    @Override // defpackage.qv0, android.app.Dialog
    public final void onStop() {
        super.onStop();
        fr frVar = (fr) f();
        frVar.D();
        ak7 ak7Var = frVar.j0;
        if (ak7Var != null) {
            ak7Var.C0(false);
        }
    }

    @Override // defpackage.qv0, android.app.Dialog
    public void setContentView(int i) {
        e();
        f().k(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        f().o(getContext().getString(i));
    }

    @Override // defpackage.qv0, android.app.Dialog
    public void setContentView(View view) {
        e();
        f().l(view);
    }

    @Override // defpackage.qv0, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        e();
        f().m(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().o(charSequence);
    }
}
