package n2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import android.widget.TextView;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9964a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9965b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9966c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9967d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f9968e;

    /* renamed from: f  reason: collision with root package name */
    public Object f9969f;

    /* renamed from: g  reason: collision with root package name */
    public Object f9970g;

    public o1(boolean z10, boolean z11, String str, String str2, boolean z12, od.a aVar) {
        this.f9964a = 1;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        this.f9965b = z10;
        this.f9966c = z11;
        this.f9968e = str;
        this.f9969f = str2;
        this.f9967d = z12;
        this.f9970g = aVar;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f9968e;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f9965b || this.f9966c) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f9965b) {
                    mutate.setTintList((ColorStateList) this.f9969f);
                }
                if (this.f9966c) {
                    mutate.setTintMode((PorterDuff.Mode) this.f9970g);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        q.q qVar = (q.q) this.f9968e;
        Drawable checkMarkDrawable = qVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f9965b || this.f9966c) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f9965b) {
                    mutate.setTintList((ColorStateList) this.f9969f);
                }
                if (this.f9966c) {
                    mutate.setTintMode((PorterDuff.Mode) this.f9970g);
                }
                if (mutate.isStateful()) {
                    mutate.setState(qVar.getDrawableState());
                }
                qVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Object c() {
        if (this.f9965b) {
            return null;
        }
        Object obj = this.f9970g;
        if (obj != null) {
            return obj;
        }
        t.b("Unexpected form of a provided value");
        wa.b.a();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:7:0x002f, B:16:0x0055, B:18:0x005c, B:19:0x0063, B:21:0x006a, B:11:0x003e, B:13:0x0044, B:15:0x004a), top: B:29:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:3:0x0022, B:5:0x0029, B:7:0x002f, B:16:0x0055, B:18:0x005c, B:19:0x0063, B:21:0x006a, B:11:0x003e, B:13:0x0044, B:15:0x004a), top: B:29:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f9968e
            r1 = r0
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.content.Context r0 = r1.getContext()
            int[] r3 = k.a.m
            p1.c1 r7 = p1.c1.o(r0, r9, r3, r10)
            java.lang.Object r0 = r7.B
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r1.getContext()
            java.lang.Object r4 = r7.B
            r5 = r4
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r4 = r9
            r6 = r10
            a6.x0.n(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            if (r10 == 0) goto L3e
            int r9 = r0.getResourceId(r9, r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L3e
            android.content.Context r10 = r1.getContext()     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            android.graphics.drawable.Drawable r9 = k7.w.p(r10, r9)     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            r1.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3b android.content.res.Resources.NotFoundException -> L3e
            goto L55
        L3b:
            r0 = move-exception
            r9 = r0
            goto L7b
        L3e:
            boolean r9 = r0.hasValue(r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L55
            int r9 = r0.getResourceId(r2, r2)     // Catch: java.lang.Throwable -> L3b
            if (r9 == 0) goto L55
            android.content.Context r10 = r1.getContext()     // Catch: java.lang.Throwable -> L3b
            android.graphics.drawable.Drawable r9 = k7.w.p(r10, r9)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3b
        L55:
            r9 = 2
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L63
            android.content.res.ColorStateList r9 = r7.e(r9)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonTintList(r9)     // Catch: java.lang.Throwable -> L3b
        L63:
            r9 = 3
            boolean r10 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L3b
            if (r10 == 0) goto L77
            r10 = -1
            int r9 = r0.getInt(r9, r10)     // Catch: java.lang.Throwable -> L3b
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = q.l1.c(r9, r10)     // Catch: java.lang.Throwable -> L3b
            r1.setButtonTintMode(r9)     // Catch: java.lang.Throwable -> L3b
        L77:
            r7.p()
            return
        L7b:
            r7.p()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.o1.d(android.util.AttributeSet, int):void");
    }

    public String toString() {
        switch (this.f9964a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f9965b + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f9966c + ", prettyPrintIndent='" + ((String) this.f9968e) + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + ((String) this.f9969f) + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f9967d + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + ((od.a) this.f9970g) + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ o1(TextView textView, int i2) {
        this.f9964a = i2;
        this.f9969f = null;
        this.f9970g = null;
        this.f9965b = false;
        this.f9966c = false;
        this.f9968e = textView;
    }

    public o1(n1 n1Var, Object obj, boolean z10, e eVar, boolean z11) {
        this.f9964a = 0;
        this.f9968e = n1Var;
        this.f9965b = z10;
        this.f9969f = eVar;
        this.f9966c = z11;
        this.f9970g = obj;
        this.f9967d = true;
    }
}
