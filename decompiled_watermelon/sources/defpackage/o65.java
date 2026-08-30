package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o65  reason: default package */
/* loaded from: classes.dex */
public final class o65 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q65 b;

    public /* synthetic */ o65(q65 q65Var, int i) {
        this.a = i;
        this.b = q65Var;
    }

    public final int a(View view) {
        int right;
        int i;
        switch (this.a) {
            case 0:
                right = view.getRight() + ((r65) view.getLayoutParams()).b.right;
                i = ((ViewGroup.MarginLayoutParams) ((r65) view.getLayoutParams())).rightMargin;
                break;
            default:
                right = view.getBottom() + ((r65) view.getLayoutParams()).b.bottom;
                i = ((ViewGroup.MarginLayoutParams) ((r65) view.getLayoutParams())).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int b(View view) {
        int left;
        int i;
        switch (this.a) {
            case 0:
                left = view.getLeft() - ((r65) view.getLayoutParams()).b.left;
                i = ((ViewGroup.MarginLayoutParams) ((r65) view.getLayoutParams())).leftMargin;
                break;
            default:
                left = view.getTop() - ((r65) view.getLayoutParams()).b.top;
                i = ((ViewGroup.MarginLayoutParams) ((r65) view.getLayoutParams())).topMargin;
                break;
        }
        return left - i;
    }

    public final int c() {
        int i;
        int E;
        int i2 = this.a;
        q65 q65Var = this.b;
        switch (i2) {
            case 0:
                i = q65Var.n;
                E = q65Var.E();
                break;
            default:
                i = q65Var.o;
                E = q65Var.C();
                break;
        }
        return i - E;
    }

    public final int d() {
        int i = this.a;
        q65 q65Var = this.b;
        switch (i) {
            case 0:
                return q65Var.D();
            default:
                return q65Var.F();
        }
    }
}
