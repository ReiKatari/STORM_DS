package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pq  reason: default package */
/* loaded from: classes.dex */
public final class pq {
    public Object a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public pq(l55 l55Var, Object obj, boolean z, im6 im6Var, boolean z2) {
        this.f = l55Var;
        this.c = z;
        this.a = im6Var;
        this.d = z2;
        this.b = obj;
        this.e = true;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        oq oqVar = (oq) this.f;
        Drawable checkMarkDrawable = oqVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.c || this.d) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.c) {
                    mutate.setTintList((ColorStateList) this.a);
                }
                if (this.d) {
                    mutate.setTintMode((PorterDuff.Mode) this.b);
                }
                if (mutate.isStateful()) {
                    mutate.setState(oqVar.getDrawableState());
                }
                oqVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Object c() {
        if (this.c) {
            return null;
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        tx0.b("Unexpected form of a provided value");
        e41.c();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:7:0x0030, B:16:0x0056, B:18:0x005d, B:19:0x0064, B:21:0x006b, B:11:0x003f, B:13:0x0045, B:15:0x004b), top: B:29:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:7:0x0030, B:16:0x0056, B:18:0x005d, B:19:0x0064, B:21:0x006b, B:11:0x003f, B:13:0x0045, B:15:0x004b), top: B:29:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f;
        Context context = compoundButton.getContext();
        int[] iArr = m75.m;
        m44 A = m44.A(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) A.L;
        ao7.m(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) A.L, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(hf.S(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(A.g(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(bp1.c(typedArray.getInt(3, -1), null));
                }
                A.D();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(hf.S(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            A.D();
        } catch (Throwable th) {
            A.D();
            throw th;
        }
    }

    public /* synthetic */ pq(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }
}
