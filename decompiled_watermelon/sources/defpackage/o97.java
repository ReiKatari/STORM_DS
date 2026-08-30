package defpackage;

import android.text.TextUtils;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o97  reason: default package */
/* loaded from: classes.dex */
public final class o97 extends lt3 {
    public final /* synthetic */ int X;

    public o97(int i, Class cls, int i2, int i3, int i4) {
        this.X = i4;
        this.A = i;
        this.R = cls;
        this.L = i2;
        this.B = i3;
    }

    @Override // defpackage.lt3
    public final Object c(View view) {
        switch (this.X) {
            case 0:
                return Boolean.valueOf(v97.c(view));
            case 1:
                return v97.a(view);
            case 2:
                return x97.b(view);
            default:
                return Boolean.valueOf(v97.b(view));
        }
    }

    @Override // defpackage.lt3
    public final void d(View view, Object obj) {
        switch (this.X) {
            case 0:
                v97.f(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                v97.e(view, (CharSequence) obj);
                return;
            case 2:
                x97.c(view, (CharSequence) obj);
                return;
            default:
                v97.d(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // defpackage.lt3
    public final boolean g(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean equals;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        switch (this.X) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                if (bool != null && bool.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2) {
                    z5 = true;
                }
                return !z5;
            case 1:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                if (bool3 != null && bool3.booleanValue()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bool4 != null && bool4.booleanValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 == z4) {
                    z5 = true;
                }
                return !z5;
        }
        return !equals;
    }
}
