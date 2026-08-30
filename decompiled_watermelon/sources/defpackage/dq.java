package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import android.widget.TextView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dq  reason: default package */
/* loaded from: classes.dex */
public final class dq {
    public Object a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public dq(ew4 ew4Var, Object obj, boolean z, ta6 ta6Var, boolean z2) {
        this.f = ew4Var;
        this.c = z;
        this.a = ta6Var;
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
        cq cqVar = (cq) this.f;
        Drawable checkMarkDrawable = cqVar.getCheckMarkDrawable();
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
                    mutate.setState(cqVar.getDrawableState());
                }
                cqVar.setCheckMarkDrawable(mutate);
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
        xu0.b("Unexpected form of a provided value");
        f81.c();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:7:0x0030, B:16:0x0056, B:18:0x005d, B:19:0x0064, B:21:0x006b, B:11:0x003f, B:13:0x0045, B:15:0x004b), top: B:29:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:7:0x0030, B:16:0x0056, B:18:0x005d, B:19:0x0064, B:21:0x006b, B:11:0x003f, B:13:0x0045, B:15:0x004b), top: B:29:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            java.lang.Object r7 = r7.f
            r0 = r7
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r7 = r0.getContext()
            int[] r2 = defpackage.by4.m
            n85 r7 = defpackage.n85.q(r7, r8, r2, r9)
            java.lang.Object r1 = r7.L
            r6 = r1
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            android.content.Context r1 = r0.getContext()
            java.lang.Object r3 = r7.L
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r3 = r8
            r5 = r9
            defpackage.aa7.m(r0, r1, r2, r3, r4, r5)
            r8 = 1
            boolean r9 = r6.hasValue(r8)     // Catch: java.lang.Throwable -> L3c
            r1 = 0
            if (r9 == 0) goto L3f
            int r8 = r6.getResourceId(r8, r1)     // Catch: java.lang.Throwable -> L3c
            if (r8 == 0) goto L3f
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3f
            android.graphics.drawable.Drawable r8 = defpackage.l07.M(r9, r8)     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3f
            r0.setButtonDrawable(r8)     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3f
            goto L56
        L3c:
            r0 = move-exception
            r8 = r0
            goto L7c
        L3f:
            boolean r8 = r6.hasValue(r1)     // Catch: java.lang.Throwable -> L3c
            if (r8 == 0) goto L56
            int r8 = r6.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L3c
            if (r8 == 0) goto L56
            android.content.Context r9 = r0.getContext()     // Catch: java.lang.Throwable -> L3c
            android.graphics.drawable.Drawable r8 = defpackage.l07.M(r9, r8)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonDrawable(r8)     // Catch: java.lang.Throwable -> L3c
        L56:
            r8 = 2
            boolean r9 = r6.hasValue(r8)     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L64
            android.content.res.ColorStateList r8 = r7.e(r8)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonTintList(r8)     // Catch: java.lang.Throwable -> L3c
        L64:
            r8 = 3
            boolean r9 = r6.hasValue(r8)     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L78
            r9 = -1
            int r8 = r6.getInt(r8, r9)     // Catch: java.lang.Throwable -> L3c
            r9 = 0
            android.graphics.PorterDuff$Mode r8 = defpackage.vk1.c(r8, r9)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonTintMode(r8)     // Catch: java.lang.Throwable -> L3c
        L78:
            r7.t()
            return
        L7c:
            r7.t()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq.d(android.util.AttributeSet, int):void");
    }

    public /* synthetic */ dq(TextView textView) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = textView;
    }
}
